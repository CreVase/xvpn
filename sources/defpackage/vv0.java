package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class vv0 extends jm2 {
    public final HashMap e = new HashMap();

    @Override // defpackage.jm2
    public final fm2 b(Object obj) {
        return (fm2) this.e.get(obj);
    }

    @Override // defpackage.jm2
    public final Object c(Object obj, Object obj2) {
        fm2 b2 = b(obj);
        if (b2 != null) {
            return b2.f2120b;
        }
        HashMap hashMap = this.e;
        fm2 fm2Var = new fm2(obj, obj2);
        this.d++;
        fm2 fm2Var2 = this.f2793b;
        if (fm2Var2 == null) {
            this.f2792a = fm2Var;
            this.f2793b = fm2Var;
        } else {
            fm2Var2.c = fm2Var;
            fm2Var.d = fm2Var2;
            this.f2793b = fm2Var;
        }
        hashMap.put(obj, fm2Var);
        return null;
    }

    @Override // defpackage.jm2
    public final Object e(Object obj) {
        Object e = super.e(obj);
        this.e.remove(obj);
        return e;
    }
}
