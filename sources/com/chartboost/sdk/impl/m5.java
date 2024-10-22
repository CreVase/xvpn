package com.chartboost.sdk.impl;

/* loaded from: classes.dex */
public final class m5 implements o5 {

    /* renamed from: a, reason: collision with root package name */
    public final r f994a;

    /* renamed from: b, reason: collision with root package name */
    public final String f995b;
    public final q c;
    public final c0 d;
    public final q5 e;
    public final s0 f;
    public final u3 g;
    public final v6 h;
    public boolean i = true;

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f996a;

        static {
            int[] iArr = new int[s5.values().length];
            try {
                iArr[s5.DISPLAYED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s5.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f996a = iArr;
        }
    }

    public m5(r rVar, String str, q qVar, c0 c0Var, q5 q5Var, s0 s0Var, u3 u3Var, v6 v6Var) {
        this.f994a = rVar;
        this.f995b = str;
        this.c = qVar;
        this.d = c0Var;
        this.e = q5Var;
        this.f = s0Var;
        this.g = u3Var;
        this.h = v6Var;
    }

    @Override // com.chartboost.sdk.impl.o5
    public void a(s5 s5Var) {
        this.i = true;
        this.h.a(l7.NORMAL);
        int i = a.f996a[s5Var.ordinal()];
        if (i == 1) {
            b();
        } else if (i == 2) {
            c();
            y3.d(new j3("show_close_before_template_show_error", "onClose with state Loaded", this.c.b(), this.f995b, null, 16, null));
        }
        this.d.a(this.f);
    }

    public final void b() {
        String str;
        str = n5.f1009a;
        f6.c(str, "Dismissing impression");
        this.e.a(s5.DISMISSING);
        c();
    }

    public final void c() {
        String str;
        str = n5.f1009a;
        f6.c(str, "Removing impression");
        this.e.a(s5.NONE);
        this.e.l();
        this.g.c();
    }

    @Override // com.chartboost.sdk.impl.o5
    public void e(boolean z) {
        this.i = z;
    }

    @Override // com.chartboost.sdk.impl.o5
    public void a() {
        this.d.a(this.f994a.i());
    }
}
