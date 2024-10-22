package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ff3 implements v23 {

    /* renamed from: b, reason: collision with root package name */
    public static final ff3 f2086b = new ff3();

    /* renamed from: a, reason: collision with root package name */
    public final List f2087a;

    public ff3(hc0 hc0Var) {
        this.f2087a = Collections.singletonList(hc0Var);
    }

    @Override // defpackage.v23
    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.v23
    public final long b(int i) {
        boolean z;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        cp3.e(z);
        return 0L;
    }

    @Override // defpackage.v23
    public final List c(long j) {
        if (j >= 0) {
            return this.f2087a;
        }
        return Collections.emptyList();
    }

    @Override // defpackage.v23
    public final int d() {
        return 1;
    }

    public ff3() {
        this.f2087a = Collections.emptyList();
    }
}
