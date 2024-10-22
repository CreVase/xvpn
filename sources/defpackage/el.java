package defpackage;

/* loaded from: classes2.dex */
public final class el extends cb0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1953a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1954b;
    public final gb1 c;
    public final cb0 d;
    public final int e;

    public el(String str, String str2, gb1 gb1Var, cb0 cb0Var, int i) {
        this.f1953a = str;
        this.f1954b = str2;
        this.c = gb1Var;
        this.d = cb0Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cb0)) {
            return false;
        }
        el elVar = (el) ((cb0) obj);
        if (this.f1953a.equals(elVar.f1953a) && ((str = this.f1954b) != null ? str.equals(elVar.f1954b) : elVar.f1954b == null)) {
            if (this.c.equals(elVar.c)) {
                cb0 cb0Var = elVar.d;
                cb0 cb0Var2 = this.d;
                if (cb0Var2 != null ? cb0Var2.equals(cb0Var) : cb0Var == null) {
                    if (this.e == elVar.e) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.f1953a.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        String str = this.f1954b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.c.hashCode()) * 1000003;
        cb0 cb0Var = this.d;
        if (cb0Var != null) {
            i = cb0Var.hashCode();
        }
        return ((hashCode3 ^ i) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.f1953a);
        sb.append(", reason=");
        sb.append(this.f1954b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return hx2.r(sb, this.e, "}");
    }
}
