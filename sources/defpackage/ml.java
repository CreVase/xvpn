package defpackage;

/* loaded from: classes2.dex */
public final class ml extends mb0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3312a;

    public ml(String str) {
        this.f3312a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mb0) {
            return this.f3312a.equals(((ml) ((mb0) obj)).f3312a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f3312a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return hx2.s(new StringBuilder("User{identifier="), this.f3312a, "}");
    }
}
