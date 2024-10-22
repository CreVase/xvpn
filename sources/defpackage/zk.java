package defpackage;

/* loaded from: classes2.dex */
public final class zk extends ab0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f5493a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5494b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public zk(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f5493a = i;
        this.f5494b = str;
        this.c = i2;
        this.d = j;
        this.e = j2;
        this.f = z;
        this.g = i3;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ab0)) {
            return false;
        }
        ab0 ab0Var = (ab0) obj;
        if (this.f5493a == ((zk) ab0Var).f5493a) {
            zk zkVar = (zk) ab0Var;
            if (this.f5494b.equals(zkVar.f5494b) && this.c == zkVar.c && this.d == zkVar.d && this.e == zkVar.e && this.f == zkVar.f && this.g == zkVar.g && this.h.equals(zkVar.h) && this.i.equals(zkVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f5493a ^ 1000003) * 1000003) ^ this.f5494b.hashCode()) * 1000003) ^ this.c) * 1000003;
        long j = this.d;
        int i2 = (hashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        int i3 = (i2 ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        if (this.f) {
            i = 1231;
        } else {
            i = 1237;
        }
        return ((((((i3 ^ i) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Device{arch=");
        sb.append(this.f5493a);
        sb.append(", model=");
        sb.append(this.f5494b);
        sb.append(", cores=");
        sb.append(this.c);
        sb.append(", ram=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", simulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return hx2.s(sb, this.i, "}");
    }
}
