package defpackage;

import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.EOFException;
import java.util.Objects;

/* loaded from: classes.dex */
public final class qm2 implements xa3 {
    public boolean A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final mm2 f4022a;
    public final xn0 d;
    public final un0 e;
    public pm2 f;
    public y01 g;
    public rn0 h;
    public int p;
    public int q;
    public int r;
    public int s;
    public boolean w;
    public y01 z;

    /* renamed from: b, reason: collision with root package name */
    public final nm2 f4023b = new nm2();
    public int i = 1000;
    public int[] j = new int[1000];
    public long[] k = new long[1000];
    public long[] n = new long[1000];
    public int[] m = new int[1000];
    public int[] l = new int[1000];
    public wa3[] o = new wa3[1000];
    public final f30 c = new f30(new ef0(4));
    public long t = Long.MIN_VALUE;
    public long u = Long.MIN_VALUE;
    public long v = Long.MIN_VALUE;
    public boolean y = true;
    public boolean x = true;

    public qm2(cf0 cf0Var, xn0 xn0Var, un0 un0Var) {
        this.d = xn0Var;
        this.e = un0Var;
        this.f4022a = new mm2(cf0Var);
    }

    @Override // defpackage.xa3
    public final void a(long j, int i, int i2, int i3, wa3 wa3Var) {
        boolean z;
        boolean z2;
        boolean z3;
        wn0 wn0Var;
        boolean z4;
        int i4 = i & 1;
        if (i4 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.x) {
            if (!z) {
                return;
            } else {
                this.x = false;
            }
        }
        long j2 = j + 0;
        if (this.A) {
            if (j2 < this.t) {
                return;
            }
            if (i4 == 0) {
                if (!this.B) {
                    Objects.toString(this.z);
                    sn1.f();
                    this.B = true;
                }
                i |= 1;
            }
        }
        long j3 = (this.f4022a.g - i2) - i3;
        synchronized (this) {
            int i5 = this.p;
            if (i5 > 0) {
                if (this.k[k(i5 - 1)] + this.l[r14] <= j3) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                cp3.e(z4);
            }
            if ((536870912 & i) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.w = z2;
            this.v = Math.max(this.v, j2);
            int k = k(this.p);
            this.n[k] = j2;
            this.k[k] = j3;
            this.l[k] = i2;
            this.m[k] = i;
            this.o[k] = wa3Var;
            this.j[k] = 0;
            if (((SparseArray) this.c.c).size() == 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 || !((om2) this.c.h()).f3694a.equals(this.z)) {
                xn0 xn0Var = this.d;
                if (xn0Var != null) {
                    wn0Var = xn0Var.c(this.e, this.z);
                } else {
                    wn0Var = wn0.V;
                }
                f30 f30Var = this.c;
                int i6 = this.q + this.p;
                y01 y01Var = this.z;
                y01Var.getClass();
                f30Var.b(i6, new om2(y01Var, wn0Var));
            }
            int i7 = this.p + 1;
            this.p = i7;
            int i8 = this.i;
            if (i7 == i8) {
                int i9 = i8 + 1000;
                int[] iArr = new int[i9];
                long[] jArr = new long[i9];
                long[] jArr2 = new long[i9];
                int[] iArr2 = new int[i9];
                int[] iArr3 = new int[i9];
                wa3[] wa3VarArr = new wa3[i9];
                int i10 = this.r;
                int i11 = i8 - i10;
                System.arraycopy(this.k, i10, jArr, 0, i11);
                System.arraycopy(this.n, this.r, jArr2, 0, i11);
                System.arraycopy(this.m, this.r, iArr2, 0, i11);
                System.arraycopy(this.l, this.r, iArr3, 0, i11);
                System.arraycopy(this.o, this.r, wa3VarArr, 0, i11);
                System.arraycopy(this.j, this.r, iArr, 0, i11);
                int i12 = this.r;
                System.arraycopy(this.k, 0, jArr, i11, i12);
                System.arraycopy(this.n, 0, jArr2, i11, i12);
                System.arraycopy(this.m, 0, iArr2, i11, i12);
                System.arraycopy(this.l, 0, iArr3, i11, i12);
                System.arraycopy(this.o, 0, wa3VarArr, i11, i12);
                System.arraycopy(this.j, 0, iArr, i11, i12);
                this.k = jArr;
                this.n = jArr2;
                this.m = iArr2;
                this.l = iArr3;
                this.o = wa3VarArr;
                this.j = iArr;
                this.r = 0;
                this.i = i9;
            }
        }
    }

    @Override // defpackage.xa3
    public final void b(int i, r42 r42Var) {
        c(i, r42Var);
    }

    @Override // defpackage.xa3
    public final void c(int i, r42 r42Var) {
        while (true) {
            mm2 mm2Var = this.f4022a;
            if (i > 0) {
                int b2 = mm2Var.b(i);
                ih ihVar = mm2Var.f;
                Object obj = ihVar.c;
                r42Var.d(((int) (mm2Var.g - ihVar.f2592a)) + ((ca) obj).f603b, ((ca) obj).f602a, b2);
                i -= b2;
                long j = mm2Var.g + b2;
                mm2Var.g = j;
                ih ihVar2 = mm2Var.f;
                if (j == ihVar2.f2593b) {
                    mm2Var.f = (ih) ihVar2.d;
                }
            } else {
                mm2Var.getClass();
                return;
            }
        }
    }

    @Override // defpackage.xa3
    public final int d(wd0 wd0Var, int i, boolean z) {
        return r(wd0Var, i, z);
    }

    @Override // defpackage.xa3
    public final void e(y01 y01Var) {
        boolean z;
        boolean z2;
        synchronized (this) {
            z = false;
            this.y = false;
            if (!wi3.a(y01Var, this.z)) {
                if (((SparseArray) this.c.c).size() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && ((om2) this.c.h()).f3694a.equals(y01Var)) {
                    this.z = ((om2) this.c.h()).f3694a;
                } else {
                    this.z = y01Var;
                }
                y01 y01Var2 = this.z;
                this.A = vw1.a(y01Var2.l, y01Var2.i);
                this.B = false;
                z = true;
            }
        }
        pm2 pm2Var = this.f;
        if (pm2Var != null && z) {
            u92 u92Var = (u92) pm2Var;
            u92Var.p.post(u92Var.n);
        }
    }

    public final long f(int i) {
        this.u = Math.max(this.u, j(i));
        this.p -= i;
        int i2 = this.q + i;
        this.q = i2;
        int i3 = this.r + i;
        this.r = i3;
        int i4 = this.i;
        if (i3 >= i4) {
            this.r = i3 - i4;
        }
        int i5 = this.s - i;
        this.s = i5;
        int i6 = 0;
        if (i5 < 0) {
            this.s = 0;
        }
        while (true) {
            f30 f30Var = this.c;
            if (i6 >= ((SparseArray) f30Var.c).size() - 1) {
                break;
            }
            int i7 = i6 + 1;
            if (i2 < ((SparseArray) f30Var.c).keyAt(i7)) {
                break;
            }
            ((x70) f30Var.d).accept(((SparseArray) f30Var.c).valueAt(i6));
            ((SparseArray) f30Var.c).removeAt(i6);
            int i8 = f30Var.f2037b;
            if (i8 > 0) {
                f30Var.f2037b = i8 - 1;
            }
            i6 = i7;
        }
        if (this.p == 0) {
            int i9 = this.r;
            if (i9 == 0) {
                i9 = this.i;
            }
            return this.k[i9 - 1] + this.l[r6];
        }
        return this.k[this.r];
    }

    public final void g() {
        long f;
        mm2 mm2Var = this.f4022a;
        synchronized (this) {
            int i = this.p;
            if (i == 0) {
                f = -1;
            } else {
                f = f(i);
            }
        }
        mm2Var.a(f);
    }

    public final int h(int i, int i2, long j, boolean z) {
        int i3 = -1;
        for (int i4 = 0; i4 < i2; i4++) {
            long j2 = this.n[i];
            if (j2 <= j) {
                if (!z || (this.m[i] & 1) != 0) {
                    if (j2 == j) {
                        return i4;
                    }
                    i3 = i4;
                }
                i++;
                if (i == this.i) {
                    i = 0;
                }
            } else {
                return i3;
            }
        }
        return i3;
    }

    public final synchronized long i() {
        return this.v;
    }

    public final long j(int i) {
        long j = Long.MIN_VALUE;
        if (i == 0) {
            return Long.MIN_VALUE;
        }
        int k = k(i - 1);
        for (int i2 = 0; i2 < i; i2++) {
            j = Math.max(j, this.n[k]);
            if ((this.m[k] & 1) != 0) {
                break;
            }
            k--;
            if (k == -1) {
                k = this.i - 1;
            }
        }
        return j;
    }

    public final int k(int i) {
        int i2 = this.r + i;
        int i3 = this.i;
        if (i2 >= i3) {
            return i2 - i3;
        }
        return i2;
    }

    public final synchronized y01 l() {
        y01 y01Var;
        if (this.y) {
            y01Var = null;
        } else {
            y01Var = this.z;
        }
        return y01Var;
    }

    public final synchronized boolean m(boolean z) {
        boolean z2;
        y01 y01Var;
        int i = this.s;
        boolean z3 = true;
        if (i != this.p) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            if (!z && !this.w && ((y01Var = this.z) == null || y01Var == this.g)) {
                z3 = false;
            }
            return z3;
        }
        if (((om2) this.c.g(this.q + i)).f3694a != this.g) {
            return true;
        }
        return n(k(this.s));
    }

