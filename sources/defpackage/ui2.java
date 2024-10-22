package defpackage;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class ui2 extends rn {
    public boolean d;
    public v31 e;

    @Override // defpackage.md, androidx.fragment.app.f
    public final Dialog onCreateDialog(Bundle bundle) {
        ti2 ti2Var = new ti2(this, requireContext());
        ti2Var.setCanceledOnTouchOutside(false);
        return ti2Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        LinearLayout.LayoutParams layoutParams4;
        int i;
        Context context = layoutInflater.getContext();
        final int i2 = 0;
        eu3 h = hx2.h(context, null, 6, 0, 1);
        h.setId(-1);
        h.setLayoutDirection(0);
        ViewGroup.LayoutParams layoutParams5 = h.getLayoutParams();
        if (layoutParams5 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams5;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-1, -1);
        }
        layoutParams.width = -1;
        layoutParams.height = -1;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        h.setLayoutParams(layoutParams);
        h.setGravity(1);
        h.setBackground(new lp());
        AppCompatTextView appCompatTextView = new AppCompatTextView(h.getContext(), null);
        int g = p71.g(appCompatTextView, -1, "", appCompatTextView, 132);
        ViewGroup.LayoutParams layoutParams6 = appCompatTextView.getLayoutParams();
        if (layoutParams6 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams6;
        } else {
            layoutParams2 = null;
        }
        if (layoutParams2 == null) {
            layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(-1, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(g, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams2);
        appCompatTextView.setText(pd0.y(R.string.Congratulations2));
        appCompatTextView.setTextSize(28.5f);
        appCompatTextView.setTypeface(n01.a());
        appCompatTextView.setTextColor(-1);
        h.addView(appCompatTextView);
        tf3.w0(h, 0, tf3.K(24), 5);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setText(pd0.y(R.string.PremiumNoAccountSuccess));
        appCompatTextView2.setTextSize(17.5f);
        appCompatTextView2.setLineHeight(tf3.S(26));
        appCompatTextView2.setTextColor(-2763307);
        appCompatTextView2.setTextAlignment(4);
        h.addView(appCompatTextView2);
        final AppCompatTextView appCompatTextView3 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setText(pd0.y(R.string.SignUp));
        int K = tf3.K(318);
        int K2 = tf3.K(40);
        int K3 = tf3.K(30);
        int K4 = tf3.K(30);
        int K5 = tf3.K(108);
        int K6 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams7 = appCompatTextView3.getLayoutParams();
        if (layoutParams7 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams7;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new LinearLayout.LayoutParams(K, K2);
        }
        layoutParams3.width = K;
        layoutParams3.height = K2;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(K3, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(K5, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(K4, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(K6, layoutParams3.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams3);
        m20.b0(appCompatTextView3);
        appCompatTextView3.setOnClickListener(new View.OnClickListener(this) { // from class: si2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ui2 f4352b;

            {
                this.f4352b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                AppCompatTextView appCompatTextView4 = appCompatTextView3;
                ui2 ui2Var = this.f4352b;
                switch (i3) {
                    case 0:
                        if (!ui2Var.d) {
                            ui2Var.dismissAllowingStateLoss();
                            yc2.a();
                        }
                        bx3.f0(appCompatTextView4.getContext(), true);
                        return;
                    default:
                        if (!ui2Var.d) {
                            ui2Var.dismissAllowingStateLoss();
                            yc2.a();
                        }
                        bx3.e0(appCompatTextView4.getContext(), true);
                        return;
                }
            }
        });
        h.addView(appCompatTextView3);
        final AppCompatTextView appCompatTextView4 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView4.setId(-1);
        appCompatTextView4.setText("");
        tf3.A0(appCompatTextView4);
        appCompatTextView4.setText(pd0.y(R.string.SignIn));
        int K7 = tf3.K(318);
        int K8 = tf3.K(40);
        int K9 = tf3.K(30);
        int K10 = tf3.K(30);
        int K11 = tf3.K(13);
        int K12 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams8 = appCompatTextView4.getLayoutParams();
        if (layoutParams8 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams8;
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(K7, K8);
        }
        layoutParams4.width = K7;
        layoutParams4.height = K8;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(K9, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(K11, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(K10, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(K12, layoutParams4.bottomMargin);
        appCompatTextView4.setLayoutParams(layoutParams4);
        m20.b0(appCompatTextView4);
        final int i3 = 1;
        appCompatTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: si2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ui2 f4352b;

            {
                this.f4352b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                AppCompatTextView appCompatTextView42 = appCompatTextView4;
                ui2 ui2Var = this.f4352b;
                switch (i32) {
                    case 0:
                        if (!ui2Var.d) {
                            ui2Var.dismissAllowingStateLoss();
                            yc2.a();
                        }
                        bx3.f0(appCompatTextView42.getContext(), true);
                        return;
                    default:
                        if (!ui2Var.d) {
                            ui2Var.dismissAllowingStateLoss();
                            yc2.a();
                        }
                        bx3.e0(appCompatTextView42.getContext(), true);
                        return;
                }
            }
        });
        h.addView(appCompatTextView4);
        LinearLayout.LayoutParams layoutParams9 = null;
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(h.getContext(), null);
        int g2 = p71.g(appCompatTextView5, -1, "", appCompatTextView5, 20);
        ViewGroup.LayoutParams layoutParams10 = appCompatTextView5.getLayoutParams();
        if (layoutParams10 instanceof LinearLayout.LayoutParams) {
            layoutParams9 = (LinearLayout.LayoutParams) layoutParams10;
        }
        if (layoutParams9 == null) {
            i = -2;
            layoutParams9 = new LinearLayout.LayoutParams(-2, -2);
        } else {
            i = -2;
        }
        layoutParams9.width = i;
        layoutParams9.height = i;
        layoutParams9.weight = Math.max(-1.0f, layoutParams9.weight);
        layoutParams9.gravity = Math.max(-1, layoutParams9.gravity);
        layoutParams9.leftMargin = Math.max(-1, layoutParams9.leftMargin);
        layoutParams9.topMargin = Math.max(g2, layoutParams9.topMargin);
        layoutParams9.rightMargin = Math.max(-1, layoutParams9.rightMargin);
        layoutParams9.bottomMargin = Math.max(-1, layoutParams9.bottomMargin);
        appCompatTextView5.setLayoutParams(layoutParams9);
        appCompatTextView5.setText(pd0.y(R.string.PremiumSignUpTips));
        appCompatTextView5.setTextSize(14.0f);
        appCompatTextView5.setTextColor(-10066330);
        appCompatTextView5.setCompoundDrawablePadding(tf3.K(10));
        appCompatTextView5.setCompoundDrawablesWithIntrinsicBounds(R.drawable.tv_ic_exclamation, 0, 0, 0);
        h.addView(appCompatTextView5);
        if ((context instanceof Activity) && h.getAttachToParent()) {
            ((Activity) context).setContentView(h);
        }
        return h;
    }

    @Override // defpackage.rn
    public final void s(View view, Bundle bundle) {
        if (bundle != null) {
            dismissAllowingStateLoss();
        }
    }
}
