package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class kp3 implements v23 {

    /* renamed from: a, reason: collision with root package name */
    public final List f2996a;

    /* renamed from: b, reason: collision with root package name */
    public final long[] f2997b;
    public final long[] c;

    public kp3(ArrayList arrayList) {
        this.f2996a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f2997b = new long[arrayList.size() * 2];
        for (int i = 0; i < arrayList.size(); i++) {
            bp3 bp3Var = (bp3) arrayList.get(i);
            int i2 = i * 2;
            long[] jArr = this.f2997b;
            jArr[i2] = bp3Var.f508b;
            jArr[i2 + 1] = bp3Var.c;
        }
        long[] jArr2 = this.f2997b;
        long[] copyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.c = copyOf;
        Arrays.sort(copyOf);
    }

    @Override // defpackage.v23
    public final int a(long j) {
        long[] jArr = this.c;
        int b2 = wi3.b(jArr, j, false);
        if (b2 >= jArr.length) {
            return -1;
        }
        return b2;
    }

    @Override // defpackage.v23
    public final long b(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        long[] jArr = this.c;
        if (i >= jArr.length) {
            z2 = false;
        }
        cp3.e(z2);
        return jArr[i];
    }

    @Override // defpackage.v23
    public final List c(long j) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int i = 0;
        while (true) {
            List list = this.f2996a;
            if (i >= list.size()) {
                break;
            }
            int i2 = i * 2;
            long[] jArr = this.f2997b;
            if (jArr[i2] <= j && j < jArr[i2 + 1]) {
                bp3 bp3Var = (bp3) list.get(i);
                hc0 hc0Var = bp3Var.f507a;
                if (hc0Var.e == -3.4028235E38f) {
                    arrayList2.add(bp3Var);
                } else {
                    arrayList.add(hc0Var);
                }
            }
            i++;
        }
        Collections.sort(arrayList2, new xz0(7));
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            hc0 hc0Var2 = ((bp3) arrayList2.get(i3)).f507a;
            hc0Var2.getClass();
            arrayList.add(new hc0(hc0Var2.f2398a, hc0Var2.f2399b, hc0Var2.c, hc0Var2.d, (-1) - i3, 1, hc0Var2.g, hc0Var2.h, hc0Var2.i, hc0Var2.n, hc0Var2.o, hc0Var2.j, hc0Var2.k, hc0Var2.l, hc0Var2.m, hc0Var2.p, hc0Var2.q));
        }
        return arrayList;
    }

    @Override // defpackage.v23
    public final int d() {
        return this.c.length;
    }
}
