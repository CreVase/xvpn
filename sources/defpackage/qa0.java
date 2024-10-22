package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class qa0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f3974a;

    /* renamed from: b, reason: collision with root package name */
    public final nd0 f3975b;
    public final uy0 c;
    public final long d;
    public uy0 e;
    public uy0 f;
    public na0 g;
    public final ka1 h;
    public final jx0 i;
    public final zq j;
    public final ua k;
    public final ExecutorService l;
    public final eb3 m;
    public final ha0 n;
    public final ra0 o;

    public qa0(px0 px0Var, ka1 ka1Var, sa0 sa0Var, nd0 nd0Var, sa saVar, sa saVar2, jx0 jx0Var, ExecutorService executorService, ha0 ha0Var) {
        this.f3975b = nd0Var;
        px0Var.a();
        this.f3974a = px0Var.f3931a;
        this.h = ka1Var;
        this.o = sa0Var;
        this.j = saVar;
        this.k = saVar2;
        this.l = executorService;
        this.i = jx0Var;
        this.m = new eb3(executorService);
        this.n = ha0Var;
        this.d = System.currentTimeMillis();
        this.c = new uy0(22);
    }

    public static Task a(qa0 qa0Var, at3 at3Var) {
        Task forException;
        boolean z;
        eb3 eb3Var = qa0Var.m;
        Boolean bool = Boolean.TRUE;
        if (bool.equals(((ThreadLocal) eb3Var.d).get())) {
            qa0Var.e.h();
            try {
                try {
                    qa0Var.j.o(new oa0(qa0Var));
                    qa0Var.g.e();
                    if (!at3Var.d().f4884b.f4721a) {
                        forException = Tasks.forException(new RuntimeException("Collection of crash reports disabled in Crashlytics settings."));
                    } else {
                        na0 na0Var = qa0Var.g;
                        if (bool.equals(((ThreadLocal) na0Var.e.d).get())) {
                            vb0 vb0Var = na0Var.n;
                            if (vb0Var != null && vb0Var.e.get()) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                try {
                                    na0Var.c(true, at3Var);
                                } catch (Exception e) {
                                    Log.e("FirebaseCrashlytics", "Unable to finalize previously open sessions.", e);
                                }
                            }
                            forException = qa0Var.g.f(((TaskCompletionSource) ((AtomicReference) at3Var.i).get()).getTask());
                        } else {
                            throw new IllegalStateException("Not running on background worker thread as intended.");
                        }
                    }
                } catch (Exception e2) {
                    Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e2);
                    forException = Tasks.forException(e2);
                }
                return forException;
            } finally {
                qa0Var.b();
            }
        }
        throw new IllegalStateException("Not running on background worker thread as intended.");
    }

    public final void b() {
        this.m.D(new pa0(this, 0));
    }
}
