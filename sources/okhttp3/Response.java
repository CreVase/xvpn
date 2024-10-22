package okhttp3;

import defpackage.cr0;
import defpackage.lr;
import defpackage.m20;
import defpackage.xg2;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import okhttp3.Headers;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.http.HttpHeaders;

/* loaded from: classes2.dex */
public final class Response implements Closeable {
    private final ResponseBody body;
    private final Response cacheResponse;
    private final int code;
    private final Exchange exchange;
    private final Handshake handshake;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String message;
    private final Response networkResponse;
    private final Response priorResponse;
    private final Protocol protocol;
    private final long receivedResponseAtMillis;
    private final Request request;
    private final long sentRequestAtMillis;

    public Response(Request request, Protocol protocol, String str, int i, Handshake handshake, Headers headers, ResponseBody responseBody, Response response, Response response2, Response response3, long j, long j2, Exchange exchange) {
        this.request = request;
        this.protocol = protocol;
        this.message = str;
        this.code = i;
        this.handshake = handshake;
        this.headers = headers;
        this.body = responseBody;
        this.networkResponse = response;
        this.cacheResponse = response2;
        this.priorResponse = response3;
        this.sentRequestAtMillis = j;
        this.receivedResponseAtMillis = j2;
        this.exchange = exchange;
    }

    public static /* synthetic */ String header$default(Response response, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return response.header(str, str2);
    }

    /* renamed from: -deprecated_body, reason: not valid java name */
    public final ResponseBody m229deprecated_body() {
        return this.body;
    }

    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m230deprecated_cacheControl() {
        return cacheControl();
    }

    /* renamed from: -deprecated_cacheResponse, reason: not valid java name */
    public final Response m231deprecated_cacheResponse() {
        return this.cacheResponse;
    }

    /* renamed from: -deprecated_code, reason: not valid java name */
    public final int m232deprecated_code() {
        return this.code;
    }

    /* renamed from: -deprecated_handshake, reason: not valid java name */
    public final Handshake m233deprecated_handshake() {
        return this.handshake;
    }

    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m234deprecated_headers() {
        return this.headers;
    }

    /* renamed from: -deprecated_message, reason: not valid java name */
    public final String m235deprecated_message() {
        return this.message;
    }

    /* renamed from: -deprecated_networkResponse, reason: not valid java name */
    public final Response m236deprecated_networkResponse() {
        return this.networkResponse;
    }

    /* renamed from: -deprecated_priorResponse, reason: not valid java name */
    public final Response m237deprecated_priorResponse() {
        return this.priorResponse;
    }

    /* renamed from: -deprecated_protocol, reason: not valid java name */
    public final Protocol m238deprecated_protocol() {
        return this.protocol;
    }

    /* renamed from: -deprecated_receivedResponseAtMillis, reason: not valid java name */
    public final long m239deprecated_receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    /* renamed from: -deprecated_request, reason: not valid java name */
    public final Request m240deprecated_request() {
        return this.request;
    }

    /* renamed from: -deprecated_sentRequestAtMillis, reason: not valid java name */
    public final long m241deprecated_sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public final ResponseBody body() {
        return this.body;
    }

    public final CacheControl cacheControl() {
        CacheControl cacheControl = this.lazyCacheControl;
        if (cacheControl == null) {
            CacheControl parse = CacheControl.Companion.parse(this.headers);
            this.lazyCacheControl = parse;
            return parse;
        }
        return cacheControl;
    }

    public final Response cacheResponse() {
        return this.cacheResponse;
    }

