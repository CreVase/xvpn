package defpackage;

/* loaded from: classes2.dex */
public final class y extends d90 {
    public bm2 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ lv2 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(lv2 lv2Var, c90 c90Var) {
        super(c90Var);
        this.g = lv2Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.a(null, this);
    }
}
