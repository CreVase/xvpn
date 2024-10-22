package defpackage;

/* loaded from: classes2.dex */
public abstract class qf1 {
    public static final pf1 d = new pf1();

    /* renamed from: a, reason: collision with root package name */
    public final wf1 f3989a;

    /* renamed from: b, reason: collision with root package name */
    public final d5 f3990b;
    public final ia0 c = new ia0(11);

    public qf1(wf1 wf1Var, d5 d5Var) {
        this.f3989a = wf1Var;
        this.f3990b = d5Var;
    }

    public final Object a(uh1 uh1Var, String str) {
        z13 z13Var = new z13(str);
        Object h = new u13(this, 1, z13Var, uh1Var.getDescriptor(), null).h(uh1Var);
        if (z13Var.f() == 10) {
            return h;
        }
        z13.n(z13Var, "Expected EOF after parsing, but had " + z13Var.e.charAt(z13Var.f5416a - 1) + " instead", 0, null, 6);
        throw null;
    }

    public final String b(uh1 uh1Var, Object obj) {
        c40 c40Var;
        ah1 ah1Var = new ah1();
        try {
            jg1[] jg1VarArr = new jg1[hx2.C(4).length];
            if (this.f3989a.e) {
                c40Var = new e40(ah1Var, this);
            } else {
                c40Var = new c40(ah1Var);
            }
            new v13(c40Var, this, 1, jg1VarArr).g(uh1Var, obj);
            String ah1Var2 = ah1Var.toString();
            ah1Var.b();
            return ah1Var2;
        } catch (Throwable th) {
            sw swVar = sw.f4422a;
            char[] cArr = ah1Var.f86a;
            synchronized (swVar) {
                int i = sw.c;
                if (cArr.length + i < sw.d) {
                    sw.c = i + cArr.length;
                    sw.f4423b.c(cArr);
                }
                throw th;
            }
        }
    }
}
