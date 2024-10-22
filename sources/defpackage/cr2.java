package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class cr2 {

    /* renamed from: a, reason: collision with root package name */
    public static final ia0 f1662a;

    static {
        ag1 ag1Var = new ag1();
        ag1Var.a(br2.class, fk.f2101a);
        ag1Var.a(er2.class, gk.f2263a);
        ag1Var.a(rd0.class, ek.f1945a);
        ag1Var.a(vf.class, dk.f1795a);
        ag1Var.a(ab.class, ck.f653a);
        ag1Var.d = true;
        f1662a = new ia0(ag1Var);
    }

    public static vf a(px0 px0Var) {
        String valueOf;
        long longVersionCode;
        px0Var.a();
        Context context = px0Var.f3931a;
        String packageName = context.getPackageName();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = packageInfo.getLongVersionCode();
            valueOf = String.valueOf(longVersionCode);
        } else {
            valueOf = String.valueOf(packageInfo.versionCode);
        }
        px0Var.a();
        String str = px0Var.c.f1862b;
        String str2 = Build.MODEL;
        String str3 = Build.VERSION.RELEASE;
        String str4 = packageInfo.versionName;
        if (str4 == null) {
            str4 = valueOf;
        }
        return new vf(str, str2, str3, new ab(packageName, str4, valueOf, Build.MANUFACTURER));
    }

    public static br2 b(px0 px0Var, ar2 ar2Var, lr2 lr2Var, Map map) {
        qd0 qd0Var;
        String str = ar2Var.f324a;
        String str2 = ar2Var.f325b;
        int i = ar2Var.c;
        long j = ar2Var.d;
        ha0 ha0Var = (ha0) map.get(hr2.PERFORMANCE);
        qd0 qd0Var2 = qd0.COLLECTION_ENABLED;
        qd0 qd0Var3 = qd0.COLLECTION_DISABLED;
        qd0 qd0Var4 = qd0.COLLECTION_SDK_NOT_INSTALLED;
        if (ha0Var == null) {
            qd0Var = qd0Var4;
        } else if (ha0Var.f2388a.b()) {
            qd0Var = qd0Var2;
        } else {
            qd0Var = qd0Var3;
        }
        ha0 ha0Var2 = (ha0) map.get(hr2.CRASHLYTICS);
        if (ha0Var2 == null) {
            qd0Var2 = qd0Var4;
        } else if (!ha0Var2.f2388a.b()) {
            qd0Var2 = qd0Var3;
        }
        return new br2(new er2(str, str2, i, j, new rd0(qd0Var, qd0Var2, lr2Var.a())), a(px0Var));
    }
}
