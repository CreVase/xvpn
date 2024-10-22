package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.protobuf.v;
import defpackage.ag2;
import defpackage.fh2;
import defpackage.g3;
import defpackage.lh2;
import defpackage.ll3;
import defpackage.nh2;
import defpackage.nk1;
import defpackage.oh2;
import defpackage.p10;
import defpackage.pz;
import defpackage.uk3;
import defpackage.vk3;
import defpackage.wh2;
import defpackage.zh2;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public pz f274a;

    /* renamed from: b, reason: collision with root package name */
    public RecyclerView f275b;
    public final j c;
    public final j d;
    public nk1 e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public c() {
        nh2 nh2Var = new nh2(this, 0);
        nh2 nh2Var2 = new nh2(this, 1);
        this.c = new j(nh2Var);
        this.d = new j(nh2Var2);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int F(View view) {
        return ((d) view.getLayoutParams()).a();
    }

    public static oh2 G(Context context, AttributeSet attributeSet, int i, int i2) {
        oh2 oh2Var = new oh2();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ag2.RecyclerView, i, i2);
        oh2Var.f3663a = obtainStyledAttributes.getInt(ag2.RecyclerView_android_orientation, 1);
        oh2Var.f3664b = obtainStyledAttributes.getInt(ag2.RecyclerView_spanCount, 1);
        oh2Var.c = obtainStyledAttributes.getBoolean(ag2.RecyclerView_reverseLayout, false);
        oh2Var.d = obtainStyledAttributes.getBoolean(ag2.RecyclerView_stackFromEnd, false);
        obtainStyledAttributes.recycle();
        return oh2Var;
    }

    public static boolean K(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        }
        if (size < i) {
            return false;
        }
        return true;
    }

    public static void L(View view, int i, int i2, int i3, int i4) {
        d dVar = (d) view.getLayoutParams();
        Rect rect = dVar.f277b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) dVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) dVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) dVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:            if (r5 == 1073741824) goto L14;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int w(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            int r4 = r4 - r6
            r6 = 0
            int r4 = java.lang.Math.max(r6, r4)
            r0 = -2
            r1 = -1
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            if (r8 == 0) goto L1a
            if (r7 < 0) goto L11
            goto L1c
        L11:
            if (r7 != r1) goto L2f
            if (r5 == r2) goto L21
            if (r5 == 0) goto L2f
            if (r5 == r3) goto L21
            goto L2f
        L1a:
            if (r7 < 0) goto L1f
        L1c:
            r5 = 1073741824(0x40000000, float:2.0)
            goto L31
        L1f:
            if (r7 != r1) goto L23
        L21:
            r7 = r4
            goto L31
        L23:
            if (r7 != r0) goto L2f
            if (r5 == r2) goto L2c
            if (r5 != r3) goto L2a
            goto L2c
        L2a:
            r5 = 0
            goto L21
        L2c:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L21
        L2f:
            r5 = 0
            r7 = 0
        L31:
            int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.c.w(int, int, int, int, boolean):int");
    }

    public final int A() {
        RecyclerView recyclerView = this.f275b;
        WeakHashMap weakHashMap = ll3.f3151a;
        return vk3.d(recyclerView);
    }

    public final int B() {
        RecyclerView recyclerView = this.f275b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final int C() {
        RecyclerView recyclerView = this.f275b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public final int D() {
        RecyclerView recyclerView = this.f275b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int E() {
        RecyclerView recyclerView = this.f275b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int H(e eVar, wh2 wh2Var) {
        return -1;
    }

    public final void I(View view, Rect rect) {
        Matrix matrix;
        Rect rect2 = ((d) view.getLayoutParams()).f277b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.f275b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.f275b.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public boolean J() {
        return false;
    }

    public void M(int i) {
        RecyclerView recyclerView = this.f275b;
        if (recyclerView != null) {
            int e = recyclerView.f.e();
            for (int i2 = 0; i2 < e; i2++) {
                recyclerView.f.d(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void N(int i) {
        RecyclerView recyclerView = this.f275b;
        if (recyclerView != null) {
            int e = recyclerView.f.e();
            for (int i2 = 0; i2 < e; i2++) {
                recyclerView.f.d(i2).offsetTopAndBottom(i);
            }
        }
    }

    public void O() {
    }

    public void P(RecyclerView recyclerView) {
    }

    public View Q(View view, int i, e eVar, wh2 wh2Var) {
        return null;
    }

    public void R(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.f275b;
        e eVar = recyclerView.c;
        wh2 wh2Var = recyclerView.s0;
        if (recyclerView != null && accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.f275b.canScrollVertically(-1) && !this.f275b.canScrollHorizontally(-1) && !this.f275b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            fh2 fh2Var = this.f275b.m;
            if (fh2Var != null) {
                accessibilityEvent.setItemCount(fh2Var.c());
            }
        }
    }

    public void S(e eVar, wh2 wh2Var, g3 g3Var) {
        boolean canScrollVertically = this.f275b.canScrollVertically(-1);
        AccessibilityNodeInfo accessibilityNodeInfo = g3Var.f2195a;
        if (canScrollVertically || this.f275b.canScrollHorizontally(-1)) {
            g3Var.a(8192);
            accessibilityNodeInfo.setScrollable(true);
        }
        if (this.f275b.canScrollVertically(1) || this.f275b.canScrollHorizontally(1)) {
            g3Var.a(v.DEFAULT_BUFFER_SIZE);
            accessibilityNodeInfo.setScrollable(true);
        }
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(H(eVar, wh2Var), x(eVar, wh2Var), false, 0));
    }

    public final void T(View view, g3 g3Var) {
        h M = RecyclerView.M(view);
        if (M != null && !M.o() && !this.f274a.j(M.f281a)) {
            RecyclerView recyclerView = this.f275b;
            U(recyclerView.c, recyclerView.s0, view, g3Var);
        }
    }

    public void U(e eVar, wh2 wh2Var, View view, g3 g3Var) {
    }

    public void V(int i, int i2) {
    }

    public void W() {
    }

    public void X(int i, int i2) {
    }

    public void Y(int i, int i2) {
    }

    public void Z(int i, int i2) {
    }

    public abstract void a0(e eVar, wh2 wh2Var);

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(android.view.View r7, boolean r8, int r9) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.c.b(android.view.View, boolean, int):void");
    }

    public abstract void b0(wh2 wh2Var);

    public void c(String str) {
        RecyclerView recyclerView = this.f275b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public boolean c0(RecyclerView recyclerView, wh2 wh2Var, View view, View view2) {
        boolean z;
        nk1 nk1Var = this.e;
        if (nk1Var != null && nk1Var.e) {
            z = true;
        } else {
            z = false;
        }
        if (z || recyclerView.O()) {
            return true;
        }
        return false;
    }

    public abstract boolean d();

    public void d0(Parcelable parcelable) {
    }

    public abstract boolean e();

    public Parcelable e0() {
        return null;
    }

    public boolean f(d dVar) {
        return dVar != null;
    }

    public void f0(int i) {
    }

    public final void g0(e eVar) {
        int v = v();
        while (true) {
            v--;
            if (v >= 0) {
                if (!RecyclerView.M(u(v)).z()) {
                    View u = u(v);
                    j0(v);
                    eVar.i(u);
                }
            } else {
                return;
            }
        }
    }

    public void h(int i, int i2, wh2 wh2Var, p10 p10Var) {
    }

    public final void h0(e eVar) {
        ArrayList arrayList;
        int size = eVar.f278a.size();
        int i = size - 1;
        while (true) {
            arrayList = eVar.f278a;
            if (i < 0) {
                break;
            }
            View view = ((h) arrayList.get(i)).f281a;
            h M = RecyclerView.M(view);
            if (!M.z()) {
                M.y(false);
                if (M.t()) {
                    this.f275b.removeDetachedView(view, false);
                }
                lh2 lh2Var = this.f275b.L;
                if (lh2Var != null) {
                    lh2Var.d(M);
                }
                M.y(true);
                h M2 = RecyclerView.M(view);
                M2.n = null;
                M2.o = false;
                M2.j &= -33;
                eVar.j(M2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = eVar.f279b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.f275b.invalidate();
        }
    }

    public void i(int i, p10 p10Var) {
    }

    public final void i0(View view, e eVar) {
        pz pzVar = this.f274a;
        b bVar = pzVar.f3942a;
        int i = pzVar.d;
        if (i != 1) {
            if (i != 2) {
                try {
                    pzVar.d = 1;
                    pzVar.e = view;
                    int indexOfChild = bVar.f273a.indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (pzVar.f3943b.f(indexOfChild)) {
                            pzVar.k(view);
                        }
                        bVar.i(indexOfChild);
                    }
                    pzVar.d = 0;
                    pzVar.e = null;
                    eVar.i(view);
                    return;
                } catch (Throwable th) {
                    pzVar.d = 0;
                    pzVar.e = null;
                    throw th;
                }
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
        }
        throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
    }

    public abstract int j(wh2 wh2Var);

    public final void j0(int i) {
        if (u(i) != null) {
            pz pzVar = this.f274a;
            b bVar = pzVar.f3942a;
            int i2 = pzVar.d;
            if (i2 != 1) {
                if (i2 != 2) {
                    try {
                        int f = pzVar.f(i);
                        View childAt = bVar.f273a.getChildAt(f);
                        if (childAt != null) {
                            pzVar.d = 1;
                            pzVar.e = childAt;
                            if (pzVar.f3943b.f(f)) {
                                pzVar.k(childAt);
                            }
                            bVar.i(f);
                        }
                        return;
                    } finally {
                        pzVar.d = 0;
                        pzVar.e = null;
                    }
                }
                throw new IllegalStateException("Cannot call removeView(At) within removeViewIfHidden");
            }
            throw new IllegalStateException("Cannot call removeView(At) within removeView(At)");
        }
    }

    public abstract int k(wh2 wh2Var);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a9, code lost:            if (r10 == false) goto L33;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean k0(androidx.recyclerview.widget.RecyclerView r9, android.view.View r10, android.graphics.Rect r11, boolean r12, boolean r13) {
        /*
            r8 = this;
            int r0 = r8.C()
            int r1 = r8.E()
            int r2 = r8.n
            int r3 = r8.D()
            int r2 = r2 - r3
            int r3 = r8.o
            int r4 = r8.B()
            int r3 = r3 - r4
            int r4 = r10.getLeft()
            int r5 = r11.left
            int r4 = r4 + r5
            int r5 = r10.getScrollX()
            int r4 = r4 - r5
            int r5 = r10.getTop()
            int r6 = r11.top
            int r5 = r5 + r6
            int r10 = r10.getScrollY()
            int r5 = r5 - r10
            int r10 = r11.width()
            int r10 = r10 + r4
            int r11 = r11.height()
            int r11 = r11 + r5
            int r4 = r4 - r0
            r0 = 0
            int r6 = java.lang.Math.min(r0, r4)
            int r5 = r5 - r1
            int r1 = java.lang.Math.min(r0, r5)
            int r10 = r10 - r2
            int r2 = java.lang.Math.max(r0, r10)
            int r11 = r11 - r3
            int r11 = java.lang.Math.max(r0, r11)
            int r3 = r8.A()
            r7 = 1
            if (r3 != r7) goto L5c
            if (r2 == 0) goto L57
            goto L64
        L57:
            int r2 = java.lang.Math.max(r6, r10)
            goto L64
        L5c:
            if (r6 == 0) goto L5f
            goto L63
        L5f:
            int r6 = java.lang.Math.min(r4, r2)
        L63:
            r2 = r6
        L64:
            if (r1 == 0) goto L67
            goto L6b
        L67:
            int r1 = java.lang.Math.min(r5, r11)
        L6b:
            if (r13 == 0) goto Lab
            android.view.View r10 = r9.getFocusedChild()
            if (r10 != 0) goto L74
            goto La8
        L74:
            int r11 = r8.C()
            int r13 = r8.E()
            int r3 = r8.n
            int r4 = r8.D()
            int r3 = r3 - r4
            int r4 = r8.o
            int r5 = r8.B()
            int r4 = r4 - r5
            androidx.recyclerview.widget.RecyclerView r5 = r8.f275b
            android.graphics.Rect r5 = r5.j
            r8.y(r10, r5)
            int r10 = r5.left
            int r10 = r10 - r2
            if (r10 >= r3) goto La8
            int r10 = r5.right
            int r10 = r10 - r2
            if (r10 <= r11) goto La8
            int r10 = r5.top
            int r10 = r10 - r1
            if (r10 >= r4) goto La8
            int r10 = r5.bottom
            int r10 = r10 - r1
            if (r10 > r13) goto La6
            goto La8
        La6:
            r10 = 1
            goto La9
        La8:
            r10 = 0
        La9:
            if (r10 == 0) goto Lb0
        Lab:
            if (r2 != 0) goto Lb1
            if (r1 == 0) goto Lb0
            goto Lb1
        Lb0:
            return r0
        Lb1:
            if (r12 == 0) goto Lb7
            r9.scrollBy(r2, r1)
            goto Lba
        Lb7:
            r9.h0(r2, r1, r0)
        Lba:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.c.k0(androidx.recyclerview.widget.RecyclerView, android.view.View, android.graphics.Rect, boolean, boolean):boolean");
    }

    public abstract int l(wh2 wh2Var);

    public final void l0() {
        RecyclerView recyclerView = this.f275b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public abstract int m(wh2 wh2Var);

    public abstract int m0(int i, e eVar, wh2 wh2Var);

    public abstract int n(wh2 wh2Var);

    public abstract void n0(int i);

    public abstract int o(wh2 wh2Var);

    public abstract int o0(int i, e eVar, wh2 wh2Var);

    public final void p(e eVar) {
        int v = v();
        while (true) {
            v--;
            if (v >= 0) {
                View u = u(v);
                h M = RecyclerView.M(u);
                if (M.z()) {
                    if (RecyclerView.M0) {
                        M.toString();
                    }
                } else if (M.m() && !M.o() && !this.f275b.m.f2092b) {
                    j0(v);
                    eVar.j(M);
                } else {
                    u(v);
                    this.f274a.c(v);
                    eVar.k(u);
                    this.f275b.g.m(M);
                }
            } else {
                return;
            }
        }
    }

    public final void p0(RecyclerView recyclerView) {
        q0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public View q(int i) {
        int v = v();
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            h M = RecyclerView.M(u);
            if (M != null && M.f() == i && !M.z() && (this.f275b.s0.g || !M.o())) {
                return u;
            }
        }
        return null;
    }

    public final void q0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.P0) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0 && !RecyclerView.P0) {
            this.o = 0;
        }
    }

    public abstract d r();

    public void r0(Rect rect, int i, int i2) {
        int D = D() + C() + rect.width();
        int B = B() + E() + rect.height();
        RecyclerView recyclerView = this.f275b;
        WeakHashMap weakHashMap = ll3.f3151a;
        RecyclerView.g(this.f275b, g(i, D, uk3.e(recyclerView)), g(i2, B, uk3.d(this.f275b)));
    }

    public d s(Context context, AttributeSet attributeSet) {
        return new d(context, attributeSet);
    }

    public final void s0(int i, int i2) {
        int v = v();
        if (v == 0) {
            this.f275b.q(i, i2);
            return;
        }
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MIN_VALUE;
        for (int i7 = 0; i7 < v; i7++) {
            View u = u(i7);
            Rect rect = this.f275b.j;
            y(u, rect);
            int i8 = rect.left;
            if (i8 < i3) {
                i3 = i8;
            }
            int i9 = rect.right;
            if (i9 > i5) {
                i5 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i6) {
                i6 = i11;
            }
        }
        this.f275b.j.set(i3, i4, i5, i6);
        r0(this.f275b.j, i, i2);
    }

    public d t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof d) {
            return new d((d) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new d((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new d(layoutParams);
    }

    public final void t0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.f275b = null;
            this.f274a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.f275b = recyclerView;
            this.f274a = recyclerView.f;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final View u(int i) {
        pz pzVar = this.f274a;
        if (pzVar != null) {
            return pzVar.d(i);
        }
        return null;
    }

    public final boolean u0(View view, int i, int i2, d dVar) {
        if (!view.isLayoutRequested() && this.h && K(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) dVar).width) && K(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) dVar).height)) {
            return false;
        }
        return true;
    }

    public final int v() {
        pz pzVar = this.f274a;
        if (pzVar != null) {
            return pzVar.e();
        }
        return 0;
    }

    public boolean v0() {
        return false;
    }

    public final boolean w0(View view, int i, int i2, d dVar) {
        if (this.h && K(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) dVar).width) && K(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) dVar).height)) {
            return false;
        }
        return true;
    }

    public int x(e eVar, wh2 wh2Var) {
        return -1;
    }

    public abstract void x0(RecyclerView recyclerView, int i);

    public void y(View view, Rect rect) {
        boolean z = RecyclerView.L0;
        d dVar = (d) view.getLayoutParams();
        Rect rect2 = dVar.f277b;
        rect.set((view.getLeft() - rect2.left) - ((ViewGroup.MarginLayoutParams) dVar).leftMargin, (view.getTop() - rect2.top) - ((ViewGroup.MarginLayoutParams) dVar).topMargin, view.getRight() + rect2.right + ((ViewGroup.MarginLayoutParams) dVar).rightMargin, view.getBottom() + rect2.bottom + ((ViewGroup.MarginLayoutParams) dVar).bottomMargin);
    }

    public final void y0(nk1 nk1Var) {
        nk1 nk1Var2 = this.e;
        if (nk1Var2 != null && nk1Var != nk1Var2 && nk1Var2.e) {
            nk1Var2.i();
        }
        this.e = nk1Var;
        RecyclerView recyclerView = this.f275b;
        nk1Var.getClass();
        zh2 zh2Var = recyclerView.p0;
        zh2Var.g.removeCallbacks(zh2Var);
        zh2Var.c.abortAnimation();
        nk1Var.f3478b = recyclerView;
        nk1Var.c = this;
        int i = nk1Var.f3477a;
        if (i != -1) {
            recyclerView.s0.f5010a = i;
            nk1Var.e = true;
            nk1Var.d = true;
            nk1Var.f = recyclerView.n.q(i);
            nk1Var.f3478b.p0.b();
            return;
        }
        throw new IllegalArgumentException("Invalid target position");
    }

    public final int z() {
        fh2 fh2Var;
        RecyclerView recyclerView = this.f275b;
        if (recyclerView != null) {
            fh2Var = recyclerView.getAdapter();
        } else {
            fh2Var = null;
        }
        if (fh2Var != null) {
            return fh2Var.c();
        }
        return 0;
    }

    public boolean z0() {
        return false;
    }
}
