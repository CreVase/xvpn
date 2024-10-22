package defpackage;

/* loaded from: classes.dex */
public final class ha3 extends d90 {
    public ia3 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ ia3 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ha3(ia3 ia3Var, c90 c90Var) {
        super(c90Var);
        this.g = ia3Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return ia3.O0(this.g, null, this);
    }
}
