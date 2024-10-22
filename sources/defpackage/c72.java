package defpackage;

/* loaded from: classes.dex */
public final class c72 {

    /* renamed from: a, reason: collision with root package name */
    public final String f597a;

    public c72(String str) {
        this.f597a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c72) {
            return m20.L(this.f597a, ((c72) obj).f597a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f597a.hashCode();
    }

    public final String toString() {
        return this.f597a;
    }
}
