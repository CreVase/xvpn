package defpackage;

/* loaded from: classes.dex */
public final class lr0 {

    /* renamed from: a, reason: collision with root package name */
    public final String f3177a;

    public lr0(String str) {
        if (str != null) {
            this.f3177a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lr0)) {
            return false;
        }
        return this.f3177a.equals(((lr0) obj).f3177a);
    }

    public final int hashCode() {
        return this.f3177a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return hx2.s(new StringBuilder("Encoding{name=\""), this.f3177a, "\"}");
    }
}
