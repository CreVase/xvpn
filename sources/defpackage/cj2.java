package defpackage;

/* loaded from: classes.dex */
public final class cj2 {

    /* renamed from: b, reason: collision with root package name */
    public static final cj2 f649b = new cj2(false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f650a;

    public cj2(boolean z) {
        this.f650a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && cj2.class == obj.getClass() && this.f650a == ((cj2) obj).f650a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return !this.f650a ? 1 : 0;
    }
}
