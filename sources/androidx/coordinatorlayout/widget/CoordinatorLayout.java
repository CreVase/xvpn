package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import defpackage.a61;
import defpackage.al3;
import defpackage.bm3;
import defpackage.eb3;
import defpackage.g90;
import defpackage.h90;
import defpackage.i90;
import defpackage.iz1;
import defpackage.ja1;
import defpackage.jz1;
import defpackage.k90;
import defpackage.kz1;
import defpackage.l90;
import defpackage.ll3;
import defpackage.m62;
import defpackage.m90;
import defpackage.n62;
import defpackage.t9;
import defpackage.uk3;
import defpackage.uu2;
import defpackage.vk3;
import defpackage.wq3;
import defpackage.x80;
import defpackage.xk3;
import defpackage.yk3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements iz1, jz1 {
    public static final String t;
    public static final Class[] u;
    public static final ThreadLocal v;
    public static final m90 w;
    public static final n62 x;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f188a;

    /* renamed from: b, reason: collision with root package name */
    public final eb3 f189b;
    public final ArrayList c;
    public final ArrayList d;
    public final int[] e;
    public final int[] f;
    public boolean g;
    public boolean h;
    public final int[] i;
    public View j;
    public View k;
    public l90 l;
    public boolean m;
    public wq3 n;
    public boolean o;
    public Drawable p;
    public ViewGroup.OnHierarchyChangeListener q;
    public ja1 r;
    public final kz1 s;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public SparseArray c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.c = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.c.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            int i2;
            parcel.writeParcelable(this.f200a, i);
            SparseArray sparseArray = this.c;
            if (sparseArray != null) {
                i2 = sparseArray.size();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
            int[] iArr = new int[i2];
            Parcelable[] parcelableArr = new Parcelable[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                iArr[i3] = this.c.keyAt(i3);
                parcelableArr[i3] = (Parcelable) this.c.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }

    static {
        String str;
        Package r0 = CoordinatorLayout.class.getPackage();
        if (r0 != null) {
            str = r0.getName();
        } else {
            str = null;
        }
        t = str;
        w = new m90(0);
        u = new Class[]{Context.class, AttributeSet.class};
        v = new ThreadLocal();
        x = new n62();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public CoordinatorLayout(android.content.Context r9, android.util.AttributeSet r10) {
        /*
            r8 = this;
            int r5 = defpackage.ee2.coordinatorLayoutStyle
            r8.<init>(r9, r10, r5)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.f188a = r0
            eb3 r0 = new eb3
            r1 = 3
            r0.<init>(r1)
            r8.f189b = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.c = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r8.d = r0
            r0 = 2
            int[] r1 = new int[r0]
            r8.e = r1
            int[] r0 = new int[r0]
            r8.f = r0
            kz1 r0 = new kz1
            r0.<init>()
            r8.s = r0
            r6 = 0
            if (r5 != 0) goto L3e
            int[] r0 = defpackage.wf2.CoordinatorLayout
            int r1 = defpackage.pf2.Widget_Support_CoordinatorLayout
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0, r6, r1)
            goto L44
        L3e:
            int[] r0 = defpackage.wf2.CoordinatorLayout
            android.content.res.TypedArray r0 = r9.obtainStyledAttributes(r10, r0, r5, r6)
        L44:
            r7 = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L62
            if (r5 != 0) goto L59
            int[] r2 = defpackage.wf2.CoordinatorLayout
            int r5 = defpackage.pf2.Widget_Support_CoordinatorLayout
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r7
            defpackage.y2.n(r0, r1, r2, r3, r4, r5)
            goto L62
        L59:
            int[] r2 = defpackage.wf2.CoordinatorLayout
            r0 = r8
            r1 = r9
            r3 = r10
            r4 = r7
            defpackage.y2.y(r0, r1, r2, r3, r4, r5)
        L62:
            int r0 = defpackage.wf2.CoordinatorLayout_keylines
            int r0 = r7.getResourceId(r0, r6)
            if (r0 == 0) goto L8a
            android.content.res.Resources r1 = r9.getResources()
            int[] r0 = r1.getIntArray(r0)
            r8.i = r0
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r0 = r0.length
        L7b:
            if (r6 >= r0) goto L8a
            int[] r2 = r8.i
            r3 = r2[r6]
            float r3 = (float) r3
            float r3 = r3 * r1
            int r3 = (int) r3
            r2[r6] = r3
            int r6 = r6 + 1
            goto L7b
        L8a:
            int r0 = defpackage.wf2.CoordinatorLayout_statusBarBackground
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r0)
            r8.p = r0
            r7.recycle()
            r8.x()
            j90 r0 = new j90
            r0.<init>(r8)
            super.setOnHierarchyChangeListener(r0)
            java.util.WeakHashMap r0 = defpackage.ll3.f3151a
            int r0 = defpackage.uk3.c(r8)
            if (r0 != 0) goto Lac
            r0 = 1
            defpackage.uk3.s(r8, r0)
        Lac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static Rect a() {
        Rect rect = (Rect) x.a();
        if (rect == null) {
            return new Rect();
        }
        return rect;
    }

    public static void j(int i, Rect rect, Rect rect2, k90 k90Var, int i2, int i3) {
        int width;
        int height;
        int i4 = k90Var.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int i5 = k90Var.d;
        if ((i5 & 7) == 0) {
            i5 |= 8388611;
        }
        if ((i5 & 112) == 0) {
            i5 |= 48;
        }
        int absoluteGravity2 = Gravity.getAbsoluteGravity(i5, i);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 7;
        int i9 = absoluteGravity2 & 112;
        if (i8 != 1) {
            if (i8 != 5) {
                width = rect.left;
            } else {
                width = rect.right;
            }
        } else {
            width = rect.left + (rect.width() / 2);
        }
        if (i9 != 16) {
            if (i9 != 80) {
                height = rect.top;
            } else {
                height = rect.bottom;
            }
        } else {
            height = rect.top + (rect.height() / 2);
        }
        if (i6 != 1) {
            if (i6 != 5) {
                width -= i2;
            }
        } else {
            width -= i2 / 2;
        }
        if (i7 != 16) {
            if (i7 != 80) {
                height -= i3;
            }
        } else {
            height -= i3 / 2;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static k90 n(View view) {
        k90 k90Var = (k90) view.getLayoutParams();
        if (!k90Var.f2910b) {
            if (view instanceof g90) {
                h90 behavior = ((g90) view).getBehavior();
                if (behavior == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                k90Var.b(behavior);
                k90Var.f2910b = true;
            } else {
                i90 i90Var = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    i90Var = (i90) cls.getAnnotation(i90.class);
                    if (i90Var != null) {
                        break;
                    }
                }
                if (i90Var != null) {
                    try {
                        k90Var.b((h90) i90Var.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + i90Var.value().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                k90Var.f2910b = true;
            }
        }
        return k90Var;
    }

    public static void v(View view, int i) {
        k90 k90Var = (k90) view.getLayoutParams();
        int i2 = k90Var.i;
        if (i2 != i) {
            ll3.j(view, i - i2);
            k90Var.i = i;
        }
    }

    public static void w(View view, int i) {
        k90 k90Var = (k90) view.getLayoutParams();
        int i2 = k90Var.j;
        if (i2 != i) {
            ll3.k(view, i - i2);
            k90Var.j = i;
        }
    }

    public final void b(k90 k90Var, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) k90Var).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ((ViewGroup.MarginLayoutParams) k90Var).rightMargin));
        int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) k90Var).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ((ViewGroup.MarginLayoutParams) k90Var).bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    public final void c(View view, Rect rect, boolean z) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z) {
                h(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof k90) && super.checkLayoutParams(layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.jz1
    public final void d(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        h90 h90Var;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                k90 k90Var = (k90) childAt.getLayoutParams();
                if (k90Var.a(i5) && (h90Var = k90Var.f2909a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    h90Var.l(this, childAt, view, i, i2, i3, i4, i5, iArr2);
                    int[] iArr3 = this.e;
                    if (i3 > 0) {
                        min = Math.max(i6, iArr3[0]);
                    } else {
                        min = Math.min(i6, iArr3[0]);
                    }
                    i6 = min;
                    if (i4 > 0) {
                        min2 = Math.max(i7, iArr3[1]);
                    } else {
                        min2 = Math.min(i7, iArr3[1]);
                    }
                    i7 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            p(1);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        h90 h90Var = ((k90) view.getLayoutParams()).f2909a;
        if (h90Var != null) {
            h90Var.getClass();
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.p;
        boolean z = false;
        if (drawable != null && drawable.isStateful()) {
            z = false | drawable.setState(drawableState);
        }
        if (z) {
            invalidate();
        }
    }

    public final ArrayList e(View view) {
        eb3 eb3Var = this.f189b;
        int i = ((uu2) eb3Var.f1908b).c;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList arrayList2 = (ArrayList) ((uu2) eb3Var.f1908b).k(i2);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(((uu2) eb3Var.f1908b).i(i2));
            }
        }
        ArrayList arrayList3 = this.d;
        arrayList3.clear();
        if (arrayList != null) {
            arrayList3.addAll(arrayList);
        }
        return arrayList3;
    }

    @Override // defpackage.iz1
    public final void f(View view, int i, int i2, int i3, int i4, int i5) {
        d(view, i, i2, i3, i4, 0, this.f);
    }

    @Override // defpackage.iz1
    public final boolean g(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                k90 k90Var = (k90) childAt.getLayoutParams();
                h90 h90Var = k90Var.f2909a;
                if (h90Var != null) {
                    boolean q = h90Var.q(this, childAt, view, i, i2);
                    z |= q;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            k90Var.o = q;
                        }
                    } else {
                        k90Var.n = q;
                    }
                } else if (i2 != 0) {
                    if (i2 == 1) {
                        k90Var.o = false;
                    }
                } else {
                    k90Var.n = false;
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new k90();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new k90(getContext(), attributeSet);
    }

    public final List<View> getDependencySortedChildren() {
        t();
        return Collections.unmodifiableList(this.f188a);
    }

    public final wq3 getLastWindowInsets() {
        return this.n;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        kz1 kz1Var = this.s;
        return kz1Var.f3040b | kz1Var.f3039a;
    }

    public Drawable getStatusBarBackground() {
        return this.p;
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingBottom() + getPaddingTop());
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingRight() + getPaddingLeft());
    }

    public final void h(View view, Rect rect) {
        ThreadLocal threadLocal = bm3.f490a;
        rect.set(0, 0, view.getWidth(), view.getHeight());
        ThreadLocal threadLocal2 = bm3.f490a;
        Matrix matrix = (Matrix) threadLocal2.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal2.set(matrix);
        } else {
            matrix.reset();
        }
        bm3.a(this, view, matrix);
        ThreadLocal threadLocal3 = bm3.f491b;
        RectF rectF = (RectF) threadLocal3.get();
        if (rectF == null) {
            rectF = new RectF();
            threadLocal3.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    @Override // defpackage.iz1
    public final void i(View view, View view2, int i, int i2) {
        kz1 kz1Var = this.s;
        if (i2 == 1) {
            kz1Var.f3040b = i;
        } else {
            kz1Var.f3039a = i;
        }
        this.k = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ((k90) getChildAt(i3).getLayoutParams()).getClass();
        }
    }

    public final int k(int i) {
        int[] iArr = this.i;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i);
            return 0;
        }
        if (i >= 0 && i < iArr.length) {
            return iArr[i];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i + " out of range for " + this);
        return 0;
    }

    @Override // defpackage.iz1
    public final void l(View view, int i) {
        kz1 kz1Var = this.s;
        if (i == 1) {
            kz1Var.f3040b = 0;
        } else {
            kz1Var.f3039a = 0;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            k90 k90Var = (k90) childAt.getLayoutParams();
            if (k90Var.a(i)) {
                h90 h90Var = k90Var.f2909a;
                if (h90Var != null) {
                    h90Var.r(this, childAt, view, i);
                }
                if (i != 0) {
                    if (i == 1) {
                        k90Var.o = false;
                    }
                } else {
                    k90Var.n = false;
                }
                k90Var.p = false;
            }
        }
        this.k = null;
    }

    @Override // defpackage.iz1
    public final void m(View view, int i, int i2, int[] iArr, int i3) {
        h90 h90Var;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                k90 k90Var = (k90) childAt.getLayoutParams();
                if (k90Var.a(i3) && (h90Var = k90Var.f2909a) != null) {
                    int[] iArr2 = this.e;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    h90Var.k(this, childAt, view, i, i2, iArr2, i3);
                    int[] iArr3 = this.e;
                    if (i > 0) {
                        min = Math.max(i4, iArr3[0]);
                    } else {
                        min = Math.min(i4, iArr3[0]);
                    }
                    i4 = min;
                    if (i2 > 0) {
                        min2 = Math.max(i5, iArr3[1]);
                    } else {
                        min2 = Math.min(i5, iArr3[1]);
                    }
                    i5 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            p(1);
        }
    }

    public final boolean o(View view, int i, int i2) {
        n62 n62Var = x;
        Rect a2 = a();
        h(view, a2);
        try {
            return a2.contains(i, i2);
        } finally {
            a2.setEmpty();
            n62Var.b(a2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u(false);
        if (this.m) {
            if (this.l == null) {
                this.l = new l90(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.l);
        }
        if (this.n == null) {
            WeakHashMap weakHashMap = ll3.f3151a;
            if (uk3.b(this)) {
                yk3.c(this);
            }
        }
        this.h = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u(false);
        if (this.m && this.l != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.l);
        }
        View view = this.k;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.h = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        if (this.o && this.p != null) {
            wq3 wq3Var = this.n;
            if (wq3Var != null) {
                i = wq3Var.e();
            } else {
                i = 0;
            }
            if (i > 0) {
                this.p.setBounds(0, 0, getWidth(), i);
                this.p.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            u(true);
        }
        boolean s = s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            u(true);
        }
        return s;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        h90 h90Var;
        WeakHashMap weakHashMap = ll3.f3151a;
        int d = vk3.d(this);
        ArrayList arrayList = this.f188a;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) arrayList.get(i5);
            if (view.getVisibility() != 8 && ((h90Var = ((k90) view.getLayoutParams()).f2909a) == null || !h90Var.h(this, view, d))) {
                q(view, d);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x0197, code lost:            if (r0.i(r32, r19, r25, r20, r26) == false) goto L82;     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r33, int r34) {
        /*
            Method dump skipped, instructions count: 529
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                k90 k90Var = (k90) childAt.getLayoutParams();
                if (k90Var.a(0)) {
                    h90 h90Var = k90Var.f2909a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        h90 h90Var;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                k90 k90Var = (k90) childAt.getLayoutParams();
                if (k90Var.a(0) && (h90Var = k90Var.f2909a) != null) {
                    z |= h90Var.j(view);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        m(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        f(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        i(view, view2, i, 0);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.f200a);
        SparseArray sparseArray = savedState.c;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            h90 h90Var = n(childAt).f2909a;
            if (id != -1 && h90Var != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                h90Var.o(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable p;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            h90 h90Var = ((k90) childAt.getLayoutParams()).f2909a;
            if (id != -1 && h90Var != null && (p = h90Var.p(childAt)) != null) {
                sparseArray.append(id, p);
            }
        }
        savedState.c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return g(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        l(view, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0012, code lost:            if (r3 != false) goto L8;     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r18.getActionMasked()
            android.view.View r3 = r0.j
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L15
            boolean r3 = r0.s(r1, r4)
            if (r3 == 0) goto L29
            goto L16
        L15:
            r3 = 0
        L16:
            android.view.View r6 = r0.j
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            k90 r6 = (defpackage.k90) r6
            h90 r6 = r6.f2909a
            if (r6 == 0) goto L29
            android.view.View r7 = r0.j
            boolean r6 = r6.s(r0, r7, r1)
            goto L2a
        L29:
            r6 = 0
        L2a:
            android.view.View r7 = r0.j
            r8 = 0
            if (r7 != 0) goto L35
            boolean r1 = super.onTouchEvent(r18)
            r6 = r6 | r1
            goto L48
        L35:
            if (r3 == 0) goto L48
            long r11 = android.os.SystemClock.uptimeMillis()
            r13 = 3
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r11
            android.view.MotionEvent r8 = android.view.MotionEvent.obtain(r9, r11, r13, r14, r15, r16)
            super.onTouchEvent(r8)
        L48:
            if (r8 == 0) goto L4d
            r8.recycle()
        L4d:
            if (r2 == r4) goto L52
            r1 = 3
            if (r2 != r1) goto L55
        L52:
            r0.u(r5)
        L55:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int i) {
        int i2;
        Rect rect;
        int i3;
        ArrayList arrayList;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int width;
        int i4;
        int i5;
        int i6;
        int height;
        int i7;
        int i8;
        int i9;
        int i10;
        k90 k90Var;
        ArrayList arrayList2;
        int i11;
        Rect rect2;
        int i12;
        View view;
        n62 n62Var;
        k90 k90Var2;
        int i13;
        boolean z5;
        h90 h90Var;
        WeakHashMap weakHashMap = ll3.f3151a;
        int d = vk3.d(this);
        ArrayList arrayList3 = this.f188a;
        int size = arrayList3.size();
        Rect a2 = a();
        Rect a3 = a();
        Rect a4 = a();
        int i14 = i;
        int i15 = 0;
        while (true) {
            n62 n62Var2 = x;
            if (i15 < size) {
                View view2 = (View) arrayList3.get(i15);
                k90 k90Var3 = (k90) view2.getLayoutParams();
                if (i14 == 0 && view2.getVisibility() == 8) {
                    arrayList = arrayList3;
                    i3 = size;
                    rect = a4;
                    i2 = i15;
                } else {
                    int i16 = 0;
                    while (i16 < i15) {
                        if (k90Var3.l == ((View) arrayList3.get(i16))) {
                            k90 k90Var4 = (k90) view2.getLayoutParams();
                            if (k90Var4.k != null) {
                                Rect a5 = a();
                                Rect a6 = a();
                                arrayList2 = arrayList3;
                                Rect a7 = a();
                                i10 = i16;
                                h(k90Var4.k, a5);
                                c(view2, a6, false);
                                int measuredWidth = view2.getMeasuredWidth();
                                i11 = size;
                                int measuredHeight = view2.getMeasuredHeight();
                                i12 = i15;
                                k90Var = k90Var3;
                                view = view2;
                                rect2 = a4;
                                n62Var = n62Var2;
                                j(d, a5, a7, k90Var4, measuredWidth, measuredHeight);
                                if (a7.left == a6.left && a7.top == a6.top) {
                                    k90Var2 = k90Var4;
                                    i13 = measuredWidth;
                                    z5 = false;
                                } else {
                                    k90Var2 = k90Var4;
                                    i13 = measuredWidth;
                                    z5 = true;
                                }
                                b(k90Var2, a7, i13, measuredHeight);
                                int i17 = a7.left - a6.left;
                                int i18 = a7.top - a6.top;
                                if (i17 != 0) {
                                    ll3.j(view, i17);
                                }
                                if (i18 != 0) {
                                    ll3.k(view, i18);
                                }
                                if (z5 && (h90Var = k90Var2.f2909a) != null) {
                                    h90Var.d(this, view, k90Var2.k);
                                }
                                a5.setEmpty();
                                n62Var.b(a5);
                                a6.setEmpty();
                                n62Var.b(a6);
                                a7.setEmpty();
                                n62Var.b(a7);
                                i16 = i10 + 1;
                                n62Var2 = n62Var;
                                view2 = view;
                                arrayList3 = arrayList2;
                                size = i11;
                                i15 = i12;
                                k90Var3 = k90Var;
                                a4 = rect2;
                            }
                        }
                        i10 = i16;
                        k90Var = k90Var3;
                        arrayList2 = arrayList3;
                        i11 = size;
                        rect2 = a4;
                        i12 = i15;
                        view = view2;
                        n62Var = n62Var2;
                        i16 = i10 + 1;
                        n62Var2 = n62Var;
                        view2 = view;
                        arrayList3 = arrayList2;
                        size = i11;
                        i15 = i12;
                        k90Var3 = k90Var;
                        a4 = rect2;
                    }
                    k90 k90Var5 = k90Var3;
                    ArrayList arrayList4 = arrayList3;
                    int i19 = size;
                    Rect rect3 = a4;
                    i2 = i15;
                    View view3 = view2;
                    m62 m62Var = n62Var2;
                    c(view3, a3, true);
                    if (k90Var5.g != 0 && !a3.isEmpty()) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(k90Var5.g, d);
                        int i20 = absoluteGravity & 112;
                        if (i20 != 48) {
                            if (i20 == 80) {
                                a2.bottom = Math.max(a2.bottom, getHeight() - a3.top);
                            }
                        } else {
                            a2.top = Math.max(a2.top, a3.bottom);
                        }
                        int i21 = absoluteGravity & 7;
                        if (i21 != 3) {
                            if (i21 == 5) {
                                a2.right = Math.max(a2.right, getWidth() - a3.left);
                            }
                        } else {
                            a2.left = Math.max(a2.left, a3.right);
                        }
                    }
                    if (k90Var5.h != 0 && view3.getVisibility() == 0) {
                        WeakHashMap weakHashMap2 = ll3.f3151a;
                        if (xk3.c(view3) && view3.getWidth() > 0 && view3.getHeight() > 0) {
                            k90 k90Var6 = (k90) view3.getLayoutParams();
                            h90 h90Var2 = k90Var6.f2909a;
                            Rect a8 = a();
                            Rect a9 = a();
                            a9.set(view3.getLeft(), view3.getTop(), view3.getRight(), view3.getBottom());
                            if (h90Var2 != null && h90Var2.a(view3)) {
                                if (!a9.contains(a8)) {
                                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + a8.toShortString() + " | Bounds:" + a9.toShortString());
                                }
                            } else {
                                a8.set(a9);
                            }
                            a9.setEmpty();
                            m62Var.b(a9);
                            if (a8.isEmpty()) {
                                a8.setEmpty();
                                m62Var.b(a8);
                            } else {
                                int absoluteGravity2 = Gravity.getAbsoluteGravity(k90Var6.h, d);
                                if ((absoluteGravity2 & 48) == 48 && (i8 = (a8.top - ((ViewGroup.MarginLayoutParams) k90Var6).topMargin) - k90Var6.j) < (i9 = a2.top)) {
                                    w(view3, i9 - i8);
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if ((absoluteGravity2 & 80) == 80 && (height = ((getHeight() - a8.bottom) - ((ViewGroup.MarginLayoutParams) k90Var6).bottomMargin) + k90Var6.j) < (i7 = a2.bottom)) {
                                    w(view3, height - i7);
                                    z2 = true;
                                }
                                if (!z2) {
                                    w(view3, 0);
                                }
                                if ((absoluteGravity2 & 3) == 3 && (i5 = (a8.left - ((ViewGroup.MarginLayoutParams) k90Var6).leftMargin) - k90Var6.i) < (i6 = a2.left)) {
                                    v(view3, i6 - i5);
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if ((absoluteGravity2 & 5) == 5 && (width = ((getWidth() - a8.right) - ((ViewGroup.MarginLayoutParams) k90Var6).rightMargin) + k90Var6.i) < (i4 = a2.right)) {
                                    v(view3, width - i4);
                                    z4 = true;
                                } else {
                                    z4 = z3;
                                }
                                if (!z4) {
                                    v(view3, 0);
                                }
                                a8.setEmpty();
                                m62Var.b(a8);
                            }
                        }
                    }
                    if (i != 2) {
                        rect = rect3;
                        rect.set(((k90) view3.getLayoutParams()).q);
                        if (rect.equals(a3)) {
                            arrayList = arrayList4;
                            i3 = i19;
                            i14 = i;
                        } else {
                            ((k90) view3.getLayoutParams()).q.set(a3);
                        }
                    } else {
                        rect = rect3;
                    }
                    int i22 = i2 + 1;
                    i3 = i19;
                    while (true) {
                        arrayList = arrayList4;
                        if (i22 >= i3) {
                            break;
                        }
                        View view4 = (View) arrayList.get(i22);
                        k90 k90Var7 = (k90) view4.getLayoutParams();
                        h90 h90Var3 = k90Var7.f2909a;
                        if (h90Var3 != null && h90Var3.b(view4, view3)) {
                            if (i == 0 && k90Var7.p) {
                                k90Var7.p = false;
                            } else {
                                if (i != 2) {
                                    z = h90Var3.d(this, view4, view3);
                                } else {
                                    h90Var3.e(this, view3);
                                    z = true;
                                }
                                if (i == 1) {
                                    k90Var7.p = z;
                                }
                            }
                        }
                        i22++;
                        arrayList4 = arrayList;
                    }
                    i14 = i;
                }
                i15 = i2 + 1;
                a4 = rect;
                size = i3;
                arrayList3 = arrayList;
            } else {
                Rect rect4 = a4;
                a2.setEmpty();
                n62Var2.b(a2);
                a3.setEmpty();
                n62Var2.b(a3);
                rect4.setEmpty();
                n62Var2.b(rect4);
                return;
            }
        }
    }

    public final void q(View view, int i) {
        boolean z;
        Rect a2;
        Rect a3;
        k90 k90Var = (k90) view.getLayoutParams();
        View view2 = k90Var.k;
        int i2 = 0;
        if (view2 == null && k90Var.f != -1) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            n62 n62Var = x;
            if (view2 != null) {
                a2 = a();
                a3 = a();
                try {
                    h(view2, a2);
                    k90 k90Var2 = (k90) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    j(i, a2, a3, k90Var2, measuredWidth, measuredHeight);
                    b(k90Var2, a3, measuredWidth, measuredHeight);
                    view.layout(a3.left, a3.top, a3.right, a3.bottom);
                    return;
                } finally {
                    a2.setEmpty();
                    n62Var.b(a2);
                    a3.setEmpty();
                    n62Var.b(a3);
                }
            }
            int i3 = k90Var.e;
            if (i3 >= 0) {
                k90 k90Var3 = (k90) view.getLayoutParams();
                int i4 = k90Var3.c;
                if (i4 == 0) {
                    i4 = 8388661;
                }
                int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
                int i5 = absoluteGravity & 7;
                int i6 = absoluteGravity & 112;
                int width = getWidth();
                int height = getHeight();
                int measuredWidth2 = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                if (i == 1) {
                    i3 = width - i3;
                }
                int k = k(i3) - measuredWidth2;
                if (i5 != 1) {
                    if (i5 == 5) {
                        k += measuredWidth2;
                    }
                } else {
                    k += measuredWidth2 / 2;
                }
                if (i6 != 16) {
                    if (i6 == 80) {
                        i2 = measuredHeight2 + 0;
                    }
                } else {
                    i2 = 0 + (measuredHeight2 / 2);
                }
                int max = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) k90Var3).leftMargin, Math.min(k, ((width - getPaddingRight()) - measuredWidth2) - ((ViewGroup.MarginLayoutParams) k90Var3).rightMargin));
                int max2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) k90Var3).topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ((ViewGroup.MarginLayoutParams) k90Var3).bottomMargin));
                view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
                return;
            }
            k90 k90Var4 = (k90) view.getLayoutParams();
            a2 = a();
            a2.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) k90Var4).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) k90Var4).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) k90Var4).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) k90Var4).bottomMargin);
            if (this.n != null) {
                WeakHashMap weakHashMap = ll3.f3151a;
                if (uk3.b(this) && !uk3.b(view)) {
                    a2.left = this.n.c() + a2.left;
                    a2.top = this.n.e() + a2.top;
                    a2.right -= this.n.d();
                    a2.bottom -= this.n.b();
                }
            }
            a3 = a();
            int i7 = k90Var4.c;
            if ((i7 & 7) == 0) {
                i7 |= 8388611;
            }
            if ((i7 & 112) == 0) {
                i7 |= 48;
            }
            a61.b(i7, view.getMeasuredWidth(), view.getMeasuredHeight(), a2, a3, i);
            view.layout(a3.left, a3.top, a3.right, a3.bottom);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public final void r(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        h90 h90Var = ((k90) view.getLayoutParams()).f2909a;
        if (h90Var != null && h90Var.n(this, view, rect, z)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (z && !this.g) {
            u(false);
            this.g = true;
        }
    }

    public final boolean s(MotionEvent motionEvent, int i) {
        boolean z;
        int i2;
        int actionMasked = motionEvent.getActionMasked();
        ArrayList arrayList = this.c;
        arrayList.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            if (isChildrenDrawingOrderEnabled) {
                i2 = getChildDrawingOrder(childCount, i3);
            } else {
                i2 = i3;
            }
            arrayList.add(getChildAt(i2));
        }
        m90 m90Var = w;
        if (m90Var != null) {
            Collections.sort(arrayList, m90Var);
        }
        int size = arrayList.size();
        MotionEvent motionEvent2 = null;
        boolean z2 = false;
        boolean z3 = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) arrayList.get(i4);
            k90 k90Var = (k90) view.getLayoutParams();
            h90 h90Var = k90Var.f2909a;
            if ((z2 || z3) && actionMasked != 0) {
                if (h90Var != null) {
                    if (motionEvent2 == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent2 = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    if (i != 0) {
                        if (i == 1) {
                            h90Var.s(this, view, motionEvent2);
                        }
                    } else {
                        h90Var.g(this, view, motionEvent2);
                    }
                }
            } else {
                if (!z2 && h90Var != null) {
                    if (i != 0) {
                        if (i == 1) {
                            z2 = h90Var.s(this, view, motionEvent);
                        }
                    } else {
                        z2 = h90Var.g(this, view, motionEvent);
                    }
                    if (z2) {
                        this.j = view;
                    }
                }
                if (k90Var.f2909a == null) {
                    k90Var.m = false;
                }
                boolean z4 = k90Var.m;
                if (z4) {
                    z = true;
                } else {
                    z = z4 | false;
                    k90Var.m = z;
                }
                if (z && !z4) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z && !z3) {
                    break;
                }
            }
        }
        arrayList.clear();
        return z2;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        x();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.q = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        boolean z;
        Drawable drawable2 = this.p;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.p = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.p.setState(getDrawableState());
                }
                Drawable drawable4 = this.p;
                WeakHashMap weakHashMap = ll3.f3151a;
                t9.o0(drawable4, vk3.d(this));
                Drawable drawable5 = this.p;
                if (getVisibility() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                drawable5.setVisible(z, false);
                this.p.setCallback(this);
            }
            WeakHashMap weakHashMap2 = ll3.f3151a;
            uk3.k(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        Drawable drawable;
        if (i != 0) {
            drawable = x80.getDrawable(getContext(), i);
        } else {
            drawable = null;
        }
        setStatusBarBackground(drawable);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        boolean z;
        super.setVisibility(i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        Drawable drawable = this.p;
        if (drawable != null && drawable.isVisible() != z) {
            this.p.setVisible(z, false);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:83:0x007a, code lost:            if (r9 != false) goto L56;     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0180 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void t() {
        /*
            Method dump skipped, instructions count: 483
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.t():void");
    }

    public final void u(boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            h90 h90Var = ((k90) childAt.getLayoutParams()).f2909a;
            if (h90Var != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z) {
                    h90Var.g(this, childAt, obtain);
                } else {
                    h90Var.s(this, childAt, obtain);
                }
                obtain.recycle();
            }
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            ((k90) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.j = null;
        this.g = false;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.p) {
            return false;
        }
        return true;
    }

    public final void x() {
        WeakHashMap weakHashMap = ll3.f3151a;
        if (uk3.b(this)) {
            if (this.r == null) {
                this.r = new ja1(this, 5);
            }
            al3.u(this, this.r);
            setSystemUiVisibility(1280);
            return;
        }
        al3.u(this, null);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof k90) {
            return new k90((k90) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new k90((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new k90(layoutParams);
    }
}
