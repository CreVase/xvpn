package defpackage;

import android.app.PendingIntent;

/* loaded from: classes2.dex */
public final class sf {

    /* renamed from: a, reason: collision with root package name */
    public final int f4329a;

    /* renamed from: b, reason: collision with root package name */
    public final long f4330b;
    public final long c;
    public final PendingIntent d;
    public final PendingIntent e;
    public final PendingIntent f;
    public final PendingIntent g;
    public boolean h = false;

    public sf(int i, long j, long j2, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f4329a = i;
        this.f4330b = j;
        this.c = j2;
        this.d = pendingIntent;
        this.e = pendingIntent2;
        this.f = pendingIntent3;
        this.g = pendingIntent4;
    }

    public final PendingIntent a(bz3 bz3Var) {
        long j = this.c;
        long j2 = this.f4330b;
        boolean z = false;
        boolean z2 = bz3Var.f558b;
        int i = bz3Var.f557a;
        if (i == 0) {
            PendingIntent pendingIntent = this.e;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (z2 && j2 <= j) {
                z = true;
            }
            if (!z) {
                return null;
            }
            return this.g;
        }
        if (i == 1) {
            PendingIntent pendingIntent2 = this.d;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (z2 && j2 <= j) {
                z = true;
            }
            if (z) {
                return this.f;
            }
        }
        return null;
    }
}
