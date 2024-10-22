package defpackage;

/* loaded from: classes2.dex */
public final class i42 implements i00 {

    /* renamed from: a, reason: collision with root package name */
    public final Class f2537a;

    public i42(Class cls) {
        this.f2537a = cls;
    }

    @Override // defpackage.i00
    public final Class a() {
        return this.f2537a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i42) {
            if (m20.L(this.f2537a, ((i42) obj).f2537a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2537a.hashCode();
    }

    public final String toString() {
        return this.f2537a.toString() + " (Kotlin reflection is not available)";
    }
}
