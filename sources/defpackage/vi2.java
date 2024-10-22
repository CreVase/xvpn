package defpackage;

/* loaded from: classes2.dex */
public final class vi2 extends d90 {
    public Object e;
    public hy1 f;
    public /* synthetic */ Object g;
    public final /* synthetic */ yi2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vi2(yi2 yi2Var, c90 c90Var) {
        super(c90Var);
        this.h = yi2Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.a(this);
    }
}
