package defpackage;

/* loaded from: classes2.dex */
public final class mz0 extends d90 {
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ nz0 g;
    public Object h;
    public iz0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mz0(nz0 nz0Var, c90 c90Var) {
        super(c90Var);
        this.g = nz0Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
