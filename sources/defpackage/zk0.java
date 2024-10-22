package defpackage;

/* loaded from: classes2.dex */
public final class zk0 extends RuntimeException {

    /* renamed from: a, reason: collision with root package name */
    public final transient t90 f5495a;

    public zk0(t90 t90Var) {
        this.f5495a = t90Var;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.f5495a.toString();
    }
}
