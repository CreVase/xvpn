package defpackage;

import a.bx;
import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.l;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.widget.ConnectButton;
import com.security.xvpn.z35kb.widget.DotImageView;

/* loaded from: classes2.dex */
public class dp1 extends sn implements pt3, qt3, v50 {
    public static final /* synthetic */ int q = 0;
    public ViewGroup d;
    public MainActivity e;
    public AppCompatTextView f;
    public TextView g;
    public TextView h;
    public TextView i;
    public ImageView j;
    public DotImageView k;
    public boolean l;
    public ConnectButton m;
    public FrameLayout n;
    public ViewGroup o;
    public boolean p = false;

    @Override // defpackage.pt3
    public final /* synthetic */ void C(String str) {
    }

    public final void D() {
        if (this.h == null) {
            return;
        }
        dc2 O = ew3.O();
        if (!TextUtils.isEmpty((String) O.f1757b)) {
            this.j.setImageResource(R.drawable.ic_home_fastest);
            this.h.setText(pd0.z(R.string.IPAddress, (String) O.f));
            this.i.setText(pd0.A(ew3.D().f446b));
            return;
        }
        if (!ew3.X() && !ew3.e(ew3.S0())) {
            bx i = hx2.i(353);
            boolean q2 = i.q();
            i.h();
            if (!q2) {
                this.h.setText(pd0.y(R.string.SelectLocation));
                this.j.setImageResource(R.drawable.ic_home_free);
                this.i.setText(ew3.D().f446b);
            }
        }
        String S0 = ew3.S0();
        if (TextUtils.isEmpty(S0)) {
            this.j.setImageResource(R.drawable.ic_home_fastest);
        } else {
            bx j = hx2.j(S0, 189);
            String u = j.u();
            j.h();
            this.j.setImageResource(fl.C(getActivity(), u));
        }
        this.h.setText(pd0.A(ew3.J(S0)));
        this.i.setText(ew3.D().f446b);
    }

    public final void E() {
        boolean z;
        D();
        if (ew3.e(ew3.S0()) && m20.B0()) {
            z = true;
        } else {
            z = false;
        }
        if (!z && ew3.X()) {
            this.d.findViewById(R.id.fragment_native_ad_wrapper).setVisibility(8);
        }
    }

    public final void G() {
        this.l = true;
        this.f.setVisibility(4);
        this.g.setVisibility(0);
    }

    @Override // defpackage.pt3
    public final void c(int i) {
        ConnectButton connectButton = this.m;
        if (connectButton == null) {
            return;
        }
        connectButton.setConnectState(i);
        this.c.c(this.g);
        int i2 = 1;
        switch (i) {
            case 65281:
                this.g.setText(pd0.y(R.string.StatusConnecting));
                fl.n(this, this.g, 1000130);
                this.f.setVisibility(4);
                this.g.setVisibility(0);
                break;
            case 65282:
            case 65284:
                this.g.setText(pd0.y(R.string.StatusON));
                fl.n(this, this.g, 1000130);
                l activity = getActivity();
                if (this.e != null && activity != null && !activity.isFinishing()) {
                    i2 = 0;
                }
                if (i2 == 0) {
                    this.g.setText(pd0.y(R.string.StatusON));
                    this.f.setVisibility(4);
                    this.g.setVisibility(0);
                    D();
                    E();
                    break;
                }
                break;
            case 65283:
                this.g.setText(pd0.y(R.string.StatusReconnecting));
                fl.n(this, this.g, 1000130);
                break;
            case 65285:
                this.g.setText(pd0.y(R.string.StatusDisconnecting));
                fl.n(this, this.g, 1000131);
                break;
            case 65286:
                this.g.setText(pd0.y(R.string.StatusOFF));
                fl.n(this, this.g, 1000131);
                if (this.p) {
                    this.p = false;
                    bx j = hx2.j("DisConnect", 252);
                    boolean q2 = j.q();
                    j.h();
                    if (!q2) {
                        bx3.Z((dn) requireActivity());
                        break;
                    } else {
                        this.m.postDelayed(new ap1(this, i2), 1000L);
                        break;
                    }
                }
                break;
        }
        D();
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            if (i != 6 && i != 7) {
                switch (i) {
                    case 768:
                    case 769:
                    case 770:
                    case 771:
                        break;
                    default:
                        return;
                }
            }
            pe0.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        this.e = (MainActivity) activity;
        rt3.e().a(this);
        rt3.e().c(this);
        x50.t().g(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.fragment_main_v7, viewGroup, false);
    }

