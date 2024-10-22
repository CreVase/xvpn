package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* loaded from: classes.dex */
public final class rv1 implements lt1, kt1 {

    /* renamed from: a, reason: collision with root package name */
    public final lt1[] f4218a;

    /* renamed from: b, reason: collision with root package name */
    public final IdentityHashMap f4219b;
    public final mp0 c;
    public final ArrayList d = new ArrayList();
    public final HashMap e = new HashMap();
    public kt1 f;
    public va3 g;
    public lt1[] h;
    public ja1 i;

    public rv1(mp0 mp0Var, long[] jArr, lt1... lt1VarArr) {
        this.c = mp0Var;
        this.f4218a = lt1VarArr;
        mp0Var.getClass();
        this.i = new ja1(new hp2[0], 23);
        this.f4219b = new IdentityHashMap();
        this.h = new lt1[0];
        for (int i = 0; i < lt1VarArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.f4218a[i] = new pv1(lt1VarArr[i], j);
            }
        }
    }

    @Override // defpackage.kt1
    public final void a(lt1 lt1Var) {
        ArrayList arrayList = this.d;
        arrayList.remove(lt1Var);
        if (!arrayList.isEmpty()) {
            return;
        }
        lt1[] lt1VarArr = this.f4218a;
        int i = 0;
        for (lt1 lt1Var2 : lt1VarArr) {
            i += lt1Var2.p().f4804a;
        }
        ua3[] ua3VarArr = new ua3[i];
        int i2 = 0;
        for (int i3 = 0; i3 < lt1VarArr.length; i3++) {
            va3 p = lt1VarArr[i3].p();
            int i4 = p.f4804a;
            int i5 = 0;
            while (i5 < i4) {
                ua3 a2 = p.a(i5);
                ua3 ua3Var = new ua3(i3 + ":" + a2.f4644b, a2.d);
                this.e.put(ua3Var, a2);
                ua3VarArr[i2] = ua3Var;
                i5++;
                i2++;
            }
        }
        this.g = new va3(ua3VarArr);
        kt1 kt1Var = this.f;
        kt1Var.getClass();
        kt1Var.a(this);
    }

    @Override // defpackage.lt1
    public final long b(mu0[] mu0VarArr, boolean[] zArr, rm2[] rm2VarArr, boolean[] zArr2, long j) {
        IdentityHashMap identityHashMap;
        rm2 rm2Var;
        ArrayList arrayList;
        Integer num;
        int intValue;
        int[] iArr = new int[mu0VarArr.length];
        int[] iArr2 = new int[mu0VarArr.length];
        int i = 0;
        while (true) {
            int length = mu0VarArr.length;
            identityHashMap = this.f4219b;
            if (i >= length) {
                break;
            }
            rm2 rm2Var2 = rm2VarArr[i];
            if (rm2Var2 == null) {
                num = null;
            } else {
                num = (Integer) identityHashMap.get(rm2Var2);
            }
            if (num == null) {
                intValue = -1;
            } else {
                intValue = num.intValue();
            }
            iArr[i] = intValue;
            mu0 mu0Var = mu0VarArr[i];
            if (mu0Var != null) {
                String str = mu0Var.a().f4644b;
                iArr2[i] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr2[i] = -1;
            }
            i++;
        }
        identityHashMap.clear();
        int length2 = mu0VarArr.length;
        rm2[] rm2VarArr2 = new rm2[length2];
        rm2[] rm2VarArr3 = new rm2[mu0VarArr.length];
        mu0[] mu0VarArr2 = new mu0[mu0VarArr.length];
        lt1[] lt1VarArr = this.f4218a;
        ArrayList arrayList2 = new ArrayList(lt1VarArr.length);
        long j2 = j;
        int i2 = 0;
        while (i2 < lt1VarArr.length) {
            int i3 = 0;
            while (i3 < mu0VarArr.length) {
                if (iArr[i3] == i2) {
                    rm2Var = rm2VarArr[i3];
                } else {
                    rm2Var = null;
                }
                rm2VarArr3[i3] = rm2Var;
                if (iArr2[i3] == i2) {
                    mu0 mu0Var2 = mu0VarArr[i3];
                    mu0Var2.getClass();
                    arrayList = arrayList2;
                    ua3 ua3Var = (ua3) this.e.get(mu0Var2.a());
                    ua3Var.getClass();
                    mu0VarArr2[i3] = new ov1(mu0Var2, ua3Var);
                } else {
                    arrayList = arrayList2;
                    mu0VarArr2[i3] = null;
                }
                i3++;
                arrayList2 = arrayList;
            }
            ArrayList arrayList3 = arrayList2;
            int i4 = i2;
            lt1[] lt1VarArr2 = lt1VarArr;
            mu0[] mu0VarArr3 = mu0VarArr2;
            long b2 = lt1VarArr[i2].b(mu0VarArr2, zArr, rm2VarArr3, zArr2, j2);
            if (i4 == 0) {
                j2 = b2;
            } else if (b2 != j2) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z = false;
            for (int i5 = 0; i5 < mu0VarArr.length; i5++) {
                boolean z2 = true;
                if (iArr2[i5] == i4) {
                    rm2 rm2Var3 = rm2VarArr3[i5];
                    rm2Var3.getClass();
                    rm2VarArr2[i5] = rm2VarArr3[i5];
                    identityHashMap.put(rm2Var3, Integer.valueOf(i4));
                    z = true;
                } else if (iArr[i5] == i4) {
                    if (rm2VarArr3[i5] != null) {
                        z2 = false;
                    }
                    cp3.m(z2);
                }
            }
            if (z) {
                arrayList3.add(lt1VarArr2[i4]);
            }
            i2 = i4 + 1;
            arrayList2 = arrayList3;
            lt1VarArr = lt1VarArr2;
            mu0VarArr2 = mu0VarArr3;
        }
        System.arraycopy(rm2VarArr2, 0, rm2VarArr, 0, length2);
        lt1[] lt1VarArr3 = (lt1[]) arrayList2.toArray(new lt1[0]);
        this.h = lt1VarArr3;
        this.c.getClass();
        this.i = new ja1(lt1VarArr3, 23);
        return j2;
    }

    @Override // defpackage.kt1
    public final void c(hp2 hp2Var) {
        kt1 kt1Var = this.f;
        kt1Var.getClass();
        kt1Var.c(this);
    }

    @Override // defpackage.hp2
    public final long d() {
        return this.i.d();
    }

    @Override // defpackage.lt1
    public final long e(long j, mo2 mo2Var) {
        lt1 lt1Var;
        lt1[] lt1VarArr = this.h;
        if (lt1VarArr.length > 0) {
            lt1Var = lt1VarArr[0];
        } else {
            lt1Var = this.f4218a[0];
        }
        return lt1Var.e(j, mo2Var);
    }

    @Override // defpackage.lt1
    public final void f() {
        for (lt1 lt1Var : this.f4218a) {
            lt1Var.f();
        }
    }

    @Override // defpackage.lt1
    public final long g(long j) {
        long g = this.h[0].g(j);
        int i = 1;
        while (true) {
            lt1[] lt1VarArr = this.h;
            if (i < lt1VarArr.length) {
                if (lt1VarArr[i].g(g) == g) {
                    i++;
                } else {
                    throw new IllegalStateException("Unexpected child seekToUs result.");
                }
            } else {
                return g;
            }
        }
    }

    @Override // defpackage.hp2
    public final boolean h(long j) {
        ArrayList arrayList = this.d;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((lt1) arrayList.get(i)).h(j);
            }
            return false;
        }
        return this.i.h(j);
    }

    @Override // defpackage.hp2
    public final boolean i() {
        return this.i.i();
    }

    @Override // defpackage.lt1
    public final long k() {
        long j = -9223372036854775807L;
        for (lt1 lt1Var : this.h) {
            long k = lt1Var.k();
            if (k != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    for (lt1 lt1Var2 : this.h) {
                        if (lt1Var2 == lt1Var) {
                            break;
                        }
                        if (lt1Var2.g(k) != k) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = k;
                } else if (k != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j != -9223372036854775807L && lt1Var.g(j) != j) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    @Override // defpackage.lt1
    public final void n(kt1 kt1Var, long j) {
        this.f = kt1Var;
        ArrayList arrayList = this.d;
        lt1[] lt1VarArr = this.f4218a;
        Collections.addAll(arrayList, lt1VarArr);
        for (lt1 lt1Var : lt1VarArr) {
            lt1Var.n(this, j);
        }
    }

    @Override // defpackage.lt1
    public final va3 p() {
        va3 va3Var = this.g;
        va3Var.getClass();
        return va3Var;
    }

    @Override // defpackage.hp2
    public final long t() {
        return this.i.t();
    }

    @Override // defpackage.lt1
    public final void v(long j, boolean z) {
        for (lt1 lt1Var : this.h) {
            lt1Var.v(j, z);
        }
    }

    @Override // defpackage.hp2
    public final void x(long j) {
        this.i.x(j);
    }
}
