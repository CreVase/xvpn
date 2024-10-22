package defpackage;

import java.util.Iterator;

/* loaded from: classes2.dex */
public class id1 implements Iterable, qh1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f2571a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2572b;
    public final int c;

    public id1(int i, int i2, int i3) {
        if (i3 != 0) {
            if (i3 != Integer.MIN_VALUE) {
                this.f2571a = i;
                this.f2572b = m20.q0(i, i2, i3);
                this.c = i3;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof id1) {
            if (!isEmpty() || !((id1) obj).isEmpty()) {
                id1 id1Var = (id1) obj;
                if (this.f2571a != id1Var.f2571a || this.f2572b != id1Var.f2572b || this.c != id1Var.c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f2571a * 31) + this.f2572b) * 31) + this.c;
    }

    public boolean isEmpty() {
        int i = this.c;
        int i2 = this.f2572b;
        int i3 = this.f2571a;
        if (i > 0) {
            if (i3 > i2) {
                return true;
            }
        } else if (i3 < i2) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new jd1(this.f2571a, this.f2572b, this.c);
    }

    public String toString() {
        StringBuilder sb;
        int i = this.f2572b;
        int i2 = this.f2571a;
        int i3 = this.c;
        if (i3 > 0) {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("..");
            sb.append(i);
            sb.append(" step ");
            sb.append(i3);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append(" downTo ");
            sb.append(i);
            sb.append(" step ");
            sb.append(-i3);
        }
        return sb.toString();
    }
}
