package defpackage;

/* loaded from: classes.dex */
public final class ej0 implements Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1943a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1944b;

    public ej0(y01 y01Var, int i) {
        this.f1943a = (y01Var.d & 1) != 0;
        this.f1944b = nj0.f(i, false);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        ej0 ej0Var = (ej0) obj;
        return w20.f4928a.c(this.f1944b, ej0Var.f1944b).c(this.f1943a, ej0Var.f1943a).e();
    }
}
