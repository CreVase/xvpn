package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class dm {

    /* renamed from: a, reason: collision with root package name */
    public final long f1804a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1805b;
    public final Set c;

    public dm(long j, long j2, Set set) {
        this.f1804a = j;
        this.f1805b = j2;
        this.c = set;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof dm)) {
            return false;
        }
        dm dmVar = (dm) obj;
        if (this.f1804a == dmVar.f1804a && this.f1805b == dmVar.f1805b && this.c.equals(dmVar.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f1804a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.f1805b;
        return this.c.hashCode() ^ ((i ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        return "ConfigValue{delta=" + this.f1804a + ", maxAllowedDelay=" + this.f1805b + ", flags=" + this.c + "}";
    }
}
