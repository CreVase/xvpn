package defpackage;

import java.util.Map;

/* loaded from: classes2.dex */
public final class ey0 extends d90 {
    public gy0 e;
    public ar2 f;
    public Map g;
    public /* synthetic */ Object h;
    public final /* synthetic */ gy0 i;
    public int j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey0(gy0 gy0Var, c90 c90Var) {
        super(c90Var);
        this.i = gy0Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.j |= Integer.MIN_VALUE;
        return gy0.a(this.i, null, this);
    }
}
