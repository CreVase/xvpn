package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class rx1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4229a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4230b;

    public /* synthetic */ rx1(int i, Object obj) {
        this.f4229a = i;
        this.f4230b = obj;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i = this.f4229a;
        Object obj = this.f4230b;
        switch (i) {
            case 0:
                fl flVar = (fl) obj;
                int i2 = ux1.f4751b;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                    if (queryLocalInterface != null && (queryLocalInterface instanceof y91)) {
                    } else {
                        new x91(iBinder);
                    }
                }
                flVar.getClass();
                flVar.getClass();
                flVar.getClass();
                throw null;
            case 1:
                az3 az3Var = (az3) obj;
                az3Var.f370b.g("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                az3Var.a().post(new wy3(this, iBinder));
                return;
            default:
                xy3 xy3Var = (xy3) obj;
                xy3Var.f5250b.a("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                xy3Var.a().post(new ky3(this, iBinder));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        int i = this.f4229a;
        int i2 = 1;
        Object obj = this.f4230b;
        switch (i) {
            case 0:
                fl flVar = (fl) obj;
                flVar.getClass();
                flVar.getClass();
                throw null;
            case 1:
                az3 az3Var = (az3) obj;
                az3Var.f370b.g("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                az3Var.a().post(new ty3(this, i2));
                return;
            default:
                xy3 xy3Var = (xy3) obj;
                xy3Var.f5250b.a("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                xy3Var.a().post(new my3(this, i2));
                return;
        }
    }
}
