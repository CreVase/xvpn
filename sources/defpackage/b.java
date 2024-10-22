package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class b extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient iz0 f371a;

    public b(iz0 iz0Var) {
        super("Flow was aborted, no more elements needed");
        this.f371a = iz0Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
