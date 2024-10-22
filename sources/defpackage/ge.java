package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* loaded from: classes.dex */
public final class ge implements PopupWindow.OnDismissListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f2240a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ he f2241b;

    public ge(he heVar, bv bvVar) {
        this.f2241b = heVar;
        this.f2240a = bvVar;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f2241b.H.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.f2240a);
        }
    }
}
