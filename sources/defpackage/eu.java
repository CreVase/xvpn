package defpackage;

/* loaded from: classes2.dex */
public final class eu extends d90 {
    public y82 e;
    public /* synthetic */ Object f;
    public final /* synthetic */ fu g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eu(fu fuVar, c90 c90Var) {
        super(c90Var);
        this.g = fuVar;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
