package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import java.util.HashMap;

/* loaded from: classes.dex */
public final class ov0 extends pb3 {
    public static final String[] y = {"android:visibility:visibility", "android:visibility:parent"};
    public int x;

    public ov0() {
        this.x = 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.mn3 J(defpackage.wb3 r8, defpackage.wb3 r9) {
        /*
            mn3 r0 = new mn3
            r0.<init>()
            r1 = 0
            r0.f3321a = r1
            r0.f3322b = r1
            java.lang.String r2 = "android:visibility:parent"
            r3 = 0
            r4 = -1
            java.lang.String r5 = "android:visibility:visibility"
            if (r8 == 0) goto L2f
            java.util.HashMap r6 = r8.f4978a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L2f
            java.lang.Object r7 = r6.get(r5)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r0.c = r7
            java.lang.Object r6 = r6.get(r2)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            r0.e = r6
            goto L33
        L2f:
            r0.c = r4
            r0.e = r3
        L33:
            if (r9 == 0) goto L52
            java.util.HashMap r6 = r9.f4978a
            boolean r7 = r6.containsKey(r5)
            if (r7 == 0) goto L52
            java.lang.Object r3 = r6.get(r5)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r0.d = r3
            java.lang.Object r2 = r6.get(r2)
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0.f = r2
            goto L56
        L52:
            r0.d = r4
            r0.f = r3
        L56:
            r2 = 1
            if (r8 == 0) goto L8a
            if (r9 == 0) goto L8a
            int r8 = r0.c
            int r9 = r0.d
            if (r8 != r9) goto L68
            android.view.ViewGroup r3 = r0.e
            android.view.ViewGroup r4 = r0.f
            if (r3 != r4) goto L68
            goto L9f
        L68:
            if (r8 == r9) goto L78
            if (r8 != 0) goto L71
            r0.f3322b = r1
            r0.f3321a = r2
            goto L9f
        L71:
            if (r9 != 0) goto L9f
            r0.f3322b = r2
            r0.f3321a = r2
            goto L9f
        L78:
            android.view.ViewGroup r8 = r0.f
            if (r8 != 0) goto L81
            r0.f3322b = r1
            r0.f3321a = r2
            goto L9f
        L81:
            android.view.ViewGroup r8 = r0.e
            if (r8 != 0) goto L9f
            r0.f3322b = r2
            r0.f3321a = r2
            goto L9f
        L8a:
            if (r8 != 0) goto L95
            int r8 = r0.d
            if (r8 != 0) goto L95
            r0.f3322b = r2
            r0.f3321a = r2
            goto L9f
        L95:
            if (r9 != 0) goto L9f
            int r8 = r0.c
            if (r8 != 0) goto L9f
            r0.f3322b = r1
            r0.f3321a = r2
        L9f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov0.J(wb3, wb3):mn3");
    }

    public final void H(wb3 wb3Var) {
        View view = wb3Var.f4979b;
        int visibility = view.getVisibility();
        HashMap hashMap = wb3Var.f4978a;
        hashMap.put("android:visibility:visibility", Integer.valueOf(visibility));
        hashMap.put("android:visibility:parent", view.getParent());
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        hashMap.put("android:visibility:screenLocation", iArr);
    }

    public final ObjectAnimator I(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        an3.f118a.t(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, an3.f119b, f2);
        ofFloat.addListener(new yv0(view));
        a(new nv0(0, this, view));
        return ofFloat;
    }

    @Override // defpackage.pb3
    public final void d(wb3 wb3Var) {
        H(wb3Var);
    }

    @Override // defpackage.pb3
    public final void g(wb3 wb3Var) {
        H(wb3Var);
        wb3Var.f4978a.put("android:fade:transitionAlpha", Float.valueOf(an3.f118a.s(wb3Var.f4979b)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:            if (J(n(r3, false), q(r3, false)).f3321a != false) goto L29;     */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0201  */
    @Override // defpackage.pb3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.Animator k(android.view.ViewGroup r24, defpackage.wb3 r25, defpackage.wb3 r26) {
        /*
            Method dump skipped, instructions count: 756
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ov0.k(android.view.ViewGroup, wb3, wb3):android.animation.Animator");
    }

    @Override // defpackage.pb3
    public final /* bridge */ /* synthetic */ String[] p() {
        return y;
    }

    @Override // defpackage.pb3
    public final boolean r(wb3 wb3Var, wb3 wb3Var2) {
        if ((wb3Var != null || wb3Var2 != null) && (wb3Var == null || wb3Var2 == null || wb3Var2.f4978a.containsKey("android:visibility:visibility") == wb3Var.f4978a.containsKey("android:visibility:visibility"))) {
            mn3 J = J(wb3Var, wb3Var2);
            if (J.f3321a && (J.c == 0 || J.d == 0)) {
                return true;
            }
        }
        return false;
    }

    public ov0(int i) {
        this.x = 3;
        if ((i & (-4)) == 0) {
            this.x = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }
}
