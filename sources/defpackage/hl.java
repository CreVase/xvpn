package defpackage;

/* loaded from: classes2.dex */
public final class hl extends fb0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2442a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2443b;
    public final gb1 c;

    public hl(String str, int i, gb1 gb1Var) {
        this.f2442a = str;
        this.f2443b = i;
        this.c = gb1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fb0)) {
            return false;
        }
        fb0 fb0Var = (fb0) obj;
        if (this.f2442a.equals(((hl) fb0Var).f2442a)) {
            hl hlVar = (hl) fb0Var;
            if (this.f2443b == hlVar.f2443b && this.c.equals(hlVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f2442a.hashCode() ^ 1000003) * 1000003) ^ this.f2443b) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.f2442a + ", importance=" + this.f2443b + ", frames=" + this.c + "}";
    }
}
