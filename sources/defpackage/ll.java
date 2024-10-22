package defpackage;

/* loaded from: classes2.dex */
public final class ll extends lb0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3147a;

    /* renamed from: b, reason: collision with root package name */
    public final String f3148b;
    public final String c;
    public final boolean d;

    public ll(int i, String str, String str2, boolean z) {
        this.f3147a = i;
        this.f3148b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lb0)) {
            return false;
        }
        lb0 lb0Var = (lb0) obj;
        if (this.f3147a == ((ll) lb0Var).f3147a) {
            ll llVar = (ll) lb0Var;
            if (this.f3148b.equals(llVar.f3148b) && this.c.equals(llVar.c) && this.d == llVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f3147a ^ 1000003) * 1000003) ^ this.f3148b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        if (this.d) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "OperatingSystem{platform=" + this.f3147a + ", version=" + this.f3148b + ", buildVersion=" + this.c + ", jailbroken=" + this.d + "}";
    }
}
