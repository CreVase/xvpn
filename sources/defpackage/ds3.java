package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ds3 implements Runnable {
    public static final /* synthetic */ int g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final rr2 f1829a = new rr2();

    /* renamed from: b, reason: collision with root package name */
    public final Context f1830b;
    public final rs3 c;
    public final ListenableWorker d;
    public final s01 e;
    public final g63 f;

    static {
        bo1.e("WorkForegroundRunnable");
    }

    public ds3(Context context, rs3 rs3Var, ListenableWorker listenableWorker, s01 s01Var, g63 g63Var) {
        this.f1830b = context;
        this.c = rs3Var;
        this.d = listenableWorker;
        this.e = s01Var;
        this.f = g63Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c.q && !ur.b()) {
            rr2 rr2Var = new rr2();
            g63 g63Var = this.f;
            ((Executor) ((y33) g63Var).d).execute(new cs3(this, rr2Var, 0));
            rr2Var.addListener(new cs3(this, rr2Var, 1), (Executor) ((y33) g63Var).d);
            return;
        }
        this.f1829a.h(null);
    }
}
