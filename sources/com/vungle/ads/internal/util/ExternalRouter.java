package com.vungle.ads.internal.util;

import android.content.Context;
import android.util.Log;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import com.vungle.ads.internal.util.ActivityManager;
import defpackage.hx2;

/* loaded from: classes2.dex */
public final class ExternalRouter {
    public static final ExternalRouter INSTANCE = new ExternalRouter();
    private static final String TAG = "ExternalRouter";

    private ExternalRouter() {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0013 A[Catch: URISyntaxException -> 0x000d, TryCatch #0 {URISyntaxException -> 0x000d, blocks: (B:17:0x0004, B:8:0x001c, B:15:0x0013), top: B:16:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0012  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.content.Intent getIntentFromUrl(java.lang.String r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            if (r4 == 0) goto Lf
            int r2 = r4.length()     // Catch: java.net.URISyntaxException -> Ld
            if (r2 != 0) goto Lb
            goto Lf
        Lb:
            r2 = 0
            goto L10
        Ld:
            r4 = move-exception
            goto L22
        Lf:
            r2 = 1
        L10:
            if (r2 == 0) goto L13
            goto L18
        L13:
            android.content.Intent r4 = android.content.Intent.parseUri(r4, r0)     // Catch: java.net.URISyntaxException -> Ld
            r1 = r4
        L18:
            if (r1 == 0) goto L39
            if (r5 == 0) goto L39
            r4 = 268435456(0x10000000, float:2.524355E-29)
            r1.setFlags(r4)     // Catch: java.net.URISyntaxException -> Ld
            goto L39
        L22:
            java.lang.String r5 = com.vungle.ads.internal.util.ExternalRouter.TAG
            java.lang.String r4 = r4.getLocalizedMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "url format is not correct "
            r0.<init>(r2)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            android.util.Log.e(r5, r4)
        L39:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.util.ExternalRouter.getIntentFromUrl(java.lang.String, boolean):android.content.Intent");
    }

    public static final boolean launch(String str, String str2, Context context, boolean z, ActivityManager.LeftApplicationCallback leftApplicationCallback, PresenterAdOpenCallback presenterAdOpenCallback) {
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (str != null && str.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            if (str2 != null && str2.length() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                return false;
            }
        }
        try {
            ExternalRouter externalRouter = INSTANCE;
            ActivityManager.Companion.startWhenForeground(context, externalRouter.getIntentFromUrl(str, z), externalRouter.getIntentFromUrl(str2, z), leftApplicationCallback, presenterAdOpenCallback);
            return true;
        } catch (Exception e) {
            if (str != null && str.length() != 0) {
                z4 = false;
            }
            if (!z4) {
                AnalyticsClient.INSTANCE.logError$vungle_ads_release(312, hx2.p("Fail to open ", str), (r13 & 4) != 0 ? null : "", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            } else {
                AnalyticsClient.INSTANCE.logError$vungle_ads_release(314, hx2.p("Fail to open ", str2), (r13 & 4) != 0 ? null : "", (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            }
            Log.e(TAG, "Error while opening url" + e.getLocalizedMessage());
            return false;
        }
    }
}