    public final boolean n(int i) {
        rn0 rn0Var = this.h;
        if (rn0Var != null && rn0Var.getState() != 4 && ((this.m[i] & 1073741824) != 0 || !this.h.b())) {
            return false;
        }
        return true;
    }

    public final void o(y01 y01Var, x50 x50Var) {
        boolean z;
        DrmInitData drmInitData;
        y01 y01Var2;
        y01 y01Var3 = this.g;
        if (y01Var3 == null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            drmInitData = null;
        } else {
            drmInitData = y01Var3.o;
        }
        this.g = y01Var;
        DrmInitData drmInitData2 = y01Var.o;
        xn0 xn0Var = this.d;
        if (xn0Var != null) {
            int l = xn0Var.l(y01Var);
            x01 a2 = y01Var.a();
            a2.F = l;
            y01Var2 = a2.a();
        } else {
            y01Var2 = y01Var;
        }
        x50Var.c = y01Var2;
        x50Var.f5117b = this.h;
        if (xn0Var == null) {
            return;
        }
        if (!z && wi3.a(drmInitData, drmInitData2)) {
            return;
        }
        rn0 rn0Var = this.h;
        un0 un0Var = this.e;
        rn0 b2 = xn0Var.b(un0Var, y01Var);
        this.h = b2;
        x50Var.f5117b = b2;
        if (rn0Var != null) {
            rn0Var.c(un0Var);
        }
    }

