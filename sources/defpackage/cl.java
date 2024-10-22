package defpackage;

/* loaded from: classes2.dex */
public final class cl extends gb0 {

    /* renamed from: a, reason: collision with root package name */
    public final gb1 f659a;

    /* renamed from: b, reason: collision with root package name */
    public final cb0 f660b;
    public final ua0 c;
    public final db0 d;
    public final gb1 e;

    public cl(gb1 gb1Var, cb0 cb0Var, ua0 ua0Var, db0 db0Var, gb1 gb1Var2) {
        this.f659a = gb1Var;
        this.f660b = cb0Var;
        this.c = ua0Var;
        this.d = db0Var;
        this.e = gb1Var2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof gb0)) {
            return false;
        }
        gb0 gb0Var = (gb0) obj;
        gb1 gb1Var = this.f659a;
        if (gb1Var != null ? gb1Var.equals(((cl) gb0Var).f659a) : ((cl) gb0Var).f659a == null) {
            cb0 cb0Var = this.f660b;
            if (cb0Var != null ? cb0Var.equals(((cl) gb0Var).f660b) : ((cl) gb0Var).f660b == null) {
                ua0 ua0Var = this.c;
                if (ua0Var != null ? ua0Var.equals(((cl) gb0Var).c) : ((cl) gb0Var).c == null) {
                    cl clVar = (cl) gb0Var;
                    if (this.d.equals(clVar.d) && this.e.equals(clVar.e)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i = 0;
        gb1 gb1Var = this.f659a;
        if (gb1Var == null) {
            hashCode = 0;
        } else {
            hashCode = gb1Var.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        cb0 cb0Var = this.f660b;
        if (cb0Var == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = cb0Var.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        ua0 ua0Var = this.c;
        if (ua0Var != null) {
            i = ua0Var.hashCode();
        }
        return ((((i ^ i3) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.f659a + ", exception=" + this.f660b + ", appExitInfo=" + this.c + ", signal=" + this.d + ", binaries=" + this.e + "}";
    }
}
