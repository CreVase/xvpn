package defpackage;

/* loaded from: classes.dex */
public final class pl1 extends ql1 {

    /* renamed from: a, reason: collision with root package name */
    public final jd0 f3866a;

    public pl1(jd0 jd0Var) {
        this.f3866a = jd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pl1.class == obj.getClass()) {
            return this.f3866a.equals(((pl1) obj).f3866a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3866a.hashCode() + (pl1.class.getName().hashCode() * 31);
    }

    public final String toString() {
        return "Success {mOutputData=" + this.f3866a + '}';
    }
}
