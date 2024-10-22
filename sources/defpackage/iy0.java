package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class iy0 extends d90 {
    public Map e;
    public Iterator f;
    public hr2 g;
    public hy1 h;
    public Map i;
    public Object j;
    public /* synthetic */ Object k;
    public final /* synthetic */ jy0 l;
    public int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iy0(jy0 jy0Var, c90 c90Var) {
        super(c90Var);
        this.l = jy0Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.k = obj;
        this.m |= Integer.MIN_VALUE;
        return this.l.b(this);
    }
}
