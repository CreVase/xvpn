package defpackage;

/* loaded from: classes2.dex */
public final class kd1 extends id1 {
    public static final kd1 d = new kd1(1, 0);

    public kd1(int i, int i2) {
        super(i, i2, 1);
    }

    public final boolean c(int i) {
        if (this.f2571a <= i && i <= this.f2572b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.id1
    public final boolean equals(Object obj) {
        if (obj instanceof kd1) {
            if (!isEmpty() || !((kd1) obj).isEmpty()) {
                kd1 kd1Var = (kd1) obj;
                if (this.f2571a == kd1Var.f2571a) {
                    if (this.f2572b == kd1Var.f2572b) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.id1
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (this.f2571a * 31) + this.f2572b;
    }

    @Override // defpackage.id1
    public final boolean isEmpty() {
        if (this.f2571a > this.f2572b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.id1
    public final String toString() {
        return this.f2571a + ".." + this.f2572b;
    }
}
