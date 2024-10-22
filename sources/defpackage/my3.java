package defpackage;

/* loaded from: classes2.dex */
public final class my3 extends gy3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f3376b;
    public final /* synthetic */ Object c;

    public /* synthetic */ my3(Object obj, int i) {
        this.f3376b = i;
        this.c = obj;
    }

    @Override // defpackage.gy3
    public final void a() {
        int i = this.f3376b;
        Object obj = this.c;
        switch (i) {
            case 0:
                xy3 xy3Var = (xy3) obj;
                if (xy3Var.m != null) {
                    xy3Var.f5250b.a("Unbind from service.", new Object[0]);
                    xy3Var.f5249a.unbindService(xy3Var.l);
                    xy3Var.g = false;
                    xy3Var.m = null;
                    xy3Var.l = null;
                }
                xy3Var.b();
                return;
            default:
                rx1 rx1Var = (rx1) obj;
                xy3 xy3Var2 = (xy3) rx1Var.f4230b;
                xy3Var2.f5250b.a("unlinkToDeath", new Object[0]);
                xy3Var2.m.asBinder().unlinkToDeath(xy3Var2.j, 0);
                xy3 xy3Var3 = (xy3) rx1Var.f4230b;
                xy3Var3.m = null;
                xy3Var3.g = false;
                return;
        }
    }
}
