package defpackage;

/* loaded from: classes2.dex */
public final class pz0 extends d90 {
    public qz0 e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ qz0 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pz0(qz0 qz0Var, c90 c90Var) {
        super(c90Var);
        this.h = qz0Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.b(null, this);
    }
}
