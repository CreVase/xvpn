package defpackage;

/* loaded from: classes.dex */
public final class eu0 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f1996a;

    /* renamed from: b, reason: collision with root package name */
    public p52 f1997b;
    public int c;
    public boolean d;
    public int e;
    public boolean f;
    public int g;

    public eu0(p52 p52Var) {
        this.f1997b = p52Var;
    }

    public final void a(int i) {
        boolean z;
        boolean z2 = this.f1996a;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        this.f1996a = z2 | z;
        this.c += i;
    }
}
