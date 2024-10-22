package defpackage;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* loaded from: classes2.dex */
public abstract class jn2 extends us0 {

    /* renamed from: b, reason: collision with root package name */
    public final z90 f2796b;

    public jn2(int i, int i2, String str, long j) {
        this.f2796b = new z90(i, i2, str, j);
    }

    @Override // defpackage.v90
    public final void K(t90 t90Var, Runnable runnable) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = z90.h;
        this.f2796b.c(runnable, m63.g, false);
    }
}
