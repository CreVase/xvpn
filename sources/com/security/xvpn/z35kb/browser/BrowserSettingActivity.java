package com.security.xvpn.z35kb.browser;

import a.bx;
import a.du;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.databinding.DataBinderMapperImpl;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import defpackage.br;
import defpackage.cr1;
import defpackage.dn;
import defpackage.dr;
import defpackage.fl;
import defpackage.hx2;
import defpackage.m5;
import defpackage.m6;
import defpackage.md0;
import defpackage.n5;
import defpackage.pd0;
import defpackage.sm1;
import defpackage.tl3;
import defpackage.v73;
import defpackage.vp;
import defpackage.ya0;

/* loaded from: classes2.dex */
public class BrowserSettingActivity extends dn implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    public static final /* synthetic */ int m = 0;
    public m5 k;
    public dr l;

    @Override // defpackage.lt3
    public final String M() {
        return BrowserSettingActivity.class.getName();
    }

    @Override // defpackage.lt3
    public final void R() {
        LayoutInflater layoutInflater = getLayoutInflater();
        int i = m5.z;
        DataBinderMapperImpl dataBinderMapperImpl = md0.f3279a;
        m5 m5Var = (m5) tl3.i(layoutInflater, R.layout.activity_browser_setting, null, null);
        this.k = m5Var;
        setContentView(m5Var.e);
        this.k.u.setTitle(pd0.y(R.string.Settings));
        this.k.u.setShowBackBtn(true);
        this.k.u.getBtnBack().setOnClickListener(new cr1(this, 13));
        SwitchCompat switchCompat = this.k.o;
        bx i2 = hx2.i(506);
        boolean q = i2.q();
        i2.h();
        switchCompat.setChecked(q);
        SwitchCompat switchCompat2 = this.k.p;
        bx i3 = hx2.i(507);
        boolean q2 = i3.q();
        i3.h();
        switchCompat2.setChecked(q2);
        this.k.t.setOnClickListener(this);
        this.k.v.setOnClickListener(this);
        this.k.o.setOnCheckedChangeListener(this);
        this.k.p.setOnCheckedChangeListener(this);
        bx bxVar = new bx();
        du.d(511, bxVar);
        String u = bxVar.u();
        bxVar.h();
        a0(u);
        this.l = new dr(this);
        n5 n5Var = (n5) this.k;
        n5Var.x = Boolean.FALSE;
        synchronized (n5Var) {
            n5Var.C |= 2;
        }
        n5Var.e(11);
        n5Var.m();
        fl.n(this, this.k.w, 1000014);
        fl.n(this, this.k.v, 1000014);
        fl.k(this, this.k.u);
        this.k.v.setBackground(v73.u(1000008));
        this.k.t.setBackground(v73.u(1000008));
        bindInvalidate(this.k.t);
        fl.n(this, this.k.r, 1000013);
        fl.n(this, this.k.q, 1000013);
    }

    public final void Z(int i, String str) {
        vp vpVar = new vp();
        vpVar.f4875b = i;
        vpVar.f4874a = str;
        n5 n5Var = (n5) this.k;
        n5Var.y = vpVar;
        synchronized (n5Var) {
            n5Var.C |= 1;
        }
        n5Var.e(7);
        n5Var.m();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void a0(String str) {
        char c;
        switch (str.hashCode()) {
            case 2070624:
                if (str.equals("Bing")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 1774242234:
                if (str.equals("DuckDuckGo")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 2103552695:
                if (str.equals("Amazon.com")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 2138589785:
                if (str.equals("Google")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c != 0) {
            if (c != 1) {
                if (c != 2) {
                    Z(R.drawable.icon_search_engine_duckduckgo, "DuckDuckGo");
                    return;
                } else {
                    Z(R.drawable.icon_search_engine_amazon, "Amazon.com");
                    return;
                }
            }
            Z(R.drawable.icon_search_engine_google, "Google");
            return;
        }
        Z(R.drawable.icon_search_engine_bing, "Bing");
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        switch (compoundButton.getId()) {
            case R.id.btn_switch_block_ads /* 2131230901 */:
                bx bxVar = new bx();
                bxVar.v(z);
                du.d(508, bxVar);
                bxVar.h();
                return;
            case R.id.btn_switch_block_tracker /* 2131230902 */:
                bx bxVar2 = new bx();
                bxVar2.v(z);
                du.d(509, bxVar2);
                bxVar2.h();
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id != R.id.ll_search_engine) {
            if (id == R.id.tv_clean_history) {
                ya0.H(this.c, ChooseClearTypeActivity.class);
                return;
            }
            return;
        }
        Bundle bundle = new Bundle();
        String charSequence = this.k.w.getText().toString();
        charSequence.getClass();
        char c = 65535;
        switch (charSequence.hashCode()) {
            case 2070624:
                if (charSequence.equals("Bing")) {
                    c = 0;
                    break;
                }
                break;
            case 1774242234:
                if (charSequence.equals("DuckDuckGo")) {
                    c = 1;
                    break;
                }
                break;
            case 2103552695:
                if (charSequence.equals("Amazon.com")) {
                    c = 2;
                    break;
                }
                break;
            case 2138589785:
                if (charSequence.equals("Google")) {
                    c = 3;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                bundle.putInt("search_engine", 1);
                break;
            case 1:
                bundle.putInt("search_engine", 0);
                break;
            case 2:
                bundle.putInt("search_engine", 3);
                break;
            case 3:
                bundle.putInt("search_engine", 2);
                break;
        }
        Intent intent = new Intent(this, (Class<?>) SearchEngineActivity.class);
        intent.putExtras(bundle);
        m6 m6Var = (m6) getFragmentManager().findFragmentByTag("AvoidOnResult");
        if (m6Var == null) {
            m6Var = new m6();
            FragmentManager fragmentManager = getFragmentManager();
            fragmentManager.beginTransaction().add(m6Var, "AvoidOnResult").commitAllowingStateLoss();
            fragmentManager.executePendingTransactions();
        }
        m6Var.f3239a.put(1, this.l);
        m6Var.startActivityForResult(intent, 1);
    }

    @Override // defpackage.ic, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4) {
            br brVar = br.f513a;
            ya0.H(this, PrivateBrowserActivity.class);
            overridePendingTransition(R.anim.slide_left_in, R.anim.none);
            finish();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (!((XApplication) this.c.getApplication()).c() && ya0.e0()) {
            sm1.a(this.c).c(new Intent("ClearHistory"));
        }
    }
}
