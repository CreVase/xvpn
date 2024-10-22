package com.security.xvpn.z35kb.connlog;

import a.bx;
import a.du;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.recyclerview.widget.RecyclerView;
import b.ContentWrapper;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.util.WrapContentLinearLayoutManager;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.a60;
import defpackage.b60;
import defpackage.c60;
import defpackage.d60;
import defpackage.da;
import defpackage.dc2;
import defpackage.dn;
import defpackage.eu3;
import defpackage.ew3;
import defpackage.fl;
import defpackage.g43;
import defpackage.g53;
import defpackage.gb2;
import defpackage.gv2;
import defpackage.hx2;
import defpackage.i60;
import defpackage.k43;
import defpackage.k60;
import defpackage.m20;
import defpackage.n01;
import defpackage.pd0;
import defpackage.rt3;
import defpackage.tf3;
import defpackage.v50;
import defpackage.v73;
import defpackage.w50;
import defpackage.x50;
import defpackage.y50;
import defpackage.y62;
import defpackage.z50;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ConnectionLogActivity extends dn implements v50 {
    public static final /* synthetic */ int s = 0;
    public eu3 k;
    public AppCompatTextView l;
    public AppCompatTextView m;
    public final ArrayList n;
    public final i60 o;
    public final HashMap p;
    public boolean q;
    public boolean r;

    public ConnectionLogActivity() {
        ArrayList arrayList = new ArrayList();
        this.n = arrayList;
        this.o = new i60(this, arrayList);
        this.p = new HashMap();
        this.r = true;
    }

    @Override // defpackage.lt3
    public final String M() {
        return "ConnectionLogPage";
    }

    @Override // defpackage.lt3
    public final void R() {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        LinearLayout.LayoutParams layoutParams3;
        LinearLayout.LayoutParams layoutParams4;
        LinearLayout.LayoutParams layoutParams5;
        LinearLayout.LayoutParams layoutParams6;
        LinearLayout.LayoutParams layoutParams7;
        ContentWrapper contentWrapper = new ContentWrapper(this, null, 6);
        contentWrapper.setId(-1);
        int i = 0;
        eu3 eu3Var = new eu3(contentWrapper.getContext(), null, 6, 0);
        eu3Var.setOrientation(1);
        eu3Var.setId(-1);
        z50 z50Var = new z50(this, 1);
        View toolbar = new Toolbar(eu3Var.getContext(), null, 6);
        z50Var.invoke(toolbar);
        eu3Var.addView(toolbar);
        eu3 h = hx2.h(eu3Var.getContext(), null, 6, 0, 0);
        h.setId(-1);
        AppCompatTextView appCompatTextView = new AppCompatTextView(h.getContext(), null);
        appCompatTextView.setId(-1);
        appCompatTextView.setText("");
        tf3.A0(appCompatTextView);
        appCompatTextView.setPadding(tf3.D(20), tf3.D(10), tf3.D(6), tf3.D(10));
        appCompatTextView.setTextSize(12.0f);
        if (appCompatTextView.getLayoutParams() == null) {
            appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams layoutParams8 = appCompatTextView.getLayoutParams();
        if (layoutParams8 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams8;
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
        layoutParams.topMargin = Math.max(-1, layoutParams.topMargin);
        layoutParams.rightMargin = Math.max(-1, layoutParams.rightMargin);
        layoutParams.bottomMargin = Math.max(-1, layoutParams.bottomMargin);
        layoutParams.weight = 1.0f;
        appCompatTextView.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams9 = appCompatTextView.getLayoutParams();
        if (layoutParams9 instanceof LinearLayout.LayoutParams) {
            layoutParams2 = (LinearLayout.LayoutParams) layoutParams9;
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
        layoutParams2.width = 0;
        appCompatTextView.setLayoutParams(layoutParams2);
        h.addView(appCompatTextView);
        this.l = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(h.getContext(), null);
        appCompatTextView2.setId(-1);
        appCompatTextView2.setText("");
        tf3.A0(appCompatTextView2);
        appCompatTextView2.setTextSize(12.0f);
        appCompatTextView2.getPaint().setUnderlineText(true);
        appCompatTextView2.setText(pd0.y(R.string.Disconnect));
        ViewGroup.LayoutParams layoutParams10 = appCompatTextView2.getLayoutParams();
        if (layoutParams10 instanceof LinearLayout.LayoutParams) {
            layoutParams3 = (LinearLayout.LayoutParams) layoutParams10;
        } else {
            layoutParams3 = null;
        }
        if (layoutParams3 == null) {
            layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams3.width = -2;
        layoutParams3.height = -2;
        layoutParams3.weight = Math.max(-1.0f, layoutParams3.weight);
        layoutParams3.gravity = Math.max(-1, layoutParams3.gravity);
        layoutParams3.leftMargin = Math.max(-1, layoutParams3.leftMargin);
        layoutParams3.topMargin = Math.max(-1, layoutParams3.topMargin);
        layoutParams3.rightMargin = Math.max(-1, layoutParams3.rightMargin);
        layoutParams3.bottomMargin = Math.max(-1, layoutParams3.bottomMargin);
        layoutParams3.height = -1;
        layoutParams3.gravity = 17;
        appCompatTextView2.setLayoutParams(layoutParams3);
        appCompatTextView2.setGravity(17);
        appCompatTextView2.setPadding(tf3.D(4), 0, tf3.D(16), 0);
        appCompatTextView2.setOnClickListener(new da(3));
        h.addView(appCompatTextView2);
        this.m = appCompatTextView2;
        if (h.getAttachToParent()) {
            eu3Var.addView(h);
        }
        this.k = h;
        eu3 h2 = hx2.h(eu3Var.getContext(), null, 6, 0, 0);
        h2.setId(-1);
        h2.setGravity(16);
        h2.setPadding(tf3.K(20), tf3.K(15), tf3.K(20), tf3.K(15));
        if (h2.getLayoutParams() == null) {
            h2.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        }
        ViewGroup.LayoutParams layoutParams11 = h2.getLayoutParams();
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
        layoutParams4.leftMargin = Math.max(-1, layoutParams4.leftMargin);
        layoutParams4.topMargin = Math.max(-1, layoutParams4.topMargin);
        layoutParams4.rightMargin = Math.max(-1, layoutParams4.rightMargin);
        layoutParams4.bottomMargin = Math.max(-1, layoutParams4.bottomMargin);
        layoutParams4.width = -1;
        h2.setLayoutParams(layoutParams4);
        AppCompatTextView appCompatTextView3 = new AppCompatTextView(h2.getContext(), null);
        appCompatTextView3.setId(-1);
        appCompatTextView3.setText("");
        tf3.A0(appCompatTextView3);
        appCompatTextView3.setText(pd0.y(R.string.ConnectionConfig));
        appCompatTextView3.setTextSize(17.0f);
        appCompatTextView3.setTypeface(n01.a());
        appCompatTextView3.setMaxLines(1);
        fl.n(this, appCompatTextView3, 1000110);
        appCompatTextView3.setGravity(8388611);
        ViewGroup.LayoutParams layoutParams12 = appCompatTextView3.getLayoutParams();
        if (layoutParams12 instanceof LinearLayout.LayoutParams) {
            layoutParams5 = (LinearLayout.LayoutParams) layoutParams12;
        } else {
            layoutParams5 = null;
        }
        if (layoutParams5 == null) {
            layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams5.width = -2;
        layoutParams5.height = -2;
        layoutParams5.weight = Math.max(-1.0f, layoutParams5.weight);
        layoutParams5.gravity = Math.max(-1, layoutParams5.gravity);
        layoutParams5.leftMargin = Math.max(-1, layoutParams5.leftMargin);
        layoutParams5.topMargin = Math.max(-1, layoutParams5.topMargin);
        layoutParams5.rightMargin = Math.max(-1, layoutParams5.rightMargin);
        layoutParams5.bottomMargin = Math.max(-1, layoutParams5.bottomMargin);
        layoutParams5.width = tf3.H - tf3.K(140);
        appCompatTextView3.setLayoutParams(layoutParams5);
        if (Build.VERSION.SDK_INT >= 26) {
            appCompatTextView3.setAutoSizeTextTypeUniformWithConfiguration(tf3.S(10), tf3.S(17), 1, 0);
        }
        h2.addView(appCompatTextView3);
        AppCompatImageView appCompatImageView = new AppCompatImageView(h2.getContext(), null);
        appCompatImageView.setId(R.id.btnQa);
        int K = tf3.K(4);
        appCompatImageView.setPadding(K, K, K, K);
        appCompatImageView.setImageTintList(ColorStateList.valueOf(-4210753));
        appCompatImageView.setOnClickListener(new y50(this, i));
        appCompatImageView.setImageResource(R.drawable.ic_static_ip_qa);
        h2.addView(appCompatImageView);
        Space space = new Space(h2.getContext());
        if (space.getLayoutParams() == null) {
            hx2.v(-2, -2, space);
        }
        ViewGroup.LayoutParams layoutParams13 = space.getLayoutParams();
        if (layoutParams13 instanceof LinearLayout.LayoutParams) {
            layoutParams6 = (LinearLayout.LayoutParams) layoutParams13;
        } else {
            layoutParams6 = null;
        }
        if (layoutParams6 == null) {
            layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams6.width = -2;
        layoutParams6.height = -2;
        layoutParams6.weight = Math.max(-1.0f, layoutParams6.weight);
        layoutParams6.gravity = Math.max(-1, layoutParams6.gravity);
        layoutParams6.leftMargin = Math.max(-1, layoutParams6.leftMargin);
        layoutParams6.topMargin = Math.max(-1, layoutParams6.topMargin);
        layoutParams6.rightMargin = Math.max(-1, layoutParams6.rightMargin);
        layoutParams6.bottomMargin = Math.max(-1, layoutParams6.bottomMargin);
        layoutParams6.weight = 1.0f;
        space.setLayoutParams(layoutParams6);
        h2.addView(space);
        SwitchCompat switchCompat = new SwitchCompat(h2.getContext(), null);
        switchCompat.setId(R.id.switchStaticIp);
        switchCompat.setThumbDrawable(v73.w());
        switchCompat.setTrackDrawable(v73.x());
        g43 g43Var = new g43(switchCompat);
        g43Var.b(ew3.K());
        g43.a(g43Var, y62.B, new a60(i, this, switchCompat));
        g43Var.d(gv2.l);
        addThemeInvalidateListener(switchCompat);
        h2.addView(switchCompat);
        if (h2.getAttachToParent()) {
            eu3Var.addView(h2);
        }
        RecyclerView recyclerView = new RecyclerView(eu3Var.getContext(), null);
        recyclerView.setLayoutManager(new WrapContentLinearLayoutManager());
        recyclerView.i(new b60());
        i60 i60Var = this.o;
        i60Var.A(true);
        recyclerView.setAdapter(i60Var);
        ViewGroup.LayoutParams layoutParams14 = recyclerView.getLayoutParams();
        if (layoutParams14 instanceof LinearLayout.LayoutParams) {
            layoutParams7 = (LinearLayout.LayoutParams) layoutParams14;
        } else {
            layoutParams7 = null;
        }
        if (layoutParams7 == null) {
            layoutParams7 = new LinearLayout.LayoutParams(-2, -2);
        }
        layoutParams7.width = -2;
        layoutParams7.height = -2;
        layoutParams7.weight = Math.max(-1.0f, layoutParams7.weight);
        layoutParams7.gravity = Math.max(-1, layoutParams7.gravity);
        layoutParams7.leftMargin = Math.max(-1, layoutParams7.leftMargin);
        layoutParams7.topMargin = Math.max(-1, layoutParams7.topMargin);
        layoutParams7.rightMargin = Math.max(-1, layoutParams7.rightMargin);
        layoutParams7.bottomMargin = Math.max(-1, layoutParams7.bottomMargin);
        layoutParams7.width = -1;
        layoutParams7.weight = 1.0f;
        recyclerView.setLayoutParams(layoutParams7);
        recyclerView.setClipToPadding(false);
        contentWrapper.a(new c60(recyclerView, i));
        eu3Var.addView(recyclerView);
        if (eu3Var.getAttachToParent()) {
            contentWrapper.addView(eu3Var);
        }
        setContentView(contentWrapper);
        i60Var.e = new z50(this, 2);
        i60Var.f = new d60(this);
        du.d(304, null);
    }

    @Override // defpackage.dn
    public final int Y() {
        return 1000004;
    }

    public final void Z() {
        ArrayList<w50> arrayList = this.n;
        arrayList.clear();
        bx bxVar = new bx();
        du.d(197, bxVar);
        int t = (int) bxVar.t();
        dc2[] dc2VarArr = new dc2[t];
        for (int i = 0; i < t; i++) {
            dc2 dc2Var = new dc2(0);
            ew3.v0(bxVar, dc2Var);
            dc2VarArr[i] = dc2Var;
        }
        bxVar.h();
        if (t == 0) {
            this.q = false;
            arrayList.add(new w50(5, "", "", "", "", "", "", "", false, 1));
        } else {
            int i2 = 1;
            this.q = true;
            k43 k43Var = k60.f2895a;
            ArrayList arrayList2 = new ArrayList();
            bx i3 = hx2.i(200);
            boolean q = i3.q();
            i3.h();
            if (q) {
                i2 = 3;
            }
            for (int i4 = 0; i4 < t; i4++) {
                dc2 dc2Var2 = dc2VarArr[i4];
                arrayList2.add(new w50(3, (String) dc2Var2.f1757b, (String) dc2Var2.c, (String) dc2Var2.d, (String) dc2Var2.e, (String) dc2Var2.f, (String) dc2Var2.g, (String) dc2Var2.h, dc2Var2.f1756a, i2));
            }
            arrayList.addAll(arrayList2);
        }
        for (w50 w50Var : arrayList) {
            Integer num = (Integer) this.p.get(w50Var.f4943b);
            if (num != null) {
                w50Var.j = num.intValue();
            }
        }
        this.o.f();
    }

    public final void a0(boolean z) {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            ((w50) it.next()).j = 1;
        }
        this.p.clear();
        this.o.f();
        bx bxVar = new bx();
        bxVar.v(z);
        du.d(201, bxVar);
        bxVar.h();
    }

    public final void b0() {
        int i;
        dc2 O = ew3.O();
        this.p.put((String) O.f1757b, 5);
        for (w50 w50Var : this.n) {
            if (m20.L((String) O.f1757b, w50Var.f4943b)) {
                i = 5;
            } else {
                i = 3;
            }
            w50Var.j = i;
        }
        this.o.f();
    }

    @Override // defpackage.dn, defpackage.pt3
    public final void c(int i) {
        eu3 eu3Var = null;
        if (!this.q) {
            eu3 eu3Var2 = this.k;
            if (eu3Var2 != null) {
                eu3Var = eu3Var2;
            }
            tf3.V(eu3Var);
            return;
        }
        if (!this.r) {
            du.d(202, null);
        }
        eu3 eu3Var3 = this.k;
        if (eu3Var3 == null) {
            eu3Var3 = null;
        }
        tf3.v0(eu3Var3);
        eu3 eu3Var4 = this.k;
        if (eu3Var4 == null) {
            eu3Var4 = null;
        }
        this.i.c(eu3Var4);
        if (i != 65282) {
            if (i != 65286) {
                AppCompatTextView appCompatTextView = this.l;
                if (appCompatTextView == null) {
                    appCompatTextView = null;
                }
                appCompatTextView.setText(pd0.y(R.string.ConnectionLogVPNConnecting));
                AppCompatTextView appCompatTextView2 = this.l;
                if (appCompatTextView2 == null) {
                    appCompatTextView2 = null;
                }
                appCompatTextView2.setTextColor(-1);
                AppCompatTextView appCompatTextView3 = this.m;
                if (appCompatTextView3 == null) {
                    appCompatTextView3 = null;
                }
                appCompatTextView3.setTextColor(-1);
                eu3 eu3Var5 = this.k;
                if (eu3Var5 != null) {
                    eu3Var = eu3Var5;
                }
                fl.g(this, eu3Var, 1000031);
                b0();
            } else {
                if (!this.r) {
                    a0(false);
                }
                eu3 eu3Var6 = this.k;
                if (eu3Var6 == null) {
                    eu3Var6 = null;
                }
                tf3.V(eu3Var6);
                AppCompatTextView appCompatTextView4 = this.l;
                if (appCompatTextView4 == null) {
                    appCompatTextView4 = null;
                }
                appCompatTextView4.setText(pd0.y(R.string.ConnectionLogCheckingTips));
                AppCompatTextView appCompatTextView5 = this.l;
                if (appCompatTextView5 == null) {
                    appCompatTextView5 = null;
                }
                appCompatTextView5.setTextColor(-1);
                AppCompatTextView appCompatTextView6 = this.m;
                if (appCompatTextView6 == null) {
                    appCompatTextView6 = null;
                }
                appCompatTextView6.setTextColor(-1);
                eu3 eu3Var7 = this.k;
                if (eu3Var7 != null) {
                    eu3Var = eu3Var7;
                }
                fl.g(this, eu3Var, 1000029);
            }
        } else {
            AppCompatTextView appCompatTextView7 = this.l;
            if (appCompatTextView7 == null) {
                appCompatTextView7 = null;
            }
            appCompatTextView7.setText(pd0.y(R.string.ConnectionLogVPNOnTips));
            AppCompatTextView appCompatTextView8 = this.l;
            if (appCompatTextView8 == null) {
                appCompatTextView8 = null;
            }
            appCompatTextView8.setTextColor(-13421773);
            AppCompatTextView appCompatTextView9 = this.m;
            if (appCompatTextView9 == null) {
                appCompatTextView9 = null;
            }
            appCompatTextView9.setTextColor(-13421773);
            eu3 eu3Var8 = this.k;
            if (eu3Var8 != null) {
                eu3Var = eu3Var8;
            }
            fl.g(this, eu3Var, 1000030);
            b0();
        }
        this.r = false;
        Z();
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
    public final void onStart() {
        super.onStart();
        Z();
        x50.t().g(this);
        a0(true);
        rt3.e().a(this);
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStop() {
        super.onStop();
        rt3.e().j(this);
        x50.t().z(this);
        du.d(202, null);
    }

    @Override // defpackage.dn, defpackage.w73
    public final void p(boolean z) {
        super.p(z);
        if (!z && !this.q) {
            this.o.f();
        }
    }

    @Override // defpackage.v50
    public final /* synthetic */ void v() {
    }

    @Override // defpackage.v50
    public final void y(String str, boolean z, boolean z2) {
        if (z2) {
            runOnUiThread(new g53(this, 1));
        }
        runOnUiThread(new gb2(this, str, z));
    }
}
