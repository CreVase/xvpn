package com.security.xvpn.z35kb.quickconn;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import com.security.xvpn.z35kb.R;
import defpackage.ew3;
import defpackage.op3;
import defpackage.rt3;

/* loaded from: classes2.dex */
public final class WidgetProvider extends AppWidgetProvider {
    public static final /* synthetic */ int f = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f1615a = 65285;

    /* renamed from: b, reason: collision with root package name */
    public final int f1616b = 65286;
    public final int c;
    public final op3 d;
    public final op3 e;

    public WidgetProvider() {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 201326592;
        } else {
            i = 134217728;
        }
        this.c = i;
        this.d = new op3(this, 0);
        this.e = new op3(this, 1);
    }

    @Override // android.appwidget.AppWidgetProvider, android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        String action = intent.getAction();
        if (action != null && action.hashCode() == -1156657573 && action.equals("BROADCAST_ACTION_VPN_STATE")) {
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            onUpdate(context, appWidgetManager, appWidgetManager.getAppWidgetIds(new ComponentName(context, (Class<?>) WidgetProvider.class)));
        }
    }

    @Override // android.appwidget.AppWidgetProvider
    public final void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] iArr) {
        String str;
        int i;
        int i2 = rt3.e().f4214b;
        RemoteViews remoteViews = new RemoteViews(context.getPackageName(), R.layout.app_widget);
        remoteViews.setOnClickPendingIntent(R.id.widgetPanel, (PendingIntent) this.d.invoke(context));
        remoteViews.setOnClickPendingIntent(R.id.btnConnect, (PendingIntent) this.e.invoke(context));
        remoteViews.setTextViewText(R.id.tvTitle, ew3.J(ew3.S0()));
        switch (i2) {
            case 65281:
                str = "Connecting";
                break;
            case 65282:
                str = "ON";
                break;
            case 65283:
                str = "Reconnecting";
                break;
            case 65284:
            default:
                str = "OFF";
                break;
            case 65285:
                str = "Disconnecting";
                break;
        }
        remoteViews.setTextViewText(R.id.tvState, str);
        switch (i2) {
            case 65282:
            case 65283:
                i = R.drawable.ic_app_widget_switch_on;
                break;
            default:
                i = R.drawable.ic_app_widget_switch_off;
                break;
        }
        remoteViews.setImageViewResource(R.id.btnConnect, i);
        for (int i3 : iArr) {
            appWidgetManager.updateAppWidget(i3, remoteViews);
        }
    }
}
