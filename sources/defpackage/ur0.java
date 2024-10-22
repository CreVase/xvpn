package defpackage;

/* loaded from: classes.dex */
public abstract class ur0 extends ys2 {
    public abstract void d(o31 o31Var, Object obj);

    public final void e(Object obj) {
        o31 a2 = a();
        try {
            d(a2, obj);
            a2.f3591b.executeInsert();
        } finally {
            c(a2);
        }
    }
}
