package com.security.xvpn.z35kb;

import a.bx;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.a9;
import defpackage.bx3;
import defpackage.cr1;
import defpackage.e43;
import defpackage.ew3;
import defpackage.fl;
import defpackage.g43;
import defpackage.gv2;
import defpackage.hx2;
import defpackage.j5;
import defpackage.kj1;
import defpackage.m20;
import defpackage.og;
import defpackage.pd0;
import defpackage.su2;
import defpackage.tc0;
import defpackage.tf3;
import defpackage.ui1;
import defpackage.ut0;
import defpackage.v73;
import defpackage.y62;
import defpackage.y8;
import defpackage.z8;
import defpackage.zo;
import defpackage.zv3;

/* loaded from: classes2.dex */
public final class AdvancedFeaturesActivity extends zo {
    public static final /* synthetic */ int n = 0;
    public final ui1 l = m20.D0(kj1.f2953a, new tc0(this, 1));
    public zv3 m;

    @Override // defpackage.lt3
    public final String M() {
        return "AdvancedFeaturesPage";
    }

    @Override // defpackage.zo
    public final void a0(Bundle bundle) {
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle(pd0.y(R.string.AdvancedFeatures));
        int i = 1;
        toolbar.setShowBackBtn(true);
        bindInvalidate(toolbar);
        fl.g(this, findViewById(R.id.item_setting_kill_switch), 1000008);
        fl.g(this, findViewById(R.id.itemSplitTunneling), 1000008);
        fl.g(this, findViewById(R.id.itemApplyQuickConn), 1000008);
        fl.g(this, findViewById(R.id.item_setting_stable_connection), 1000008);
        fl.g(this, Z().e, 1000008);
        fl.g(this, findViewById(R.id.llDarkModeGrouop), 1000008);
        fl.n(this, (TextView) findViewById(R.id.tvKillSwitch), 1000107);
        fl.n(this, (TextView) findViewById(R.id.tvKillSwitchDetails), 1000013);
        fl.n(this, (TextView) findViewById(R.id.tvSplitTunneling), 1000107);
        fl.n(this, (TextView) findViewById(R.id.tvSTDetails), 1000013);
        fl.n(this, (TextView) findViewById(R.id.tvApplyQuickConn), 1000107);
        fl.n(this, (TextView) findViewById(R.id.tvApplyQuickConnDetails), 1000013);
        fl.n(this, (TextView) findViewById(R.id.tvDarkMode), 1000107);
        fl.n(this, (TextView) findViewById(R.id.darkOptionOn), 1000013);
        fl.n(this, (TextView) findViewById(R.id.darkOptionOff), 1000013);
        fl.n(this, (TextView) findViewById(R.id.darkOptionAutoText), 1000013);
        fl.n(this, (TextView) findViewById(R.id.darkOptionAutoDetails), 1000013);
        fl.n(this, (TextView) findViewById(R.id.tvStableConnection), 1000107);
        fl.n(this, (TextView) findViewById(R.id.tvStableConnectionDetails), 1000013);
        fl.n(this, Z().q, 1000107);
        fl.n(this, Z().r, 1000013);
        fl.h(this, Z().h, 1000026);
        fl.n(this, Z().w, 1000107);
        fl.n(this, Z().v, 1000013);
        fl.h(this, Z().i, 1000026);
        fl.h(this, Z().j, 1000026);
        fl.g(this, Z().f, 1000008);
        fl.n(this, Z().s, 1000107);
        fl.n(this, Z().t, 1000013);
        SwitchCompat switchCompat = Z().m;
        switchCompat.setThumbDrawable(v73.w());
        switchCompat.setTrackDrawable(v73.x());
        addThemeInvalidateListener(switchCompat);
        Z().q.setText(bx3.R(bx3.R(SpannableString.valueOf(pd0.y(R.string.StaticIP)), " "), bx3.f(pd0.y(R.string.Premium), -14326, 13, 1)));
        Z().w.setText(bx3.R(bx3.R(SpannableString.valueOf(pd0.y(R.string.SplitTunneling)), " "), bx3.f(pd0.y(R.string.Premium), -14326, 13, 1)));
        Z().p.setText(bx3.R(bx3.R(SpannableString.valueOf(pd0.y(R.string.FastConnectBar)), " "), bx3.f(pd0.y(R.string.Premium), -14326, 13, 1)));
        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R.id.switchBtnKillSwitch);
        switchCompat2.setThumbDrawable(v73.w());
        switchCompat2.setTrackDrawable(v73.x());
        addThemeInvalidateListener(switchCompat2);
        SwitchCompat switchCompat3 = (SwitchCompat) findViewById(R.id.switchStableConnection);
        switchCompat3.setThumbDrawable(v73.w());
        switchCompat3.setTrackDrawable(v73.x());
        addThemeInvalidateListener(switchCompat3);
        int i2 = 3;
        m20.G0(Z().e, new z8(this, i2));
        int i3 = 4;
        m20.G0(Z().d, new z8(this, i3));
        Z().h.getDrawable().setAutoMirrored(true);
        Z().i.getDrawable().setAutoMirrored(true);
        Z().j.getDrawable().setAutoMirrored(true);
        g43 g43Var = new g43(Z().n);
        g43Var.b(ew3.U());
        g43.a(g43Var, y62.p, new a9(this, i2));
        g43.a(g43Var, y62.q, new a9(this, i3));
        g43Var.f2205b.add(new e43(y62.r, new a9(this, 5), gv2.h));
        g43Var.d(new a9(this, 0));
        Z().g.setOnClickListener(new cr1(this, 6));
        g43 g43Var2 = new g43(Z().o);
        g43Var2.b(ew3.q0());
        g43.a(g43Var2, y62.m, gv2.i);
        g43Var2.d(gv2.j);
        g43 g43Var3 = new g43(Z().m);
        bx i4 = hx2.i(576);
        boolean q = i4.q();
        i4.h();
        g43Var3.b(q);
        g43.a(g43Var3, y62.n, new a9(this, i));
        int i5 = 2;
        g43.a(g43Var3, y62.o, new a9(this, i5));
        g43Var3.d(gv2.k);
        TextView textView = Z().u;
        String y = pd0.y(R.string.KillSwitch);
        z8 z8Var = new z8(this, i);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y);
        z8Var.invoke(spannableStringBuilder);
        textView.setText(spannableStringBuilder);
        Z().u.setMovementMethod(LinkMovementMethod.getInstance());
        NavigationBarContentConstraintLayout navigationBarContentConstraintLayout = Z().k;
        zv3 zv3Var = new zv3(navigationBarContentConstraintLayout, new ut0(this, i2));
        navigationBarContentConstraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(zv3Var);
        this.m = zv3Var;
        View[] viewArr = {findViewById(R.id.darkOptionOn), findViewById(R.id.darkOptionOff), findViewById(R.id.darkOptionAuto)};
        String[] strArr = {"On", "Off", "Auto"};
        su2 su2Var = new su2(i, viewArr, strArr, this);
        int i6 = 0;
        int i7 = 0;
        while (i6 < 3) {
            viewArr[i6].setOnClickListener(new y8(i7, 0, su2Var));
            i6++;
            i7++;
        }
        int l1 = og.l1(strArr, tf3.e());
        if (l1 >= 0) {
            i5 = l1;
        }
        su2Var.invoke(Integer.valueOf(i5));
    }

    @Override // defpackage.zo
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public final j5 Z() {
        return (j5) this.l.getValue();
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 8 && i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        NavigationBarContentConstraintLayout navigationBarContentConstraintLayout = Z().k;
        zv3 zv3Var = this.m;
        if (navigationBarContentConstraintLayout != null && zv3Var != null) {
            navigationBarContentConstraintLayout.getViewTreeObserver().removeOnGlobalLayoutListener(zv3Var);
        }
    }
}
