package defpackage;

import android.os.Binder;
import android.os.Process;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class dx1 implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1855a;

    /* renamed from: b, reason: collision with root package name */
    public Object f1856b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dx1(int i, Object obj, Object obj2) {
        this.f1855a = i;
        this.c = obj;
        this.f1856b = obj2;
    }

    public final Task a() {
        int i = this.f1855a;
        Object obj = this.c;
        switch (i) {
            case 2:
                if (!((Boolean) this.f1856b).booleanValue()) {
                    uy0 uy0Var = (uy0) obj;
                    na0 na0Var = (na0) uy0Var.c;
                    Iterator it = jx0.w(((File) na0Var.g.f2846b).listFiles(na0.r)).iterator();
                    while (it.hasNext()) {
                        ((File) it.next()).delete();
                    }
                    jx0 jx0Var = ((tb0) ((na0) uy0Var.c).m.f2846b).f4479b;
                    tb0.a(jx0.w(((File) jx0Var.d).listFiles()));
                    tb0.a(jx0.w(((File) jx0Var.e).listFiles()));
                    tb0.a(jx0.w(((File) jx0Var.f).listFiles()));
                    ((na0) uy0Var.c).q.trySetResult(null);
                    return Tasks.forResult(null);
                }
                boolean booleanValue = ((Boolean) this.f1856b).booleanValue();
                uy0 uy0Var2 = (uy0) obj;
                nd0 nd0Var = ((na0) uy0Var2.c).f3422b;
                if (booleanValue) {
                    nd0Var.h.trySetResult(null);
                    Executor executor = (Executor) ((na0) uy0Var2.c).e.f1907a;
                    return ((Task) uy0Var2.f4757b).onSuccessTask(executor, new uy0(this, executor, 19));
                }
                nd0Var.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            default:
                return qa0.a((qa0) obj, (at3) this.f1856b);
        }
    }

    public final void b() {
        switch (this.f1855a) {
            case 1:
                ((Runnable) this.f1856b).run();
                return;
            default:
                na0.a((na0) this.c, (String) this.f1856b, Boolean.FALSE);
                return;
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Object obj = null;
        switch (this.f1855a) {
            case 0:
                Object obj2 = this.c;
                ((rg) obj2).e.set(true);
                try {
                    Process.setThreadPriority(10);
                    rg rgVar = (rg) obj2;
                    Object[] objArr = (Object[]) this.f1856b;
                    rgVar.getClass();
                    obj = rgVar.h.onLoadInBackground();
                    Binder.flushPendingCommands();
                    return obj;
                } finally {
                }
            case 1:
                b();
                return null;
            case 2:
                return a();
            case 3:
                b();
                return null;
            default:
                return a();
        }
    }

    public dx1(rg rgVar) {
        this.f1855a = 0;
        this.c = rgVar;
    }
}
