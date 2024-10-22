package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import defpackage.uv3;

@TargetApi(26)
/* loaded from: classes.dex */
public class zzw extends zzv {
    @Override // com.google.android.gms.ads.internal.util.zzab
    public final Intent zzg(Activity activity) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APP_NOTIFICATION_SETTINGS");
        intent.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
        return intent;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final void zzh(Context context, String str, String str2) {
        Object systemService;
        NotificationChannel s = uv3.s();
        s.setShowBadge(false);
        systemService = context.getSystemService((Class<Object>) NotificationManager.class);
        ((NotificationManager) systemService).createNotificationChannel(s);
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final boolean zzi(Context context, String str) {
        Object systemService;
        NotificationChannel notificationChannel;
        int importance;
        systemService = context.getSystemService((Class<Object>) NotificationManager.class);
        notificationChannel = ((NotificationManager) systemService).getNotificationChannel("offline_notification_channel");
        if (notificationChannel != null) {
            importance = notificationChannel.getImportance();
            if (importance != 0) {
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.ads.internal.util.zzab
    public final int zzj(Context context, TelephonyManager telephonyManager) {
        boolean isDataEnabled;
        com.google.android.gms.ads.internal.zzt.zzp();
        if (zzt.zzz(context, "android.permission.ACCESS_NETWORK_STATE")) {
            isDataEnabled = telephonyManager.isDataEnabled();
            if (isDataEnabled) {
                return 2;
            }
        }
        return 1;
    }
}
