package defpackage;

/* loaded from: classes.dex */
public final class km1 implements a22 {

    /* renamed from: a, reason: collision with root package name */
    public final gm1 f2973a;

    /* renamed from: b, reason: collision with root package name */
    public final hm1 f2974b;
    public boolean c = false;

    public km1(gm1 gm1Var, hm1 hm1Var) {
        this.f2973a = gm1Var;
        this.f2974b = hm1Var;
    }

    @Override // defpackage.a22
    public final void F(Object obj) {
        this.f2974b.onLoadFinished(this.f2973a, obj);
        this.c = true;
    }

    public final String toString() {
        return this.f2974b.toString();
    }
}
