package defpackage;

/* loaded from: classes2.dex */
public final class uf3 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final byte f4663a;

    public /* synthetic */ uf3(byte b2) {
        this.f4663a = b2;
    }

    public static String a(byte b2) {
        return String.valueOf(b2 & 255);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return m20.W(this.f4663a & 255, ((uf3) obj).f4663a & 255);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof uf3)) {
            return false;
        }
        if (this.f4663a != ((uf3) obj).f4663a) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f4663a;
    }

    public final String toString() {
        return a(this.f4663a);
    }
}
