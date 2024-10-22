package defpackage;

import android.os.Handler;
import android.widget.AbsListView;

/* loaded from: classes.dex */
public final class fl1 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hl1 f2110a;

    public fl1(hl1 hl1Var) {
        this.f2110a = hl1Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        boolean z = true;
        if (i == 1) {
            hl1 hl1Var = this.f2110a;
            if (hl1Var.z.getInputMethodMode() != 2) {
                z = false;
            }
            if (!z && hl1Var.z.getContentView() != null) {
                Handler handler = hl1Var.v;
                al1 al1Var = hl1Var.r;
                handler.removeCallbacks(al1Var);
                al1Var.run();
            }
        }
    }
}
