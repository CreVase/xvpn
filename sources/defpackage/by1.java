package defpackage;

import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.SortedMap;

/* loaded from: classes2.dex */
public final class by1 extends p0 {
    public final transient g33 f;

    public by1(Map map, zx1 zx1Var) {
        super(map);
        this.f = zx1Var;
    }

    @Override // defpackage.k1
    public final Map d() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new w0(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new z0(this, (SortedMap) map);
        }
        return new t0(this, map);
    }

    @Override // defpackage.k1
    public final Set e() {
        Map map = this.d;
        if (map instanceof NavigableMap) {
            return new x0(this, (NavigableMap) map);
        }
        if (map instanceof SortedMap) {
            return new a1(this, (SortedMap) map);
        }
        return new v0(this, map);
    }
}
