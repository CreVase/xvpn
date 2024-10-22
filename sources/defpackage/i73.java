package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* loaded from: classes.dex */
public final class i73 extends ko implements Handler.Callback {
    public long A;
    public long B;
    public long C;
    public final Handler m;
    public final h73 n;
    public final y23 o;
    public final x50 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public y01 u;
    public w23 v;
    public a33 w;
    public b33 x;
    public b33 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i73(yt0 yt0Var, Looper looper) {
        super(3);
        Handler handler;
        mp0 mp0Var = y23.g0;
        this.n = yt0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i = wi3.f5017a;
            handler = new Handler(looper, this);
        }
        this.m = handler;
        this.o = mp0Var;
        this.p = new x50((u50) null);
        this.A = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
    }

    public final long A() {
        if (this.z == -1) {
            return Long.MAX_VALUE;
        }
        this.x.getClass();
        if (this.z >= this.x.d()) {
            return Long.MAX_VALUE;
        }
        return this.x.b(this.z);
    }

    public final long B(long j) {
        boolean z;
        boolean z2 = true;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        cp3.m(z);
        if (this.B == -9223372036854775807L) {
            z2 = false;
        }
        cp3.m(z2);
        return j - this.B;
    }

    public final void C(ic0 ic0Var) {
        hb1 hb1Var = ic0Var.f2565a;
        h73 h73Var = this.n;
        ((yt0) h73Var).f5387a.k.l(27, new z5(hb1Var, 15));
        bu0 bu0Var = ((yt0) h73Var).f5387a;
        bu0Var.getClass();
        bu0Var.k.l(27, new z5(ic0Var, 17));
    }

    public final void D() {
        this.w = null;
        this.z = -1;
        b33 b33Var = this.x;
        if (b33Var != null) {
            b33Var.i();
            this.x = null;
        }
        b33 b33Var2 = this.y;
        if (b33Var2 != null) {
            b33Var2.i();
            this.y = null;
        }
    }

    @Override // defpackage.ko
    public final String h() {
        return "TextRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            C((ic0) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    @Override // defpackage.ko
    public final boolean j() {
        return this.r;
    }

    @Override // defpackage.ko
    public final boolean k() {
        return true;
    }

    @Override // defpackage.ko
    public final void l() {
        this.u = null;
        this.A = -9223372036854775807L;
        z();
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
        D();
        w23 w23Var = this.v;
        w23Var.getClass();
        w23Var.release();
        this.v = null;
        this.t = 0;
    }

    @Override // defpackage.ko
    public final void n(long j, boolean z) {
        this.C = j;
        z();
        this.q = false;
        this.r = false;
        this.A = -9223372036854775807L;
        if (this.t != 0) {
            D();
            w23 w23Var = this.v;
            w23Var.getClass();
            w23Var.release();
            this.v = null;
            this.t = 0;
            this.s = true;
            y01 y01Var = this.u;
            y01Var.getClass();
            this.v = ((mp0) this.o).d(y01Var);
            return;
        }
        D();
        w23 w23Var2 = this.v;
        w23Var2.getClass();
        w23Var2.flush();
    }

    @Override // defpackage.ko
    public final void r(y01[] y01VarArr, long j, long j2) {
        this.B = j2;
        y01 y01Var = y01VarArr[0];
        this.u = y01Var;
        if (this.v != null) {
            this.t = 1;
            return;
        }
        this.s = true;
        y01Var.getClass();
        this.v = ((mp0) this.o).d(y01Var);
    }

    @Override // defpackage.ko
    public final void t(long j, long j2) {
        boolean z;
        boolean z2;
        long j3;
        x50 x50Var = this.p;
        this.C = j;
        if (this.k) {
            long j4 = this.A;
            if (j4 != -9223372036854775807L && j >= j4) {
                D();
                this.r = true;
            }
        }
        if (this.r) {
            return;
        }
        b33 b33Var = this.y;
        y23 y23Var = this.o;
        if (b33Var == null) {
            w23 w23Var = this.v;
            w23Var.getClass();
            w23Var.a(j);
            try {
                w23 w23Var2 = this.v;
                w23Var2.getClass();
                this.y = (b33) w23Var2.b();
            } catch (x23 e) {
                sn1.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.u, e);
                z();
                D();
                w23 w23Var3 = this.v;
                w23Var3.getClass();
                w23Var3.release();
                this.v = null;
                this.t = 0;
                this.s = true;
                y01 y01Var = this.u;
                y01Var.getClass();
                this.v = ((mp0) y23Var).d(y01Var);
                return;
            }
        }
        if (this.f != 2) {
            return;
        }
        if (this.x != null) {
            long A = A();
            z = false;
            while (A <= j) {
                this.z++;
                A = A();
                z = true;
            }
        } else {
            z = false;
        }
        b33 b33Var2 = this.y;
        if (b33Var2 != null) {
            if (b33Var2.g(4)) {
                if (!z && A() == Long.MAX_VALUE) {
                    if (this.t == 2) {
                        D();
                        w23 w23Var4 = this.v;
                        w23Var4.getClass();
                        w23Var4.release();
                        this.v = null;
                        this.t = 0;
                        this.s = true;
                        y01 y01Var2 = this.u;
                        y01Var2.getClass();
                        this.v = ((mp0) y23Var).d(y01Var2);
                    } else {
                        D();
                        this.r = true;
                    }
                }
            } else if (b33Var2.c <= j) {
                b33 b33Var3 = this.x;
                if (b33Var3 != null) {
                    b33Var3.i();
                }
                this.z = b33Var2.a(j);
                this.x = b33Var2;
                this.y = null;
                z = true;
            }
        }
        if (z) {
            this.x.getClass();
            int a2 = this.x.a(j);
            if (a2 != 0 && this.x.d() != 0) {
                if (a2 == -1) {
                    j3 = this.x.b(r4.d() - 1);
                } else {
                    j3 = this.x.b(a2 - 1);
                }
            } else {
                j3 = this.x.c;
            }
            ic0 ic0Var = new ic0(this.x.c(j), B(j3));
            Handler handler = this.m;
            if (handler != null) {
                handler.obtainMessage(0, ic0Var).sendToTarget();
            } else {
                C(ic0Var);
            }
        }
        if (this.t == 2) {
            return;
        }
        while (!this.q) {
            try {
                a33 a33Var = this.w;
                if (a33Var == null) {
                    w23 w23Var5 = this.v;
                    w23Var5.getClass();
                    a33Var = (a33) w23Var5.c();
                    if (a33Var == null) {
                        return;
                    } else {
                        this.w = a33Var;
                    }
                }
                if (this.t == 1) {
                    a33Var.f3342b = 4;
                    w23 w23Var6 = this.v;
                    w23Var6.getClass();
                    w23Var6.d(a33Var);
                    this.w = null;
                    this.t = 2;
                    return;
                }
                int s = s(x50Var, a33Var, 0);
                if (s == -4) {
                    if (a33Var.g(4)) {
                        this.q = true;
                        this.s = false;
                    } else {
                        y01 y01Var3 = (y01) x50Var.c;
                        if (y01Var3 == null) {
                            return;
                        }
                        a33Var.j = y01Var3.p;
                        a33Var.l();
                        boolean z3 = this.s;
                        if (!a33Var.g(1)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.s = z3 & z2;
                    }
                    if (!this.s) {
                        w23 w23Var7 = this.v;
                        w23Var7.getClass();
                        w23Var7.d(a33Var);
                        this.w = null;
                    }
                } else if (s == -3) {
                    return;
                }
            } catch (x23 e2) {
                sn1.d("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.u, e2);
                z();
                D();
                w23 w23Var8 = this.v;
                w23Var8.getClass();
                w23Var8.release();
                this.v = null;
                this.t = 0;
                this.s = true;
                y01 y01Var4 = this.u;
                y01Var4.getClass();
                this.v = ((mp0) y23Var).d(y01Var4);
                return;
            }
        }
    }

    @Override // defpackage.ko
    public final int x(y01 y01Var) {
        int i;
        if (((mp0) this.o).r(y01Var)) {
            if (y01Var.G == 0) {
                i = 4;
            } else {
                i = 2;
            }
            return p71.a(i, 0, 0);
        }
        if (vw1.h(y01Var.l)) {
            return p71.a(1, 0, 0);
        }
        return p71.a(0, 0, 0);
    }

    public final void z() {
        ic0 ic0Var = new ic0(ji2.e, B(this.C));
        Handler handler = this.m;
        if (handler != null) {
            handler.obtainMessage(0, ic0Var).sendToTarget();
        } else {
            C(ic0Var);
        }
    }
}
