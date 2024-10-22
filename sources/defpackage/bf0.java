package defpackage;

/* loaded from: classes2.dex */
public final class bf0 implements c90 {

    /* renamed from: a, reason: collision with root package name */
    public final n41 f457a;

    /* renamed from: b, reason: collision with root package name */
    public Object f458b;
    public c90 c;
    public Object d;

    public bf0(n41 n41Var) {
        ch3 ch3Var = ch3.f636a;
        this.f457a = n41Var;
        this.f458b = ch3Var;
        this.c = this;
        this.d = af0.f74a;
    }

    @Override // defpackage.c90
    public final t90 getContext() {
        return zq0.f5530a;
    }

    @Override // defpackage.c90
    public final void resumeWith(Object obj) {
        this.c = null;
        this.d = obj;
    }
}
