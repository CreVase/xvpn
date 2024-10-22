package defpackage;

import android.util.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class bu1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f530a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x50 f531b;
    public final /* synthetic */ Pair c;

    public /* synthetic */ bu1(x50 x50Var, Pair pair, int i) {
        this.f530a = i;
        this.f531b = x50Var;
        this.c = pair;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f530a;
        Pair pair = this.c;
        x50 x50Var = this.f531b;
        switch (i) {
            case 0:
                ((uf0) ((fu1) x50Var.c).h).q(((Integer) pair.first).intValue(), (rt1) pair.second);
                return;
            case 1:
                ((uf0) ((fu1) x50Var.c).h).m(((Integer) pair.first).intValue(), (rt1) pair.second);
                return;
            case 2:
                ((uf0) ((fu1) x50Var.c).h).p(((Integer) pair.first).intValue(), (rt1) pair.second);
                return;
            default:
                ((uf0) ((fu1) x50Var.c).h).k(((Integer) pair.first).intValue(), (rt1) pair.second);
                return;
        }
    }
}
