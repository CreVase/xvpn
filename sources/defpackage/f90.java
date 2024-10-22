package defpackage;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class f90 extends AtomicBoolean implements OutcomeReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final c90 f2062a;

    public f90(vu vuVar) {
        super(false);
        this.f2062a = vuVar;
    }

    @Override // android.os.OutcomeReceiver
    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.f2062a.resumeWith(new pk2(th));
        }
    }

    @Override // android.os.OutcomeReceiver
    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.f2062a.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
