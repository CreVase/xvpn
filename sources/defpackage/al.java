package defpackage;

/* loaded from: classes2.dex */
public final class al extends kb0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f104a;

    /* renamed from: b, reason: collision with root package name */
    public final String f105b;
    public final hb0 c;
    public final ib0 d;
    public final jb0 e;

    public al(long j, String str, hb0 hb0Var, ib0 ib0Var, jb0 jb0Var) {
        this.f104a = j;
        this.f105b = str;
        this.c = hb0Var;
        this.d = ib0Var;
        this.e = jb0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kb0)) {
            return false;
        }
        al alVar = (al) ((kb0) obj);
        if (this.f104a == alVar.f104a) {
            if (this.f105b.equals(alVar.f105b) && this.c.equals(alVar.c) && this.d.equals(alVar.d)) {
                jb0 jb0Var = alVar.e;
                jb0 jb0Var2 = this.e;
                if (jb0Var2 == null) {
                    if (jb0Var == null) {
                        return true;
                    }
                } else if (jb0Var2.equals(jb0Var)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.f104a;
        int hashCode2 = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f105b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003;
        jb0 jb0Var = this.e;
        if (jb0Var == null) {
            hashCode = 0;
        } else {
            hashCode = jb0Var.hashCode();
        }
        return hashCode ^ hashCode2;
    }

    public final String toString() {
        return "Event{timestamp=" + this.f104a + ", type=" + this.f105b + ", app=" + this.c + ", device=" + this.d + ", log=" + this.e + "}";
    }
}
