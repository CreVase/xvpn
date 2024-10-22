package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class nb1 extends eo implements Serializable {
    public final transient kb1 d;
    public final transient int e;

    public nb1(oi2 oi2Var, int i) {
        this.d = oi2Var;
        this.e = i;
    }

    @Override // defpackage.wx1
    public final Map a() {
        return this.d;
    }

    @Override // defpackage.k1
    public final boolean c(Object obj) {
        if (obj != null && super.c(obj)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.wx1
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.k1
    public final Map d() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.k1
    public final Set e() {
        throw new AssertionError("unreachable");
    }

    @Override // defpackage.k1
    public final Iterator f() {
        return new lb1(this);
    }

    @Override // defpackage.k1
    public final Iterator g() {
        return new mb1(this);
    }

    @Override // defpackage.k1, defpackage.wx1
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.wx1
    public final int size() {
        return this.e;
    }
}
