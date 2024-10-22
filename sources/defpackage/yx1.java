package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class yx1 extends bx3 {
    public final /* synthetic */ Comparator l;

    public yx1(xy1 xy1Var) {
        this.l = xy1Var;
    }

    @Override // defpackage.bx3
    public final Map r() {
        return new TreeMap(this.l);
    }
}
