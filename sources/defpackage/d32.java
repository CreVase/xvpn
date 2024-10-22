package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes.dex */
public final class d32 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final View f1726a;

    /* renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f1727b;
    public final Runnable c;

    public d32(View view, Runnable runnable) {
        this.f1726a = view;
        this.f1727b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static void a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable != null) {
                d32 d32Var = new d32(view, runnable);
                view.getViewTreeObserver().addOnPreDrawListener(d32Var);
                view.addOnAttachStateChangeListener(d32Var);
                return;
            }
            throw new NullPointerException("runnable == null");
        }
        throw new NullPointerException("view == null");
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean isAlive = this.f1727b.isAlive();
        View view = this.f1726a;
        if (isAlive) {
            this.f1727b.removeOnPreDrawListener(this);
        } else {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view.removeOnAttachStateChangeListener(this);
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f1727b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        boolean isAlive = this.f1727b.isAlive();
        View view2 = this.f1726a;
        if (isAlive) {
            this.f1727b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
    }
}
