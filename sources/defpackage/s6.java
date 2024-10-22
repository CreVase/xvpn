package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public abstract class s6 {

    /* renamed from: a, reason: collision with root package name */
    public static final Class f4277a;

    /* renamed from: b, reason: collision with root package name */
    public static final Field f4278b;
    public static final Field c;
    public static final Method d;
    public static final Method e;
    public static final Method f;
    public static final Handler g = new Handler(Looper.getMainLooper());

    /* JADX WARN: Removed duplicated region for block: B:15:0x005d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[ADDED_TO_REGION] */
    static {
        /*
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r1.<init>(r2)
            defpackage.s6.g = r1
            r1 = 0
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Throwable -> L15
            goto L16
        L15:
            r2 = r1
        L16:
            defpackage.s6.f4277a = r2
            r2 = 1
            java.lang.String r3 = "mMainThread"
            java.lang.reflect.Field r3 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L23
            r3.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            goto L24
        L23:
            r3 = r1
        L24:
            defpackage.s6.f4278b = r3
            java.lang.String r3 = "mToken"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r3)     // Catch: java.lang.Throwable -> L30
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L30
            goto L32
        L30:
            r0 = r1
        L32:
            defpackage.s6.c = r0
            java.lang.Class r0 = defpackage.s6.f4277a
            r3 = 0
            r4 = 3
            java.lang.String r5 = "performStopActivity"
            r6 = 2
            java.lang.Class<android.os.IBinder> r7 = android.os.IBinder.class
            if (r0 != 0) goto L40
            goto L55
        L40:
            java.lang.Class[] r8 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L54
            r8[r3] = r7     // Catch: java.lang.Throwable -> L54
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L54
            r8[r2] = r9     // Catch: java.lang.Throwable -> L54
            java.lang.Class<java.lang.String> r9 = java.lang.String.class
            r8[r6] = r9     // Catch: java.lang.Throwable -> L54
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L54
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L54
            goto L56
        L54:
        L55:
            r0 = r1
        L56:
            defpackage.s6.d = r0
            java.lang.Class r0 = defpackage.s6.f4277a
            if (r0 != 0) goto L5d
            goto L6d
        L5d:
            java.lang.Class[] r8 = new java.lang.Class[r6]     // Catch: java.lang.Throwable -> L6d
            r8[r3] = r7     // Catch: java.lang.Throwable -> L6d
            java.lang.Class r9 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> L6d
            r8[r2] = r9     // Catch: java.lang.Throwable -> L6d
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r8)     // Catch: java.lang.Throwable -> L6d
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> L6d
            goto L6e
        L6d:
            r0 = r1
        L6e:
            defpackage.s6.e = r0
            java.lang.Class r0 = defpackage.s6.f4277a
            java.lang.Class<android.content.res.Configuration> r5 = android.content.res.Configuration.class
            java.lang.Class<java.util.List> r8 = java.util.List.class
            int r9 = android.os.Build.VERSION.SDK_INT
            r10 = 26
            if (r9 == r10) goto L83
            r10 = 27
            if (r9 != r10) goto L81
            goto L83
        L81:
            r9 = 0
            goto L84
        L83:
            r9 = 1
        L84:
            if (r9 == 0) goto Lb3
            if (r0 != 0) goto L89
            goto Lb3
        L89:
            java.lang.String r9 = "requestRelaunchActivity"
            r10 = 9
            java.lang.Class[] r10 = new java.lang.Class[r10]     // Catch: java.lang.Throwable -> Lb3
            r10[r3] = r7     // Catch: java.lang.Throwable -> Lb3
            r10[r2] = r8     // Catch: java.lang.Throwable -> Lb3
            r10[r6] = r8     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class r3 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> Lb3
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb3
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch: java.lang.Throwable -> Lb3
            r4 = 4
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb3
            r4 = 5
            r10[r4] = r5     // Catch: java.lang.Throwable -> Lb3
            r4 = 6
            r10[r4] = r5     // Catch: java.lang.Throwable -> Lb3
            r4 = 7
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb3
            r4 = 8
            r10[r4] = r3     // Catch: java.lang.Throwable -> Lb3
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r9, r10)     // Catch: java.lang.Throwable -> Lb3
            r0.setAccessible(r2)     // Catch: java.lang.Throwable -> Lb3
            r1 = r0
        Lb3:
            defpackage.s6.f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s6.<clinit>():void");
    }
}
