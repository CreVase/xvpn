package defpackage;

/* loaded from: classes2.dex */
public final class vp1 extends ai1 {
    public final /* synthetic */ int c;
    public final op2 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vp1(uh1 uh1Var, uh1 uh1Var2, int i) {
        super(uh1Var, uh1Var2);
        this.c = i;
        if (i != 1) {
            this.d = t9.q("kotlin.collections.Map.Entry", o23.c, new mp2[0], new up1(uh1Var, uh1Var2, 0));
        } else {
            super(uh1Var, uh1Var2);
            this.d = t9.p("kotlin.Pair", new mp2[0], new up1(uh1Var, uh1Var2, 1));
        }
    }

    @Override // defpackage.sk0
    public final mp2 getDescriptor() {
        return this.d;
    }
}
