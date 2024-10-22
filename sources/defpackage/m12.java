package defpackage;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class m12 extends ji1 implements x31 {
    public static final m12 f = new m12();

    public m12() {
        super(1);
    }

    @Override // defpackage.x31
    public final Object invoke(Object obj) {
        String id;
        boolean z;
        Context context = (Context) obj;
        if (Build.VERSION.SDK_INT >= 26 && !o12.e.get()) {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            Iterable arrayList = new ArrayList();
            try {
                arrayList = notificationManager.getNotificationChannels();
            } catch (Exception e) {
                bx3.M(e);
            }
            Iterable iterable = arrayList;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    id = z51.d(it.next()).getId();
                    if (m20.L(id, "VPN Connect Status")) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (!z) {
                z51.r();
                NotificationChannel c = z51.c();
                c.setShowBadge(false);
                notificationManager.createNotificationChannel(c);
            }
            o12.e.set(true);
        }
        return ch3.f636a;
    }
}
