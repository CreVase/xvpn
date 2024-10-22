package defpackage;

/* loaded from: classes2.dex */
public final class og3 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final short f3660a;

    public /* synthetic */ og3(short s) {
        this.f3660a = s;
    }

    public static String a(short s) {
        return String.valueOf(s & 65535);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return m20.W(this.f3660a & 65535, ((og3) obj).f3660a & 65535);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof og3)) {
            return false;
        }
        if (this.f3660a != ((og3) obj).f3660a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f3660a;
    }

    public final String toString() {
        return a(this.f3660a);
    }
}
