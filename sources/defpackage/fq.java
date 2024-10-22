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
public final class fq extends rn {
    public static final /* synthetic */ int d = 0;

    @Override // defpackage.md, androidx.fragment.app.f
    public final Dialog onCreateDialog(Bundle bundle) {
        pc0 pc0Var = new pc0(requireContext());
        pc0Var.setCanceledOnTouchOutside(false);
        return pc0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        Context context = layoutInflater.getContext();
        LinearLayout.LayoutParams layoutParams4 = null;
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
        h.setBackgroundResource(R.drawable.tv_subscription_dialog_bg);
        tf3.w0(h, 0, tf3.K(132), 5);
        AppCompatTextView appCompatTextView = new AppCompatTextView(h.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
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
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
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
        int g = p71.g(appCompatTextView2, -1, "", appCompatTextView2, 350);
        ViewGroup.LayoutParams layoutParams7 = appCompatTextView2.getLayoutParams();
        if (layoutParams7 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams7;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new LinearLayout.LayoutParams(g, -2);
        }
        layoutParams3.width = g;
        layoutParams3.height = -2;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(-1, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(-1, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams3);
        appCompatTextView2.setText(pd0.z(R.string.TvBindSucceedDesc, ew3.k().f4307a));
        appCompatTextView2.setTextSize(17.5f);
        appCompatTextView2.setLineHeight(tf3.S(26));
        appCompatTextView2.setTextColor(-2763307);
        appCompatTextView2.setTextAlignment(4);
        h.addView(appCompatTextView2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setText(pd0.y(R.string.Continue));
        int K = tf3.K(318);
        int K2 = tf3.K(40);
        int K3 = tf3.K(30);
        int K4 = tf3.K(30);
        int K5 = tf3.K(45);
        int K6 = tf3.K(5);
        ViewGroup.LayoutParams layoutParams8 = appCompatTextView3.getLayoutParams();
        if (layoutParams8 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams8;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(K, K2);
        }
        layoutParams4.width = K;
        layoutParams4.height = K2;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(K3, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(K5, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(K4, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(K6, layoutParams4.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams4);
        m20.b0(appCompatTextView3);
        appCompatTextView3.setOnClickListener(new cr1(this, 23));
        h.addView(appCompatTextView3);
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
