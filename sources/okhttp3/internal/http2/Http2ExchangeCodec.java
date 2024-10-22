package okhttp3.internal.http2;

import defpackage.d93;
import defpackage.dw2;
import defpackage.m20;
import defpackage.mx2;
import defpackage.ng0;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

/* loaded from: classes2.dex */
public final class Http2ExchangeCodec implements ExchangeCodec {
    private volatile boolean canceled;
    private final RealInterceptorChain chain;
    private final RealConnection connection;
    private final Http2Connection http2Connection;
    private final Protocol protocol;
    private volatile Http2Stream stream;
    public static final Companion Companion = new Companion(null);
    private static final String CONNECTION = "connection";
    private static final String HOST = "host";
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";
    private static final String TE = "te";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private static final String ENCODING = "encoding";
    private static final String UPGRADE = "upgrade";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf(CONNECTION, HOST, KEEP_ALIVE, PROXY_CONNECTION, TE, TRANSFER_ENCODING, ENCODING, UPGRADE);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final List<Header> http2HeadersList(Request request) {
            Headers headers = request.headers();
            ArrayList arrayList = new ArrayList(headers.size() + 4);
            arrayList.add(new Header(Header.TARGET_METHOD, request.method()));
            arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.url())));
            String header = request.header("Host");
            if (header != null) {
                arrayList.add(new Header(Header.TARGET_AUTHORITY, header));
            }
            arrayList.add(new Header(Header.TARGET_SCHEME, request.url().scheme()));
            int size = headers.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String lowerCase = headers.name(i).toLowerCase(Locale.US);
                if (!Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(lowerCase) || (m20.L(lowerCase, Http2ExchangeCodec.TE) && m20.L(headers.value(i), "trailers"))) {
                    arrayList.add(new Header(lowerCase, headers.value(i)));
                }
                i = i2;
            }
            return arrayList;
        }

        public final Response.Builder readHttp2HeadersList(Headers headers, Protocol protocol) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            StatusLine statusLine = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String name = headers.name(i);
                String value = headers.value(i);
                if (m20.L(name, Header.RESPONSE_STATUS_UTF8)) {
                    statusLine = StatusLine.Companion.parse(m20.d1(value, "HTTP/1.1 "));
                } else if (!Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(name)) {
                    builder.addLenient$okhttp(name, value);
                }
                i = i2;
            }
            if (statusLine != null) {
                return new Response.Builder().protocol(protocol).code(statusLine.code).message(statusLine.message).headers(builder.build());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public Http2ExchangeCodec(OkHttpClient okHttpClient, RealConnection realConnection, RealInterceptorChain realInterceptorChain, Http2Connection http2Connection) {
        this.connection = realConnection;
        this.chain = realInterceptorChain;
        this.http2Connection = http2Connection;
        List<Protocol> protocols = okHttpClient.protocols();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.protocol = protocols.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public dw2 createRequestBody(Request request, long j) {
        return this.stream.getSink();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() {
        this.stream.getSink().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() {
        this.http2Connection.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public mx2 openResponseBodySource(Response response) {
        return this.stream.getSource$okhttp();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Response.Builder readResponseHeaders(boolean z) {
        Response.Builder readHttp2HeadersList = Companion.readHttp2HeadersList(this.stream.takeHeaders(), this.protocol);
        if (z && readHttp2HeadersList.getCode$okhttp() == 100) {
            return null;
        }
        return readHttp2HeadersList;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(Response response) {
        if (!HttpHeaders.promisesBody(response)) {
            return 0L;
        }
        return Util.headersContentLength(response);
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public Headers trailers() {
        return this.stream.trailers();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(Request request) {
        boolean z;
        if (this.stream != null) {
            return;
        }
        if (request.body() != null) {
            z = true;
        } else {
            z = false;
        }
        this.stream = this.http2Connection.newStream(Companion.http2HeadersList(request), z);
        if (!this.canceled) {
            d93 readTimeout = this.stream.readTimeout();
            long readTimeoutMillis$okhttp = this.chain.getReadTimeoutMillis$okhttp();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            readTimeout.timeout(readTimeoutMillis$okhttp, timeUnit);
            this.stream.writeTimeout().timeout(this.chain.getWriteTimeoutMillis$okhttp(), timeUnit);
            return;
        }
        this.stream.closeLater(ErrorCode.CANCEL);
        throw new IOException("Canceled");
    }
}
