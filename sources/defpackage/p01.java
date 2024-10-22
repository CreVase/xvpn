package defpackage;

import android.app.Notification;

/* loaded from: classes.dex */
public final class p01 {

    /* renamed from: a, reason: collision with root package name */
    public final int f3760a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3761b;
    public final Notification c;

    public p01(int i, int i2, Notification notification) {
        this.f3760a = i;
        this.c = notification;
        this.f3761b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p01.class != obj.getClass()) {
            return false;
        }
        p01 p01Var = (p01) obj;
        if (this.f3760a != p01Var.f3760a || this.f3761b != p01Var.f3761b) {
            return false;
        }
        return this.c.equals(p01Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.f3760a * 31) + this.f3761b) * 31);
    }

    public final String toString() {
        return "ForegroundInfo{mNotificationId=" + this.f3760a + ", mForegroundServiceType=" + this.f3761b + ", mNotification=" + this.c + '}';
    }
}
