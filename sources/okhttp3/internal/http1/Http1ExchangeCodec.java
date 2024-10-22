package okhttp3.internal.http1;

import defpackage.d93;
import defpackage.dw2;
import defpackage.f11;
import defpackage.i23;
import defpackage.lr;
import defpackage.m20;
import defpackage.mx2;
import defpackage.ng0;
import defpackage.rr;
import defpackage.sr;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes2.dex */
public final class Http1ExchangeCodec implements ExchangeCodec {
    public static final Companion Companion = new Companion(null);
    private static final long NO_CHUNK_YET = -1;
    private static final int STATE_CLOSED = 6;
    private static final int STATE_IDLE = 0;
    private static final int STATE_OPEN_REQUEST_BODY = 1;
    private static final int STATE_OPEN_RESPONSE_BODY = 4;
    private static final int STATE_READING_RESPONSE_BODY = 5;
    private static final int STATE_READ_RESPONSE_HEADERS = 3;
    private static final int STATE_WRITING_REQUEST_BODY = 2;
    private final OkHttpClient client;
    private final RealConnection connection;
    private final HeadersReader headersReader;
    private final rr sink;
    private final sr source;
    private int state;
    private Headers trailers;

    /* loaded from: classes2.dex */
    public abstract class AbstractSource implements mx2 {
        private boolean closed;
        private final f11 timeout;

        public AbstractSource() {
            this.timeout = new f11(Http1ExchangeCodec.this.source.timeout());
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public abstract /* synthetic */ void close() throws IOException;

        public final boolean getClosed() {
            return this.closed;
        }

        public final f11 getTimeout() {
            return this.timeout;
        }

        @Override // defpackage.mx2
        public long read(lr lrVar, long j) {
            try {
                return Http1ExchangeCodec.this.source.read(lrVar, j);
            } catch (IOException e) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
                throw e;
            }
        }

        public final void responseBodyComplete() {
            if (Http1ExchangeCodec.this.state == 6) {
                return;
            }
            if (Http1ExchangeCodec.this.state == 5) {
                Http1ExchangeCodec.this.detachTimeout(this.timeout);
                Http1ExchangeCodec.this.state = 6;
                return;
            }
            throw new IllegalStateException(m20.d1(Integer.valueOf(Http1ExchangeCodec.this.state), "state: "));
        }

        public final void setClosed(boolean z) {
            this.closed = z;
        }

        @Override // defpackage.mx2
        public d93 timeout() {
            return this.timeout;
        }
    }

    /* loaded from: classes2.dex */
    public final class ChunkedSink implements dw2 {
        private boolean closed;
        private final f11 timeout;

