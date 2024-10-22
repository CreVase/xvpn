package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class fy1 extends e72 {

    /* renamed from: a, reason: collision with root package name */
    public final Map f2175a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f2176b;

    public /* synthetic */ fy1(boolean z) {
        this(new LinkedHashMap(), z);
    }

    public final void a() {
        if (!this.f2176b.get()) {
        } else {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public final void b(c72 c72Var, Object obj) {
        a();
        Map map = this.f2175a;
        if (obj == null) {
            a();
            map.remove(c72Var);
        } else if (obj instanceof Set) {
            map.put(c72Var, Collections.unmodifiableSet(d20.S0((Iterable) obj)));
        } else {
            map.put(c72Var, obj);
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fy1) {
            return m20.L(this.f2175a, ((fy1) obj).f2175a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2175a.hashCode();
    }

    public final String toString() {
        return d20.K0(this.f2175a.entrySet(), ",\n", "{\n", "\n}", y62.h, 24);
    }

    public fy1(Map map, boolean z) {
        this.f2175a = map;
        this.f2176b = new AtomicBoolean(z);
    }
}
