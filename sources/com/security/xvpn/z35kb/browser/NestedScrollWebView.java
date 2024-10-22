package com.security.xvpn.z35kb.browser;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import com.security.xvpn.z35kb.widget.FixResourceErrWebView;
import defpackage.al3;
import defpackage.gz1;
import defpackage.hz1;
import defpackage.ll3;
import defpackage.uk3;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public class NestedScrollWebView extends FixResourceErrWebView implements gz1 {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f1601a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f1602b;
    public int c;
    public VelocityTracker d;
    public final int e;
    public final int f;
    public final OverScroller g;
    public int h;
    public final hz1 i;

    public NestedScrollWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1601a = new int[2];
        this.f1602b = new int[2];
        this.i = new hz1(this);
        setNestedScrollingEnabled(true);
        this.g = new OverScroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.webkit.WebView, android.view.View
    public final void computeScroll() {
        int i;
        int i2;
        super.computeScroll();
        OverScroller overScroller = this.g;
        if (overScroller.computeScrollOffset()) {
            overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i3 = currY - this.h;
            if (i3 != 0) {
                int scrollY = getScrollY();
                if (scrollY == 0) {
                    i2 = i3;
                    i = 0;
                } else {
                    int i4 = scrollY + i3;
                    if (i4 < 0) {
                        i = -scrollY;
                        i2 = i4;
                    } else {
                        i = i3;
                        i2 = 0;
                    }
                }
                this.i.e(0, i, 0, i2, null, 1, null);
            }
            this.h = currY;
            WeakHashMap weakHashMap = ll3.f3151a;
            uk3.k(this);
            return;
        }
        hz1 hz1Var = this.i;
        if (hz1Var.g(1)) {
            hz1Var.i(1);
        }
        this.h = 0;
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.i.a(f, f2, z);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.i.b(f, f2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.i.c(i, i2, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.i.e(i, i2, i3, i4, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.i.g(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.i.d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:            if (r1 != 3) goto L34;     */
    @Override // android.webkit.WebView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r15) {
        /*
            r14 = this;
            android.view.VelocityTracker r0 = r14.d
            if (r0 != 0) goto La
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r14.d = r0
        La:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r15)
            int r1 = r15.getAction()
            r2 = 2
            android.widget.OverScroller r3 = r14.g
            if (r1 == 0) goto Laf
            r4 = 1
            if (r1 == r4) goto L64
            if (r1 == r2) goto L21
            r15 = 3
            if (r1 == r15) goto La1
            goto Lca
        L21:
            float r15 = r15.getRawY()
            int r15 = (int) r15
            int r1 = r14.c
            int r1 = r1 - r15
            int[] r2 = r14.f1602b
            r3 = 0
            int[] r5 = r14.f1601a
            boolean r2 = r14.dispatchNestedPreScroll(r3, r1, r5, r2)
            r6 = 0
            if (r2 == 0) goto L3b
            r2 = r5[r4]
            float r2 = (float) r2
            r0.offsetLocation(r6, r2)
        L3b:
            r14.c = r15
            int r15 = r14.getScrollY()
            if (r15 != 0) goto L45
            r11 = r1
            goto L50
        L45:
            int r15 = r15 + r1
            if (r15 >= 0) goto L4f
            int r2 = -r15
            float r2 = (float) r2
            r0.offsetLocation(r6, r2)
            r11 = r15
            goto L50
        L4f:
            r11 = 0
        L50:
            android.view.VelocityTracker r15 = r14.d
            r15.addMovement(r0)
            boolean r15 = super.onTouchEvent(r0)
            r8 = 0
            int r9 = r1 - r11
            r10 = 0
            int[] r12 = r14.f1602b
            r7 = r14
            r7.dispatchNestedScroll(r8, r9, r10, r11, r12)
            return r15
        L64:
            android.view.VelocityTracker r15 = r14.d
            int r1 = r14.f
            float r1 = (float) r1
            r5 = 1000(0x3e8, float:1.401E-42)
            r15.computeCurrentVelocity(r5, r1)
            float r15 = r15.getYVelocity()
            int r15 = (int) r15
            int r1 = java.lang.Math.abs(r15)
            int r5 = r14.e
            if (r1 <= r5) goto La1
            int r7 = -r15
            hz1 r15 = r14.i
            r15.h(r2, r4)
            int r4 = r14.getScrollX()
            int r5 = r14.getScrollY()
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = 0
            r13 = 0
            r3.fling(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            int r15 = r14.getScrollY()
            r14.h = r15
            java.util.WeakHashMap r15 = defpackage.ll3.f3151a
            defpackage.uk3.k(r14)
        La1:
            r14.stopNestedScroll()
            android.view.VelocityTracker r15 = r14.d
            if (r15 == 0) goto Lca
            r15.recycle()
            r15 = 0
            r14.d = r15
            goto Lca
        Laf:
            float r15 = r15.getRawY()
            int r15 = (int) r15
            r14.c = r15
            r14.startNestedScroll(r2)
            android.view.VelocityTracker r15 = r14.d
            r15.addMovement(r0)
            r3.computeScrollOffset()
            boolean r15 = r3.isFinished()
            if (r15 != 0) goto Lca
            r3.abortAnimation()
        Lca:
            boolean r15 = super.onTouchEvent(r0)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.browser.NestedScrollWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        hz1 hz1Var = this.i;
        if (hz1Var.d) {
            WeakHashMap weakHashMap = ll3.f3151a;
            al3.z(hz1Var.c);
        }
        hz1Var.d = z;
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i) {
        return this.i.h(i, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.i.i(0);
    }
}
