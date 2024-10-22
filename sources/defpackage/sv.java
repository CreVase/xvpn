package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class sv implements v23 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4417a;

    /* renamed from: b, reason: collision with root package name */
    public final List f4418b;

    public /* synthetic */ sv(int i, List list) {
        this.f4417a = i;
        this.f4418b = list;
    }

    @Override // defpackage.v23
    public final int a(long j) {
        switch (this.f4417a) {
            case 0:
                return j < 0 ? 0 : -1;
            case 1:
            case 2:
                return -1;
            default:
                return j < 0 ? 0 : -1;
        }
    }

    @Override // defpackage.v23
    public final long b(int i) {
        boolean z = false;
        switch (this.f4417a) {
            case 0:
                if (i == 0) {
                    z = true;
                }
                cp3.e(z);
                return 0L;
            case 1:
            case 2:
                return 0L;
            default:
                if (i == 0) {
                    z = true;
                }
                cp3.e(z);
                return 0L;
        }
    }

    @Override // defpackage.v23
    public final List c(long j) {
        int i = this.f4417a;
        List list = this.f4418b;
        switch (i) {
            case 0:
                if (j < 0) {
                    return Collections.emptyList();
                }
                return list;
            case 1:
            case 2:
                return list;
            default:
                if (j < 0) {
                    return Collections.emptyList();
                }
                return list;
        }
    }

    @Override // defpackage.v23
    public final int d() {
        return 1;
    }

    public sv(ArrayList arrayList) {
        this.f4417a = 3;
        this.f4418b = Collections.unmodifiableList(arrayList);
    }
}
