package defpackage;

/* loaded from: classes2.dex */
public final class eg3 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f1931a;

    public /* synthetic */ eg3(int i) {
        this.f1931a = i;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m20.W(this.f1931a ^ Integer.MIN_VALUE, ((eg3) obj).f1931a ^ Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof eg3)) {
            return false;
        }
        if (this.f1931a != ((eg3) obj).f1931a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f1931a;
    }

    public final String toString() {
        return String.valueOf(this.f1931a & 4294967295L);
    }
}
