package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class u02 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f4607a;
    public CharSequence e;
    public CharSequence f;
    public PendingIntent g;
    public IconCompat h;
    public int i;
    public int j;
    public v02 l;
    public int m;
    public int n;
    public boolean o;
    public Bundle q;
    public String t;
    public final boolean w;
    public final Notification x;
    public final ArrayList y;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4608b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public boolean k = true;
    public boolean p = false;
    public int r = 0;
    public int s = 0;
    public int u = 0;
    public int v = 0;

    public u02(Context context, String str) {
        Notification notification = new Notification();
        this.x = notification;
        this.f4607a = context;
        this.t = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.j = 0;
        this.y = new ArrayList();
        this.w = true;
    }

    public static CharSequence b(String str) {
        if (str == null) {
            return str;
        }
        if (str.length() > 5120) {
            return str.subSequence(0, 5120);
        }
        return str;
    }

    public final Notification a() {
        Notification a2;
        Bundle bundle;
        h12 h12Var = new h12(this);
        u02 u02Var = h12Var.c;
        v02 v02Var = u02Var.l;
        if (v02Var != null) {
            v02Var.b(h12Var);
        }
        int i = Build.VERSION.SDK_INT;
        Notification.Builder builder = h12Var.f2354b;
        if (i >= 26) {
            a2 = w02.a(builder);
        } else if (i >= 24) {
            a2 = w02.a(builder);
        } else {
            y02.a(builder, h12Var.d);
            a2 = w02.a(builder);
        }
        if (v02Var != null) {
            u02Var.l.getClass();
        }
        if (v02Var != null && (bundle = a2.extras) != null) {
            v02Var.a(bundle);
        }
        return a2;
    }

    public final void c(String str) {
        this.e = b(str);
    }

    public final void d(int i, boolean z) {
        Notification notification = this.x;
        if (z) {
            notification.flags = i | notification.flags;
        } else {
            notification.flags = (~i) & notification.flags;
        }
    }

    public final void e(Bitmap bitmap) {
        IconCompat iconCompat;
        if (bitmap == null) {
            iconCompat = null;
        } else {
            if (Build.VERSION.SDK_INT < 27) {
                Resources resources = this.f4607a.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(pe2.compat_notification_large_icon_max_width);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(pe2.compat_notification_large_icon_max_height);
                if (bitmap.getWidth() > dimensionPixelSize || bitmap.getHeight() > dimensionPixelSize2) {
                    double min = Math.min(dimensionPixelSize / Math.max(1, bitmap.getWidth()), dimensionPixelSize2 / Math.max(1, bitmap.getHeight()));
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(bitmap.getWidth() * min), (int) Math.ceil(bitmap.getHeight() * min), true);
                }
            }
            PorterDuff.Mode mode = IconCompat.k;
            bitmap.getClass();
            IconCompat iconCompat2 = new IconCompat(1);
            iconCompat2.f195b = bitmap;
            iconCompat = iconCompat2;
        }
        this.h = iconCompat;
    }

    public final void f(v02 v02Var) {
        if (this.l != v02Var) {
            this.l = v02Var;
            if (v02Var != null && v02Var.f4768a != this) {
                v02Var.f4768a = this;
                f(v02Var);
            }
        }
    }
}
