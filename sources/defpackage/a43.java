package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public final class a43 extends fl {
    public int r;
    public int s = -1;
    public final /* synthetic */ SwipeDismissBehavior t;

    public a43(SwipeDismissBehavior swipeDismissBehavior) {
        this.t = swipeDismissBehavior;
    }

    @Override // defpackage.fl
    public final int G(View view) {
        return view.getWidth();
    }

    @Override // defpackage.fl
    public final void O(View view, int i) {
        this.s = i;
        this.r = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            SwipeDismissBehavior swipeDismissBehavior = this.t;
            swipeDismissBehavior.d = true;
            parent.requestDisallowInterceptTouchEvent(true);
            swipeDismissBehavior.d = false;
        }
    }

    @Override // defpackage.fl
    public final void P(int i) {
        ja1 ja1Var = this.t.f1527b;
        if (ja1Var != null) {
            if (i != 0) {
                if (i == 1 || i == 2) {
                    ax2.b().d(((yo) ja1Var.f2735b).t);
                    return;
                }
                return;
            }
            ax2 b2 = ax2.b();
            vo voVar = ((yo) ja1Var.f2735b).t;
            synchronized (b2.f359a) {
                if (b2.c(voVar)) {
                    zw2 zw2Var = b2.c;
                    if (zw2Var.c) {
                        zw2Var.c = false;
                        b2.f(zw2Var);
                    }
                }
            }
        }
    }

    @Override // defpackage.fl
    public final void Q(View view, int i, int i2) {
        float width = view.getWidth();
        SwipeDismissBehavior swipeDismissBehavior = this.t;
        float f = width * swipeDismissBehavior.g;
        float width2 = view.getWidth() * swipeDismissBehavior.h;
        float abs = Math.abs(i - this.r);
        if (abs <= f) {
            view.setAlpha(1.0f);
        } else if (abs >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((abs - f) / (width2 - f))), 1.0f));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0051, code lost:            if (java.lang.Math.abs(r9.getLeft() - r8.r) >= java.lang.Math.round(r9.getWidth() * r2.f)) goto L27;     */
    @Override // defpackage.fl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(android.view.View r9, float r10, float r11) {
        /*
            r8 = this;
            r11 = -1
            r8.s = r11
            int r11 = r9.getWidth()
            r0 = 0
            r1 = 0
            com.google.android.material.behavior.SwipeDismissBehavior r2 = r8.t
            r3 = 1
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 == 0) goto L39
            java.util.WeakHashMap r5 = defpackage.ll3.f3151a
            int r5 = defpackage.vk3.d(r9)
            if (r5 != r3) goto L1a
            r5 = 1
            goto L1b
        L1a:
            r5 = 0
        L1b:
            int r6 = r2.e
            r7 = 2
            if (r6 != r7) goto L21
            goto L53
        L21:
            if (r6 != 0) goto L2d
            if (r5 == 0) goto L2a
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 >= 0) goto L55
            goto L53
        L2a:
            if (r4 <= 0) goto L55
            goto L53
        L2d:
            if (r6 != r3) goto L55
            if (r5 == 0) goto L34
            if (r4 <= 0) goto L55
            goto L53
        L34:
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 >= 0) goto L55
            goto L53
        L39:
            int r4 = r9.getLeft()
            int r5 = r8.r
            int r4 = r4 - r5
            int r5 = r9.getWidth()
            float r5 = (float) r5
            float r6 = r2.f
            float r5 = r5 * r6
            int r5 = java.lang.Math.round(r5)
            int r4 = java.lang.Math.abs(r4)
            if (r4 < r5) goto L55
        L53:
            r4 = 1
            goto L56
        L55:
            r4 = 0
        L56:
            if (r4 == 0) goto L6c
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 < 0) goto L67
            int r10 = r9.getLeft()
            int r0 = r8.r
            if (r10 >= r0) goto L65
            goto L67
        L65:
            int r0 = r0 + r11
            goto L70
        L67:
            int r10 = r8.r
            int r0 = r10 - r11
            goto L70
        L6c:
            int r10 = r8.r
            r0 = r10
            r3 = 0
        L70:
            vl3 r10 = r2.f1526a
            int r11 = r9.getTop()
            boolean r10 = r10.q(r0, r11)
            if (r10 == 0) goto L87
            vq2 r10 = new vq2
            r10.<init>(r2, r9, r3)
            java.util.WeakHashMap r11 = defpackage.ll3.f3151a
            defpackage.uk3.m(r9, r10)
            goto L90
        L87:
            if (r3 == 0) goto L90
            ja1 r10 = r2.f1527b
            if (r10 == 0) goto L90
            r10.H(r9)
        L90:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a43.R(android.view.View, float, float):void");
    }

    @Override // defpackage.fl
    public final boolean e0(View view, int i) {
        int i2 = this.s;
        if ((i2 == -1 || i2 == i) && this.t.t(view)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fl
    public final int q(View view, int i) {
        boolean z;
        int width;
        int width2;
        int width3;
        WeakHashMap weakHashMap = ll3.f3151a;
        if (vk3.d(view) == 1) {
            z = true;
        } else {
            z = false;
        }
        int i2 = this.t.e;
        if (i2 == 0) {
            if (z) {
                width = this.r - view.getWidth();
                width2 = this.r;
            } else {
                width = this.r;
                width3 = view.getWidth();
                width2 = width3 + width;
            }
        } else if (i2 == 1) {
            if (z) {
                width = this.r;
                width3 = view.getWidth();
                width2 = width3 + width;
            } else {
                width = this.r - view.getWidth();
                width2 = this.r;
            }
        } else {
            width = this.r - view.getWidth();
            width2 = view.getWidth() + this.r;
        }
        return Math.min(Math.max(width, i), width2);
    }

    @Override // defpackage.fl
    public final int r(View view, int i) {
        return view.getTop();
    }
}
