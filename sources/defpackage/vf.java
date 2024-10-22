package defpackage;

/* loaded from: classes2.dex */
public final class vf {

    /* renamed from: a, reason: collision with root package name */
    public final String f4823a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4824b;
    public final String c;
    public final ab d;

    public vf(String str, String str2, String str3, ab abVar) {
        this.f4823a = str;
        this.f4824b = str2;
        this.c = str3;
        this.d = abVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf)) {
            return false;
        }
        vf vfVar = (vf) obj;
        return m20.L(this.f4823a, vfVar.f4823a) && m20.L(this.f4824b, vfVar.f4824b) && m20.L("1.1.0", "1.1.0") && m20.L(this.c, vfVar.c) && m20.L(this.d, vfVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((tn1.LOG_ENVIRONMENT_PROD.hashCode() + p71.h(this.c, (((this.f4824b.hashCode() + (this.f4823a.hashCode() * 31)) * 31) + 46671478) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.f4823a + ", deviceModel=" + this.f4824b + ", sessionSdkVersion=1.1.0, osVersion=" + this.c + ", logEnvironment=" + tn1.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.d + ')';
    }
}
