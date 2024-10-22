package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class v10 extends pe0 {
    public static final Logger r = Logger.getLogger(v10.class.getName());
    public static final boolean s = zh3.f;
    public v51 q;

    public static int Y(int i) {
        return p0(i) + 1;
    }

    public static int Z(int i, vs vsVar) {
        int p0 = p0(i);
        int size = vsVar.size();
        return r0(size) + size + p0;
    }

    public static int a0(int i) {
        return p0(i) + 8;
    }

    public static int b0(int i, int i2) {
        return h0(i2) + p0(i);
    }

    public static int c0(int i) {
        return p0(i) + 4;
    }

    public static int d0(int i) {
        return p0(i) + 8;
    }

    public static int e0(int i) {
        return p0(i) + 4;
    }

    public static int f0(int i, i1 i1Var, mn2 mn2Var) {
        return i1Var.b(mn2Var) + (p0(i) * 2);
    }

    public static int g0(int i, int i2) {
        return h0(i2) + p0(i);
    }

    public static int h0(int i) {
        if (i >= 0) {
            return r0(i);
        }
        return 10;
    }

    public static int i0(int i, long j) {
        return t0(j) + p0(i);
    }

    public static int j0(int i) {
        return p0(i) + 4;
    }

    public static int k0(int i) {
        return p0(i) + 8;
    }

    public static int l0(int i, int i2) {
        return r0((i2 >> 31) ^ (i2 << 1)) + p0(i);
    }

    public static int m0(int i, long j) {
        return t0((j >> 63) ^ (j << 1)) + p0(i);
    }

    public static int n0(int i, String str) {
        return o0(str) + p0(i);
    }

    public static int o0(String str) {
        int length;
        try {
            length = ui3.b(str);
        } catch (si3 unused) {
            length = str.getBytes(yd1.f5317a).length;
        }
        return r0(length) + length;
    }

    public static int p0(int i) {
        return r0((i << 3) | 0);
    }

    public static int q0(int i, int i2) {
        return r0(i2) + p0(i);
    }

    public static int r0(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int s0(int i, long j) {
        return t0(j) + p0(i);
    }

    public static int t0(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public abstract void A0(int i, int i2);

    public abstract void B0(int i);

    public abstract void C0(int i, long j);

    public abstract void D0(long j);

    public abstract void E0(int i, int i2);

    public abstract void F0(int i);

    public abstract void G0(int i, i1 i1Var, mn2 mn2Var);

    public abstract void H0(i1 i1Var);

    public abstract void I0(int i, String str);

    public abstract void J0(String str);

    public abstract void K0(int i, int i2);

    public abstract void L0(int i, int i2);

    public abstract void M0(int i);

    public abstract void N0(int i, long j);

    public abstract void O0(long j);

    public final void u0(String str, si3 si3Var) {
        r.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) si3Var);
        byte[] bytes = str.getBytes(yd1.f5317a);
        try {
            M0(bytes.length);
            X(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e) {
            throw new t10(e);
        } catch (t10 e2) {
            throw e2;
        }
    }

    public abstract void v0(byte b2);

    public abstract void w0(int i, boolean z);

    public abstract void x0(byte[] bArr, int i);

    public abstract void y0(int i, vs vsVar);

    public abstract void z0(vs vsVar);
}
