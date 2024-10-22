package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class wy3 extends ny3 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IBinder f5087b;
    public final /* synthetic */ rx1 c;

    public wy3(rx1 rx1Var, IBinder iBinder) {
        this.c = rx1Var;
        this.f5087b = iBinder;
    }

    @Override // defpackage.ny3
    public final void a() {
        vx3 kx3Var;
        rx1 rx1Var = this.c;
        az3 az3Var = (az3) rx1Var.f4230b;
        int i = ox3.f3749b;
        IBinder iBinder = this.f5087b;
        if (iBinder == null) {
            kx3Var = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
            if (queryLocalInterface instanceof vx3) {
                kx3Var = (vx3) queryLocalInterface;
            } else {
                kx3Var = new kx3(iBinder);
            }
        }
        az3Var.m = kx3Var;
        Object obj = rx1Var.f4230b;
        az3 az3Var2 = (az3) obj;
        az3Var2.f370b.g("linkToDeath", new Object[0]);
        try {
            az3Var2.m.asBinder().linkToDeath(az3Var2.j, 0);
        } catch (RemoteException e) {
            az3Var2.f370b.f(e, "linkToDeath failed", new Object[0]);
        }
        az3 az3Var3 = (az3) obj;
        az3Var3.g = false;
        Iterator it = az3Var3.d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((az3) obj).d.clear();
    }
}