    public final List<Challenge> challenges() {
        String str;
        Headers headers = this.headers;
        int i = this.code;
        if (i != 401) {
            if (i != 407) {
                return cr0.f1659a;
            }
            str = "Proxy-Authenticate";
        } else {
            str = "WWW-Authenticate";
        }
        return HttpHeaders.parseChallenges(headers, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ResponseBody responseBody = this.body;
        if (responseBody != null) {
            responseBody.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    public final int code() {
        return this.code;
    }

    public final Exchange exchange() {
        return this.exchange;
    }

    public final Handshake handshake() {
        return this.handshake;
    }

    public final String header(String str) {
        return header$default(this, str, null, 2, null);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isRedirect() {
        int i = this.code;
        if (i != 307 && i != 308) {
            switch (i) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    public final boolean isSuccessful() {
        int i = this.code;
        if (200 > i || i >= 300) {
            return false;
        }
        return true;
    }

    public final String message() {
        return this.message;
    }

    public final Response networkResponse() {
        return this.networkResponse;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final ResponseBody peekBody(long j) throws IOException {
        xg2 D = this.body.source().D();
        lr lrVar = new lr();
        D.v(j);
        long min = Math.min(j, D.f5155b.f3176b);
        while (min > 0) {
            long read = D.read(lrVar, min);
            if (read != -1) {
                min -= read;
            } else {
                throw new EOFException();
            }
        }
        return ResponseBody.Companion.create(lrVar, this.body.contentType(), lrVar.f3176b);
    }

    public final Response priorResponse() {
        return this.priorResponse;
    }

    public final Protocol protocol() {
        return this.protocol;
    }

    public final long receivedResponseAtMillis() {
        return this.receivedResponseAtMillis;
    }

    public final Request request() {
        return this.request;
    }

    public final long sentRequestAtMillis() {
        return this.sentRequestAtMillis;
    }

    public String toString() {
        return "Response{protocol=" + this.protocol + ", code=" + this.code + ", message=" + this.message + ", url=" + this.request.url() + '}';
    }

    public final Headers trailers() throws IOException {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.trailers();
        }
        throw new IllegalStateException("trailers not available".toString());
    }

    public final String header(String str, String str2) {
        String str3 = this.headers.get(str);
        return str3 == null ? str2 : str3;
    }

    public final List<String> headers(String str) {
        return this.headers.values(str);
    }

    /* loaded from: classes2.dex */
    public static class Builder {
        private ResponseBody body;
        private Response cacheResponse;
        private int code;
        private Exchange exchange;
        private Handshake handshake;
        private Headers.Builder headers;
        private String message;
        private Response networkResponse;
        private Response priorResponse;
        private Protocol protocol;
        private long receivedResponseAtMillis;
        private Request request;
        private long sentRequestAtMillis;

        public Builder() {
            this.code = -1;
            this.headers = new Headers.Builder();
        }

        private final void checkPriorResponse(Response response) {
            boolean z;
            if (response != null) {
                if (response.body() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                } else {
                    throw new IllegalArgumentException("priorResponse.body != null".toString());
                }
            }
        }

        private final void checkSupportResponse(String str, Response response) {
            boolean z;
            boolean z2;
            boolean z3;
            if (response != null) {
                boolean z4 = true;
                if (response.body() == null) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    if (response.networkResponse() == null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        if (response.cacheResponse() == null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            if (response.priorResponse() != null) {
                                z4 = false;
                            }
                            if (z4) {
                                return;
                            } else {
                                throw new IllegalArgumentException(m20.d1(".priorResponse != null", str).toString());
                            }
                        }
                        throw new IllegalArgumentException(m20.d1(".cacheResponse != null", str).toString());
                    }
                    throw new IllegalArgumentException(m20.d1(".networkResponse != null", str).toString());
                }
                throw new IllegalArgumentException(m20.d1(".body != null", str).toString());
            }
        }

        public Builder addHeader(String str, String str2) {
            getHeaders$okhttp().add(str, str2);
            return this;
        }

        public Builder body(ResponseBody responseBody) {
            setBody$okhttp(responseBody);
            return this;
        }

        public Response build() {
            boolean z;
            int i = this.code;
            if (i >= 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                Request request = this.request;
                if (request != null) {
                    Protocol protocol = this.protocol;
                    if (protocol != null) {
                        String str = this.message;
                        if (str != null) {
                            return new Response(request, protocol, str, i, this.handshake, this.headers.build(), this.body, this.networkResponse, this.cacheResponse, this.priorResponse, this.sentRequestAtMillis, this.receivedResponseAtMillis, this.exchange);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(m20.d1(Integer.valueOf(getCode$okhttp()), "code < 0: ").toString());
        }

        public Builder cacheResponse(Response response) {
            checkSupportResponse("cacheResponse", response);
            setCacheResponse$okhttp(response);
            return this;
        }

        public Builder code(int i) {
            setCode$okhttp(i);
            return this;
        }

        public final ResponseBody getBody$okhttp() {
            return this.body;
        }

        public final Response getCacheResponse$okhttp() {
            return this.cacheResponse;
        }

        public final int getCode$okhttp() {
            return this.code;
        }

        public final Exchange getExchange$okhttp() {
            return this.exchange;
        }

        public final Handshake getHandshake$okhttp() {
            return this.handshake;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMessage$okhttp() {
            return this.message;
        }

        public final Response getNetworkResponse$okhttp() {
            return this.networkResponse;
        }

        public final Response getPriorResponse$okhttp() {
            return this.priorResponse;
        }

        public final Protocol getProtocol$okhttp() {
            return this.protocol;
        }

        public final long getReceivedResponseAtMillis$okhttp() {
            return this.receivedResponseAtMillis;
        }

        public final Request getRequest$okhttp() {
            return this.request;
        }

        public final long getSentRequestAtMillis$okhttp() {
            return this.sentRequestAtMillis;
        }

        public Builder handshake(Handshake handshake) {
            setHandshake$okhttp(handshake);
            return this;
        }

        public Builder header(String str, String str2) {
            getHeaders$okhttp().set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            setHeaders$okhttp(headers.newBuilder());
            return this;
        }

        public final void initExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public Builder message(String str) {
            setMessage$okhttp(str);
            return this;
        }

        public Builder networkResponse(Response response) {
            checkSupportResponse("networkResponse", response);
            setNetworkResponse$okhttp(response);
            return this;
        }

        public Builder priorResponse(Response response) {
            checkPriorResponse(response);
            setPriorResponse$okhttp(response);
            return this;
        }

        public Builder protocol(Protocol protocol) {
            setProtocol$okhttp(protocol);
            return this;
        }

        public Builder receivedResponseAtMillis(long j) {
            setReceivedResponseAtMillis$okhttp(j);
            return this;
        }

        public Builder removeHeader(String str) {
            getHeaders$okhttp().removeAll(str);
            return this;
        }

        public Builder request(Request request) {
            setRequest$okhttp(request);
            return this;
        }

        public Builder sentRequestAtMillis(long j) {
            setSentRequestAtMillis$okhttp(j);
            return this;
        }

        public final void setBody$okhttp(ResponseBody responseBody) {
            this.body = responseBody;
        }

        public final void setCacheResponse$okhttp(Response response) {
            this.cacheResponse = response;
        }

        public final void setCode$okhttp(int i) {
            this.code = i;
        }

        public final void setExchange$okhttp(Exchange exchange) {
            this.exchange = exchange;
        }

        public final void setHandshake$okhttp(Handshake handshake) {
            this.handshake = handshake;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            this.headers = builder;
        }

        public final void setMessage$okhttp(String str) {
            this.message = str;
        }

        public final void setNetworkResponse$okhttp(Response response) {
            this.networkResponse = response;
        }

        public final void setPriorResponse$okhttp(Response response) {
            this.priorResponse = response;
        }

        public final void setProtocol$okhttp(Protocol protocol) {
            this.protocol = protocol;
        }

        public final void setReceivedResponseAtMillis$okhttp(long j) {
            this.receivedResponseAtMillis = j;
        }

        public final void setRequest$okhttp(Request request) {
            this.request = request;
        }

        public final void setSentRequestAtMillis$okhttp(long j) {
            this.sentRequestAtMillis = j;
        }

        public Builder(Response response) {
            this.code = -1;
            this.request = response.request();
            this.protocol = response.protocol();
            this.code = response.code();
            this.message = response.message();
            this.handshake = response.handshake();
            this.headers = response.headers().newBuilder();
            this.body = response.body();
            this.networkResponse = response.networkResponse();
            this.cacheResponse = response.cacheResponse();
            this.priorResponse = response.priorResponse();
            this.sentRequestAtMillis = response.sentRequestAtMillis();
            this.receivedResponseAtMillis = response.receivedResponseAtMillis();
            this.exchange = response.exchange();
        }
    }
}
