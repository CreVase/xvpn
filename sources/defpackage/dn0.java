package defpackage;

import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class dn0 implements Drawable.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1807a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Object f1808b;

    public dn0() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.f1807a) {
            case 0:
                return;
            default:
                ((ob) this.f1808b).invalidateSelf();
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.f1807a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f1808b;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
            default:
                ((ob) this.f1808b).scheduleSelf(runnable, j);
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.f1807a) {
            case 0:
                Drawable.Callback callback = (Drawable.Callback) this.f1808b;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
            default:
                ((ob) this.f1808b).unscheduleSelf(runnable);
                return;
        }
    }

    public dn0(ob obVar) {
        this.f1808b = obVar;
    }
}
