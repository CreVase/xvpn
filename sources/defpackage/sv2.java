package defpackage;

/* loaded from: classes.dex */
public final class sv2 extends d90 {
    public yv2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ yv2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sv2(yv2 yv2Var, c90 c90Var) {
        super(c90Var);
        this.g = yv2Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.f(this);
    }
}
