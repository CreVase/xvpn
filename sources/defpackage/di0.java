package defpackage;

/* loaded from: classes.dex */
public final class di0 implements wl1 {

    /* renamed from: a, reason: collision with root package name */
    public final cf0 f1786a;

    /* renamed from: b, reason: collision with root package name */
    public final long f1787b;
    public final long c;
    public final long d;
    public final long e;
    public final int f;
    public final boolean g;
    public final long h;
    public final boolean i;
    public int j;
    public boolean k;

    public di0(cf0 cf0Var, int i, int i2, int i3, int i4) {
        a(i3, 0, "bufferForPlaybackMs", "0");
        a(i4, 0, "bufferForPlaybackAfterRebufferMs", "0");
        a(i, i3, "minBufferMs", "bufferForPlaybackMs");
        a(i, i4, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        a(i2, i, "maxBufferMs", "minBufferMs");
        a(0, 0, "backBufferDurationMs", "0");
        this.f1786a = cf0Var;
        this.f1787b = wi3.C(i);
        this.c = wi3.C(i2);
        this.d = wi3.C(i3);
        this.e = wi3.C(i4);
        this.f = -1;
        this.j = 13107200;
        this.g = false;
        this.h = wi3.C(0);
        this.i = false;
    }

    public static void a(int i, int i2, String str, String str2) {
        boolean z;
        if (i >= i2) {
            z = true;
        } else {
            z = false;
        }
        cp3.f(z, str + " cannot be less than " + str2);
    }

    public final void b(boolean z) {
        int i = this.f;
        if (i == -1) {
            i = 13107200;
        }
        this.j = i;
        this.k = false;
        if (z) {
            cf0 cf0Var = this.f1786a;
            synchronized (cf0Var) {
                if (cf0Var.f622a) {
                    cf0Var.a(0);
                }
            }
        }
    }

    public final boolean c(long j, float f) {
        int i;
        boolean z;
        cf0 cf0Var = this.f1786a;
        synchronized (cf0Var) {
            i = cf0Var.d * cf0Var.f623b;
        }
        boolean z2 = true;
        if (i >= this.j) {
            z = true;
        } else {
            z = false;
        }
        long j2 = this.c;
        long j3 = this.f1787b;
        if (f > 1.0f) {
            j3 = Math.min(wi3.q(j3, f), j2);
        }
        if (j < Math.max(j3, 500000L)) {
            if (!this.g && z) {
                z2 = false;
            }
            this.k = z2;
            if (!z2 && j < 500000) {
                sn1.f();
            }
        } else if (j >= j2 || z) {
            this.k = false;
        }
        return this.k;
    }
}
