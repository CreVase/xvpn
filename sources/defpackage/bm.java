package defpackage;

/* loaded from: classes2.dex */
public final class bm {
    public static final /* synthetic */ int h = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f486a;

    /* renamed from: b, reason: collision with root package name */
    public final c52 f487b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;

    static {
        aa3 aa3Var = new aa3(0);
        aa3Var.f = 0L;
        aa3Var.k(c52.ATTEMPT_MIGRATION);
        aa3Var.e = 0L;
        aa3Var.g();
    }

    public bm(String str, c52 c52Var, String str2, String str3, long j, long j2, String str4) {
        this.f486a = str;
        this.f487b = c52Var;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = j2;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bm)) {
            return false;
        }
        bm bmVar = (bm) obj;
        String str = this.f486a;
        if (str != null ? str.equals(bmVar.f486a) : bmVar.f486a == null) {
            if (this.f487b.equals(bmVar.f487b)) {
                String str2 = bmVar.c;
                String str3 = this.c;
                if (str3 != null ? str3.equals(str2) : str2 == null) {
                    String str4 = bmVar.d;
                    String str5 = this.d;
                    if (str5 != null ? str5.equals(str4) : str4 == null) {
                        if (this.e == bmVar.e && this.f == bmVar.f) {
                            String str6 = bmVar.g;
                            String str7 = this.g;
                            if (str7 == null) {
                                if (str6 == null) {
                                    return true;
                                }
                            } else if (str7.equals(str6)) {
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
        int i = 0;
        String str = this.f486a;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode4 = (((hashCode ^ 1000003) * 1000003) ^ this.f487b.hashCode()) * 1000003;
        String str2 = this.c;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (hashCode4 ^ hashCode2) * 1000003;
        String str3 = this.d;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i3 = (i2 ^ hashCode3) * 1000003;
        long j = this.e;
        int i4 = (i3 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.f;
        int i5 = (i4 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        String str4 = this.g;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i ^ i5;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb.append(this.f486a);
        sb.append(", registrationStatus=");
        sb.append(this.f487b);
        sb.append(", authToken=");
        sb.append(this.c);
        sb.append(", refreshToken=");
        sb.append(this.d);
        sb.append(", expiresInSecs=");
        sb.append(this.e);
        sb.append(", tokenCreationEpochInSecs=");
        sb.append(this.f);
        sb.append(", fisError=");
        return hx2.s(sb, this.g, "}");
    }
}
