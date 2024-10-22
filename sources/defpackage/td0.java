package defpackage;

import java.io.Serializable;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class td0 extends d90 {
    public Serializable e;
    public Iterator f;
    public /* synthetic */ Object g;
    public final /* synthetic */ d5 h;
    public int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public td0(d5 d5Var, c90 c90Var) {
        super(c90Var);
        this.h = d5Var;
    }

    @Override // defpackage.mn
    public final Object invokeSuspend(Object obj) {
        this.g = obj;
        this.i |= Integer.MIN_VALUE;
        return d5.o(this.h, null, null, this);
    }
}
