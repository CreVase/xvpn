package defpackage;

/* loaded from: classes2.dex */
public final class xr2 extends d90 {
    public /* synthetic */ Object e;
    public final /* synthetic */ zr2 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xr2(zr2 zr2Var, c90 c90Var) {
        super(c90Var);
        this.f = zr2Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.c(null, null, this);
    }
}
