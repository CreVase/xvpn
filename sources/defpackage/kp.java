package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class kp extends ar {
    public static final String h = bo1.e("BatteryNotLowTracker");

    @Override // defpackage.q70
    public final Object a() {
        Intent registerReceiver = this.f3966b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            bo1.c().b(h, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        float intExtra = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
        if (registerReceiver.getIntExtra("status", -1) == 1 || intExtra > 0.15f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ar
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.BATTERY_OKAY");
        intentFilter.addAction("android.intent.action.BATTERY_LOW");
        return intentFilter;
    }

    @Override // defpackage.ar
    public final void g(Intent intent) {
        if (intent.getAction() == null) {
            return;
        }
        bo1 c = bo1.c();
        String.format("Received %s", intent.getAction());
        c.a(new Throwable[0]);
        String action = intent.getAction();
        action.getClass();
        if (!action.equals("android.intent.action.BATTERY_OKAY")) {
            if (action.equals("android.intent.action.BATTERY_LOW")) {
                c(Boolean.FALSE);
                return;
            }
            return;
        }
        c(Boolean.TRUE);
    }
}
