package defpackage;

/* loaded from: classes.dex */
public final class ew2 {
    public static final ew2 c = new ew2(-1, -1);

    /* renamed from: a, reason: collision with root package name */
    public final int f2010a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2011b;

    static {
        new ew2(0, 0);
    }

    public ew2(int i, int i2) {
        boolean z;
        if ((i != -1 && i < 0) || (i2 != -1 && i2 < 0)) {
            z = false;
        } else {
            z = true;
        }
        cp3.e(z);
        this.f2010a = i;
        this.f2011b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew2)) {
            return false;
        }
        ew2 ew2Var = (ew2) obj;
        if (this.f2010a != ew2Var.f2010a || this.f2011b != ew2Var.f2011b) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f2010a;
        return ((i >>> 16) | (i << 16)) ^ this.f2011b;
    }

    public final String toString() {
        return this.f2010a + "x" + this.f2011b;
    }
}
