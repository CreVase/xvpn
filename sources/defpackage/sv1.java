package defpackage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class sv1 extends j40 {
    public static final dt1 r;
    public final fo[] k;
    public final a93[] l;
    public final ArrayList m;
    public final mp0 n;
    public int o;
    public long[][] p;
    public ge0 q;

    static {
        qs1 qs1Var = new qs1();
        qs1Var.f4047a = "MergingMediaSource";
        r = qs1Var.a();
    }

    public sv1(fo... foVarArr) {
        mp0 mp0Var = new mp0(21);
        this.k = foVarArr;
        this.n = mp0Var;
        this.m = new ArrayList(Arrays.asList(foVarArr));
        this.o = -1;
        this.l = new a93[foVarArr.length];
        this.p = new long[0];
        new HashMap();
        m20.T(8, "expectedKeys");
        new xx1().j().C0();
    }

    @Override // defpackage.fo
    public final lt1 a(rt1 rt1Var, cf0 cf0Var, long j) {
        fo[] foVarArr = this.k;
        int length = foVarArr.length;
        lt1[] lt1VarArr = new lt1[length];
        a93[] a93VarArr = this.l;
        int b2 = a93VarArr[0].b(rt1Var.f3536a);
        for (int i = 0; i < length; i++) {
            lt1VarArr[i] = foVarArr[i].a(rt1Var.b(a93VarArr[i].m(b2)), cf0Var, j - this.p[b2][i]);
        }
        return new rv1(this.n, this.p[b2], lt1VarArr);
    }

    @Override // defpackage.fo
    public final dt1 g() {
        fo[] foVarArr = this.k;
        if (foVarArr.length > 0) {
            return foVarArr[0].g();
        }
        return r;
    }

    @Override // defpackage.j40, defpackage.fo
    public final void i() {
        ge0 ge0Var = this.q;
        if (ge0Var == null) {
            super.i();
            return;
        }
        throw ge0Var;
    }

    @Override // defpackage.fo
    public final void k(hb3 hb3Var) {
        this.j = hb3Var;
        this.i = wi3.k(null);
        int i = 0;
        while (true) {
            fo[] foVarArr = this.k;
            if (i < foVarArr.length) {
                v(Integer.valueOf(i), foVarArr[i]);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.fo
    public final void m(lt1 lt1Var) {
        rv1 rv1Var = (rv1) lt1Var;
        int i = 0;
        while (true) {
            fo[] foVarArr = this.k;
            if (i < foVarArr.length) {
                fo foVar = foVarArr[i];
                lt1 lt1Var2 = rv1Var.f4218a[i];
                if (lt1Var2 instanceof pv1) {
                    lt1Var2 = ((pv1) lt1Var2).f3923a;
                }
                foVar.m(lt1Var2);
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.j40, defpackage.fo
    public final void o() {
        super.o();
        Arrays.fill(this.l, (Object) null);
        this.o = -1;
        this.q = null;
        ArrayList arrayList = this.m;
        arrayList.clear();
        Collections.addAll(arrayList, this.k);
    }

    @Override // defpackage.j40
    public final rt1 r(Object obj, rt1 rt1Var) {
        if (((Integer) obj).intValue() != 0) {
            return null;
        }
        return rt1Var;
    }

    @Override // defpackage.j40
    public final void u(Object obj, fo foVar, a93 a93Var) {
        Integer num = (Integer) obj;
        if (this.q == null) {
            if (this.o == -1) {
                this.o = a93Var.i();
            } else if (a93Var.i() != this.o) {
                this.q = new ge0(0);
                return;
            }
            int length = this.p.length;
            a93[] a93VarArr = this.l;
            if (length == 0) {
                this.p = (long[][]) Array.newInstance((Class<?>) Long.TYPE, this.o, a93VarArr.length);
            }
            ArrayList arrayList = this.m;
            arrayList.remove(foVar);
            a93VarArr[num.intValue()] = a93Var;
            if (arrayList.isEmpty()) {
                l(a93VarArr[0]);
            }
        }
    }
}
