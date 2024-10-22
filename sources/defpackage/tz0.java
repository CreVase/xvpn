package defpackage;

/* loaded from: classes2.dex */
public final class tz0 extends d90 {
    public /* synthetic */ Object e;
    public int f;
    public final /* synthetic */ g g;
    public Object h;
    public iz0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz0(g gVar, c90 c90Var) {
        super(c90Var);
        this.g = gVar;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return this.g.b(null, this);
    }
}
