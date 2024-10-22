package androidx.recyclerview.widget;

import android.R;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import defpackage.ag2;
import defpackage.al3;
import defpackage.aw0;
import defpackage.bi2;
import defpackage.c51;
import defpackage.cl3;
import defpackage.cm3;
import defpackage.dh2;
import defpackage.eh2;
import defpackage.ew3;
import defpackage.fh2;
import defpackage.ge2;
import defpackage.gz1;
import defpackage.hx2;
import defpackage.hz1;
import defpackage.ih2;
import defpackage.jh2;
import defpackage.k62;
import defpackage.kh2;
import defpackage.ko1;
import defpackage.l62;
import defpackage.lh2;
import defpackage.ll3;
import defpackage.m2;
import defpackage.mh2;
import defpackage.ml3;
import defpackage.nk1;
import defpackage.ol3;
import defpackage.p10;
import defpackage.p71;
import defpackage.pa3;
import defpackage.ph2;
import defpackage.pz;
import defpackage.qa3;
import defpackage.qe2;
import defpackage.qh2;
import defpackage.rh2;
import defpackage.sh2;
import defpackage.t9;
import defpackage.tf3;
import defpackage.th2;
import defpackage.uh2;
import defpackage.uk3;
import defpackage.uu2;
import defpackage.w7;
import defpackage.wh2;
import defpackage.x7;
import defpackage.xh2;
import defpackage.yh2;
import defpackage.zh0;
import defpackage.zh2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public class RecyclerView extends ViewGroup implements gz1 {
    public static boolean L0 = false;
    public static boolean M0 = false;
    public static final int[] N0 = {R.attr.nestedScrollingEnabled};
    public static final float O0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final boolean P0;
    public static final boolean Q0;
    public static final boolean R0;
    public static final Class[] S0;
    public static final eh2 T0;
    public static final xh2 U0;
    public boolean A;
    public final int[] A0;
    public final AccessibilityManager B;
    public hz1 B0;
    public boolean C;
    public final int[] C0;
    public boolean D;
    public final int[] D0;
    public int E;
    public final int[] E0;
    public int F;
    public final ArrayList F0;
    public jh2 G;
    public final dh2 G0;
    public EdgeEffect H;
    public boolean H0;
    public EdgeEffect I;
    public int I0;
    public EdgeEffect J;
    public int J0;
    public EdgeEffect K;
    public final b K0;
    public lh2 L;
    public int M;
    public int N;
    public VelocityTracker O;
    public int P;
    public int Q;
    public int R;

    /* renamed from: a */
    public final float f267a;

    /* renamed from: b */
    public final f f268b;
    public final e c;
    public SavedState d;
    public x7 e;
    public pz f;
    public final j g;
    public boolean h;
    public int h0;
    public final dh2 i;
    public int i0;
    public final Rect j;
    public ph2 j0;
    public final Rect k;
    public final int k0;
    public final RectF l;
    public final int l0;
    public fh2 m;
    public final float m0;
    public c n;
    public final float n0;
    public final ArrayList o;
    public boolean o0;
    public final ArrayList p;
    public final zh2 p0;
    public final ArrayList q;
    public c51 q0;
    public qh2 r;
    public final p10 r0;
    public boolean s;
    public final wh2 s0;
    public boolean t;
    public rh2 t0;
    public boolean u;
    public ArrayList u0;
    public int v;
    public boolean v0;
    public boolean w;
    public boolean w0;
    public boolean x;
    public final b x0;
    public boolean y;
    public boolean y0;
    public int z;
    public bi2 z0;

    /* loaded from: classes.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new g();
        public Parcelable c;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.c = parcel.readParcelable(classLoader == null ? c.class.getClassLoader() : classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.f200a, i);
            parcel.writeParcelable(this.c, 0);
        }
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            z = true;
        } else {
            z = false;
        }
        P0 = z;
        Q0 = true;
        R0 = true;
        Class cls = Integer.TYPE;
        S0 = new Class[]{Context.class, AttributeSet.class, cls, cls};
        T0 = new eh2();
        U0 = new xh2();
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ge2.recyclerViewStyle);
    }

    public static RecyclerView G(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            RecyclerView G = G(viewGroup.getChildAt(i));
            if (G != null) {
                return G;
            }
        }
        return null;
    }

    public static int K(View view) {
        h M = M(view);
        if (M != null) {
            return M.d();
        }
        return -1;
    }

    public static h M(View view) {
        if (view == null) {
            return null;
        }
        return ((d) view.getLayoutParams()).f276a;
    }

    private int a0(float f, int i) {
        float width = f / getWidth();
        float height = i / getHeight();
        EdgeEffect edgeEffect = this.I;
        float f2 = 0.0f;
        if (edgeEffect != null && t9.H(edgeEffect) != 0.0f) {
            if (canScrollVertically(-1)) {
                this.I.onRelease();
            } else {
                float f3 = -t9.X(this.I, -height, width);
                if (t9.H(this.I) == 0.0f) {
                    this.I.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.K;
            if (edgeEffect2 != null && t9.H(edgeEffect2) != 0.0f) {
                if (canScrollVertically(1)) {
                    this.K.onRelease();
                } else {
                    float X = t9.X(this.K, height, 1.0f - width);
                    if (t9.H(this.K) == 0.0f) {
                        this.K.onRelease();
                    }
                    f2 = X;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getHeight());
    }

    private hz1 getScrollingChildHelper() {
        if (this.B0 == null) {
            this.B0 = new hz1(this);
        }
        return this.B0;
    }

    public static void l(h hVar) {
        WeakReference weakReference = hVar.f282b;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view == hVar.f281a) {
                    return;
                }
                Object parent = view.getParent();
                if (parent instanceof View) {
                    view = (View) parent;
                } else {
                    view = null;
                }
            }
            hVar.f282b = null;
        }
    }

    public static int o(int i, EdgeEffect edgeEffect, EdgeEffect edgeEffect2, int i2) {
        if (i > 0 && edgeEffect != null && t9.H(edgeEffect) != 0.0f) {
            int round = Math.round(t9.X(edgeEffect, ((-i) * 4.0f) / i2, 0.5f) * ((-i2) / 4.0f));
            if (round != i) {
                edgeEffect.finish();
            }
            return i - round;
        }
        if (i < 0 && edgeEffect2 != null && t9.H(edgeEffect2) != 0.0f) {
            float f = i2;
            int round2 = Math.round(t9.X(edgeEffect2, (i * 4.0f) / f, 0.5f) * (f / 4.0f));
            if (round2 != i) {
                edgeEffect2.finish();
            }
            return i - round2;
        }
        return i;
    }

    public static void setDebugAssertionsEnabled(boolean z) {
        L0 = z;
    }

    public static void setVerboseLoggingEnabled(boolean z) {
        M0 = z;
    }

    public final void A() {
        if (this.I != null) {
            return;
        }
        ((xh2) this.G).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.I = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final String B() {
        return " " + super.toString() + ", adapter:" + this.m + ", layout:" + this.n + ", context:" + getContext();
    }

    public final void C(wh2 wh2Var) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.p0.c;
            overScroller.getFinalX();
            overScroller.getCurrX();
            wh2Var.getClass();
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        wh2Var.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:?, code lost:            return r3;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.view.View D(android.view.View r3) {
        /*
            r2 = this;
            android.view.ViewParent r0 = r3.getParent()
        L4:
            if (r0 == 0) goto L14
            if (r0 == r2) goto L14
            boolean r1 = r0 instanceof android.view.View
            if (r1 == 0) goto L14
            r3 = r0
            android.view.View r3 = (android.view.View) r3
            android.view.ViewParent r0 = r3.getParent()
            goto L4
        L14:
            if (r0 != r2) goto L17
            goto L18
        L17:
            r3 = 0
        L18:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.D(android.view.View):android.view.View");
    }

    public final boolean E(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            qh2 qh2Var = (qh2) arrayList.get(i);
            if (qh2Var.b(this, motionEvent) && action != 3) {
                this.r = qh2Var;
                return true;
            }
        }
        return false;
    }

    public final void F(int[] iArr) {
        int e = this.f.e();
        if (e == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i = Integer.MAX_VALUE;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < e; i3++) {
            h M = M(this.f.d(i3));
            if (!M.z()) {
                int f = M.f();
                if (f < i) {
                    i = f;
                }
                if (f > i2) {
                    i2 = f;
                }
            }
        }
        iArr[0] = i;
        iArr[1] = i2;
    }

    public final h H(int i) {
        h hVar = null;
        if (this.C) {
            return null;
        }
        int h = this.f.h();
        for (int i2 = 0; i2 < h; i2++) {
            h M = M(this.f.g(i2));
            if (M != null && !M.o() && I(M) == i) {
                if (this.f.j(M.f281a)) {
                    hVar = M;
                } else {
                    return M;
                }
            }
        }
        return hVar;
    }

    public final int I(h hVar) {
        boolean z;
        if ((hVar.j & 524) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && hVar.l()) {
            x7 x7Var = this.e;
            int i = hVar.c;
            ArrayList arrayList = x7Var.f5125b;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                w7 w7Var = (w7) arrayList.get(i2);
                int i3 = w7Var.f4952a;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 8) {
                            int i4 = w7Var.f4953b;
                            if (i4 == i) {
                                i = w7Var.d;
                            } else {
                                if (i4 < i) {
                                    i--;
                                }
                                if (w7Var.d <= i) {
                                    i++;
                                }
                            }
                        }
                    } else {
                        int i5 = w7Var.f4953b;
                        if (i5 <= i) {
                            int i6 = w7Var.d;
                            if (i5 + i6 <= i) {
                                i -= i6;
                            }
                        } else {
                            continue;
                        }
                    }
                } else if (w7Var.f4953b <= i) {
                    i += w7Var.d;
                }
            }
            return i;
        }
        return -1;
    }

    public final long J(h hVar) {
        if (this.m.f2092b) {
            return hVar.e;
        }
        return hVar.c;
    }

    public final h L(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent != this) {
            throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
        }
        return M(view);
    }

    public final Rect N(View view) {
        d dVar = (d) view.getLayoutParams();
        boolean z = dVar.c;
        Rect rect = dVar.f277b;
        if (!z) {
            return rect;
        }
        wh2 wh2Var = this.s0;
        if (wh2Var.g && (dVar.b() || dVar.f276a.m())) {
            return rect;
        }
        rect.set(0, 0, 0, 0);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Rect rect2 = this.j;
            rect2.set(0, 0, 0, 0);
            ((mh2) arrayList.get(i)).c(rect2, view, this, wh2Var);
            rect.left += rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        dVar.c = false;
        return rect;
    }

    public final boolean O() {
        if (this.E > 0) {
            return true;
        }
        return false;
    }

    public final void P(int i) {
        if (this.n == null) {
            return;
        }
        setScrollState(2);
        this.n.n0(i);
        awakenScrollBars();
    }

    public final void Q() {
        int h = this.f.h();
        for (int i = 0; i < h; i++) {
            ((d) this.f.g(i).getLayoutParams()).c = true;
        }
        ArrayList arrayList = this.c.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            d dVar = (d) ((h) arrayList.get(i2)).f281a.getLayoutParams();
            if (dVar != null) {
                dVar.c = true;
            }
        }
    }

    public final void R(int i, int i2, boolean z) {
        int i3 = i + i2;
        int h = this.f.h();
        for (int i4 = 0; i4 < h; i4++) {
            h M = M(this.f.g(i4));
            if (M != null && !M.z()) {
                int i5 = M.c;
                wh2 wh2Var = this.s0;
                if (i5 >= i3) {
                    if (M0) {
                        M.toString();
                    }
                    M.v(-i2, z);
                    wh2Var.f = true;
                } else if (i5 >= i) {
                    if (M0) {
                        M.toString();
                    }
                    M.c(8);
                    M.v(-i2, z);
                    M.c = i - 1;
                    wh2Var.f = true;
                }
            }
        }
        e eVar = this.c;
        ArrayList arrayList = eVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                h hVar = (h) arrayList.get(size);
                if (hVar != null) {
                    int i6 = hVar.c;
                    if (i6 >= i3) {
                        if (M0) {
                            hVar.toString();
                        }
                        hVar.v(-i2, z);
                    } else if (i6 >= i) {
                        hVar.c(8);
                        eVar.h(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public final void S() {
        this.E++;
    }

    public final void T(boolean z) {
        int i;
        boolean z2 = true;
        int i2 = this.E - 1;
        this.E = i2;
        if (i2 < 1) {
            if (L0 && i2 < 0) {
                throw new IllegalStateException(hx2.l(this, new StringBuilder("layout or scroll counter cannot go below zero.Some calls are not matching")));
            }
            this.E = 0;
            if (z) {
                int i3 = this.z;
                this.z = 0;
                if (i3 != 0) {
                    AccessibilityManager accessibilityManager = this.B;
                    if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
                        z2 = false;
                    }
                    if (z2) {
                        AccessibilityEvent obtain = AccessibilityEvent.obtain();
                        obtain.setEventType(2048);
                        m2.b(obtain, i3);
                        sendAccessibilityEventUnchecked(obtain);
                    }
                }
                ArrayList arrayList = this.F0;
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    h hVar = (h) arrayList.get(size);
                    if (hVar.f281a.getParent() == this && !hVar.z() && (i = hVar.q) != -1) {
                        WeakHashMap weakHashMap = ll3.f3151a;
                        uk3.s(hVar.f281a, i);
                        hVar.q = -1;
                    }
                }
                arrayList.clear();
            }
        }
    }

    public final void U(MotionEvent motionEvent) {
        int i;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.N) {
            if (actionIndex == 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.N = motionEvent.getPointerId(i);
            int x = (int) (motionEvent.getX(i) + 0.5f);
            this.R = x;
            this.P = x;
            int y = (int) (motionEvent.getY(i) + 0.5f);
            this.h0 = y;
            this.Q = y;
        }
    }

    public final void V() {
        if (!this.y0 && this.s) {
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.m(this, this.G0);
            this.y0 = true;
        }
    }

    public final void W() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (this.C) {
            x7 x7Var = this.e;
            x7Var.l(x7Var.f5125b);
            x7Var.l(x7Var.c);
            x7Var.f = 0;
            if (this.D) {
                this.n.W();
            }
        }
        if (this.L != null && this.n.z0()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.e.j();
        } else {
            this.e.c();
        }
        if (!this.v0 && !this.w0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (this.u && this.L != null && (((z5 = this.C) || z2 || this.n.f) && (!z5 || this.m.f2092b))) {
            z3 = true;
        } else {
            z3 = false;
        }
        wh2 wh2Var = this.s0;
        wh2Var.j = z3;
        if (z3 && z2 && !this.C) {
            if (this.L != null && this.n.z0()) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (z4) {
                z6 = true;
            }
        }
        wh2Var.k = z6;
    }

    public final void X(boolean z) {
        this.D = z | this.D;
        this.C = true;
        int h = this.f.h();
        for (int i = 0; i < h; i++) {
            h M = M(this.f.g(i));
            if (M != null && !M.z()) {
                M.c(6);
            }
        }
        Q();
        e eVar = this.c;
        ArrayList arrayList = eVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = (h) arrayList.get(i2);
            if (hVar != null) {
                hVar.c(6);
                hVar.b(null);
            }
        }
        fh2 fh2Var = eVar.h.m;
        if (fh2Var == null || !fh2Var.f2092b) {
            eVar.g();
        }
    }

    public final void Y(h hVar, kh2 kh2Var) {
        boolean z = false;
        int i = (hVar.j & (-8193)) | 0;
        hVar.j = i;
        boolean z2 = this.s0.h;
        j jVar = this.g;
        if (z2) {
            if ((i & 2) != 0) {
                z = true;
            }
            if (z && !hVar.o() && !hVar.z()) {
                ((ko1) jVar.c).f(J(hVar), hVar);
            }
        }
        jVar.d(hVar, kh2Var);
    }

    public final int Z(float f, int i) {
        float height = f / getHeight();
        float width = i / getWidth();
        EdgeEffect edgeEffect = this.H;
        float f2 = 0.0f;
        if (edgeEffect != null && t9.H(edgeEffect) != 0.0f) {
            if (canScrollHorizontally(-1)) {
                this.H.onRelease();
            } else {
                float f3 = -t9.X(this.H, -width, 1.0f - height);
                if (t9.H(this.H) == 0.0f) {
                    this.H.onRelease();
                }
                f2 = f3;
            }
            invalidate();
        } else {
            EdgeEffect edgeEffect2 = this.J;
            if (edgeEffect2 != null && t9.H(edgeEffect2) != 0.0f) {
                if (canScrollHorizontally(1)) {
                    this.J.onRelease();
                } else {
                    float X = t9.X(this.J, width, height);
                    if (t9.H(this.J) == 0.0f) {
                        this.J.onRelease();
                    }
                    f2 = X;
                }
                invalidate();
            }
        }
        return Math.round(f2 * getWidth());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void addFocusables(ArrayList arrayList, int i, int i2) {
        c cVar = this.n;
        if (cVar != null) {
            cVar.getClass();
        }
        super.addFocusables(arrayList, i, i2);
    }

    public final void b0(View view, View view2) {
        View view3;
        boolean z;
        if (view2 != null) {
            view3 = view2;
        } else {
            view3 = view;
        }
        int width = view3.getWidth();
        int height = view3.getHeight();
        Rect rect = this.j;
        rect.set(0, 0, width, height);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof d) {
            d dVar = (d) layoutParams;
            if (!dVar.c) {
                int i = rect.left;
                Rect rect2 = dVar.f277b;
                rect.left = i - rect2.left;
                rect.right += rect2.right;
                rect.top -= rect2.top;
                rect.bottom += rect2.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, rect);
            offsetRectIntoDescendantCoords(view, rect);
        }
        c cVar = this.n;
        Rect rect3 = this.j;
        boolean z2 = !this.u;
        if (view2 == null) {
            z = true;
        } else {
            z = false;
        }
        cVar.k0(this, view, rect3, z2, z);
    }

    public final void c0() {
        VelocityTracker velocityTracker = this.O;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        boolean z = false;
        k0(0);
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z = this.H.isFinished();
        }
        EdgeEffect edgeEffect2 = this.I;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z |= this.I.isFinished();
        }
        EdgeEffect edgeEffect3 = this.J;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z |= this.J.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z |= this.K.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if ((layoutParams instanceof d) && this.n.f((d) layoutParams)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final int computeHorizontalScrollExtent() {
        c cVar = this.n;
        if (cVar == null || !cVar.d()) {
            return 0;
        }
        return this.n.j(this.s0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollOffset() {
        c cVar = this.n;
        if (cVar == null || !cVar.d()) {
            return 0;
        }
        return this.n.k(this.s0);
    }

    @Override // android.view.View
    public final int computeHorizontalScrollRange() {
        c cVar = this.n;
        if (cVar == null || !cVar.d()) {
            return 0;
        }
        return this.n.l(this.s0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollExtent() {
        c cVar = this.n;
        if (cVar == null || !cVar.e()) {
            return 0;
        }
        return this.n.m(this.s0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollOffset() {
        c cVar = this.n;
        if (cVar == null || !cVar.e()) {
            return 0;
        }
        return this.n.n(this.s0);
    }

    @Override // android.view.View
    public final int computeVerticalScrollRange() {
        c cVar = this.n;
        if (cVar == null || !cVar.e()) {
            return 0;
        }
        return this.n.o(this.s0);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean d0(int r19, int r20, android.view.MotionEvent r21, int r22) {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.d0(int, int, android.view.MotionEvent, int):boolean");
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return getScrollingChildHelper().a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return getScrollingChildHelper().b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return getScrollingChildHelper().e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchSaveInstanceState(SparseArray sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        int i2;
        super.draw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        boolean z4 = false;
        for (int i3 = 0; i3 < size; i3++) {
            ((mh2) arrayList.get(i3)).e(canvas, this);
        }
        EdgeEffect edgeEffect = this.H;
        boolean z5 = true;
        if (edgeEffect != null && !edgeEffect.isFinished()) {
            int save = canvas.save();
            if (this.h) {
                i2 = getPaddingBottom();
            } else {
                i2 = 0;
            }
            canvas.rotate(270.0f);
            canvas.translate((-getHeight()) + i2, 0.0f);
            EdgeEffect edgeEffect2 = this.H;
            if (edgeEffect2 != null && edgeEffect2.draw(canvas)) {
                z = true;
            } else {
                z = false;
            }
            canvas.restoreToCount(save);
        } else {
            z = false;
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.h) {
                canvas.translate(getPaddingLeft(), getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.I;
            if (edgeEffect4 != null && edgeEffect4.draw(canvas)) {
                z3 = true;
            } else {
                z3 = false;
            }
            z |= z3;
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.J;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            if (this.h) {
                i = getPaddingTop();
            } else {
                i = 0;
            }
            canvas.rotate(90.0f);
            canvas.translate(i, -width);
            EdgeEffect edgeEffect6 = this.J;
            if (edgeEffect6 != null && edgeEffect6.draw(canvas)) {
                z2 = true;
            } else {
                z2 = false;
            }
            z |= z2;
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.K;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.h) {
                canvas.translate(getPaddingRight() + (-getWidth()), getPaddingBottom() + (-getHeight()));
            } else {
                canvas.translate(-getWidth(), -getHeight());
            }
            EdgeEffect edgeEffect8 = this.K;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z4 = true;
            }
            z |= z4;
            canvas.restoreToCount(save4);
        }
        if (z || this.L == null || arrayList.size() <= 0 || !this.L.f()) {
            z5 = z;
        }
        if (z5) {
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.k(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return super.drawChild(canvas, view, j);
    }

    public final void e0(int i, int i2, int[] iArr) {
        int i3;
        int i4;
        h hVar;
        i0();
        S();
        int i5 = qa3.f3976a;
        pa3.a("RV Scroll");
        wh2 wh2Var = this.s0;
        C(wh2Var);
        e eVar = this.c;
        if (i != 0) {
            i3 = this.n.m0(i, eVar, wh2Var);
        } else {
            i3 = 0;
        }
        if (i2 != 0) {
            i4 = this.n.o0(i2, eVar, wh2Var);
        } else {
            i4 = 0;
        }
        pa3.b();
        int e = this.f.e();
        for (int i6 = 0; i6 < e; i6++) {
            View d = this.f.d(i6);
            h L = L(d);
            if (L != null && (hVar = L.i) != null) {
                int left = d.getLeft();
                int top = d.getTop();
                View view = hVar.f281a;
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
        T(true);
        j0(false);
        if (iArr != null) {
            iArr[0] = i3;
            iArr[1] = i4;
        }
    }

    public final void f0(int i) {
        if (this.x) {
            return;
        }
        l0();
        c cVar = this.n;
        if (cVar == null) {
            Log.e("RecyclerView", "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else {
            cVar.n0(i);
            awakenScrollBars();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x018a, code lost:            if ((r3 * r1) >= 0) goto L278;     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x015b, code lost:            if (r4 > 0) goto L277;     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0172, code lost:            if (r3 > 0) goto L277;     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0175, code lost:            if (r4 < 0) goto L277;     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0178, code lost:            if (r3 < 0) goto L277;     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0181, code lost:            if ((r3 * r1) <= 0) goto L278;     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.view.View focusSearch(android.view.View r14, int r15) {
        /*
            Method dump skipped, instructions count: 407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.focusSearch(android.view.View, int):android.view.View");
    }

    public final boolean g0(EdgeEffect edgeEffect, int i, int i2) {
        if (i > 0) {
            return true;
        }
        float H = t9.H(edgeEffect) * i2;
        float abs = Math.abs(-i) * 0.35f;
        float f = this.f267a * 0.015f;
        double log = Math.log(abs / f);
        double d = O0;
        if (((float) (Math.exp((d / (d - 1.0d)) * log) * f)) < H) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        c cVar = this.n;
        if (cVar != null) {
            return cVar.r();
        }
        throw new IllegalStateException(hx2.l(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        c cVar = this.n;
        if (cVar != null) {
            return cVar.s(getContext(), attributeSet);
        }
        throw new IllegalStateException(hx2.l(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public fh2 getAdapter() {
        return this.m;
    }

    @Override // android.view.View
    public int getBaseline() {
        c cVar = this.n;
        if (cVar != null) {
            cVar.getClass();
            return -1;
        }
        return super.getBaseline();
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        return super.getChildDrawingOrder(i, i2);
    }

    @Override // android.view.ViewGroup
    public boolean getClipToPadding() {
        return this.h;
    }

    public bi2 getCompatAccessibilityDelegate() {
        return this.z0;
    }

    public jh2 getEdgeEffectFactory() {
        return this.G;
    }

    public lh2 getItemAnimator() {
        return this.L;
    }

    public int getItemDecorationCount() {
        return this.p.size();
    }

    public c getLayoutManager() {
        return this.n;
    }

    public int getMaxFlingVelocity() {
        return this.l0;
    }

    public int getMinFlingVelocity() {
        return this.k0;
    }

    public long getNanoTime() {
        if (R0) {
            return System.nanoTime();
        }
        return 0L;
    }

    public ph2 getOnFlingListener() {
        return this.j0;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.o0;
    }

    public th2 getRecycledViewPool() {
        return this.c.c();
    }

    public int getScrollState() {
        return this.M;
    }

    public final void h(h hVar) {
        boolean z;
        View view = hVar.f281a;
        if (view.getParent() == this) {
            z = true;
        } else {
            z = false;
        }
        this.c.m(L(view));
        if (hVar.t()) {
            this.f.b(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!z) {
            this.f.a(view, true, -1);
            return;
        }
        pz pzVar = this.f;
        int indexOfChild = pzVar.f3942a.f273a.indexOfChild(view);
        if (indexOfChild >= 0) {
            pzVar.f3943b.h(indexOfChild);
            pzVar.i(view);
        } else {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    public final void h0(int i, int i2, boolean z) {
        c cVar = this.n;
        if (cVar == null) {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        int i3 = 0;
        if (!cVar.d()) {
            i = 0;
        }
        if (!this.n.e()) {
            i2 = 0;
        }
        if (i != 0 || i2 != 0) {
            if (z) {
                if (i != 0) {
                    i3 = 1;
                }
                if (i2 != 0) {
                    i3 |= 2;
                }
                getScrollingChildHelper().h(i3, 1);
            }
            this.p0.c(i, i2, Integer.MIN_VALUE, null);
        }
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public final void i(mh2 mh2Var) {
        c cVar = this.n;
        if (cVar != null) {
            cVar.c("Cannot add item decoration during a scroll  or layout");
        }
        ArrayList arrayList = this.p;
        if (arrayList.isEmpty()) {
            setWillNotDraw(false);
        }
        arrayList.add(mh2Var);
        Q();
        requestLayout();
    }

    public final void i0() {
        int i = this.v + 1;
        this.v = i;
        if (i == 1 && !this.x) {
            this.w = false;
        }
    }

    @Override // android.view.View
    public final boolean isAttachedToWindow() {
        return this.s;
    }

    @Override // android.view.ViewGroup
    public final boolean isLayoutSuppressed() {
        return this.x;
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public final void j(rh2 rh2Var) {
        if (this.u0 == null) {
            this.u0 = new ArrayList();
        }
        this.u0.add(rh2Var);
    }

    public final void j0(boolean z) {
        if (this.v < 1) {
            if (!L0) {
                this.v = 1;
            } else {
                throw new IllegalStateException(hx2.l(this, new StringBuilder("stopInterceptRequestLayout was called more times than startInterceptRequestLayout.")));
            }
        }
        if (!z && !this.x) {
            this.w = false;
        }
        if (this.v == 1) {
            if (z && this.w && !this.x && this.n != null && this.m != null) {
                r();
            }
            if (!this.x) {
                this.w = false;
            }
        }
        this.v--;
    }

    public final void k(String str) {
        if (O()) {
            if (str == null) {
                throw new IllegalStateException(hx2.l(this, new StringBuilder("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        }
        if (this.F > 0) {
            new IllegalStateException(hx2.l(this, new StringBuilder("")));
        }
    }

    public final void k0(int i) {
        getScrollingChildHelper().i(i);
    }

    public final void l0() {
        nk1 nk1Var;
        setScrollState(0);
        zh2 zh2Var = this.p0;
        zh2Var.g.removeCallbacks(zh2Var);
        zh2Var.c.abortAnimation();
        c cVar = this.n;
        if (cVar != null && (nk1Var = cVar.e) != null) {
            nk1Var.i();
        }
    }

    public final void m() {
        int h = this.f.h();
        for (int i = 0; i < h; i++) {
            h M = M(this.f.g(i));
            if (!M.z()) {
                M.d = -1;
                M.g = -1;
            }
        }
        e eVar = this.c;
        ArrayList arrayList = eVar.c;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            h hVar = (h) arrayList.get(i2);
            hVar.d = -1;
            hVar.g = -1;
        }
        ArrayList arrayList2 = eVar.f278a;
        int size2 = arrayList2.size();
        for (int i3 = 0; i3 < size2; i3++) {
            h hVar2 = (h) arrayList2.get(i3);
            hVar2.d = -1;
            hVar2.g = -1;
        }
        ArrayList arrayList3 = eVar.f279b;
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            for (int i4 = 0; i4 < size3; i4++) {
                h hVar3 = (h) eVar.f279b.get(i4);
                hVar3.d = -1;
                hVar3.g = -1;
            }
        }
    }

    public final void n(int i, int i2) {
        boolean z;
        EdgeEffect edgeEffect = this.H;
        if (edgeEffect != null && !edgeEffect.isFinished() && i > 0) {
            this.H.onRelease();
            z = this.H.isFinished();
        } else {
            z = false;
        }
        EdgeEffect edgeEffect2 = this.J;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i < 0) {
            this.J.onRelease();
            z |= this.J.isFinished();
        }
        EdgeEffect edgeEffect3 = this.I;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i2 > 0) {
            this.I.onRelease();
            z |= this.I.isFinished();
        }
        EdgeEffect edgeEffect4 = this.K;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i2 < 0) {
            this.K.onRelease();
            z |= this.K.isFinished();
        }
        if (z) {
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.k(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:            if (r1 >= 30.0f) goto L55;     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onAttachedToWindow() {
        /*
            r5 = this;
            super.onAttachedToWindow()
            r0 = 0
            r5.E = r0
            r1 = 1
            r5.s = r1
            boolean r2 = r5.u
            if (r2 == 0) goto L15
            boolean r2 = r5.isLayoutRequested()
            if (r2 != 0) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            r5.u = r2
            androidx.recyclerview.widget.e r2 = r5.c
            r2.e()
            androidx.recyclerview.widget.c r2 = r5.n
            if (r2 == 0) goto L23
            r2.g = r1
        L23:
            r5.y0 = r0
            boolean r0 = androidx.recyclerview.widget.RecyclerView.R0
            if (r0 == 0) goto L80
            java.lang.ThreadLocal r0 = defpackage.c51.e
            java.lang.Object r1 = r0.get()
            c51 r1 = (defpackage.c51) r1
            r5.q0 = r1
            if (r1 != 0) goto L63
            c51 r1 = new c51
            r1.<init>()
            r5.q0 = r1
            java.util.WeakHashMap r1 = defpackage.ll3.f3151a
            android.view.Display r1 = defpackage.vk3.b(r5)
            boolean r2 = r5.isInEditMode()
            if (r2 != 0) goto L55
            if (r1 == 0) goto L55
            float r1 = r1.getRefreshRate()
            r2 = 1106247680(0x41f00000, float:30.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 < 0) goto L55
            goto L57
        L55:
            r1 = 1114636288(0x42700000, float:60.0)
        L57:
            c51 r2 = r5.q0
            r3 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r3 = r3 / r1
            long r3 = (long) r3
            r2.c = r3
            r0.set(r2)
        L63:
            c51 r0 = r5.q0
            r0.getClass()
            boolean r1 = androidx.recyclerview.widget.RecyclerView.L0
            java.util.ArrayList r0 = r0.f581a
            if (r1 == 0) goto L7d
            boolean r1 = r0.contains(r5)
            if (r1 != 0) goto L75
            goto L7d
        L75:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "RecyclerView already present in worker list!"
            r0.<init>(r1)
            throw r0
        L7d:
            r0.add(r5)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onAttachedToWindow():void");
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        e eVar;
        c51 c51Var;
        super.onDetachedFromWindow();
        lh2 lh2Var = this.L;
        if (lh2Var != null) {
            lh2Var.e();
        }
        l0();
        this.s = false;
        c cVar = this.n;
        if (cVar != null) {
            cVar.g = false;
            cVar.P(this);
        }
        this.F0.clear();
        removeCallbacks(this.G0);
        this.g.getClass();
        do {
        } while (cm3.d.a() != null);
        int i = 0;
        while (true) {
            eVar = this.c;
            ArrayList arrayList = eVar.c;
            if (i >= arrayList.size()) {
                break;
            }
            k62.a(((h) arrayList.get(i)).f281a);
            i++;
        }
        eVar.f(eVar.h.m, false);
        int i2 = k62.f2898a;
        Iterator it = ew3.O0(this).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            int i3 = k62.f2898a;
            l62 l62Var = (l62) view.getTag(i3);
            if (l62Var == null) {
                l62Var = new l62();
                view.setTag(i3, l62Var);
            }
            ArrayList arrayList2 = l62Var.f3073a;
            int N = tf3.N(arrayList2);
            if (-1 < N) {
                p71.C(arrayList2.get(N));
                throw null;
            }
        }
        if (R0 && (c51Var = this.q0) != null) {
            boolean remove = c51Var.f581a.remove(this);
            if (L0 && !remove) {
                throw new IllegalStateException("RecyclerView removal failed!");
            }
            this.q0 = null;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        ArrayList arrayList = this.p;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((mh2) arrayList.get(i)).d(canvas, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onGenericMotionEvent(android.view.MotionEvent r16) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onGenericMotionEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        if (this.x) {
            return false;
        }
        this.r = null;
        if (E(motionEvent)) {
            c0();
            setScrollState(0);
            return true;
        }
        c cVar = this.n;
        if (cVar == null) {
            return false;
        }
        boolean d = cVar.d();
        boolean e = this.n.e();
        if (this.O == null) {
            this.O = VelocityTracker.obtain();
        }
        this.O.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                U(motionEvent);
                            }
                        } else {
                            this.N = motionEvent.getPointerId(actionIndex);
                            int x = (int) (motionEvent.getX(actionIndex) + 0.5f);
                            this.R = x;
                            this.P = x;
                            int y = (int) (motionEvent.getY(actionIndex) + 0.5f);
                            this.h0 = y;
                            this.Q = y;
                        }
                    } else {
                        c0();
                        setScrollState(0);
                    }
                } else {
                    int findPointerIndex = motionEvent.findPointerIndex(this.N);
                    if (findPointerIndex < 0) {
                        Log.e("RecyclerView", "Error processing scroll; pointer index for id " + this.N + " not found. Did any MotionEvents get skipped?");
                        return false;
                    }
                    int x2 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
                    int y2 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
                    if (this.M != 1) {
                        int i = x2 - this.P;
                        int i2 = y2 - this.Q;
                        if (d != 0 && Math.abs(i) > this.i0) {
                            this.R = x2;
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (e && Math.abs(i2) > this.i0) {
                            this.h0 = y2;
                            z2 = true;
                        }
                        if (z2) {
                            setScrollState(1);
                        }
                    }
                }
            } else {
                this.O.clear();
                k0(0);
            }
        } else {
            if (this.y) {
                this.y = false;
            }
            this.N = motionEvent.getPointerId(0);
            int x3 = (int) (motionEvent.getX() + 0.5f);
            this.R = x3;
            this.P = x3;
            int y3 = (int) (motionEvent.getY() + 0.5f);
            this.h0 = y3;
            this.Q = y3;
            EdgeEffect edgeEffect = this.H;
            if (edgeEffect != null && t9.H(edgeEffect) != 0.0f && !canScrollHorizontally(-1)) {
                t9.X(this.H, 0.0f, 1.0f - (motionEvent.getY() / getHeight()));
                z = true;
            } else {
                z = false;
            }
            EdgeEffect edgeEffect2 = this.J;
            if (edgeEffect2 != null && t9.H(edgeEffect2) != 0.0f && !canScrollHorizontally(1)) {
                t9.X(this.J, 0.0f, motionEvent.getY() / getHeight());
                z = true;
            }
            EdgeEffect edgeEffect3 = this.I;
            if (edgeEffect3 != null && t9.H(edgeEffect3) != 0.0f && !canScrollVertically(-1)) {
                t9.X(this.I, 0.0f, motionEvent.getX() / getWidth());
                z = true;
            }
            EdgeEffect edgeEffect4 = this.K;
            if (edgeEffect4 != null && t9.H(edgeEffect4) != 0.0f && !canScrollVertically(1)) {
                t9.X(this.K, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
                z = true;
            }
            if (z || this.M == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                k0(1);
            }
            int[] iArr = this.D0;
            iArr[1] = 0;
            iArr[0] = 0;
            int i3 = d;
            if (e) {
                i3 = (d ? 1 : 0) | 2;
            }
            getScrollingChildHelper().h(i3, 0);
        }
        if (this.M != 1) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = qa3.f3976a;
        pa3.a("RV OnLayout");
        r();
        pa3.b();
        this.u = true;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        c cVar = this.n;
        if (cVar == null) {
            q(i, i2);
            return;
        }
        boolean J = cVar.J();
        boolean z = false;
        wh2 wh2Var = this.s0;
        if (J) {
            int mode = View.MeasureSpec.getMode(i);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.n.f275b.q(i, i2);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z = true;
            }
            this.H0 = z;
            if (!z && this.m != null) {
                if (wh2Var.d == 1) {
                    s();
                }
                this.n.q0(i, i2);
                wh2Var.i = true;
                t();
                this.n.s0(i, i2);
                if (this.n.v0()) {
                    this.n.q0(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    wh2Var.i = true;
                    t();
                    this.n.s0(i, i2);
                }
                this.I0 = getMeasuredWidth();
                this.J0 = getMeasuredHeight();
                return;
            }
            return;
        }
        if (this.t) {
            this.n.f275b.q(i, i2);
            return;
        }
        if (this.A) {
            i0();
            S();
            W();
            T(true);
            if (wh2Var.k) {
                wh2Var.g = true;
            } else {
                this.e.c();
                wh2Var.g = false;
            }
            this.A = false;
            j0(false);
        } else if (wh2Var.k) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        fh2 fh2Var = this.m;
        if (fh2Var != null) {
            wh2Var.e = fh2Var.c();
        } else {
            wh2Var.e = 0;
        }
        i0();
        this.n.f275b.q(i, i2);
        j0(false);
        wh2Var.g = false;
    }

    @Override // android.view.ViewGroup
    public final boolean onRequestFocusInDescendants(int i, Rect rect) {
        if (O()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i, rect);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.d = savedState;
        super.onRestoreInstanceState(savedState.f200a);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.d;
        if (savedState2 != null) {
            savedState.c = savedState2.c;
        } else {
            c cVar = this.n;
            if (cVar != null) {
                savedState.c = cVar.e0();
            } else {
                savedState.c = null;
            }
        }
        return savedState;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3 || i2 != i4) {
            this.K = null;
            this.I = null;
            this.J = null;
            this.H = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x03f7, code lost:            if (r0 == false) goto L571;     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02bd A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0464  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0115  */
    /* JADX WARN: Type inference failed for: r5v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v6 */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r25) {
        /*
            Method dump skipped, instructions count: 1142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p() {
        boolean z;
        boolean z2;
        boolean z3;
        if (this.u && !this.C) {
            if (!this.e.g()) {
                return;
            }
            x7 x7Var = this.e;
            int i = x7Var.f;
            boolean z4 = false;
            if ((4 & i) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if ((i & 11) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    int i2 = qa3.f3976a;
                    pa3.a("RV PartialInvalidate");
                    i0();
                    S();
                    this.e.j();
                    if (!this.w) {
                        int e = this.f.e();
                        int i3 = 0;
                        while (true) {
                            if (i3 >= e) {
                                break;
                            }
                            h M = M(this.f.d(i3));
                            if (M != null && !M.z()) {
                                if ((M.j & 2) != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    z4 = true;
                                    break;
                                }
                            }
                            i3++;
                        }
                        if (z4) {
                            r();
                        } else {
                            this.e.b();
                        }
                    }
                    j0(true);
                    T(true);
                    pa3.b();
                    return;
                }
            }
            if (x7Var.g()) {
                int i4 = qa3.f3976a;
                pa3.a("RV FullInvalidate");
                r();
                pa3.b();
                return;
            }
            return;
        }
        int i5 = qa3.f3976a;
        pa3.a("RV FullInvalidate");
        r();
        pa3.b();
    }

    public final void q(int i, int i2) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        WeakHashMap weakHashMap = ll3.f3151a;
        setMeasuredDimension(c.g(i, paddingRight, uk3.e(this)), c.g(i2, getPaddingBottom() + getPaddingTop(), uk3.d(this)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x031e, code lost:            if (r18.f.j(getFocusedChild()) == false) goto L484;     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0375, code lost:            if (r5.hasFocusable() != false) goto L450;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void r() {
        /*
            Method dump skipped, instructions count: 989
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.r():void");
    }

    @Override // android.view.ViewGroup
    public final void removeDetachedView(View view, boolean z) {
        h M = M(view);
        if (M != null) {
            if (M.t()) {
                M.j &= -257;
            } else if (!M.z()) {
                StringBuilder sb = new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(M);
                throw new IllegalArgumentException(hx2.l(this, sb));
            }
        } else if (L0) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            throw new IllegalArgumentException(hx2.l(this, sb2));
        }
        view.clearAnimation();
        h M2 = M(view);
        fh2 fh2Var = this.m;
        if (fh2Var != null && M2 != null) {
            fh2Var.y(M2);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestChildFocus(View view, View view2) {
        if (!this.n.c0(this, this.s0, view, view2) && view2 != null) {
            b0(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        return this.n.k0(this, view, rect, z, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        ArrayList arrayList = this.q;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((qh2) arrayList.get(i)).a();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.v == 0 && !this.x) {
            super.requestLayout();
        } else {
            this.w = true;
        }
    }

    public final void s() {
        View view;
        h hVar;
        int d;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        View D;
        wh2 wh2Var = this.s0;
        wh2Var.a(1);
        C(wh2Var);
        wh2Var.i = false;
        i0();
        j jVar = this.g;
        jVar.e();
        S();
        W();
        if (this.o0 && hasFocus() && this.m != null) {
            view = getFocusedChild();
        } else {
            view = null;
        }
        if (view == null || (D = D(view)) == null) {
            hVar = null;
        } else {
            hVar = L(D);
        }
        long j = -1;
        if (hVar == null) {
            wh2Var.m = -1L;
            wh2Var.l = -1;
            wh2Var.n = -1;
        } else {
            if (this.m.f2092b) {
                j = hVar.e;
            }
            wh2Var.m = j;
            if (this.C) {
                d = -1;
            } else if (hVar.o()) {
                d = hVar.d;
            } else {
                d = hVar.d();
            }
            wh2Var.l = d;
            View view2 = hVar.f281a;
            int id = view2.getId();
            while (!view2.isFocused() && (view2 instanceof ViewGroup) && view2.hasFocus()) {
                view2 = ((ViewGroup) view2).getFocusedChild();
                if (view2.getId() != -1) {
                    id = view2.getId();
                }
            }
            wh2Var.n = id;
        }
        if (wh2Var.j && this.w0) {
            z = true;
        } else {
            z = false;
        }
        wh2Var.h = z;
        this.w0 = false;
        this.v0 = false;
        wh2Var.g = wh2Var.k;
        wh2Var.e = this.m.c();
        F(this.A0);
        if (wh2Var.j) {
            int e = this.f.e();
            for (int i = 0; i < e; i++) {
                h M = M(this.f.d(i));
                if (!M.z() && (!M.m() || this.m.f2092b)) {
                    lh2 lh2Var = this.L;
                    lh2.b(M);
                    M.g();
                    lh2Var.getClass();
                    kh2 kh2Var = new kh2();
                    kh2Var.a(M);
                    jVar.d(M, kh2Var);
                    if (wh2Var.h) {
                        if ((M.j & 2) != 0) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        if (z4 && !M.o() && !M.z() && !M.m()) {
                            ((ko1) jVar.c).f(J(M), M);
                        }
                    }
                }
            }
        }
        if (wh2Var.k) {
            int h = this.f.h();
            for (int i2 = 0; i2 < h; i2++) {
                h M2 = M(this.f.g(i2));
                if (L0 && M2.c == -1 && !M2.o()) {
                    throw new IllegalStateException(hx2.l(this, new StringBuilder("view holder cannot have position -1 unless it is removed")));
                }
                if (!M2.z() && M2.d == -1) {
                    M2.d = M2.c;
                }
            }
            boolean z5 = wh2Var.f;
            wh2Var.f = false;
            this.n.a0(this.c, wh2Var);
            wh2Var.f = z5;
            for (int i3 = 0; i3 < this.f.e(); i3++) {
                h M3 = M(this.f.d(i3));
                if (!M3.z()) {
                    cm3 cm3Var = (cm3) ((uu2) jVar.f284b).getOrDefault(M3, null);
                    if (cm3Var != null && (cm3Var.f668a & 4) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (!z2) {
                        lh2.b(M3);
                        if ((M3.j & 8192) != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        lh2 lh2Var2 = this.L;
                        M3.g();
                        lh2Var2.getClass();
                        kh2 kh2Var2 = new kh2();
                        kh2Var2.a(M3);
                        if (z3) {
                            Y(M3, kh2Var2);
                        } else {
                            cm3 cm3Var2 = (cm3) ((uu2) jVar.f284b).getOrDefault(M3, null);
                            if (cm3Var2 == null) {
                                cm3Var2 = cm3.a();
                                ((uu2) jVar.f284b).put(M3, cm3Var2);
                            }
                            cm3Var2.f668a |= 2;
                            cm3Var2.f669b = kh2Var2;
                        }
                    }
                }
            }
            m();
        } else {
            m();
        }
        T(true);
        j0(false);
        wh2Var.d = 2;
    }

    @Override // android.view.View
    public final void scrollBy(int i, int i2) {
        c cVar = this.n;
        if (cVar == null) {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        }
        if (this.x) {
            return;
        }
        boolean d = cVar.d();
        boolean e = this.n.e();
        if (d || e) {
            if (!d) {
                i = 0;
            }
            if (!e) {
                i2 = 0;
            }
            d0(i, i2, null, 0);
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
    }

    @Override // android.view.View, android.view.accessibility.AccessibilityEventSource
    public final void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        int i;
        int i2 = 0;
        if (O()) {
            if (accessibilityEvent != null) {
                i = m2.a(accessibilityEvent);
            } else {
                i = 0;
            }
            if (i != 0) {
                i2 = i;
            }
            this.z |= i2;
            i2 = 1;
        }
        if (i2 != 0) {
            return;
        }
        super.sendAccessibilityEventUnchecked(accessibilityEvent);
    }

    public void setAccessibilityDelegateCompat(bi2 bi2Var) {
        this.z0 = bi2Var;
        ll3.p(this, bi2Var);
    }

    public void setAdapter(fh2 fh2Var) {
        setLayoutFrozen(false);
        fh2 fh2Var2 = this.m;
        f fVar = this.f268b;
        if (fh2Var2 != null) {
            fh2Var2.f2091a.unregisterObserver(fVar);
            this.m.t(this);
        }
        lh2 lh2Var = this.L;
        if (lh2Var != null) {
            lh2Var.e();
        }
        c cVar = this.n;
        e eVar = this.c;
        if (cVar != null) {
            cVar.g0(eVar);
            this.n.h0(eVar);
        }
        eVar.f278a.clear();
        eVar.g();
        x7 x7Var = this.e;
        x7Var.l(x7Var.f5125b);
        x7Var.l(x7Var.c);
        x7Var.f = 0;
        fh2 fh2Var3 = this.m;
        this.m = fh2Var;
        if (fh2Var != null) {
            fh2Var.f2091a.registerObserver(fVar);
            fh2Var.m(this);
        }
        c cVar2 = this.n;
        if (cVar2 != null) {
            cVar2.O();
        }
        fh2 fh2Var4 = this.m;
        eVar.f278a.clear();
        eVar.g();
        eVar.f(fh2Var3, true);
        th2 c = eVar.c();
        if (fh2Var3 != null) {
            c.f4505b--;
        }
        if (c.f4505b == 0) {
            int i = 0;
            while (true) {
                SparseArray sparseArray = c.f4504a;
                if (i >= sparseArray.size()) {
                    break;
                }
                sh2 sh2Var = (sh2) sparseArray.valueAt(i);
                Iterator it = sh2Var.f4343a.iterator();
                while (it.hasNext()) {
                    k62.a(((h) it.next()).f281a);
                }
                sh2Var.f4343a.clear();
                i++;
            }
        }
        if (fh2Var4 != null) {
            c.f4505b++;
        }
        eVar.e();
        this.s0.f = true;
        X(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(ih2 ih2Var) {
        if (ih2Var == null) {
            return;
        }
        setChildrenDrawingOrderEnabled(false);
    }

    @Override // android.view.ViewGroup
    public void setClipToPadding(boolean z) {
        if (z != this.h) {
            this.K = null;
            this.I = null;
            this.J = null;
            this.H = null;
        }
        this.h = z;
        super.setClipToPadding(z);
        if (this.u) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(jh2 jh2Var) {
        jh2Var.getClass();
        this.G = jh2Var;
        this.K = null;
        this.I = null;
        this.J = null;
        this.H = null;
    }

    public void setHasFixedSize(boolean z) {
        this.t = z;
    }

    public void setItemAnimator(lh2 lh2Var) {
        lh2 lh2Var2 = this.L;
        if (lh2Var2 != null) {
            lh2Var2.e();
            this.L.f3127a = null;
        }
        this.L = lh2Var;
        if (lh2Var != null) {
            lh2Var.f3127a = this.x0;
        }
    }

    public void setItemViewCacheSize(int i) {
        e eVar = this.c;
        eVar.e = i;
        eVar.n();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z) {
        suppressLayout(z);
    }

    public void setLayoutManager(c cVar) {
        b bVar;
        RecyclerView recyclerView;
        if (cVar == this.n) {
            return;
        }
        l0();
        c cVar2 = this.n;
        int i = 0;
        e eVar = this.c;
        if (cVar2 != null) {
            lh2 lh2Var = this.L;
            if (lh2Var != null) {
                lh2Var.e();
            }
            this.n.g0(eVar);
            this.n.h0(eVar);
            eVar.f278a.clear();
            eVar.g();
            if (this.s) {
                c cVar3 = this.n;
                cVar3.g = false;
                cVar3.P(this);
            }
            this.n.t0(null);
            this.n = null;
        } else {
            eVar.f278a.clear();
            eVar.g();
        }
        pz pzVar = this.f;
        pzVar.f3943b.g();
        ArrayList arrayList = pzVar.c;
        int size = arrayList.size();
        while (true) {
            size--;
            bVar = pzVar.f3942a;
            if (size < 0) {
                break;
            }
            View view = (View) arrayList.get(size);
            bVar.getClass();
            h M = M(view);
            if (M != null) {
                int i2 = M.p;
                RecyclerView recyclerView2 = bVar.f273a;
                if (recyclerView2.O()) {
                    M.q = i2;
                    recyclerView2.F0.add(M);
                } else {
                    WeakHashMap weakHashMap = ll3.f3151a;
                    uk3.s(M.f281a, i2);
                }
                M.p = 0;
            }
            arrayList.remove(size);
        }
        int c = bVar.c();
        while (true) {
            recyclerView = bVar.f273a;
            if (i >= c) {
                break;
            }
            View childAt = recyclerView.getChildAt(i);
            recyclerView.getClass();
            h M2 = M(childAt);
            fh2 fh2Var = recyclerView.m;
            if (fh2Var != null && M2 != null) {
                fh2Var.y(M2);
            }
            childAt.clearAnimation();
            i++;
        }
        recyclerView.removeAllViews();
        this.n = cVar;
        if (cVar != null) {
            if (cVar.f275b == null) {
                cVar.t0(this);
                if (this.s) {
                    this.n.g = true;
                }
            } else {
                StringBuilder sb = new StringBuilder("LayoutManager ");
                sb.append(cVar);
                sb.append(" is already attached to a RecyclerView:");
                throw new IllegalArgumentException(hx2.l(cVar.f275b, sb));
            }
        }
        eVar.n();
        requestLayout();
    }

    @Override // android.view.ViewGroup
    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition(null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        hz1 scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            WeakHashMap weakHashMap = ll3.f3151a;
            al3.z(scrollingChildHelper.c);
        }
        scrollingChildHelper.d = z;
    }

    public void setOnFlingListener(ph2 ph2Var) {
        this.j0 = ph2Var;
    }

    @Deprecated
    public void setOnScrollListener(rh2 rh2Var) {
        this.t0 = rh2Var;
    }

    public void setPreserveFocusAfterLayout(boolean z) {
        this.o0 = z;
    }

    public void setRecycledViewPool(th2 th2Var) {
        e eVar = this.c;
        RecyclerView recyclerView = eVar.h;
        eVar.f(recyclerView.m, false);
        if (eVar.g != null) {
            r2.f4505b--;
        }
        eVar.g = th2Var;
        if (th2Var != null && recyclerView.getAdapter() != null) {
            eVar.g.f4505b++;
        }
        eVar.e();
    }

    @Deprecated
    public void setRecyclerListener(uh2 uh2Var) {
    }

    public void setScrollState(int i) {
        nk1 nk1Var;
        if (i == this.M) {
            return;
        }
        if (M0) {
            new Exception();
        }
        this.M = i;
        if (i != 2) {
            zh2 zh2Var = this.p0;
            zh2Var.g.removeCallbacks(zh2Var);
            zh2Var.c.abortAnimation();
            c cVar = this.n;
            if (cVar != null && (nk1Var = cVar.e) != null) {
                nk1Var.i();
            }
        }
        c cVar2 = this.n;
        if (cVar2 != null) {
            cVar2.f0(i);
        }
        rh2 rh2Var = this.t0;
        if (rh2Var != null) {
            rh2Var.a(this, i);
        }
        ArrayList arrayList = this.u0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    ((rh2) this.u0.get(size)).a(this, i);
                } else {
                    return;
                }
            }
        }
    }

    public void setScrollingTouchSlop(int i) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i != 1) {
            this.i0 = viewConfiguration.getScaledTouchSlop();
        } else {
            this.i0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public void setViewCacheExtension(yh2 yh2Var) {
        this.c.getClass();
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return getScrollingChildHelper().h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    @Override // android.view.ViewGroup
    public final void suppressLayout(boolean z) {
        if (z != this.x) {
            k("Do not suppressLayout in layout or scroll");
            if (!z) {
                this.x = false;
                if (this.w && this.n != null && this.m != null) {
                    requestLayout();
                }
                this.w = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.x = true;
            this.y = true;
            l0();
        }
    }

    public final void t() {
        boolean z;
        boolean z2;
        i0();
        S();
        wh2 wh2Var = this.s0;
        wh2Var.a(6);
        this.e.c();
        wh2Var.e = this.m.c();
        wh2Var.c = 0;
        if (this.d != null) {
            fh2 fh2Var = this.m;
            int x = hx2.x(fh2Var.c);
            if (x == 1 ? fh2Var.c() > 0 : x != 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                Parcelable parcelable = this.d.c;
                if (parcelable != null) {
                    this.n.d0(parcelable);
                }
                this.d = null;
            }
        }
        wh2Var.g = false;
        this.n.a0(this.c, wh2Var);
        wh2Var.f = false;
        if (wh2Var.j && this.L != null) {
            z = true;
        } else {
            z = false;
        }
        wh2Var.j = z;
        wh2Var.d = 4;
        T(true);
        j0(false);
    }

    public final boolean u(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i, i2, i3, iArr, iArr2);
    }

    public final void v(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        getScrollingChildHelper().e(i, i2, i3, i4, iArr, i5, iArr2);
    }

    public final void w(int i, int i2) {
        this.F++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i, scrollY - i2);
        rh2 rh2Var = this.t0;
        if (rh2Var != null) {
            rh2Var.b(this, i, i2);
        }
        ArrayList arrayList = this.u0;
        if (arrayList != null) {
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    ((rh2) this.u0.get(size)).b(this, i, i2);
                }
            }
        }
        this.F--;
    }

    public final void x() {
        if (this.K != null) {
            return;
        }
        ((xh2) this.G).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.K = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
        } else {
            edgeEffect.setSize(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public final void y() {
        if (this.H != null) {
            return;
        }
        ((xh2) this.G).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.H = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public final void z() {
        if (this.J != null) {
            return;
        }
        ((xh2) this.G).getClass();
        EdgeEffect edgeEffect = new EdgeEffect(getContext());
        this.J = edgeEffect;
        if (this.h) {
            edgeEffect.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
        } else {
            edgeEffect.setSize(getMeasuredHeight(), getMeasuredWidth());
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float a2;
        float a3;
        TypedArray typedArray;
        char c;
        ClassLoader classLoader;
        Constructor constructor;
        Object[] objArr;
        this.f268b = new f(this);
        this.c = new e(this);
        this.g = new j(1);
        this.i = new dh2(this, 0);
        this.j = new Rect();
        this.k = new Rect();
        this.l = new RectF();
        this.o = new ArrayList();
        this.p = new ArrayList();
        this.q = new ArrayList();
        this.v = 0;
        this.C = false;
        this.D = false;
        this.E = 0;
        this.F = 0;
        this.G = U0;
        this.L = new zh0();
        this.M = 0;
        this.N = -1;
        this.m0 = Float.MIN_VALUE;
        this.n0 = Float.MIN_VALUE;
        this.o0 = true;
        this.p0 = new zh2(this);
        this.r0 = R0 ? new p10() : null;
        this.s0 = new wh2();
        this.v0 = false;
        this.w0 = false;
        b bVar = new b(this);
        this.x0 = bVar;
        this.y0 = false;
        this.A0 = new int[2];
        this.C0 = new int[2];
        this.D0 = new int[2];
        this.E0 = new int[2];
        this.F0 = new ArrayList();
        this.G0 = new dh2(this, 1);
        this.I0 = 0;
        this.J0 = 0;
        this.K0 = new b(this);
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.i0 = viewConfiguration.getScaledTouchSlop();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26) {
            Method method = ol3.f3691a;
            a2 = ml3.a(viewConfiguration);
        } else {
            a2 = ol3.a(viewConfiguration, context);
        }
        this.m0 = a2;
        if (i2 >= 26) {
            a3 = ml3.b(viewConfiguration);
        } else {
            a3 = ol3.a(viewConfiguration, context);
        }
        this.n0 = a3;
        this.k0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.l0 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f267a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        setWillNotDraw(getOverScrollMode() == 2);
        this.L.f3127a = bVar;
        this.e = new x7(new b(this));
        this.f = new pz(new b(this));
        WeakHashMap weakHashMap = ll3.f3151a;
        if ((i2 >= 26 ? cl3.c(this) : 0) == 0 && i2 >= 26) {
            cl3.m(this, 8);
        }
        if (uk3.c(this) == 0) {
            uk3.s(this, 1);
        }
        this.B = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new bi2(this));
        int[] iArr = ag2.RecyclerView;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, 0);
        ll3.o(this, context, iArr, attributeSet, obtainStyledAttributes, i);
        String string = obtainStyledAttributes.getString(ag2.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(ag2.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.h = obtainStyledAttributes.getBoolean(ag2.RecyclerView_android_clipToPadding, true);
        if (obtainStyledAttributes.getBoolean(ag2.RecyclerView_fastScrollEnabled, false)) {
            StateListDrawable stateListDrawable = (StateListDrawable) obtainStyledAttributes.getDrawable(ag2.RecyclerView_fastScrollVerticalThumbDrawable);
            Drawable drawable = obtainStyledAttributes.getDrawable(ag2.RecyclerView_fastScrollVerticalTrackDrawable);
            StateListDrawable stateListDrawable2 = (StateListDrawable) obtainStyledAttributes.getDrawable(ag2.RecyclerView_fastScrollHorizontalThumbDrawable);
            Drawable drawable2 = obtainStyledAttributes.getDrawable(ag2.RecyclerView_fastScrollHorizontalTrackDrawable);
            if (stateListDrawable != null && drawable != null && stateListDrawable2 != null && drawable2 != null) {
                Resources resources = getContext().getResources();
                c = 2;
                typedArray = obtainStyledAttributes;
                new aw0(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(qe2.fastscroll_default_thickness), resources.getDimensionPixelSize(qe2.fastscroll_minimum_range), resources.getDimensionPixelOffset(qe2.fastscroll_margin));
            } else {
                throw new IllegalArgumentException(hx2.l(this, new StringBuilder("Trying to set fast scroller without both required drawables.")));
            }
        } else {
            typedArray = obtainStyledAttributes;
            c = 2;
        }
        typedArray.recycle();
        if (string != null) {
            String trim = string.trim();
            if (!trim.isEmpty()) {
                if (trim.charAt(0) == '.') {
                    trim = context.getPackageName() + trim;
                } else if (!trim.contains(".")) {
                    trim = RecyclerView.class.getPackage().getName() + '.' + trim;
                }
                String str = trim;
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(str, false, classLoader).asSubclass(c.class);
                    try {
                        constructor = asSubclass.getConstructor(S0);
                        objArr = new Object[4];
                        objArr[0] = context;
                        objArr[1] = attributeSet;
                        objArr[c] = Integer.valueOf(i);
                        objArr[3] = 0;
                    } catch (NoSuchMethodException e) {
                        try {
                            constructor = asSubclass.getConstructor(new Class[0]);
                            objArr = null;
                        } catch (NoSuchMethodException e2) {
                            e2.initCause(e);
                            throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + str, e2);
                        }
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((c) constructor.newInstance(objArr));
                } catch (ClassCastException e3) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + str, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + str, e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + str, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e6);
                } catch (InvocationTargetException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + str, e7);
                }
            }
        }
        int[] iArr2 = N0;
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        ll3.o(this, context, iArr2, attributeSet, obtainStyledAttributes2, i);
        boolean z = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z);
        setTag(k62.f2899b, Boolean.TRUE);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        c cVar = this.n;
        if (cVar != null) {
            return cVar.t(layoutParams);
        }
        throw new IllegalStateException(hx2.l(this, new StringBuilder("RecyclerView has no LayoutManager")));
    }
}
