package defpackage;

import android.graphics.Rect;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.security.xvpn.z35kb.browser.BrowserScrollingBehavior;

/* loaded from: classes.dex */
public abstract class h90 {
    public h90(int i) {
    }

    public boolean a(View view) {
        return false;
    }

    public boolean b(View view, View view2) {
        return false;
    }

    public void c(k90 k90Var) {
    }

    public boolean d(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return this instanceof BrowserScrollingBehavior;
    }

    public void e(CoordinatorLayout coordinatorLayout, View view) {
    }

    public void f() {
    }

    public boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    public boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        return false;
    }

    public boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        return false;
    }

    public boolean j(View view) {
        return false;
    }

    public void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
    }

    public void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        m();
    }

    public void m() {
    }

    public boolean n(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
        return false;
    }

    public void o(View view, Parcelable parcelable) {
    }

    public Parcelable p(View view) {
        return View.BaseSavedState.EMPTY_STATE;
    }

    public boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        return false;
    }

    public void r(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
    }

    public boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }
}
