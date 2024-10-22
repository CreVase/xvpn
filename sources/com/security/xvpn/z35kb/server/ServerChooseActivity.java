package com.security.xvpn.z35kb.server;

import a.bx;
import a.du;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.a;
import androidx.fragment.app.p;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.server.ServerChooseActivity;
import com.security.xvpn.z35kb.speedtest.SpeedTestActivity;
import com.security.xvpn.z35kb.widget.XEditText;
import com.vungle.ads.internal.protos.Sdk;
import defpackage.a22;
import defpackage.bn0;
import defpackage.bq2;
import defpackage.cp3;
import defpackage.cq2;
import defpackage.ew3;
import defpackage.ey1;
import defpackage.f6;
import defpackage.fl;
import defpackage.g53;
import defpackage.h7;
import defpackage.hx2;
import defpackage.iq2;
import defpackage.kj1;
import defpackage.m20;
import defpackage.nt3;
import defpackage.og;
import defpackage.pe0;
import defpackage.r61;
import defpackage.sq2;
import defpackage.t00;
import defpackage.t9;
import defpackage.tc0;
import defpackage.tf3;
import defpackage.ui1;
import defpackage.uo1;
import defpackage.ut0;
import defpackage.v73;
import defpackage.vl0;
import defpackage.w53;
import defpackage.xn2;
import defpackage.z73;
import defpackage.zf3;
import defpackage.zg2;
import defpackage.zo;
import defpackage.zp2;

/* loaded from: classes2.dex */
public final class ServerChooseActivity extends zo implements w53, a22 {
    public static boolean u;
    public Rect s;
    public final String[] l = {"Recommend", "All", "Video&Game"};
    public final ey1 m = new ey1();
    public final ey1 n = new ey1();
    public final ey1 o = new ey1();
    public final ey1 p = new ey1();
    public final iq2[] q = new iq2[3];
    public int r = -1;
    public final ui1 t = m20.D0(kj1.f2953a, new tc0(this, 15));

    @Override // defpackage.a22
    public final void F(Object obj) {
        zp2 zp2Var = (zp2) obj;
        du.d(271, null);
        if ("Premium".equals(zp2Var.e)) {
            du.d(278, null);
        }
        if (zp2Var.d()) {
            if (ew3.V()) {
                t9.u0(this, new cq2(this, 2));
                return;
            } else {
                e0(zp2Var);
                return;
            }
        }
        cq2 cq2Var = new cq2(this, 1);
        bx j = hx2.j(zp2Var.a(), 193);
        boolean q = j.q();
        j.h();
        if (q) {
            bx i = hx2.i(Sdk.SDKError.Reason.TPAT_RETRY_FAILED_VALUE);
            boolean q2 = i.q();
            i.h();
            if (q2) {
                du.d(139, null);
                t9.u0(this, new f6(cq2Var, zp2Var, 0));
                return;
            }
        }
        cq2Var.invoke(zp2Var);
    }

    @Override // defpackage.lt3
    public final String M() {
        return "ChooseServerPage";
    }

    @Override // defpackage.dn
    public final int Y() {
        return 1000004;
    }

