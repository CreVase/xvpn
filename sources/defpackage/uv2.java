package defpackage;

/* loaded from: classes.dex */
public final class uv2 extends d90 {
    public Object e;
    public Object f;
    public /* synthetic */ Object g;
    public final /* synthetic */ yv2 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uv2(yv2 yv2Var, c90 c90Var) {
        super(c90Var);
        this.h = yv2Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return this.h.h(this);
    }
}
