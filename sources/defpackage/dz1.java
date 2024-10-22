package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import com.security.xvpn.z35kb.widget.FullDragDrawerLayout;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class dz1 extends l2 {
    public final /* synthetic */ int d;

    public /* synthetic */ dz1(int i) {
        this.d = i;
    }

    @Override // defpackage.l2
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        switch (this.d) {
            case 0:
                super.c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                if (nestedScrollView.getScrollRange() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                k3.c(accessibilityEvent, nestedScrollView.getScrollX());
                k3.d(accessibilityEvent, nestedScrollView.getScrollRange());
                return;
            default:
                super.c(view, accessibilityEvent);
                return;
        }
    }

    @Override // defpackage.l2
    public final void d(View view, g3 g3Var) {
        int scrollRange;
        boolean z = true;
        AccessibilityNodeInfo accessibilityNodeInfo = g3Var.f2195a;
        int i = this.d;
        View.AccessibilityDelegate accessibilityDelegate = this.f3049a;
        switch (i) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                g3Var.i(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        g3Var.b(a3.i);
                        g3Var.b(a3.m);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        g3Var.b(a3.h);
                        g3Var.b(a3.n);
                        return;
                    }
                    return;
                }
                return;
            default:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                int[] iArr = FullDragDrawerLayout.C;
                WeakHashMap weakHashMap = ll3.f3151a;
                if (uk3.c(view) == 4 || uk3.c(view) == 2) {
                    z = false;
                }
                if (!z) {
                    g3Var.f2196b = -1;
                    accessibilityNodeInfo.setParent(null);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:            if (r6 != 16908346) goto L32;     */
    @Override // defpackage.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.View r5, int r6, android.os.Bundle r7) {
        /*
            r4 = this;
            int r0 = r4.d
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            boolean r5 = super.g(r5, r6, r7)
            return r5
        La:
            boolean r7 = super.g(r5, r6, r7)
            r0 = 1
            if (r7 == 0) goto L13
            goto La1
        L13:
            androidx.core.widget.NestedScrollView r5 = (androidx.core.widget.NestedScrollView) r5
            boolean r7 = r5.isEnabled()
            r1 = 0
            if (r7 != 0) goto L1e
            goto La0
        L1e:
            int r7 = r5.getHeight()
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r3 = r5.getMatrix()
            boolean r3 = r3.isIdentity()
            if (r3 == 0) goto L3b
            boolean r3 = r5.getGlobalVisibleRect(r2)
            if (r3 == 0) goto L3b
            int r7 = r2.height()
        L3b:
            r2 = 4096(0x1000, float:5.74E-42)
            if (r6 == r2) goto L75
            r2 = 8192(0x2000, float:1.148E-41)
            if (r6 == r2) goto L4e
            r2 = 16908344(0x1020038, float:2.3877386E-38)
            if (r6 == r2) goto L4e
            r2 = 16908346(0x102003a, float:2.3877392E-38)
            if (r6 == r2) goto L75
            goto La0
        L4e:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 - r7
            int r6 = java.lang.Math.max(r6, r1)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.G(r1, r6, r0)
            goto La1
        L75:
            int r6 = r5.getPaddingBottom()
            int r7 = r7 - r6
            int r6 = r5.getPaddingTop()
            int r7 = r7 - r6
            int r6 = r5.getScrollY()
            int r6 = r6 + r7
            int r7 = r5.getScrollRange()
            int r6 = java.lang.Math.min(r6, r7)
            int r7 = r5.getScrollY()
            if (r6 == r7) goto La0
            int r7 = r5.getScrollX()
            int r1 = r1 - r7
            int r7 = r5.getScrollY()
            int r6 = r6 - r7
            r5.G(r1, r6, r0)
            goto La1
        La0:
            r0 = 0
        La1:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dz1.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
