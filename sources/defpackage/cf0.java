package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class cf0 {
    public int c;
    public int d;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f622a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f623b = 65536;
    public int e = 0;
    public ca[] f = new ca[100];

    public final synchronized void a(int i) {
        boolean z;
        if (i < this.c) {
            z = true;
        } else {
            z = false;
        }
        this.c = i;
        if (z) {
            b();
        }
    }

    public final synchronized void b() {
        int i = this.c;
        int i2 = this.f623b;
        int i3 = wi3.f5017a;
        int max = Math.max(0, (((i + i2) - 1) / i2) - this.d);
        int i4 = this.e;
        if (max >= i4) {
            return;
        }
        Arrays.fill(this.f, max, i4, (Object) null);
        this.e = max;
    }
}
