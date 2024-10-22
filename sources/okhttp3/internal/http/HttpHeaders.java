package okhttp3.internal.http;

import defpackage.at;
import defpackage.dx;
import defpackage.i23;
import defpackage.lr;
import defpackage.m20;
import defpackage.t9;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import okhttp3.Challenge;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Response;
import okhttp3.internal.Util;
import okhttp3.internal.platform.Platform;

/* loaded from: classes2.dex */
public final class HttpHeaders {
    private static final at QUOTED_STRING_DELIMITERS;
    private static final at TOKEN_DELIMITERS;

    static {
        at atVar = new at(t9.l("\"\\"));
        atVar.c = "\"\\";
        QUOTED_STRING_DELIMITERS = atVar;
        at atVar2 = new at(t9.l("\t ,="));
        atVar2.c = "\t ,=";
        TOKEN_DELIMITERS = atVar2;
    }

    public static final boolean hasBody(Response response) {
        return promisesBody(response);
    }

    public static final List<Challenge> parseChallenges(Headers headers, String str) {
        ArrayList arrayList = new ArrayList();
        int size = headers.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (i23.U0(str, headers.name(i))) {
                lr lrVar = new lr();
                lrVar.d0(headers.value(i));
                try {
                    readChallengeHeader(lrVar, arrayList);
                } catch (EOFException e) {
                    Platform.Companion.get().log("Unable to parse challenge", 5, e);
                }
            }
            i = i2;
        }
        return arrayList;
    }

    public static final boolean promisesBody(Response response) {
        if (m20.L(response.request().method(), "HEAD")) {
            return false;
        }
        int code = response.code();
        if (((code >= 100 && code < 200) || code == 204 || code == 304) && Util.headersContentLength(response) == -1 && !i23.U0("chunked", Response.header$default(response, "Transfer-Encoding", null, 2, null))) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:            r4 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0042, code lost:            if (r5 < 0) goto L22;     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:            r6 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:            if (r6 == false) goto L65;     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:            if (r5 == 0) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004d, code lost:            if (r5 == 1) goto L31;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:            r6 = "=".charAt(0);        r7 = new char[r5];     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:            if (r4 >= r5) goto L79;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:            r7[r4] = r6;        r4 = r4 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:            r4 = new java.lang.String(r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0062, code lost:            r4 = "=".toString();     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:            r4 = "";     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:            throw new java.lang.IllegalArgumentException(("Count 'n' must be non-negative, but was " + r5 + '.').toString());     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0046, code lost:            r6 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00b3, code lost:            continue;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00b3, code lost:            continue;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void readChallengeHeader(defpackage.lr r8, java.util.List<okhttp3.Challenge> r9) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.http.HttpHeaders.readChallengeHeader(lr, java.util.List):void");
    }

    private static final String readQuotedString(lr lrVar) throws EOFException {
        boolean z;
        if (lrVar.readByte() == 34) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            lr lrVar2 = new lr();
            while (true) {
                long L = lrVar.L(QUOTED_STRING_DELIMITERS);
                if (L == -1) {
                    return null;
                }
                if (lrVar.x(L) == 34) {
                    lrVar2.write(lrVar, L);
                    lrVar.readByte();
                    return lrVar2.P();
                }
                if (lrVar.f3176b == L + 1) {
                    return null;
                }
                lrVar2.write(lrVar, L);
                lrVar.readByte();
                lrVar2.write(lrVar, 1L);
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    private static final String readToken(lr lrVar) {
        long L = lrVar.L(TOKEN_DELIMITERS);
        if (L == -1) {
            L = lrVar.f3176b;
        }
        if (L != 0) {
            return lrVar.O(L, dx.f1853a);
        }
        return null;
    }

    public static final void receiveHeaders(CookieJar cookieJar, HttpUrl httpUrl, Headers headers) {
        if (cookieJar == CookieJar.NO_COOKIES) {
            return;
        }
        List<Cookie> parseAll = Cookie.Companion.parseAll(httpUrl, headers);
        if (parseAll.isEmpty()) {
            return;
        }
        cookieJar.saveFromResponse(httpUrl, parseAll);
    }

    private static final boolean skipCommasAndWhitespace(lr lrVar) {
        boolean z = false;
        while (!lrVar.j()) {
            byte x = lrVar.x(0L);
            boolean z2 = true;
            if (x == 44) {
                lrVar.readByte();
                z = true;
            } else {
                if (x != 32 && x != 9) {
                    z2 = false;
                }
                if (!z2) {
                    break;
                }
                lrVar.readByte();
            }
        }
        return z;
    }

    private static final boolean startsWith(lr lrVar, byte b2) {
        if (!lrVar.j() && lrVar.x(0L) == b2) {
            return true;
        }
        return false;
    }
}
