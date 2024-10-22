package com.chartboost.sdk.internal.Networking;

import com.chartboost.sdk.impl.f6;
import defpackage.hx2;
import java.net.URL;

/* loaded from: classes.dex */
public class NetworkHelper {
    private static String debugEndpoint = null;
    private static boolean isforceSDKToAcceptAllSSLCertsEnabled = false;

    public static String a(String str, String str2) {
        String str3 = debugEndpoint;
        if (str3 != null && !str3.isEmpty()) {
            str = debugEndpoint;
        }
        Object[] objArr = new Object[3];
        objArr[0] = str;
        String str4 = "/";
        if (str2 != null && str2.startsWith("/")) {
            str4 = "";
        }
        objArr[1] = str4;
        if (str2 == null) {
            str2 = "";
        }
        objArr[2] = str2;
        return String.format("%s%s%s", objArr);
    }

    public static String b(String str) {
        URL c = c(str);
        if (c != null) {
            try {
                return c.getPath();
            } catch (Exception e) {
                StringBuilder u = hx2.u("getPathFromUrl: ", str, " : ");
                u.append(e.toString());
                f6.a("NetworkHelper", u.toString());
                return "";
            }
        }
        return "";
    }

    public static URL c(String str) {
        if (str != null && str.length() > 0) {
            try {
                return new URL(str);
            } catch (Exception e) {
                StringBuilder u = hx2.u("stringToURL: ", str, " : ");
                u.append(e.toString());
                f6.a("NetworkHelper", u.toString());
                return null;
            }
        }
        return null;
    }

    private static void setDebugUrl(String str) {
        debugEndpoint = str;
    }

    public static String a(String str) {
        URL c = c(str);
        if (c == null) {
            return "";
        }
        try {
            return c.getProtocol() + "://" + c.getHost();
        } catch (Exception e) {
            StringBuilder u = hx2.u("getEndpointFromUrl: ", str, " : ");
            u.append(e.toString());
            f6.a("NetworkHelper", u.toString());
            return "";
        }
    }

    public static boolean a() {
        return isforceSDKToAcceptAllSSLCertsEnabled;
    }
}
