package defpackage;

import a.bx;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.WebViewActivity;
import com.security.xvpn.z35kb.television.HomeActivity;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class o extends sn {
    public static final /* synthetic */ int f = 0;
    public AppCompatTextView d;
    public AppCompatTextView e;

    public o() {
        super(0);
    }

    @Override // defpackage.sn
    public final boolean m() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        LinearLayout.LayoutParams layoutParams4;
        LinearLayout.LayoutParams layoutParams5;
        qe3 qe3Var = new qe3(layoutInflater.getContext());
        final int i = 1;
        qe3Var.setOrientation(1);
        qe3Var.setId(-1);
        LinearLayout.LayoutParams layoutParams6 = null;
        AppCompatTextView appCompatTextView = new AppCompatTextView(qe3Var.getContext(), null);
        int g = p71.g(appCompatTextView, -1, "", appCompatTextView, 135);
        ViewGroup.LayoutParams layoutParams7 = appCompatTextView.getLayoutParams();
        if (layoutParams7 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams7;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null) {
            layoutParams = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.weight = Math.max(-1.0f, layoutParams.weight);
        layoutParams.gravity = Math.max(-1, layoutParams.gravity);
        layoutParams.leftMargin = Math.max(-1, layoutParams.leftMargin);
        layoutParams.topMargin = Math.max(g, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        appCompatTextView.setLayoutParams(layoutParams);
        appCompatTextView.setTypeface(n01.a());
        appCompatTextView.setTextSize(20.0f);
        appCompatTextView.setTextColor(-1);
        appCompatTextView.setText(pd0.y(R.string.About));
        qe3Var.addView(appCompatTextView);
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(qe3Var.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setTextSize(15.0f);
        appCompatTextView2.setTextColor(-2763307);
        bx i2 = hx2.i(465);
        String u = i2.u();
        i2.h();
        final int i3 = 0;
        appCompatTextView2.setText(pd0.z(R.string.TvVersionFormat, u));
        int K = tf3.K(12);
        ViewGroup.LayoutParams layoutParams8 = appCompatTextView2.getLayoutParams();
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
        layoutParams2.leftMargin = Math.max(-1, layoutParams2.leftMargin);
        layoutParams2.topMargin = Math.max(K, layoutParams2.topMargin);
        layoutParams2.rightMargin = Math.max(-1, layoutParams2.rightMargin);
        layoutParams2.bottomMargin = Math.max(-1, layoutParams2.bottomMargin);
        appCompatTextView2.setLayoutParams(layoutParams2);
        qe3Var.addView(appCompatTextView2);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(qe3Var.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setTextSize(15.0f);
        appCompatTextView3.setTextColor(-2763307);
        appCompatTextView3.setText(pd0.z(R.string.DeviceId, ew3.n()));
        qe3Var.addView(appCompatTextView3);
        AppCompatTextView appCompatTextView4 = new AppCompatTextView(qe3Var.getContext(), null);
        int g2 = p71.g(appCompatTextView4, -1, "", appCompatTextView4, 45);
        int K2 = tf3.K(27);
        ViewGroup.LayoutParams layoutParams9 = appCompatTextView4.getLayoutParams();
        if (layoutParams9 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams9;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new LinearLayout.LayoutParams(-1, g2);
        }
        layoutParams3.width = -1;
        layoutParams3.height = g2;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(-1, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(K2, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        appCompatTextView4.setLayoutParams(layoutParams3);
        appCompatTextView4.setText(pd0.y(R.string.PrivacyPolicy));
        xm3.c(appCompatTextView4);
        appCompatTextView4.setOnClickListener(new View.OnClickListener(this) { // from class: k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f2863b;

            {
                this.f2863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i3;
                AppCompatTextView appCompatTextView5 = null;
                o oVar = this.f2863b;
                switch (i4) {
                    case 0:
                        int i5 = o.f;
                        tf3.h0(oVar.requireActivity(), WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.f(), "&dark=true")), new n42("intentTitle", pd0.y(R.string.PrivacyPolicy))), 0, 4);
                        return;
                    case 1:
                        int i6 = o.f;
                        tf3.h0(oVar.requireActivity(), WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.g(), "&dark=true")), new n42("intentTitle", pd0.y(R.string.TermsOfService))), 0, 4);
                        return;
                    case 2:
                        int i7 = o.f;
                        nd3.P((HomeActivity) oVar.requireActivity());
                        zf3.T(oVar, null, new n(oVar, null), 3);
                        return;
                    default:
                        AppCompatTextView appCompatTextView6 = oVar.e;
                        if (appCompatTextView6 != null) {
                            appCompatTextView6.requestFocus();
                        }
                        AppCompatTextView appCompatTextView7 = oVar.d;
                        if (appCompatTextView7 != null) {
                            appCompatTextView5 = appCompatTextView7;
                        }
                        m20.u0(appCompatTextView5);
                        new hr().show(oVar.getChildFragmentManager(), "");
                        return;
                }
            }
        });
        qe3Var.addView(appCompatTextView4);
        AppCompatTextView appCompatTextView5 = new AppCompatTextView(qe3Var.getContext(), null);
        int g3 = p71.g(appCompatTextView5, -1, "", appCompatTextView5, 45);
        int K3 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams10 = appCompatTextView5.getLayoutParams();
        if (layoutParams10 instanceof LinearLayout.LayoutParams) {
            layoutParams4 = (LinearLayout.LayoutParams) layoutParams10;
        } else {
            layoutParams4 = null;
        }
        if (layoutParams4 == null) {
            layoutParams4 = new LinearLayout.LayoutParams(-1, g3);
        }
        layoutParams4.width = -1;
        layoutParams4.height = g3;
        layoutParams4.weight = Math.max(-1.0f, layoutParams4.weight);
        layoutParams4.gravity = Math.max(-1, layoutParams4.gravity);
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(K3, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        appCompatTextView5.setLayoutParams(layoutParams4);
        appCompatTextView5.setText(pd0.y(R.string.TermsOfService));
        xm3.c(appCompatTextView5);
        appCompatTextView5.setOnClickListener(new View.OnClickListener(this) { // from class: k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f2863b;

            {
                this.f2863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i4 = i;
                AppCompatTextView appCompatTextView52 = null;
                o oVar = this.f2863b;
                switch (i4) {
                    case 0:
                        int i5 = o.f;
                        tf3.h0(oVar.requireActivity(), WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.f(), "&dark=true")), new n42("intentTitle", pd0.y(R.string.PrivacyPolicy))), 0, 4);
                        return;
                    case 1:
                        int i6 = o.f;
                        tf3.h0(oVar.requireActivity(), WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.g(), "&dark=true")), new n42("intentTitle", pd0.y(R.string.TermsOfService))), 0, 4);
                        return;
                    case 2:
                        int i7 = o.f;
                        nd3.P((HomeActivity) oVar.requireActivity());
                        zf3.T(oVar, null, new n(oVar, null), 3);
                        return;
                    default:
                        AppCompatTextView appCompatTextView6 = oVar.e;
                        if (appCompatTextView6 != null) {
                            appCompatTextView6.requestFocus();
                        }
                        AppCompatTextView appCompatTextView7 = oVar.d;
                        if (appCompatTextView7 != null) {
                            appCompatTextView52 = appCompatTextView7;
                        }
                        m20.u0(appCompatTextView52);
                        new hr().show(oVar.getChildFragmentManager(), "");
                        return;
                }
            }
        });
        qe3Var.addView(appCompatTextView5);
        AppCompatTextView appCompatTextView6 = new AppCompatTextView(qe3Var.getContext(), null);
        int g4 = p71.g(appCompatTextView6, -1, "", appCompatTextView6, 45);
        int K4 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams11 = appCompatTextView6.getLayoutParams();
        if (layoutParams11 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams11;
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 == null) {
            layoutParams5 = new LinearLayout.LayoutParams(-1, g4);
        }
        layoutParams5.width = -1;
        layoutParams5.height = g4;
        layoutParams5.weight = Math.max(-1.0f, layoutParams5.weight);
        layoutParams5.gravity = Math.max(-1, layoutParams5.gravity);
        layoutParams5.leftMargin = Math.max(-1, layoutParams5.leftMargin);
        layoutParams5.topMargin = Math.max(K4, layoutParams5.topMargin);
        layoutParams5.rightMargin = Math.max(-1, layoutParams5.rightMargin);
        layoutParams5.bottomMargin = Math.max(-1, layoutParams5.bottomMargin);
        appCompatTextView6.setLayoutParams(layoutParams5);
        appCompatTextView6.setText(pd0.y(R.string.RefreshXVpn));
        xm3.c(appCompatTextView6);
        final int i4 = 2;
        appCompatTextView6.setOnClickListener(new View.OnClickListener(this) { // from class: k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f2863b;

            {
                this.f2863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i4;
                AppCompatTextView appCompatTextView52 = null;
                o oVar = this.f2863b;
                switch (i42) {
                    case 0:
                        int i5 = o.f;
                        tf3.h0(oVar.requireActivity(), WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.f(), "&dark=true")), new n42("intentTitle", pd0.y(R.string.PrivacyPolicy))), 0, 4);
                        return;
                    case 1:
                        int i6 = o.f;
                        tf3.h0(oVar.requireActivity(), WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.g(), "&dark=true")), new n42("intentTitle", pd0.y(R.string.TermsOfService))), 0, 4);
                        return;
                    case 2:
                        int i7 = o.f;
                        nd3.P((HomeActivity) oVar.requireActivity());
                        zf3.T(oVar, null, new n(oVar, null), 3);
                        return;
                    default:
                        AppCompatTextView appCompatTextView62 = oVar.e;
                        if (appCompatTextView62 != null) {
                            appCompatTextView62.requestFocus();
                        }
                        AppCompatTextView appCompatTextView7 = oVar.d;
                        if (appCompatTextView7 != null) {
                            appCompatTextView52 = appCompatTextView7;
                        }
                        m20.u0(appCompatTextView52);
                        new hr().show(oVar.getChildFragmentManager(), "");
                        return;
                }
            }
        });
        qe3Var.addView(appCompatTextView6);
        this.e = appCompatTextView6;
        AppCompatTextView appCompatTextView7 = new AppCompatTextView(qe3Var.getContext(), null);
        int g5 = p71.g(appCompatTextView7, -1, "", appCompatTextView7, 45);
        int K5 = tf3.K(10);
        ViewGroup.LayoutParams layoutParams12 = appCompatTextView7.getLayoutParams();
        if (layoutParams12 instanceof LinearLayout.LayoutParams) {
            layoutParams6 = (LinearLayout.LayoutParams) layoutParams12;
        }
        if (layoutParams6 == null) {
            layoutParams6 = new LinearLayout.LayoutParams(-1, g5);
        }
        layoutParams6.width = -1;
        layoutParams6.height = g5;
        layoutParams6.weight = Math.max(-1.0f, layoutParams6.weight);
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.leftMargin = Math.max(-1, layoutParams6.leftMargin);
        layoutParams6.topMargin = Math.max(K5, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(-1, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(-1, layoutParams6.bottomMargin);
        appCompatTextView7.setLayoutParams(layoutParams6);
        appCompatTextView7.setText(pd0.y(R.string.BsvTest));
        xm3.c(appCompatTextView7);
        final int i5 = 3;
        appCompatTextView7.setOnClickListener(new View.OnClickListener(this) { // from class: k

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o f2863b;

            {
                this.f2863b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i42 = i5;
                AppCompatTextView appCompatTextView52 = null;
                o oVar = this.f2863b;
                switch (i42) {
                    case 0:
                        int i52 = o.f;
                        tf3.h0(oVar.requireActivity(), WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.f(), "&dark=true")), new n42("intentTitle", pd0.y(R.string.PrivacyPolicy))), 0, 4);
                        return;
                    case 1:
                        int i6 = o.f;
                        tf3.h0(oVar.requireActivity(), WebViewActivity.class, tf3.r(new n42("intentTargetUrl", p71.l(tf3.g(), "&dark=true")), new n42("intentTitle", pd0.y(R.string.TermsOfService))), 0, 4);
                        return;
                    case 2:
                        int i7 = o.f;
                        nd3.P((HomeActivity) oVar.requireActivity());
                        zf3.T(oVar, null, new n(oVar, null), 3);
                        return;
                    default:
                        AppCompatTextView appCompatTextView62 = oVar.e;
                        if (appCompatTextView62 != null) {
                            appCompatTextView62.requestFocus();
                        }
                        AppCompatTextView appCompatTextView72 = oVar.d;
                        if (appCompatTextView72 != null) {
                            appCompatTextView52 = appCompatTextView72;
                        }
                        m20.u0(appCompatTextView52);
                        new hr().show(oVar.getChildFragmentManager(), "");
                        return;
                }
            }
        });
        m20.u0(appCompatTextView7);
        qe3Var.addView(appCompatTextView7);
        this.d = appCompatTextView7;
        Iterator it = ew3.O0(qe3Var).iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.leftMargin = tf3.K(30);
            marginLayoutParams.rightMargin = tf3.K(30);
            view.setLayoutParams(marginLayoutParams);
        }
        return qe3Var;
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
    }
}
