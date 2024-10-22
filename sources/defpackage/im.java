package defpackage;

/* loaded from: classes2.dex */
public final class im {

    /* renamed from: a, reason: collision with root package name */
    public final int f2621a;

    /* renamed from: b, reason: collision with root package name */
    public final String f2622b;
    public final int c;
    public final long d;
    public final long e;
    public final boolean f;
    public final int g;
    public final String h;
    public final String i;

    public im(int i, String str, int i2, long j, long j2, boolean z, int i3, String str2, String str3) {
        this.f2621a = i;
        if (str != null) {
            this.f2622b = str;
            this.c = i2;
            this.d = j;
            this.e = j2;
            this.f = z;
            this.g = i3;
            if (str2 != null) {
                this.h = str2;
                if (str3 != null) {
                    this.i = str3;
                    return;
                }
                throw new NullPointerException("Null modelClass");
            }
            throw new NullPointerException("Null manufacturer");
        }
        throw new NullPointerException("Null model");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof im)) {
            return false;
        }
        im imVar = (im) obj;
        if (this.f2621a == imVar.f2621a && this.f2622b.equals(imVar.f2622b) && this.c == imVar.c && this.d == imVar.d && this.e == imVar.e && this.f == imVar.f && this.g == imVar.g && this.h.equals(imVar.h) && this.i.equals(imVar.i)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((((this.f2621a ^ 1000003) * 1000003) ^ this.f2622b.hashCode()) * 1000003) ^ this.c) * 1000003;
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
        StringBuilder sb = new StringBuilder("DeviceData{arch=");
        sb.append(this.f2621a);
        sb.append(", model=");
        sb.append(this.f2622b);
        sb.append(", availableProcessors=");
        sb.append(this.c);
        sb.append(", totalRam=");
        sb.append(this.d);
        sb.append(", diskSpace=");
        sb.append(this.e);
        sb.append(", isEmulator=");
        sb.append(this.f);
        sb.append(", state=");
        sb.append(this.g);
        sb.append(", manufacturer=");
        sb.append(this.h);
        sb.append(", modelClass=");
        return hx2.s(sb, this.i, "}");
    }
}
