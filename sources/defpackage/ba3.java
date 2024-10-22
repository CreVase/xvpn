package defpackage;

/* loaded from: classes.dex */
public final class ba3 {

    /* renamed from: a, reason: collision with root package name */
    public final long f432a;

    /* renamed from: b, reason: collision with root package name */
    public final long f433b;
    public final int c;

    public ba3(int i, long j, long j2) {
        this.f432a = j;
        this.f433b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba3)) {
            return false;
        }
        ba3 ba3Var = (ba3) obj;
        if (this.f432a == ba3Var.f432a && this.f433b == ba3Var.f433b && this.c == ba3Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f432a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        long j2 = this.f433b;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TaxonomyVersion=");
        sb.append(this.f432a);
        sb.append(", ModelVersion=");
        sb.append(this.f433b);
        sb.append(", TopicCode=");
        return hx2.p("Topic { ", hx2.r(sb, this.c, " }"));
    }
}
