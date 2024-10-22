package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class ov2 extends d90 {
    public yv2 e;
    public Object f;
    public Serializable g;
    public Object h;
    public qv2 i;
    public Iterator j;
    public /* synthetic */ Object k;
    public final /* synthetic */ yv2 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov2(yv2 yv2Var, c90 c90Var) {
        super(c90Var);
        this.l = yv2Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.d(this);
    }
}
