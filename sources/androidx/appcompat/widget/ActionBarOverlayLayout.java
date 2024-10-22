package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.al3;
import defpackage.b5;
import defpackage.ew3;
import defpackage.ie2;
import defpackage.iz1;
import defpackage.ju1;
import defpackage.jz1;
import defpackage.kq3;
import defpackage.kz1;
import defpackage.ll3;
import defpackage.lq3;
import defpackage.mq3;
import defpackage.nq3;
import defpackage.o4;
import defpackage.p4;
import defpackage.q4;
import defpackage.r4;
import defpackage.rc1;
import defpackage.tm3;
import defpackage.uc;
import defpackage.uk3;
import defpackage.uq3;
import defpackage.w93;
import defpackage.wq3;
import defpackage.xp3;
import defpackage.ye0;
import defpackage.ye2;
import defpackage.yk3;
import defpackage.ze0;
import java.util.WeakHashMap;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements ye0, iz1, jz1 {
    public static final int[] B = {ie2.actionBarSize, R.attr.windowContentOverlay};
    public final kz1 A;

    /* renamed from: a, reason: collision with root package name */
    public int f150a;

    /* renamed from: b, reason: collision with root package name */
    public int f151b;
    public ContentFrameLayout c;
    public ActionBarContainer d;
    public ze0 e;
    public Drawable f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public final Rect n;
    public final Rect o;
    public final Rect p;
    public wq3 q;
    public wq3 r;
    public wq3 s;
    public wq3 t;
    public q4 u;
    public OverScroller v;
    public ViewPropertyAnimator w;
    public final o4 x;
    public final p4 y;
    public final p4 z;

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f151b = 0;
        this.n = new Rect();
        this.o = new Rect();
        this.p = new Rect();
        new Rect();
        new Rect();
        new Rect();
        new Rect();
        wq3 wq3Var = wq3.f5058b;
        this.q = wq3Var;
        this.r = wq3Var;
        this.s = wq3Var;
        this.t = wq3Var;
        this.x = new o4(this, 0);
        this.y = new p4(this, 0);
        this.z = new p4(this, 1);
        c(context);
        this.A = new kz1();
    }

    public static boolean a(FrameLayout frameLayout, Rect rect, boolean z) {
        boolean z2;
        r4 r4Var = (r4) frameLayout.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) r4Var).leftMargin;
        int i2 = rect.left;
        if (i != i2) {
            ((ViewGroup.MarginLayoutParams) r4Var).leftMargin = i2;
            z2 = true;
        } else {
            z2 = false;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) r4Var).topMargin;
        int i4 = rect.top;
        if (i3 != i4) {
            ((ViewGroup.MarginLayoutParams) r4Var).topMargin = i4;
            z2 = true;
        }
        int i5 = ((ViewGroup.MarginLayoutParams) r4Var).rightMargin;
        int i6 = rect.right;
        if (i5 != i6) {
            ((ViewGroup.MarginLayoutParams) r4Var).rightMargin = i6;
            z2 = true;
        }
        if (z) {
            int i7 = ((ViewGroup.MarginLayoutParams) r4Var).bottomMargin;
            int i8 = rect.bottom;
            if (i7 != i8) {
                ((ViewGroup.MarginLayoutParams) r4Var).bottomMargin = i8;
                return true;
            }
        }
        return z2;
    }

    public final void b() {
        removeCallbacks(this.y);
        removeCallbacks(this.z);
        ViewPropertyAnimator viewPropertyAnimator = this.w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void c(Context context) {
        boolean z;
        TypedArray obtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(B);
        boolean z2 = false;
        this.f150a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        this.f = drawable;
        if (drawable == null) {
            z = true;
        } else {
            z = false;
        }
        setWillNotDraw(z);
        obtainStyledAttributes.recycle();
        if (context.getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        }
        this.g = z2;
        this.v = new OverScroller(context);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof r4;
    }

    @Override // defpackage.jz1
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        f(view, i, i2, i3, i4, i5);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int i;
        super.draw(canvas);
        if (this.f != null && !this.g) {
            if (this.d.getVisibility() == 0) {
                i = (int) (this.d.getTranslationY() + this.d.getBottom() + 0.5f);
            } else {
                i = 0;
            }
            this.f.setBounds(0, i, getWidth(), this.f.getIntrinsicHeight() + i);
            this.f.draw(canvas);
        }
    }

    public final void e(int i) {
        h();
        if (i != 2) {
            if (i != 5) {
                if (i == 109) {
                    setOverlayMode(true);
                    return;
                }
                return;
            } else {
                ((w93) this.e).getClass();
                Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
                return;
            }
        }
        ((w93) this.e).getClass();
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // defpackage.iz1
    public final void f(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public final boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // defpackage.iz1
    public final boolean g(View view, View view2, int i, int i2) {
        if (i2 == 0 && onStartNestedScroll(view, view2, i)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new r4();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new r4(getContext(), attributeSet);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        kz1 kz1Var = this.A;
        return kz1Var.f3040b | kz1Var.f3039a;
    }

    public CharSequence getTitle() {
        h();
        return ((w93) this.e).f4966a.getTitle();
    }

    public final void h() {
        ze0 wrapper;
        if (this.c == null) {
            this.c = (ContentFrameLayout) findViewById(ye2.action_bar_activity_content);
            this.d = (ActionBarContainer) findViewById(ye2.action_bar_container);
            KeyEvent.Callback findViewById = findViewById(ye2.action_bar);
            if (findViewById instanceof ze0) {
                wrapper = (ze0) findViewById;
            } else if (findViewById instanceof Toolbar) {
                wrapper = ((Toolbar) findViewById).getWrapper();
            } else {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById.getClass().getSimpleName()));
            }
            this.e = wrapper;
        }
    }

    @Override // defpackage.iz1
    public final void i(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    public final void j(ju1 ju1Var, uc ucVar) {
        h();
        w93 w93Var = (w93) this.e;
        b5 b5Var = w93Var.m;
        Toolbar toolbar = w93Var.f4966a;
        if (b5Var == null) {
            w93Var.m = new b5(toolbar.getContext());
        }
        b5 b5Var2 = w93Var.m;
        b5Var2.e = ucVar;
        if (ju1Var != null || toolbar.f170a != null) {
            toolbar.e();
            ju1 ju1Var2 = toolbar.f170a.p;
            if (ju1Var2 != ju1Var) {
                if (ju1Var2 != null) {
                    ju1Var2.r(toolbar.L);
                    ju1Var2.r(toolbar.M);
                }
                if (toolbar.M == null) {
                    toolbar.M = new h(toolbar);
                }
                b5Var2.q = true;
                if (ju1Var != null) {
                    ju1Var.b(b5Var2, toolbar.j);
                    ju1Var.b(toolbar.M, toolbar.j);
                } else {
                    b5Var2.j(toolbar.j, null);
                    toolbar.M.j(toolbar.j, null);
                    b5Var2.h();
                    toolbar.M.h();
                }
                toolbar.f170a.setPopupTheme(toolbar.k);
                toolbar.f170a.setPresenter(b5Var2);
                toolbar.L = b5Var2;
                toolbar.s();
            }
        }
    }

    @Override // defpackage.iz1
    public final void l(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // defpackage.iz1
    public final void m(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        h();
        wq3 h = wq3.h(this, windowInsets);
        boolean a2 = a(this.d, new Rect(h.c(), h.e(), h.d(), h.b()), false);
        WeakHashMap weakHashMap = ll3.f3151a;
        Rect rect = this.n;
        al3.b(this, h, rect);
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        uq3 uq3Var = h.f5059a;
        wq3 l = uq3Var.l(i, i2, i3, i4);
        this.q = l;
        boolean z = true;
        if (!this.r.equals(l)) {
            this.r = this.q;
            a2 = true;
        }
        Rect rect2 = this.o;
        if (!rect2.equals(rect)) {
            rect2.set(rect);
        } else {
            z = a2;
        }
        if (z) {
            requestLayout();
        }
        return uq3Var.a().f5059a.c().f5059a.b().g();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c(getContext());
        WeakHashMap weakHashMap = ll3.f3151a;
        yk3.c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                r4 r4Var = (r4) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) r4Var).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) r4Var).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        boolean z;
        int measuredHeight;
        nq3 kq3Var;
        h();
        measureChildWithMargins(this.d, i, 0, i2, 0);
        r4 r4Var = (r4) this.d.getLayoutParams();
        int max = Math.max(0, this.d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r4Var).leftMargin + ((ViewGroup.MarginLayoutParams) r4Var).rightMargin);
        int max2 = Math.max(0, this.d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4Var).topMargin + ((ViewGroup.MarginLayoutParams) r4Var).bottomMargin);
        int combineMeasuredStates = View.combineMeasuredStates(0, this.d.getMeasuredState());
        WeakHashMap weakHashMap = ll3.f3151a;
        if ((uk3.g(this) & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            measuredHeight = this.f150a;
            if (this.i && this.d.getTabContainer() != null) {
                measuredHeight += this.f150a;
            }
        } else {
            measuredHeight = this.d.getVisibility() != 8 ? this.d.getMeasuredHeight() : 0;
        }
        Rect rect = this.n;
        Rect rect2 = this.p;
        rect2.set(rect);
        wq3 wq3Var = this.q;
        this.s = wq3Var;
        if (!this.h && !z) {
            rect2.top += measuredHeight;
            rect2.bottom += 0;
            this.s = wq3Var.f5059a.l(0, measuredHeight, 0, 0);
        } else {
            rc1 b2 = rc1.b(wq3Var.c(), this.s.e() + measuredHeight, this.s.d(), this.s.b() + 0);
            wq3 wq3Var2 = this.s;
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 30) {
                kq3Var = new mq3(wq3Var2);
            } else if (i3 >= 29) {
                kq3Var = new lq3(wq3Var2);
            } else {
                kq3Var = new kq3(wq3Var2);
            }
            kq3Var.g(b2);
            this.s = kq3Var.b();
        }
        a(this.c, rect2, true);
        if (!this.t.equals(this.s)) {
            wq3 wq3Var3 = this.s;
            this.t = wq3Var3;
            ContentFrameLayout contentFrameLayout = this.c;
            WindowInsets g = wq3Var3.g();
            if (g != null) {
                WindowInsets a2 = yk3.a(contentFrameLayout, g);
                if (!a2.equals(g)) {
                    wq3.h(contentFrameLayout, a2);
                }
            }
        }
        measureChildWithMargins(this.c, i, 0, i2, 0);
        r4 r4Var2 = (r4) this.c.getLayoutParams();
        int max3 = Math.max(max, this.c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) r4Var2).leftMargin + ((ViewGroup.MarginLayoutParams) r4Var2).rightMargin);
        int max4 = Math.max(max2, this.c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) r4Var2).topMargin + ((ViewGroup.MarginLayoutParams) r4Var2).bottomMargin);
        int combineMeasuredStates2 = View.combineMeasuredStates(combineMeasuredStates, this.c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + max3, getSuggestedMinimumWidth()), i, combineMeasuredStates2), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max4, getSuggestedMinimumHeight()), i2, combineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        boolean z2 = false;
        if (!this.j || !z) {
            return false;
        }
        this.v.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        if (this.v.getFinalY() > this.d.getHeight()) {
            z2 = true;
        }
        if (z2) {
            b();
            this.z.run();
        } else {
            b();
            this.y.run();
        }
        this.k = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.l + i2;
        this.l = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        xp3 xp3Var;
        tm3 tm3Var;
        this.A.f3039a = i;
        this.l = getActionBarHideOffset();
        b();
        q4 q4Var = this.u;
        if (q4Var != null && (tm3Var = (xp3Var = (xp3) q4Var).s) != null) {
            tm3Var.a();
            xp3Var.s = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) != 0 && this.d.getVisibility() == 0) {
            return this.j;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        if (this.j && !this.k) {
            if (this.l <= this.d.getHeight()) {
                b();
                postDelayed(this.y, 600L);
            } else {
                b();
                postDelayed(this.z, 600L);
            }
        }
    }

    @Override // android.view.View
    public final void onWindowSystemUiVisibilityChanged(int i) {
        boolean z;
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i);
        h();
        int i2 = this.m ^ i;
        this.m = i;
        if ((i & 4) == 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        q4 q4Var = this.u;
        if (q4Var != null) {
            ((xp3) q4Var).o = !z2;
            if (!z && z2) {
                xp3 xp3Var = (xp3) q4Var;
                if (!xp3Var.p) {
                    xp3Var.p = true;
                    xp3Var.w(true);
                }
            } else {
                xp3 xp3Var2 = (xp3) q4Var;
                if (xp3Var2.p) {
                    xp3Var2.p = false;
                    xp3Var2.w(true);
                }
            }
        }
        if ((i2 & UserVerificationMethods.USER_VERIFY_HANDPRINT) != 0 && this.u != null) {
            WeakHashMap weakHashMap = ll3.f3151a;
            yk3.c(this);
        }
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.f151b = i;
        q4 q4Var = this.u;
        if (q4Var != null) {
            ((xp3) q4Var).n = i;
        }
    }

    public void setActionBarHideOffset(int i) {
        b();
        this.d.setTranslationY(-Math.max(0, Math.min(i, this.d.getHeight())));
    }

    public void setActionBarVisibilityCallback(q4 q4Var) {
        this.u = q4Var;
        if (getWindowToken() != null) {
            ((xp3) this.u).n = this.f151b;
            int i = this.m;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                WeakHashMap weakHashMap = ll3.f3151a;
                yk3.c(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.i = z;
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.j) {
            this.j = z;
            if (!z) {
                b();
                setActionBarHideOffset(0);
            }
        }
    }

    public void setIcon(int i) {
        h();
        w93 w93Var = (w93) this.e;
        w93Var.d = i != 0 ? ew3.P0(w93Var.a(), i) : null;
        w93Var.c();
    }

    public void setLogo(int i) {
        Drawable drawable;
        h();
        w93 w93Var = (w93) this.e;
        if (i != 0) {
            drawable = ew3.P0(w93Var.a(), i);
        } else {
            drawable = null;
        }
        w93Var.e = drawable;
        w93Var.c();
    }

    public void setOverlayMode(boolean z) {
        boolean z2;
        this.h = z;
        if (z && getContext().getApplicationInfo().targetSdkVersion < 19) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.g = z2;
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // defpackage.ye0
    public void setWindowCallback(Window.Callback callback) {
        h();
        ((w93) this.e).k = callback;
    }

    @Override // defpackage.ye0
    public void setWindowTitle(CharSequence charSequence) {
        h();
        w93 w93Var = (w93) this.e;
        if (!w93Var.g) {
            w93Var.h = charSequence;
            if ((w93Var.f4967b & 8) != 0) {
                Toolbar toolbar = w93Var.f4966a;
                toolbar.setTitle(charSequence);
                if (w93Var.g) {
                    ll3.q(toolbar.getRootView(), charSequence);
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new r4(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        h();
        w93 w93Var = (w93) this.e;
        w93Var.d = drawable;
        w93Var.c();
    }
}
