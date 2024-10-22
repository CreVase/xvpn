package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class bc3 {

    /* renamed from: a, reason: collision with root package name */
    public final lm f447a;

    /* renamed from: b, reason: collision with root package name */
    public final String f448b;
    public final lr0 c;
    public final jb3 d;
    public final cc3 e;

    public bc3(lm lmVar, String str, lr0 lr0Var, jb3 jb3Var, cc3 cc3Var) {
        this.f447a = lmVar;
        this.f448b = str;
        this.c = lr0Var;
        this.d = jb3Var;
        this.e = cc3Var;
    }

    public final void a(ol olVar, fc3 fc3Var) {
        lm lmVar = this.f447a;
        if (lmVar != null) {
            String str = this.f448b;
            if (str != null) {
                jb3 jb3Var = this.d;
                if (jb3Var != null) {
                    lr0 lr0Var = this.c;
                    if (lr0Var != null) {
                        dc3 dc3Var = (dc3) this.e;
                        dc3Var.getClass();
                        lm c = lmVar.c(olVar.f3686b);
                        jx0 jx0Var = new jx0(3);
                        jx0Var.f = new HashMap();
                        jx0Var.d = Long.valueOf(((gi3) dc3Var.f1758a).a());
                        jx0Var.e = Long.valueOf(((gi3) dc3Var.f1759b).a());
                        jx0Var.C(str);
                        jx0Var.z(new hr0(lr0Var, (byte[]) jb3Var.apply(olVar.f3685a)));
                        jx0Var.f2846b = null;
                        pl g = jx0Var.g();
                        ri0 ri0Var = (ri0) dc3Var.c;
                        ri0Var.getClass();
                        ri0Var.f4158b.execute(new vu3(ri0Var, c, fc3Var, g, 3));
                        return;
                    }
                    throw new NullPointerException("Null encoding");
                }
                throw new NullPointerException("Null transformer");
            }
            throw new NullPointerException("Null transportName");
        }
        throw new NullPointerException("Null transportContext");
    }
}
