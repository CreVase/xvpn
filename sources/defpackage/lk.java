package defpackage;

/* loaded from: classes.dex */
public final class lk {

    /* renamed from: a, reason: collision with root package name */
    public final int f3141a;

    /* renamed from: b, reason: collision with root package name */
    public final long f3142b;

    public lk(int i, long j) {
        if (i != 0) {
            this.f3141a = i;
            this.f3142b = j;
            return;
        }
        throw new NullPointerException("Null status");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lk)) {
            return false;
        }
        lk lkVar = (lk) obj;
        if (hx2.a(this.f3141a, lkVar.f3141a) && this.f3142b == lkVar.f3142b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int x = (hx2.x(this.f3141a) ^ 1000003) * 1000003;
        long j = this.f3142b;
        return x ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "BackendResponse{status=" + hx2.y(this.f3141a) + ", nextRequestWaitMillis=" + this.f3142b + "}";
    }
}
