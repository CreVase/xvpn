package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes2.dex */
public final class it2 extends fl {
    public final /* synthetic */ SideSheetBehavior r;

    public it2(SideSheetBehavior sideSheetBehavior) {
        this.r = sideSheetBehavior;
    }

    @Override // defpackage.fl
    public final int G(View view) {
        SideSheetBehavior sideSheetBehavior = this.r;
        return sideSheetBehavior.l + sideSheetBehavior.o;
    }

    @Override // defpackage.fl
    public final void P(int i) {
        if (i == 1) {
            SideSheetBehavior sideSheetBehavior = this.r;
            if (sideSheetBehavior.g) {
                sideSheetBehavior.u(1);
            }
        }
    }

    @Override // defpackage.fl
    public final void Q(View view, int i, int i2) {
        View view2;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        SideSheetBehavior sideSheetBehavior = this.r;
        WeakReference weakReference = sideSheetBehavior.q;
        if (weakReference != null) {
            view2 = (View) weakReference.get();
        } else {
            view2 = null;
        }
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
            lj1 lj1Var = sideSheetBehavior.f1556a;
            int left = view.getLeft();
            int right = view.getRight();
            int i3 = lj1Var.q;
            SideSheetBehavior sideSheetBehavior2 = lj1Var.r;
            switch (i3) {
                case 0:
                    if (left <= sideSheetBehavior2.m) {
                        marginLayoutParams.leftMargin = right;
                        break;
                    }
                    break;
                default:
                    int i4 = sideSheetBehavior2.m;
                    if (left <= i4) {
                        marginLayoutParams.rightMargin = i4 - left;
                        break;
                    }
                    break;
            }
            view2.setLayoutParams(marginLayoutParams);
        }
        LinkedHashSet linkedHashSet = sideSheetBehavior.u;
        if (!linkedHashSet.isEmpty()) {
            sideSheetBehavior.f1556a.Z(i);
            Iterator it = linkedHashSet.iterator();
            if (it.hasNext()) {
                p71.C(it.next());
                throw null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:            if (r5 == false) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:            if (java.lang.Math.abs(r5 - r0.f1556a.a0()) < java.lang.Math.abs(r5 - r0.f1556a.b0())) goto L21;     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:            if (r0.f1556a.g0(r4) == false) goto L21;     */
    @Override // defpackage.fl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void R(android.view.View r4, float r5, float r6) {
        /*
            r3 = this;
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r3.r
            lj1 r1 = r0.f1556a
            boolean r1 = r1.f0(r5)
            r2 = 1
            if (r1 == 0) goto Lc
            goto L58
        Lc:
            lj1 r1 = r0.f1556a
            boolean r1 = r1.i0(r4, r5)
            if (r1 == 0) goto L25
            lj1 r1 = r0.f1556a
            boolean r5 = r1.h0(r5, r6)
            if (r5 != 0) goto L5a
            lj1 r5 = r0.f1556a
            boolean r5 = r5.g0(r4)
            if (r5 == 0) goto L58
            goto L5a
        L25:
            r1 = 0
            int r1 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r1 == 0) goto L3b
            float r5 = java.lang.Math.abs(r5)
            float r6 = java.lang.Math.abs(r6)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 <= 0) goto L38
            r5 = 1
            goto L39
        L38:
            r5 = 0
        L39:
            if (r5 != 0) goto L5a
        L3b:
            int r5 = r4.getLeft()
            lj1 r6 = r0.f1556a
            int r6 = r6.a0()
            int r6 = r5 - r6
            int r6 = java.lang.Math.abs(r6)
            lj1 r1 = r0.f1556a
            int r1 = r1.b0()
            int r5 = r5 - r1
            int r5 = java.lang.Math.abs(r5)
            if (r6 >= r5) goto L5a
        L58:
            r5 = 3
            goto L5b
        L5a:
            r5 = 5
        L5b:
            r0.v(r4, r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.it2.R(android.view.View, float, float):void");
    }

    @Override // defpackage.fl
    public final boolean e0(View view, int i) {
        WeakReference weakReference;
        SideSheetBehavior sideSheetBehavior = this.r;
        if (sideSheetBehavior.h == 1 || (weakReference = sideSheetBehavior.p) == null || weakReference.get() != view) {
            return false;
        }
        return true;
    }

    @Override // defpackage.fl
    public final int q(View view, int i) {
        int a0;
        int i2;
        SideSheetBehavior sideSheetBehavior = this.r;
        lj1 lj1Var = sideSheetBehavior.f1556a;
        switch (lj1Var.q) {
            case 0:
                a0 = -lj1Var.r.l;
                break;
            default:
                a0 = lj1Var.a0();
                break;
        }
        lj1 lj1Var2 = sideSheetBehavior.f1556a;
        int i3 = lj1Var2.q;
        SideSheetBehavior sideSheetBehavior2 = lj1Var2.r;
        switch (i3) {
            case 0:
                i2 = sideSheetBehavior2.o;
                break;
            default:
                i2 = sideSheetBehavior2.m;
                break;
        }
        return ew3.E0(i, a0, i2);
    }

    @Override // defpackage.fl
    public final int r(View view, int i) {
        return view.getTop();
    }
}
