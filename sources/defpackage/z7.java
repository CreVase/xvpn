package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class z7 extends mo {
    public z7(ua3 ua3Var, int[] iArr, int i, long j, long j2, hb1 hb1Var) {
        super(ua3Var, iArr);
        if (j2 < j) {
            sn1.f();
        }
        hb1.l(hb1Var);
    }

    public static ji2 m(ku0[] ku0VarArr) {
        int i;
        ji2 b0;
        int i2;
        double d;
        long j;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (true) {
            i = 1;
            if (i3 >= ku0VarArr.length) {
                break;
            }
            ku0 ku0Var = ku0VarArr[i3];
            if (ku0Var != null && ku0Var.f3013b.length > 1) {
                cb1 k = hb1.k();
                k.Z(new y7(0L, 0L));
                arrayList.add(k);
            } else {
                arrayList.add(null);
            }
            i3++;
        }
        int length = ku0VarArr.length;
        long[][] jArr = new long[length];
        for (int i4 = 0; i4 < ku0VarArr.length; i4++) {
            ku0 ku0Var2 = ku0VarArr[i4];
            if (ku0Var2 == null) {
                jArr[i4] = new long[0];
            } else {
                int[] iArr = ku0Var2.f3013b;
                jArr[i4] = new long[iArr.length];
                for (int i5 = 0; i5 < iArr.length; i5++) {
                    long j2 = ku0Var2.f3012a.d[iArr[i5]].h;
                    long[] jArr2 = jArr[i4];
                    if (j2 == -1) {
                        j2 = 0;
                    }
                    jArr2[i5] = j2;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i6 = 0; i6 < length; i6++) {
            long[] jArr4 = jArr[i6];
            if (jArr4.length == 0) {
                j = 0;
            } else {
                j = jArr4[0];
            }
            jArr3[i6] = j;
        }
        n(arrayList, jArr3);
        xy1 xy1Var = xy1.f5247a;
        xy1Var.getClass();
        by1 C0 = new yx1(xy1Var).j().C0();
        int i7 = 0;
        while (i7 < length) {
            long[] jArr5 = jArr[i7];
            if (jArr5.length <= i) {
                i2 = length;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i8 = 0;
                while (true) {
                    long[] jArr6 = jArr[i7];
                    double d2 = 0.0d;
                    if (i8 >= jArr6.length) {
                        break;
                    }
                    int i9 = length;
                    long j3 = jArr6[i8];
                    if (j3 != -1) {
                        d2 = Math.log(j3);
                    }
                    dArr[i8] = d2;
                    i8++;
                    length = i9;
                }
                i2 = length;
                int i10 = length2 - 1;
                double d3 = dArr[i10] - dArr[0];
                int i11 = 0;
                while (i11 < i10) {
                    double d4 = dArr[i11];
                    i11++;
                    double d5 = (d4 + dArr[i11]) * 0.5d;
                    if (d3 == 0.0d) {
                        d = 1.0d;
                    } else {
                        d = (d5 - dArr[0]) / d3;
                    }
                    C0.i(Double.valueOf(d), Integer.valueOf(i7));
                }
            }
            i7++;
            length = i2;
            i = 1;
        }
        hb1 l = hb1.l(C0.j());
        for (int i12 = 0; i12 < l.size(); i12++) {
            int intValue = ((Integer) l.get(i12)).intValue();
            int i13 = iArr2[intValue] + 1;
            iArr2[intValue] = i13;
            jArr3[intValue] = jArr[intValue][i13];
            n(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < ku0VarArr.length; i14++) {
            if (arrayList.get(i14) != null) {
                jArr3[i14] = jArr3[i14] * 2;
            }
        }
        n(arrayList, jArr3);
        cb1 k2 = hb1.k();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            cb1 cb1Var = (cb1) arrayList.get(i15);
            if (cb1Var == null) {
                b0 = hb1.o();
            } else {
                b0 = cb1Var.b0();
            }
            k2.Z(b0);
        }
        return k2.b0();
    }

    public static void n(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            cb1 cb1Var = (cb1) arrayList.get(i);
            if (cb1Var != null) {
                cb1Var.Z(new y7(j, jArr[i]));
            }
        }
    }

    @Override // defpackage.mu0
    public final void b() {
    }

    @Override // defpackage.mo, defpackage.mu0
    public final void e() {
    }

    @Override // defpackage.mo, defpackage.mu0
    public final void g() {
    }

    @Override // defpackage.mo, defpackage.mu0
    public final void i(float f) {
    }
}
