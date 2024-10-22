package defpackage;

import java.util.ArrayList;

/* loaded from: classes2.dex */
public abstract class mw implements gz0 {

    /* renamed from: a, reason: collision with root package name */
    public final t90 f3362a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3363b;
    public final int c;
    public final l41 d;

    public mw(in inVar, t90 t90Var, int i, int i2) {
        this.f3362a = t90Var;
        this.f3363b = i;
        this.c = i2;
        this.d = inVar;
    }

    @Override // defpackage.gz0
    public final Object a(iz0 iz0Var, c90 c90Var) {
        kw kwVar = new kw(null, this, iz0Var);
        tn2 tn2Var = new tn2(c90Var, c90Var.getContext());
        Object N = pd0.N(tn2Var, tn2Var, kwVar);
        if (N != ba0.f430a) {
            return ch3.f636a;
        }
        return N;
    }

    public abstract Object b(y82 y82Var, c90 c90Var);

    public final String c() {
        ArrayList arrayList = new ArrayList(4);
        zq0 zq0Var = zq0.f5530a;
        t90 t90Var = this.f3362a;
        if (t90Var != zq0Var) {
            arrayList.add("context=" + t90Var);
        }
        int i = this.f3363b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        int i2 = this.c;
        if (i2 != 1) {
            arrayList.add("onBufferOverflow=".concat(hx2.A(i2)));
        }
        return getClass().getSimpleName() + '[' + d20.K0(arrayList, ", ", null, null, null, 62) + ']';
    }

    public final String toString() {
        return "block[" + this.d + "] -> " + c();
    }
}
