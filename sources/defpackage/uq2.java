package defpackage;

import android.app.Notification;
import android.app.Service;

/* loaded from: classes.dex */
public abstract class uq2 {
    public static void a(Service service, int i, Notification notification, int i2) {
        if (i2 != 0 && i2 != -1) {
            service.startForeground(i, notification, i2 & 1073745919);
        } else {
            service.startForeground(i, notification, i2);
        }
    }
}
