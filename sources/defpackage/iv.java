package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class iv implements yb3 {

    /* renamed from: a, reason: collision with root package name */
    public final ia0 f2652a;

    /* renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f2653b;
    public final Context c;
    public final URL d;
    public final g10 e;
    public final g10 f;
    public final int g;

    public iv(Context context, g10 g10Var, g10 g10Var2) {
        ag1 ag1Var = new ag1();
        d5.f1729a.s(ag1Var);
        ag1Var.d = true;
        this.f2652a = new ia0(ag1Var);
        this.c = context;
        this.f2653b = (ConnectivityManager) context.getSystemService("connectivity");
        String str = ft.c;
        try {
            this.d = new URL(str);
            this.e = g10Var2;
            this.f = g10Var;
            this.g = 130000;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(hx2.p("Invalid url: ", str), e);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(1:3)(1:22)|4|(1:6)(7:17|(1:19)(1:20)|8|9|10|11|12)|7|8|9|10|11|12) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00eb, code lost:            r0 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00ec, code lost:            defpackage.pe0.o("CctTransportBackend", "Unable to find version code for package", r0);     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009e, code lost:            if (((defpackage.mz1) defpackage.mz1.f3377a.get(r0)) != null) goto L16;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.pl a(defpackage.pl r6) {
        /*
            r5 = this;
            android.net.ConnectivityManager r0 = r5.f2653b
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            jx0 r6 = r6.c()
            int r1 = android.os.Build.VERSION.SDK_INT
            java.util.Map r2 = r6.l()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r3 = "sdk-version"
            r2.put(r3, r1)
            java.lang.String r1 = "model"
            java.lang.String r2 = android.os.Build.MODEL
            r6.d(r1, r2)
            java.lang.String r1 = "hardware"
            java.lang.String r2 = android.os.Build.HARDWARE
            r6.d(r1, r2)
            java.lang.String r1 = "device"
            java.lang.String r2 = android.os.Build.DEVICE
            r6.d(r1, r2)
            java.lang.String r1 = "product"
            java.lang.String r2 = android.os.Build.PRODUCT
            r6.d(r1, r2)
            java.lang.String r1 = "os-uild"
            java.lang.String r2 = android.os.Build.ID
            r6.d(r1, r2)
            java.lang.String r1 = "manufacturer"
            java.lang.String r2 = android.os.Build.MANUFACTURER
            r6.d(r1, r2)
            java.lang.String r1 = "fingerprint"
            java.lang.String r2 = android.os.Build.FINGERPRINT
            r6.d(r1, r2)
            java.util.Calendar.getInstance()
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            long r2 = r2.getTimeInMillis()
            int r1 = r1.getOffset(r2)
            int r1 = r1 / 1000
            long r1 = (long) r1
            java.util.Map r3 = r6.l()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "tz-offset"
            r3.put(r2, r1)
            r1 = -1
            if (r0 != 0) goto L74
            android.util.SparseArray r2 = defpackage.nz1.f3568a
            r2 = -1
            goto L78
        L74:
            int r2 = r0.getType()
        L78:
            java.util.Map r3 = r6.l()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r4 = "net-type"
            r3.put(r4, r2)
            r2 = 0
            if (r0 != 0) goto L8b
            android.util.SparseArray r0 = defpackage.mz1.f3377a
            goto La1
        L8b:
            int r0 = r0.getSubtype()
            if (r0 != r1) goto L96
            android.util.SparseArray r0 = defpackage.mz1.f3377a
            r0 = 100
            goto La2
        L96:
            android.util.SparseArray r3 = defpackage.mz1.f3377a
            java.lang.Object r3 = r3.get(r0)
            mz1 r3 = (defpackage.mz1) r3
            if (r3 == 0) goto La1
            goto La2
        La1:
            r0 = 0
        La2:
            java.util.Map r3 = r6.l()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r4 = "mobile-subtype"
            r3.put(r4, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getCountry()
            java.lang.String r3 = "country"
            r6.d(r3, r0)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r0 = r0.getLanguage()
            java.lang.String r3 = "locale"
            r6.d(r3, r0)
            android.content.Context r0 = r5.c
            java.lang.String r3 = "phone"
            java.lang.Object r3 = r0.getSystemService(r3)
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3
            java.lang.String r3 = r3.getSimOperator()
            java.lang.String r4 = "mcc_mnc"
            r6.d(r4, r3)
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Leb
            java.lang.String r0 = r0.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Leb
            android.content.pm.PackageInfo r0 = r3.getPackageInfo(r0, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Leb
            int r1 = r0.versionCode     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Leb
            goto Lf3
        Leb:
            r0 = move-exception
            java.lang.String r2 = "CctTransportBackend"
            java.lang.String r3 = "Unable to find version code for package"
            defpackage.pe0.o(r2, r3, r0)
        Lf3:
            java.lang.String r0 = java.lang.Integer.toString(r1)
            java.lang.String r1 = "application_build"
            r6.d(r1, r0)
            pl r6 = r6.g()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iv.a(pl):pl");
    }
}
