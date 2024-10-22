package defpackage;

import a.bx;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;

/* loaded from: classes2.dex */
public final class j50 extends lo implements pt3, qt3 {
    public static final /* synthetic */ int k = 0;
    public m50 e;
    public AppCompatImageView f;
    public AppCompatTextView g;
    public AppCompatTextView h;
    public du3 i;
    public boolean j;

    @Override // defpackage.pt3
    public final /* synthetic */ void C(String str) {
    }

    public final void D() {
        boolean z;
        int i;
        String S0 = ew3.S0();
        int i2 = 0;
        if (S0 != null && S0.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            i = R.drawable.tv_ic_fastest_server;
        } else {
            bx j = hx2.j(S0, 189);
            String u = j.u();
            j.h();
            if (zf3.f5472a != null && !TextUtils.isEmpty(u)) {
                int d1 = i23.d1(u, ".", 0, 6);
                if (d1 > 0) {
                    u = u.substring(0, d1);
                }
                i = zf3.f5472a.getResources().getIdentifier(u, "drawable", zf3.f5472a.getPackageName());
            } else {
                i = 0;
            }
        }
        String J = ew3.J(S0);
        AppCompatImageView appCompatImageView = this.f;
        if (appCompatImageView != null) {
            appCompatImageView.setImageResource(i);
        }
        AppCompatTextView appCompatTextView = this.h;
        if (appCompatTextView != null) {
            appCompatTextView.setText(ew3.D().f446b);
        }
        AppCompatTextView appCompatTextView2 = this.g;
        if (appCompatTextView2 != null) {
            appCompatTextView2.setText(J);
        }
        du3 du3Var = this.i;
        if (du3Var != null) {
            if (!(!ew3.X())) {
                i2 = 8;
            }
            du3Var.setVisibility(i2);
        }
    }

    @Override // defpackage.pt3
    public final void c(int i) {
        m50 m50Var = this.e;
        if (m50Var != null) {
            m50Var.setConnectState(i);
        }
        D();
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        int i;
        du3 du3Var = this.i;
        if (du3Var != null) {
            if (!ew3.X()) {
                i = 0;
            } else {
                i = 8;
            }
            du3Var.setVisibility(i);
        }
    }

    @Override // defpackage.sn
    public final boolean m() {
        return false;
    }

