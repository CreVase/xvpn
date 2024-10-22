package defpackage;

/* loaded from: classes2.dex */
public final class ii1 implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final ii1 f2602b = new ii1();

    /* renamed from: a, reason: collision with root package name */
    public final int f2603a;

    public ii1() {
        boolean z = false;
        if (new kd1(0, 255).c(1) && new kd1(0, 255).c(9) && new kd1(0, 255).c(20)) {
            z = true;
        }
        if (z) {
            this.f2603a = 67860;
            return;
        }
        throw new IllegalArgumentException("Version components are out of range: 1.9.20".toString());
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f2603a - ((ii1) obj).f2603a;
    }

    public final boolean equals(Object obj) {
        ii1 ii1Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof ii1) {
            ii1Var = (ii1) obj;
        } else {
            ii1Var = null;
        }
        if (ii1Var != null && this.f2603a == ii1Var.f2603a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f2603a;
    }

    public final String toString() {
        return "1.9.20";
    }
}
