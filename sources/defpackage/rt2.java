package defpackage;

/* loaded from: classes2.dex */
public final /* synthetic */ class rt2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4211a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wt2 f4212b;

    public /* synthetic */ rt2(wt2 wt2Var, int i) {
        this.f4211a = i;
        this.f4212b = wt2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f4211a;
        wt2 wt2Var = this.f4212b;
        switch (i) {
            case 0:
                wt2Var.d.p.requestFocus();
                m20.J0(wt2Var.d.p);
                if (bw3.a(qu2.h, "email already exist")) {
                    wt2Var.d.p.setText(qu2.i);
                    wt2Var.d.q.setText(qu2.j);
                    qu2.h = null;
                    wt2Var.d.o("");
                    wt2Var.d.p("");
                    return;
                }
                return;
            default:
                int i2 = wt2.f;
                if (!wt2Var.isHidden()) {
                    wt2Var.d.p.requestFocus();
                    return;
                }
                return;
        }
    }
}
