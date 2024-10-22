package defpackage;

/* loaded from: classes2.dex */
public final class ir2 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2639a;

    public ir2(String str) {
        this.f2639a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ir2) && m20.L(this.f2639a, ((ir2) obj).f2639a);
    }

    public final int hashCode() {
        return this.f2639a.hashCode();
    }

    public final String toString() {
        return "SessionDetails(sessionId=" + this.f2639a + ')';
    }
}
