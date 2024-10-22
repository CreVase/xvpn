package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.search.SearchBar$ScrollingViewBehavior;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class o71 extends mm3 {
    public final Rect c;
    public final Rect d;
    public int e;
    public int f;

    public o71() {
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }

    @Override // defpackage.h90
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        AppBarLayout w;
        int i4;
        wq3 lastWindowInsets;
        int i5 = view.getLayoutParams().height;
        if ((i5 == -1 || i5 == -2) && (w = AppBarLayout.ScrollingViewBehavior.w(coordinatorLayout.e(view))) != null) {
            int size = View.MeasureSpec.getSize(i3);
            if (size > 0) {
                WeakHashMap weakHashMap = ll3.f3151a;
                if (uk3.b(w) && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
                    size += lastWindowInsets.b() + lastWindowInsets.e();
                }
            } else {
                size = coordinatorLayout.getHeight();
            }
            int totalScrollRange = w.getTotalScrollRange() + size;
            int measuredHeight = w.getMeasuredHeight();
            if (this instanceof SearchBar$ScrollingViewBehavior) {
                view.setTranslationY(-measuredHeight);
            } else {
                view.setTranslationY(0.0f);
                totalScrollRange -= measuredHeight;
            }
            if (i5 == -1) {
                i4 = 1073741824;
            } else {
                i4 = Integer.MIN_VALUE;
            }
            coordinatorLayout.r(view, i, i2, View.MeasureSpec.makeMeasureSpec(totalScrollRange, i4));
            return true;
        }
        return false;
    }

    @Override // defpackage.mm3
    public final void u(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        AppBarLayout w = AppBarLayout.ScrollingViewBehavior.w(coordinatorLayout.e(view));
        if (w != null) {
            k90 k90Var = (k90) view.getLayoutParams();
            int paddingLeft = coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) k90Var).leftMargin;
            int bottom = w.getBottom() + ((ViewGroup.MarginLayoutParams) k90Var).topMargin;
            int width = (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) k90Var).rightMargin;
            int bottom2 = ((w.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) k90Var).bottomMargin;
            Rect rect = this.c;
            rect.set(paddingLeft, bottom, width, bottom2);
            wq3 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null) {
                WeakHashMap weakHashMap = ll3.f3151a;
                if (uk3.b(coordinatorLayout) && !uk3.b(view)) {
                    rect.left = lastWindowInsets.c() + rect.left;
                    rect.right -= lastWindowInsets.d();
                }
            }
            Rect rect2 = this.d;
            int i3 = k90Var.c;
            if (i3 == 0) {
                i2 = 8388659;
            } else {
                i2 = i3;
            }
            a61.b(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int v = v(w);
            view.layout(rect2.left, rect2.top - v, rect2.right, rect2.bottom - v);
            this.e = rect2.top - w.getBottom();
            return;
        }
        coordinatorLayout.q(view, i);
        this.e = 0;
    }

    public final int v(View view) {
        int i;
        int i2;
        if (this.f == 0) {
            return 0;
        }
        float f = 0.0f;
        if (view instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) view;
            int totalScrollRange = appBarLayout.getTotalScrollRange();
            int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
            h90 h90Var = ((k90) appBarLayout.getLayoutParams()).f2909a;
            if (h90Var instanceof AppBarLayout.BaseBehavior) {
                i = ((AppBarLayout.BaseBehavior) h90Var).v();
            } else {
                i = 0;
            }
            if ((downNestedPreScrollRange == 0 || totalScrollRange + i > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                f = (i / i2) + 1.0f;
            }
        }
        int i3 = this.f;
        return ew3.E0((int) (f * i3), 0, i3);
    }

    public o71(int i) {
        super(0);
        this.c = new Rect();
        this.d = new Rect();
        this.e = 0;
    }
}
