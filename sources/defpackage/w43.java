package defpackage;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class w43 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Notification f4941b;
    public final /* synthetic */ int c;
    public final /* synthetic */ SystemForegroundService d;

    public w43(SystemForegroundService systemForegroundService, int i, Notification notification, int i2) {
        this.d = systemForegroundService;
        this.f4940a = i;
        this.f4941b = notification;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = Build.VERSION.SDK_INT;
        Notification notification = this.f4941b;
        int i2 = this.f4940a;
        SystemForegroundService systemForegroundService = this.d;
        if (i >= 29) {
            systemForegroundService.startForeground(i2, notification, this.c);
        } else {
            systemForegroundService.startForeground(i2, notification);
        }
    }
}
