package defpackage;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* loaded from: classes.dex */
public final class p4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3776a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ActionBarOverlayLayout f3777b;

    public /* synthetic */ p4(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.f3776a = i;
        this.f3777b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f3776a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f3777b;
        switch (i) {
            case 0:
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.w = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.x);
                return;
            default:
                actionBarOverlayLayout.b();
                actionBarOverlayLayout.w = actionBarOverlayLayout.d.animate().translationY(-actionBarOverlayLayout.d.getHeight()).setListener(actionBarOverlayLayout.x);
                return;
        }
    }
}
