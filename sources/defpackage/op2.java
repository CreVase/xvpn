package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class op2 implements mp2, au {

    /* renamed from: a, reason: collision with root package name */
    public final String f3713a;

    /* renamed from: b, reason: collision with root package name */
    public final tp2 f3714b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final mp2[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final mp2[] k;
    public final k43 l;

    public op2(String str, tp2 tp2Var, int i, List list, k00 k00Var) {
        this.f3713a = str;
        this.f3714b = tp2Var;
        this.c = i;
        this.d = k00Var.f2864a;
        ArrayList arrayList = k00Var.f2865b;
        HashSet hashSet = new HashSet(bx3.N(a20.C0(arrayList, 12)));
        d20.P0(arrayList, hashSet);
        this.e = hashSet;
        int i2 = 0;
        this.f = (String[]) arrayList.toArray(new String[0]);
        this.g = zf3.k(k00Var.d);
        this.h = (List[]) k00Var.e.toArray(new List[0]);
        ArrayList arrayList2 = k00Var.f;
        boolean[] zArr = new boolean[arrayList2.size()];
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zArr[i2] = ((Boolean) it.next()).booleanValue();
            i2++;
        }
        this.i = zArr;
        ac1 ac1Var = new ac1(new yy2(this.f, 23));
        ArrayList arrayList3 = new ArrayList(a20.C0(ac1Var, 10));
        Iterator it2 = ac1Var.iterator();
        while (it2.hasNext()) {
            zb1 zb1Var = (zb1) it2.next();
            arrayList3.add(new n42(zb1Var.f5458b, Integer.valueOf(zb1Var.f5457a)));
        }
        this.j = jq1.n0(arrayList3);
        this.k = zf3.k(list);
        this.l = new k43(new yy2(this, 25));
    }

    @Override // defpackage.mp2
    public final String a() {
        return this.f3713a;
    }

    @Override // defpackage.au
    public final Set b() {
        return this.e;
    }

    @Override // defpackage.mp2
    public final boolean c() {
        return false;
    }

    @Override // defpackage.mp2
    public final int d(String str) {
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.mp2
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof op2) {
            mp2 mp2Var = (mp2) obj;
            if (m20.L(a(), mp2Var.a()) && Arrays.equals(this.k, ((op2) obj).k) && e() == mp2Var.e()) {
                int e = e();
                for (int i = 0; i < e; i++) {
                    if (m20.L(h(i).a(), mp2Var.h(i).a()) && m20.L(h(i).getKind(), mp2Var.h(i).getKind())) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mp2
    public final String f(int i) {
        return this.f[i];
    }

    @Override // defpackage.mp2
    public final List g(int i) {
        return this.h[i];
    }

    @Override // defpackage.mp2
    public final List getAnnotations() {
        return this.d;
    }

    @Override // defpackage.mp2
    public final tp2 getKind() {
        return this.f3714b;
    }

    @Override // defpackage.mp2
    public final mp2 h(int i) {
        return this.g[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.mp2
    public final boolean i(int i) {
        return this.i[i];
    }

    @Override // defpackage.mp2
    public final boolean isInline() {
        return false;
    }

    public final String toString() {
        return d20.K0(t9.I0(0, this.c), ", ", this.f3713a + '(', ")", new l63(this, 2), 24);
    }
}
