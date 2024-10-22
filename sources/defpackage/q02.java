package defpackage;

import android.app.Notification;
import android.content.Context;
import android.os.Build;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public final class q02 extends v02 {

    /* renamed from: b, reason: collision with root package name */
    public IconCompat f3946b;
    public IconCompat c;
    public boolean d;

    @Override // defpackage.v02
    public final void b(h12 h12Var) {
        int i = Build.VERSION.SDK_INT;
        Notification.BigPictureStyle c = n02.c(n02.b(h12Var.f2354b), null);
        IconCompat iconCompat = this.f3946b;
        Context context = h12Var.f2353a;
        if (iconCompat != null) {
            if (i >= 31) {
                p02.a(c, iconCompat.h(context));
            } else if (iconCompat.f() == 1) {
                c = n02.a(c, this.f3946b.c());
            }
        }
        if (this.d) {
            IconCompat iconCompat2 = this.c;
            if (iconCompat2 == null) {
                n02.d(c, null);
            } else if (i >= 23) {
                o02.a(c, iconCompat2.h(context));
            } else if (iconCompat2.f() == 1) {
                n02.d(c, this.c.c());
            } else {
                n02.d(c, null);
            }
        }
        if (i >= 31) {
            p02.c(c, false);
            p02.b(c, null);
        }
    }

    @Override // defpackage.v02
    public final String c() {
        return "androidx.core.app.NotificationCompat$BigPictureStyle";
    }
}
