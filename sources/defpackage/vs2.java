package defpackage;

/* loaded from: classes2.dex */
public final class vs2 extends d90 {
    public ws2 e;
    public iz0 f;
    public xs2 g;
    public df1 h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ws2 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs2(ws2 ws2Var, c90 c90Var) {
        super(c90Var);
        this.j = ws2Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return ws2.i(this.j, null, this);
    }
}
