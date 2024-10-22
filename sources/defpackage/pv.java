package defpackage;

/* loaded from: classes.dex */
public final class pv extends a33 implements Comparable {
    public long k;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        pv pvVar = (pv) obj;
        if (g(4) != pvVar.g(4)) {
            if (!g(4)) {
                return -1;
            }
        } else {
            long j = this.f - pvVar.f;
            if (j == 0) {
                j = this.k - pvVar.k;
                if (j == 0) {
                    return 0;
                }
            }
            if (j <= 0) {
                return -1;
            }
        }
        return 1;
    }
}
