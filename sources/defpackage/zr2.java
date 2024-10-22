package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class zr2 {
    public static final c72 c = new c72("firebase_sessions_enabled");
    public static final c72 d = new c72("firebase_sessions_sampling_rate");
    public static final c72 e = new c72("firebase_sessions_restart_timeout");
    public static final c72 f = new c72("firebase_sessions_cache_duration");
    public static final c72 g = new c72("firebase_sessions_cache_updated_time");

    /* renamed from: a, reason: collision with root package name */
    public final de0 f5537a;

    /* renamed from: b, reason: collision with root package name */
    public xq2 f5538b;

    public zr2(x62 x62Var) {
        this.f5537a = x62Var;
        zf3.f0(zq0.f5530a, new wr2(this, null));
    }

    public static final void a(zr2 zr2Var, fy1 fy1Var) {
        zr2Var.getClass();
        Boolean bool = (Boolean) fy1Var.f2175a.get(c);
        c72 c72Var = d;
        Map map = fy1Var.f2175a;
        zr2Var.f5538b = new xq2(bool, (Double) map.get(c72Var), (Integer) map.get(e), (Integer) map.get(f), (Long) map.get(g));
    }

    public final boolean b() {
        xq2 xq2Var;
        xq2 xq2Var2 = this.f5538b;
        if (xq2Var2 == null) {
            xq2Var = null;
        } else {
            xq2Var = xq2Var2;
        }
        Long l = xq2Var.e;
        if (xq2Var2 == null) {
            xq2Var2 = null;
        }
        Integer num = xq2Var2.d;
        if (l != null && num != null && (System.currentTimeMillis() - l.longValue()) / 1000 < num.intValue()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|24|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:            r6 = move-exception;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:            r6.toString();     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.c72 r6, java.lang.Object r7, defpackage.c90 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.xr2
            if (r0 == 0) goto L13
            r0 = r8
            xr2 r0 = (defpackage.xr2) r0
            int r1 = r0.g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g = r1
            goto L18
        L13:
            xr2 r0 = new xr2
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.e
            ba0 r1 = defpackage.ba0.f430a
            int r2 = r0.g
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.fl.a0(r8)     // Catch: java.io.IOException -> L48
            goto L4c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            defpackage.fl.a0(r8)
            de0 r8 = r5.f5537a     // Catch: java.io.IOException -> L48
            yr2 r2 = new yr2     // Catch: java.io.IOException -> L48
            r4 = 0
            r2.<init>(r6, r5, r7, r4)     // Catch: java.io.IOException -> L48
            r0.g = r3     // Catch: java.io.IOException -> L48
            f72 r6 = new f72     // Catch: java.io.IOException -> L48
            r6.<init>(r2, r4)     // Catch: java.io.IOException -> L48
            java.lang.Object r6 = r8.a(r6, r0)     // Catch: java.io.IOException -> L48
            if (r6 != r1) goto L4c
            return r1
        L48:
            r6 = move-exception
            r6.toString()
        L4c:
            ch3 r6 = defpackage.ch3.f636a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr2.c(c72, java.lang.Object, c90):java.lang.Object");
    }
}
