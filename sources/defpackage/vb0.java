package defpackage;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class vb0 implements Thread.UncaughtExceptionHandler {

    /* renamed from: a, reason: collision with root package name */
    public final uo f4806a;

    /* renamed from: b, reason: collision with root package name */
    public final at3 f4807b;
    public final Thread.UncaughtExceptionHandler c;
    public final ra0 d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public vb0(uo uoVar, at3 at3Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, ra0 ra0Var) {
        this.f4806a = uoVar;
        this.f4807b = at3Var;
        this.c = uncaughtExceptionHandler;
        this.d = ra0Var;
    }

    public final boolean a(Thread thread, Throwable th) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        }
        if (th == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        }
        if (((sa0) this.d).b()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.c;
        AtomicBoolean atomicBoolean = this.e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th)) {
                    this.f4806a.g(this.f4807b, thread, th);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e);
            }
        } finally {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            atomicBoolean.set(false);
        }
    }
}
