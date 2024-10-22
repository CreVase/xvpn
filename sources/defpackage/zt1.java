package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class zt1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5544a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x50 f5545b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ xl1 d;
    public final /* synthetic */ et1 e;

    public /* synthetic */ zt1(x50 x50Var, Pair pair, xl1 xl1Var, et1 et1Var, int i) {
        this.f5544a = i;
        this.f5545b = x50Var;
        this.c = pair;
        this.d = xl1Var;
        this.e = et1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5544a;
        et1 et1Var = this.e;
        xl1 xl1Var = this.d;
        Pair pair = this.c;
        x50 x50Var = this.f5545b;
        switch (i) {
            case 0:
                ((uf0) ((fu1) x50Var.c).h).e(((Integer) pair.first).intValue(), (rt1) pair.second, xl1Var, et1Var);
                return;
            case 1:
                ((uf0) ((fu1) x50Var.c).h).f(((Integer) pair.first).intValue(), (rt1) pair.second, xl1Var, et1Var);
                return;
            default:
                ((uf0) ((fu1) x50Var.c).h).h(((Integer) pair.first).intValue(), (rt1) pair.second, xl1Var, et1Var);
                return;
        }
    }
}
