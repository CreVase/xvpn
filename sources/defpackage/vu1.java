package defpackage;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class vu1 extends FrameLayout implements w10 {

    /* renamed from: a, reason: collision with root package name */
    public final CollapsibleActionView f4898a;

    /* JADX WARN: Multi-variable type inference failed */
    public vu1(View view) {
        super(view.getContext());
        this.f4898a = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // defpackage.w10
    public final void d() {
        this.f4898a.onActionViewExpanded();
    }

    @Override // defpackage.w10
    public final void e() {
        this.f4898a.onActionViewCollapsed();
    }
}
