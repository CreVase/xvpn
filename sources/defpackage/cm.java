package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class cm {

    /* renamed from: a, reason: collision with root package name */
    public final g10 f665a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f666b;

    public cm(g10 g10Var, Map map) {
        if (g10Var != null) {
            this.f665a = g10Var;
            if (map != null) {
                this.f666b = map;
                return;
            }
            throw new NullPointerException("Null values");
        }
        throw new NullPointerException("Null clock");
    }

    public final long a(y72 y72Var, long j, int i) {
        long j2;
        long a2 = j - ((gi3) this.f665a).a();
        dm dmVar = (dm) this.f666b.get(y72Var);
        long j3 = dmVar.f1804a;
        int i2 = i - 1;
        if (j3 > 1) {
            j2 = j3;
        } else {
            j2 = 2;
        }
        return Math.min(Math.max((long) (Math.pow(3.0d, i2) * j3 * Math.max(1.0d, Math.log(10000.0d) / Math.log(j2 * i2))), a2), dmVar.f1805b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cm)) {
            return false;
        }
        cm cmVar = (cm) obj;
        if (this.f665a.equals(cmVar.f665a) && this.f666b.equals(cmVar.f666b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f665a.hashCode() ^ 1000003) * 1000003) ^ this.f666b.hashCode();
    }

    public final String toString() {
        return "SchedulerConfig{clock=" + this.f665a + ", values=" + this.f666b + "}";
    }
}
