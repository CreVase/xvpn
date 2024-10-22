package defpackage;

import android.content.Intent;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public final class n13 extends ar {
    static {
        bo1.e("StorageNotLowTracker");
    }

    @Override // defpackage.q70
    public final Object a() {
        Intent registerReceiver = this.f3966b.registerReceiver(null, f());
        if (registerReceiver != null && registerReceiver.getAction() != null) {
            String action = registerReceiver.getAction();
            action.getClass();
            if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
                if (!action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                    return null;
                }
                return Boolean.TRUE;
            }
            return Boolean.FALSE;
        }
        return Boolean.TRUE;
    }

    @Override // defpackage.ar
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
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
        if (!action.equals("android.intent.action.DEVICE_STORAGE_LOW")) {
            if (action.equals("android.intent.action.DEVICE_STORAGE_OK")) {
                c(Boolean.TRUE);
                return;
            }
            return;
        }
        c(Boolean.FALSE);
    }
}
