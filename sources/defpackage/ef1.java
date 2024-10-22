package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class ef1 extends CancellationException {

    /* renamed from: a, reason: collision with root package name */
    public final transient df1 f1929a;

    public ef1(String str, Throwable th, df1 df1Var) {
        super(str);
        this.f1929a = df1Var;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof ef1) {
                ef1 ef1Var = (ef1) obj;
                if (!m20.L(ef1Var.getMessage(), getMessage()) || !m20.L(ef1Var.f1929a, this.f1929a) || !m20.L(ef1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        int i;
        int hashCode = (this.f1929a.hashCode() + (getMessage().hashCode() * 31)) * 31;
        Throwable cause = getCause();
        if (cause != null) {
            i = cause.hashCode();
        } else {
            i = 0;
        }
        return hashCode + i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.f1929a;
    }
}
