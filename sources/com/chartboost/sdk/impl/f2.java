package com.chartboost.sdk.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.chartboost.sdk.internal.Model.CBError;
import defpackage.p71;
import defpackage.vu3;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class f2 {

    /* renamed from: a */
    public final Executor f810a;

    /* renamed from: b */
    public final a2 f811b;
    public final Handler c;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ String f812a;

        /* renamed from: b */
        public final /* synthetic */ Context f813b;
        public final /* synthetic */ q5 c;

        public a(String str, Context context, q5 q5Var) {
            this.f812a = str;
            this.f813b = context;
            this.c = q5Var;
        }

        public static /* synthetic */ void a(a aVar, Context context, q5 q5Var, String str) {
            aVar.a(context, q5Var, str);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:            if (r3 == null) goto L60;     */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[Catch: Exception -> 0x0058, TryCatch #2 {Exception -> 0x0058, blocks: (B:3:0x0002, B:12:0x0048, B:21:0x0050, B:22:0x0053, B:28:0x0054), top: B:2:0x0002 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r6 = this;
                java.lang.String r0 = "CBURLOpener"
                java.lang.String r1 = r6.f812a     // Catch: java.lang.Exception -> L58
                com.chartboost.sdk.impl.f2 r2 = com.chartboost.sdk.impl.f2.this     // Catch: java.lang.Exception -> L58
                com.chartboost.sdk.impl.a2 r2 = r2.f811b     // Catch: java.lang.Exception -> L58
                boolean r2 = r2.e()     // Catch: java.lang.Exception -> L58
                if (r2 == 0) goto L54
                r2 = 0
                java.net.URL r3 = new java.net.URL     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
                java.lang.String r4 = r6.f812a     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
                r3.<init>(r4)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
                java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
                javax.net.ssl.HttpsURLConnection r3 = (javax.net.ssl.HttpsURLConnection) r3     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
                javax.net.ssl.SSLSocketFactory r2 = com.chartboost.sdk.impl.d2.a()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4c
                r3.setSSLSocketFactory(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4c
                r2 = 0
                r3.setInstanceFollowRedirects(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4c
                r2 = 10000(0x2710, float:1.4013E-41)
                r3.setConnectTimeout(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4c
                r3.setReadTimeout(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4c
                java.lang.String r2 = "Location"
                java.lang.String r2 = r3.getHeaderField(r2)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L4c
                if (r2 == 0) goto L48
                r1 = r2
                goto L48
            L39:
                r2 = move-exception
                goto L41
            L3b:
                r1 = move-exception
                goto L4e
            L3d:
                r3 = move-exception
                r5 = r3
                r3 = r2
                r2 = r5
            L41:
                java.lang.String r4 = "Exception raised while opening a HTTPS Connection"
                com.chartboost.sdk.impl.f6.a(r0, r4, r2)     // Catch: java.lang.Throwable -> L4c
                if (r3 == 0) goto L54
            L48:
                r3.disconnect()     // Catch: java.lang.Exception -> L58
                goto L54
            L4c:
                r1 = move-exception
                r2 = r3
            L4e:
                if (r2 == 0) goto L53
                r2.disconnect()     // Catch: java.lang.Exception -> L58
            L53:
                throw r1     // Catch: java.lang.Exception -> L58
            L54:
                r6.a(r1)     // Catch: java.lang.Exception -> L58
                goto L5e
            L58:
                r1 = move-exception
                java.lang.String r2 = "open followTask: "
                defpackage.p71.z(r2, r1, r0)
            L5e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.chartboost.sdk.impl.f2.a.run():void");
        }

        public final void a(String str) {
            f2.this.c.post(new vu3(1, str, this, this.f813b, this.c));
        }

        public /* synthetic */ void a(Context context, q5 q5Var, String str) {
            try {
                f2.this.c(context, q5Var, str);
            } catch (Exception e) {
                p71.z("open openOnUiThread Runnable.run: ", e, "CBURLOpener");
            }
        }
    }

    public f2(Executor executor, a2 a2Var, Handler handler) {
        this.f810a = executor;
        this.f811b = a2Var;
        this.c = handler;
    }

    public void a(q5 q5Var, boolean z, String str, CBError.CBClickError cBClickError) {
        if (q5Var == null) {
            f6.b("CBURLOpener", "Impression is null on urlOpenAttempted");
            return;
        }
        q5Var.a(false);
        if (!z) {
            q5Var.a(str, cBClickError);
        } else {
            q5Var.c();
        }
    }

    public CBError.CBClickError b(Context context, q5 q5Var, String str) {
        try {
            String scheme = new URI(str).getScheme();
            if (scheme == null) {
                CBError.CBClickError cBClickError = CBError.CBClickError.URI_INVALID;
                a(q5Var, false, str, cBClickError);
                return cBClickError;
            }
            if (!scheme.equals("http") && !scheme.equals("https")) {
                return c(context, q5Var, str);
            }
            this.f810a.execute(new a(str, context, q5Var));
            return null;
        } catch (URISyntaxException unused) {
            CBError.CBClickError cBClickError2 = CBError.CBClickError.URI_INVALID;
            a(q5Var, false, str, cBClickError2);
            return cBClickError2;
        }
    }

    public CBError.CBClickError c(Context context, q5 q5Var, String str) {
        if (context == null) {
            CBError.CBClickError cBClickError = CBError.CBClickError.NO_HOST_ACTIVITY;
            a(q5Var, false, str, cBClickError);
            return cBClickError;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            context.startActivity(intent);
        } catch (Exception unused) {
            if (str.startsWith("market://")) {
                try {
                    str = "https://market.android.com/" + str.substring(9);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    if (!(context instanceof Activity)) {
                        intent2.addFlags(268435456);
                    }
                    intent2.setData(Uri.parse(str));
                    context.startActivity(intent2);
                } catch (Exception e) {
                    f6.a("CBURLOpener", "Exception raised openeing an inavld playstore URL", e);
                    CBError.CBClickError cBClickError2 = CBError.CBClickError.URI_UNRECOGNIZED;
                    a(q5Var, false, str, cBClickError2);
                    return cBClickError2;
                }
            } else {
                CBError.CBClickError cBClickError3 = CBError.CBClickError.URI_UNRECOGNIZED;
                a(q5Var, false, str, cBClickError3);
                return cBClickError3;
            }
        }
        a(q5Var, true, str, null);
        return null;
    }

    public boolean a(Context context, String str) {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            intent.setData(Uri.parse(str));
            return context.getPackageManager().queryIntentActivities(intent, 65536).size() > 0;
        } catch (Exception e) {
            f6.a("CBURLOpener", "Cannot open URL", e);
            return false;
        }
    }

    public CBError.CBClickError a(Context context, q5 q5Var, String str) {
        return b(context, q5Var, str);
    }
}
