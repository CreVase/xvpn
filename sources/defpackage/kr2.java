package defpackage;

/* loaded from: classes2.dex */
public final class kr2 extends d90 {
    public lr2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ lr2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kr2(lr2 lr2Var, c90 c90Var) {
        super(c90Var);
        this.g = lr2Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(this);
    }
}
