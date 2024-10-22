package okhttp3;

import defpackage.hx2;
import defpackage.i23;
import defpackage.m20;
import defpackage.n42;
import defpackage.tf3;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.Headers;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* loaded from: classes2.dex */
public final class Request {
    private final RequestBody body;
    private final Headers headers;
    private CacheControl lazyCacheControl;
    private final String method;
    private final Map<Class<?>, Object> tags;
    private final HttpUrl url;

    /* loaded from: classes2.dex */
    public static class Builder {
        private RequestBody body;
        private Headers.Builder headers;
        private String method;
        private Map<Class<?>, Object> tags;
        private HttpUrl url;

        public Builder() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new Headers.Builder();
        }

        public static /* synthetic */ Builder delete$default(Builder builder, RequestBody requestBody, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    requestBody = Util.EMPTY_REQUEST;
                }
                return builder.delete(requestBody);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
        }

        public Builder addHeader(String str, String str2) {
            getHeaders$okhttp().add(str, str2);
            return this;
        }

        public Request build() {
            HttpUrl httpUrl = this.url;
            if (httpUrl != null) {
                return new Request(httpUrl, this.method, this.headers.build(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        public Builder cacheControl(CacheControl cacheControl) {
            boolean z;
            String cacheControl2 = cacheControl.toString();
            if (cacheControl2.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return removeHeader("Cache-Control");
            }
            return header("Cache-Control", cacheControl2);
        }

        public final Builder delete() {
            return delete$default(this, null, 1, null);
        }

        public Builder get() {
            return method("GET", null);
        }

        public final RequestBody getBody$okhttp() {
            return this.body;
        }

        public final Headers.Builder getHeaders$okhttp() {
            return this.headers;
        }

        public final String getMethod$okhttp() {
            return this.method;
        }

        public final Map<Class<?>, Object> getTags$okhttp() {
            return this.tags;
        }

        public final HttpUrl getUrl$okhttp() {
            return this.url;
        }

        public Builder head() {
            return method("HEAD", null);
        }

        public Builder header(String str, String str2) {
            getHeaders$okhttp().set(str, str2);
            return this;
        }

        public Builder headers(Headers headers) {
            setHeaders$okhttp(headers.newBuilder());
            return this;
        }

        public Builder method(String str, RequestBody requestBody) {
            boolean z;
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (requestBody == null) {
                    if (!(!HttpMethod.requiresRequestBody(str))) {
                        throw new IllegalArgumentException(hx2.q("method ", str, " must have a request body.").toString());
                    }
                } else if (!HttpMethod.permitsRequestBody(str)) {
                    throw new IllegalArgumentException(hx2.q("method ", str, " must not have a request body.").toString());
                }
                setMethod$okhttp(str);
                setBody$okhttp(requestBody);
                return this;
            }
            throw new IllegalArgumentException("method.isEmpty() == true".toString());
        }

        public Builder patch(RequestBody requestBody) {
            return method("PATCH", requestBody);
        }

        public Builder post(RequestBody requestBody) {
            return method("POST", requestBody);
        }

        public Builder put(RequestBody requestBody) {
            return method("PUT", requestBody);
        }

        public Builder removeHeader(String str) {
            getHeaders$okhttp().removeAll(str);
            return this;
        }

        public final void setBody$okhttp(RequestBody requestBody) {
            this.body = requestBody;
        }

        public final void setHeaders$okhttp(Headers.Builder builder) {
            this.headers = builder;
        }

        public final void setMethod$okhttp(String str) {
            this.method = str;
        }

        public final void setTags$okhttp(Map<Class<?>, Object> map) {
            this.tags = map;
        }

        public final void setUrl$okhttp(HttpUrl httpUrl) {
            this.url = httpUrl;
        }

        public Builder tag(Object obj) {
            return tag(Object.class, obj);
        }

        public Builder url(HttpUrl httpUrl) {
            setUrl$okhttp(httpUrl);
            return this;
        }

        public Builder delete(RequestBody requestBody) {
            return method("DELETE", requestBody);
        }

        public <T> Builder tag(Class<? super T> cls, T t) {
            if (t == null) {
                getTags$okhttp().remove(cls);
            } else {
                if (getTags$okhttp().isEmpty()) {
                    setTags$okhttp(new LinkedHashMap());
                }
                getTags$okhttp().put(cls, cls.cast(t));
            }
            return this;
        }

        public Builder url(String str) {
            if (i23.q1(str, "ws:", true)) {
                str = m20.d1(str.substring(3), "http:");
            } else if (i23.q1(str, "wss:", true)) {
                str = m20.d1(str.substring(4), "https:");
            }
            return url(HttpUrl.Companion.get(str));
        }

        public Builder(Request request) {
            LinkedHashMap linkedHashMap;
            this.tags = new LinkedHashMap();
            this.url = request.url();
            this.method = request.method();
            this.body = request.body();
            if (request.getTags$okhttp().isEmpty()) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = new LinkedHashMap(request.getTags$okhttp());
            }
            this.tags = linkedHashMap;
            this.headers = request.headers().newBuilder();
        }

        public Builder url(URL url) {
            return url(HttpUrl.Companion.get(url.toString()));
        }
    }

    public Request(HttpUrl httpUrl, String str, Headers headers, RequestBody requestBody, Map<Class<?>, ? extends Object> map) {
        this.url = httpUrl;
        this.method = str;
        this.headers = headers;
        this.body = requestBody;
        this.tags = map;
    }

    /* renamed from: -deprecated_body, reason: not valid java name */
    public final RequestBody m224deprecated_body() {
        return this.body;
    }

    /* renamed from: -deprecated_cacheControl, reason: not valid java name */
    public final CacheControl m225deprecated_cacheControl() {
        return cacheControl();
    }

    /* renamed from: -deprecated_headers, reason: not valid java name */
    public final Headers m226deprecated_headers() {
        return this.headers;
    }

    /* renamed from: -deprecated_method, reason: not valid java name */
    public final String m227deprecated_method() {
        return this.method;
    }

    /* renamed from: -deprecated_url, reason: not valid java name */
    public final HttpUrl m228deprecated_url() {
        return this.url;
    }

    public final RequestBody body() {
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

    public final Map<Class<?>, Object> getTags$okhttp() {
        return this.tags;
    }

    public final String header(String str) {
        return this.headers.get(str);
    }

    public final Headers headers() {
        return this.headers;
    }

    public final boolean isHttps() {
        return this.url.isHttps();
    }

    public final String method() {
        return this.method;
    }

    public final Builder newBuilder() {
        return new Builder(this);
    }

    public final Object tag() {
        return tag(Object.class);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(method());
        sb.append(", url=");
        sb.append(url());
        if (headers().size() != 0) {
            sb.append(", headers=[");
            int i = 0;
            for (n42 n42Var : headers()) {
                int i2 = i + 1;
                if (i >= 0) {
                    n42 n42Var2 = n42Var;
                    String str = (String) n42Var2.f3395a;
                    String str2 = (String) n42Var2.f3396b;
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(str);
                    sb.append(':');
                    sb.append(str2);
                    i = i2;
                } else {
                    tf3.y0();
                    throw null;
                }
            }
            sb.append(']');
        }
        if (!getTags$okhttp().isEmpty()) {
            sb.append(", tags=");
            sb.append(getTags$okhttp());
        }
        sb.append('}');
        return sb.toString();
    }

    public final HttpUrl url() {
        return this.url;
    }

    public final List<String> headers(String str) {
        return this.headers.values(str);
    }

    public final <T> T tag(Class<? extends T> cls) {
        return cls.cast(this.tags.get(cls));
    }
}
