package defpackage;

/* loaded from: classes.dex */
public final class lc3 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f3103a = new byte[10];

    /* renamed from: b, reason: collision with root package name */
    public boolean f3104b;
    public int c;
    public long d;
    public int e;
    public int f;
    public int g;

    public final void a(xa3 xa3Var, wa3 wa3Var) {
        if (this.c > 0) {
            xa3Var.a(this.d, this.e, this.f, this.g, wa3Var);
            this.c = 0;
        }
    }

    public final void b(xa3 xa3Var, long j, int i, int i2, int i3, wa3 wa3Var) {
        boolean z;
        if (this.g <= i2 + i3) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (!this.f3104b) {
                return;
            }
            int i4 = this.c;
            int i5 = i4 + 1;
            this.c = i5;
            if (i4 == 0) {
                this.d = j;
                this.e = i;
                this.f = 0;
            }
            this.f += i2;
            this.g = i3;
            if (i5 >= 16) {
                a(xa3Var, wa3Var);
                return;
            }
            return;
        }
        throw new IllegalStateException("TrueHD chunk samples must be contiguous in the sample queue.");
    }

    public final void c(ev0 ev0Var) {
        char c;
        if (this.f3104b) {
            return;
        }
        int i = 0;
        byte[] bArr = this.f3103a;
        ev0Var.b(0, bArr, 10);
        ev0Var.l();
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                if ((b2 & 255) == 187) {
                    i = 1;
                }
                if (i != 0) {
                    c = '\t';
                } else {
                    c = '\b';
                }
                i = 40 << ((bArr[c] >> 4) & 7);
            }
        }
        if (i == 0) {
            return;
        }
        this.f3104b = true;
    }
}
