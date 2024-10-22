package defpackage;

/* loaded from: classes.dex */
public final class pv2 extends d90 {
    public Object e;
    public Object f;
    public Object g;
    public ei2 h;
    public yv2 i;
    public /* synthetic */ Object j;
    public final /* synthetic */ qv2 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv2(qv2 qv2Var, c90 c90Var) {
        super(c90Var);
        this.k = qv2Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
