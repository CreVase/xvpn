package defpackage;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
public final class ea1 implements zd0 {

    /* renamed from: a, reason: collision with root package name */
    public final zd0 f1904a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1905b;
    public final q92 c;
    public final byte[] d;
    public int e;

    public ea1(j13 j13Var, int i, q92 q92Var) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        this.f1904a = j13Var;
        this.f1905b = i;
        this.c = q92Var;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.zd0
    public final long c(ce0 ce0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.zd0
    public final void close() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.zd0
    public final void d(hb3 hb3Var) {
        hb3Var.getClass();
        this.f1904a.d(hb3Var);
    }

    @Override // defpackage.zd0
    public final Map k() {
        return this.f1904a.k();
    }

    @Override // defpackage.zd0
    public final Uri o() {
        return this.f1904a.o();
    }

    @Override // defpackage.wd0
    public final int read(byte[] bArr, int i, int i2) {
        long max;
        int i3 = this.e;
        zd0 zd0Var = this.f1904a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            boolean z = false;
            if (zd0Var.read(bArr2, 0, 1) != -1) {
                int i4 = (bArr2[0] & 255) << 4;
                if (i4 != 0) {
                    byte[] bArr3 = new byte[i4];
                    int i5 = i4;
                    int i6 = 0;
                    while (i5 > 0) {
                        int read = zd0Var.read(bArr3, i6, i5);
                        if (read == -1) {
                            break;
                        }
                        i6 += read;
                        i5 -= read;
                    }
                    while (i4 > 0) {
                        int i7 = i4 - 1;
                        if (bArr3[i7] != 0) {
                            break;
                        }
                        i4 = i7;
                    }
                    if (i4 > 0) {
                        r42 r42Var = new r42(bArr3, i4);
                        q92 q92Var = this.c;
                        if (!q92Var.l) {
                            max = q92Var.i;
                        } else {
                            max = Math.max(q92Var.m.s(true), q92Var.i);
                        }
                        int i8 = r42Var.c - r42Var.f4099b;
                        qm2 qm2Var = q92Var.k;
                        qm2Var.getClass();
                        qm2Var.c(i8, r42Var);
                        qm2Var.a(max, 1, i8, 0, null);
                        q92Var.l = true;
                    }
                }
                z = true;
            }
            if (!z) {
                return -1;
            }
            this.e = this.f1905b;
        }
        int read2 = zd0Var.read(bArr, i, Math.min(this.e, i2));
        if (read2 != -1) {
            this.e -= read2;
        }
        return read2;
    }
}
