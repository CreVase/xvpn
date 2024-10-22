package com.security.xvpn.z35kb.util;

import a.bx;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import defpackage.hx2;

/* loaded from: classes2.dex */
public class AlarmNotifyReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("type");
        bx i = hx2.i(504);
        String u = i.u();
        i.h();
        TextUtils.equals(stringExtra, u);
        Intent intent2 = (Intent) intent.clone();
        intent2.setClass(context, NotificationCheckService.class);
        context.startService(intent2);
    }
}
