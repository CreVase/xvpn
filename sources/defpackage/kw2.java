package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class kw2 extends uw2 {
    final /* synthetic */ vw2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private kw2(vw2 vw2Var) {
        super(vw2Var, null);
        this.this$0 = vw2Var;
    }

    @Override // defpackage.uw2, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<Comparable<Object>, Object>> iterator() {
        return new jw2(this.this$0, null);
    }

    public /* synthetic */ kw2(vw2 vw2Var, hw2 hw2Var) {
        this(vw2Var);
    }
}
