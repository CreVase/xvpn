package defpackage;

import android.app.Notification;
import android.app.NotificationChannel;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* loaded from: classes.dex */
public abstract /* synthetic */ class uv3 {
    public static /* synthetic */ Notification.Builder c(Context context) {
        return new Notification.Builder(context, "VPN_Service_Notification");
    }

    public static /* synthetic */ NotificationChannel d() {
        return new NotificationChannel("VPN_Service_Notification", "VPN Service Notification", 2);
    }

    public static /* bridge */ /* synthetic */ void m(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        context.registerReceiver(broadcastReceiver, intentFilter, 4);
    }

    public static /* synthetic */ NotificationChannel s() {
        return new NotificationChannel("offline_notification_channel", "AdMob Offline Notifications", 2);
    }
}
