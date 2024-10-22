package defpackage;

/* loaded from: classes2.dex */
public final class kl extends jb0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f2964a;

    public kl(String str) {
        this.f2964a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jb0) {
            return this.f2964a.equals(((kl) ((jb0) obj)).f2964a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f2964a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return hx2.s(new StringBuilder("Log{content="), this.f2964a, "}");
    }
}
