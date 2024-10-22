package com.vungle.ads.internal.network;

import defpackage.ng0;
import okhttp3.Headers;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class Response<T> {
    public static final Companion Companion = new Companion(null);
    private final T body;
    private final ResponseBody errorBody;
    private final okhttp3.Response rawResponse;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public final <T> Response<T> error(ResponseBody responseBody, okhttp3.Response response) {
            if (!response.isSuccessful()) {
                ng0 ng0Var = null;
                return new Response<>(response, ng0Var, responseBody, ng0Var);
            }
            throw new IllegalArgumentException("rawResponse should not be successful response".toString());
        }

        public final <T> Response<T> success(T t, okhttp3.Response response) {
            if (response.isSuccessful()) {
                return new Response<>(response, t, null, 0 == true ? 1 : 0);
            }
            throw new IllegalArgumentException("rawResponse must be successful response".toString());
        }
    }

    public /* synthetic */ Response(okhttp3.Response response, Object obj, ResponseBody responseBody, ng0 ng0Var) {
        this(response, obj, responseBody);
    }

    public final T body() {
        return this.body;
    }

    public final int code() {
        return this.rawResponse.code();
    }

    public final ResponseBody errorBody() {
        return this.errorBody;
    }

    public final Headers headers() {
        return this.rawResponse.headers();
    }

    public final boolean isSuccessful() {
        return this.rawResponse.isSuccessful();
    }

    public final String message() {
        return this.rawResponse.message();
    }

    public final okhttp3.Response raw() {
        return this.rawResponse;
    }

    public String toString() {
        return this.rawResponse.toString();
    }

    private Response(okhttp3.Response response, T t, ResponseBody responseBody) {
        this.rawResponse = response;
        this.body = t;
        this.errorBody = responseBody;
    }
}
