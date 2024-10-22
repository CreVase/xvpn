package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.fragment.app.l;
import defpackage.nw3;
import defpackage.q30;
import defpackage.u31;

/* loaded from: classes.dex */
public final class a implements q30, ViewTreeObserver.OnDrawListener, Runnable {

    /* renamed from: b, reason: collision with root package name */
    public Runnable f129b;
    public final /* synthetic */ ComponentActivity d;

    /* renamed from: a, reason: collision with root package name */
    public final long f128a = SystemClock.uptimeMillis() + 10000;
    public boolean c = false;

    public a(l lVar) {
        this.d = lVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f129b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        if (this.c) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                decorView.invalidate();
                return;
            } else {
                decorView.postInvalidate();
                return;
            }
        }
        decorView.postOnAnimation(new nw3(this, 2));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        Runnable runnable = this.f129b;
        if (runnable != null) {
            runnable.run();
            this.f129b = null;
            u31 u31Var = this.d.mFullyDrawnReporter;
            synchronized (u31Var.f4621b) {
                z = u31Var.c;
            }
            if (z) {
                this.c = false;
                this.d.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        if (SystemClock.uptimeMillis() > this.f128a) {
            this.c = false;
            this.d.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // defpackage.q30
    public final void x(View view) {
        if (!this.c) {
            this.c = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }
    }
}
