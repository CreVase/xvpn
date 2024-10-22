package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class bd3 extends rn {
    public final String d = "CommonIconDialog";
    public final ad3 e = new ad3();
    public DialogInterface.OnDismissListener f;

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
        x31 x31Var = this.e.g;
        if (x31Var != null) {
            x31Var.invoke(dialogInterface);
        }
    }

    @Override // defpackage.md, androidx.fragment.app.f
    public final Dialog onCreateDialog(Bundle bundle) {
        pc0 pc0Var = new pc0(requireContext());
        pc0Var.setCanceledOnTouchOutside(false);
        this.e.getClass();
        return pc0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        boolean z;
        FrameLayout.LayoutParams layoutParams3;
        boolean z2;
        LinearLayout.LayoutParams layoutParams4;
        boolean z3;
        CharSequence charSequence;
        LinearLayout.LayoutParams layoutParams5;
        int i;
        LinearLayout.LayoutParams layoutParams6;
        int i2;
        boolean z4;
        LinearLayout.LayoutParams layoutParams7;
        int i3;
        f70 f70Var;
        int i4;
        FrameLayout.LayoutParams layoutParams8;
        int i5;
        Context context = layoutInflater.getContext();
        du3 du3Var = new du3(context, null, 6, 0);
        du3Var.setId(-1);
        du3Var.setLayoutDirection(0);
        ViewGroup.LayoutParams layoutParams9 = du3Var.getLayoutParams();
        if (layoutParams9 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams9;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.setMarginStart(Math.max(-1, layoutParams.leftMargin));
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.setMarginEnd(Math.max(-1, layoutParams.rightMargin));
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        du3Var.setLayoutParams(layoutParams);
        du3Var.setBackgroundColor(-16316665);
        cu3 cu3Var = new cu3(du3Var.getContext(), null, 6);
        eu3 eu3Var = new eu3(cu3Var.getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setId(R.id.dialogTitle);
        appCompatTextView.setTextSize(28.5f);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setGravity(17);
        ad3 ad3Var = this.e;
        appCompatTextView.setText(ad3Var.f61a);
        ViewGroup.LayoutParams layoutParams10 = appCompatTextView.getLayoutParams();
        if (layoutParams10 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams10;
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
        layoutParams2.leftMargin = Math.max(-1, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams2);
        CharSequence charSequence2 = ad3Var.f61a;
        if (charSequence2 != null && charSequence2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            tf3.V(appCompatTextView);
        }
        eu3Var.addView(appCompatTextView);
        du3 du3Var2 = new du3(eu3Var.getContext(), null, 6, 0);
        du3Var2.setId(-1);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(du3Var2.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setId(R.id.dialogMessage);
        appCompatTextView2.setTextColor(-2763307);
        appCompatTextView2.setLineHeight(tf3.K(26));
        appCompatTextView2.setTextSize(17.5f);
        appCompatTextView2.setText(t9.q0(ad3Var.f62b));
        appCompatTextView2.setMovementMethod(null);
        ViewGroup.LayoutParams layoutParams11 = appCompatTextView2.getLayoutParams();
        if (layoutParams11 instanceof FrameLayout.LayoutParams) {
            layoutParams3 = (FrameLayout.LayoutParams) layoutParams11;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.gravity = Math.max(1, layoutParams3.gravity);
        layoutParams3.setMarginStart(Math.max(-1, layoutParams3.leftMargin));
        layoutParams3.topMargin = Math.max(-1, layoutParams3.topMargin);
        layoutParams3.setMarginEnd(Math.max(-1, layoutParams3.rightMargin));
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams3);
        CharSequence charSequence3 = ad3Var.f62b;
        if (charSequence3 != null && charSequence3.length() != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            tf3.V(appCompatTextView2);
        }
        du3Var2.addView(appCompatTextView2);
        if (du3Var2.getAttachToParent()) {
            eu3Var.addView(du3Var2);
        }
        int K = tf3.K(24);
        ViewGroup.LayoutParams layoutParams12 = du3Var2.getLayoutParams();
        if (layoutParams12 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams12;
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        }
        layoutParams4.width = -1;
        layoutParams4.height = -2;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(K, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        du3Var2.setLayoutParams(layoutParams4);
        eu3 h = hx2.h(eu3Var.getContext(), null, 6, 0, 0);
        h.setId(-1);
        CharSequence charSequence4 = ad3Var.e;
        if (charSequence4 != null && charSequence4.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3) {
            charSequence = pd0.y(R.string.Cancel);
        } else {
            charSequence = ad3Var.e;
        }
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setId(R.id.dialogLeftText);
        int K2 = tf3.K(45);
        int K3 = tf3.K(20);
        int K4 = tf3.K(10);
        int K5 = tf3.K(5);
        int K6 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams13 = appCompatTextView3.getLayoutParams();
        if (layoutParams13 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams13;
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 == null) {
            i = -2;
            layoutParams5 = new LinearLayout.LayoutParams(-2, K2);
        } else {
            i = -2;
        }
        layoutParams5.width = i;
        layoutParams5.height = K2;
        layoutParams5.weight = Math.max(-1.0f, layoutParams5.weight);
        layoutParams5.gravity = Math.max(-1, layoutParams5.gravity);
        layoutParams5.leftMargin = Math.max(K3, layoutParams5.leftMargin);
        layoutParams5.topMargin = Math.max(K5, layoutParams5.topMargin);
        layoutParams5.rightMargin = Math.max(K4, layoutParams5.rightMargin);
        layoutParams5.bottomMargin = Math.max(K6, layoutParams5.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams5);
        appCompatTextView3.setText(charSequence);
        m20.b0(appCompatTextView3);
        final int i6 = 0;
        appCompatTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: zc3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ bd3 f5464b;

            {
                this.f5464b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i7 = i6;
                bd3 bd3Var = this.f5464b;
                switch (i7) {
                    case 0:
                        DialogInterface.OnDismissListener onDismissListener = bd3Var.f;
                        if (onDismissListener != null) {
                            onDismissListener.onDismiss(bd3Var.getDialog());
                        }
                        bd3Var.dismissAllowingStateLoss();
                        v31 v31Var = bd3Var.e.f;
                        if (v31Var != null) {
                            v31Var.invoke();
                            return;
                        }
                        return;
                    default:
                        bd3Var.e.getClass();
                        DialogInterface.OnDismissListener onDismissListener2 = bd3Var.f;
                        if (onDismissListener2 != null) {
                            onDismissListener2.onDismiss(bd3Var.getDialog());
                        }
                        bd3Var.dismissAllowingStateLoss();
                        v31 v31Var2 = bd3Var.e.d;
                        if (v31Var2 != null) {
                            v31Var2.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        h.addView(appCompatTextView3);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView4.setId(-1);
        appCompatTextView4.setText("");
        tf3.A0(appCompatTextView4);
        appCompatTextView4.setId(R.id.dialogRightText);
        int K7 = tf3.K(45);
        int K8 = tf3.K(10);
        int K9 = tf3.K(20);
        int K10 = tf3.K(5);
        int K11 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams14 = appCompatTextView4.getLayoutParams();
        if (layoutParams14 instanceof LinearLayout.LayoutParams) {
            layoutParams6 = (LinearLayout.LayoutParams) layoutParams14;
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 == null) {
            i2 = -2;
            layoutParams6 = new LinearLayout.LayoutParams(-2, K7);
        } else {
            i2 = -2;
        }
        layoutParams6.width = i2;
        layoutParams6.height = K7;
        layoutParams6.weight = Math.max(-1.0f, layoutParams6.weight);
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.leftMargin = Math.max(K8, layoutParams6.leftMargin);
        layoutParams6.topMargin = Math.max(K10, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(K9, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(K11, layoutParams6.bottomMargin);
        appCompatTextView4.setLayoutParams(layoutParams6);
        appCompatTextView4.setText(ad3Var.c);
        m20.b0(appCompatTextView4);
        final int i7 = 1;
        appCompatTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: zc3

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ bd3 f5464b;

            {
                this.f5464b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i72 = i7;
                bd3 bd3Var = this.f5464b;
                switch (i72) {
                    case 0:
                        DialogInterface.OnDismissListener onDismissListener = bd3Var.f;
                        if (onDismissListener != null) {
                            onDismissListener.onDismiss(bd3Var.getDialog());
                        }
                        bd3Var.dismissAllowingStateLoss();
                        v31 v31Var = bd3Var.e.f;
                        if (v31Var != null) {
                            v31Var.invoke();
                            return;
                        }
                        return;
                    default:
                        bd3Var.e.getClass();
                        DialogInterface.OnDismissListener onDismissListener2 = bd3Var.f;
                        if (onDismissListener2 != null) {
                            onDismissListener2.onDismiss(bd3Var.getDialog());
                        }
                        bd3Var.dismissAllowingStateLoss();
                        v31 v31Var2 = bd3Var.e.d;
                        if (v31Var2 != null) {
                            v31Var2.invoke();
                            return;
                        }
                        return;
                }
            }
        });
        CharSequence charSequence5 = ad3Var.c;
        if (charSequence5 != null && charSequence5.length() != 0) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4) {
            tf3.V(appCompatTextView4);
        }
        h.addView(appCompatTextView4);
        Iterator it = ad3Var.h.iterator();
        if (!it.hasNext()) {
            if (h.getAttachToParent()) {
                eu3Var.addView(h);
            }
            ViewGroup.LayoutParams layoutParams15 = h.getLayoutParams();
            if (layoutParams15 instanceof LinearLayout.LayoutParams) {
                layoutParams7 = (LinearLayout.LayoutParams) layoutParams15;
            } else {
                layoutParams7 = null;
            }
            if (layoutParams7 == null) {
                i3 = -2;
                layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
            } else {
                i3 = -2;
            }
            layoutParams7.width = i3;
            layoutParams7.height = i3;
            layoutParams7.weight = Math.max(-1.0f, layoutParams7.weight);
            layoutParams7.gravity = Math.max(-1, layoutParams7.gravity);
            layoutParams7.leftMargin = Math.max(-1, layoutParams7.leftMargin);
            layoutParams7.topMargin = Math.max(-1, layoutParams7.topMargin);
            layoutParams7.rightMargin = Math.max(-1, layoutParams7.rightMargin);
            layoutParams7.bottomMargin = Math.max(-1, layoutParams7.bottomMargin);
            layoutParams7.topMargin = tf3.K(27);
            layoutParams7.gravity = 1;
            h.setLayoutParams(layoutParams7);
            if (eu3Var.getAttachToParent()) {
                cu3Var.addView(eu3Var);
            }
            ViewGroup.LayoutParams layoutParams16 = eu3Var.getLayoutParams();
            if (layoutParams16 instanceof f70) {
                f70Var = (f70) layoutParams16;
            } else {
                f70Var = null;
            }
            if (f70Var == null) {
                i4 = -2;
                f70Var = new f70(-2, -2);
            } else {
                i4 = -2;
            }
            ((ViewGroup.MarginLayoutParams) f70Var).width = i4;
            ((ViewGroup.MarginLayoutParams) f70Var).height = i4;
            ((ViewGroup.MarginLayoutParams) f70Var).width = tf3.H / 2;
            f70Var.i = 0;
            f70Var.l = 0;
            f70Var.e = 0;
            f70Var.h = 0;
            f70Var.F = 0.4f;
            eu3Var.setLayoutParams(f70Var);
            if (cu3Var.getAttachToParent()) {
                du3Var.addView(cu3Var);
            }
            ViewGroup.LayoutParams layoutParams17 = cu3Var.getLayoutParams();
            if (layoutParams17 instanceof FrameLayout.LayoutParams) {
                layoutParams8 = (FrameLayout.LayoutParams) layoutParams17;
            } else {
                layoutParams8 = null;
            }
            if (layoutParams8 == null) {
                i5 = -1;
                layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
            } else {
                i5 = -1;
            }
            layoutParams8.width = i5;
            layoutParams8.height = i5;
            layoutParams8.gravity = Math.max(17, layoutParams8.gravity);
            layoutParams8.setMarginStart(Math.max(i5, layoutParams8.leftMargin));
            layoutParams8.topMargin = Math.max(i5, layoutParams8.topMargin);
            layoutParams8.setMarginEnd(Math.max(i5, layoutParams8.rightMargin));
            layoutParams8.bottomMargin = Math.max(i5, layoutParams8.bottomMargin);
            cu3Var.setLayoutParams(layoutParams8);
            if ((context instanceof Activity) && du3Var.getAttachToParent()) {
                ((Activity) context).setContentView(du3Var);
            }
            return du3Var;
        }
        p71.C(it.next());
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView5.setId(-1);
        appCompatTextView5.setText("");
        tf3.A0(appCompatTextView5);
        throw null;
    }

    @Override // androidx.fragment.app.f, androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.e.getClass();
    }

    @Override // defpackage.rn
    public final void s(View view, Bundle bundle) {
        ad3 ad3Var = this.e;
        ad3Var.getClass();
        setCancelable(ad3Var.i);
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }
}
