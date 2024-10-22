package defpackage;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class sy0 extends r13 {
    public vy0 n;
    public ry0 o;

    @Override // defpackage.r13
    public final long b(r42 r42Var) {
        boolean z;
        byte[] bArr = r42Var.f4098a;
        if (bArr[0] == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return -1L;
        }
        int i = (bArr[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            r42Var.H(4);
            r42Var.B();
        }
        int b0 = ya0.b0(i, r42Var);
        r42Var.G(0);
        return b0;
    }

    @Override // defpackage.r13
    public final boolean c(r42 r42Var, long j, uy0 uy0Var) {
        boolean z;
        byte[] bArr = r42Var.f4098a;
        vy0 vy0Var = this.n;
        if (vy0Var == null) {
            vy0 vy0Var2 = new vy0(bArr, 17);
            this.n = vy0Var2;
            uy0Var.f4757b = vy0Var2.c(Arrays.copyOfRange(bArr, 9, r42Var.c), null);
            return true;
        }
        byte b2 = bArr[0];
        if ((b2 & Byte.MAX_VALUE) == 3) {
            uy0 P = pe0.P(r42Var);
            vy0 vy0Var3 = new vy0(vy0Var.f4912a, vy0Var.f4913b, vy0Var.c, vy0Var.d, vy0Var.e, vy0Var.g, vy0Var.h, vy0Var.j, P, vy0Var.l);
            this.n = vy0Var3;
            this.o = new ry0(vy0Var3, P);
            return true;
        }
        if (b2 == -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        ry0 ry0Var = this.o;
        if (ry0Var != null) {
            ry0Var.c = j;
            uy0Var.c = ry0Var;
        }
        ((y01) uy0Var.f4757b).getClass();
        return false;
    }

    @Override // defpackage.r13
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.o = null;
        }
    }
}