    @Override // defpackage.zo
    public final void a0(Bundle bundle) {
        cp3.A(this);
        m20.Y0(Z().i);
        m20.w0(Z().h);
        fl.g(this, Z().e, 1000049);
        fl.g(this, Z().f, 1000049);
        if (zf3.R()) {
            Z().g.setGravity(21);
        }
        final int i = 0;
        Z().g.setOnClickListener(new View.OnClickListener(this) { // from class: aq2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ServerChooseActivity f319b;

            {
                this.f319b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                ServerChooseActivity serverChooseActivity = this.f319b;
                switch (i2) {
                    case 0:
                        boolean z = ServerChooseActivity.u;
                        serverChooseActivity.Z().g.setFocusable(true);
                        serverChooseActivity.Z().g.setFocusableInTouchMode(true);
                        serverChooseActivity.Z().g.requestFocus();
                        m20.J0(view);
                        return;
                    case 1:
                        boolean z2 = ServerChooseActivity.u;
                        serverChooseActivity.Z().g.setFocusable(false);
                        serverChooseActivity.c0(false);
                        return;
                    case 2:
                        boolean z3 = ServerChooseActivity.u;
                        tf3.f0(serverChooseActivity, SpeedTestActivity.class, 1);
                        return;
                    default:
                        boolean z4 = ServerChooseActivity.u;
                        serverChooseActivity.finish();
                        return;
                }
            }
        });
        Z().g.setFocusable(false);
        Z().g.setOnFocusChangeListener(new t00(this, 6));
        Z().g.addTextChangedListener(new xn2(this, 5));
        XEditText xEditText = Z().g;
        xEditText.g = xEditText.getResources().getDrawable(R.drawable.icon_edit_text_clear);
        final int i2 = 1;
        xEditText.h = true;
        xEditText.setRightClick(new nt3(xEditText, 0));
        Z().c.setOnClickListener(new View.OnClickListener(this) { // from class: aq2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ServerChooseActivity f319b;

            {
                this.f319b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                ServerChooseActivity serverChooseActivity = this.f319b;
                switch (i22) {
                    case 0:
                        boolean z = ServerChooseActivity.u;
                        serverChooseActivity.Z().g.setFocusable(true);
                        serverChooseActivity.Z().g.setFocusableInTouchMode(true);
                        serverChooseActivity.Z().g.requestFocus();
                        m20.J0(view);
                        return;
                    case 1:
                        boolean z2 = ServerChooseActivity.u;
                        serverChooseActivity.Z().g.setFocusable(false);
                        serverChooseActivity.c0(false);
                        return;
                    case 2:
                        boolean z3 = ServerChooseActivity.u;
                        tf3.f0(serverChooseActivity, SpeedTestActivity.class, 1);
                        return;
                    default:
                        boolean z4 = ServerChooseActivity.u;
                        serverChooseActivity.finish();
                        return;
                }
            }
        });
        final int i3 = 2;
        Z().d.setOnClickListener(new View.OnClickListener(this) { // from class: aq2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ServerChooseActivity f319b;

            {
                this.f319b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                ServerChooseActivity serverChooseActivity = this.f319b;
                switch (i22) {
                    case 0:
                        boolean z = ServerChooseActivity.u;
                        serverChooseActivity.Z().g.setFocusable(true);
                        serverChooseActivity.Z().g.setFocusableInTouchMode(true);
                        serverChooseActivity.Z().g.requestFocus();
                        m20.J0(view);
                        return;
                    case 1:
                        boolean z2 = ServerChooseActivity.u;
                        serverChooseActivity.Z().g.setFocusable(false);
                        serverChooseActivity.c0(false);
                        return;
                    case 2:
                        boolean z3 = ServerChooseActivity.u;
                        tf3.f0(serverChooseActivity, SpeedTestActivity.class, 1);
                        return;
                    default:
                        boolean z4 = ServerChooseActivity.u;
                        serverChooseActivity.finish();
                        return;
                }
            }
        });
        final int i4 = 3;
        Z().f2374b.setOnClickListener(new View.OnClickListener(this) { // from class: aq2

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ServerChooseActivity f319b;

            {
                this.f319b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i4;
                ServerChooseActivity serverChooseActivity = this.f319b;
                switch (i22) {
                    case 0:
                        boolean z = ServerChooseActivity.u;
                        serverChooseActivity.Z().g.setFocusable(true);
                        serverChooseActivity.Z().g.setFocusableInTouchMode(true);
                        serverChooseActivity.Z().g.requestFocus();
                        m20.J0(view);
                        return;
                    case 1:
                        boolean z2 = ServerChooseActivity.u;
                        serverChooseActivity.Z().g.setFocusable(false);
                        serverChooseActivity.c0(false);
                        return;
                    case 2:
                        boolean z3 = ServerChooseActivity.u;
                        tf3.f0(serverChooseActivity, SpeedTestActivity.class, 1);
                        return;
                    default:
                        boolean z4 = ServerChooseActivity.u;
                        serverChooseActivity.finish();
                        return;
                }
            }
        });
        Z().m.setOnFocusChangeListener(this);
        Z().m.setChangeFocus(false);
        this.o.d(this, this);
        Z().k.setOnApplyWindowInsetsListener(new ut0(this, 10));
        Z().g.setBackground(new zg2(1000047, tf3.F * 8));
        cp3.c = t9.L0(cp3.c);
        if (!u) {
            Z().m.onClick(Z().m.getChildAt(0));
            u = true;
        } else {
            bx i5 = hx2.i(128);
            String u2 = i5.u();
            i5.h();
            int l1 = og.l1(this.l, u2);
            if (l1 >= 0) {
                i = l1;
            }
            Z().m.onClick(Z().m.getChildAt(i * 2));
        }
        this.p.d(this, new uo1(this, i2));
        b0();
        zf3.T(this, vl0.c, new bq2(null), 2);
    }

