package defpackage;

/* loaded from: classes.dex */
public abstract class u63 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f4630a;

    public abstract boolean a();

    public final boolean b(CharSequence charSequence, int i) {
        if (charSequence != null && i >= 0 && charSequence.length() - i >= 0) {
            t63 t63Var = (t63) this.f4630a;
            if (t63Var == null) {
                return a();
            }
            int d = t63Var.d(charSequence, i);
            if (d == 0) {
                return true;
            }
            if (d != 1) {
                return a();
            }
            return false;
        }
        throw new IllegalArgumentException();
    }
}
