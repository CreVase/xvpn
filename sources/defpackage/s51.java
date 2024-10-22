package defpackage;

/* loaded from: classes.dex */
public final class s51 {

    /* renamed from: a, reason: collision with root package name */
    public final String f4274a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f4275b;

    public s51(String str, boolean z) {
        this.f4274a = str;
        this.f4275b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s51)) {
            return false;
        }
        s51 s51Var = (s51) obj;
        if (m20.L(this.f4274a, s51Var.f4274a) && this.f4275b == s51Var.f4275b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.f4274a.hashCode() * 31;
        if (this.f4275b) {
            i = 1231;
        } else {
            i = 1237;
        }
        return hashCode + i;
    }

    public final String toString() {
        return "GetTopicsRequest: adsSdkName=" + this.f4274a + ", shouldRecordObservation=" + this.f4275b;
    }
}
