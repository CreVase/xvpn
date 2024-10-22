package okhttp3.internal.http;

import defpackage.m20;

/* loaded from: classes2.dex */
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    public static final boolean permitsRequestBody(String str) {
        if (!m20.L(str, "GET") && !m20.L(str, "HEAD")) {
            return true;
        }
        return false;
    }

    public static final boolean requiresRequestBody(String str) {
        if (!m20.L(str, "POST") && !m20.L(str, "PUT") && !m20.L(str, "PATCH") && !m20.L(str, "PROPPATCH") && !m20.L(str, "REPORT")) {
            return false;
        }
        return true;
    }

    public final boolean invalidatesCache(String str) {
        if (!m20.L(str, "POST") && !m20.L(str, "PATCH") && !m20.L(str, "PUT") && !m20.L(str, "DELETE") && !m20.L(str, "MOVE")) {
            return false;
        }
        return true;
    }

    public final boolean redirectsToGet(String str) {
        return !m20.L(str, "PROPFIND");
    }

    public final boolean redirectsWithBody(String str) {
        return m20.L(str, "PROPFIND");
    }
}
