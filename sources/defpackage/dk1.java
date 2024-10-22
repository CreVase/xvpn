package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public abstract class dk1 extends Service implements bk1 {

    /* renamed from: a, reason: collision with root package name */
    public final y33 f1797a = new y33(this);

    @Override // defpackage.bk1
    public final vj1 getLifecycle() {
        return (ck1) this.f1797a.f5263b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        this.f1797a.D(tj1.ON_START);
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f1797a.D(tj1.ON_CREATE);
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        tj1 tj1Var = tj1.ON_STOP;
        y33 y33Var = this.f1797a;
        y33Var.D(tj1Var);
        y33Var.D(tj1.ON_DESTROY);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        this.f1797a.D(tj1.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        return super.onStartCommand(intent, i, i2);
    }
}
