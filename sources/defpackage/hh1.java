package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class hh1 extends d90 {
    public bf0 e;
    public ih1 f;
    public LinkedHashMap g;
    public String h;
    public /* synthetic */ Object i;
    public final /* synthetic */ ih1 j;
    public int k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh1(ih1 ih1Var, c90 c90Var) {
        super(c90Var);
        this.j = ih1Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.i = obj;
        this.k |= Integer.MIN_VALUE;
        return ih1.a(this.j, null, this);
    }
}
