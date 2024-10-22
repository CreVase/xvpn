package defpackage;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class f11 extends d93 {

    /* renamed from: a, reason: collision with root package name */
    public d93 f2030a;

    public f11(d93 d93Var) {
        this.f2030a = d93Var;
    }

    @Override // defpackage.d93
    public final d93 clearDeadline() {
        return this.f2030a.clearDeadline();
    }

    @Override // defpackage.d93
    public final d93 clearTimeout() {
        return this.f2030a.clearTimeout();
    }

    @Override // defpackage.d93
    public final long deadlineNanoTime() {
        return this.f2030a.deadlineNanoTime();
    }

    @Override // defpackage.d93
    public final boolean hasDeadline() {
        return this.f2030a.hasDeadline();
    }

    @Override // defpackage.d93
    public final void throwIfReached() {
        this.f2030a.throwIfReached();
    }

    @Override // defpackage.d93
    public final d93 timeout(long j, TimeUnit timeUnit) {
        return this.f2030a.timeout(j, timeUnit);
    }

    @Override // defpackage.d93
    public final long timeoutNanos() {
        return this.f2030a.timeoutNanos();
    }

    @Override // defpackage.d93
    public final d93 deadlineNanoTime(long j) {
        return this.f2030a.deadlineNanoTime(j);
    }
}
