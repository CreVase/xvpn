package defpackage;

import android.window.BackEvent;

/* loaded from: classes.dex */
public final class tm {

    /* renamed from: a, reason: collision with root package name */
    public final float f4531a;

    /* renamed from: b, reason: collision with root package name */
    public final float f4532b;
    public final float c;
    public final int d;

    public tm(BackEvent backEvent) {
        wb wbVar = wb.f4974a;
        float d = wbVar.d(backEvent);
        float e = wbVar.e(backEvent);
        float b2 = wbVar.b(backEvent);
        int c = wbVar.c(backEvent);
        this.f4531a = d;
        this.f4532b = e;
        this.c = b2;
        this.d = c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f4531a + ", touchY=" + this.f4532b + ", progress=" + this.c + ", swipeEdge=" + this.d + '}';
    }
}
