package defpackage;

/* loaded from: classes2.dex */
public final class xk extends za0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f5169a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5170b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public xk(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f5169a = str;
        this.f5170b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof za0)) {
            return false;
        }
        za0 za0Var = (za0) obj;
        if (this.f5169a.equals(((xk) za0Var).f5169a)) {
            xk xkVar = (xk) za0Var;
            if (this.f5170b.equals(xkVar.f5170b)) {
                String str = xkVar.c;
                String str2 = this.c;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = xkVar.d;
                    String str4 = this.d;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        String str5 = xkVar.e;
                        String str6 = this.e;
                        if (str6 != null ? str6.equals(str5) : str5 == null) {
                            String str7 = xkVar.f;
                            String str8 = this.f;
                            if (str8 == null) {
                                if (str7 == null) {
                                    return true;
                                }
                            } else if (str8.equals(str7)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4 = (((this.f5169a.hashCode() ^ 1000003) * 1000003) ^ this.f5170b.hashCode()) * 1000003;
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (((hashCode4 ^ hashCode) * 1000003) ^ 0) * 1000003;
        String str2 = this.d;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.e;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        String str4 = this.f;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{identifier=");
        sb.append(this.f5169a);
        sb.append(", version=");
        sb.append(this.f5170b);
        sb.append(", displayVersion=");
        sb.append(this.c);
        sb.append(", organization=null, installationUuid=");
        sb.append(this.d);
        sb.append(", developmentPlatform=");
        sb.append(this.e);
        sb.append(", developmentPlatformVersion=");
        return hx2.s(sb, this.f, "}");
    }
}
