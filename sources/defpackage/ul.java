package defpackage;

/* loaded from: classes2.dex */
public final class ul {

    /* renamed from: a, reason: collision with root package name */
    public final String f4690a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4691b;
    public final long c;

    public ul(String str, long j, long j2) {
        this.f4690a = str;
        this.f4691b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ul)) {
            return false;
        }
        ul ulVar = (ul) obj;
        if (this.f4690a.equals(ulVar.f4690a) && this.f4691b == ulVar.f4691b && this.c == ulVar.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f4690a.hashCode() ^ 1000003) * 1000003;
        long j = this.f4691b;
        long j2 = this.c;
        return ((hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public final String toString() {
        return "InstallationTokenResult{token=" + this.f4690a + ", tokenExpirationTimestamp=" + this.f4691b + ", tokenCreationTimestamp=" + this.c + "}";
    }
}
