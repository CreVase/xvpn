package defpackage;

/* loaded from: classes2.dex */
public final class ty3 extends ny3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f4599b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ty3(Object obj, int i) {
        this.f4599b = i;
        this.c = obj;
    }

    @Override // defpackage.ny3
    public final void a() {
        switch (this.f4599b) {
            case 0:
                synchronized (((az3) this.c).f) {
                    if (((az3) this.c).k.get() > 0 && ((az3) this.c).k.decrementAndGet() > 0) {
                        ((az3) this.c).f370b.g("Leaving the connection open for other ongoing calls.", new Object[0]);
                        return;
                    }
                    az3 az3Var = (az3) this.c;
                    if (az3Var.m != null) {
                        az3Var.f370b.g("Unbind from service.", new Object[0]);
                        az3 az3Var2 = (az3) this.c;
                        az3Var2.f369a.unbindService(az3Var2.l);
                        Object obj = this.c;
                        ((az3) obj).g = false;
                        ((az3) obj).m = null;
                        ((az3) obj).l = null;
                    }
                    ((az3) this.c).c();
                    return;
                }
            default:
                rx1 rx1Var = (rx1) this.c;
                az3 az3Var3 = (az3) rx1Var.f4230b;
                az3Var3.f370b.g("unlinkToDeath", new Object[0]);
                az3Var3.m.asBinder().unlinkToDeath(az3Var3.j, 0);
                az3 az3Var4 = (az3) rx1Var.f4230b;
                az3Var4.m = null;
                az3Var4.g = false;
                return;
        }
    }
}
