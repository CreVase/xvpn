package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
public final class rm3 {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f4181a;

    public rm3(View view) {
        this.f4181a = new WeakReference(view);
    }

    public final void a(float f) {
        View view = (View) this.f4181a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void b() {
        View view = (View) this.f4181a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void c(long j) {
        View view = (View) this.f4181a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void d(um3 um3Var) {
        View view = (View) this.f4181a.get();
        if (view != null) {
            if (um3Var != null) {
                view.animate().setListener(new pm3(0, this, um3Var, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void e(float f) {
        View view = (View) this.f4181a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
