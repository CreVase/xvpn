package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class sd3 extends eu3 implements vd3, qt3 {

    /* renamed from: b, reason: collision with root package name */
    public final AppCompatTextView f4323b;
    public final AppCompatTextView c;
    public final eu3 d;

    public sd3(Context context) {
        super(context, null, 6, 0);
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        setGravity(16);
        setFocusable(true);
        setBackground(new qd3(true));
        int K = tf3.K(120);
        int K2 = tf3.K(50);
        ViewGroup.LayoutParams layoutParams4 = getLayoutParams();
        if (layoutParams4 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams4;
        } else {
            layoutParams = null;
        }
        layoutParams = layoutParams == null ? new LinearLayout.LayoutParams(-1, K) : layoutParams;
        layoutParams.width = -1;
        layoutParams.height = K;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(K2, layoutParams.bottomMargin);
        setLayoutParams(layoutParams);
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext(), null);
        appCompatImageView.setId(-1);
        int K3 = tf3.K(25);
        ViewGroup.LayoutParams layoutParams5 = appCompatImageView.getLayoutParams();
        if (layoutParams5 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams5;
        } else {
            layoutParams2 = null;
        }
        layoutParams2 = layoutParams2 == null ? new LinearLayout.LayoutParams(-2, -2) : layoutParams2;
        layoutParams2.width = -2;
        layoutParams2.height = -2;
        layoutParams2.weight = Math.max(-1.0f, layoutParams2.weight);
        layoutParams2.gravity = Math.max(-1, layoutParams2.gravity);
        layoutParams2.leftMargin = Math.max(K3, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatImageView.setLayoutParams(layoutParams2);
        appCompatImageView.setImageResource(R.drawable.tv_home_account);
        addView(appCompatImageView);
        eu3 eu3Var = new eu3(getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setTextSize(16.0f);
        appCompatTextView.setTextColor(zf3.v(R.color.colorWhite));
        eu3Var.addView(appCompatTextView);
        this.f4323b = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(eu3Var.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setTextSize(12.0f);
        appCompatTextView2.setTextColor(zf3.v(R.color.textSecondary));
        eu3Var.addView(appCompatTextView2);
        int K4 = tf3.K(3);
        ViewGroup.LayoutParams layoutParams6 = appCompatTextView2.getLayoutParams();
        if (layoutParams6 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams6;
        } else {
            layoutParams3 = null;
        }
        layoutParams3 = layoutParams3 == null ? new LinearLayout.LayoutParams(-2, -2) : layoutParams3;
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(-1, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(K4, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams3);
        this.c = appCompatTextView2;
        if (eu3Var.getAttachToParent()) {
            addView(eu3Var);
        }
        int K5 = tf3.K(146);
        int K6 = tf3.K(12);
        ViewGroup.LayoutParams layoutParams7 = eu3Var.getLayoutParams();
        LinearLayout.LayoutParams layoutParams8 = layoutParams7 instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams7 : null;
        layoutParams8 = layoutParams8 == null ? new LinearLayout.LayoutParams(K5, -2) : layoutParams8;
        layoutParams8.width = K5;
        layoutParams8.height = -2;
        layoutParams8.weight = Math.max(-1.0f, layoutParams8.weight);
        layoutParams8.gravity = Math.max(-1, layoutParams8.gravity);
        layoutParams8.leftMargin = Math.max(K6, layoutParams8.leftMargin);
        layoutParams8.topMargin = Math.max(-1, layoutParams8.topMargin);
        layoutParams8.rightMargin = Math.max(-1, layoutParams8.rightMargin);
        layoutParams8.bottomMargin = Math.max(-1, layoutParams8.bottomMargin);
        eu3Var.setLayoutParams(layoutParams8);
        this.d = eu3Var;
    }

    @Override // defpackage.vd3
    public final void a(boolean z) {
        m20.g1(this.d, z);
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        int i;
        AppCompatTextView appCompatTextView = this.f4323b;
        AppCompatTextView appCompatTextView2 = null;
        if (appCompatTextView == null) {
            appCompatTextView = null;
        }
        if (z2) {
            i = R.string.PremiumAccount;
        } else {
            i = R.string.FreeAccount;
        }
        appCompatTextView.setText(pd0.y(i));
        AppCompatTextView appCompatTextView3 = this.c;
        if (appCompatTextView3 != null) {
            appCompatTextView2 = appCompatTextView3;
        }
        appCompatTextView2.setText(ew3.k().f4307a);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rt3.e().c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        rt3.e().l(this);
        super.onDetachedFromWindow();
    }
}
