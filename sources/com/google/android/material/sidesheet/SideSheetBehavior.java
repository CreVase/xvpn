package com.google.android.material.sidesheet;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import defpackage.a3;
import defpackage.al3;
import defpackage.bg2;
import defpackage.fr1;
import defpackage.fs2;
import defpackage.h90;
import defpackage.he2;
import defpackage.hx2;
import defpackage.it2;
import defpackage.jk;
import defpackage.k90;
import defpackage.lj1;
import defpackage.ll3;
import defpackage.m20;
import defpackage.mf2;
import defpackage.p71;
import defpackage.qf2;
import defpackage.re2;
import defpackage.s;
import defpackage.uk3;
import defpackage.ut0;
import defpackage.vl3;
import defpackage.x42;
import defpackage.xk3;
import defpackage.yq;
import defpackage.zf3;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class SideSheetBehavior<V extends View> extends h90 {
    public static final int w = mf2.side_sheet_accessibility_pane_title;
    public static final int x = qf2.Widget_Material3_SideSheet;

    /* renamed from: a, reason: collision with root package name */
    public lj1 f1556a;

    /* renamed from: b, reason: collision with root package name */
    public fr1 f1557b;
    public final ColorStateList c;
    public final fs2 d;
    public final yq e;
    public final float f;
    public boolean g;
    public int h;
    public vl3 i;
    public boolean j;
    public final float k;
    public int l;
    public int m;
    public int n;
    public int o;
    public WeakReference p;
    public WeakReference q;
    public int r;
    public VelocityTracker s;
    public int t;
    public final LinkedHashSet u;
    public final it2 v;

    public SideSheetBehavior() {
        this.e = new yq(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new it2(this);
    }

    @Override // defpackage.h90
    public final void c(k90 k90Var) {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.h90
    public final void f() {
        this.p = null;
        this.i = null;
    }

    @Override // defpackage.h90
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        vl3 vl3Var;
        VelocityTracker velocityTracker;
        if ((view.isShown() || ll3.d(view) != null) && this.g) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            this.j = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.j) {
                this.j = false;
                return false;
            }
        } else {
            this.t = (int) motionEvent.getX();
        }
        if (!this.j && (vl3Var = this.i) != null && vl3Var.r(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h90
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        boolean z;
        boolean z2;
        int i3;
        int i4;
        View findViewById;
        int i5;
        WeakHashMap weakHashMap = ll3.f3151a;
        int i6 = 1;
        if (uk3.b(coordinatorLayout) && !uk3.b(view)) {
            view.setFitsSystemWindows(true);
        }
        int i7 = 0;
        if (this.p == null) {
            this.p = new WeakReference(view);
            Context context = view.getContext();
            zf3.d0(context, he2.motionEasingStandardDecelerateInterpolator, x42.b(0.0f, 0.0f, 0.0f, 1.0f));
            zf3.c0(context, he2.motionDurationMedium2, 300);
            zf3.c0(context, he2.motionDurationShort3, 150);
            zf3.c0(context, he2.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(re2.m3_back_progress_side_container_max_scale_x_distance_shrink);
            resources.getDimension(re2.m3_back_progress_side_container_max_scale_x_distance_grow);
            resources.getDimension(re2.m3_back_progress_side_container_max_scale_y_distance);
            fr1 fr1Var = this.f1557b;
            if (fr1Var != null) {
                uk3.q(view, fr1Var);
                fr1 fr1Var2 = this.f1557b;
                float f = this.f;
                if (f == -1.0f) {
                    f = al3.i(view);
                }
                fr1Var2.i(f);
            } else {
                ColorStateList colorStateList = this.c;
                if (colorStateList != null) {
                    ll3.r(view, colorStateList);
                }
            }
            if (this.h == 5) {
                i5 = 4;
            } else {
                i5 = 0;
            }
            if (view.getVisibility() != i5) {
                view.setVisibility(i5);
            }
            w();
            if (uk3.c(view) == 0) {
                uk3.s(view, 1);
            }
            if (ll3.d(view) == null) {
                ll3.q(view, view.getResources().getString(w));
            }
        }
        if (Gravity.getAbsoluteGravity(((k90) view.getLayoutParams()).c, i) == 3) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        lj1 lj1Var = this.f1556a;
        if (lj1Var == null || lj1Var.e0() != i2) {
            fs2 fs2Var = this.d;
            if (i2 == 0) {
                this.f1556a = new lj1(this, i6);
                if (fs2Var != null) {
                    k90 t = t();
                    if (t != null && ((ViewGroup.MarginLayoutParams) t).rightMargin > 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        jk jkVar = new jk(fs2Var);
                        jkVar.f = new s(0.0f);
                        jkVar.g = new s(0.0f);
                        fs2 fs2Var2 = new fs2(jkVar);
                        fr1 fr1Var3 = this.f1557b;
                        if (fr1Var3 != null) {
                            fr1Var3.setShapeAppearanceModel(fs2Var2);
                        }
                    }
                }
            } else if (i2 == 1) {
                this.f1556a = new lj1(this, i7);
                if (fs2Var != null) {
                    k90 t2 = t();
                    if (t2 != null && ((ViewGroup.MarginLayoutParams) t2).leftMargin > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        jk jkVar2 = new jk(fs2Var);
                        jkVar2.e = new s(0.0f);
                        jkVar2.h = new s(0.0f);
                        fs2 fs2Var3 = new fs2(jkVar2);
                        fr1 fr1Var4 = this.f1557b;
                        if (fr1Var4 != null) {
                            fr1Var4.setShapeAppearanceModel(fs2Var3);
                        }
                    }
                }
            } else {
                throw new IllegalArgumentException(p71.k("Invalid sheet edge position value: ", i2, ". Must be 0 or 1."));
            }
        }
        if (this.i == null) {
            this.i = new vl3(coordinatorLayout.getContext(), coordinatorLayout, this.v);
        }
        int c0 = this.f1556a.c0(view);
        coordinatorLayout.q(view, i);
        this.m = coordinatorLayout.getWidth();
        this.n = this.f1556a.d0(coordinatorLayout);
        this.l = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            i3 = this.f1556a.Y(marginLayoutParams);
        } else {
            i3 = 0;
        }
        this.o = i3;
        int i8 = this.h;
        if (i8 != 1 && i8 != 2) {
            if (i8 != 3) {
                if (i8 == 5) {
                    i7 = this.f1556a.b0();
                } else {
                    throw new IllegalStateException("Unexpected value: " + this.h);
                }
            }
        } else {
            i7 = c0 - this.f1556a.c0(view);
        }
        ll3.j(view, i7);
        if (this.q == null && (i4 = this.r) != -1 && (findViewById = coordinatorLayout.findViewById(i4)) != null) {
            this.q = new WeakReference(findViewById);
        }
        Iterator it = this.u.iterator();
        while (it.hasNext()) {
            p71.C(it.next());
        }
        return true;
    }

    @Override // defpackage.h90
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.h90
    public final void o(View view, Parcelable parcelable) {
        int i = ((SavedState) parcelable).c;
        if (i == 1 || i == 2) {
            i = 5;
        }
        this.h = i;
    }

    @Override // defpackage.h90
    public final Parcelable p(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.h90
    public final boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        VelocityTracker velocityTracker;
        boolean z4 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.h;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        vl3 vl3Var = this.i;
        if (vl3Var != null && (this.g || i == 1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            vl3Var.k(motionEvent);
        }
        if (actionMasked == 0 && (velocityTracker = this.s) != null) {
            velocityTracker.recycle();
            this.s = null;
        }
        if (this.s == null) {
            this.s = VelocityTracker.obtain();
        }
        this.s.addMovement(motionEvent);
        vl3 vl3Var2 = this.i;
        if (vl3Var2 != null && (this.g || this.h == 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && actionMasked == 2 && !this.j) {
            if (vl3Var2 != null && (this.g || this.h == 1)) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3 && Math.abs(this.t - motionEvent.getX()) > this.i.f4861b) {
                z4 = true;
            }
            if (z4) {
                this.i.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.j;
    }

    public final k90 t() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference != null && (view = (View) weakReference.get()) != null && (view.getLayoutParams() instanceof k90)) {
            return (k90) view.getLayoutParams();
        }
        return null;
    }

    public final void u(int i) {
        View view;
        int i2;
        if (this.h == i) {
            return;
        }
        this.h = i;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        if (this.h == 5) {
            i2 = 4;
        } else {
            i2 = 0;
        }
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
        Iterator it = this.u.iterator();
        if (!it.hasNext()) {
            w();
        } else {
            p71.C(it.next());
            throw null;
        }
    }

    public final void v(View view, boolean z, int i) {
        int a0;
        boolean z2;
        if (i != 3) {
            if (i == 5) {
                a0 = this.f1556a.b0();
            } else {
                throw new IllegalArgumentException(hx2.m("Invalid state to get outer edge offset: ", i));
            }
        } else {
            a0 = this.f1556a.a0();
        }
        vl3 vl3Var = this.i;
        if (vl3Var != null && (!z ? vl3Var.s(view, a0, view.getTop()) : vl3Var.q(a0, view.getTop()))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            u(2);
            this.e.a(i);
        } else {
            u(i);
        }
    }

    public final void w() {
        View view;
        WeakReference weakReference = this.p;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ll3.m(view, 262144);
        ll3.i(view, 0);
        ll3.m(view, 1048576);
        ll3.i(view, 0);
        int i = 5;
        if (this.h != 5) {
            ll3.n(view, a3.l, new ut0(this, i));
        }
        int i2 = 3;
        if (this.h != 3) {
            ll3.n(view, a3.j, new ut0(this, i2));
        }
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f200a, i);
            parcel.writeInt(this.c);
        }

        public SavedState(android.view.AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
            super(absSavedState);
            this.c = sideSheetBehavior.h;
        }
    }

    public SideSheetBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        this.e = new yq(this);
        this.g = true;
        this.h = 5;
        this.k = 0.1f;
        this.r = -1;
        this.u = new LinkedHashSet();
        this.v = new it2(this);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bg2.SideSheetBehavior_Layout);
        int i = bg2.SideSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i)) {
            this.c = m20.j0(context, obtainStyledAttributes, i);
        }
        if (obtainStyledAttributes.hasValue(bg2.SideSheetBehavior_Layout_shapeAppearance)) {
            this.d = new fs2(fs2.b(context, attributeSet, 0, x));
        }
        int i2 = bg2.SideSheetBehavior_Layout_coplanarSiblingViewId;
        if (obtainStyledAttributes.hasValue(i2)) {
            int resourceId = obtainStyledAttributes.getResourceId(i2, -1);
            this.r = resourceId;
            WeakReference weakReference = this.q;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.q = null;
            WeakReference weakReference2 = this.p;
            if (weakReference2 != null) {
                View view = (View) weakReference2.get();
                if (resourceId != -1) {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    if (xk3.c(view)) {
                        view.requestLayout();
                    }
                }
            }
        }
        fs2 fs2Var = this.d;
        if (fs2Var != null) {
            fr1 fr1Var = new fr1(fs2Var);
            this.f1557b = fr1Var;
            fr1Var.h(context);
            ColorStateList colorStateList = this.c;
            if (colorStateList != null) {
                this.f1557b.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.f1557b.setTint(typedValue.data);
            }
        }
        this.f = obtainStyledAttributes.getDimension(bg2.SideSheetBehavior_Layout_android_elevation, -1.0f);
        this.g = obtainStyledAttributes.getBoolean(bg2.SideSheetBehavior_Layout_behavior_draggable, true);
        obtainStyledAttributes.recycle();
        ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
