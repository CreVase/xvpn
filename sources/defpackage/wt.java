package defpackage;

import java.util.ArrayList;
import java.util.TreeSet;

/* loaded from: classes.dex */
public final class wt {

    /* renamed from: a, reason: collision with root package name */
    public final int f5067a;

    /* renamed from: b, reason: collision with root package name */
    public final String f5068b;
    public final TreeSet c = new TreeSet();
    public final ArrayList d = new ArrayList();
    public og0 e;

    public wt(int i, String str, og0 og0Var) {
        this.f5067a = i;
        this.f5068b = str;
        this.e = og0Var;
    }

    public final long a(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        if (j2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        cp3.e(z2);
        wu2 b2 = b(j, j2);
        boolean z4 = !b2.d;
        long j3 = Long.MAX_VALUE;
        long j4 = b2.c;
        if (z4) {
            if (j4 != -1) {
                z3 = false;
            }
            if (!z3) {
                j3 = j4;
            }
            return -Math.min(j3, j2);
        }
        long j5 = j + j2;
        if (j5 >= 0) {
            j3 = j5;
        }
        long j6 = b2.f4570b + j4;
        if (j6 < j3) {
            for (wu2 wu2Var : this.c.tailSet(b2, false)) {
                long j7 = wu2Var.f4570b;
                if (j7 > j6) {
                    break;
                }
                j6 = Math.max(j6, j7 + wu2Var.c);
                if (j6 >= j3) {
                    break;
                }
            }
        }
        return Math.min(j6 - j, j2);
    }

    public final wu2 b(long j, long j2) {
        long j3;
        wu2 wu2Var = new wu2(this.f5068b, j, -1L, -9223372036854775807L, null);
        TreeSet treeSet = this.c;
        wu2 wu2Var2 = (wu2) treeSet.floor(wu2Var);
        if (wu2Var2 != null && wu2Var2.f4570b + wu2Var2.c > j) {
            return wu2Var2;
        }
        wu2 wu2Var3 = (wu2) treeSet.ceiling(wu2Var);
        if (wu2Var3 != null) {
            long j4 = wu2Var3.f4570b - j;
            if (j2 == -1) {
                j3 = j4;
                return new wu2(this.f5068b, j, j3, -9223372036854775807L, null);
            }
            j2 = Math.min(j4, j2);
        }
        j3 = j2;
        return new wu2(this.f5068b, j, j3, -9223372036854775807L, null);
    }

    public final boolean c(long j, long j2) {
        boolean z;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i >= arrayList.size()) {
                return false;
            }
            vt vtVar = (vt) arrayList.get(i);
            long j3 = vtVar.f4890a;
            long j4 = vtVar.f4891b;
            if (j4 != -1 ? j2 != -1 && j3 <= j && j + j2 <= j3 + j4 : j >= j3) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
            i++;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || wt.class != obj.getClass()) {
            return false;
        }
        wt wtVar = (wt) obj;
        if (this.f5067a == wtVar.f5067a && this.f5068b.equals(wtVar.f5068b) && this.c.equals(wtVar.c) && this.e.equals(wtVar.e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + p71.h(this.f5068b, this.f5067a * 31, 31);
    }
}
