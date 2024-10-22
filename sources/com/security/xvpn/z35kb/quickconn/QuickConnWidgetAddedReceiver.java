package com.security.xvpn.z35kb.quickconn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import com.security.xvpn.z35kb.R;
import defpackage.m20;
import defpackage.pd0;

/* loaded from: classes2.dex */
public final class QuickConnWidgetAddedReceiver extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1612a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (m20.L(action, "ACTION_WIDGET_ADDED")) {
            Toast.makeText(context, pd0.y(R.string.AdvancedWidgetAdded), 0).show();
        } else if (m20.L(action, "ACTION_SHORTCUTS_ADDED")) {
            Toast.makeText(context, pd0.y(R.string.SimpleWidgetAdded), 0).show();
        }
    }
}
