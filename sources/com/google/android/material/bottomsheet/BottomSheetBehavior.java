package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.PathInterpolator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import defpackage.a3;
import defpackage.af2;
import defpackage.al3;
import defpackage.bg2;
import defpackage.cq3;
import defpackage.dq3;
import defpackage.er1;
import defpackage.fq3;
import defpackage.fr1;
import defpackage.fs2;
import defpackage.h90;
import defpackage.he2;
import defpackage.hx2;
import defpackage.j2;
import defpackage.k90;
import defpackage.kh2;
import defpackage.l2;
import defpackage.ll3;
import defpackage.m20;
import defpackage.mf2;
import defpackage.p71;
import defpackage.pl3;
import defpackage.q9;
import defpackage.qf2;
import defpackage.re2;
import defpackage.sc1;
import defpackage.u93;
import defpackage.uk3;
import defpackage.uy0;
import defpackage.vk3;
import defpackage.vl3;
import defpackage.wq;
import defpackage.x42;
import defpackage.xk3;
import defpackage.xq;
import defpackage.yk3;
import defpackage.yq;
import defpackage.zf3;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class BottomSheetBehavior<V extends View> extends h90 {
    public static final int e0 = qf2.Widget_Design_BottomSheet_Modal;
    public final yq A;
    public ValueAnimator B;
    public int C;
    public int D;
    public int E;
    public float F;
    public int G;
    public final float H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public vl3 M;
    public boolean N;
    public int O;
    public boolean P;
    public final float Q;
    public int R;
    public int S;
    public int T;
    public WeakReference U;
    public WeakReference V;
    public final ArrayList W;
    public VelocityTracker X;
    public int Y;
    public int Z;

    /* renamed from: a, reason: collision with root package name */
    public int f1528a;
    public boolean a0;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1529b;
    public HashMap b0;
    public final float c;
    public final SparseIntArray c0;
    public int d;
    public final xq d0;
    public int e;
    public boolean f;
    public int g;
    public final int h;
    public fr1 i;
    public final ColorStateList j;
    public int k;
    public int l;
    public int m;
    public boolean n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public int v;
    public int w;
    public final boolean x;
    public final fs2 y;
    public boolean z;

    public BottomSheetBehavior() {
        this.f1528a = 0;
        this.f1529b = true;
        this.k = -1;
        this.l = -1;
        this.A = new yq(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.Z = -1;
        this.c0 = new SparseIntArray();
        this.d0 = new xq(this);
    }

    public static View x(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        WeakHashMap weakHashMap = ll3.f3151a;
        if (al3.p(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View x = x(viewGroup.getChildAt(i));
                if (x != null) {
                    return x;
                }
            }
        }
        return null;
    }

    public final int A(int i) {
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        return this.E;
                    }
                    throw new IllegalArgumentException(hx2.m("Invalid state to get top offset: ", i));
                }
                return this.T;
            }
            return this.G;
        }
        return z();
    }

    public final boolean B() {
        WeakReference weakReference = this.U;
        if (weakReference == null || weakReference.get() == null) {
            return false;
        }
        int[] iArr = new int[2];
        ((View) this.U.get()).getLocationOnScreen(iArr);
        if (iArr[1] != 0) {
            return false;
        }
        return true;
    }

    public final void C(int i) {
        boolean z = false;
        if (i == -1) {
            if (!this.f) {
                this.f = true;
                z = true;
            }
        } else if (this.f || this.e != i) {
            this.f = false;
            this.e = Math.max(0, i);
            z = true;
        }
        if (z) {
            K();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:            if (defpackage.xk3.b(r9) != false) goto L33;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void D(int r9) {
        /*
            r8 = this;
            r0 = 1
            if (r9 == r0) goto L64
            r1 = 2
            if (r9 != r1) goto L7
            goto L64
        L7:
            boolean r1 = r8.I
            if (r1 != 0) goto Lf
            r1 = 5
            if (r9 != r1) goto Lf
            return
        Lf:
            r1 = 6
            if (r9 != r1) goto L21
            boolean r1 = r8.f1529b
            if (r1 == 0) goto L21
            int r1 = r8.A(r9)
            int r2 = r8.D
            if (r1 > r2) goto L21
            r1 = 3
            r5 = 3
            goto L22
        L21:
            r5 = r9
        L22:
            java.lang.ref.WeakReference r1 = r8.U
            if (r1 == 0) goto L60
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L2d
            goto L60
        L2d:
            java.lang.ref.WeakReference r9 = r8.U
            java.lang.Object r9 = r9.get()
            android.view.View r9 = (android.view.View) r9
            l30 r1 = new l30
            r6 = 8
            r7 = 0
            r2 = r1
            r3 = r8
            r4 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            android.view.ViewParent r2 = r9.getParent()
            if (r2 == 0) goto L55
            boolean r2 = r2.isLayoutRequested()
            if (r2 == 0) goto L55
            java.util.WeakHashMap r2 = defpackage.ll3.f3151a
            boolean r2 = defpackage.xk3.b(r9)
            if (r2 == 0) goto L55
            goto L56
        L55:
            r0 = 0
        L56:
            if (r0 == 0) goto L5c
            r9.post(r1)
            goto L63
        L5c:
            r1.run()
            goto L63
        L60:
            r8.E(r9)
        L63:
            return
        L64:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "STATE_"
            r2.<init>(r3)
            if (r9 != r0) goto L72
            java.lang.String r9 = "DRAGGING"
            goto L74
        L72:
            java.lang.String r9 = "SETTLING"
        L74:
            java.lang.String r0 = " should not be set externally."
            java.lang.String r9 = defpackage.hx2.s(r2, r9, r0)
            r1.<init>(r9)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.D(int):void");
    }

    public final void E(int i) {
        if (this.L == i) {
            return;
        }
        this.L = i;
        WeakReference weakReference = this.U;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i == 3) {
            J(true);
        } else if (i == 6 || i == 5 || i == 4) {
            J(false);
        }
        I(i, true);
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            H();
        } else {
            p71.C(arrayList.get(0));
            throw null;
        }
    }

    public final boolean F(View view, float f) {
        if (this.J) {
            return true;
        }
        if (view.getTop() < this.G) {
            return false;
        }
        if (Math.abs(((f * this.Q) + view.getTop()) - this.G) / v() > 0.5f) {
            return true;
        }
        return false;
    }

    public final void G(View view, boolean z, int i) {
        boolean z2;
        int A = A(i);
        vl3 vl3Var = this.M;
        if (vl3Var != null && (!z ? vl3Var.s(view, view.getLeft(), A) : vl3Var.q(view.getLeft(), A))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            E(2);
            I(i, true);
            this.A.a(i);
            return;
        }
        E(i);
    }

    public final void H() {
        View view;
        int i;
        boolean z;
        l2 l2Var;
        WeakReference weakReference = this.U;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            ll3.m(view, 524288);
            ll3.i(view, 0);
            ll3.m(view, 262144);
            ll3.i(view, 0);
            ll3.m(view, 1048576);
            ll3.i(view, 0);
            SparseIntArray sparseIntArray = this.c0;
            int i2 = sparseIntArray.get(0, -1);
            if (i2 != -1) {
                ll3.m(view, i2);
                ll3.i(view, 0);
                sparseIntArray.delete(0);
            }
            int i3 = 6;
            if (!this.f1529b && this.L != 6) {
                String string = view.getResources().getString(mf2.bottomsheet_action_expand_halfway);
                q9 q9Var = new q9(this, 6);
                ArrayList e = ll3.e(view);
                int i4 = 0;
                while (true) {
                    if (i4 < e.size()) {
                        if (TextUtils.equals(string, ((AccessibilityNodeInfo.AccessibilityAction) ((a3) e.get(i4)).f18a).getLabel())) {
                            i = ((a3) e.get(i4)).a();
                            break;
                        }
                        i4++;
                    } else {
                        int i5 = -1;
                        int i6 = 0;
                        while (true) {
                            int[] iArr = ll3.e;
                            if (i6 >= iArr.length || i5 != -1) {
                                break;
                            }
                            int i7 = iArr[i6];
                            boolean z2 = true;
                            for (int i8 = 0; i8 < e.size(); i8++) {
                                if (((a3) e.get(i8)).a() != i7) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                z2 &= z;
                            }
                            if (z2) {
                                i5 = i7;
                            }
                            i6++;
                        }
                        i = i5;
                    }
                }
                if (i != -1) {
                    a3 a3Var = new a3(null, i, string, q9Var, null);
                    View.AccessibilityDelegate c = ll3.c(view);
                    if (c == null) {
                        l2Var = null;
                    } else if (c instanceof j2) {
                        l2Var = ((j2) c).f2689a;
                    } else {
                        l2Var = new l2(c);
                    }
                    if (l2Var == null) {
                        l2Var = new l2();
                    }
                    ll3.p(view, l2Var);
                    ll3.m(view, a3Var.a());
                    ll3.e(view).add(a3Var);
                    ll3.i(view, 0);
                }
                sparseIntArray.put(0, i);
            }
            if (this.I && this.L != 5) {
                ll3.n(view, a3.l, new q9(this, 5));
            }
            int i9 = this.L;
            if (i9 != 3) {
                if (i9 != 4) {
                    if (i9 == 6) {
                        ll3.n(view, a3.k, new q9(this, 4));
                        ll3.n(view, a3.j, new q9(this, 3));
                        return;
                    }
                    return;
                }
                if (this.f1529b) {
                    i3 = 3;
                }
                ll3.n(view, a3.j, new q9(this, i3));
                return;
            }
            if (this.f1529b) {
                i3 = 4;
            }
            ll3.n(view, a3.k, new q9(this, i3));
        }
    }

    public final void I(int i, boolean z) {
        boolean z2;
        ValueAnimator valueAnimator;
        if (i == 2) {
            return;
        }
        if (this.L == 3 && (this.x || B())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.z != z2 && this.i != null) {
            this.z = z2;
            float f = 1.0f;
            if (z && (valueAnimator = this.B) != null) {
                if (valueAnimator.isRunning()) {
                    this.B.reverse();
                    return;
                }
                float f2 = this.i.f2139a.j;
                if (z2) {
                    f = u();
                }
                this.B.setFloatValues(f2, f);
                this.B.start();
                return;
            }
            ValueAnimator valueAnimator2 = this.B;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.B.cancel();
            }
            fr1 fr1Var = this.i;
            if (this.z) {
                f = u();
            }
            er1 er1Var = fr1Var.f2139a;
            if (er1Var.j != f) {
                er1Var.j = f;
                fr1Var.e = true;
                fr1Var.invalidateSelf();
            }
        }
    }

    public final void J(boolean z) {
        WeakReference weakReference = this.U;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (!(parent instanceof CoordinatorLayout)) {
            return;
        }
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
        int childCount = coordinatorLayout.getChildCount();
        if (z) {
            if (this.b0 == null) {
                this.b0 = new HashMap(childCount);
            } else {
                return;
            }
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = coordinatorLayout.getChildAt(i);
            if (childAt != this.U.get() && z) {
                this.b0.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
            }
        }
        if (!z) {
            this.b0 = null;
        }
    }

    public final void K() {
        View view;
        if (this.U != null) {
            t();
            if (this.L == 4 && (view = (View) this.U.get()) != null) {
                view.requestLayout();
            }
        }
    }

    @Override // defpackage.h90
    public final void c(k90 k90Var) {
        this.U = null;
        this.M = null;
    }

    @Override // defpackage.h90
    public final void f() {
        this.U = null;
        this.M = null;
    }

    @Override // defpackage.h90
    public final boolean g(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        View view2;
        int i;
        vl3 vl3Var;
        if (view.isShown() && this.K) {
            int actionMasked = motionEvent.getActionMasked();
            View view3 = null;
            if (actionMasked == 0) {
                this.Y = -1;
                this.Z = -1;
                VelocityTracker velocityTracker = this.X;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.X = null;
                }
            }
            if (this.X == null) {
                this.X = VelocityTracker.obtain();
            }
            this.X.addMovement(motionEvent);
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.a0 = false;
                    this.Y = -1;
                    if (this.N) {
                        this.N = false;
                        return false;
                    }
                }
            } else {
                int x = (int) motionEvent.getX();
                this.Z = (int) motionEvent.getY();
                if (this.L != 2) {
                    WeakReference weakReference = this.V;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.o(view2, x, this.Z)) {
                        this.Y = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.a0 = true;
                    }
                }
                if (this.Y == -1 && !coordinatorLayout.o(view, x, this.Z)) {
                    z = true;
                } else {
                    z = false;
                }
                this.N = z;
            }
            if (!this.N && (vl3Var = this.M) != null && vl3Var.r(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.V;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.N || this.L == 1 || coordinatorLayout.o(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.M == null || (i = this.Z) == -1 || Math.abs(i - motionEvent.getY()) <= this.M.f4861b) {
                return false;
            }
            return true;
        }
        this.N = true;
        return false;
    }

    @Override // defpackage.h90
    public final boolean h(CoordinatorLayout coordinatorLayout, View view, int i) {
        boolean z;
        WeakHashMap weakHashMap = ll3.f3151a;
        int i2 = 1;
        if (uk3.b(coordinatorLayout) && !uk3.b(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.U == null) {
            this.g = coordinatorLayout.getResources().getDimensionPixelSize(re2.design_bottom_sheet_peek_height_min);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29 && !this.n && !this.f) {
                z = true;
            } else {
                z = false;
            }
            if (this.o || this.p || this.q || this.s || this.t || this.u || z) {
                al3.u(view, new uy0(12, new u93(this, z), new kh2(vk3.f(view), view.getPaddingTop(), vk3.e(view), view.getPaddingBottom())));
                if (xk3.b(view)) {
                    yk3.c(view);
                } else {
                    view.addOnAttachStateChangeListener(new pl3(i2));
                }
            }
            sc1 sc1Var = new sc1(view);
            if (i3 >= 30) {
                view.setWindowInsetsAnimationCallback(new fq3(sc1Var));
            } else {
                PathInterpolator pathInterpolator = dq3.e;
                Object tag = view.getTag(af2.tag_on_apply_window_listener);
                View.OnApplyWindowInsetsListener cq3Var = new cq3(view, sc1Var);
                view.setTag(af2.tag_window_insets_animation_callback, cq3Var);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(cq3Var);
                }
            }
            this.U = new WeakReference(view);
            Context context = view.getContext();
            zf3.d0(context, he2.motionEasingStandardDecelerateInterpolator, x42.b(0.0f, 0.0f, 0.0f, 1.0f));
            zf3.c0(context, he2.motionDurationMedium2, 300);
            zf3.c0(context, he2.motionDurationShort3, 150);
            zf3.c0(context, he2.motionDurationShort2, 100);
            Resources resources = view.getResources();
            resources.getDimension(re2.m3_back_progress_bottom_container_max_scale_x_distance);
            resources.getDimension(re2.m3_back_progress_bottom_container_max_scale_y_distance);
            fr1 fr1Var = this.i;
            if (fr1Var != null) {
                uk3.q(view, fr1Var);
                fr1 fr1Var2 = this.i;
                float f = this.H;
                if (f == -1.0f) {
                    f = al3.i(view);
                }
                fr1Var2.i(f);
            } else {
                ColorStateList colorStateList = this.j;
                if (colorStateList != null) {
                    ll3.r(view, colorStateList);
                }
            }
            H();
            if (uk3.c(view) == 0) {
                uk3.s(view, 1);
            }
        }
        if (this.M == null) {
            this.M = new vl3(coordinatorLayout.getContext(), coordinatorLayout, this.d0);
        }
        int top = view.getTop();
        coordinatorLayout.q(view, i);
        this.S = coordinatorLayout.getWidth();
        this.T = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.R = height;
        int i4 = this.T;
        int i5 = i4 - height;
        int i6 = this.w;
        if (i5 < i6) {
            if (this.r) {
                int i7 = this.l;
                if (i7 != -1) {
                    i4 = Math.min(i4, i7);
                }
                this.R = i4;
            } else {
                int i8 = i4 - i6;
                int i9 = this.l;
                if (i9 != -1) {
                    i8 = Math.min(i8, i9);
                }
                this.R = i8;
            }
        }
        this.D = Math.max(0, this.T - this.R);
        this.E = (int) ((1.0f - this.F) * this.T);
        t();
        int i10 = this.L;
        if (i10 == 3) {
            ll3.k(view, z());
        } else if (i10 == 6) {
            ll3.k(view, this.E);
        } else if (this.I && i10 == 5) {
            ll3.k(view, this.T);
        } else if (i10 == 4) {
            ll3.k(view, this.G);
        } else if (i10 == 1 || i10 == 2) {
            ll3.k(view, top - view.getTop());
        }
        I(this.L, false);
        this.V = new WeakReference(x(view));
        ArrayList arrayList = this.W;
        if (arrayList.size() <= 0) {
            return true;
        }
        p71.C(arrayList.get(0));
        throw null;
    }

    @Override // defpackage.h90
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(y(i, coordinatorLayout.getPaddingRight() + coordinatorLayout.getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i2, this.k, marginLayoutParams.width), y(i3, coordinatorLayout.getPaddingBottom() + coordinatorLayout.getPaddingTop() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + 0, this.l, marginLayoutParams.height));
        return true;
    }

    @Override // defpackage.h90
    public final boolean j(View view) {
        WeakReference weakReference = this.V;
        if (weakReference != null && view == weakReference.get() && this.L != 3) {
            return true;
        }
        return false;
    }

    @Override // defpackage.h90
    public final void k(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        View view3;
        if (i3 == 1) {
            return;
        }
        WeakReference weakReference = this.V;
        if (weakReference != null) {
            view3 = (View) weakReference.get();
        } else {
            view3 = null;
        }
        if (view2 != view3) {
            return;
        }
        int top = view.getTop();
        int i4 = top - i2;
        if (i2 > 0) {
            if (i4 < z()) {
                int z = top - z();
                iArr[1] = z;
                ll3.k(view, -z);
                E(3);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                ll3.k(view, -i2);
                E(1);
            }
        } else if (i2 < 0 && !view2.canScrollVertically(-1)) {
            int i5 = this.G;
            if (i4 > i5 && !this.I) {
                int i6 = top - i5;
                iArr[1] = i6;
                ll3.k(view, -i6);
                E(4);
            } else {
                if (!this.K) {
                    return;
                }
                iArr[1] = i2;
                ll3.k(view, -i2);
                E(1);
            }
        }
        w(view.getTop());
        this.O = i2;
        this.P = true;
    }

    @Override // defpackage.h90
    public final void l(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
    }

    @Override // defpackage.h90
    public final void o(View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        int i = this.f1528a;
        if (i != 0) {
            if (i == -1 || (i & 1) == 1) {
                this.e = savedState.d;
            }
            if (i == -1 || (i & 2) == 2) {
                this.f1529b = savedState.e;
            }
            if (i == -1 || (i & 4) == 4) {
                this.I = savedState.f;
            }
            if (i == -1 || (i & 8) == 8) {
                this.J = savedState.g;
            }
        }
        int i2 = savedState.c;
        if (i2 != 1 && i2 != 2) {
            this.L = i2;
        } else {
            this.L = 4;
        }
    }

    @Override // defpackage.h90
    public final Parcelable p(View view) {
        return new SavedState(View.BaseSavedState.EMPTY_STATE, this);
    }

    @Override // defpackage.h90
    public final boolean q(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2) {
        this.O = 0;
        this.P = false;
        if ((i & 2) == 0) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x002f, code lost:            if (r3.getTop() <= r1.E) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:            if (java.lang.Math.abs(r2 - r1.D) < java.lang.Math.abs(r2 - r1.G)) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007e, code lost:            if (r2 < java.lang.Math.abs(r2 - r1.G)) goto L52;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008e, code lost:            if (java.lang.Math.abs(r2 - r4) < java.lang.Math.abs(r2 - r1.G)) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a9, code lost:            if (java.lang.Math.abs(r2 - r1.E) < java.lang.Math.abs(r2 - r1.G)) goto L50;     */
    @Override // defpackage.h90
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, android.view.View r4, int r5) {
        /*
            r1 = this;
            int r2 = r3.getTop()
            int r5 = r1.z()
            r0 = 3
            if (r2 != r5) goto Lf
            r1.E(r0)
            return
        Lf:
            java.lang.ref.WeakReference r2 = r1.V
            if (r2 == 0) goto Lb4
            java.lang.Object r2 = r2.get()
            if (r4 != r2) goto Lb4
            boolean r2 = r1.P
            if (r2 != 0) goto L1f
            goto Lb4
        L1f:
            int r2 = r1.O
            if (r2 <= 0) goto L33
            boolean r2 = r1.f1529b
            if (r2 == 0) goto L29
            goto Lae
        L29:
            int r2 = r3.getTop()
            int r4 = r1.E
            if (r2 <= r4) goto Lae
            goto Lab
        L33:
            boolean r2 = r1.I
            if (r2 == 0) goto L54
            android.view.VelocityTracker r2 = r1.X
            if (r2 != 0) goto L3d
            r2 = 0
            goto L4c
        L3d:
            r4 = 1000(0x3e8, float:1.401E-42)
            float r5 = r1.c
            r2.computeCurrentVelocity(r4, r5)
            android.view.VelocityTracker r2 = r1.X
            int r4 = r1.Y
            float r2 = r2.getYVelocity(r4)
        L4c:
            boolean r2 = r1.F(r3, r2)
            if (r2 == 0) goto L54
            r0 = 5
            goto Lae
        L54:
            int r2 = r1.O
            if (r2 != 0) goto L91
            int r2 = r3.getTop()
            boolean r4 = r1.f1529b
            if (r4 == 0) goto L72
            int r4 = r1.D
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lae
        L72:
            int r4 = r1.E
            if (r2 >= r4) goto L81
            int r4 = r1.G
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            if (r2 >= r4) goto Lab
            goto Lae
        L81:
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
            goto Lab
        L91:
            boolean r2 = r1.f1529b
            if (r2 == 0) goto L96
            goto Lad
        L96:
            int r2 = r3.getTop()
            int r4 = r1.E
            int r4 = r2 - r4
            int r4 = java.lang.Math.abs(r4)
            int r5 = r1.G
            int r2 = r2 - r5
            int r2 = java.lang.Math.abs(r2)
            if (r4 >= r2) goto Lad
        Lab:
            r0 = 6
            goto Lae
        Lad:
            r0 = 4
        Lae:
            r2 = 0
            r1.G(r3, r2, r0)
            r1.P = r2
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.r(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.View, int):void");
    }

    @Override // defpackage.h90
    public final boolean s(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z;
        boolean z2 = false;
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i = this.L;
        if (i == 1 && actionMasked == 0) {
            return true;
        }
        vl3 vl3Var = this.M;
        if (vl3Var != null && (this.K || i == 1)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            vl3Var.k(motionEvent);
        }
        if (actionMasked == 0) {
            this.Y = -1;
            this.Z = -1;
            VelocityTracker velocityTracker = this.X;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.X = null;
            }
        }
        if (this.X == null) {
            this.X = VelocityTracker.obtain();
        }
        this.X.addMovement(motionEvent);
        if (this.M != null && (this.K || this.L == 1)) {
            z2 = true;
        }
        if (z2 && actionMasked == 2 && !this.N) {
            float abs = Math.abs(this.Z - motionEvent.getY());
            vl3 vl3Var2 = this.M;
            if (abs > vl3Var2.f4861b) {
                vl3Var2.b(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
            }
        }
        return !this.N;
    }

    public final void t() {
        int v = v();
        if (this.f1529b) {
            this.G = Math.max(this.T - v, this.D);
        } else {
            this.G = this.T - v;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:            r0 = r0.getRootWindowInsets();     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final float u() {
        /*
            r5 = this;
            fr1 r0 = r5.i
            r1 = 0
            if (r0 == 0) goto L79
            java.lang.ref.WeakReference r0 = r5.U
            if (r0 == 0) goto L79
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L79
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L79
            java.lang.ref.WeakReference r0 = r5.U
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
            boolean r2 = r5.B()
            if (r2 == 0) goto L79
            android.view.WindowInsets r0 = defpackage.fy3.b(r0)
            if (r0 == 0) goto L79
            fr1 r2 = r5.i
            er1 r3 = r2.f2139a
            fs2 r3 = r3.f1978a
            p90 r3 = r3.e
            android.graphics.RectF r2 = r2.g()
            float r2 = r3.a(r2)
            android.view.RoundedCorner r3 = defpackage.vq.p(r0)
            if (r3 == 0) goto L4e
            int r3 = defpackage.vq.c(r3)
            float r3 = (float) r3
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L4e
            float r3 = r3 / r2
            goto L4f
        L4e:
            r3 = 0
        L4f:
            fr1 r2 = r5.i
            er1 r4 = r2.f2139a
            fs2 r4 = r4.f1978a
            p90 r4 = r4.f
            android.graphics.RectF r2 = r2.g()
            float r2 = r4.a(r2)
            android.view.RoundedCorner r0 = defpackage.vq.C(r0)
            if (r0 == 0) goto L74
            int r0 = defpackage.vq.c(r0)
            float r0 = (float) r0
            int r4 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            int r4 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r4 <= 0) goto L74
            float r1 = r0 / r2
        L74:
            float r0 = java.lang.Math.max(r3, r1)
            return r0
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomsheet.BottomSheetBehavior.u():float");
    }

    public final int v() {
        int i;
        if (this.f) {
            return Math.min(Math.max(this.g, this.T - ((this.S * 9) / 16)), this.R) + this.v;
        }
        if (!this.n && !this.o && (i = this.m) > 0) {
            return Math.max(this.e, i + this.h);
        }
        return this.e + this.v;
    }

    public final void w(int i) {
        if (((View) this.U.get()) != null) {
            ArrayList arrayList = this.W;
            if (!arrayList.isEmpty()) {
                int i2 = this.G;
                if (i <= i2 && i2 != z()) {
                    z();
                }
                if (arrayList.size() > 0) {
                    p71.C(arrayList.get(0));
                    throw null;
                }
            }
        }
    }

    public final int y(int i, int i2, int i3, int i4) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, i2, i4);
        if (i3 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i3 = Math.min(size, i3);
            }
            return View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i3), 1073741824);
    }

    public final int z() {
        int i;
        if (this.f1529b) {
            return this.D;
        }
        int i2 = this.C;
        if (this.r) {
            i = 0;
        } else {
            i = this.w;
        }
        return Math.max(i2, i);
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public final int c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
            this.g = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f200a, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
            parcel.writeInt(this.g ? 1 : 0);
        }

        public SavedState(android.view.AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
            super(absSavedState);
            this.c = bottomSheetBehavior.L;
            this.d = bottomSheetBehavior.e;
            this.e = bottomSheetBehavior.f1529b;
            this.f = bottomSheetBehavior.I;
            this.g = bottomSheetBehavior.J;
        }
    }

    public BottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(0);
        int i;
        this.f1528a = 0;
        this.f1529b = true;
        this.k = -1;
        this.l = -1;
        this.A = new yq(this, 0);
        this.F = 0.5f;
        this.H = -1.0f;
        this.K = true;
        this.L = 4;
        this.Q = 0.1f;
        this.W = new ArrayList();
        this.Z = -1;
        this.c0 = new SparseIntArray();
        this.d0 = new xq(this);
        this.h = context.getResources().getDimensionPixelSize(re2.mtrl_min_touch_target_size);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bg2.BottomSheetBehavior_Layout);
        int i2 = bg2.BottomSheetBehavior_Layout_backgroundTint;
        if (obtainStyledAttributes.hasValue(i2)) {
            this.j = m20.j0(context, obtainStyledAttributes, i2);
        }
        if (obtainStyledAttributes.hasValue(bg2.BottomSheetBehavior_Layout_shapeAppearance)) {
            this.y = new fs2(fs2.b(context, attributeSet, he2.bottomSheetStyle, e0));
        }
        fs2 fs2Var = this.y;
        if (fs2Var != null) {
            fr1 fr1Var = new fr1(fs2Var);
            this.i = fr1Var;
            fr1Var.h(context);
            ColorStateList colorStateList = this.j;
            if (colorStateList != null) {
                this.i.j(colorStateList);
            } else {
                TypedValue typedValue = new TypedValue();
                context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
                this.i.setTint(typedValue.data);
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(u(), 1.0f);
        this.B = ofFloat;
        ofFloat.setDuration(500L);
        this.B.addUpdateListener(new wq(this, 0));
        this.H = obtainStyledAttributes.getDimension(bg2.BottomSheetBehavior_Layout_android_elevation, -1.0f);
        int i3 = bg2.BottomSheetBehavior_Layout_android_maxWidth;
        if (obtainStyledAttributes.hasValue(i3)) {
            this.k = obtainStyledAttributes.getDimensionPixelSize(i3, -1);
        }
        int i4 = bg2.BottomSheetBehavior_Layout_android_maxHeight;
        if (obtainStyledAttributes.hasValue(i4)) {
            this.l = obtainStyledAttributes.getDimensionPixelSize(i4, -1);
        }
        int i5 = bg2.BottomSheetBehavior_Layout_behavior_peekHeight;
        TypedValue peekValue = obtainStyledAttributes.peekValue(i5);
        if (peekValue != null && (i = peekValue.data) == -1) {
            C(i);
        } else {
            C(obtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        boolean z = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_behavior_hideable, false);
        if (this.I != z) {
            this.I = z;
            if (!z && this.L == 5) {
                D(4);
            }
            H();
        }
        this.n = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_gestureInsetBottomIgnored, false);
        boolean z2 = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_behavior_fitToContents, true);
        if (this.f1529b != z2) {
            this.f1529b = z2;
            if (this.U != null) {
                t();
            }
            E((this.f1529b && this.L == 6) ? 3 : this.L);
            I(this.L, true);
            H();
        }
        this.J = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_behavior_skipCollapsed, false);
        this.K = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_behavior_draggable, true);
        this.f1528a = obtainStyledAttributes.getInt(bg2.BottomSheetBehavior_Layout_behavior_saveFlags, 0);
        float f = obtainStyledAttributes.getFloat(bg2.BottomSheetBehavior_Layout_behavior_halfExpandedRatio, 0.5f);
        if (f > 0.0f && f < 1.0f) {
            this.F = f;
            if (this.U != null) {
                this.E = (int) ((1.0f - f) * this.T);
            }
            int i6 = bg2.BottomSheetBehavior_Layout_behavior_expandedOffset;
            TypedValue peekValue2 = obtainStyledAttributes.peekValue(i6);
            if (peekValue2 != null && peekValue2.type == 16) {
                int i7 = peekValue2.data;
                if (i7 >= 0) {
                    this.C = i7;
                    I(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            } else {
                int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(i6, 0);
                if (dimensionPixelOffset >= 0) {
                    this.C = dimensionPixelOffset;
                    I(this.L, true);
                } else {
                    throw new IllegalArgumentException("offset must be greater than or equal to 0");
                }
            }
            this.d = obtainStyledAttributes.getInt(bg2.BottomSheetBehavior_Layout_behavior_significantVelocityThreshold, 500);
            this.o = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_paddingBottomSystemWindowInsets, false);
            this.p = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_paddingLeftSystemWindowInsets, false);
            this.q = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_paddingRightSystemWindowInsets, false);
            this.r = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_paddingTopSystemWindowInsets, true);
            this.s = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_marginLeftSystemWindowInsets, false);
            this.t = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_marginRightSystemWindowInsets, false);
            this.u = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_marginTopSystemWindowInsets, false);
            this.x = obtainStyledAttributes.getBoolean(bg2.BottomSheetBehavior_Layout_shouldRemoveExpandedCorners, true);
            obtainStyledAttributes.recycle();
            this.c = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
            return;
        }
        throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
    }
}
