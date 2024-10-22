package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class xq extends fl {
    public final /* synthetic */ BottomSheetBehavior r;

    public xq(BottomSheetBehavior bottomSheetBehavior) {
        this.r = bottomSheetBehavior;
    }

    @Override // defpackage.fl
    public final int H() {
        int i = BottomSheetBehavior.e0;
        BottomSheetBehavior bottomSheetBehavior = this.r;
        if (bottomSheetBehavior.I) {
            return bottomSheetBehavior.T;
        }
        return bottomSheetBehavior.G;
    }

    @Override // defpackage.fl
    public final void P(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.r;
            if (bottomSheetBehavior.K) {
                bottomSheetBehavior.E(1);
            }
        }
    }

    @Override // defpackage.fl
    public final void Q(View view, int i, int i2) {
        this.r.w(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006d, code lost:            if (java.lang.Math.abs(r5.getTop() - r1.z()) < java.lang.Math.abs(r5.getTop() - r1.E)) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0099, code lost:            if (java.lang.Math.abs(r6 - r1.E) < java.lang.Math.abs(r6 - r1.G)) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b3, code lost:            if (java.lang.Math.abs(r6 - r1.D) < java.lang.Math.abs(r6 - r1.G)) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00c2, code lost:            if (r6 < java.lang.Math.abs(r6 - r1.G)) goto L50;     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d3, code lost:            if (java.lang.Math.abs(r6 - r7) < java.lang.Math.abs(r6 - r1.G)) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:            if (r6 > r1.E) goto L53;     */
    @Override // defpackage.fl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(android.view.View r5, float r6, float r7) {
        /*
            r4 = this;
            r0 = 1
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r4.r
            r2 = 0
            int r3 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r3 >= 0) goto L1b
            boolean r6 = r1.f1529b
            if (r6 == 0) goto Le
            goto Lc4
        Le:
            int r6 = r5.getTop()
            java.lang.System.currentTimeMillis()
            int r7 = r1.E
            if (r6 <= r7) goto Lc4
            goto Ld5
        L1b:
            boolean r3 = r1.I
            if (r3 == 0) goto L70
            boolean r3 = r1.F(r5, r7)
            if (r3 == 0) goto L70
            float r6 = java.lang.Math.abs(r6)
            float r2 = java.lang.Math.abs(r7)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L38
            int r6 = r1.d
            float r6 = (float) r6
            int r6 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r6 > 0) goto L4c
        L38:
            int r6 = r5.getTop()
            int r7 = r1.T
            int r2 = r1.z()
            int r2 = r2 + r7
            int r2 = r2 / 2
            if (r6 <= r2) goto L49
            r6 = 1
            goto L4a
        L49:
            r6 = 0
        L4a:
            if (r6 == 0) goto L4f
        L4c:
            r6 = 5
            goto Ld8
        L4f:
            boolean r6 = r1.f1529b
            if (r6 == 0) goto L55
            goto Lc4
        L55:
            int r6 = r5.getTop()
            int r7 = r1.z()
            int r6 = r6 - r7
            int r6 = java.lang.Math.abs(r6)
            int r7 = r5.getTop()
            int r2 = r1.E
            int r7 = r7 - r2
            int r7 = java.lang.Math.abs(r7)
            if (r6 >= r7) goto Ld5
            goto Lc4
        L70:
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 == 0) goto L9c
            float r6 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.abs(r7)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L81
            goto L9c
        L81:
            boolean r6 = r1.f1529b
            if (r6 == 0) goto L86
            goto Ld7
        L86:
            int r6 = r5.getTop()
            int r7 = r1.E
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r2 = r1.G
            int r6 = r6 - r2
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto Ld7
            goto Ld5
        L9c:
            int r6 = r5.getTop()
            boolean r7 = r1.f1529b
            if (r7 == 0) goto Lb6
            int r7 = r1.D
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r2 = r1.G
            int r6 = r6 - r2
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto Ld7
            goto Lc4
        Lb6:
            int r7 = r1.E
            if (r6 >= r7) goto Lc6
            int r7 = r1.G
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            if (r6 >= r7) goto Ld5
        Lc4:
            r6 = 3
            goto Ld8
        Lc6:
            int r7 = r6 - r7
            int r7 = java.lang.Math.abs(r7)
            int r2 = r1.G
            int r6 = r6 - r2
            int r6 = java.lang.Math.abs(r6)
            if (r7 >= r6) goto Ld7
        Ld5:
            r6 = 6
            goto Ld8
        Ld7:
            r6 = 4
        Ld8:
            r1.getClass()
            r1.G(r5, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xq.R(android.view.View, float, float):void");
    }

    @Override // defpackage.fl
    public final boolean e0(View view, int i) {
        View view2;
        BottomSheetBehavior bottomSheetBehavior = this.r;
        int i2 = bottomSheetBehavior.L;
        if (i2 == 1 || bottomSheetBehavior.a0) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.Y == i) {
            WeakReference weakReference = bottomSheetBehavior.V;
            if (weakReference != null) {
                view2 = (View) weakReference.get();
            } else {
                view2 = null;
            }
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = bottomSheetBehavior.U;
        if (weakReference2 == null || weakReference2.get() != view) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fl
    public final int q(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.fl
    public final int r(View view, int i) {
        return ew3.E0(i, this.r.z(), H());
    }
}
