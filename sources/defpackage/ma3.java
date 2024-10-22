package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ma3 extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public na3 f3263a;

    public ma3(na3 na3Var, na3 na3Var2) {
        this.f3263a = na3Var2;
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        na3 na3Var = this.f3263a;
        if (na3Var == null) {
            return;
        }
        if (!na3Var.c()) {
            return;
        }
        Object obj = na3.f;
        na3 na3Var2 = this.f3263a;
        na3Var2.d.f.schedule(na3Var2, 0L, TimeUnit.SECONDS);
        context.unregisterReceiver(this);
        this.f3263a = null;
    }
}
