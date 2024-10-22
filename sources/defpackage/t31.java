package defpackage;

import android.view.View;
import com.security.xvpn.z35kb.widget.FullDragDrawerLayout;

/* loaded from: classes2.dex */
public final class t31 extends fl {
    public final int r;
    public vl3 s;
    public final /* synthetic */ FullDragDrawerLayout t;

    public t31(FullDragDrawerLayout fullDragDrawerLayout, int i) {
        this.t = fullDragDrawerLayout;
        this.r = i;
    }

    @Override // defpackage.fl
    public final int G(View view) {
        this.t.getClass();
        if (FullDragDrawerLayout.k(view)) {
            return view.getWidth();
        }
        return 0;
    }

    @Override // defpackage.fl
    public final void M(int i, int i2) {
        View d;
        int i3 = i & 1;
        FullDragDrawerLayout fullDragDrawerLayout = this.t;
        if (i3 == 1) {
            d = fullDragDrawerLayout.d(3);
        } else {
            d = fullDragDrawerLayout.d(5);
        }
        if (d != null && fullDragDrawerLayout.g(d) == 0) {
            this.s.b(d, i2);
        }
    }

    @Override // defpackage.fl
    public final void N() {
    }

    @Override // defpackage.fl
    public final void O(View view, int i) {
        ((s31) view.getLayoutParams()).getClass();
        int i2 = 3;
        if (this.r == 3) {
            i2 = 5;
        }
        FullDragDrawerLayout fullDragDrawerLayout = this.t;
        View d = fullDragDrawerLayout.d(i2);
        if (d != null) {
            fullDragDrawerLayout.b(d);
        }
    }

    @Override // defpackage.fl
    public final void P(int i) {
        this.t.q(this.s.s, i);
    }

    @Override // defpackage.fl
    public final void Q(View view, int i, int i2) {
        float width;
        int i3;
        int width2 = view.getWidth();
        FullDragDrawerLayout fullDragDrawerLayout = this.t;
        if (fullDragDrawerLayout.a(view, 3)) {
            width = i + width2;
        } else {
            width = fullDragDrawerLayout.getWidth() - i;
        }
        float f = width / width2;
        fullDragDrawerLayout.n(view, f);
        if (f == 0.0f) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        view.setVisibility(i3);
        fullDragDrawerLayout.invalidate();
    }

    @Override // defpackage.fl
    public final void R(View view, float f, float f2) {
        int i;
        FullDragDrawerLayout fullDragDrawerLayout = this.t;
        fullDragDrawerLayout.getClass();
        float f3 = ((s31) view.getLayoutParams()).f4264b;
        int width = view.getWidth();
        if (fullDragDrawerLayout.a(view, 3)) {
            if (f <= 0.0f && (f != 0.0f || f3 <= 0.5f)) {
                i = -width;
            } else {
                i = 0;
            }
        } else {
            int width2 = fullDragDrawerLayout.getWidth();
            if (f < 0.0f || (f == 0.0f && f3 > 0.5f)) {
                width2 -= width;
            }
            i = width2;
        }
        this.s.q(i, view.getTop());
        fullDragDrawerLayout.invalidate();
    }

    @Override // defpackage.fl
    public final boolean e0(View view, int i) {
        FullDragDrawerLayout fullDragDrawerLayout = this.t;
        fullDragDrawerLayout.getClass();
        if (FullDragDrawerLayout.k(view) && fullDragDrawerLayout.a(view, this.r) && fullDragDrawerLayout.g(view) == 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fl
    public final int q(View view, int i) {
        FullDragDrawerLayout fullDragDrawerLayout = this.t;
        if (fullDragDrawerLayout.a(view, 3)) {
            return Math.max(-view.getWidth(), Math.min(i, 0));
        }
        int width = fullDragDrawerLayout.getWidth();
        return Math.max(width - view.getWidth(), Math.min(i, width));
    }

    @Override // defpackage.fl
    public final int r(View view, int i) {
        return view.getTop();
    }
}
