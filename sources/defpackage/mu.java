package defpackage;

import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class mu extends ko {
    public final ve0 m;
    public final r42 n;
    public long o;
    public zt0 p;
    public long q;

    public mu() {
        super(6);
        this.m = new ve0(1);
        this.n = new r42();
    }

    @Override // defpackage.ko, defpackage.b62
    public final void c(int i, Object obj) {
        if (i == 8) {
            this.p = (zt0) obj;
        }
    }

    @Override // defpackage.ko
    public final String h() {
        return "CameraMotionRenderer";
    }

    @Override // defpackage.ko
    public final boolean j() {
        return i();
    }

    @Override // defpackage.ko
    public final boolean k() {
        return true;
    }

    @Override // defpackage.ko
    public final void l() {
        zt0 zt0Var = this.p;
        if (zt0Var != null) {
            zt0Var.b();
        }
    }

    @Override // defpackage.ko
    public final void n(long j, boolean z) {
        this.q = Long.MIN_VALUE;
        zt0 zt0Var = this.p;
        if (zt0Var != null) {
            zt0Var.b();
        }
    }

    @Override // defpackage.ko
    public final void r(y01[] y01VarArr, long j, long j2) {
        this.o = j2;
    }

    @Override // defpackage.ko
    public final void t(long j, long j2) {
        float[] fArr;
        while (!i() && this.q < 100000 + j) {
            ve0 ve0Var = this.m;
            ve0Var.i();
            x50 x50Var = this.f2984b;
            x50Var.j();
            if (s(x50Var, ve0Var, 0) == -4 && !ve0Var.g(4)) {
                this.q = ve0Var.f;
                if (this.p != null && !ve0Var.h()) {
                    ve0Var.l();
                    ByteBuffer byteBuffer = ve0Var.d;
                    int i = wi3.f5017a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        r42 r42Var = this.n;
                        r42Var.E(limit, array);
                        r42Var.G(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i2 = 0; i2 < 3; i2++) {
                            fArr2[i2] = Float.intBitsToFloat(r42Var.i());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.p.a(fArr, this.q - this.o);
                    }
                }
            } else {
                return;
            }
        }
    }

    @Override // defpackage.ko
    public final int x(y01 y01Var) {
        if ("application/x-camera-motion".equals(y01Var.l)) {
            return p71.a(4, 0, 0);
        }
        return p71.a(0, 0, 0);
    }
}