        public ChunkedSink() {
            this.timeout = new f11(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // defpackage.dw2, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.sink.p("0\r\n\r\n");
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // defpackage.dw2, java.io.Flushable
        public synchronized void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // defpackage.dw2
        public d93 timeout() {
            return this.timeout;
        }

        @Override // defpackage.dw2
        public void write(lr lrVar, long j) {
            if (!this.closed) {
                if (j == 0) {
                    return;
                }
                Http1ExchangeCodec.this.sink.t(j);
                Http1ExchangeCodec.this.sink.p("\r\n");
                Http1ExchangeCodec.this.sink.write(lrVar, j);
                Http1ExchangeCodec.this.sink.p("\r\n");
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* loaded from: classes2.dex */
    public final class ChunkedSource extends AbstractSource {
        private long bytesRemainingInChunk;
        private boolean hasMoreChunks;
        private final HttpUrl url;

        public ChunkedSource(HttpUrl httpUrl) {
            super();
            this.url = httpUrl;
            this.bytesRemainingInChunk = Http1ExchangeCodec.NO_CHUNK_YET;
            this.hasMoreChunks = true;
        }

        private final void readChunkSize() {
            boolean z;
            if (this.bytesRemainingInChunk != Http1ExchangeCodec.NO_CHUNK_YET) {
                Http1ExchangeCodec.this.source.y();
            }
            try {
                this.bytesRemainingInChunk = Http1ExchangeCodec.this.source.H();
                String obj = i23.u1(Http1ExchangeCodec.this.source.y()).toString();
                if (this.bytesRemainingInChunk >= 0) {
                    if (obj.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z || i23.q1(obj, ";", false)) {
                        if (this.bytesRemainingInChunk == 0) {
                            this.hasMoreChunks = false;
                            Http1ExchangeCodec http1ExchangeCodec = Http1ExchangeCodec.this;
                            http1ExchangeCodec.trailers = http1ExchangeCodec.headersReader.readHeaders();
                            HttpHeaders.receiveHeaders(Http1ExchangeCodec.this.client.cookieJar(), this.url, Http1ExchangeCodec.this.trailers);
                            responseBodyComplete();
                            return;
                        }
                        return;
                    }
                }
                throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.bytesRemainingInChunk + obj + '\"');
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.hasMoreChunks && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.mx2
        public long read(lr lrVar, long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (true ^ getClosed()) {
                    if (!this.hasMoreChunks) {
                        return Http1ExchangeCodec.NO_CHUNK_YET;
                    }
                    long j2 = this.bytesRemainingInChunk;
                    if (j2 == 0 || j2 == Http1ExchangeCodec.NO_CHUNK_YET) {
                        readChunkSize();
                        if (!this.hasMoreChunks) {
                            return Http1ExchangeCodec.NO_CHUNK_YET;
                        }
                    }
                    long read = super.read(lrVar, Math.min(j, this.bytesRemainingInChunk));
                    if (read != Http1ExchangeCodec.NO_CHUNK_YET) {
                        this.bytesRemainingInChunk -= read;
                        return read;
                    }
                    Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount < 0: ").toString());
        }
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public final class FixedLengthSource extends AbstractSource {
        private long bytesRemaining;

        public FixedLengthSource(long j) {
            super();
            this.bytesRemaining = j;
            if (j == 0) {
                responseBodyComplete();
            }
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (this.bytesRemaining != 0 && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.mx2
        public long read(lr lrVar, long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (true ^ getClosed()) {
                    long j2 = this.bytesRemaining;
                    if (j2 == 0) {
                        return Http1ExchangeCodec.NO_CHUNK_YET;
                    }
                    long read = super.read(lrVar, Math.min(j2, j));
                    if (read != Http1ExchangeCodec.NO_CHUNK_YET) {
                        long j3 = this.bytesRemaining - read;
                        this.bytesRemaining = j3;
                        if (j3 == 0) {
                            responseBodyComplete();
                        }
                        return read;
                    }
                    Http1ExchangeCodec.this.getConnection().noNewExchanges$okhttp();
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    responseBodyComplete();
                    throw protocolException;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount < 0: ").toString());
        }
    }

    /* loaded from: classes2.dex */
    public final class KnownLengthSink implements dw2 {
        private boolean closed;
        private final f11 timeout;

        public KnownLengthSink() {
            this.timeout = new f11(Http1ExchangeCodec.this.sink.timeout());
        }

        @Override // defpackage.dw2, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.closed) {
                return;
            }
            this.closed = true;
            Http1ExchangeCodec.this.detachTimeout(this.timeout);
            Http1ExchangeCodec.this.state = 3;
        }

        @Override // defpackage.dw2, java.io.Flushable
        public void flush() {
            if (this.closed) {
                return;
            }
            Http1ExchangeCodec.this.sink.flush();
        }

        @Override // defpackage.dw2
        public d93 timeout() {
            return this.timeout;
        }

        @Override // defpackage.dw2
        public void write(lr lrVar, long j) {
            if (!this.closed) {
                Util.checkOffsetAndCount(lrVar.f3176b, 0L, j);
                Http1ExchangeCodec.this.sink.write(lrVar, j);
                return;
            }
            throw new IllegalStateException("closed".toString());
        }
    }

    /* loaded from: classes2.dex */
    public final class UnknownLengthSource extends AbstractSource {
        private boolean inputExhausted;

        public UnknownLengthSource() {
            super();
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (getClosed()) {
                return;
            }
            if (!this.inputExhausted) {
                responseBodyComplete();
            }
            setClosed(true);
        }

        @Override // okhttp3.internal.http1.Http1ExchangeCodec.AbstractSource, defpackage.mx2
        public long read(lr lrVar, long j) {
            boolean z;
            if (j >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (!getClosed()) {
                    if (this.inputExhausted) {
                        return Http1ExchangeCodec.NO_CHUNK_YET;
                    }
                    long read = super.read(lrVar, j);
                    if (read == Http1ExchangeCodec.NO_CHUNK_YET) {
                        this.inputExhausted = true;
                        responseBodyComplete();
                        return Http1ExchangeCodec.NO_CHUNK_YET;
                    }
                    return read;
                }
                throw new IllegalStateException("closed".toString());
            }
            throw new IllegalArgumentException(m20.d1(Long.valueOf(j), "byteCount < 0: ").toString());
        }
    }

    public Http1ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, sr srVar, rr rrVar) {
        this.client = okHttpClient;
        this.connection = realConnection;
        this.source = srVar;
        this.sink = rrVar;
        this.headersReader = new HeadersReader(srVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void detachTimeout(f11 f11Var) {
        d93 d93Var = f11Var.f2030a;
        f11Var.f2030a = d93.NONE;
        d93Var.clearDeadline();
        d93Var.clearTimeout();
    }

    private final boolean isChunked(Response response) {
        return i23.U0("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null));
    }

    private final dw2 newChunkedSink() {
        int i = this.state;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            this.state = 2;
            return new ChunkedSink();
        }
        throw new IllegalStateException(m20.d1(Integer.valueOf(i), "state: ").toString());
    }

    private final mx2 newChunkedSource(HttpUrl httpUrl) {
        boolean z;
        int i = this.state;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.state = 5;
            return new ChunkedSource(httpUrl);
        }
        throw new IllegalStateException(m20.d1(Integer.valueOf(i), "state: ").toString());
    }

    private final mx2 newFixedLengthSource(long j) {
        boolean z;
        int i = this.state;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.state = 5;
            return new FixedLengthSource(j);
        }
        throw new IllegalStateException(m20.d1(Integer.valueOf(i), "state: ").toString());
    }

    private final dw2 newKnownLengthSink() {
        int i = this.state;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        if (z) {
            this.state = 2;
            return new KnownLengthSink();
        }
        throw new IllegalStateException(m20.d1(Integer.valueOf(i), "state: ").toString());
    }

    private final mx2 newUnknownLengthSource() {
        boolean z;
        int i = this.state;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.state = 5;
            getConnection().noNewExchanges$okhttp();
            return new UnknownLengthSource();
        }
        throw new IllegalStateException(m20.d1(Integer.valueOf(i), "state: ").toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        getConnection().cancel();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public dw2 createRequestBody(Request request, long j) {
        if (request.body() != null && request.body().isDuplex()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (isChunked(request)) {
            return newChunkedSink();
        }
        if (j != NO_CHUNK_YET) {
            return newKnownLengthSink();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.sink.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    public final boolean isClosed() {
        if (this.state == 6) {
            return true;
        }
        return false;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public mx2 openResponseBodySource(Response response) {
        if (!HttpHeaders.promisesBody(response)) {
            return newFixedLengthSource(0L);
        }
        if (isChunked(response)) {
            return newChunkedSource(response.request().url());
        }
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength != NO_CHUNK_YET) {
            return newFixedLengthSource(headersContentLength);
        }
        return newUnknownLengthSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z) {
        int i = this.state;
        boolean z2 = true;
        if (i != 1 && i != 3) {
            z2 = false;
        }
        if (z2) {
            try {
                StatusLine parse = StatusLine.Companion.parse(this.headersReader.readLine());
                Response.Builder headers = new Response.Builder().protocol(parse.protocol).code(parse.code).message(parse.message).headers(this.headersReader.readHeaders());
                if (z && parse.code == 100) {
                    return null;
                }
                if (parse.code == 100) {
                    this.state = 3;
                    return headers;
                }
                this.state = 4;
                return headers;
            } catch (EOFException e) {
                throw new IOException(m20.d1(getConnection().route().address().url().redact(), "unexpected end of stream on "), e);
            }
        }
        throw new IllegalStateException(m20.d1(Integer.valueOf(i), "state: ").toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        if (isChunked(response)) {
            return NO_CHUNK_YET;
        }
        return Util.headersContentLength(response);
    }

    public final void skipConnectBody(Response response) {
        long headersContentLength = Util.headersContentLength(response);
        if (headersContentLength == NO_CHUNK_YET) {
            return;
        }
        mx2 newFixedLengthSource = newFixedLengthSource(headersContentLength);
        Util.skipAll(newFixedLengthSource, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        newFixedLengthSource.close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        boolean z;
        if (this.state == 6) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Headers headers = this.trailers;
            if (headers == null) {
                return Util.EMPTY_HEADERS;
            }
            return headers;
        }
        throw new IllegalStateException("too early; can't read the trailers yet".toString());
    }

    public final void writeRequest(Headers headers, String str) {
        boolean z;
        int i = this.state;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.sink.p(str).p("\r\n");
            int size = headers.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.sink.p(headers.name(i2)).p(": ").p(headers.value(i2)).p("\r\n");
            }
            this.sink.p("\r\n");
            this.state = 1;
            return;
        }
        throw new IllegalStateException(m20.d1(Integer.valueOf(i), "state: ").toString());
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        writeRequest(request.headers(), RequestLine.INSTANCE.get(request, getConnection().route().proxy().type()));
    }

    private final boolean isChunked(Request request) {
        return i23.U0("chunked", request.header("Transfer-Encoding"));
    }
}
