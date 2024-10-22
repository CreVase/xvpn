package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class lr2 {
    public static final jr2 c = new jr2();
    public static final b72 d = new b72(y62.g, pd0.d(vl0.c.plus(new f33(null))));

    /* renamed from: a, reason: collision with root package name */
    public final cs2 f3178a;

    /* renamed from: b, reason: collision with root package name */
    public final cs2 f3179b;

    public lr2(Context context, t90 t90Var, t90 t90Var2, xx0 xx0Var, vf vfVar) {
        x62 x62Var;
        tm1 tm1Var = new tm1(context);
        aj2 aj2Var = new aj2(vfVar, t90Var);
        c.getClass();
        b72 b72Var = d;
        int i = 0;
        th1 th1Var = jr2.f2817a[0];
        b72Var.getClass();
        x62 x62Var2 = b72Var.e;
        if (x62Var2 == null) {
            synchronized (b72Var.d) {
                if (b72Var.e == null) {
                    Context applicationContext = context.getApplicationContext();
                    List list = (List) b72Var.f421b.invoke(applicationContext);
                    aa0 aa0Var = b72Var.c;
                    b72Var.e = new x62(new yv2(new z62(new a72(i, applicationContext, b72Var), i), Collections.singletonList(new sd0(list, null)), new d5(), aa0Var));
                }
                x62Var = b72Var.e;
            }
            x62Var2 = x62Var;
        }
        yi2 yi2Var = new yi2(xx0Var, vfVar, aj2Var, x62Var2);
        this.f3178a = tm1Var;
        this.f3179b = yi2Var;
    }

    public final double a() {
        boolean z;
        Double d2 = this.f3178a.d();
        boolean z2 = true;
        if (d2 != null) {
            double doubleValue = d2.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return doubleValue;
            }
        }
        Double d3 = this.f3179b.d();
        if (d3 != null) {
            double doubleValue2 = d3.doubleValue();
            if (0.0d > doubleValue2 || doubleValue2 > 1.0d) {
                z2 = false;
            }
            if (z2) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.c90 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.kr2
            if (r0 == 0) goto L13
            r0 = r6
            kr2 r0 = (defpackage.kr2) r0
            int r1 = r0.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.h = r1
            goto L18
        L13:
            kr2 r0 = new kr2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f
            ba0 r1 = defpackage.ba0.f430a
            int r2 = r0.h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            defpackage.fl.a0(r6)
            goto L57
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            lr2 r2 = r0.e
            defpackage.fl.a0(r6)
            goto L49
        L38:
            defpackage.fl.a0(r6)
            r0.e = r5
            r0.h = r4
            cs2 r6 = r5.f3178a
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            r2 = r5
        L49:
            cs2 r6 = r2.f3179b
            r2 = 0
            r0.e = r2
            r0.h = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L57
            return r1
        L57:
            ch3 r6 = defpackage.ch3.f636a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lr2.b(c90):java.lang.Object");
    }
}
