package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class sa0 implements ra0 {
    public static final s71 c = new s71((q71) null);

    /* renamed from: a, reason: collision with root package name */
    public final sj0 f4298a;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicReference f4299b = new AtomicReference(null);

    public sa0(sj0 sj0Var) {
        this.f4298a = sj0Var;
        ((q32) sj0Var).a(new z5(this, 27));
    }

    public final s71 a(String str) {
        ra0 ra0Var = (ra0) this.f4299b.get();
        if (ra0Var == null) {
            return c;
        }
        return ((sa0) ra0Var).a(str);
    }

    public final boolean b() {
        ra0 ra0Var = (ra0) this.f4299b.get();
        if (ra0Var != null && ((sa0) ra0Var).b()) {
            return true;
        }
        return false;
    }

    public final boolean c(String str) {
        ra0 ra0Var = (ra0) this.f4299b.get();
        if (ra0Var != null && ((sa0) ra0Var).c(str)) {
            return true;
        }
        return false;
    }
}
