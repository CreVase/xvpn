package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class cv implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1679a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1680b;

    public /* synthetic */ cv(Object obj, int i) {
        this.f1679a = i;
        this.f1680b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f1679a) {
            case 0:
            case 1:
                return;
            default:
                pr0 pr0Var = (pr0) this.f1680b;
                int i = pr0.w;
                if (pr0Var.u != null && (accessibilityManager = pr0Var.t) != null) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    if (xk3.b(pr0Var)) {
                        n2.a(accessibilityManager, pr0Var.u);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        int i = this.f1679a;
        Object obj = this.f1680b;
        switch (i) {
            case 0:
                fv fvVar = (fv) obj;
                ViewTreeObserver viewTreeObserver = fvVar.y;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fvVar.y = view.getViewTreeObserver();
                    }
                    fvVar.y.removeGlobalOnLayoutListener(fvVar.j);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                q03 q03Var = (q03) obj;
                ViewTreeObserver viewTreeObserver2 = q03Var.p;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        q03Var.p = view.getViewTreeObserver();
                    }
                    q03Var.p.removeGlobalOnLayoutListener(q03Var.j);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            default:
                pr0 pr0Var = (pr0) obj;
                int i2 = pr0.w;
                o2 o2Var = pr0Var.u;
                if (o2Var != null && (accessibilityManager = pr0Var.t) != null) {
                    n2.b(accessibilityManager, o2Var);
                    return;
                }
                return;
        }
    }
}
