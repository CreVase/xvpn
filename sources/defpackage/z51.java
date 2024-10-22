package defpackage;

import android.app.NotificationChannel;

/* loaded from: classes.dex */
public abstract /* synthetic */ class z51 {
    public static /* synthetic */ NotificationChannel c() {
        return new NotificationChannel("VPN Connect Status", "VPN Status Notification", 2);
    }

    public static /* bridge */ /* synthetic */ NotificationChannel d(Object obj) {
        return (NotificationChannel) obj;
    }

    public static /* synthetic */ NotificationChannel e(String str) {
        return new NotificationChannel("com.google.android.gms.availability", str, 4);
    }

    public static /* synthetic */ NotificationChannel f(String str, String str2) {
        return new NotificationChannel(str, str2, 2);
    }

    public static /* synthetic */ void r() {
    }
}
