package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class qy3 implements IBinder.DeathRecipient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4077a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4078b;

    public /* synthetic */ qy3(Object obj, int i) {
        this.f4077a = i;
        this.f4078b = obj;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        switch (this.f4077a) {
            case 0:
                az3 az3Var = (az3) this.f4078b;
                az3Var.f370b.g("reportBinderDeath", new Object[0]);
                p71.C(az3Var.i.get());
                az3Var.f370b.g("%s : Binder has died.", az3Var.c);
                Iterator it = az3Var.d.iterator();
                while (it.hasNext()) {
                    ny3 ny3Var = (ny3) it.next();
                    RemoteException remoteException = new RemoteException(String.valueOf(az3Var.c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource = ny3Var.f3565a;
                    if (taskCompletionSource != null) {
                        taskCompletionSource.trySetException(remoteException);
                    }
                }
                az3Var.d.clear();
                synchronized (az3Var.f) {
                    az3Var.c();
                }
                return;
            default:
                xy3 xy3Var = (xy3) this.f4078b;
                xy3Var.f5250b.a("reportBinderDeath", new Object[0]);
                p71.C(xy3Var.i.get());
                xy3Var.f5250b.a("%s : Binder has died.", xy3Var.c);
                ArrayList arrayList = xy3Var.d;
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    gy3 gy3Var = (gy3) it2.next();
                    RemoteException remoteException2 = new RemoteException(String.valueOf(xy3Var.c).concat(" : Binder has died."));
                    TaskCompletionSource taskCompletionSource2 = gy3Var.f2342a;
                    if (taskCompletionSource2 != null) {
                        taskCompletionSource2.trySetException(remoteException2);
                    }
                }
                arrayList.clear();
                xy3Var.b();
                return;
        }
    }
}
