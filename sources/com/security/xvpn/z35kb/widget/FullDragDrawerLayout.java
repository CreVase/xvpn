package com.security.xvpn.z35kb.widget;

import a.du;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.customview.view.AbsSavedState;
import defpackage.a3;
import defpackage.al3;
import defpackage.dz1;
import defpackage.ew3;
import defpackage.ll3;
import defpackage.p31;
import defpackage.pe0;
import defpackage.q31;
import defpackage.r31;
import defpackage.s31;
import defpackage.t31;
import defpackage.uk3;
import defpackage.uo;
import defpackage.vk3;
import defpackage.vl3;
import defpackage.x80;
import defpackage.xo1;
import defpackage.yf2;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class FullDragDrawerLayout extends ViewGroup {
    public static final int[] C = {R.attr.colorPrimaryDark};
    public static final int[] D = {R.attr.layout_gravity};
    public Matrix A;
    public final uo B;

    /* renamed from: a, reason: collision with root package name */
    public float f1628a;

    /* renamed from: b, reason: collision with root package name */
    public final int f1629b;
    public int c;
    public float d;
    public final Paint e;
    public final vl3 f;
    public final vl3 g;
    public final t31 h;
    public final t31 i;
    public int j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;
    public int p;
    public boolean q;
    public r31 r;
    public ArrayList s;
    public float t;
    public float u;
    public Drawable v;
    public Object w;
    public boolean x;
    public final ArrayList y;
    public Rect z;

    public FullDragDrawerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        new dz1(1);
        this.c = -1728053248;
        this.e = new Paint();
        this.l = true;
        this.m = 3;
        this.n = 3;
        this.o = 3;
        this.p = 3;
        this.B = new uo(this);
        setDescendantFocusability(262144);
        float f = getResources().getDisplayMetrics().density;
        this.f1629b = (int) ((64.0f * f) + 0.5f);
        float f2 = f * 400.0f;
        t31 t31Var = new t31(this, 3);
        this.h = t31Var;
        t31 t31Var2 = new t31(this, 5);
        this.i = t31Var2;
        vl3 vl3Var = new vl3(getContext(), this, t31Var);
        vl3Var.f4861b = (int) (vl3Var.f4861b * 1.0f);
        this.f = vl3Var;
        vl3Var.p = 1;
        vl3Var.n = f2;
        t31Var.s = vl3Var;
        vl3 vl3Var2 = new vl3(getContext(), this, t31Var2);
        vl3Var2.f4861b = (int) (vl3Var2.f4861b * 1.0f);
        this.g = vl3Var2;
        vl3Var2.p = 2;
        vl3Var2.n = f2;
        t31Var2.s = vl3Var2;
        setFocusableInTouchMode(true);
        WeakHashMap weakHashMap = ll3.f3151a;
        uk3.s(this, 1);
        ll3.p(this, new q31(this));
        setMotionEventSplittingEnabled(false);
        if (uk3.b(this)) {
            setOnApplyWindowInsetsListener(new p31());
            setSystemUiVisibility(1280);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C);
            try {
                this.v = obtainStyledAttributes.getDrawable(0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, yf2.DrawerLayout, 0, 0);
        try {
            if (obtainStyledAttributes2.hasValue(0)) {
                this.f1628a = obtainStyledAttributes2.getDimension(0, 0.0f);
            } else {
                this.f1628a = getResources().getDimension(com.security.xvpn.z35kb.R.dimen.def_drawer_elevation);
            }
            obtainStyledAttributes2.recycle();
            this.y = new ArrayList();
        } catch (Throwable th) {
            obtainStyledAttributes2.recycle();
            throw th;
        }
    }

    public static boolean i(View view) {
        if (((s31) view.getLayoutParams()).f4263a == 0) {
            return true;
        }
        return false;
    }

    public static boolean j(View view) {
        if (k(view)) {
            if ((((s31) view.getLayoutParams()).c & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public static boolean k(View view) {
        int i = ((s31) view.getLayoutParams()).f4263a;
        WeakHashMap weakHashMap = ll3.f3151a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i, vk3.d(view));
        if ((absoluteGravity & 3) != 0 || (absoluteGravity & 5) != 0) {
            return true;
        }
        return false;
    }

    public final boolean a(View view, int i) {
        if ((h(view) & i) == i) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        ArrayList arrayList2;
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        int i3 = 0;
        boolean z = false;
        while (true) {
            arrayList2 = this.y;
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            if (k(childAt)) {
                if (j(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                arrayList2.add(childAt);
            }
            i3++;
        }
        if (!z) {
            int size = arrayList2.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = (View) arrayList2.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        arrayList2.clear();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (e() == null && !k(view)) {
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.s(view, 1);
        } else {
            WeakHashMap weakHashMap2 = ll3.f3151a;
            uk3.s(view, 4);
        }
    }

    public final void b(View view) {
        if (k(view)) {
            s31 s31Var = (s31) view.getLayoutParams();
            if (this.l) {
                s31Var.f4264b = 0.0f;
                s31Var.c = 0;
            } else {
                s31Var.c |= 4;
                if (a(view, 3)) {
                    this.f.s(view, -view.getWidth(), view.getTop());
                } else {
                    this.g.s(view, getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void c(boolean z) {
        boolean s;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            s31 s31Var = (s31) childAt.getLayoutParams();
            if (k(childAt)) {
                if (z) {
                    s31Var.getClass();
                } else {
                    int width = childAt.getWidth();
                    if (a(childAt, 3)) {
                        int top = childAt.getTop();
                        s = this.f.s(childAt, -width, top);
                    } else {
                        s = this.g.s(childAt, getWidth(), childAt.getTop());
                    }
                    z2 |= s;
                    s31Var.getClass();
                }
            }
        }
        this.h.getClass();
        this.i.getClass();
        if (z2) {
            invalidate();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof s31) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void computeScroll() {
        int childCount = getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            f = Math.max(f, ((s31) getChildAt(i).getLayoutParams()).f4264b);
        }
        this.d = f;
        boolean g = this.f.g();
        boolean g2 = this.g.g();
        if (g || g2) {
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.k(this);
        }
    }

    public final View d(int i) {
        int i2 = i & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((h(childAt) & 7) == i2) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        boolean dispatchGenericMotionEvent;
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.d > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                for (int i = childCount - 1; i >= 0; i--) {
                    View childAt = getChildAt(i);
                    if (this.z == null) {
                        this.z = new Rect();
                    }
                    childAt.getHitRect(this.z);
                    if (this.z.contains((int) x, (int) y) && !i(childAt)) {
                        if (!childAt.getMatrix().isIdentity()) {
                            float scrollX = getScrollX() - childAt.getLeft();
                            float scrollY = getScrollY() - childAt.getTop();
                            MotionEvent obtain = MotionEvent.obtain(motionEvent);
                            obtain.offsetLocation(scrollX, scrollY);
                            Matrix matrix = childAt.getMatrix();
                            if (!matrix.isIdentity()) {
                                if (this.A == null) {
                                    this.A = new Matrix();
                                }
                                matrix.invert(this.A);
                                obtain.transform(this.A);
                            }
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(obtain);
                            obtain.recycle();
                        } else {
                            float scrollX2 = getScrollX() - childAt.getLeft();
                            float scrollY2 = getScrollY() - childAt.getTop();
                            motionEvent.offsetLocation(scrollX2, scrollY2);
                            dispatchGenericMotionEvent = childAt.dispatchGenericMotionEvent(motionEvent);
                            motionEvent.offsetLocation(-scrollX2, -scrollY2);
                        }
                        if (dispatchGenericMotionEvent) {
                            return true;
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        int height = getHeight();
        boolean i = i(view);
        int width = getWidth();
        int save = canvas.save();
        int i2 = 0;
        if (i) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt != view && childAt.getVisibility() == 0) {
                    Drawable background = childAt.getBackground();
                    if (background != null && background.getOpacity() == -1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && k(childAt) && childAt.getHeight() >= height) {
                        if (a(childAt, 3)) {
                            int right = childAt.getRight();
                            if (right > i3) {
                                i3 = right;
                            }
                        } else {
                            int left = childAt.getLeft();
                            if (left < width) {
                                width = left;
                            }
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        float f = this.d;
        if (f > 0.0f && i) {
            int i5 = this.c;
            Paint paint = this.e;
            paint.setColor((((int) ((((-16777216) & i5) >>> 24) * f)) << 24) | (i5 & 16777215));
            canvas.drawRect(i2, 0.0f, width, getHeight(), paint);
        }
        return drawChild;
    }

    public final View e() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((s31) childAt.getLayoutParams()).c & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public final View f() {
        boolean z;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (k(childAt)) {
                if (k(childAt)) {
                    if (((s31) childAt.getLayoutParams()).f4264b > 0.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        return childAt;
                    }
                } else {
                    throw new IllegalArgumentException("View " + childAt + " is not a drawer");
                }
            }
        }
        return null;
    }

    public final int g(View view) {
        int i;
        int i2;
        int i3;
        int i4;
        if (k(view)) {
            int i5 = ((s31) view.getLayoutParams()).f4263a;
            WeakHashMap weakHashMap = ll3.f3151a;
            int d = vk3.d(this);
            if (i5 != 3) {
                if (i5 != 5) {
                    if (i5 != 8388611) {
                        if (i5 == 8388613) {
                            int i6 = this.p;
                            if (i6 == 3) {
                                if (d == 0) {
                                    i4 = this.n;
                                } else {
                                    i4 = this.m;
                                }
                                if (i4 != 3) {
                                    return i4;
                                }
                            } else {
                                return i6;
                            }
                        }
                    } else {
                        int i7 = this.o;
                        if (i7 == 3) {
                            if (d == 0) {
                                i3 = this.m;
                            } else {
                                i3 = this.n;
                            }
                            if (i3 != 3) {
                                return i3;
                            }
                        } else {
                            return i7;
                        }
                    }
                } else {
                    int i8 = this.n;
                    if (i8 == 3) {
                        if (d == 0) {
                            i2 = this.p;
                        } else {
                            i2 = this.o;
                        }
                        if (i2 != 3) {
                            return i2;
                        }
                    } else {
                        return i8;
                    }
                }
            } else {
                int i9 = this.m;
                if (i9 == 3) {
                    if (d == 0) {
                        i = this.o;
                    } else {
                        i = this.p;
                    }
                    if (i != 3) {
                        return i;
                    }
                } else {
                    return i9;
                }
            }
            return 0;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new s31();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof s31) {
            return new s31((s31) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new s31((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new s31(layoutParams);
    }

    public float getDrawerElevation() {
        return this.f1628a;
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.v;
    }

    public final int h(View view) {
        int i = ((s31) view.getLayoutParams()).f4263a;
        WeakHashMap weakHashMap = ll3.f3151a;
        return Gravity.getAbsoluteGravity(i, vk3.d(this));
    }

    public final void l(View view) {
        if (k(view)) {
            s31 s31Var = (s31) view.getLayoutParams();
            if (this.l) {
                s31Var.f4264b = 1.0f;
                s31Var.c = 1;
                p(view, true);
                o(view);
            } else {
                s31Var.c |= 2;
                if (a(view, 3)) {
                    this.f.s(view, 0, view.getTop());
                } else {
                    this.g.s(view, getWidth() - view.getWidth(), view.getTop());
                }
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public final void m(int i, int i2) {
        View d;
        vl3 vl3Var;
        WeakHashMap weakHashMap = ll3.f3151a;
        int absoluteGravity = Gravity.getAbsoluteGravity(i2, vk3.d(this));
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 8388611) {
                    if (i2 == 8388613) {
                        this.p = i;
                    }
                } else {
                    this.o = i;
                }
            } else {
                this.n = i;
            }
        } else {
            this.m = i;
        }
        if (i != 0) {
            if (absoluteGravity == 3) {
                vl3Var = this.f;
            } else {
                vl3Var = this.g;
            }
            vl3Var.a();
        }
        if (i != 1) {
            if (i == 2 && (d = d(absoluteGravity)) != null) {
                l(d);
                return;
            }
            return;
        }
        View d2 = d(absoluteGravity);
        if (d2 != null) {
            b(d2);
        }
    }

    public final void n(View view, float f) {
        s31 s31Var = (s31) view.getLayoutParams();
        if (f == s31Var.f4264b) {
            return;
        }
        s31Var.f4264b = f;
        ArrayList arrayList = this.s;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((r31) this.s.get(size)).getClass();
                } else {
                    return;
                }
            }
        }
    }

    public final void o(View view) {
        a3 a3Var = a3.l;
        ll3.m(view, a3Var.a());
        ll3.i(view, 0);
        if (j(view) && g(view) != 2) {
            ll3.n(view, a3Var, this.B);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.l = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.l = true;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.x && this.v != null) {
            Object obj = this.w;
            if (obj != null) {
                i = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.v.setBounds(0, 0, getWidth(), i);
                this.v.draw(canvas);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:            if (r0 != 3) goto L29;     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058 A[LOOP:1: B:23:0x0022->B:32:0x0058, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056 A[SYNTHETIC] */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            int r0 = r9.getActionMasked()
            vl3 r1 = r8.f
            boolean r2 = r1.r(r9)
            vl3 r3 = r8.g
            boolean r3 = r3.r(r9)
            r2 = r2 | r3
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L70
            if (r0 == r3) goto L69
            r9 = 2
            if (r0 == r9) goto L1e
            r9 = 3
            if (r0 == r9) goto L69
            goto L6e
        L1e:
            float[] r9 = r1.d
            int r9 = r9.length
            r0 = 0
        L22:
            if (r0 >= r9) goto L5b
            int r5 = r1.k
            int r6 = r3 << r0
            r5 = r5 & r6
            if (r5 == 0) goto L2d
            r5 = 1
            goto L2e
        L2d:
            r5 = 0
        L2e:
            if (r5 != 0) goto L31
            goto L53
        L31:
            float[] r5 = r1.f
            r5 = r5[r0]
            float[] r6 = r1.d
            r6 = r6[r0]
            float r5 = r5 - r6
            float[] r6 = r1.g
            r6 = r6[r0]
            float[] r7 = r1.e
            r7 = r7[r0]
            float r6 = r6 - r7
            float r5 = r5 * r5
            float r6 = r6 * r6
            float r6 = r6 + r5
            int r5 = r1.f4861b
            int r5 = r5 * r5
            float r5 = (float) r5
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L53
            r5 = 1
            goto L54
        L53:
            r5 = 0
        L54:
            if (r5 == 0) goto L58
            r9 = 1
            goto L5c
        L58:
            int r0 = r0 + 1
            goto L22
        L5b:
            r9 = 0
        L5c:
            if (r9 == 0) goto L6e
            t31 r9 = r8.h
            r9.getClass()
            t31 r9 = r8.i
            r9.getClass()
            goto L6e
        L69:
            r8.c(r3)
            r8.q = r4
        L6e:
            r9 = 0
            goto L96
        L70:
            float r0 = r9.getX()
            float r9 = r9.getY()
            r8.t = r0
            r8.u = r9
            float r5 = r8.d
            r6 = 0
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L93
            int r0 = (int) r0
            int r9 = (int) r9
            android.view.View r9 = r1.h(r0, r9)
            if (r9 == 0) goto L93
            boolean r9 = i(r9)
            if (r9 == 0) goto L93
            r9 = 1
            goto L94
        L93:
            r9 = 0
        L94:
            r8.q = r4
        L96:
            if (r2 != 0) goto Lb7
            if (r9 != 0) goto Lb7
            int r9 = r8.getChildCount()
            r0 = 0
        L9f:
            if (r0 >= r9) goto Lb1
            android.view.View r1 = r8.getChildAt(r0)
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            s31 r1 = (defpackage.s31) r1
            r1.getClass()
            int r0 = r0 + 1
            goto L9f
        Lb1:
            boolean r9 = r8.q
            if (r9 == 0) goto Lb6
            goto Lb7
        Lb6:
            r3 = 0
        Lb7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.widget.FullDragDrawerLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 4) {
            if (f() != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                keyEvent.startTracking();
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View f = f();
            if (f != null && g(f) == 0) {
                c(false);
            }
            if (f == null) {
                return false;
            }
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f;
        int i5;
        boolean z2;
        int i6;
        this.k = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                s31 s31Var = (s31) childAt.getLayoutParams();
                if (i(childAt)) {
                    int i9 = ((ViewGroup.MarginLayoutParams) s31Var).leftMargin;
                    childAt.layout(i9, ((ViewGroup.MarginLayoutParams) s31Var).topMargin, childAt.getMeasuredWidth() + i9, childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) s31Var).topMargin);
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f2 = measuredWidth;
                        i5 = (-measuredWidth) + ((int) (s31Var.f4264b * f2));
                        f = (measuredWidth + i5) / f2;
                    } else {
                        float f3 = measuredWidth;
                        f = (i7 - r11) / f3;
                        i5 = i7 - ((int) (s31Var.f4264b * f3));
                    }
                    if (f != s31Var.f4264b) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i10 = s31Var.f4263a & 112;
                    if (i10 != 16) {
                        if (i10 != 80) {
                            int i11 = ((ViewGroup.MarginLayoutParams) s31Var).topMargin;
                            childAt.layout(i5, i11, measuredWidth + i5, measuredHeight + i11);
                        } else {
                            int i12 = i4 - i2;
                            childAt.layout(i5, (i12 - ((ViewGroup.MarginLayoutParams) s31Var).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i5, i12 - ((ViewGroup.MarginLayoutParams) s31Var).bottomMargin);
                        }
                    } else {
                        int i13 = i4 - i2;
                        int i14 = (i13 - measuredHeight) / 2;
                        int i15 = ((ViewGroup.MarginLayoutParams) s31Var).topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                        } else {
                            int i16 = i14 + measuredHeight;
                            int i17 = i13 - ((ViewGroup.MarginLayoutParams) s31Var).bottomMargin;
                            if (i16 > i17) {
                                i14 = i17 - measuredHeight;
                            }
                        }
                        childAt.layout(i5, i14, measuredWidth + i5, measuredHeight + i14);
                    }
                    if (z2) {
                        n(childAt, f);
                    }
                    if (s31Var.f4264b > 0.0f) {
                        i6 = 0;
                    } else {
                        i6 = 4;
                    }
                    if (childAt.getVisibility() != i6) {
                        childAt.setVisibility(i6);
                    }
                }
            }
        }
        this.f.o = i7;
        this.g.o = i7;
        this.k = false;
        this.l = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.widget.FullDragDrawerLayout.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        View d;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f200a);
        int i = savedState.c;
        if (i != 0 && (d = d(i)) != null) {
            l(d);
        }
        int i2 = savedState.d;
        if (i2 != 3) {
            m(i2, 3);
        }
        int i3 = savedState.e;
        if (i3 != 3) {
            m(i3, 5);
        }
        int i4 = savedState.f;
        if (i4 != 3) {
            m(i4, 8388611);
        }
        int i5 = savedState.g;
        if (i5 != 3) {
            m(i5, 8388613);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            s31 s31Var = (s31) getChildAt(i).getLayoutParams();
            int i2 = s31Var.c;
            boolean z2 = true;
            if (i2 == 1) {
                z = true;
            } else {
                z = false;
            }
            if (i2 != 2) {
                z2 = false;
            }
            if (z || z2) {
                savedState.c = s31Var.f4263a;
                break;
            }
        }
        savedState.d = this.m;
        savedState.e = this.n;
        savedState.f = this.o;
        savedState.g = this.p;
        return savedState;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0055, code lost:            if (g(r7) != 2) goto L20;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r7) {
        /*
            r6 = this;
            vl3 r0 = r6.f
            r0.k(r7)
            vl3 r1 = r6.g
            r1.k(r7)
            int r1 = r7.getAction()
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L5c
            if (r1 == r3) goto L20
            r7 = 3
            if (r1 == r7) goto L1a
            goto L6a
        L1a:
            r6.c(r3)
            r6.q = r2
            goto L6a
        L20:
            float r1 = r7.getX()
            float r7 = r7.getY()
            int r4 = (int) r1
            int r5 = (int) r7
            android.view.View r4 = r0.h(r4, r5)
            if (r4 == 0) goto L57
            boolean r4 = i(r4)
            if (r4 == 0) goto L57
            float r4 = r6.t
            float r1 = r1 - r4
            float r4 = r6.u
            float r7 = r7 - r4
            int r0 = r0.f4861b
            float r1 = r1 * r1
            float r7 = r7 * r7
            float r7 = r7 + r1
            int r0 = r0 * r0
            float r0 = (float) r0
            int r7 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r7 >= 0) goto L57
            android.view.View r7 = r6.e()
            if (r7 == 0) goto L57
            int r7 = r6.g(r7)
            r0 = 2
            if (r7 != r0) goto L58
        L57:
            r2 = 1
        L58:
            r6.c(r2)
            goto L6a
        L5c:
            float r0 = r7.getX()
            float r7 = r7.getY()
            r6.t = r0
            r6.u = r7
            r6.q = r2
        L6a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.widget.FullDragDrawerLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !k(childAt)) || (z && childAt == view)) {
                WeakHashMap weakHashMap = ll3.f3151a;
                uk3.s(childAt, 1);
            } else {
                WeakHashMap weakHashMap2 = ll3.f3151a;
                uk3.s(childAt, 4);
            }
        }
    }

    public final void q(View view, int i) {
        int i2;
        View rootView;
        int i3 = this.f.f4860a;
        int i4 = this.g.f4860a;
        if (i3 != 1 && i4 != 1) {
            i2 = 2;
            if (i3 != 2 && i4 != 2) {
                i2 = 0;
            }
        } else {
            i2 = 1;
        }
        if (view != null && i == 0) {
            float f = ((s31) view.getLayoutParams()).f4264b;
            if (f == 0.0f) {
                s31 s31Var = (s31) view.getLayoutParams();
                if ((s31Var.c & 1) == 1) {
                    s31Var.c = 0;
                    ArrayList arrayList = this.s;
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size += -1) {
                            ((xo1) ((r31) this.s.get(size))).getClass();
                            ew3.L0("UiPausePage", "MorePage_" + pe0.b());
                        }
                    }
                    p(view, false);
                    o(view);
                    if (hasWindowFocus() && (rootView = getRootView()) != null) {
                        rootView.sendAccessibilityEvent(32);
                    }
                }
            } else if (f == 1.0f) {
                s31 s31Var2 = (s31) view.getLayoutParams();
                if ((s31Var2.c & 1) == 0) {
                    s31Var2.c = 1;
                    ArrayList arrayList2 = this.s;
                    if (arrayList2 != null) {
                        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                            ((xo1) ((r31) this.s.get(size2))).getClass();
                            ew3.L0("UiOpenPage", "MorePage_" + pe0.b());
                            du.d(266, null);
                            ew3.Z("sru", "show");
                        }
                    }
                    p(view, true);
                    o(view);
                    if (hasWindowFocus()) {
                        sendAccessibilityEvent(32);
                    }
                }
            }
        }
        if (i2 != this.j) {
            this.j = i2;
            ArrayList arrayList3 = this.s;
            if (arrayList3 != null) {
                for (int size3 = arrayList3.size() - 1; size3 >= 0; size3--) {
                    ((r31) this.s.get(size3)).getClass();
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z) {
            c(true);
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (!this.k) {
            super.requestLayout();
        }
    }

    public void setDrawerElevation(float f) {
        this.f1628a = f;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (k(childAt)) {
                float f2 = this.f1628a;
                WeakHashMap weakHashMap = ll3.f3151a;
                al3.s(childAt, f2);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(r31 r31Var) {
        ArrayList arrayList;
        r31 r31Var2 = this.r;
        if (r31Var2 != null && (arrayList = this.s) != null) {
            arrayList.remove(r31Var2);
        }
        if (r31Var != null) {
            if (this.s == null) {
                this.s = new ArrayList();
            }
            this.s.add(r31Var);
        }
        this.r = r31Var;
    }

    public void setDrawerLockMode(int i) {
        m(i, 3);
        m(i, 5);
    }

    public void setScrimColor(int i) {
        this.c = i;
        invalidate();
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.v = drawable;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.v = new ColorDrawable(i);
        invalidate();
    }

    public void setStatusBarBackground(int i) {
        this.v = i != 0 ? x80.getDrawable(getContext(), i) : null;
        invalidate();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new s31(getContext(), attributeSet);
    }

    /* loaded from: classes2.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public int c;
        public int d;
        public int e;
        public int f;
        public int g;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = 0;
            this.c = parcel.readInt();
            this.d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
            this.g = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f200a, i);
            parcel.writeInt(this.c);
            parcel.writeInt(this.d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
            parcel.writeInt(this.g);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.c = 0;
        }
    }
}
