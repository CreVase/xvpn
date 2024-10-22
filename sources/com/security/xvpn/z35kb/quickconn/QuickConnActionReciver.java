package com.security.xvpn.z35kb.quickconn;

import a.du;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.security.xvpn.z35kb.MainActivity;
import defpackage.d5;
import defpackage.ew3;
import defpackage.o12;
import defpackage.og;
import defpackage.rt3;
import defpackage.vk0;
import defpackage.x31;

/* loaded from: classes2.dex */
public final class QuickConnActionReciver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1609a = 0;

    public final void a(Context context, int i) {
        boolean z = false;
        if (og.l1(new Integer[]{23, 17, 18, 39}, Integer.valueOf(i)) >= 0) {
            z = true;
        }
        if (!z) {
            x31 x31Var = o12.f3580a;
            d5.v(context);
        }
        ew3.b0(new vk0(this, context, i, 5));
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        int i;
        if (intent != null && (stringExtra = intent.getStringExtra("x-vpn:quick_conn")) != null) {
            int i2 = 18;
            switch (stringExtra.hashCode()) {
                case -1977836468:
                    if (stringExtra.equals("x-vpn:quick_conn:notification")) {
                        if (rt3.e().f4214b == 65286) {
                            i = 19;
                        } else {
                            i = 20;
                        }
                        if (rt3.e().f4214b == 65286) {
                            du.d(617, null);
                        }
                        a(context, i);
                        return;
                    }
                    return;
                case -1941780441:
                    if (stringExtra.equals("x-vpn:quick_conn:shortcut")) {
                        if (rt3.e().f4214b == 65286) {
                            i2 = 17;
                        }
                        if (rt3.e().f4214b == 65286) {
                            du.d(619, null);
                        }
                        a(context, i2);
                        return;
                    }
                    return;
                case -1844458907:
                    if (stringExtra.equals("x-vpn:quick_conn:widget")) {
                        if (rt3.e().f4214b == 65286) {
                            i2 = 17;
                        }
                        if (rt3.e().f4214b == 65286) {
                            du.d(618, null);
                        }
                        a(context, i2);
                        return;
                    }
                    return;
                case -1624353009:
                    if (stringExtra.equals("x-vpn:quick_conn:tile")) {
                        if (rt3.e().f4214b == 65286) {
                            i2 = 17;
                        }
                        a(context, i2);
                        return;
                    }
                    return;
                case 1192484133:
                    if (stringExtra.equals("x-vpn:quick_conn:launcherWidget")) {
                        if (rt3.e().f4214b == 65286) {
                            du.d(618, null);
                        }
                        a(context, 39);
                        return;
                    }
                    return;
                case 1286794669:
                    if (stringExtra.equals("x-vpn:quick_conn:launchApp")) {
                        Intent intent2 = new Intent(context, (Class<?>) MainActivity.class);
                        intent2.setFlags(270532608);
                        intent2.addCategory("android.intent.category.LAUNCHER");
                        context.startActivity(intent2);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
