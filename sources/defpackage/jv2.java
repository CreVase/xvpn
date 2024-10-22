package defpackage;

/* loaded from: classes.dex */
public final class jv2 extends d90 {
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ kv2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv2(kv2 kv2Var, c90 c90Var) {
        super(c90Var);
        this.g = kv2Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
