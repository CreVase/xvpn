package defpackage;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;

/* loaded from: classes.dex */
public final class jp extends ar {
    public static final String h = bo1.e("BatteryChrgTracker");

    @Override // defpackage.q70
    public final Object a() {
        int intExtra;
        Intent registerReceiver = this.f3966b.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver == null) {
            bo1.c().b(h, "getInitialState - null intent received", new Throwable[0]);
            return null;
        }
        if (Build.VERSION.SDK_INT < 23 ? registerReceiver.getIntExtra("plugged", 0) != 0 : !((intExtra = registerReceiver.getIntExtra("status", -1)) != 2 && intExtra != 5)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ar
    public final IntentFilter f() {
        IntentFilter intentFilter = new IntentFilter();
        if (Build.VERSION.SDK_INT >= 23) {
            intentFilter.addAction("android.os.action.CHARGING");
            intentFilter.addAction("android.os.action.DISCHARGING");
        } else {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        return intentFilter;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004c, code lost:            if (r6.equals("android.intent.action.ACTION_POWER_DISCONNECTED") == false) goto L22;     */
    @Override // defpackage.ar
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(android.content.Intent r6) {
        /*
            r5 = this;
            java.lang.String r6 = r6.getAction()
            if (r6 != 0) goto L7
            return
        L7:
            bo1 r0 = defpackage.bo1.c()
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r6
            java.lang.String r4 = "Received %s"
            java.lang.String.format(r4, r2)
            java.lang.Throwable[] r2 = new java.lang.Throwable[r3]
            r0.a(r2)
            int r0 = r6.hashCode()
            r2 = 3
            r4 = 2
            switch(r0) {
                case -1886648615: goto L46;
                case -54942926: goto L3b;
                case 948344062: goto L30;
                case 1019184907: goto L25;
                default: goto L24;
            }
        L24:
            goto L4e
        L25:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_CONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L2e
            goto L4e
        L2e:
            r3 = 3
            goto L4f
        L30:
            java.lang.String r0 = "android.os.action.CHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L39
            goto L4e
        L39:
            r3 = 2
            goto L4f
        L3b:
            java.lang.String r0 = "android.os.action.DISCHARGING"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L44
            goto L4e
        L44:
            r3 = 1
            goto L4f
        L46:
            java.lang.String r0 = "android.intent.action.ACTION_POWER_DISCONNECTED"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L4f
        L4e:
            r3 = -1
        L4f:
            if (r3 == 0) goto L6a
            if (r3 == r1) goto L64
            if (r3 == r4) goto L5e
            if (r3 == r2) goto L58
            goto L6f
        L58:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            goto L6f
        L5e:
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.c(r6)
            goto L6f
        L64:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
            goto L6f
        L6a:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.c(r6)
        L6f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp.g(android.content.Intent):void");
    }
}
