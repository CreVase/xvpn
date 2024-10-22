package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class mg1 implements uh1 {

    /* renamed from: a, reason: collision with root package name */
    public static final mg1 f3290a = new mg1();

    /* renamed from: b, reason: collision with root package name */
    public static final w72 f3291b;

    static {
        s72 s72Var = s72.i;
        if (!i23.b1("kotlinx.serialization.json.JsonLiteral")) {
            Iterator it = x72.f5126a.keySet().iterator();
            while (it.hasNext()) {
                String a2 = x72.a(((j00) ((mh1) it.next())).b());
                if (i23.U0("kotlinx.serialization.json.JsonLiteral", "kotlin." + a2) || i23.U0("kotlinx.serialization.json.JsonLiteral", a2)) {
                    throw new IllegalArgumentException(t9.F0("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name kotlinx.serialization.json.JsonLiteral there already exist " + x72.a(a2) + "Serializer.\n                Please refer to SerialDescriptor documentation for additional information.\n            "));
                }
            }
            f3291b = new w72("kotlinx.serialization.json.JsonLiteral", s72Var);
            return;
        }
        throw new IllegalArgumentException("Blank serial names are prohibited".toString());
    }

    @Override // defpackage.sk0
    public final Object deserialize(qe0 qe0Var) {
        eg1 m = pd0.h(qe0Var).m();
        if (m instanceof lg1) {
            return (lg1) m;
        }
        throw t9.f(-1, "Unexpected JSON element, expected JsonLiteral, had " + gi2.a(m.getClass()), m.toString());
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return f3291b;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // defpackage.uh1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void serialize(defpackage.ir0 r4, java.lang.Object r5) {
        /*
            r3 = this;
            lg1 r5 = (defpackage.lg1) r5
            defpackage.pd0.i(r4)
            java.lang.String r0 = r5.f3121b
            boolean r1 = r5.f3120a
            if (r1 == 0) goto Lf
            r4.F(r0)
            goto L5e
        Lf:
            java.lang.Long r1 = defpackage.g23.Q0(r0)
            if (r1 == 0) goto L1d
            long r0 = r1.longValue()
            r4.B(r0)
            goto L5e
        L1d:
            jg3 r1 = defpackage.t9.E0(r0)
            if (r1 == 0) goto L2f
            ic1 r5 = defpackage.ng3.f3456b
            ir0 r4 = r4.m(r5)
            long r0 = r1.f2763a
            r4.B(r0)
            goto L5e
        L2f:
            java.lang.String r1 = r5.f3121b
            ii2 r2 = defpackage.un2.f4704a     // Catch: java.lang.NumberFormatException -> L42
            boolean r2 = r2.a(r1)     // Catch: java.lang.NumberFormatException -> L42
            if (r2 == 0) goto L42
            double r1 = java.lang.Double.parseDouble(r1)     // Catch: java.lang.NumberFormatException -> L42
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L42
            goto L43
        L42:
            r1 = 0
        L43:
            if (r1 == 0) goto L4d
            double r0 = r1.doubleValue()
            r4.h(r0)
            goto L5e
        L4d:
            java.lang.Boolean r5 = defpackage.zf3.t(r5)
            if (r5 == 0) goto L5b
            boolean r5 = r5.booleanValue()
            r4.l(r5)
            goto L5e
        L5b:
            r4.F(r0)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mg1.serialize(ir0, java.lang.Object):void");
    }
}
