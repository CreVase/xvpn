package defpackage;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class sl2 {

    /* renamed from: a, reason: collision with root package name */
    public final pp3 f4364a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f4365b = new ArrayList();

    public sl2(pp3 pp3Var) {
        this.f4364a = null;
        this.f4364a = pp3Var;
    }

    public static long a(qk0 qk0Var, long j) {
        pp3 pp3Var = qk0Var.d;
        if (pp3Var instanceof y71) {
            return j;
        }
        ArrayList arrayList = qk0Var.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            lk0 lk0Var = (lk0) arrayList.get(i);
            if (lk0Var instanceof qk0) {
                qk0 qk0Var2 = (qk0) lk0Var;
                if (qk0Var2.d != pp3Var) {
                    j2 = Math.min(j2, a(qk0Var2, qk0Var2.f + j));
                }
            }
        }
        if (qk0Var == pp3Var.i) {
            long j3 = pp3Var.j();
            long j4 = j - j3;
            return Math.min(Math.min(j2, a(pp3Var.h, j4)), j4 - r9.f);
        }
        return j2;
    }

    public static long b(qk0 qk0Var, long j) {
        pp3 pp3Var = qk0Var.d;
        if (pp3Var instanceof y71) {
            return j;
        }
        ArrayList arrayList = qk0Var.k;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            lk0 lk0Var = (lk0) arrayList.get(i);
            if (lk0Var instanceof qk0) {
                qk0 qk0Var2 = (qk0) lk0Var;
                if (qk0Var2.d != pp3Var) {
                    j2 = Math.max(j2, b(qk0Var2, qk0Var2.f + j));
                }
            }
        }
        if (qk0Var == pp3Var.h) {
            long j3 = pp3Var.j();
            long j4 = j + j3;
            return Math.max(Math.max(j2, b(pp3Var.i, j4)), j4 - r9.f);
        }
        return j2;
    }
}
