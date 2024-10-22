package defpackage;

/* loaded from: classes2.dex */
public final class ab {

    /* renamed from: a, reason: collision with root package name */
    public final String f46a;

    /* renamed from: b, reason: collision with root package name */
    public final String f47b;
    public final String c;
    public final String d;

    public ab(String str, String str2, String str3, String str4) {
        this.f46a = str;
        this.f47b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ab)) {
            return false;
        }
        ab abVar = (ab) obj;
        return m20.L(this.f46a, abVar.f46a) && m20.L(this.f47b, abVar.f47b) && m20.L(this.c, abVar.c) && m20.L(this.d, abVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p71.h(this.c, p71.h(this.f47b, this.f46a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f46a + ", versionName=" + this.f47b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + this.d + ')';
    }
}