    @Override // defpackage.sn, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.e = null;
        super.onDetach();
        rt3.e().j(this);
        rt3.e().l(this);
        x50.t().z(this);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        rt3.e().g(rt3.e().f4214b);
    }

    @Override // defpackage.sn, defpackage.w73
    public final void p(boolean z) {
        super.p(z);
        z();
    }

    @Override // defpackage.sn
    public final void t(View view, Bundle bundle) {
        ColorStateList valueOf;
        ViewGroup viewGroup = (ViewGroup) view;
        this.d = viewGroup;
        this.n = (FrameLayout) viewGroup.findViewById(R.id.fragment_native_ad_wrapper);
        this.f = (AppCompatTextView) this.d.findViewById(R.id.tap_connect_btn_tv);
        this.g = (TextView) this.d.findViewById(R.id.vpn_status_tv);
        this.j = (ImageView) this.d.findViewById(R.id.ivSelectedLocation);
        this.h = (TextView) this.d.findViewById(R.id.tvSelectedLocation);
        this.i = (TextView) this.d.findViewById(R.id.tvProtocol);
        ViewGroup viewGroup2 = (ViewGroup) this.d.findViewById(R.id.connectStatusTip);
        this.o = viewGroup2;
        int i = 0;
        int i2 = 1;
        bx i3 = hx2.i(131);
        boolean q2 = i3.q();
        i3.h();
        this.l = q2;
        if (!q2) {
            this.f.setVisibility(0);
            this.g.setVisibility(4);
        } else {
            this.f.setVisibility(4);
            this.g.setVisibility(0);
        }
        this.m = (ConnectButton) this.d.findViewById(R.id.connect_btn);
        pe0.b();
        this.d.findViewById(R.id.connect_btn).setOnClickListener(new cr1(this, 8));
        View s = s(R.id.btnSelectLocation);
        View s2 = s(R.id.btnSelectProtocol);
        s.setOnClickListener(new cp1(this, i));
        s2.setOnClickListener(new cp1(this, i2));
        this.d.findViewById(R.id.toAdvancedFeatures).setOnClickListener(new cp1(this, 2));
        this.d.findViewById(R.id.toPrivateBrowser).setOnClickListener(new cp1(this, 3));
        ir irVar = new ir();
        float f = 35 * tf3.F;
        irVar.j = new float[]{f, f, f, f};
        irVar.c = tf3.D(12);
        irVar.d = tf3.D(8);
        irVar.o = v73.j(1000067);
        irVar.f = 2;
        irVar.e = 0.65f;
        if (getResources().getBoolean(R.bool.isTablet) && !XApplication.c) {
            s(R.id.select_panel).setMinimumWidth(0);
        }
        DotImageView dotImageView = (DotImageView) this.d.findViewById(R.id.ivAdvancedFeatures);
        this.k = dotImageView;
        bx i4 = hx2.i(61);
        boolean q3 = i4.q();
        i4.h();
        dotImageView.g = q3;
        dotImageView.invalidate();
        fl.n(this, (TextView) s(R.id.tvBrowser), 1000013);
        fl.n(this, (TextView) s(R.id.tvAdvancedFeatures), 1000013);
        fl.g(this, s(R.id.divider), 1000010);
        AppCompatTextView appCompatTextView = this.f;
        a83 a83Var = this.c;
        if (appCompatTextView != null) {
            if (v73.l()) {
                if (!v73.l()) {
                    valueOf = null;
                } else {
                    valueOf = ColorStateList.valueOf(v73.j(1000086));
                }
                ll3.r(appCompatTextView, valueOf);
            }
            a83Var.a(new z73(11, 1000086, appCompatTextView));
        }
        a83Var.c(this.g);
        if (rt3.e().f4214b != 65286 && rt3.e().f4214b != 65285) {
            fl.n(this, this.g, 1000130);
        } else {
            fl.n(this, this.g, 1000131);
        }
        z();
    }

    @Override // defpackage.v50
    public final void v() {
        ew3.d0(new ap1(this, 0));
    }

    @Override // defpackage.v50
    public final /* synthetic */ void y(String str, boolean z, boolean z2) {
    }

    public final void z() {
        ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_pressed}, StateSet.WILD_CARD}, new int[]{-12008727, v73.j(1000013)});
        this.h.setTextColor(colorStateList);
        this.i.setTextColor(colorStateList);
        Resources resources = getResources();
        Resources.Theme newTheme = getResources().newTheme();
        ThreadLocal threadLocal = jk2.f2780a;
        Drawable a2 = ck2.a(resources, R.drawable.ic_home_arrow_right, newTheme);
        a2.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
        a2.setTintList(colorStateList);
        this.h.setCompoundDrawablesRelative(null, null, a2, null);
        this.i.setCompoundDrawablesRelative(null, null, a2, null);
    }
}
