package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class ek0 extends y1 implements ScheduledFuture {
    public static final /* synthetic */ int i = 0;
    public final ScheduledFuture h;

    public ek0(dk0 dk0Var) {
        this.h = dk0Var.a(new uo(this));
    }

    @Override // defpackage.y1
    public final void b() {
        boolean z;
        ScheduledFuture scheduledFuture = this.h;
        Object obj = this.f5254a;
        if ((obj instanceof r1) && ((r1) obj).f4085a) {
            z = true;
        } else {
            z = false;
        }
        scheduledFuture.cancel(z);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.h.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.h.getDelay(timeUnit);
    }
}
