package defpackage;

/* loaded from: classes2.dex */
public final class ar2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f324a;

    /* renamed from: b, reason: collision with root package name */
    public final String f325b;
    public final int c;
    public final long d;

    public ar2(long j, String str, String str2, int i) {
        this.f324a = str;
        this.f325b = str2;
        this.c = i;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ar2)) {
            return false;
        }
        ar2 ar2Var = (ar2) obj;
        return m20.L(this.f324a, ar2Var.f324a) && m20.L(this.f325b, ar2Var.f325b) && this.c == ar2Var.c && this.d == ar2Var.d;
    }

    public final int hashCode() {
        int h = (p71.h(this.f325b, this.f324a.hashCode() * 31, 31) + this.c) * 31;
        long j = this.d;
        return h + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f324a + ", firstSessionId=" + this.f325b + ", sessionIndex=" + this.c + ", sessionStartTimestampUs=" + this.d + ')';
    }
}