    public final void b0() {
        Z().o.setTextColor(v73.j(1000013));
        Z().g.setTextColor(v73.z());
        Z().c.setTextColor(v73.y());
        Z().n.setTextColor(v73.z());
        Drawable drawable = cp3.c;
        if (drawable != null) {
            bn0.g(drawable, v73.j(1000054));
            getThemeListeners().a(new z73(10, 1000054, drawable));
        }
        pe0.Q(Z().j, ColorStateList.valueOf(v73.j(1000026)));
        if (v73.l()) {
            Z().f2374b.setImageResource(R.drawable.icon_nav_cancel_light);
        } else {
            Z().f2374b.setImageResource(R.drawable.icon_nav_cancel);
        }
    }

    public final void c0(boolean z) {
        if (z) {
            if (getSupportFragmentManager().B(R.id.flSearchServerContainer) == null) {
                p supportFragmentManager = getSupportFragmentManager();
                a k = hx2.k(supportFragmentManager, supportFragmentManager);
                int i = sq2.k;
                ey1 ey1Var = this.m;
                ey1 ey1Var2 = this.o;
                ey1 ey1Var3 = this.p;
                sq2 sq2Var = new sq2();
                sq2Var.d = ey1Var;
                sq2Var.e = ey1Var2;
                sq2Var.f = ey1Var3;
                k.e(R.id.flSearchServerContainer, sq2Var, null);
                k.h();
            }
            m20.w0(Z().d);
            m20.u0(Z().l);
            m20.Y0(Z().h);
            m20.Y0(Z().c);
            Z().g.setText("");
            return;
        }
        Z().g.setText("");
        Z().g.clearFocus();
        m20.u0(Z().c);
        m20.Y0(Z().l);
        m20.u0(Z().h);
        m20.Y0(Z().d);
        m20.v0(Z().g);
    }

    @Override // defpackage.zo
    /* renamed from: d0, reason: merged with bridge method [inline-methods] */
    public final h7 Z() {
        return (h7) this.t.getValue();
    }

    public final void e0(zp2 zp2Var) {
        if (TextUtils.equals("PUBG", zp2Var.c())) {
            du.d(642, null);
            m20.C0(this, 24);
        } else {
            du.d(643, null);
            r61 r61Var = new r61(this.c);
            r61Var.l(2);
            r61Var.show();
        }
    }

    @Override // defpackage.dn, defpackage.lt3, android.app.Activity
    public final void finish() {
        super.finish();
        m20.v0(getWindow().getDecorView());
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            setResult(-1);
            finish();
        }
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (Z().h.isShown()) {
            c0(false);
        } else {
            super.onBackPressed();
            m20.v0(getWindow().getDecorView());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.zo, defpackage.dn, defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        if (bundle != null) {
            String[] strArr = this.l;
            int length = strArr.length;
            int i = 0;
            int i2 = 0;
            while (i < length) {
                int i3 = i2 + 1;
                Fragment C = getSupportFragmentManager().C(strArr[i]);
                if (C != null) {
                    this.q[i2] = C;
                }
                i++;
                i2 = i3;
            }
        }
        super.onCreate(bundle);
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        cp3.c = null;
        cp3.d = null;
        cp3.e = null;
        cp3.f = null;
        cp3.g = null;
        cp3.h = null;
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onResume() {
        super.onResume();
        ew3.b0(new g53(this, 8));
    }

    @Override // defpackage.dn, defpackage.w73
    public final void p(boolean z) {
        super.p(z);
        b0();
        if (!z) {
            Z().m.getChildAt(0).setBackground(ew3.P0(this, R.drawable.bg_choose_server_tab_left));
            Z().m.getChildAt(2).setBackground(ew3.P0(this, R.drawable.bg_choose_server_tab_center));
            Z().m.getChildAt(4).setBackground(ew3.P0(this, R.drawable.bg_choose_server_tab_right));
            Z().m.setBackground(ew3.P0(this, R.drawable.bg_choose_server_tab_border));
        }
    }
}
