package defpackage;

/* loaded from: classes2.dex */
public final class zg3 extends tn2 {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public zg3(defpackage.c90 r3, defpackage.t90 r4) {
        /*
            r2 = this;
            ah3 r0 = defpackage.ah3.f90a
            r90 r1 = r4.get(r0)
            if (r1 != 0) goto Ld
            t90 r0 = r4.plus(r0)
            goto Le
        Ld:
            r0 = r4
        Le:
            r2.<init>(r3, r0)
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.e = r0
            t90 r3 = r3.getContext()
            d5 r0 = defpackage.d5.f1730b
            r90 r3 = r3.get(r0)
            boolean r3 = r3 instanceof defpackage.v90
            if (r3 != 0) goto L31
            r3 = 0
            java.lang.Object r3 = defpackage.zf3.o0(r4, r3)
            defpackage.zf3.e0(r4, r3)
            r2.a0(r4, r3)
        L31:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg3.<init>(c90, t90):void");
    }

    public final boolean Z() {
        boolean z;
        if (this.threadLocalIsSet && this.e.get() == null) {
            z = true;
        } else {
            z = false;
        }
        this.e.remove();
        return !z;
    }

    public final void a0(t90 t90Var, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new n42(t90Var, obj));
    }

    @Override // defpackage.tn2, defpackage.nf1
    public final void p(Object obj) {
        if (this.threadLocalIsSet) {
            n42 n42Var = (n42) this.e.get();
            if (n42Var != null) {
                zf3.e0((t90) n42Var.f3395a, n42Var.f3396b);
            }
            this.e.remove();
        }
        Object e0 = t9.e0(obj);
        c90 c90Var = this.d;
        t90 context = c90Var.getContext();
        zg3 zg3Var = null;
        Object o0 = zf3.o0(context, null);
        if (o0 != zf3.g) {
            zg3Var = t9.K0(c90Var, context, o0);
        }
        try {
            this.d.resumeWith(e0);
        } finally {
            if (zg3Var == null || zg3Var.Z()) {
                zf3.e0(context, o0);
            }
        }
    }
}
