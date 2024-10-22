package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h12 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f2353a;

    /* renamed from: b, reason: collision with root package name */
    public final Notification.Builder f2354b;
    public final u02 c;
    public final Bundle d;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Throwable, long[], java.lang.CharSequence, android.app.Notification$BubbleMetadata, android.net.Uri, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v28 */
    public h12(u02 u02Var) {
        boolean z;
        boolean z2;
        boolean z3;
        Icon h;
        ?? r3;
        int i;
        int i2;
        Bundle bundle;
        int i3;
        ArrayList arrayList;
        int i4;
        Notification.Action.Builder e;
        Bundle bundle2;
        Icon icon;
        int i5;
        Bitmap c;
        new ArrayList();
        this.d = new Bundle();
        this.c = u02Var;
        Context context = u02Var.f4607a;
        this.f2353a = context;
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26) {
            this.f2354b = d12.a(context, u02Var.t);
        } else {
            this.f2354b = new Notification.Builder(u02Var.f4607a);
        }
        Notification notification = u02Var.x;
        Resources resources = null;
        Notification.Builder lights = this.f2354b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(u02Var.e).setContentText(u02Var.f).setContentInfo(null).setContentIntent(u02Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(u02Var.i).setProgress(u02Var.m, u02Var.n, u02Var.o);
        if (i6 < 23) {
            Notification.Builder builder = this.f2354b;
            IconCompat iconCompat = u02Var.h;
            if (iconCompat == null) {
                c = null;
            } else {
                c = iconCompat.c();
            }
            builder.setLargeIcon(c);
        } else {
            Notification.Builder builder2 = this.f2354b;
            IconCompat iconCompat2 = u02Var.h;
            if (iconCompat2 == null) {
                h = null;
            } else {
                h = iconCompat2.h(context);
            }
            b12.b(builder2, h);
        }
        w02.b(w02.d(w02.c(this.f2354b, null), false), u02Var.j);
        Iterator it = u02Var.f4608b.iterator();
        while (it.hasNext()) {
            m02 m02Var = (m02) it.next();
            int i7 = Build.VERSION.SDK_INT;
            if (m02Var.f3214b == null && (i5 = m02Var.e) != 0) {
                m02Var.f3214b = IconCompat.b(null, "", i5);
            }
            IconCompat iconCompat3 = m02Var.f3214b;
            PendingIntent pendingIntent = m02Var.g;
            CharSequence charSequence = m02Var.f;
            if (i7 >= 23) {
                if (iconCompat3 != null) {
                    icon = iconCompat3.h(null);
                } else {
                    icon = null;
                }
                e = b12.a(icon, charSequence, pendingIntent);
            } else {
                if (iconCompat3 != null) {
                    i4 = iconCompat3.d();
                } else {
                    i4 = 0;
                }
                e = z02.e(i4, charSequence, pendingIntent);
            }
            Bundle bundle3 = m02Var.f3213a;
            if (bundle3 != null) {
                bundle2 = new Bundle(bundle3);
            } else {
                bundle2 = new Bundle();
            }
            boolean z4 = m02Var.c;
            bundle2.putBoolean("android.support.allowGeneratedReplies", z4);
            if (i7 >= 24) {
                c12.a(e, z4);
            }
            bundle2.putInt("android.support.action.semanticAction", 0);
            if (i7 >= 28) {
                e12.b(e, 0);
            }
            if (i7 >= 29) {
                f12.c(e, false);
            }
            if (i7 >= 31) {
                g12.a(e, false);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", m02Var.d);
            z02.b(e, bundle2);
            z02.a(this.f2354b, z02.d(e));
        }
        Bundle bundle4 = u02Var.q;
        if (bundle4 != null) {
            this.d.putAll(bundle4);
        }
        int i8 = Build.VERSION.SDK_INT;
        x02.a(this.f2354b, u02Var.k);
        z02.i(this.f2354b, u02Var.p);
        z02.g(this.f2354b, null);
        z02.j(this.f2354b, null);
        z02.h(this.f2354b, false);
        a12.b(this.f2354b, null);
        a12.c(this.f2354b, u02Var.r);
        a12.f(this.f2354b, u02Var.s);
        a12.d(this.f2354b, null);
        a12.e(this.f2354b, notification.sound, notification.audioAttributes);
        ArrayList arrayList2 = u02Var.c;
        ArrayList arrayList3 = u02Var.y;
        if (i8 < 28) {
            if (arrayList2 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList2.size());
                Iterator it2 = arrayList2.iterator();
                if (it2.hasNext()) {
                    p71.C(it2.next());
                    throw null;
                }
            }
            if (arrayList != null) {
                if (arrayList3 != null) {
                    ng ngVar = new ng(arrayList3.size() + arrayList.size());
                    ngVar.addAll(arrayList);
                    ngVar.addAll(arrayList3);
                    arrayList = new ArrayList(ngVar);
                }
                arrayList3 = arrayList;
            }
        }
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                a12.a(this.f2354b, (String) it3.next());
            }
        }
        ArrayList arrayList4 = u02Var.d;
        if (arrayList4.size() > 0) {
            if (u02Var.q == null) {
                u02Var.q = new Bundle();
            }
            Bundle bundle5 = u02Var.q.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            int i9 = 0;
            while (i9 < arrayList4.size()) {
                String num = Integer.toString(i9);
                m02 m02Var2 = (m02) arrayList4.get(i9);
                Object obj = i12.f2517a;
                Bundle bundle8 = new Bundle();
                if (m02Var2.f3214b == null && (i3 = m02Var2.e) != 0) {
                    m02Var2.f3214b = IconCompat.b(resources, "", i3);
                }
                IconCompat iconCompat4 = m02Var2.f3214b;
                if (iconCompat4 != null) {
                    i2 = iconCompat4.d();
                } else {
                    i2 = 0;
                }
                bundle8.putInt("icon", i2);
                bundle8.putCharSequence("title", m02Var2.f);
                bundle8.putParcelable("actionIntent", m02Var2.g);
                Bundle bundle9 = m02Var2.f3213a;
                if (bundle9 != null) {
                    bundle = new Bundle(bundle9);
                } else {
                    bundle = new Bundle();
                }
                bundle.putBoolean("android.support.allowGeneratedReplies", m02Var2.c);
                bundle8.putBundle("extras", bundle);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", m02Var2.d);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(num, bundle8);
                i9++;
                resources = null;
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            if (u02Var.q == null) {
                u02Var.q = new Bundle();
            }
            u02Var.q.putBundle("android.car.EXTENSIONS", bundle5);
            this.d.putBundle("android.car.EXTENSIONS", bundle6);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 24) {
            y02.a(this.f2354b, u02Var.q);
            r3 = 0;
            c12.e(this.f2354b, null);
        } else {
            r3 = 0;
        }
        if (i10 >= 26) {
            d12.b(this.f2354b, u02Var.u);
            d12.e(this.f2354b, r3);
            d12.f(this.f2354b, r3);
            d12.g(this.f2354b, 0L);
            d12.d(this.f2354b, 0);
            if (!TextUtils.isEmpty(u02Var.t)) {
                this.f2354b.setSound(r3).setDefaults(0).setLights(0, 0, 0).setVibrate(r3);
            }
        }
        if (i10 >= 28) {
            Iterator it4 = arrayList2.iterator();
            if (it4.hasNext()) {
                p71.C(it4.next());
                throw r3;
            }
        }
        if (i10 >= 29) {
            f12.a(this.f2354b, u02Var.w);
            f12.b(this.f2354b, r3);
        }
        if (i10 >= 31 && (i = u02Var.v) != 0) {
            g12.b(this.f2354b, i);
        }
    }
}
