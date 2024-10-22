package defpackage;

import android.content.Context;
import android.os.Looper;

/* loaded from: classes.dex */
public final class nt0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3534a;

    /* renamed from: b, reason: collision with root package name */
    public final t43 f3535b;
    public final g33 c;
    public g33 d;
    public final g33 e;
    public g33 f;
    public final g33 g;
    public final h41 h;
    public final Looper i;
    public final qh j;
    public final int k;
    public final boolean l;
    public final mo2 m;
    public final ci0 n;
    public final long o;
    public final long p;
    public final boolean q;
    public boolean r;

    public nt0(final Context context) {
        final int i = 0;
        g33 g33Var = new g33() { // from class: lt0
            @Override // defpackage.g33
            public final Object get() {
                mg0 mg0Var;
                switch (i) {
                    case 0:
                        return new ni0(context);
                    case 1:
                        return new ii0(new pg0(context), new kh0());
                    case 2:
                        return new nj0(context);
                    default:
                        Context context2 = context;
                        ji2 ji2Var = mg0.n;
                        synchronized (mg0.class) {
                            if (mg0.t == null) {
                                lg0 lg0Var = new lg0(context2);
                                mg0.t = new mg0(lg0Var.f3118a, lg0Var.f3119b, lg0Var.c, lg0Var.d, lg0Var.e);
                            }
                            mg0Var = mg0.t;
                        }
                        return mg0Var;
                }
            }
        };
        final int i2 = 1;
        g33 g33Var2 = new g33() { // from class: lt0
            @Override // defpackage.g33
            public final Object get() {
                mg0 mg0Var;
                switch (i2) {
                    case 0:
                        return new ni0(context);
                    case 1:
                        return new ii0(new pg0(context), new kh0());
                    case 2:
                        return new nj0(context);
                    default:
                        Context context2 = context;
                        ji2 ji2Var = mg0.n;
                        synchronized (mg0.class) {
                            if (mg0.t == null) {
                                lg0 lg0Var = new lg0(context2);
                                mg0.t = new mg0(lg0Var.f3118a, lg0Var.f3119b, lg0Var.c, lg0Var.d, lg0Var.e);
                            }
                            mg0Var = mg0.t;
                        }
                        return mg0Var;
                }
            }
        };
        final int i3 = 2;
        g33 g33Var3 = new g33() { // from class: lt0
            @Override // defpackage.g33
            public final Object get() {
                mg0 mg0Var;
                switch (i3) {
                    case 0:
                        return new ni0(context);
                    case 1:
                        return new ii0(new pg0(context), new kh0());
                    case 2:
                        return new nj0(context);
                    default:
                        Context context2 = context;
                        ji2 ji2Var = mg0.n;
                        synchronized (mg0.class) {
                            if (mg0.t == null) {
                                lg0 lg0Var = new lg0(context2);
                                mg0.t = new mg0(lg0Var.f3118a, lg0Var.f3119b, lg0Var.c, lg0Var.d, lg0Var.e);
                            }
                            mg0Var = mg0.t;
                        }
                        return mg0Var;
                }
            }
        };
        mt0 mt0Var = new mt0(0);
        final int i4 = 3;
        g33 g33Var4 = new g33() { // from class: lt0
            @Override // defpackage.g33
            public final Object get() {
                mg0 mg0Var;
                switch (i4) {
                    case 0:
                        return new ni0(context);
                    case 1:
                        return new ii0(new pg0(context), new kh0());
                    case 2:
                        return new nj0(context);
                    default:
                        Context context2 = context;
                        ji2 ji2Var = mg0.n;
                        synchronized (mg0.class) {
                            if (mg0.t == null) {
                                lg0 lg0Var = new lg0(context2);
                                mg0.t = new mg0(lg0Var.f3118a, lg0Var.f3119b, lg0Var.c, lg0Var.d, lg0Var.e);
                            }
                            mg0Var = mg0.t;
                        }
                        return mg0Var;
                }
            }
        };
        ef0 ef0Var = new ef0(0);
        context.getClass();
        this.f3534a = context;
        this.c = g33Var;
        this.d = g33Var2;
        this.e = g33Var3;
        this.f = mt0Var;
        this.g = g33Var4;
        this.h = ef0Var;
        int i5 = wi3.f5017a;
        Looper myLooper = Looper.myLooper();
        this.i = myLooper == null ? Looper.getMainLooper() : myLooper;
        this.j = qh.g;
        this.k = 1;
        this.l = true;
        this.m = mo2.c;
        this.n = new ci0(wi3.C(20L), wi3.C(500L), 0.999f);
        this.f3535b = f10.f2029a;
        this.o = 500L;
        this.p = 2000L;
        this.q = true;
    }
}
