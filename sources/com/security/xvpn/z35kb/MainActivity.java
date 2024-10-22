package com.security.xvpn.z35kb;

import a.bx;
import a.du;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.p;
import com.google.android.gms.internal.consent_sdk.zzbq;
import com.google.android.gms.internal.consent_sdk.zzc;
import com.google.android.gms.internal.consent_sdk.zzct;
import com.google.android.gms.internal.consent_sdk.zzl;
import com.security.xvpn.z35kb.MainActivity;
import com.security.xvpn.z35kb.banner.HomeBannerManager;
import com.security.xvpn.z35kb.purchase.GoogleIABHelper;
import com.security.xvpn.z35kb.quickconn.QuickConnectService;
import com.security.xvpn.z35kb.television.HomeActivity;
import com.security.xvpn.z35kb.ui.components.ConnectingStatusView;
import com.security.xvpn.z35kb.view.a;
import com.security.xvpn.z35kb.widget.FullDragDrawerLayout;
import defpackage.bw3;
import defpackage.c32;
import defpackage.cz;
import defpackage.d9;
import defpackage.dn;
import defpackage.dp1;
import defpackage.ed2;
import defpackage.ew3;
import defpackage.fl;
import defpackage.hx2;
import defpackage.ji3;
import defpackage.ki3;
import defpackage.l83;
import defpackage.m20;
import defpackage.mn0;
import defpackage.n60;
import defpackage.o60;
import defpackage.p71;
import defpackage.pe0;
import defpackage.qo1;
import defpackage.qt3;
import defpackage.qw3;
import defpackage.r61;
import defpackage.r9;
import defpackage.ro1;
import defpackage.rt3;
import defpackage.sm1;
import defpackage.t9;
import defpackage.tj1;
import defpackage.uf;
import defpackage.uo;
import defpackage.uo1;
import defpackage.vj1;
import defpackage.vn;
import defpackage.vo1;
import defpackage.w01;
import defpackage.wo1;
import defpackage.xk2;
import defpackage.xo1;
import defpackage.yc2;
import defpackage.yk2;
import defpackage.zk2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class MainActivity extends dn implements qt3 {
    public static final /* synthetic */ int y = 0;
    public FullDragDrawerLayout k;
    public dp1 l;
    public ViewGroup m;
    public xk2 n;
    public r9 o;
    public final vo1 p;
    public int q;
    public r9 r;
    public boolean s;
    public ConnectingStatusView t;
    public final vo1 u;
    public final c32 v;
    public boolean w;
    public final c32 x;

    public MainActivity() {
        new Handler();
        this.p = new vo1(this, 0);
        this.q = 0;
        this.s = false;
        this.u = new vo1(this, 1);
        this.v = new c32();
        this.w = ew3.X();
        this.x = new c32();
    }

    @Override // defpackage.dn, defpackage.pt3
    public final void C(String str) {
        super.C(str);
        boolean z = a.o;
        if (!str.equals("")) {
            a.o = false;
            if (!isFinishing() && !str.contains("3np35e9gyq cancelled") && !str.contains("NoVpnConnectPermission") && !str.contains("permission denied") && z) {
                p71.x(a.p, 302);
            }
        }
    }

    @Override // defpackage.lt3
    public final String M() {
        boolean z;
        StringBuilder sb = new StringBuilder("MainPage_");
        sb.append(pe0.b());
        sb.append("_");
        FullDragDrawerLayout fullDragDrawerLayout = this.k;
        boolean z2 = false;
        if (fullDragDrawerLayout != null) {
            View d = fullDragDrawerLayout.d(8388611);
            if (d != null) {
                z = FullDragDrawerLayout.j(d);
            } else {
                z = false;
            }
            if (z) {
                z2 = true;
            }
        }
        sb.append(z2);
        return sb.toString();
    }

    @Override // defpackage.lt3
    public final void R() {
        HomeBannerManager homeBannerManager;
        setContentView(R.layout.activity_main_wrapper);
        int i = 0;
        if (XApplication.c) {
            Intent intent = new Intent(this, (Class<?>) HomeActivity.class);
            intent.addFlags(268435456);
            intent.addFlags(32768);
            intent.addFlags(67108864);
            startActivity(intent);
            overridePendingTransition(0, 0);
        }
        this.l = new dp1();
        p supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a k = hx2.k(supportFragmentManager, supportFragmentManager);
        k.e(R.id.main_container, this.l, null);
        k.e(R.id.drawer_container, new mn0(), null);
        k.h();
        this.m = (ViewGroup) findViewById(R.id.main_topbar);
        this.k = (FullDragDrawerLayout) findViewById(R.id.main_drawer_layout);
        findViewById(R.id.toLiveChat).setOnClickListener(new wo1(this, i));
        int i2 = 1;
        findViewById(R.id.to_premium_page).setOnClickListener(new wo1(this, i2));
        findViewById(R.id.button_more_wrap).setOnClickListener(new wo1(this, 2));
        this.t = (ConnectingStatusView) findViewById(R.id.layoutConnecting);
        FullDragDrawerLayout fullDragDrawerLayout = this.k;
        xo1 xo1Var = new xo1();
        if (fullDragDrawerLayout.s == null) {
            fullDragDrawerLayout.s = new ArrayList();
        }
        fullDragDrawerLayout.s.add(xo1Var);
        this.m.post(new qo1(this, 5));
        fl.n(this, (TextView) findViewById(R.id.tvToPremium), 1000013);
        fl.h(this, (AppCompatImageView) findViewById(R.id.ivMenuMore), 1000024);
        cz.v.d(this, new uo1(this, i));
        GoogleIABHelper googleIABHelper = GoogleIABHelper.g;
        googleIABHelper.getClass();
        ew3.b0(new vn(i, googleIABHelper));
        sm1.a(this).b(this.p, new IntentFilter("ExitAction"));
        sm1.a(this).b(this.u, new IntentFilter("RefreshUserInfoAction"));
        ew3.b0(new d9(6));
        vj1 lifecycle = getLifecycle();
        synchronized (HomeBannerManager.class) {
            if (HomeBannerManager.e == null) {
                HomeBannerManager homeBannerManager2 = new HomeBannerManager();
                HomeBannerManager.e = homeBannerManager2;
                ew3.f2013b = homeBannerManager2;
                rt3.e().a(HomeBannerManager.e);
                rt3.e().c(HomeBannerManager.e);
            }
            homeBannerManager = HomeBannerManager.e;
        }
        lifecycle.a(homeBannerManager);
        uf ufVar = uf.f4657a;
        uf.h = false;
        pe0.a("AppUpdateManager", "isUpdateChecked = " + uf.f4658b + "," + uf.g);
        if (!uf.f4658b) {
            qw3 qw3Var = new qw3(this, 23);
            if (uf.e == null && !uf.c(uf.g)) {
                uf.f = qw3Var;
            } else {
                ew3.b0(qw3Var);
                uf.f = null;
            }
        }
        bx i3 = hx2.i(79);
        boolean q = i3.q();
        i3.h();
        if (!q) {
            bx i4 = hx2.i(78);
            boolean q2 = i4.q();
            i4.h();
            if (q2) {
                p supportFragmentManager2 = getSupportFragmentManager();
                supportFragmentManager2.x(true);
                supportFragmentManager2.D();
                Fragment C = getSupportFragmentManager().C("googleUpdate");
                if (C == null || !C.isAdded()) {
                    r9 r9Var = this.r;
                    if (r9Var != null && r9Var.t()) {
                        r9 r9Var2 = this.r;
                        r9Var2.getClass();
                        try {
                            r9Var2.dismissAllowingStateLoss();
                        } catch (Exception unused) {
                        }
                    }
                    this.r = t9.u0(this, new ro1(this, i2));
                    bx bxVar = new bx();
                    bxVar.v(true);
                    du.d(80, bxVar);
                    bxVar.h();
                }
            }
        }
    }

    public final void Z() {
        Intent intent = getIntent();
        if (intent != null && "CMD_ACCOUNT_OR_BIND".equals(intent.getStringExtra("KEY_CMD_NAME"))) {
            intent.removeExtra("KEY_CMD_NAME");
            FullDragDrawerLayout fullDragDrawerLayout = this.k;
            if (fullDragDrawerLayout != null) {
                fullDragDrawerLayout.c(false);
            }
            if (ew3.X() && ew3.o()) {
                ed2 ed2Var = new ed2(this, R.layout.dialog_purchase_bind_already_bind);
                ed2Var.m = 2;
                ed2Var.show();
            } else {
                yc2.a();
                GoogleIABHelper googleIABHelper = GoogleIABHelper.g;
                googleIABHelper.e(this.c, tj1.ON_RESUME);
                googleIABHelper.c();
            }
        }
    }

    public final void a0() {
        boolean z;
        if (ew3.X()) {
            return;
        }
        AtomicBoolean atomicBoolean = l83.f3083a;
        final zzl zzlVar = l83.f;
        if (zzlVar != null && zzlVar.canRequestAds()) {
            z = true;
        } else {
            z = false;
        }
        Log.e(this.f3190a, "loadAndShowConsentFormIfRequired: canRequestAds: " + z);
        if (!l83.g) {
            return;
        }
        final n60 n60Var = new n60() { // from class: po1
            @Override // defpackage.n60
            public final void a(w01 w01Var) {
                int i = MainActivity.y;
                MainActivity mainActivity = MainActivity.this;
                mainActivity.getClass();
                boolean z2 = true;
                if (w01Var != null) {
                    String.format("%s: %s", Integer.valueOf(w01Var.f4922a), w01Var.f4923b);
                    return;
                }
                zzl zzlVar2 = zzlVar;
                if (zzlVar2 == null || !zzlVar2.canRequestAds()) {
                    z2 = false;
                }
                Log.e(mainActivity.f3190a, "loadAndShowConsentFormIfRequired: canRequestAds: " + z2);
            }
        };
        if (zzc.zza(this).zzb().canRequestAds()) {
            n60Var.a(null);
            return;
        }
        zzbq zzc = zzc.zza(this).zzc();
        zzct.zza();
        zzc.zzb(new ki3() { // from class: com.google.android.gms.internal.consent_sdk.zzbg
            @Override // defpackage.ki3
            public final void onConsentFormLoadSuccess(o60 o60Var) {
                o60Var.show(this, n60Var);
            }
        }, new ji3() { // from class: com.google.android.gms.internal.consent_sdk.zzbh
            @Override // defpackage.ji3
            public final void onConsentFormLoadFailure(w01 w01Var) {
                n60.this.a(w01Var);
            }
        });
    }

    public final void b0() {
        if (ew3.X()) {
            findViewById(R.id.to_premium_page).setVisibility(8);
            findViewById(R.id.toLiveChat).setVisibility(0);
        } else {
            String S0 = ew3.S0();
            if (!ew3.e(S0) && !"".equals(S0)) {
                ew3.T0("");
                dp1 dp1Var = this.l;
                if (dp1Var != null) {
                    dp1Var.E();
                }
            }
            findViewById(R.id.to_premium_page).setVisibility(0);
            findViewById(R.id.toLiveChat).setVisibility(8);
        }
        dp1 dp1Var2 = this.l;
        if (dp1Var2 != null) {
            dp1Var2.E();
        }
        du.d(280, null);
        if (!ew3.X() && ew3.m0()) {
            bx bxVar = new bx();
            bxVar.v(false);
            du.d(533, bxVar);
            bxVar.h();
            stopService(new Intent(this.c, (Class<?>) QuickConnectService.class));
        }
    }

    @Override // defpackage.dn, defpackage.pt3
    public final void c(int i) {
        super.c(i);
        if (i == 65282 && a.o) {
            a.o = false;
            p71.x(a.p, 301);
        }
        if (ew3.X()) {
            return;
        }
        this.t.c(i);
    }

    public final void c0() {
        b0();
        if (this.x.tryLock()) {
            ew3.b0(new qo1(this, 0));
        }
    }

    public void clickToPremiumGuide(View view) {
        r61 r61Var = new r61(this.c);
        r61Var.l(22);
        r61Var.show();
    }

    public void clickToPremiumPage(View view) {
        m20.C0(this.c, 1);
    }

    public final void d0() {
        if (rt3.e().f4214b == 65286 || rt3.e().f4214b == 65285) {
            ew3.S();
        }
        m20.R();
        ew3.L0("UiTapToggleConnect", pe0.b());
        if (ew3.q0() && !bw3.b(pe0.b(), "DisConnecting") && !bw3.b(pe0.b(), "DisConnected")) {
            du.d(298, null);
        }
        if (TextUtils.equals(pe0.b(), "Connected") || TextUtils.equals(pe0.b(), "Reconnecting")) {
            ew3.b0(new d9(7));
        }
        pe0.e();
    }

    @Override // defpackage.qt3
    public final void i(boolean z, boolean z2) {
        if (!XApplication.g) {
            if (z2) {
                this.w = true;
            } else if (this.w) {
                AtomicBoolean atomicBoolean = l83.f3083a;
                if (l83.g) {
                    a0();
                    this.w = false;
                }
            }
        }
        View findViewById = findViewById(R.id.to_premium_page);
        View findViewById2 = findViewById(R.id.toLiveChat);
        if (findViewById != null && findViewById2 != null) {
            if (ew3.X()) {
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
                return;
            }
            String S0 = ew3.S0();
            if (!ew3.e(S0) && !"".equals(S0)) {
                ew3.T0("");
                dp1 dp1Var = this.l;
                if (dp1Var != null) {
                    dp1Var.E();
                }
            }
            findViewById.setVisibility(0);
            findViewById2.setVisibility(8);
        }
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i == 61697) {
            if (i2 != -1) {
                bx i3 = hx2.i(144);
                String u = i3.u();
                i3.h();
                if (u.equals("ForceUpdate")) {
                    Iterator it = XApplication.e.iterator();
                    while (it.hasNext()) {
                        Activity activity = (Activity) it.next();
                        if (activity != this) {
                            activity.finish();
                        }
                    }
                    uf ufVar = uf.f4657a;
                    uf.f4658b = false;
                    ufVar.a();
                    finish();
                    return;
                }
                return;
            }
            return;
        }
        GoogleIABHelper.g.getClass();
        if (i == 1) {
            if (i2 == -1) {
                du.d(132, null);
                this.l.G();
                ew3.L0("UiTapReconnect", pe0.b());
                pe0.c();
            }
            this.k.c(false);
            return;
        }
        if (i == 2 && i2 == -1) {
            du.d(132, null);
            this.l.G();
            m20.R();
            ew3.L0("UiTapReconnect", pe0.b());
            pe0.c();
            this.k.c(false);
            return;
        }
        if ((i == 3 || i == 4 || i == 5) && i2 == -1) {
            du.d(132, null);
            this.l.G();
            m20.R();
            ew3.L0("UiTapReconnect", pe0.b());
            pe0.c();
            return;
        }
        if (i == 9 && i2 == -1) {
            m20.R();
            ew3.L0("UiTapReconnect", pe0.b());
            pe0.c();
        } else {
            dp1 dp1Var = this.l;
            if (dp1Var != null) {
                dp1Var.onActivityResult(i, i2, intent);
            } else {
                super.onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rt3.e().c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBackPressed() {
        /*
            r4 = this;
            com.security.xvpn.z35kb.widget.FullDragDrawerLayout r0 = r4.k
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L19
            r3 = 8388611(0x800003, float:1.1754948E-38)
            android.view.View r0 = r0.d(r3)
            if (r0 == 0) goto L14
            boolean r0 = com.security.xvpn.z35kb.widget.FullDragDrawerLayout.j(r0)
            goto L15
        L14:
            r0 = 0
        L15:
            if (r0 == 0) goto L19
            r0 = 1
            goto L1a
        L19:
            r0 = 0
        L1a:
            if (r0 == 0) goto L22
            com.security.xvpn.z35kb.widget.FullDragDrawerLayout r0 = r4.k
            r0.c(r2)
            goto L4a
        L22:
            androidx.fragment.app.p r0 = r4.getSupportFragmentManager()
            int r0 = r0.E()
            if (r0 <= 0) goto L34
            androidx.fragment.app.p r0 = r4.getSupportFragmentManager()
            r0.P()
            goto L4a
        L34:
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r2 = "ExitAction"
            r0.<init>(r2)
            java.lang.String r2 = "excludeMain"
            r0.putExtra(r2, r1)
            sm1 r2 = defpackage.sm1.a(r4)
            r2.c(r0)
            r4.moveTaskToBack(r1)
        L4a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.MainActivity.onBackPressed():void");
    }

    @Override // defpackage.dn, defpackage.lt3, androidx.fragment.app.l, androidx.activity.ComponentActivity, defpackage.r30, android.app.Activity
    public final void onCreate(Bundle bundle) {
        GoogleIABHelper.g.e(this, tj1.ON_CREATE);
        super.onCreate(bundle);
        if (bundle == null) {
            Z();
        }
        a0();
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        sm1.a(this).d(this.p);
        sm1.a(this).d(this.u);
        xk2 xk2Var = this.n;
        if (xk2Var != null) {
            xk2Var.c();
            this.n = null;
        }
        r9 r9Var = this.o;
        if (r9Var != null && r9Var.t()) {
            r9 r9Var2 = this.o;
            r9Var2.getClass();
            try {
                r9Var2.dismissAllowingStateLoss();
            } catch (Exception unused) {
            }
        }
        if (this.l != null) {
            this.l = null;
        }
        uo f = uo.f(this.c);
        f.getClass();
        uo.f4706b = null;
        uo.c = null;
        f.f4707a = null;
        super.onDestroy();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        rt3.e().l(this);
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        if (getSupportFragmentManager().E() > 0) {
            getSupportFragmentManager().P();
        }
        setIntent(intent);
        Z();
        if ("AccountExpired".equals(getIntent().getStringExtra("LoginFailed"))) {
            this.s = true;
            FullDragDrawerLayout fullDragDrawerLayout = this.k;
            int i = 0;
            if (fullDragDrawerLayout != null) {
                fullDragDrawerLayout.c(false);
            }
            getIntent().removeExtra("LoginFailed");
            t9.w0(getSupportFragmentManager(), new ro1(this, i));
        }
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onPause() {
        super.onPause();
        bx bxVar = new bx();
        bxVar.v(false);
        du.d(560, bxVar);
        bxVar.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:            if (android.net.VpnService.prepare(r5.c) != null) goto L27;     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() {
        /*
            r5 = this;
            super.onResume()
            defpackage.l83.a(r5)
            c32 r0 = r5.v
            boolean r0 = r0.tryLock()
            r1 = 1
            if (r0 == 0) goto L17
            qo1 r0 = new qo1
            r0.<init>(r5, r1)
            defpackage.ew3.b0(r0)
        L17:
            boolean r0 = defpackage.ew3.X()
            r2 = 2131231618(0x7f080382, float:1.8079322E38)
            if (r0 == 0) goto L2a
            android.view.View r0 = r5.findViewById(r2)
            r2 = 8
            r0.setVisibility(r2)
            goto L32
        L2a:
            android.view.View r0 = r5.findViewById(r2)
            r2 = 0
            r0.setVisibility(r2)
        L32:
            r5.b0()
            rt3 r0 = defpackage.rt3.e()
            boolean r2 = defpackage.ew3.o()
            boolean r3 = defpackage.ew3.X()
            r0.i(r2, r3)
            qo1 r0 = new qo1
            r2 = 4
            r0.<init>(r5, r2)
            defpackage.ew3.b0(r0)
            boolean r0 = r5.e
            if (r0 == 0) goto L52
            goto L99
        L52:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 24
            if (r0 < r2) goto L6e
            android.content.pm.PackageManager r0 = r5.getPackageManager()
            android.content.ComponentName r2 = new android.content.ComponentName
            android.content.Context r3 = r5.getBaseContext()
            java.lang.Class<com.security.xvpn.z35kb.quickconn.QuickConnTileService> r4 = com.security.xvpn.z35kb.quickconn.QuickConnTileService.class
            java.lang.String r4 = r4.getName()
            r2.<init>(r3, r4)
            r0.setComponentEnabledSetting(r2, r1, r1)
        L6e:
            lt3 r0 = r5.c     // Catch: java.lang.Throwable -> L77
            android.content.Intent r0 = android.net.VpnService.prepare(r0)     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L78
            goto L99
        L77:
        L78:
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.security.xvpn.z35kb.quickconn.QuickConnectService> r1 = com.security.xvpn.z35kb.quickconn.QuickConnectService.class
            r0.<init>(r5, r1)
            boolean r1 = defpackage.ew3.m0()
            if (r1 != 0) goto L94
            rt3 r1 = defpackage.rt3.e()
            int r1 = r1.f4214b
            r2 = 65286(0xff06, float:9.1485E-41)
            if (r1 != r2) goto L94
            r5.stopService(r0)
            goto L99
        L94:
            r5.startService(r0)     // Catch: java.lang.Exception -> L98
            goto L99
        L98:
        L99:
            uo r0 = defpackage.uo.f(r5)
            java.lang.Object r1 = r0.f4707a
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 != 0) goto Laa
            goto Lb8
        Laa:
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131755980(0x7f1003cc, float:1.9142855E38)
            java.lang.String r1 = r1.getString(r2)
            r0.i(r1)
        Lb8:
            r0 = 557(0x22d, float:7.8E-43)
            a.bx r0 = defpackage.hx2.i(r0)
            boolean r1 = r0.q()
            r0.h()
            if (r1 == 0) goto Le4
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "from"
            r2 = 7
            r0.putInt(r1, r2)
            lt3 r1 = r5.c
            android.content.Intent r2 = new android.content.Intent
            r2.<init>()
            java.lang.Class<com.security.xvpn.z35kb.purchase.PurchaseActivity> r3 = com.security.xvpn.z35kb.purchase.PurchaseActivity.class
            r2.setClass(r1, r3)
            r2.putExtras(r0)
            r1.startActivity(r2)
        Le4:
            r0 = 17
            r1 = 0
            a.du.d(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.MainActivity.onResume():void");
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStart() {
        xk2 zk2Var;
        super.onStart();
        du.d(249, null);
        if (!XApplication.f) {
            bx i = hx2.i(259);
            boolean q = i.q();
            i.h();
            if (q) {
                Log.i(this.f3190a, "onStart: try show rate us dialog ");
                try {
                    zk2Var = (xk2) yk2.class.newInstance();
                } catch (ClassNotFoundException unused) {
                    zk2Var = new zk2();
                }
                zk2Var.a(this);
                xk2 b2 = zk2Var.b("DisconnectEvaluationGood");
                this.n = b2;
                b2.show();
                bx bxVar = new bx();
                bxVar.z("DisconnectEvaluationGood");
                du.d(639, bxVar);
                bxVar.h();
                du.d(258, null);
                XApplication.f = true;
            }
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
