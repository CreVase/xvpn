package defpackage;

/* loaded from: classes2.dex */
public final class hm {

    /* renamed from: a, reason: collision with root package name */
    public final String f2448a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2449b;
    public final String c;
    public final String d;
    public final int e;
    public final uy0 f;

    public hm(String str, String str2, String str3, String str4, int i, uy0 uy0Var) {
        if (str != null) {
            this.f2448a = str;
            if (str2 != null) {
                this.f2449b = str2;
                if (str3 != null) {
                    this.c = str3;
                    if (str4 != null) {
                        this.d = str4;
                        this.e = i;
                        if (uy0Var != null) {
                            this.f = uy0Var;
                            return;
                        }
                        throw new NullPointerException("Null developmentPlatformProvider");
                    }
                    throw new NullPointerException("Null installUuid");
                }
                throw new NullPointerException("Null versionName");
            }
            throw new NullPointerException("Null versionCode");
        }
        throw new NullPointerException("Null appIdentifier");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof hm)) {
            return false;
        }
        hm hmVar = (hm) obj;
        if (this.f2448a.equals(hmVar.f2448a) && this.f2449b.equals(hmVar.f2449b) && this.c.equals(hmVar.c) && this.d.equals(hmVar.d) && this.e == hmVar.e && this.f.equals(hmVar.f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((this.f2448a.hashCode() ^ 1000003) * 1000003) ^ this.f2449b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        return "AppData{appIdentifier=" + this.f2448a + ", versionCode=" + this.f2449b + ", versionName=" + this.c + ", installUuid=" + this.d + ", deliveryMechanism=" + this.e + ", developmentPlatformProvider=" + this.f + "}";
    }
}
