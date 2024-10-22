package defpackage;

import com.vungle.ads.VungleError;

/* loaded from: classes.dex */
public final class ql {
    public static final ql f;

    /* renamed from: a, reason: collision with root package name */
    public final long f4013a;

    /* renamed from: b, reason: collision with root package name */
    public final int f4014b;
    public final int c;
    public final long d;
    public final int e;

    static {
        String str;
        Long l = 10485760L;
        Integer num = 200;
        Integer valueOf = Integer.valueOf(VungleError.DEFAULT);
        Long l2 = 604800000L;
        Integer num2 = 81920;
        if (l == null) {
            str = " maxStorageSizeInBytes";
        } else {
            str = "";
        }
        if (num == null) {
            str = str.concat(" loadBatchSize");
        }
        if (valueOf == null) {
            str = p71.l(str, " criticalSectionEnterTimeoutMs");
        }
        if (l2 == null) {
            str = p71.l(str, " eventCleanUpAge");
        }
        if (num2 == null) {
            str = p71.l(str, " maxBlobByteSizePerRow");
        }
        if (str.isEmpty()) {
            f = new ql(l.longValue(), num.intValue(), valueOf.intValue(), l2.longValue(), num2.intValue());
            return;
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public ql(long j, int i, int i2, long j2, int i3) {
        this.f4013a = j;
        this.f4014b = i;
        this.c = i2;
        this.d = j2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ql)) {
            return false;
        }
        ql qlVar = (ql) obj;
        if (this.f4013a == qlVar.f4013a && this.f4014b == qlVar.f4014b && this.c == qlVar.c && this.d == qlVar.d && this.e == qlVar.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4013a;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.f4014b) * 1000003) ^ this.c) * 1000003;
        long j2 = this.d;
        return this.e ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EventStoreConfig{maxStorageSizeInBytes=");
        sb.append(this.f4013a);
        sb.append(", loadBatchSize=");
        sb.append(this.f4014b);
        sb.append(", criticalSectionEnterTimeoutMs=");
        sb.append(this.c);
        sb.append(", eventCleanUpAge=");
        sb.append(this.d);
        sb.append(", maxBlobByteSizePerRow=");
        return hx2.r(sb, this.e, "}");
    }
}
