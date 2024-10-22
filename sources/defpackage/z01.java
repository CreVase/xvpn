package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class z01 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5410a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a11 f5411b;

    public /* synthetic */ z01(a11 a11Var, int i) {
        this.f5410a = i;
        this.f5411b = a11Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f5410a;
        a11 a11Var = this.f5411b;
        switch (i) {
            case 0:
                ViewParent parent = a11Var.d.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                a11Var.a();
                View view = a11Var.d;
                if (view.isEnabled() && !view.isLongClickable() && a11Var.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    a11Var.g = true;
                    return;
                }
                return;
        }
    }
}
