package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class oc3 implements dv0 {

    /* renamed from: a, reason: collision with root package name */
    public final List f3643a;

    /* renamed from: b, reason: collision with root package name */
    public final r42 f3644b = new r42(new byte[9400], 0);
    public final SparseIntArray c;
    public final oj0 d;
    public final SparseArray e;
    public final SparseBooleanArray f;
    public final SparseBooleanArray g;
    public final mc3 h;
    public py0 i;
    public fv0 j;
    public int k;
    public boolean l;
    public boolean m;
    public boolean n;
    public rc3 o;
    public int p;

    public oc3(f93 f93Var, oj0 oj0Var) {
        this.d = oj0Var;
        this.f3643a = Collections.singletonList(f93Var);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.f = sparseBooleanArray;
        this.g = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.e = sparseArray;
        this.c = new SparseIntArray();
        this.h = new mc3();
        this.j = fv0.a0;
        this.p = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i = 0; i < size; i++) {
            sparseArray.put(sparseArray2.keyAt(i), (rc3) sparseArray2.valueAt(i));
        }
        sparseArray.put(0, new jo2(new uy0(this)));
        this.o = null;
    }

    @Override // defpackage.dv0
    public final boolean d(ev0 ev0Var) {
        boolean z;
        byte[] bArr = this.f3644b.f4098a;
        ih0 ih0Var = (ih0) ev0Var;
        ih0Var.e(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 < 5) {
                    if (bArr[(i2 * 188) + i] != 71) {
                        z = false;
                        break;
                    }
                    i2++;
                } else {
                    z = true;
                    break;
                }
            }
            if (z) {
                ih0Var.m(i);
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dv0
    public final void e(long j, long j2) {
        py0 py0Var;
        boolean z;
        List list = this.f3643a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            f93 f93Var = (f93) list.get(i2);
            boolean z2 = true;
            if (f93Var.d() == -9223372036854775807L) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                long c = f93Var.c();
                if (c == -9223372036854775807L || c == 0 || c == j2) {
                    z2 = false;
                }
                z = z2;
            }
            if (z) {
                f93Var.e(j2);
            }
        }
        if (j2 != 0 && (py0Var = this.i) != null) {
            py0Var.c(j2);
        }
        this.f3644b.D(0);
        this.c.clear();
        while (true) {
            SparseArray sparseArray = this.e;
            if (i < sparseArray.size()) {
                ((rc3) sparseArray.valueAt(i)).c();
                i++;
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.util.SparseBooleanArray] */
    @Override // defpackage.dv0
    public final int f(ev0 ev0Var, lm2 lm2Var) {
        ?? r13;
        ?? r15;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        rc3 rc3Var;
        boolean z4;
        int i2;
        boolean z5;
        boolean z6;
        int i3;
        boolean z7;
        long j = ev0Var.j();
        if (this.l) {
            if (j != -1) {
                z5 = true;
            } else {
                z5 = false;
            }
            long j2 = -9223372036854775807L;
            mc3 mc3Var = this.h;
            if (z5 && !mc3Var.d) {
                int i4 = this.p;
                if (i4 <= 0) {
                    mc3Var.a(ev0Var);
                    return 0;
                }
                boolean z8 = mc3Var.f;
                r42 r42Var = mc3Var.c;
                int i5 = mc3Var.f3277a;
                if (!z8) {
                    long j3 = ev0Var.j();
                    int min = (int) Math.min(i5, j3);
                    long j4 = j3 - min;
                    if (ev0Var.getPosition() != j4) {
                        lm2Var.f3157a = j4;
                        i3 = 1;
                    } else {
                        r42Var.D(min);
                        ev0Var.l();
                        ev0Var.b(0, r42Var.f4098a, min);
                        int i6 = r42Var.f4099b;
                        int i7 = r42Var.c;
                        int i8 = i7 - 188;
                        while (true) {
                            if (i8 < i6) {
                                break;
                            }
                            byte[] bArr = r42Var.f4098a;
                            int i9 = -4;
                            int i10 = 0;
                            while (true) {
                                if (i9 <= 4) {
                                    int i11 = (i9 * 188) + i8;
                                    if (i11 >= i6 && i11 < i7 && bArr[i11] == 71) {
                                        i10++;
                                        if (i10 == 5) {
                                            z7 = true;
                                            break;
                                        }
                                    } else {
                                        i10 = 0;
                                    }
                                    i9++;
                                } else {
                                    z7 = false;
                                    break;
                                }
                            }
                            if (z7) {
                                long O = pe0.O(i8, i4, r42Var);
                                if (O != -9223372036854775807L) {
                                    j2 = O;
                                    break;
                                }
                            }
                            i8--;
                        }
                        mc3Var.h = j2;
                        mc3Var.f = true;
                        i3 = 0;
                    }
                } else {
                    if (mc3Var.h == -9223372036854775807L) {
                        mc3Var.a(ev0Var);
                        return 0;
                    }
                    if (!mc3Var.e) {
                        int min2 = (int) Math.min(i5, ev0Var.j());
                        long j5 = 0;
                        if (ev0Var.getPosition() != j5) {
                            lm2Var.f3157a = j5;
                            i3 = 1;
                        } else {
                            r42Var.D(min2);
                            ev0Var.l();
                            ev0Var.b(0, r42Var.f4098a, min2);
                            int i12 = r42Var.f4099b;
                            int i13 = r42Var.c;
                            while (true) {
                                if (i12 >= i13) {
                                    break;
                                }
                                if (r42Var.f4098a[i12] == 71) {
                                    long O2 = pe0.O(i12, i4, r42Var);
                                    if (O2 != -9223372036854775807L) {
                                        j2 = O2;
                                        break;
                                    }
                                }
                                i12++;
                            }
                            mc3Var.g = j2;
                            mc3Var.e = true;
                            i3 = 0;
                        }
                    } else {
                        long j6 = mc3Var.g;
                        if (j6 == -9223372036854775807L) {
                            mc3Var.a(ev0Var);
                            return 0;
                        }
                        f93 f93Var = mc3Var.f3278b;
                        long b2 = f93Var.b(mc3Var.h) - f93Var.b(j6);
                        mc3Var.i = b2;
                        if (b2 < 0) {
                            sn1.f();
                            mc3Var.i = -9223372036854775807L;
                        }
                        mc3Var.a(ev0Var);
                        return 0;
                    }
                }
                return i3;
            }
            if (!this.m) {
                this.m = true;
                long j7 = mc3Var.i;
                if (j7 != -9223372036854775807L) {
                    r13 = 0;
                    r15 = 1;
                    py0 py0Var = new py0(mc3Var.f3278b, j7, j, this.p, 112800);
                    this.i = py0Var;
                    this.j.m(py0Var.f1817a);
                } else {
                    r13 = 0;
                    r15 = 1;
                    this.j.m(new ty0(j7));
                }
            } else {
                r13 = 0;
                r15 = 1;
            }
            if (this.n) {
                this.n = r13;
                e(0L, 0L);
                if (ev0Var.getPosition() != 0) {
                    lm2Var.f3157a = 0L;
                    return r15 == true ? 1 : 0;
                }
            }
            py0 py0Var2 = this.i;
            if (py0Var2 != null) {
                if (py0Var2.c != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                if (z6) {
                    return py0Var2.a(ev0Var, lm2Var);
                }
            }
        } else {
            r13 = 0;
            r15 = 1;
        }
        r42 r42Var2 = this.f3644b;
        byte[] bArr2 = r42Var2.f4098a;
        int i14 = r42Var2.f4099b;
        if (9400 - i14 < 188) {
            int i15 = r42Var2.c - i14;
            if (i15 > 0) {
                System.arraycopy(bArr2, i14, bArr2, r13, i15);
            }
            r42Var2.E(i15, bArr2);
        }
        while (true) {
            int i16 = r42Var2.c;
            if (i16 - r42Var2.f4099b < 188) {
                int read = ev0Var.read(bArr2, i16, 9400 - i16);
                if (read == -1) {
                    z = false;
                    break;
                }
                r42Var2.F(i16 + read);
            } else {
                z = true;
                break;
            }
        }
        if (!z) {
            return -1;
        }
        int i17 = r42Var2.f4099b;
        int i18 = r42Var2.c;
        byte[] bArr3 = r42Var2.f4098a;
        while (i17 < i18 && bArr3[i17] != 71) {
            i17++;
        }
        r42Var2.G(i17);
        int i19 = i17 + 188;
        int i20 = r42Var2.c;
        if (i19 > i20) {
            return r13;
        }
        int f = r42Var2.f();
        if ((8388608 & f) != 0) {
            r42Var2.G(i19);
            return r13;
        }
        if ((4194304 & f) != 0) {
            i = 1;
        } else {
            i = 0;
        }
        int i21 = i | 0;
        int i22 = (2096896 & f) >> 8;
        if ((f & 32) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((f & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            rc3Var = (rc3) this.e.get(i22);
        } else {
            rc3Var = null;
        }
        if (rc3Var == null) {
            r42Var2.G(i19);
            return r13;
        }
        int i23 = f & 15;
        SparseIntArray sparseIntArray = this.c;
        int i24 = sparseIntArray.get(i22, i23 - 1);
        sparseIntArray.put(i22, i23);
        if (i24 == i23) {
            r42Var2.G(i19);
            return r13;
        }
        if (i23 != ((i24 + r15) & 15)) {
            rc3Var.c();
        }
        if (z2) {
            int v = r42Var2.v();
            if ((r42Var2.v() & 64) != 0) {
                i2 = 2;
            } else {
                i2 = 0;
            }
            i21 |= i2;
            r42Var2.H(v - r15);
        }
        boolean z9 = this.l;
        if (!z9 && this.g.get(i22, r13)) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            r42Var2.F(i19);
            rc3Var.a(i21, r42Var2);
            r42Var2.F(i20);
        }
        if (!z9 && this.l && j != -1) {
            this.n = r15;
        }
        r42Var2.G(i19);
        return r13;
    }

    @Override // defpackage.dv0
    public final void i(fv0 fv0Var) {
        this.j = fv0Var;
    }

    @Override // defpackage.dv0
    public final void release() {
    }
}
