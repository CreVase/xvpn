package defpackage;

/* loaded from: classes2.dex */
public final class xn1 {
    public static final s71 c = new s71((r71) null);

    /* renamed from: a, reason: collision with root package name */
    public final jx0 f5187a;

    /* renamed from: b, reason: collision with root package name */
    public gx0 f5188b;

    public xn1(jx0 jx0Var) {
        this.f5187a = jx0Var;
        this.f5188b = c;
    }

    public final void a(String str) {
        this.f5188b.a();
        this.f5188b = c;
        if (str == null) {
            return;
        }
        this.f5188b = new zd2(this.f5187a.o(str, "userlog"));
    }

    public xn1(jx0 jx0Var, String str) {
        this(jx0Var);
        a(str);
    }
}
