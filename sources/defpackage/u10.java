package defpackage;

import java.io.OutputStream;

/* loaded from: classes.dex */
public final class u10 extends v10 {
    public final byte[] t;
    public final int u;
    public int v;
    public final OutputStream w;

    public u10(ev2 ev2Var, int i) {
        if (i >= 0) {
            int max = Math.max(i, 20);
            this.t = new byte[max];
            this.u = max;
            this.w = ev2Var;
            return;
        }
        throw new IllegalArgumentException("bufferSize must be >= 0");
    }

    @Override // defpackage.v10
    public final void A0(int i, int i2) {
        V0(14);
        R0(i, 5);
        P0(i2);
    }

    @Override // defpackage.v10
    public final void B0(int i) {
        V0(4);
        P0(i);
    }

    @Override // defpackage.v10
    public final void C0(int i, long j) {
        V0(18);
        R0(i, 1);
        Q0(j);
    }

    @Override // defpackage.v10
    public final void D0(long j) {
        V0(8);
        Q0(j);
    }

    @Override // defpackage.v10
    public final void E0(int i, int i2) {
        V0(20);
        R0(i, 0);
        if (i2 >= 0) {
            S0(i2);
        } else {
            T0(i2);
        }
    }

    @Override // defpackage.v10
    public final void F0(int i) {
        if (i >= 0) {
            M0(i);
        } else {
            O0(i);
        }
    }

    @Override // defpackage.v10
    public final void G0(int i, i1 i1Var, mn2 mn2Var) {
        K0(i, 2);
        M0(i1Var.b(mn2Var));
        mn2Var.b(i1Var, this.q);
    }

    @Override // defpackage.v10
    public final void H0(i1 i1Var) {
        M0(i1Var.a());
        i1Var.c(this);
    }

    @Override // defpackage.v10
    public final void I0(int i, String str) {
        K0(i, 2);
        J0(str);
    }

    @Override // defpackage.v10
    public final void J0(String str) {
        try {
            int length = str.length() * 3;
            int r0 = v10.r0(length);
            int i = r0 + length;
            int i2 = this.u;
            if (i > i2) {
                byte[] bArr = new byte[length];
                int Z = ui3.f4677a.Z(str, bArr, 0, length);
                M0(Z);
                W0(bArr, 0, Z);
                return;
            }
            if (i > i2 - this.v) {
                U0();
            }
            int r02 = v10.r0(str.length());
            int i3 = this.v;
            byte[] bArr2 = this.t;
            try {
                try {
                    if (r02 == r0) {
                        int i4 = i3 + r02;
                        this.v = i4;
                        int Z2 = ui3.f4677a.Z(str, bArr2, i4, i2 - i4);
                        this.v = i3;
                        S0((Z2 - i3) - r02);
                        this.v = Z2;
                    } else {
                        int b2 = ui3.b(str);
                        S0(b2);
                        this.v = ui3.f4677a.Z(str, bArr2, this.v, b2);
                    }
                } catch (ArrayIndexOutOfBoundsException e) {
                    throw new t10(e);
                }
            } catch (si3 e2) {
                this.v = i3;
                throw e2;
            }
        } catch (si3 e3) {
            u0(str, e3);
        }
    }

    @Override // defpackage.v10
    public final void K0(int i, int i2) {
        M0((i << 3) | i2);
    }

    @Override // defpackage.v10
    public final void L0(int i, int i2) {
        V0(20);
        R0(i, 0);
        S0(i2);
    }

    @Override // defpackage.v10
    public final void M0(int i) {
        V0(5);
        S0(i);
    }

    @Override // defpackage.v10
    public final void N0(int i, long j) {
        V0(20);
        R0(i, 0);
        T0(j);
    }

    @Override // defpackage.v10
    public final void O0(long j) {
        V0(10);
        T0(j);
    }

    public final void P0(int i) {
        int i2 = this.v;
        int i3 = i2 + 1;
        byte[] bArr = this.t;
        bArr[i2] = (byte) (i & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >> 8) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >> 16) & 255);
        this.v = i5 + 1;
        bArr[i5] = (byte) ((i >> 24) & 255);
    }

    public final void Q0(long j) {
        int i = this.v;
        int i2 = i + 1;
        byte[] bArr = this.t;
        bArr[i] = (byte) (j & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >> 8) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (255 & (j >> 24));
        int i6 = i5 + 1;
        bArr[i5] = (byte) (((int) (j >> 32)) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (((int) (j >> 40)) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (((int) (j >> 48)) & 255);
        this.v = i8 + 1;
        bArr[i8] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void R0(int i, int i2) {
        S0((i << 3) | i2);
    }

    public final void S0(int i) {
        boolean z = v10.s;
        byte[] bArr = this.t;
        if (z) {
            while ((i & (-128)) != 0) {
                int i2 = this.v;
                this.v = i2 + 1;
                zh3.p(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            int i3 = this.v;
            this.v = i3 + 1;
            zh3.p(bArr, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            int i4 = this.v;
            this.v = i4 + 1;
            bArr[i4] = (byte) ((i & 127) | 128);
            i >>>= 7;
        }
        int i5 = this.v;
        this.v = i5 + 1;
        bArr[i5] = (byte) i;
    }

    public final void T0(long j) {
        boolean z = v10.s;
        byte[] bArr = this.t;
        if (z) {
            while ((j & (-128)) != 0) {
                int i = this.v;
                this.v = i + 1;
                zh3.p(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            int i2 = this.v;
            this.v = i2 + 1;
            zh3.p(bArr, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i3 = this.v;
            this.v = i3 + 1;
            bArr[i3] = (byte) ((((int) j) & 127) | 128);
            j >>>= 7;
        }
        int i4 = this.v;
        this.v = i4 + 1;
        bArr[i4] = (byte) j;
    }

    public final void U0() {
        this.w.write(this.t, 0, this.v);
        this.v = 0;
    }

    public final void V0(int i) {
        if (this.u - this.v < i) {
            U0();
        }
    }

    public final void W0(byte[] bArr, int i, int i2) {
        int i3 = this.v;
        int i4 = this.u;
        int i5 = i4 - i3;
        byte[] bArr2 = this.t;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, bArr2, i3, i2);
            this.v += i2;
            return;
        }
        System.arraycopy(bArr, i, bArr2, i3, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.v = i4;
        U0();
        if (i7 <= i4) {
            System.arraycopy(bArr, i6, bArr2, 0, i7);
            this.v = i7;
        } else {
            this.w.write(bArr, i6, i7);
        }
    }

    @Override // defpackage.pe0
    public final void X(byte[] bArr, int i, int i2) {
        W0(bArr, i, i2);
    }

    @Override // defpackage.v10
    public final void v0(byte b2) {
        if (this.v == this.u) {
            U0();
        }
        int i = this.v;
        this.v = i + 1;
        this.t[i] = b2;
    }

    @Override // defpackage.v10
    public final void w0(int i, boolean z) {
        V0(11);
        R0(i, 0);
        byte b2 = z ? (byte) 1 : (byte) 0;
        int i2 = this.v;
        this.v = i2 + 1;
        this.t[i2] = b2;
    }

    @Override // defpackage.v10
    public final void x0(byte[] bArr, int i) {
        M0(i);
        W0(bArr, 0, i);
    }

    @Override // defpackage.v10
    public final void y0(int i, vs vsVar) {
        K0(i, 2);
        z0(vsVar);
    }

    @Override // defpackage.v10
    public final void z0(vs vsVar) {
        M0(vsVar.size());
        xs xsVar = (xs) vsVar;
        X(xsVar.d, xsVar.j(), xsVar.size());
    }
}
