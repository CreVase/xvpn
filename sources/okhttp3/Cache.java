package okhttp3;

import defpackage.at;
import defpackage.c11;
import defpackage.cr0;
import defpackage.d11;
import defpackage.dw2;
import defpackage.fr0;
import defpackage.i23;
import defpackage.lr;
import defpackage.m20;
import defpackage.mx2;
import defpackage.ng0;
import defpackage.rr;
import defpackage.sr;
import defpackage.t9;
import defpackage.tf3;
import defpackage.v73;
import defpackage.wg2;
import defpackage.xg2;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public final class Cache implements Closeable, Flushable {
    public static final Companion Companion = new Companion(null);
    private static final int ENTRY_BODY = 1;
    private static final int ENTRY_COUNT = 2;
    private static final int ENTRY_METADATA = 0;
    private static final int VERSION = 201105;
    private final DiskLruCache cache;
    private int hitCount;
    private int networkCount;
    private int requestCount;
    private int writeAbortCount;
    private int writeSuccessCount;

    /* loaded from: classes2.dex */
    public static final class CacheResponseBody extends ResponseBody {
        private final sr bodySource;
        private final String contentLength;
        private final String contentType;
        private final DiskLruCache.Snapshot snapshot;

        public CacheResponseBody(DiskLruCache.Snapshot snapshot, String str, String str2) {
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            this.bodySource = new xg2(new d11(this) { // from class: okhttp3.Cache.CacheResponseBody.1
                final /* synthetic */ CacheResponseBody this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(mx2.this);
                    this.this$0 = this;
                }

                @Override // defpackage.d11, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    this.this$0.getSnapshot().close();
                    super.close();
                }
            });
        }

        @Override // okhttp3.ResponseBody
        public long contentLength() {
            String str = this.contentLength;
            if (str == null) {
                return -1L;
            }
            return Util.toLongOrDefault(str, -1L);
        }

        @Override // okhttp3.ResponseBody
        public MediaType contentType() {
            String str = this.contentType;
            if (str == null) {
                return null;
            }
            return MediaType.Companion.parse(str);
        }

        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.ResponseBody
        public sr source() {
            return this.bodySource;
        }
    }

    /* loaded from: classes2.dex */
    public final class RealCacheRequest implements CacheRequest {
        private final dw2 body;
        private final dw2 cacheOut;
        private boolean done;
        private final DiskLruCache.Editor editor;

        public RealCacheRequest(DiskLruCache.Editor editor) {
            this.editor = editor;
            dw2 newSink = editor.newSink(1);
            this.cacheOut = newSink;
            this.body = new c11(newSink) { // from class: okhttp3.Cache.RealCacheRequest.1
                @Override // defpackage.c11, defpackage.dw2, java.io.Closeable, java.lang.AutoCloseable
                public void close() throws IOException {
                    Cache cache = Cache.this;
                    RealCacheRequest realCacheRequest = this;
                    synchronized (cache) {
                        if (realCacheRequest.getDone()) {
                            return;
                        }
                        realCacheRequest.setDone(true);
                        cache.setWriteSuccessCount$okhttp(cache.getWriteSuccessCount$okhttp() + 1);
                        super.close();
                        this.editor.commit();
                    }
                }
            };
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            Cache cache = Cache.this;
            synchronized (cache) {
                if (getDone()) {
                    return;
                }
                setDone(true);
                cache.setWriteAbortCount$okhttp(cache.getWriteAbortCount$okhttp() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public dw2 body() {
            return this.body;
        }

        public final boolean getDone() {
            return this.done;
        }

        public final void setDone(boolean z) {
            this.done = z;
        }
    }

    public Cache(File file, long j, FileSystem fileSystem) {
        this.cache = new DiskLruCache(fileSystem, file, VERSION, 2, j, TaskRunner.INSTANCE);
    }

    private final void abortQuietly(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    public static final String key(HttpUrl httpUrl) {
        return Companion.key(httpUrl);
    }

    /* renamed from: -deprecated_directory, reason: not valid java name */
    public final File m123deprecated_directory() {
        return this.cache.getDirectory();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    public final void delete() throws IOException {
        this.cache.delete();
    }

    public final File directory() {
        return this.cache.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.cache.evictAll();
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    public final Response get$okhttp(Request request) {
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(Companion.key(request.url()));
            if (snapshot == null) {
                return null;
            }
            try {
                Entry entry = new Entry(snapshot.getSource(0));
                Response response = entry.response(snapshot);
                if (!entry.matches(request, response)) {
                    ResponseBody body = response.body();
                    if (body != null) {
                        Util.closeQuietly(body);
                    }
                    return null;
                }
                return response;
            } catch (IOException unused) {
                Util.closeQuietly(snapshot);
                return null;
            }
        } catch (IOException unused2) {
        }
    }

    public final DiskLruCache getCache$okhttp() {
        return this.cache;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.writeAbortCount;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.writeSuccessCount;
    }

    public final synchronized int hitCount() {
        return this.hitCount;
    }

    public final void initialize() throws IOException {
        this.cache.initialize();
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    public final long maxSize() {
        return this.cache.getMaxSize();
    }

    public final synchronized int networkCount() {
        return this.networkCount;
    }

    public final CacheRequest put$okhttp(Response response) {
        DiskLruCache.Editor editor;
        String method = response.request().method();
        if (HttpMethod.INSTANCE.invalidatesCache(response.request().method())) {
            try {
                remove$okhttp(response.request());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!m20.L(method, "GET")) {
            return null;
        }
        Companion companion = Companion;
        if (companion.hasVaryAll(response)) {
            return null;
        }
        Entry entry = new Entry(response);
        try {
            editor = DiskLruCache.edit$default(this.cache, companion.key(response.request().url()), 0L, 2, null);
            if (editor == null) {
                return null;
            }
            try {
                entry.writeTo(editor);
                return new RealCacheRequest(editor);
            } catch (IOException unused2) {
                abortQuietly(editor);
                return null;
            }
        } catch (IOException unused3) {
            editor = null;
        }
    }

    public final void remove$okhttp(Request request) throws IOException {
        this.cache.remove(Companion.key(request.url()));
    }

    public final synchronized int requestCount() {
        return this.requestCount;
    }

    public final void setWriteAbortCount$okhttp(int i) {
        this.writeAbortCount = i;
    }

    public final void setWriteSuccessCount$okhttp(int i) {
        this.writeSuccessCount = i;
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized void trackConditionalCacheHit$okhttp() {
        this.hitCount++;
    }

    public final synchronized void trackResponse$okhttp(CacheStrategy cacheStrategy) {
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void update$okhttp(Response response, Response response2) {
        DiskLruCache.Editor editor;
        Entry entry = new Entry(response2);
        ResponseBody body = response.body();
        if (body != null) {
            try {
                editor = ((CacheResponseBody) body).getSnapshot().edit();
                if (editor == null) {
                    return;
                }
                try {
                    entry.writeTo(editor);
                    editor.commit();
                } catch (IOException unused) {
                    abortQuietly(editor);
                }
            } catch (IOException unused2) {
                editor = null;
            }
        } else {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
    }

    public final Iterator<String> urls() throws IOException {
        return new Cache$urls$1(this);
    }

    public final synchronized int writeAbortCount() {
        return this.writeAbortCount;
    }

    public final synchronized int writeSuccessCount() {
        return this.writeSuccessCount;
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        private final Set<String> varyFields(Headers headers) {
            int size = headers.size();
            TreeSet treeSet = null;
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (i23.U0("Vary", headers.name(i))) {
                    String value = headers.value(i);
                    if (treeSet == null) {
                        treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                    }
                    Iterator it = i23.n1(value, new char[]{','}).iterator();
                    while (it.hasNext()) {
                        treeSet.add(i23.u1((String) it.next()).toString());
                    }
                }
                i = i2;
            }
            if (treeSet == null) {
                return fr0.f2138a;
            }
            return treeSet;
        }

        public final boolean hasVaryAll(Response response) {
            return varyFields(response.headers()).contains("*");
        }

        public final String key(HttpUrl httpUrl) {
            String httpUrl2 = httpUrl.toString();
            at atVar = new at(t9.l(httpUrl2));
            atVar.c = httpUrl2;
            return atVar.b("MD5").d();
        }

        public final int readInt$okhttp(sr srVar) throws IOException {
            boolean z;
            try {
                long n = srVar.n();
                String y = srVar.y();
                if (n >= 0 && n <= 2147483647L) {
                    if (y.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return (int) n;
                    }
                }
                throw new IOException("expected an int but was \"" + n + y + '\"');
            } catch (NumberFormatException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final Headers varyHeaders(Response response) {
            return varyHeaders(response.networkResponse().request().headers(), response.headers());
        }

        public final boolean varyMatches(Response response, Headers headers, Request request) {
            Set<String> varyFields = varyFields(response.headers());
            if ((varyFields instanceof Collection) && varyFields.isEmpty()) {
                return true;
            }
            for (String str : varyFields) {
                if (!m20.L(headers.values(str), request.headers(str))) {
                    return false;
                }
            }
            return true;
        }

        private final Headers varyHeaders(Headers headers, Headers headers2) {
            Set<String> varyFields = varyFields(headers2);
            if (varyFields.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                String name = headers.name(i);
                if (varyFields.contains(name)) {
                    builder.add(name, headers.value(i));
                }
                i = i2;
            }
            return builder.build();
        }
    }

    public Cache(File file, long j) {
        this(file, j, FileSystem.SYSTEM);
    }

    /* loaded from: classes2.dex */
    public static final class Entry {
        public static final Companion Companion = new Companion(null);
        private static final String RECEIVED_MILLIS;
        private static final String SENT_MILLIS;
        private final int code;
        private final Handshake handshake;
        private final String message;
        private final Protocol protocol;
        private final long receivedResponseMillis;
        private final String requestMethod;
        private final Headers responseHeaders;
        private final long sentRequestMillis;
        private final HttpUrl url;
        private final Headers varyHeaders;

        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(ng0 ng0Var) {
                this();
            }
        }

        static {
            Platform.Companion companion = Platform.Companion;
            SENT_MILLIS = m20.d1("-Sent-Millis", companion.get().getPrefix());
            RECEIVED_MILLIS = m20.d1("-Received-Millis", companion.get().getPrefix());
        }

        public Entry(mx2 mx2Var) throws IOException {
            TlsVersion tlsVersion;
            try {
                xg2 xg2Var = new xg2(mx2Var);
                String y = xg2Var.y();
                HttpUrl parse = HttpUrl.Companion.parse(y);
                if (parse != null) {
                    this.url = parse;
                    this.requestMethod = xg2Var.y();
                    Headers.Builder builder = new Headers.Builder();
                    int readInt$okhttp = Cache.Companion.readInt$okhttp(xg2Var);
                    int i = 0;
                    while (i < readInt$okhttp) {
                        i++;
                        builder.addLenient$okhttp(xg2Var.y());
                    }
                    this.varyHeaders = builder.build();
                    StatusLine parse2 = StatusLine.Companion.parse(xg2Var.y());
                    this.protocol = parse2.protocol;
                    this.code = parse2.code;
                    this.message = parse2.message;
                    Headers.Builder builder2 = new Headers.Builder();
                    int readInt$okhttp2 = Cache.Companion.readInt$okhttp(xg2Var);
                    int i2 = 0;
                    while (i2 < readInt$okhttp2) {
                        i2++;
                        builder2.addLenient$okhttp(xg2Var.y());
                    }
                    String str = SENT_MILLIS;
                    String str2 = builder2.get(str);
                    String str3 = RECEIVED_MILLIS;
                    String str4 = builder2.get(str3);
                    builder2.removeAll(str);
                    builder2.removeAll(str3);
                    long j = 0;
                    this.sentRequestMillis = str2 == null ? 0L : Long.parseLong(str2);
                    if (str4 != null) {
                        j = Long.parseLong(str4);
                    }
                    this.receivedResponseMillis = j;
                    this.responseHeaders = builder2.build();
                    if (isHttps()) {
                        String y2 = xg2Var.y();
                        if (!(y2.length() > 0)) {
                            CipherSuite forJavaName = CipherSuite.Companion.forJavaName(xg2Var.y());
                            List<Certificate> readCertificateList = readCertificateList(xg2Var);
                            List<Certificate> readCertificateList2 = readCertificateList(xg2Var);
                            if (!xg2Var.j()) {
                                tlsVersion = TlsVersion.Companion.forJavaName(xg2Var.y());
                            } else {
                                tlsVersion = TlsVersion.SSL_3_0;
                            }
                            this.handshake = Handshake.Companion.get(tlsVersion, forJavaName, readCertificateList, readCertificateList2);
                        } else {
                            throw new IOException("expected \"\" but was \"" + y2 + '\"');
                        }
                    } else {
                        this.handshake = null;
                    }
                    tf3.y(mx2Var, null);
                    return;
                }
                IOException iOException = new IOException(m20.d1(y, "Cache corruption for "));
                Platform.Companion.get().log("cache corruption", 5, iOException);
                throw iOException;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    tf3.y(mx2Var, th);
                    throw th2;
                }
            }
        }

        private final boolean isHttps() {
            return m20.L(this.url.scheme(), "https");
        }

        private final List<Certificate> readCertificateList(sr srVar) throws IOException {
            int readInt$okhttp = Cache.Companion.readInt$okhttp(srVar);
            if (readInt$okhttp == -1) {
                return cr0.f1659a;
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(readInt$okhttp);
                int i = 0;
                while (i < readInt$okhttp) {
                    i++;
                    String y = srVar.y();
                    lr lrVar = new lr();
                    lrVar.U(v73.f(y));
                    arrayList.add(certificateFactory.generateCertificate(lrVar.I()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        private final void writeCertList(rr rrVar, List<? extends Certificate> list) throws IOException {
            try {
                rrVar.G(list.size()).k(10);
                Iterator<? extends Certificate> it = list.iterator();
                while (it.hasNext()) {
                    rrVar.p(v73.n(it.next().getEncoded()).a()).k(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }

        public final boolean matches(Request request, Response response) {
            if (m20.L(this.url, request.url()) && m20.L(this.requestMethod, request.method()) && Cache.Companion.varyMatches(response, this.varyHeaders, request)) {
                return true;
            }
            return false;
        }

        public final Response response(DiskLruCache.Snapshot snapshot) {
            String str = this.responseHeaders.get("Content-Type");
            String str2 = this.responseHeaders.get("Content-Length");
            return new Response.Builder().request(new Request.Builder().url(this.url).method(this.requestMethod, null).headers(this.varyHeaders).build()).protocol(this.protocol).code(this.code).message(this.message).headers(this.responseHeaders).body(new CacheResponseBody(snapshot, str, str2)).handshake(this.handshake).sentRequestAtMillis(this.sentRequestMillis).receivedResponseAtMillis(this.receivedResponseMillis).build();
        }

        public final void writeTo(DiskLruCache.Editor editor) throws IOException {
            wg2 wg2Var = new wg2(editor.newSink(0));
            try {
                wg2Var.p(this.url.toString());
                wg2Var.k(10);
                wg2Var.p(this.requestMethod);
                wg2Var.k(10);
                wg2Var.G(this.varyHeaders.size());
                wg2Var.k(10);
                int size = this.varyHeaders.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    wg2Var.p(this.varyHeaders.name(i));
                    wg2Var.p(": ");
                    wg2Var.p(this.varyHeaders.value(i));
                    wg2Var.k(10);
                    i = i2;
                }
                wg2Var.p(new StatusLine(this.protocol, this.code, this.message).toString());
                wg2Var.k(10);
                wg2Var.G(this.responseHeaders.size() + 2);
                wg2Var.k(10);
                int size2 = this.responseHeaders.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    wg2Var.p(this.responseHeaders.name(i3));
                    wg2Var.p(": ");
                    wg2Var.p(this.responseHeaders.value(i3));
                    wg2Var.k(10);
                }
                wg2Var.p(SENT_MILLIS);
                wg2Var.p(": ");
                wg2Var.G(this.sentRequestMillis);
                wg2Var.k(10);
                wg2Var.p(RECEIVED_MILLIS);
                wg2Var.p(": ");
                wg2Var.G(this.receivedResponseMillis);
                wg2Var.k(10);
                if (isHttps()) {
                    wg2Var.k(10);
                    wg2Var.p(this.handshake.cipherSuite().javaName());
                    wg2Var.k(10);
                    writeCertList(wg2Var, this.handshake.peerCertificates());
                    writeCertList(wg2Var, this.handshake.localCertificates());
                    wg2Var.p(this.handshake.tlsVersion().javaName());
                    wg2Var.k(10);
                }
                tf3.y(wg2Var, null);
            } finally {
            }
        }

        public Entry(Response response) {
            this.url = response.request().url();
            this.varyHeaders = Cache.Companion.varyHeaders(response);
            this.requestMethod = response.request().method();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.responseHeaders = response.headers();
            this.handshake = response.handshake();
            this.sentRequestMillis = response.sentRequestAtMillis();
            this.receivedResponseMillis = response.receivedResponseAtMillis();
        }
    }
}
