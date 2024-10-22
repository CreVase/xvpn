package defpackage;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class eq1 extends u {

    /* renamed from: a, reason: collision with root package name */
    public final uh1 f1974a;

    /* renamed from: b, reason: collision with root package name */
    public final uh1 f1975b;

    public eq1(uh1 uh1Var, uh1 uh1Var2) {
        this.f1974a = uh1Var;
        this.f1975b = uh1Var2;
    }

    @Override // defpackage.u
    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final void f(f40 f40Var, int i, Map map, boolean z) {
        int i2;
        Object t;
        l71 l71Var = ((m71) this).d;
        Object t2 = f40Var.t(l71Var, i, this.f1974a, null);
        boolean z2 = true;
        if (z) {
            i2 = f40Var.j(l71Var);
            if (i2 != i + 1) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(hx2.n("Value must follow key in a map, index for key: ", i, ", returned index for value: ", i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        boolean containsKey = map.containsKey(t2);
        uh1 uh1Var = this.f1975b;
        if (containsKey && !(uh1Var.getDescriptor().getKind() instanceof t72)) {
            t = f40Var.t(l71Var, i2, uh1Var, jq1.l0(map, t2));
        } else {
            t = f40Var.t(l71Var, i2, uh1Var, null);
        }
        map.put(t2, t);
    }

    @Override // defpackage.uh1
    public final void serialize(ir0 ir0Var, Object obj) {
        d(obj);
        l71 l71Var = ((m71) this).d;
        g40 q = ir0Var.q(l71Var);
        Iterator c = c(obj);
        int i = 0;
        while (c.hasNext()) {
            Map.Entry entry = (Map.Entry) c.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            q.p(l71Var, i, this.f1974a, key);
            i = i2 + 1;
            q.p(l71Var, i2, this.f1975b, value);
        }
        q.a(l71Var);
    }
}
