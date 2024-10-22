package defpackage;

/* loaded from: classes.dex */
public final class ij3 {
    public static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f2610a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public int f2611b;
    public int c;

    public static long a(byte[] bArr, int i, boolean z) {
        long j = bArr[0] & 255;
        if (z) {
            j &= ~d[i - 1];
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final long b(ev0 ev0Var, boolean z, boolean z2, int i) {
        int i2;
        int i3 = this.f2611b;
        byte[] bArr = this.f2610a;
        if (i3 == 0) {
            if (!ev0Var.a(bArr, 0, 1, z)) {
                return -1L;
            }
            int i4 = bArr[0] & 255;
            int i5 = 0;
            while (true) {
                if (i5 < 8) {
                    if ((d[i5] & i4) != 0) {
                        i2 = i5 + 1;
                        break;
                    }
                    i5++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            this.c = i2;
            if (i2 != -1) {
                this.f2611b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i6 = this.c;
        if (i6 > i) {
            this.f2611b = 0;
            return -2L;
        }
        if (i6 != 1) {
            ev0Var.readFully(bArr, 1, i6 - 1);
        }
        this.f2611b = 0;
        return a(bArr, this.c, z2);
    }
}
