package defpackage;

/* loaded from: classes2.dex */
public final class er2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f1980a;

    /* renamed from: b, reason: collision with root package name */
    public final String f1981b;
    public final int c;
    public final long d;
    public final rd0 e;
    public String f = "";

    public er2(String str, String str2, int i, long j, rd0 rd0Var) {
        this.f1980a = str;
        this.f1981b = str2;
        this.c = i;
        this.d = j;
        this.e = rd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof er2)) {
            return false;
        }
        er2 er2Var = (er2) obj;
        return m20.L(this.f1980a, er2Var.f1980a) && m20.L(this.f1981b, er2Var.f1981b) && this.c == er2Var.c && this.d == er2Var.d && m20.L(this.e, er2Var.e) && m20.L(this.f, er2Var.f);
    }

    public final int hashCode() {
        int h = (p71.h(this.f1981b, this.f1980a.hashCode() * 31, 31) + this.c) * 31;
        long j = this.d;
        return this.f.hashCode() + ((this.e.hashCode() + ((h + ((int) (j ^ (j >>> 32)))) * 31)) * 31);
    }

    public final String toString() {
        return "SessionInfo(sessionId=" + this.f1980a + ", firstSessionId=" + this.f1981b + ", sessionIndex=" + this.c + ", eventTimestampUs=" + this.d + ", dataCollectionStatus=" + this.e + ", firebaseInstallationId=" + this.f + ')';
    }
}
