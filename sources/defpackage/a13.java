package defpackage;

/* loaded from: classes2.dex */
public final class a13 extends d90 {
    public b13 e;
    public iz0 f;
    public c13 g;
    public df1 h;
    public Object i;
    public /* synthetic */ Object j;
    public final /* synthetic */ b13 k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a13(b13 b13Var, c90 c90Var) {
        super(c90Var);
        this.k = b13Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.k.a(null, this);
    }
}
