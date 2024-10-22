package defpackage;

import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.e;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public abstract class n71 extends mm3 {
    public ku c;
    public OverScroller d;
    public boolean e;
    public int f;
    public int g;
    public int h;
    public VelocityTracker i;

    public n71() {
        this.f = -1;
        this.h = -1;
    }

    @Override // defpackage.h90
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        View view2;
        boolean z2;
        int findPointerIndex;
        if (this.h < 0) {
            this.h = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.e) {
            int i = this.f;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.g) > this.h) {
                this.g = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) this;
            e eVar = baseBehavior.o;
            if (eVar != null) {
                z = eVar.a();
            } else {
                WeakReference weakReference = baseBehavior.n;
                if (weakReference != null && ((view2 = (View) weakReference.get()) == null || !view2.isShown() || view2.canScrollVertically(-1))) {
                    z = false;
                } else {
                    z = true;
                }
            }
            if (z && coordinatorLayout.o(view, x, y2)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.e = z2;
            if (z2) {
                this.g = y2;
                this.f = motionEvent.getPointerId(0);
                if (this.i == null) {
                    this.i = VelocityTracker.obtain();
                }
                OverScroller overScroller = this.d;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.d.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.i;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ed  */
    @Override // defpackage.h90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean s(androidx.coordinatorlayout.widget.CoordinatorLayout r21, android.view.View r22, android.view.MotionEvent r23) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n71.s(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    public abstract int v();

    public abstract int w(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3);

    public final void x(CoordinatorLayout coordinatorLayout, View view, int i) {
        w(coordinatorLayout, view, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public n71(int i) {
        super(0);
        this.f = -1;
        this.h = -1;
    }
}
