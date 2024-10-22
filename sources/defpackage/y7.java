package defpackage;

/* loaded from: classes.dex */
public final class y7 {

    /* renamed from: a, reason: collision with root package name */
    public final long f5283a;

    /* renamed from: b, reason: collision with root package name */
    public final long f5284b;

    public y7(long j, long j2) {
        this.f5283a = j;
        this.f5284b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y7)) {
            return false;
        }
        y7 y7Var = (y7) obj;
        if (this.f5283a == y7Var.f5283a && this.f5284b == y7Var.f5284b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f5283a) * 31) + ((int) this.f5284b);
    }
}
