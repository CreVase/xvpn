package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class wv extends pp3 {
    public final ArrayList k;
    public int l;

    public wv(int i, r70 r70Var) {
        super(r70Var);
        lk0 lk0Var;
        boolean z;
        int i2;
        lk0 lk0Var2;
        this.k = new ArrayList();
        this.f = i;
        r70 r70Var2 = this.f3895b;
        r70 n = r70Var2.n(i);
        while (n != null) {
            r70Var2 = n;
            n = n.n(this.f);
        }
        this.f3895b = r70Var2;
        int i3 = this.f;
        if (i3 == 0) {
            lk0Var = r70Var2.d;
        } else if (i3 == 1) {
            lk0Var = r70Var2.e;
        } else {
            lk0Var = null;
        }
        ArrayList arrayList = this.k;
        arrayList.add(lk0Var);
        r70 m = r70Var2.m(this.f);
        while (m != null) {
            int i4 = this.f;
            if (i4 == 0) {
                lk0Var2 = m.d;
            } else if (i4 == 1) {
                lk0Var2 = m.e;
            } else {
                lk0Var2 = null;
            }
            arrayList.add(lk0Var2);
            m = m.m(this.f);
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pp3 pp3Var = (pp3) it.next();
            int i5 = this.f;
            if (i5 == 0) {
                pp3Var.f3895b.f4113b = this;
            } else if (i5 == 1) {
                pp3Var.f3895b.c = this;
            }
        }
        if (this.f == 0 && ((s70) this.f3895b.T).v0) {
            z = true;
        } else {
            z = false;
        }
        if (z && arrayList.size() > 1) {
            this.f3895b = ((pp3) arrayList.get(arrayList.size() - 1)).f3895b;
        }
        if (this.f == 0) {
            i2 = this.f3895b.i0;
        } else {
            i2 = this.f3895b.j0;
        }
        this.l = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x03a7, code lost:            r2 = r2 - r12;     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00da  */
    @Override // defpackage.lk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.lk0 r27) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv.a(lk0):void");
    }

    @Override // defpackage.pp3
    public final void d() {
        ArrayList arrayList = this.k;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((pp3) it.next()).d();
        }
        int size = arrayList.size();
        if (size < 1) {
            return;
        }
        r70 r70Var = ((pp3) arrayList.get(0)).f3895b;
        r70 r70Var2 = ((pp3) arrayList.get(size - 1)).f3895b;
        int i = this.f;
        qk0 qk0Var = this.i;
        qk0 qk0Var2 = this.h;
        if (i == 0) {
            z60 z60Var = r70Var.I;
            z60 z60Var2 = r70Var2.K;
            qk0 i2 = pp3.i(z60Var, 0);
            int e = z60Var.e();
            r70 m = m();
            if (m != null) {
                e = m.I.e();
            }
            if (i2 != null) {
                pp3.b(qk0Var2, i2, e);
            }
            qk0 i3 = pp3.i(z60Var2, 0);
            int e2 = z60Var2.e();
            r70 n = n();
            if (n != null) {
                e2 = n.K.e();
            }
            if (i3 != null) {
                pp3.b(qk0Var, i3, -e2);
            }
        } else {
            z60 z60Var3 = r70Var.J;
            z60 z60Var4 = r70Var2.L;
            qk0 i4 = pp3.i(z60Var3, 1);
            int e3 = z60Var3.e();
            r70 m2 = m();
            if (m2 != null) {
                e3 = m2.J.e();
            }
            if (i4 != null) {
                pp3.b(qk0Var2, i4, e3);
            }
            qk0 i5 = pp3.i(z60Var4, 1);
            int e4 = z60Var4.e();
            r70 n2 = n();
            if (n2 != null) {
                e4 = n2.L.e();
            }
            if (i5 != null) {
                pp3.b(qk0Var, i5, -e4);
            }
        }
        qk0Var2.f4010a = this;
        qk0Var.f4010a = this;
    }

    @Override // defpackage.pp3
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i < arrayList.size()) {
                ((pp3) arrayList.get(i)).e();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.pp3
    public final void f() {
        this.c = null;
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            ((pp3) it.next()).f();
        }
    }

    @Override // defpackage.pp3
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            j = r5.i.f + ((pp3) arrayList.get(i)).j() + j + r5.h.f;
        }
        return j;
    }

    @Override // defpackage.pp3
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((pp3) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final r70 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i < arrayList.size()) {
                r70 r70Var = ((pp3) arrayList.get(i)).f3895b;
                if (r70Var.g0 != 8) {
                    return r70Var;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final r70 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            r70 r70Var = ((pp3) arrayList.get(size)).f3895b;
            if (r70Var.g0 != 8) {
                return r70Var;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        Iterator it = this.k.iterator();
        while (it.hasNext()) {
            pp3 pp3Var = (pp3) it.next();
            sb.append("<");
            sb.append(pp3Var);
            sb.append("> ");
        }
        return sb.toString();
    }
}
