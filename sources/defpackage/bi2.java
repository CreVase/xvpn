package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c;

/* loaded from: classes.dex */
public final class bi2 extends l2 {
    public final RecyclerView d;
    public final ai2 e;

    public bi2(RecyclerView recyclerView) {
        this.d = recyclerView;
        ai2 ai2Var = this.e;
        if (ai2Var != null) {
            this.e = ai2Var;
        } else {
            this.e = new ai2(this);
        }
    }

    @Override // defpackage.l2
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.d;
            if (recyclerView.u && !recyclerView.C && !recyclerView.e.g()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().R(accessibilityEvent);
                }
            }
        }
    }

    @Override // defpackage.l2
    public final void d(View view, g3 g3Var) {
        boolean z;
        this.f3049a.onInitializeAccessibilityNodeInfo(view, g3Var.f2195a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.u && !recyclerView.C && !recyclerView.e.g()) {
            z = false;
        } else {
            z = true;
        }
        if (!z && recyclerView.getLayoutManager() != null) {
            c layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f275b;
            layoutManager.S(recyclerView2.c, recyclerView2.s0, g3Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[ADDED_TO_REGION] */
    @Override // defpackage.l2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean g(android.view.View r6, int r7, android.os.Bundle r8) {
        /*
            r5 = this;
            boolean r6 = super.g(r6, r7, r8)
            r8 = 1
            if (r6 == 0) goto L8
            return r8
        L8:
            androidx.recyclerview.widget.RecyclerView r6 = r5.d
            boolean r0 = r6.u
            r1 = 0
            if (r0 == 0) goto L1e
            boolean r0 = r6.C
            if (r0 != 0) goto L1e
            x7 r0 = r6.e
            boolean r0 = r0.g()
            if (r0 == 0) goto L1c
            goto L1e
        L1c:
            r0 = 0
            goto L1f
        L1e:
            r0 = 1
        L1f:
            if (r0 != 0) goto Lbd
            androidx.recyclerview.widget.c r0 = r6.getLayoutManager()
            if (r0 == 0) goto Lbd
            androidx.recyclerview.widget.c r6 = r6.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r0 = r6.f275b
            androidx.recyclerview.widget.e r0 = r0.c
            int r0 = r6.o
            int r2 = r6.n
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            androidx.recyclerview.widget.RecyclerView r4 = r6.f275b
            android.graphics.Matrix r4 = r4.getMatrix()
            boolean r4 = r4.isIdentity()
            if (r4 == 0) goto L54
            androidx.recyclerview.widget.RecyclerView r4 = r6.f275b
            boolean r4 = r4.getGlobalVisibleRect(r3)
            if (r4 == 0) goto L54
            int r0 = r3.height()
            int r2 = r3.width()
        L54:
            r3 = 4096(0x1000, float:5.74E-42)
            if (r7 == r3) goto L89
            r3 = 8192(0x2000, float:1.148E-41)
            if (r7 == r3) goto L5f
            r7 = 0
        L5d:
            r0 = 0
            goto Lb1
        L5f:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f275b
            r3 = -1
            boolean r7 = r7.canScrollVertically(r3)
            if (r7 == 0) goto L74
            int r7 = r6.E()
            int r0 = r0 - r7
            int r7 = r6.B()
            int r0 = r0 - r7
            int r7 = -r0
            goto L75
        L74:
            r7 = 0
        L75:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f275b
            boolean r0 = r0.canScrollHorizontally(r3)
            if (r0 == 0) goto L5d
            int r0 = r6.C()
            int r2 = r2 - r0
            int r0 = r6.D()
            int r2 = r2 - r0
            int r0 = -r2
            goto Lb1
        L89:
            androidx.recyclerview.widget.RecyclerView r7 = r6.f275b
            boolean r7 = r7.canScrollVertically(r8)
            if (r7 == 0) goto L9d
            int r7 = r6.E()
            int r0 = r0 - r7
            int r7 = r6.B()
            int r0 = r0 - r7
            r7 = r0
            goto L9e
        L9d:
            r7 = 0
        L9e:
            androidx.recyclerview.widget.RecyclerView r0 = r6.f275b
            boolean r0 = r0.canScrollHorizontally(r8)
            if (r0 == 0) goto L5d
            int r0 = r6.C()
            int r2 = r2 - r0
            int r0 = r6.D()
            int r0 = r2 - r0
        Lb1:
            if (r7 != 0) goto Lb7
            if (r0 != 0) goto Lb7
            r8 = 0
            goto Lbc
        Lb7:
            androidx.recyclerview.widget.RecyclerView r6 = r6.f275b
            r6.h0(r0, r7, r8)
        Lbc:
            return r8
        Lbd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bi2.g(android.view.View, int, android.os.Bundle):boolean");
    }
}
