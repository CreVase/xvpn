package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;

/* loaded from: classes2.dex */
public final class zv3 implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f5559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ aw3 f5560b;

    public zv3(ViewGroup viewGroup, aw3 aw3Var) {
        this.f5559a = viewGroup;
        this.f5560b = aw3Var;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z;
        Rect rect = new Rect();
        View rootView = this.f5559a.getRootView();
        rootView.getWindowVisibleDisplayFrame(rect);
        if (rootView.getBottom() - rect.bottom > rootView.getResources().getDisplayMetrics().density * 100.0f) {
            z = true;
        } else {
            z = false;
        }
        aw3 aw3Var = this.f5560b;
        if (aw3Var != null) {
            aw3Var.d(z);
        }
    }
}
