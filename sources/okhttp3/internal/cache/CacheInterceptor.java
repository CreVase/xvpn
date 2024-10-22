package okhttp3.internal.cache;

import defpackage.d93;
import defpackage.dw2;
import defpackage.i23;
import defpackage.lr;
import defpackage.mx2;
import defpackage.ng0;
import defpackage.sr;
import defpackage.wg2;
import defpackage.xg2;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Cache;
import okhttp3.Call;
import okhttp3.EventListener;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;

/* loaded from: classes2.dex */
public final class CacheInterceptor implements Interceptor {
    public static final Companion Companion = new Companion(null);
    private final Cache cache;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Headers combine(Headers headers, Headers headers2) {
            Headers.Builder builder = new Headers.Builder();
            int size = headers.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                int i3 = i2 + 1;
                String name = headers.name(i2);
                String value = headers.value(i2);
                if ((!i23.U0("Warning", name) || !i23.q1(value, "1", false)) && (isContentSpecificHeader(name) || !isEndToEnd(name) || headers2.get(name) == null)) {
                    builder.addLenient$okhttp(name, value);
                }
                i2 = i3;
            }
            int size2 = headers2.size();
            while (i < size2) {
                int i4 = i + 1;
                String name2 = headers2.name(i);
                if (!isContentSpecificHeader(name2) && isEndToEnd(name2)) {
                    builder.addLenient$okhttp(name2, headers2.value(i));
                }
                i = i4;
            }
            return builder.build();
        }

        private final boolean isContentSpecificHeader(String str) {
            if (!i23.U0("Content-Length", str) && !i23.U0("Content-Encoding", str) && !i23.U0("Content-Type", str)) {
                return false;
            }
            return true;
        }

        private final boolean isEndToEnd(String str) {
            if (!i23.U0("Connection", str) && !i23.U0("Keep-Alive", str) && !i23.U0("Proxy-Authenticate", str) && !i23.U0("Proxy-Authorization", str) && !i23.U0("TE", str) && !i23.U0("Trailers", str) && !i23.U0("Transfer-Encoding", str) && !i23.U0("Upgrade", str)) {
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Response stripBody(Response response) {
            ResponseBody body;
            if (response == null) {
                body = null;
            } else {
                body = response.body();
            }
            if (body != null) {
                return response.newBuilder().body(null).build();
            }
            return response;
        }
    }

    public CacheInterceptor(Cache cache) {
        this.cache = cache;
    }

    private final Response cacheWritingResponse(final CacheRequest cacheRequest, Response response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        dw2 body = cacheRequest.body();
        final sr source = response.body().source();
        final wg2 wg2Var = new wg2(body);
        mx2 mx2Var = new mx2() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                sr.this.close();
            }

            @Override // defpackage.mx2
            public long read(lr lrVar, long j) throws IOException {
                try {
                    long read = sr.this.read(lrVar, j);
                    if (read == -1) {
                        if (!this.cacheRequestClosed) {
                            this.cacheRequestClosed = true;
                            wg2Var.close();
                        }
                        return -1L;
                    }
                    lrVar.w(lrVar.f3176b - read, wg2Var.b(), read);
                    wg2Var.m();
                    return read;
                } catch (IOException e) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e;
                }
            }

            @Override // defpackage.mx2
            public d93 timeout() {
                return sr.this.timeout();
            }
        };
        return response.newBuilder().body(new RealResponseBody(Response.header$default(response, "Content-Type", null, 2, null), response.body().contentLength(), new xg2(mx2Var))).build();
    }

    public final Cache getCache$okhttp() {
        return this.cache;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) throws IOException {
        Response response;
        RealCall realCall;
        ResponseBody body;
        ResponseBody body2;
        Call call = chain.call();
        Cache cache = this.cache;
        EventListener eventListener = null;
        if (cache == null) {
            response = null;
        } else {
            response = cache.get$okhttp(chain.request());
        }
        CacheStrategy compute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), response).compute();
        Request networkRequest = compute.getNetworkRequest();
        Response cacheResponse = compute.getCacheResponse();
        Cache cache2 = this.cache;
        if (cache2 != null) {
            cache2.trackResponse$okhttp(compute);
        }
        if (call instanceof RealCall) {
            realCall = (RealCall) call;
        } else {
            realCall = null;
        }
        if (realCall != null) {
            eventListener = realCall.getEventListener$okhttp();
        }
        if (eventListener == null) {
            eventListener = EventListener.NONE;
        }
        if (response != null && cacheResponse == null && (body2 = response.body()) != null) {
            Util.closeQuietly(body2);
        }
        if (networkRequest == null && cacheResponse == null) {
            Response build = new Response.Builder().request(chain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build();
            eventListener.satisfactionFailure(call, build);
            return build;
        }
        if (networkRequest == null) {
            Response build2 = cacheResponse.newBuilder().cacheResponse(Companion.stripBody(cacheResponse)).build();
            eventListener.cacheHit(call, build2);
            return build2;
        }
        if (cacheResponse != null) {
            eventListener.cacheConditionalHit(call, cacheResponse);
        } else if (this.cache != null) {
            eventListener.cacheMiss(call);
        }
        try {
            Response proceed = chain.proceed(networkRequest);
            if (proceed == null && response != null && body != null) {
            }
            if (cacheResponse != null) {
                boolean z = false;
                if (proceed != null && proceed.code() == 304) {
                    z = true;
                }
                if (z) {
                    Response.Builder newBuilder = cacheResponse.newBuilder();
                    Companion companion = Companion;
                    Response build3 = newBuilder.headers(companion.combine(cacheResponse.headers(), proceed.headers())).sentRequestAtMillis(proceed.sentRequestAtMillis()).receivedResponseAtMillis(proceed.receivedResponseAtMillis()).cacheResponse(companion.stripBody(cacheResponse)).networkResponse(companion.stripBody(proceed)).build();
                    proceed.body().close();
                    this.cache.trackConditionalCacheHit$okhttp();
                    this.cache.update$okhttp(cacheResponse, build3);
                    eventListener.cacheHit(call, build3);
                    return build3;
                }
                ResponseBody body3 = cacheResponse.body();
                if (body3 != null) {
                    Util.closeQuietly(body3);
                }
            }
            Response.Builder newBuilder2 = proceed.newBuilder();
            Companion companion2 = Companion;
            Response build4 = newBuilder2.cacheResponse(companion2.stripBody(cacheResponse)).networkResponse(companion2.stripBody(proceed)).build();
            if (this.cache != null) {
                if (HttpHeaders.promisesBody(build4) && CacheStrategy.Companion.isCacheable(build4, networkRequest)) {
                    Response cacheWritingResponse = cacheWritingResponse(this.cache.put$okhttp(build4), build4);
                    if (cacheResponse != null) {
                        eventListener.cacheMiss(call);
                    }
                    return cacheWritingResponse;
                }
                if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.method())) {
                    try {
                        this.cache.remove$okhttp(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return build4;
        } finally {
            if (response != null && (body = response.body()) != null) {
                Util.closeQuietly(body);
            }
        }
    }
}
