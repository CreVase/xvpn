package defpackage;

/* loaded from: classes.dex */
public final class nl1 extends ql1 {

    /* renamed from: a, reason: collision with root package name */
    public final jd0 f3482a = jd0.c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nl1.class == obj.getClass()) {
            return this.f3482a.equals(((nl1) obj).f3482a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3482a.hashCode() + (nl1.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Failure {mOutputData=" + this.f3482a + '}';
    }
}
