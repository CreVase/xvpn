package defpackage;

/* loaded from: classes2.dex */
public final class tl {

    /* renamed from: a, reason: collision with root package name */
    public final String f4524a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4525b;
    public final String c;
    public final km d;
    public final xc1 e;

    public tl(String str, String str2, String str3, km kmVar, xc1 xc1Var) {
        this.f4524a = str;
        this.f4525b = str2;
        this.c = str3;
        this.d = kmVar;
        this.e = xc1Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof tl)) {
            return false;
        }
        tl tlVar = (tl) obj;
        String str = this.f4524a;
        if (str != null ? str.equals(tlVar.f4524a) : tlVar.f4524a == null) {
            String str2 = this.f4525b;
            if (str2 != null ? str2.equals(tlVar.f4525b) : tlVar.f4525b == null) {
                String str3 = this.c;
                if (str3 != null ? str3.equals(tlVar.c) : tlVar.c == null) {
                    km kmVar = this.d;
                    if (kmVar != null ? kmVar.equals(tlVar.d) : tlVar.d == null) {
                        xc1 xc1Var = this.e;
                        if (xc1Var == null) {
                            if (tlVar.e == null) {
                                return true;
                            }
                        } else if (xc1Var.equals(tlVar.e)) {
                            return true;
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
        int i = 0;
        String str = this.f4524a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (hashCode ^ 1000003) * 1000003;
        String str2 = this.f4525b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 ^ hashCode2) * 1000003;
        String str3 = this.c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 ^ hashCode3) * 1000003;
        km kmVar = this.d;
        if (kmVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = kmVar.hashCode();
        }
        int i5 = (i4 ^ hashCode4) * 1000003;
        xc1 xc1Var = this.e;
        if (xc1Var != null) {
            i = xc1Var.hashCode();
        }
        return i ^ i5;
    }

    public final String toString() {
        return "InstallationResponse{uri=" + this.f4524a + ", fid=" + this.f4525b + ", refreshToken=" + this.c + ", authToken=" + this.d + ", responseCode=" + this.e + "}";
    }
}
