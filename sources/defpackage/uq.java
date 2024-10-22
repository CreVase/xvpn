package defpackage;

import android.animation.TimeInterpolator;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class uq extends bx1 {
    public AppCompatTextView i;
    public AppCompatButton j;
    public AppCompatButton k;
    public om1 l;
    public v31 m;
    public v31 n;
    public x31 o;
    public final String p = pd0.y(R.string.Notice);
    public String q = "";
    public boolean r = true;
    public boolean s = true;
    public boolean t;

    public uq() {
        this.d = 3;
    }

    @Override // defpackage.bx1
    public final long D() {
        return 450L;
    }

    @Override // defpackage.bx1
    public final TimeInterpolator E() {
        return new OvershootInterpolator();
    }

    @Override // defpackage.bx1, defpackage.rn
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        x31 x31Var = this.o;
        if (x31Var != null) {
            x31Var.invoke(this);
        }
    }

    @Override // defpackage.bx1
    public final View z(yh1 yh1Var) {
        f70 f70Var;
        f70 f70Var2;
        f70 f70Var3;
        f70 f70Var4;
        f70 f70Var5;
        f70 f70Var6;
        int i;
        FrameLayout.LayoutParams layoutParams = null;
        cu3 cu3Var = new cu3(yh1Var.getContext(), null, 6);
        cu3Var.setBackgroundResource(R.drawable.tv_notice_dialog_bg);
        AppCompatImageView appCompatImageView = new AppCompatImageView(cu3Var.getContext(), null);
        appCompatImageView.setId(R.id.dialogIcon);
        appCompatImageView.setImageResource(R.drawable.tv_ic_fullscreen_notice);
        cu3Var.addView(appCompatImageView);
        int K = tf3.K(119);
        int K2 = tf3.K(78);
        ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
        if (layoutParams2 instanceof f70) {
            f70Var = (f70) layoutParams2;
        } else {
            f70Var = null;
        }
        if (f70Var == null) {
            f70Var = new f70(K, K2);
        }
        ((ViewGroup.MarginLayoutParams) f70Var).width = K;
        ((ViewGroup.MarginLayoutParams) f70Var).height = K2;
        ((ViewGroup.MarginLayoutParams) f70Var).topMargin = tf3.K(23);
        ((ViewGroup.MarginLayoutParams) f70Var).bottomMargin = tf3.K(23);
        ((ViewGroup.MarginLayoutParams) f70Var).leftMargin = tf3.K(30);
        f70Var.i = 0;
        f70Var.e = 0;
        f70Var.l = 0;
        appCompatImageView.setLayoutParams(f70Var);
        AppCompatTextView appCompatTextView = new AppCompatTextView(cu3Var.getContext(), null);
        appCompatTextView.setId(R.id.dialogTitle);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setText(this.p);
        appCompatTextView.setTextSize(17.5f);
        appCompatTextView.setTypeface(n01.a());
        appCompatTextView.setTextColor(-1);
        cu3Var.addView(appCompatTextView);
        ViewGroup.LayoutParams layoutParams3 = appCompatTextView.getLayoutParams();
        if (layoutParams3 instanceof f70) {
            f70Var2 = (f70) layoutParams3;
        } else {
            f70Var2 = null;
        }
        if (f70Var2 == null) {
            f70Var2 = new f70(0, -2);
        }
        ((ViewGroup.MarginLayoutParams) f70Var2).width = 0;
        ((ViewGroup.MarginLayoutParams) f70Var2).height = -2;
        f70Var2.f = R.id.dialogIcon;
        f70Var2.i = R.id.dialogIcon;
        f70Var2.h = 0;
        ((ViewGroup.MarginLayoutParams) f70Var2).topMargin = tf3.K(9);
        ((ViewGroup.MarginLayoutParams) f70Var2).leftMargin = tf3.K(23);
        ((ViewGroup.MarginLayoutParams) f70Var2).rightMargin = tf3.K(200);
        appCompatTextView.setLayoutParams(f70Var2);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(cu3Var.getContext(), null);
        appCompatTextView2.setId(R.id.dialogContent);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setText(this.q);
        appCompatTextView2.setTextSize(13.0f);
        appCompatTextView2.setTextColor(-7697782);
        cu3Var.addView(appCompatTextView2);
        ViewGroup.LayoutParams layoutParams4 = appCompatTextView2.getLayoutParams();
        if (layoutParams4 instanceof f70) {
            f70Var3 = (f70) layoutParams4;
        } else {
            f70Var3 = null;
        }
        if (f70Var3 == null) {
            f70Var3 = new f70(0, -2);
        }
        ((ViewGroup.MarginLayoutParams) f70Var3).width = 0;
        ((ViewGroup.MarginLayoutParams) f70Var3).height = -2;
        f70Var3.j = R.id.dialogTitle;
        f70Var3.e = R.id.dialogTitle;
        f70Var3.h = R.id.dialogTitle;
        ((ViewGroup.MarginLayoutParams) f70Var3).topMargin = tf3.K(10);
        appCompatTextView2.setLayoutParams(f70Var3);
        this.i = appCompatTextView2;
        AppCompatButton appCompatButton = new AppCompatButton(cu3Var.getContext(), null);
        appCompatButton.setId(R.id.dialogConfirm);
        appCompatButton.setText(R.string.Okay);
        tf3.A0(appCompatButton);
        appCompatButton.setTextSize(15.0f);
        appCompatButton.setTypeface(n01.a());
        appCompatButton.setTextColor(-1);
        appCompatButton.setGravity(17);
        appCompatButton.setBackgroundResource(R.drawable.tv_common_button);
        appCompatButton.setPadding(0, 0, 0, 0);
        m20.G0(appCompatButton, new tq(this, 0));
        m20.g1(appCompatButton, this.r);
        cu3Var.addView(appCompatButton);
        int K3 = tf3.K(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
        int K4 = tf3.K(33);
        ViewGroup.LayoutParams layoutParams5 = appCompatButton.getLayoutParams();
        if (layoutParams5 instanceof f70) {
            f70Var4 = (f70) layoutParams5;
        } else {
            f70Var4 = null;
        }
        if (f70Var4 == null) {
            f70Var4 = new f70(K3, K4);
        }
        ((ViewGroup.MarginLayoutParams) f70Var4).width = K3;
        ((ViewGroup.MarginLayoutParams) f70Var4).height = K4;
        f70Var4.i = 0;
        f70Var4.h = 0;
        f70Var4.k = R.id.dialogCancel;
        f70Var4.K = 2;
        ((ViewGroup.MarginLayoutParams) f70Var4).rightMargin = tf3.K(30);
        appCompatButton.setLayoutParams(f70Var4);
        this.j = appCompatButton;
        AppCompatButton appCompatButton2 = new AppCompatButton(cu3Var.getContext(), null);
        appCompatButton2.setId(R.id.dialogCancel);
        appCompatButton2.setText(R.string.Cancel);
        tf3.A0(appCompatButton2);
        appCompatButton2.setTextSize(15.0f);
        appCompatButton2.setTypeface(n01.a());
        appCompatButton2.setTextColor(-1);
        appCompatButton2.setGravity(17);
        appCompatButton2.setBackgroundResource(R.drawable.tv_common_button);
        appCompatButton2.setPadding(0, 0, 0, 0);
        m20.G0(appCompatButton2, new tq(this, 1));
        m20.g1(appCompatButton2, this.s);
        cu3Var.addView(appCompatButton2);
        int K5 = tf3.K(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
        int K6 = tf3.K(33);
        ViewGroup.LayoutParams layoutParams6 = appCompatButton2.getLayoutParams();
        if (layoutParams6 instanceof f70) {
            f70Var5 = (f70) layoutParams6;
        } else {
            f70Var5 = null;
        }
        if (f70Var5 == null) {
            f70Var5 = new f70(K5, K6);
        }
        ((ViewGroup.MarginLayoutParams) f70Var5).width = K5;
        ((ViewGroup.MarginLayoutParams) f70Var5).height = K6;
        f70Var5.l = 0;
        f70Var5.h = 0;
        f70Var5.j = R.id.dialogConfirm;
        ((ViewGroup.MarginLayoutParams) f70Var5).topMargin = tf3.K(10);
        ((ViewGroup.MarginLayoutParams) f70Var5).rightMargin = tf3.K(30);
        appCompatButton2.setLayoutParams(f70Var5);
        this.k = appCompatButton2;
        om1 om1Var = new om1(cu3Var.getContext());
        cu3Var.addView(om1Var);
        m20.g1(om1Var, this.t);
        int K7 = tf3.K(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
        int K8 = tf3.K(33);
        ViewGroup.LayoutParams layoutParams7 = om1Var.getLayoutParams();
        if (layoutParams7 instanceof f70) {
            f70Var6 = (f70) layoutParams7;
        } else {
            f70Var6 = null;
        }
        if (f70Var6 == null) {
            f70Var6 = new f70(K7, K8);
        }
        ((ViewGroup.MarginLayoutParams) f70Var6).width = K7;
        ((ViewGroup.MarginLayoutParams) f70Var6).height = K8;
        f70Var6.i = 0;
        f70Var6.l = 0;
        f70Var6.h = 0;
        om1Var.setLayoutParams(f70Var6);
        this.l = om1Var;
        if (cu3Var.getAttachToParent()) {
            yh1Var.addView(cu3Var);
        }
        int K9 = tf3.K(40);
        int K10 = tf3.K(40);
        int K11 = tf3.K(25);
        ViewGroup.LayoutParams layoutParams8 = cu3Var.getLayoutParams();
        if (layoutParams8 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams8;
        }
        if (layoutParams == null) {
            i = -2;
            layoutParams = new FrameLayout.LayoutParams(-1, -2);
        } else {
            i = -2;
        }
        layoutParams.width = -1;
        layoutParams.height = i;
        layoutParams.gravity = Math.max(80, layoutParams.gravity);
        layoutParams.setMarginStart(Math.max(K9, layoutParams.leftMargin));
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.setMarginEnd(Math.max(K10, layoutParams.rightMargin));
        layoutParams.bottomMargin = Math.max(K11, layoutParams.bottomMargin);
        cu3Var.setLayoutParams(layoutParams);
        return cu3Var;
    }
}
