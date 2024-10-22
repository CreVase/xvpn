package defpackage;

/* loaded from: classes2.dex */
public final class db1 extends h0 {
    public final hb1 c;

    public db1(int i, hb1 hb1Var) {
        super(hb1Var.size(), i);
        this.c = hb1Var;
    }

    @Override // defpackage.h0
    public final Object b(int i) {
        return this.c.get(i);
    }
}
