package defpackage;

/* loaded from: classes2.dex */
public final class pk extends ob0 {

    /* renamed from: b, reason: collision with root package name */
    public final String f3858b;
    public final String c;
    public final int d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final nb0 j;
    public final xa0 k;
    public final ua0 l;

    public pk(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, nb0 nb0Var, xa0 xa0Var, ua0 ua0Var) {
        this.f3858b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = nb0Var;
        this.k = xa0Var;
        this.l = ua0Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ob0)) {
            return false;
        }
        pk pkVar = (pk) ((ob0) obj);
        if (this.f3858b.equals(pkVar.f3858b)) {
            if (this.c.equals(pkVar.c) && this.d == pkVar.d && this.e.equals(pkVar.e)) {
                String str = pkVar.f;
                String str2 = this.f;
                if (str2 != null ? str2.equals(str) : str == null) {
                    String str3 = pkVar.g;
                    String str4 = this.g;
                    if (str4 != null ? str4.equals(str3) : str3 == null) {
                        if (this.h.equals(pkVar.h) && this.i.equals(pkVar.i)) {
                            nb0 nb0Var = pkVar.j;
                            nb0 nb0Var2 = this.j;
                            if (nb0Var2 != null ? nb0Var2.equals(nb0Var) : nb0Var == null) {
                                xa0 xa0Var = pkVar.k;
                                xa0 xa0Var2 = this.k;
                                if (xa0Var2 != null ? xa0Var2.equals(xa0Var) : xa0Var == null) {
                                    ua0 ua0Var = pkVar.l;
                                    ua0 ua0Var2 = this.l;
                                    if (ua0Var2 == null) {
                                        if (ua0Var == null) {
                                            return true;
                                        }
                                    } else if (ua0Var2.equals(ua0Var)) {
                                        return true;
                                    }
                                }
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
        int hashCode4;
        int hashCode5 = (((((((this.f3858b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d) * 1000003) ^ this.e.hashCode()) * 1000003;
        int i = 0;
        String str = this.f;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode5 ^ hashCode) * 1000003;
        String str2 = this.g;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int hashCode6 = (((((i2 ^ hashCode2) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode()) * 1000003;
        nb0 nb0Var = this.j;
        if (nb0Var == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = nb0Var.hashCode();
        }
        int i3 = (hashCode6 ^ hashCode3) * 1000003;
        xa0 xa0Var = this.k;
        if (xa0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = xa0Var.hashCode();
        }
        int i4 = (i3 ^ hashCode4) * 1000003;
        ua0 ua0Var = this.l;
        if (ua0Var != null) {
            i = ua0Var.hashCode();
        }
        return i4 ^ i;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f3858b + ", gmpAppId=" + this.c + ", platform=" + this.d + ", installationUuid=" + this.e + ", firebaseInstallationId=" + this.f + ", appQualitySessionId=" + this.g + ", buildVersion=" + this.h + ", displayVersion=" + this.i + ", session=" + this.j + ", ndkPayload=" + this.k + ", appExitInfo=" + this.l + "}";
    }
}
