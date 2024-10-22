package defpackage;

import android.util.Log;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class ja0 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f2732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f2733b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ at3 d;
    public final /* synthetic */ boolean e = false;
    public final /* synthetic */ na0 f;

    public ja0(na0 na0Var, long j, Throwable th, Thread thread, at3 at3Var) {
        this.f = na0Var;
        this.f2732a = j;
        this.f2733b = th;
        this.c = thread;
        this.d = at3Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        jx0 jx0Var;
        String str;
        long j = this.f2732a;
        long j2 = j / 1000;
        na0 na0Var = this.f;
        String d = na0Var.d();
        if (d == null) {
            Log.e("FirebaseCrashlytics", "Tried to write a fatal exception while no session was open.", null);
            return Tasks.forResult(null);
        }
        na0Var.c.h();
        na0Var.m.t(this.f2733b, this.c, d, AppMeasurement.CRASH_ORIGIN, j2, true);
        try {
            jx0Var = na0Var.g;
            str = ".ae" + j;
            jx0Var.getClass();
        } catch (IOException unused) {
        }
        if (!new File((File) jx0Var.f2846b, str).createNewFile()) {
            throw new IOException("Create new file failed.");
        }
        at3 at3Var = this.d;
        na0Var.c(false, at3Var);
        new gt(na0Var.f);
        na0.a(na0Var, gt.f2320b, Boolean.valueOf(this.e));
        if (!na0Var.f3422b.b()) {
            return Tasks.forResult(null);
        }
        Executor executor = (Executor) na0Var.e.f1907a;
        return ((TaskCompletionSource) ((AtomicReference) at3Var.i).get()).getTask().onSuccessTask(executor, new y33(24, this, executor, d));
    }
}
