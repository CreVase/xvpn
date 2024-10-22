package defpackage;

/* loaded from: classes.dex */
public final class fp3 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final int f2133a;

    /* renamed from: b, reason: collision with root package name */
    public final ap3 f2134b;

    public fp3(int i, ap3 ap3Var) {
        this.f2133a = i;
        this.f2134b = ap3Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f2133a, ((fp3) obj).f2133a);
    }
}
