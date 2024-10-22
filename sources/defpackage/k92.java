package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* loaded from: classes.dex */
public abstract class k92 {

    /* renamed from: a, reason: collision with root package name */
    public static final xj2 f2911a = new xj2();

    /* renamed from: b, reason: collision with root package name */
    public static final Object f2912b = new Object();
    public static d5 c = null;

    public static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        if (Build.VERSION.SDK_INT >= 33) {
            return i92.a(packageManager, context).lastUpdateTime;
        }
        return packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    public static d5 b(int i, boolean z, boolean z2) {
        d5 d5Var = new d5();
        c = d5Var;
        f2911a.h(d5Var);
        return c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:24|25|26|(2:63|64)(1:28)|29|(8:36|(1:40)|(1:47)|48|(2:55|56)|52|53|54)|(1:62)|(1:40)|(3:42|45|47)|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00cb, code lost:            r3 = 196608;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x009c, code lost:            r3 = 1;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void c(android.content.Context r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k92.c(android.content.Context, boolean):void");
    }
}
