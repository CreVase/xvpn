package defpackage;

import java.io.Serializable;

/* loaded from: classes2.dex */
public final class i20 implements t90, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final t90 f2522a;

    /* renamed from: b, reason: collision with root package name */
    public final r90 f2523b;

    public i20(r90 r90Var, t90 t90Var) {
        this.f2522a = t90Var;
        this.f2523b = r90Var;
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (this != obj) {
            if (!(obj instanceof i20)) {
                return false;
            }
            i20 i20Var = (i20) obj;
            i20Var.getClass();
            int i = 2;
            i20 i20Var2 = i20Var;
            int i2 = 2;
            while (true) {
                t90 t90Var = i20Var2.f2522a;
                if (t90Var instanceof i20) {
                    i20Var2 = (i20) t90Var;
                } else {
                    i20Var2 = null;
                }
                if (i20Var2 == null) {
                    break;
                }
                i2++;
            }
            i20 i20Var3 = this;
            while (true) {
                t90 t90Var2 = i20Var3.f2522a;
                if (t90Var2 instanceof i20) {
                    i20Var3 = (i20) t90Var2;
                } else {
                    i20Var3 = null;
                }
                if (i20Var3 == null) {
                    break;
                }
                i++;
            }
            if (i2 != i) {
                return false;
            }
            i20 i20Var4 = this;
            while (true) {
                r90 r90Var = i20Var4.f2523b;
                if (!m20.L(i20Var.get(r90Var.getKey()), r90Var)) {
                    z = false;
                    break;
                }
                t90 t90Var3 = i20Var4.f2522a;
                if (t90Var3 instanceof i20) {
                    i20Var4 = (i20) t90Var3;
                } else {
                    r90 r90Var2 = (r90) t90Var3;
                    z = m20.L(i20Var.get(r90Var2.getKey()), r90Var2);
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.t90
    public final Object fold(Object obj, l41 l41Var) {
        return l41Var.invoke(this.f2522a.fold(obj, l41Var), this.f2523b);
    }

    @Override // defpackage.t90
    public final r90 get(s90 s90Var) {
        i20 i20Var = this;
        while (true) {
            r90 r90Var = i20Var.f2523b.get(s90Var);
            if (r90Var != null) {
                return r90Var;
            }
            t90 t90Var = i20Var.f2522a;
            if (t90Var instanceof i20) {
                i20Var = (i20) t90Var;
            } else {
                return t90Var.get(s90Var);
            }
        }
    }

    public final int hashCode() {
        return this.f2523b.hashCode() + this.f2522a.hashCode();
    }

    @Override // defpackage.t90
    public final t90 minusKey(s90 s90Var) {
        r90 r90Var = this.f2523b;
        r90 r90Var2 = r90Var.get(s90Var);
        t90 t90Var = this.f2522a;
        if (r90Var2 != null) {
            return t90Var;
        }
        t90 minusKey = t90Var.minusKey(s90Var);
        if (minusKey == t90Var) {
            return this;
        }
        if (minusKey != zq0.f5530a) {
            return new i20(r90Var, minusKey);
        }
        return r90Var;
    }

    @Override // defpackage.t90
    public final t90 plus(t90 t90Var) {
        return fl.V(this, t90Var);
    }

    public final String toString() {
        return "[" + ((String) fold("", gv2.p)) + ']';
    }
}