    @Override // defpackage.sn, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        f70 f70Var;
        LinearLayout.LayoutParams layoutParams3;
        LinearLayout.LayoutParams layoutParams4;
        f70 f70Var2;
        FrameLayout.LayoutParams layoutParams5;
        FrameLayout.LayoutParams layoutParams6;
        Context context = layoutInflater.getContext();
        cu3 cu3Var = new cu3(context, null, 6);
        cu3Var.setId(-1);
        cu3Var.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        cu3Var.setAttachToParent(false);
        m50 m50Var = new m50(cu3Var.getContext());
        m50Var.setId(R.id.connectToggle);
        m20.G0(m50Var, new fv2(this, 14));
        this.e = m50Var;
        f70 f70Var3 = new f70(tf3.K(220), tf3.K(220));
        f70Var3.e = 0;
        f70Var3.i = 0;
        f70Var3.l = 0;
        f70Var3.g = R.id.connectLocation;
        f70Var3.J = 2;
        cu3Var.addView(m50Var, f70Var3);
        if (this.j) {
            m50Var.requestFocus();
            this.j = false;
        }
        eu3 h = hx2.h(cu3Var.getContext(), null, 6, 0, 0);
        h.setId(-1);
        h.setId(R.id.connectLocation);
        h.setGravity(16);
        AppCompatImageView appCompatImageView = new AppCompatImageView(h.getContext(), null);
        appCompatImageView.setId(-1);
        appCompatImageView.setImageResource(R.drawable.tv_ic_fastest_server);
        h.addView(appCompatImageView);
        int J = tf3.J(27.5f);
        int J2 = tf3.J(27.5f);
        ViewGroup.LayoutParams layoutParams7 = appCompatImageView.getLayoutParams();
        if (layoutParams7 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams7;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(J, J2);
        }
        layoutParams.width = J;
        layoutParams.height = J2;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        appCompatImageView.setLayoutParams(layoutParams);
        this.f = appCompatImageView;
        AppCompatTextView appCompatTextView = new AppCompatTextView(h.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setTextSize(27.5f);
        appCompatTextView.setTextColor(zf3.v(R.color.textTertiary));
        appCompatTextView.setMaxLines(1);
        h.addView(appCompatTextView);
        int K = tf3.K(13);
        ViewGroup.LayoutParams layoutParams8 = appCompatTextView.getLayoutParams();
        if (layoutParams8 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams8;
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
        layoutParams2.leftMargin = Math.max(K, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(-1, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams2);
        this.g = appCompatTextView;
        if (h.getAttachToParent()) {
            cu3Var.addView(h);
        }
        ViewGroup.LayoutParams layoutParams9 = h.getLayoutParams();
        if (layoutParams9 instanceof f70) {
            f70Var = (f70) layoutParams9;
        } else {
            f70Var = null;
        }
        if (f70Var == null) {
            f70Var = new f70(-2, -2);
        }
        ((ViewGroup.MarginLayoutParams) f70Var).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var).height = -2;
        f70Var.h = 0;
        f70Var.i = R.id.connectToggle;
        f70Var.f = R.id.connectToggle;
        f70Var.k = R.id.connectProtocol;
        f70Var.K = 2;
        h.setLayoutParams(f70Var);
        eu3 h2 = hx2.h(cu3Var.getContext(), null, 6, 0, 0);
        h2.setId(-1);
        h2.setId(R.id.connectProtocol);
        h2.setGravity(16);
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(h2.getContext(), null);
        appCompatImageView2.setId(-1);
        appCompatImageView2.setImageResource(R.drawable.tv_ic_connect_protocol);
        h2.addView(appCompatImageView2);
        int J3 = tf3.J(27.5f);
        int J4 = tf3.J(27.5f);
        ViewGroup.LayoutParams layoutParams10 = appCompatImageView2.getLayoutParams();
        if (layoutParams10 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams10;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new LinearLayout.LayoutParams(J3, J4);
        }
        layoutParams3.width = J3;
        layoutParams3.height = J4;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(-1, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(-1, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        appCompatImageView2.setLayoutParams(layoutParams3);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(h2.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setTextSize(27.5f);
        appCompatTextView2.setTextColor(zf3.v(R.color.textTertiary));
        h2.addView(appCompatTextView2);
        int K2 = tf3.K(13);
        ViewGroup.LayoutParams layoutParams11 = appCompatTextView2.getLayoutParams();
        if (layoutParams11 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams11;
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams4.width = -2;
        layoutParams4.height = -2;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(K2, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(-1, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams4);
        this.h = appCompatTextView2;
        if (h2.getAttachToParent()) {
            cu3Var.addView(h2);
        }
        ViewGroup.LayoutParams layoutParams12 = h2.getLayoutParams();
        if (layoutParams12 instanceof f70) {
            f70Var2 = (f70) layoutParams12;
        } else {
            f70Var2 = null;
        }
        if (f70Var2 == null) {
            f70Var2 = new f70(-2, -2);
        }
        ((ViewGroup.MarginLayoutParams) f70Var2).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var2).height = -2;
        ((ViewGroup.MarginLayoutParams) f70Var2).topMargin = tf3.K(20);
        f70Var2.j = R.id.connectLocation;
        f70Var2.e = R.id.connectLocation;
        f70Var2.l = R.id.connectToggle;
        h2.setLayoutParams(f70Var2);
        du3 du3Var = new du3(cu3Var.getContext(), null, 6, 0);
        du3Var.setId(-1);
        du3Var.setFocusable(true);
        du3Var.setNextFocusLeftId(R.id.connectToggle);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(du3Var.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText(R.string.GoPremium);
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setDuplicateParentStateEnabled(true);
        appCompatTextView3.setGravity(17);
        appCompatTextView3.setTextColor(zf3.y(R.color.tv_home_go_premium_text));
        appCompatTextView3.setBackgroundResource(R.drawable.tv_home_go_premium_bg);
        appCompatTextView3.setPadding(tf3.K(20), 0, tf3.K(20), 0);
        du3Var.addView(appCompatTextView3);
        int J5 = tf3.J(33.5f);
        int K3 = tf3.K(11);
        int K4 = tf3.K(2);
        ViewGroup.LayoutParams layoutParams13 = appCompatTextView3.getLayoutParams();
        if (layoutParams13 instanceof FrameLayout.LayoutParams) {
            layoutParams5 = (FrameLayout.LayoutParams) layoutParams13;
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 == null) {
            layoutParams5 = new FrameLayout.LayoutParams(-2, J5);
        }
        layoutParams5.width = -2;
        layoutParams5.height = J5;
        layoutParams5.gravity = Math.max(80, layoutParams5.gravity);
        layoutParams5.setMarginStart(Math.max(-1, layoutParams5.leftMargin));
        layoutParams5.topMargin = Math.max(K3, layoutParams5.topMargin);
        layoutParams5.setMarginEnd(Math.max(K4, layoutParams5.rightMargin));
        layoutParams5.bottomMargin = Math.max(-1, layoutParams5.bottomMargin);
        appCompatTextView3.setLayoutParams(layoutParams5);
        f70 f70Var4 = null;
        AppCompatImageView appCompatImageView3 = new AppCompatImageView(du3Var.getContext(), null);
        appCompatImageView3.setId(-1);
        appCompatImageView3.setDuplicateParentStateEnabled(true);
        appCompatImageView3.setImageResource(R.drawable.tv_ic_home_go_premium);
        du3Var.addView(appCompatImageView3);
        ViewGroup.LayoutParams layoutParams14 = appCompatImageView3.getLayoutParams();
        if (layoutParams14 instanceof FrameLayout.LayoutParams) {
            layoutParams6 = (FrameLayout.LayoutParams) layoutParams14;
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 == null) {
            layoutParams6 = new FrameLayout.LayoutParams(-2, -2);
        }
        layoutParams6.width = -2;
        layoutParams6.height = -2;
        layoutParams6.gravity = Math.max(5, layoutParams6.gravity);
        layoutParams6.setMarginStart(Math.max(-1, layoutParams6.leftMargin));
        layoutParams6.topMargin = Math.max(-1, layoutParams6.topMargin);
        layoutParams6.setMarginEnd(Math.max(-1, layoutParams6.rightMargin));
        layoutParams6.bottomMargin = Math.max(-1, layoutParams6.bottomMargin);
        appCompatImageView3.setLayoutParams(layoutParams6);
        m20.G0(du3Var, new i50(du3Var, 0));
        if (du3Var.getAttachToParent()) {
            cu3Var.addView(du3Var);
        }
        ViewGroup.LayoutParams layoutParams15 = du3Var.getLayoutParams();
        if (layoutParams15 instanceof f70) {
            f70Var4 = (f70) layoutParams15;
        }
        if (f70Var4 == null) {
            f70Var4 = new f70(-2, -2);
        }
        ((ViewGroup.MarginLayoutParams) f70Var4).width = -2;
        ((ViewGroup.MarginLayoutParams) f70Var4).height = -2;
        ((ViewGroup.MarginLayoutParams) f70Var4).topMargin = tf3.K(30);
        ((ViewGroup.MarginLayoutParams) f70Var4).rightMargin = tf3.K(45);
        f70Var4.i = 0;
        f70Var4.h = 0;
        du3Var.setLayoutParams(f70Var4);
        this.i = du3Var;
        if ((context instanceof Activity) && cu3Var.getAttachToParent()) {
            ((Activity) context).setContentView(cu3Var);
        }
        return cu3Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        rt3.e().j(this);
        rt3.e().l(this);
    }

    @Override // defpackage.lo, androidx.fragment.app.Fragment
    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (!z) {
            D();
            if (this.j) {
                this.j = false;
                m50 m50Var = this.e;
                if (m50Var != null) {
                    m50Var.requestFocus();
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        D();
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        rt3.e().a(this);
        rt3.e().c(this);
        D();
    }
}