    public final void p(boolean z) {
        boolean z2;
        mm2 mm2Var = this.f4022a;
        ih ihVar = mm2Var.d;
        if (((ca) ihVar.c) != null) {
            cf0 cf0Var = mm2Var.f3315a;
            synchronized (cf0Var) {
                ih ihVar2 = ihVar;
                while (ihVar2 != null) {
                    ca[] caVarArr = cf0Var.f;
                    int i = cf0Var.e;
                    cf0Var.e = i + 1;
                    ca caVar = (ca) ihVar2.c;
                    caVar.getClass();
                    caVarArr[i] = caVar;
                    cf0Var.d--;
                    Object obj = ihVar2.d;
                    if (((ih) obj) != null && ((ca) ((ih) obj).c) != null) {
                        ihVar2 = (ih) obj;
                    }
                    ihVar2 = null;
                }
                cf0Var.notifyAll();
            }
            ihVar.c = null;
            ihVar.d = null;
        }
        ih ihVar3 = mm2Var.d;
        int i2 = mm2Var.f3316b;
        if (((ca) ihVar3.c) == null) {
            z2 = true;
        } else {
            z2 = false;
        }
        cp3.m(z2);
        ihVar3.f2592a = 0L;
        ihVar3.f2593b = i2 + 0;
        ih ihVar4 = mm2Var.d;
        mm2Var.e = ihVar4;
        mm2Var.f = ihVar4;
        mm2Var.g = 0L;
        mm2Var.f3315a.b();
        this.p = 0;
        this.q = 0;
        this.r = 0;
        this.s = 0;
        this.x = true;
        this.t = Long.MIN_VALUE;
        this.u = Long.MIN_VALUE;
        this.v = Long.MIN_VALUE;
        this.w = false;
        f30 f30Var = this.c;
        for (int i3 = 0; i3 < ((SparseArray) f30Var.c).size(); i3++) {
            ((x70) f30Var.d).accept(((SparseArray) f30Var.c).valueAt(i3));
        }
        f30Var.f2037b = -1;
        ((SparseArray) f30Var.c).clear();
        if (z) {
            this.z = null;
            this.y = true;
        }
    }

    public final synchronized void q() {
        this.s = 0;
        mm2 mm2Var = this.f4022a;
        mm2Var.e = mm2Var.d;
    }

    public final int r(wd0 wd0Var, int i, boolean z) {
        mm2 mm2Var = this.f4022a;
        int b2 = mm2Var.b(i);
        ih ihVar = mm2Var.f;
        Object obj = ihVar.c;
        int read = wd0Var.read(((ca) obj).f602a, ((int) (mm2Var.g - ihVar.f2592a)) + ((ca) obj).f603b, b2);
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        long j = mm2Var.g + read;
        mm2Var.g = j;
        ih ihVar2 = mm2Var.f;
        if (j == ihVar2.f2593b) {
            mm2Var.f = (ih) ihVar2.d;
            return read;
        }
        return read;
    }

    public final synchronized boolean s(long j, boolean z) {
        boolean z2;
        q();
        int k = k(this.s);
        int i = this.s;
        int i2 = this.p;
        if (i != i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && j >= this.n[k] && (j <= this.v || z)) {
            int h = h(k, i2 - i, j, true);
            if (h == -1) {
                return false;
            }
            this.t = j;
            this.s += h;
            return true;
        }
        return false;
    }

    public final synchronized void t(int i) {
        boolean z;
        if (i >= 0) {
            try {
                if (this.s + i <= this.p) {
                    z = true;
                    cp3.e(z);
                    this.s += i;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z = false;
        cp3.e(z);
        this.s += i;
    }
}
