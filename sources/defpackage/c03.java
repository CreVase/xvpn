package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class c03 implements v23 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f565a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f566b;
    public final Object c;

    public /* synthetic */ c03(int i, Object obj, Object obj2) {
        this.f565a = i;
        this.f566b = obj;
        this.c = obj2;
    }

    @Override // defpackage.v23
    public final int a(long j) {
        int i;
        int i2 = this.f565a;
        Object obj = this.c;
        switch (i2) {
            case 0:
                List list = (List) obj;
                Long valueOf = Long.valueOf(j);
                int i3 = wi3.f5017a;
                int binarySearch = Collections.binarySearch(list, valueOf);
                if (binarySearch < 0) {
                    i = ~binarySearch;
                } else {
                    int size = list.size();
                    do {
                        binarySearch++;
                        if (binarySearch < size) {
                        }
                        i = binarySearch;
                    } while (((Comparable) list.get(binarySearch)).compareTo(valueOf) == 0);
                    i = binarySearch;
                }
                if (i >= list.size()) {
                    return -1;
                }
                return i;
            default:
                long[] jArr = (long[]) obj;
                int b2 = wi3.b(jArr, j, false);
                if (b2 >= jArr.length) {
                    return -1;
                }
                return b2;
        }
    }

    @Override // defpackage.v23
    public final long b(int i) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        int i2 = this.f565a;
        Object obj = this.c;
        switch (i2) {
            case 0:
                if (i >= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                cp3.e(z2);
                List list = (List) obj;
                if (i >= list.size()) {
                    z3 = false;
                }
                cp3.e(z3);
                return ((Long) list.get(i)).longValue();
            default:
                if (i >= 0) {
                    z = true;
                } else {
                    z = false;
                }
                cp3.e(z);
                long[] jArr = (long[]) obj;
                if (i >= jArr.length) {
                    z3 = false;
                }
                cp3.e(z3);
                return jArr[i];
        }
    }

    @Override // defpackage.v23
    public final List c(long j) {
        hc0 hc0Var;
        int i = this.f565a;
        Object obj = this.f566b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int d = wi3.d((List) obj2, Long.valueOf(j), false);
                if (d == -1) {
                    return Collections.emptyList();
                }
                return (List) ((List) obj).get(d);
            default:
                int f = wi3.f((long[]) obj2, j, false);
                if (f != -1 && (hc0Var = ((hc0[]) obj)[f]) != hc0.r) {
                    return Collections.singletonList(hc0Var);
                }
                return Collections.emptyList();
        }
    }

    @Override // defpackage.v23
    public final int d() {
        int i = this.f565a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((List) obj).size();
            default:
                return ((long[]) obj).length;
        }
    }
}
