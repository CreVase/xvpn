package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class tp0 implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference f4556a;

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        View view;
        WeakReference weakReference = this.f4556a;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        View view;
        WeakReference weakReference = this.f4556a;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.scheduleDrawable(drawable, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        View view;
        WeakReference weakReference = this.f4556a;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.unscheduleDrawable(drawable, runnable);
        }
    }
}
