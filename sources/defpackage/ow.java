package defpackage;

/* loaded from: classes2.dex */
public final class ow extends pw {

    /* renamed from: a, reason: collision with root package name */
    public final Throwable f3739a;

    public ow(Throwable th) {
        this.f3739a = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ow) {
            if (m20.L(this.f3739a, ((ow) obj).f3739a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Throwable th = this.f3739a;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.pw
    public final String toString() {
        return "Closed(" + this.f3739a + ')';
    }
}
