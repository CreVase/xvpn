package defpackage;

/* loaded from: classes.dex */
public final class w7 {

    /* renamed from: a, reason: collision with root package name */
    public int f4952a;

    /* renamed from: b, reason: collision with root package name */
    public int f4953b;
    public Object c;
    public int d;

    public w7(int i, int i2, int i3, Object obj) {
        this.f4952a = i;
        this.f4953b = i2;
        this.d = i3;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7)) {
            return false;
        }
        w7 w7Var = (w7) obj;
        int i = this.f4952a;
        if (i != w7Var.f4952a) {
            return false;
        }
        if (i == 8 && Math.abs(this.d - this.f4953b) == 1 && this.d == w7Var.f4953b && this.f4953b == w7Var.d) {
            return true;
        }
        if (this.d != w7Var.d || this.f4953b != w7Var.f4953b) {
            return false;
        }
        Object obj2 = this.c;
        if (obj2 != null) {
            if (!obj2.equals(w7Var.c)) {
                return false;
            }
        } else if (w7Var.c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f4952a * 31) + this.f4953b) * 31) + this.d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f4952a;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f4953b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append(this.c);
        sb.append("]");
        return sb.toString();
    }
}
