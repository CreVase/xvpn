package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class r9 extends rn {
    public final String d = "CommonIconDialog";
    public final p9 e = new p9();
    public LinearLayout f;
    public DialogInterface.OnDismissListener g;

    @Override // androidx.fragment.app.f
    public final void dismiss() {
        try {
            dismissAllowingStateLoss();
        } catch (Exception unused) {
        }
    }

    @Override // defpackage.rn, androidx.fragment.app.f, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        super.onCancel(dialogInterface);
        x31 x31Var = this.e.k;
        if (x31Var != null) {
            x31Var.invoke(dialogInterface);
        }
    }

    @Override // defpackage.md, androidx.fragment.app.f
    public final Dialog onCreateDialog(Bundle bundle) {
        nc0 nc0Var = new nc0(requireContext());
        nc0Var.setCanceledOnTouchOutside(false);
        x31 x31Var = this.e.n;
        if (x31Var != null) {
            x31Var.invoke(nc0Var);
        }
        return nc0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        boolean z;
        LinearLayout.LayoutParams layoutParams3;
        LinearLayout.LayoutParams layoutParams4;
        LinearLayout.LayoutParams layoutParams5;
        LinearLayout.LayoutParams layoutParams6;
        boolean z2;
        LinearLayout.LayoutParams layoutParams7;
        boolean z3;
        LinearLayout.LayoutParams layoutParams8;
        FrameLayout.LayoutParams layoutParams9;
        boolean z4;
        jl0 jl0Var = new jl0(layoutInflater.getContext());
        jl0Var.setCornerRadius(8 * tf3.F);
        fl.g(this, jl0Var, 1000003);
        final int i = 0;
        eu3 eu3Var = new eu3(jl0Var.getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        eu3Var.setOrientation(1);
        View space = new Space(eu3Var.getContext());
        eu3Var.addView(space);
        int K = tf3.K(14);
        ViewGroup.LayoutParams layoutParams10 = space.getLayoutParams();
        if (layoutParams10 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams10;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, K);
        }
        layoutParams.width = -2;
        layoutParams.height = K;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        space.setLayoutParams(layoutParams);
        AppCompatTextView appCompatTextView = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setId(R.id.dialogTitle);
        appCompatTextView.setTypeface(n01.c());
        appCompatTextView.setTextSize(19.0f);
        appCompatTextView.setGravity(17);
        p9 p9Var = this.e;
        appCompatTextView.setText(p9Var.f3798a);
        int K2 = tf3.K(10);
        int K3 = tf3.K(20);
        int K4 = tf3.K(20);
        ViewGroup.LayoutParams layoutParams11 = appCompatTextView.getLayoutParams();
        if (layoutParams11 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams11;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams2.width = -1;
        layoutParams2.height = -2;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(K3, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(K2, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(K4, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams2);
        fl.n(this, appCompatTextView, 1000013);
        CharSequence charSequence = p9Var.f3798a;
        if (charSequence != null && charSequence.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            tf3.V(appCompatTextView);
        }
        eu3Var.addView(appCompatTextView);
        du3 du3Var = new du3(eu3Var.getContext(), null, 6, 0);
        du3Var.setId(-1);
        View view = p9Var.l;
        if (view == null) {
            AppCompatTextView appCompatTextView2 = new AppCompatTextView(du3Var.getContext(), null);
            appCompatTextView2.setId(-1);
            appCompatTextView2.setText("");
            tf3.A0(appCompatTextView2);
            appCompatTextView2.setId(R.id.dialogMessage);
            appCompatTextView2.setTextColor(v73.j(1000015));
            appCompatTextView2.setLineHeight(tf3.K(20));
            appCompatTextView2.setText(t9.q0(p9Var.f3799b));
            appCompatTextView2.setMovementMethod(p9Var.c);
            fl.j(appCompatTextView2, this);
            fl.n(this, appCompatTextView2, 1000015);
            ViewGroup.LayoutParams layoutParams12 = appCompatTextView2.getLayoutParams();
            if (layoutParams12 instanceof FrameLayout.LayoutParams) {
                layoutParams9 = (FrameLayout.LayoutParams) layoutParams12;
            } else {
                layoutParams9 = null;
            }
            if (layoutParams9 == null) {
                layoutParams9 = new FrameLayout.LayoutParams(-2, -2);
            }
            layoutParams9.width = -2;
            layoutParams9.height = -2;
            layoutParams9.gravity = Math.max(1, layoutParams9.gravity);
            layoutParams9.setMarginStart(Math.max(-1, layoutParams9.leftMargin));
            layoutParams9.topMargin = Math.max(-1, layoutParams9.topMargin);
            layoutParams9.setMarginEnd(Math.max(-1, layoutParams9.rightMargin));
            layoutParams9.bottomMargin = Math.max(-1, layoutParams9.bottomMargin);
            appCompatTextView2.setLayoutParams(layoutParams9);
            CharSequence charSequence2 = p9Var.f3799b;
            if (charSequence2 != null && charSequence2.length() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (z4) {
                tf3.V(appCompatTextView2);
            }
            du3Var.addView(appCompatTextView2);
        } else {
            du3Var.addView(view);
        }
        if (du3Var.getAttachToParent()) {
            eu3Var.addView(du3Var);
        }
        int K5 = tf3.K(16);
        int K6 = tf3.K(20);
        int K7 = tf3.K(20);
        ViewGroup.LayoutParams layoutParams13 = du3Var.getLayoutParams();
        if (layoutParams13 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams13;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams3.width = -1;
        layoutParams3.height = -2;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(K6, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(K5, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(K7, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        du3Var.setLayoutParams(layoutParams3);
        View space2 = new Space(eu3Var.getContext());
        eu3Var.addView(space2);
        int K8 = tf3.K(30);
        ViewGroup.LayoutParams layoutParams14 = space2.getLayoutParams();
        if (layoutParams14 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams14;
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(-2, K8);
        }
        layoutParams4.width = -2;
        layoutParams4.height = K8;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(-1, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        space2.setLayoutParams(layoutParams4);
        View hu3Var = new hu3(eu3Var.getContext());
        fl.g(this, hu3Var, 1000010);
        int max = Math.max(1, tf3.K(1));
        ViewGroup.LayoutParams layoutParams15 = hu3Var.getLayoutParams();
        if (layoutParams15 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams15;
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 == null) {
            layoutParams5 = new LinearLayout.LayoutParams(-1, max);
        }
        layoutParams5.width = -1;
        layoutParams5.height = max;
        layoutParams5.weight = Math.max(-1.0f, layoutParams5.weight);
        layoutParams5.gravity = Math.max(-1, layoutParams5.gravity);
        layoutParams5.leftMargin = Math.max(-1, layoutParams5.leftMargin);
        layoutParams5.topMargin = Math.max(-1, layoutParams5.topMargin);
        layoutParams5.rightMargin = Math.max(-1, layoutParams5.rightMargin);
        layoutParams5.bottomMargin = Math.max(-1, layoutParams5.bottomMargin);
        hu3Var.setLayoutParams(layoutParams5);
        eu3Var.addView(hu3Var);
        eu3 h = hx2.h(eu3Var.getContext(), null, 6, 0, 0);
        h.setId(-1);
        Drawable am0Var = new am0(1000010, Math.max(1.0f, 1 * tf3.F));
        fl.j(h, this);
        h.setDividerDrawable(am0Var);
        h.setShowDividers(2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setId(R.id.dialogLeftText);
        float f = 18.0f;
        appCompatTextView3.setTextSize(18.0f);
        appCompatTextView3.setFocusable(true);
        appCompatTextView3.setGravity(17);
        int K9 = tf3.K(43);
        ViewGroup.LayoutParams layoutParams16 = appCompatTextView3.getLayoutParams();
        if (layoutParams16 instanceof LinearLayout.LayoutParams) {
            layoutParams6 = (LinearLayout.LayoutParams) layoutParams16;
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 == null) {
            layoutParams6 = new LinearLayout.LayoutParams(0, K9);
        }
        layoutParams6.width = 0;
        layoutParams6.height = K9;
        layoutParams6.weight = Math.max(1.0f, layoutParams6.weight);
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.leftMargin = Math.max(-1, layoutParams6.leftMargin);
        layoutParams6.topMargin = Math.max(-1, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(-1, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(-1, layoutParams6.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams6);
        appCompatTextView3.setText(p9Var.h);
        appCompatTextView3.setBackground(v73.v(0.0f, 1000003, 3));
        fl.j(appCompatTextView3, this);
        appCompatTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: n9

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r9 f3414b;

            {
                this.f3414b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = i;
                r9 r9Var = this.f3414b;
                switch (i2) {
                    case 0:
                        DialogInterface.OnDismissListener onDismissListener = r9Var.g;
                        if (onDismissListener != null) {
                            onDismissListener.onDismiss(r9Var.getDialog());
                        }
                        r9Var.dismissAllowingStateLoss();
                        v31 v31Var = r9Var.e.j;
                        if (v31Var != null) {
                            v31Var.invoke();
                            return;
                        }
                        return;
                    default:
                        v31 v31Var2 = r9Var.e.g;
                        if (v31Var2 != null) {
                            if (((Boolean) v31Var2.invoke()).booleanValue()) {
                                r9Var.dismissAllowingStateLoss();
                                return;
                            }
                            return;
                        }
                        DialogInterface.OnDismissListener onDismissListener2 = r9Var.g;
                        if (onDismissListener2 != null) {
                            onDismissListener2.onDismiss(r9Var.getDialog());
                        }
                        r9Var.dismissAllowingStateLoss();
                        v31 v31Var3 = r9Var.e.f;
                        if (v31Var3 != null) {
                            v31Var3.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        fl.n(this, appCompatTextView3, p9Var.i);
        CharSequence charSequence3 = p9Var.h;
        if (charSequence3 != null && charSequence3.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            tf3.V(appCompatTextView3);
        }
        h.addView(appCompatTextView3);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView4.setId(-1);
        appCompatTextView4.setText("");
        tf3.A0(appCompatTextView4);
        appCompatTextView4.setId(R.id.dialogRightText);
        appCompatTextView4.setTypeface(n01.c());
        appCompatTextView4.setTextSize(18.0f);
        appCompatTextView4.setFocusable(true);
        appCompatTextView4.setGravity(17);
        int K10 = tf3.K(43);
        ViewGroup.LayoutParams layoutParams17 = appCompatTextView4.getLayoutParams();
        if (layoutParams17 instanceof LinearLayout.LayoutParams) {
            layoutParams7 = (LinearLayout.LayoutParams) layoutParams17;
        } else {
            layoutParams7 = null;
        }
        if (layoutParams7 == null) {
            layoutParams7 = new LinearLayout.LayoutParams(0, K10);
        }
        layoutParams7.width = 0;
        layoutParams7.height = K10;
        layoutParams7.weight = Math.max(1.0f, layoutParams7.weight);
        layoutParams7.gravity = Math.max(-1, layoutParams7.gravity);
        layoutParams7.leftMargin = Math.max(-1, layoutParams7.leftMargin);
        layoutParams7.topMargin = Math.max(-1, layoutParams7.topMargin);
        layoutParams7.rightMargin = Math.max(-1, layoutParams7.rightMargin);
        layoutParams7.bottomMargin = Math.max(-1, layoutParams7.bottomMargin);
        appCompatTextView4.setLayoutParams(layoutParams7);
        appCompatTextView4.setText(p9Var.d);
        appCompatTextView4.setBackground(v73.v(0.0f, 1000003, 3));
        fl.j(appCompatTextView4, this);
        final int i2 = 1;
        appCompatTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: n9

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r9 f3414b;

            {
                this.f3414b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i22 = i2;
                r9 r9Var = this.f3414b;
                switch (i22) {
                    case 0:
                        DialogInterface.OnDismissListener onDismissListener = r9Var.g;
                        if (onDismissListener != null) {
                            onDismissListener.onDismiss(r9Var.getDialog());
                        }
                        r9Var.dismissAllowingStateLoss();
                        v31 v31Var = r9Var.e.j;
                        if (v31Var != null) {
                            v31Var.invoke();
                            return;
                        }
                        return;
                    default:
                        v31 v31Var2 = r9Var.e.g;
                        if (v31Var2 != null) {
                            if (((Boolean) v31Var2.invoke()).booleanValue()) {
                                r9Var.dismissAllowingStateLoss();
                                return;
                            }
                            return;
                        }
                        DialogInterface.OnDismissListener onDismissListener2 = r9Var.g;
                        if (onDismissListener2 != null) {
                            onDismissListener2.onDismiss(r9Var.getDialog());
                        }
                        r9Var.dismissAllowingStateLoss();
                        v31 v31Var3 = r9Var.e.f;
                        if (v31Var3 != null) {
                            v31Var3.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        fl.n(this, appCompatTextView4, p9Var.e);
        CharSequence charSequence4 = p9Var.d;
        if (charSequence4 != null && charSequence4.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            tf3.V(appCompatTextView4);
        }
        h.addView(appCompatTextView4);
        Iterator it = p9Var.m.iterator();
        while (it.hasNext()) {
            o9 o9Var = (o9) it.next();
            AppCompatTextView appCompatTextView5 = new AppCompatTextView(h.getContext(), null);
            appCompatTextView5.setId(-1);
            appCompatTextView5.setText("");
            tf3.A0(appCompatTextView5);
            appCompatTextView5.setId(o9Var.f3619a);
            appCompatTextView5.setTextSize(f);
            appCompatTextView5.setFocusable(true);
            appCompatTextView5.setGravity(17);
            int K11 = tf3.K(43);
            ViewGroup.LayoutParams layoutParams18 = appCompatTextView5.getLayoutParams();
            if (layoutParams18 instanceof LinearLayout.LayoutParams) {
                layoutParams8 = (LinearLayout.LayoutParams) layoutParams18;
            } else {
                layoutParams8 = null;
            }
            if (layoutParams8 == null) {
                layoutParams8 = new LinearLayout.LayoutParams(0, K11);
            }
            layoutParams8.width = 0;
            layoutParams8.height = K11;
            layoutParams8.weight = Math.max(1.0f, layoutParams8.weight);
            layoutParams8.gravity = Math.max(-1, layoutParams8.gravity);
            layoutParams8.leftMargin = Math.max(-1, layoutParams8.leftMargin);
            layoutParams8.topMargin = Math.max(-1, layoutParams8.topMargin);
            layoutParams8.rightMargin = Math.max(-1, layoutParams8.rightMargin);
            layoutParams8.bottomMargin = Math.max(-1, layoutParams8.bottomMargin);
            appCompatTextView5.setLayoutParams(layoutParams8);
            appCompatTextView5.setText(o9Var.f3620b);
            appCompatTextView5.setBackground(v73.v(0.0f, 1000003, 3));
            fl.j(appCompatTextView5, this);
            appCompatTextView5.setOnClickListener(new ww2(15, this, o9Var));
            fl.n(this, appCompatTextView5, o9Var.c);
            h.addView(appCompatTextView5);
            f = 18.0f;
        }
        if (h.getAttachToParent()) {
            eu3Var.addView(h);
        }
        this.f = h;
        if (eu3Var.getAttachToParent()) {
            jl0Var.addView(eu3Var);
        }
        return jl0Var;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.e.getClass();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:            if ((!r7.m.isEmpty()) == false) goto L41;     */
    @Override // defpackage.rn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            p9 r7 = r6.e
            java.lang.CharSequence r0 = r7.d
            r1 = 0
            if (r0 != 0) goto L9
            r0 = 0
            goto Ld
        L9:
            int r0 = r0.length()
        Ld:
            r2 = 1
            r3 = 12
            if (r0 > r3) goto L27
            java.lang.CharSequence r0 = r7.h
            if (r0 != 0) goto L18
            r0 = 0
            goto L1c
        L18:
            int r0 = r0.length()
        L1c:
            if (r0 > r3) goto L27
            java.util.ArrayList r0 = r7.m
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r2
            if (r0 == 0) goto L78
        L27:
            android.widget.LinearLayout r0 = r6.f
            r3 = 0
            if (r0 == 0) goto L2d
            goto L2e
        L2d:
            r0 = r3
        L2e:
            android.view.View r0 = r0.getChildAt(r2)
            android.widget.LinearLayout r4 = r6.f
            if (r4 == 0) goto L37
            goto L38
        L37:
            r4 = r3
        L38:
            r4.removeView(r0)
            android.widget.LinearLayout r4 = r6.f
            if (r4 == 0) goto L40
            goto L41
        L40:
            r4 = r3
        L41:
            r4.addView(r0, r1)
            android.widget.LinearLayout r0 = r6.f
            if (r0 == 0) goto L49
            goto L4a
        L49:
            r0 = r3
        L4a:
            r0.setOrientation(r2)
            android.widget.LinearLayout r0 = r6.f
            if (r0 == 0) goto L52
            r3 = r0
        L52:
            int r0 = r3.getChildCount()
        L56:
            if (r1 >= r0) goto L78
            android.view.View r2 = r3.getChildAt(r1)
            android.view.ViewGroup$LayoutParams r4 = r2.getLayoutParams()
            if (r4 == 0) goto L70
            android.widget.LinearLayout$LayoutParams r4 = (android.widget.LinearLayout.LayoutParams) r4
            r5 = -1
            r4.width = r5
            r5 = 0
            r4.weight = r5
            r2.setLayoutParams(r4)
            int r1 = r1 + 1
            goto L56
        L70:
            java.lang.NullPointerException r7 = new java.lang.NullPointerException
            java.lang.String r8 = "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams"
            r7.<init>(r8)
            throw r7
        L78:
            yy2 r0 = new yy2
            r1 = 22
            r0.<init>(r6, r1)
            r7.o = r0
            boolean r7 = r7.p
            r6.setCancelable(r7)
            if (r8 == 0) goto L8b
            r6.dismissAllowingStateLoss()
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9.s(android.view.View, android.os.Bundle):void");
    }

    public final boolean t() {
        Dialog dialog = getDialog();
        if (dialog == null || !dialog.isShowing()) {
            return false;
        }
        return true;
    }

    public final void z(e50 e50Var) {
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnDismissListener(e50Var);
        }
        this.g = e50Var;
    }
}
