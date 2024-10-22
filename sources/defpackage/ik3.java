package defpackage;

import android.view.Surface;

/* loaded from: classes.dex */
public final /* synthetic */ class ik3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk3 f2616a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2617b;
    public final /* synthetic */ long c;

    public /* synthetic */ ik3(jk3 jk3Var, Surface surface, long j) {
        this.f2616a = jk3Var;
        this.f2617b = surface;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jk3 jk3Var = this.f2616a;
        jk3Var.getClass();
        int i = wi3.f5017a;
        bu0 bu0Var = ((yt0) jk3Var.f2783b).f5387a;
        uf0 uf0Var = (uf0) bu0Var.q;
        wa n = uf0Var.n();
        long j = this.c;
        Object obj = this.f2617b;
        uf0Var.o(n, 26, new ei3(n, j, obj));
        if (bu0Var.M == obj) {
            bu0Var.k.l(26, new qy2(16));
        }
    }
}
