package defpackage;

/* loaded from: classes.dex */
public final class nv2 extends d90 {
    public Object e;
    public yv2 f;
    public z20 g;
    public /* synthetic */ Object h;
    public final /* synthetic */ yv2 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv2(yv2 yv2Var, c90 c90Var) {
        super(c90Var);
        this.i = yv2Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return yv2.b(this.i, null, this);
    }
}
