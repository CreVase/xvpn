package com.security.xvpn.z35kb.browser;

import a.bx;
import a.du;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebViewDatabase;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.appbar.AppBarLayout;
import com.google.protobuf.v;
import com.security.xvpn.z35kb.R;
import com.security.xvpn.z35kb.XApplication;
import com.security.xvpn.z35kb.widget.NavigationBarContentConstraintLayout;
import defpackage.bp1;
import defpackage.bw3;
import defpackage.bx3;
import defpackage.cr;
import defpackage.dn;
import defpackage.ew3;
import defpackage.gr;
import defpackage.h82;
import defpackage.hx2;
import defpackage.i82;
import defpackage.io0;
import defpackage.j82;
import defpackage.k82;
import defpackage.k90;
import defpackage.l82;
import defpackage.m82;
import defpackage.o4;
import defpackage.pd0;
import defpackage.pe0;
import defpackage.sm1;
import defpackage.t9;
import defpackage.tb2;
import defpackage.tv0;
import defpackage.ya0;
import defpackage.yo3;
import defpackage.zv3;
import java.util.Stack;

/* loaded from: classes2.dex */
public class PrivateBrowser extends dn implements yo3 {
    public static final /* synthetic */ int L = 0;
    public int A;
    public final h82 I;
    public final m82 J;
    public PopupWindow k;
    public ImageView l;
    public ImageView m;
    public BrowserToolbar n;
    public View o;
    public View p;
    public View q;
    public View r;
    public NavigationBarContentConstraintLayout s;
    public FrameLayout t;
    public LinearLayout u;
    public TextView v;
    public TextView w;
    public NestedScrollWebView x;
    public MainLayout y;
    public AppBarLayout z;
    public boolean B = false;
    public boolean C = false;
    public boolean D = false;
    public Bitmap E = null;
    public final Handler F = new Handler();
    public boolean G = false;
    public boolean H = false;
    public final m82 K = new m82(this, 1);

    public PrivateBrowser() {
        int i = 0;
        this.I = new h82(this, i);
        this.J = new m82(this, i);
    }

    @Override // defpackage.yo3
    public final /* synthetic */ void E() {
    }

    @Override // defpackage.lt3
    public final String M() {
        return "PrivateBrowserPage";
    }

    @Override // defpackage.lt3
    public final boolean O() {
        return false;
    }

    @Override // defpackage.lt3
    public final boolean P() {
        return false;
    }

    @Override // defpackage.lt3
    public final void R() {
        String str;
        getWindow().setStatusBarColor(-10921639);
        try {
            setContentView(R.layout.browser_activity);
            b0();
            Intent intent = getIntent();
            if (intent != null) {
                str = intent.getDataString();
            } else {
                str = null;
            }
            BrowserToolbar browserToolbar = this.n;
            if (browserToolbar != null) {
                browserToolbar.b(3, str);
            }
            bx i = hx2.i(511);
            String u = i.u();
            i.h();
            ya0.f5299a = ya0.V(u);
            ya0.L();
            bx bxVar = new bx();
            du.d(512, bxVar);
            bxVar.t();
            bxVar.h();
            this.A = bx3.t(this.c, 69);
            sm1.a(this).b(this.J, new IntentFilter("ExitAction"));
            sm1.a(this).b(this.K, new IntentFilter("ClearHistory"));
            if (!ew3.X()) {
                du.d(628, null);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            this.G = true;
            t9.u0(this, new bp1(this, 4));
        }
    }

    @Override // defpackage.lt3
    public final boolean S() {
        return false;
    }

    public final void Z(boolean z) {
        this.D = true;
        this.q.setEnabled(false);
        this.x.stopLoading();
        this.x.loadUrl("about:blank");
        if (z) {
            NavigationBarContentConstraintLayout navigationBarContentConstraintLayout = this.s;
            Bitmap createBitmap = Bitmap.createBitmap((int) (navigationBarContentConstraintLayout.getWidth() * 0.25f), (int) (navigationBarContentConstraintLayout.getHeight() * 0.25f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.scale(0.25f, 0.25f);
            navigationBarContentConstraintLayout.draw(canvas);
            this.E = createBitmap;
            this.m.setImageBitmap(createBitmap);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.setInterpolator(new tv0());
            ofFloat.addUpdateListener(new io0(this, 3));
            ofFloat.addListener(new o4(this, 9));
            ofFloat.start();
        } else {
            this.q.setEnabled(true);
        }
        a0(z);
    }

    public final void a0(boolean z) {
        this.n.c();
        this.x.clearFormData();
        this.x.clearHistory();
        this.x.clearMatches();
        this.x.clearCache(true);
        getCacheDir().delete();
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().removeSessionCookies(null);
        CookieManager.getInstance().flush();
        WebStorage.getInstance().deleteAllData();
        WebViewDatabase webViewDatabase = WebViewDatabase.getInstance(this.c);
        webViewDatabase.clearFormData();
        webViewDatabase.clearHttpAuthUsernamePassword();
        this.o.setEnabled(this.x.canGoBack());
        this.p.setEnabled(this.x.canGoForward());
        int i = 0;
        this.y.setVisibility(0);
        if (!this.o.isEnabled() && !this.p.isEnabled()) {
            if (!z) {
                Toast.makeText(this.c, pd0.y(R.string.BrowsingHistoryErased), 0).show();
                return;
            }
            return;
        }
        this.F.postDelayed(new i82(this, i), 100L);
    }

    @Override // defpackage.yo3
    public final /* synthetic */ void b(Bitmap bitmap) {
    }

    public final void b0() {
        this.s = (NavigationBarContentConstraintLayout) findViewById(R.id.root_view);
        this.n = (BrowserToolbar) findViewById(R.id.toolbar);
        this.x = (NestedScrollWebView) findViewById(R.id.webview);
        this.o = findViewById(R.id.btn_goback);
        this.p = findViewById(R.id.btn_goforward);
        this.q = findViewById(R.id.btn_clear);
        this.t = (FrameLayout) findViewById(R.id.webviewParent);
        this.y = (MainLayout) findViewById(R.id.main_layout);
        this.z = (AppBarLayout) findViewById(R.id.appbarlayout);
        this.m = (ImageView) findViewById(R.id.iv_clear_shotscreen);
        this.r = findViewById(R.id.ll_bottom_panel);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ll_input_type_root);
        this.u = linearLayout;
        this.v = (TextView) linearLayout.getChildAt(0);
        int i = 1;
        this.w = (TextView) this.u.getChildAt(1);
        TextView textView = this.v;
        h82 h82Var = this.I;
        textView.setOnClickListener(h82Var);
        this.w.setOnClickListener(h82Var);
        this.u.setOnClickListener(new h82(this, i));
        getLifecycle().a(this.y);
        this.o.setEnabled(false);
        this.p.setEnabled(false);
        WebSettings settings = this.x.getSettings();
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        this.x.setInitialScale(1);
        try {
            settings.setJavaScriptEnabled(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            settings.setJavaScriptCanOpenWindowsAutomatically(true);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setDomStorageEnabled(true);
        this.x.setWebChromeClient(new cr(this, this));
        this.x.setWebViewClient(new gr(this));
        this.n.setActionListener(new j82(this));
        ImageView imageView = (ImageView) findViewById(R.id.to_xvpn);
        this.l = imageView;
        imageView.setOnClickListener(new h82(this, 2));
        this.p.setOnClickListener(new h82(this, 3));
        this.o.setOnClickListener(new h82(this, 4));
        this.q.setOnClickListener(new h82(this, 5));
        findViewById(R.id.btn_toSetting).setOnClickListener(new h82(this, 6));
        this.z.a(new k82(this, 0));
        k90 k90Var = (k90) this.z.getLayoutParams();
        AppBarLayout.Behavior behavior = (AppBarLayout.Behavior) k90Var.f2909a;
        if (behavior == null) {
            behavior = new AppBarLayout.Behavior();
            k90Var.b(behavior);
        }
        behavior.o = new l82(this);
        NavigationBarContentConstraintLayout navigationBarContentConstraintLayout = this.s;
        navigationBarContentConstraintLayout.getViewTreeObserver().addOnGlobalLayoutListener(new zv3(navigationBarContentConstraintLayout, new j82(this)));
        this.x.loadUrl("about:blank");
        if (!TextUtils.equals(pe0.b(), "Connected")) {
            bx i2 = hx2.i(514);
            boolean q = i2.q();
            i2.h();
            if (q) {
                this.l.post(new i82(this, i));
            }
        }
    }

    public final boolean c0() {
        if (!TextUtils.equals("about:blank", this.x.getUrl()) && !TextUtils.isEmpty(this.n.getUrl())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.yo3
    public final void d(int i) {
        boolean z;
        this.n.setWebProgress(i / 100.0f);
        BrowserToolbar browserToolbar = this.n;
        if (i != 100) {
            z = true;
        } else {
            z = false;
        }
        browserToolbar.setShowProgress(z);
    }

    public final void d0() {
        getWindow().getDecorView().setSystemUiVisibility(((getWindow().getDecorView().getSystemUiVisibility() ^ 2) ^ 4) ^ v.DEFAULT_BUFFER_SIZE);
    }

    @Override // defpackage.yo3
    public final void e() {
        this.z.e(true, true, true);
        this.n.setShowProgress(true);
    }

    @Override // defpackage.yo3
    public final void f() {
        NavigationBarContentConstraintLayout navigationBarContentConstraintLayout = this.s;
        if (navigationBarContentConstraintLayout == null) {
            return;
        }
        navigationBarContentConstraintLayout.removeViewAt(navigationBarContentConstraintLayout.getChildCount() - 1);
        setRequestedOrientation(1);
        d0();
    }

    @Override // defpackage.yo3
    public void goFullScreen(View view) {
        view.setBackgroundColor(-16777216);
        this.s.addView(view, new ViewGroup.LayoutParams(-1, -1));
        setRequestedOrientation(6);
        d0();
    }

    @Override // defpackage.yo3
    public final void l(String str) {
        boolean z;
        if (this.D) {
            a0(false);
        }
        this.n.setUrl(this.x.getUrl());
        this.n.setShowProgress(false);
        View view = this.o;
        if (!this.x.canGoBack() && c0() && (TextUtils.equals(str, "about:blank") || TextUtils.isEmpty(str))) {
            z = false;
        } else {
            z = true;
        }
        view.setEnabled(z);
        this.p.setEnabled(this.x.canGoForward());
        if (!this.o.isEnabled()) {
            this.y.setVisibility(0);
            this.n.c();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x013f A[Catch: all -> 0x015e, TryCatch #1 {, blocks: (B:46:0x0112, B:48:0x0118, B:49:0x0126, B:53:0x0128, B:56:0x012e, B:62:0x013f, B:63:0x014b, B:65:0x014f, B:67:0x0155, B:70:0x0157, B:71:0x015c, B:74:0x0144), top: B:45:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0144 A[Catch: all -> 0x015e, TryCatch #1 {, blocks: (B:46:0x0112, B:48:0x0118, B:49:0x0126, B:53:0x0128, B:56:0x012e, B:62:0x013f, B:63:0x014b, B:65:0x014f, B:67:0x0155, B:70:0x0157, B:71:0x015c, B:74:0x0144), top: B:45:0x0112 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0169 A[ORIG_RETURN, RETURN] */
    @Override // defpackage.yo3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.security.xvpn.z35kb.browser.PrivateBrowser.m(java.lang.String):void");
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        boolean z;
        BrowserToolbar browserToolbar = this.n;
        if (browserToolbar.G) {
            browserToolbar.D.callOnClick();
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return;
        }
        NestedScrollWebView nestedScrollWebView = this.x;
        if (nestedScrollWebView != null && nestedScrollWebView.canGoBack()) {
            this.o.callOnClick();
        } else if (c0()) {
            this.l.callOnClick();
        } else {
            this.o.callOnClick();
        }
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (this.G) {
            return;
        }
        this.x.stopLoading();
        this.x.clearHistory();
        this.x.clearCache(true);
        this.x.clearView();
        this.x.freeMemory();
        this.x.pauseTimers();
        this.x.destroy();
        this.t.removeView(this.x);
        sm1.a(this).d(this.J);
        sm1.a(this).d(this.K);
        PopupWindow popupWindow = this.k;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.k = null;
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        NestedScrollWebView nestedScrollWebView = this.x;
        if (nestedScrollWebView != null) {
            nestedScrollWebView.freeMemory();
            this.x.clearCache(false);
        }
    }

    @Override // defpackage.lt3, androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        String str;
        super.onNewIntent(intent);
        if (intent != null) {
            str = intent.getDataString();
        } else {
            str = null;
        }
        BrowserToolbar browserToolbar = this.n;
        if (browserToolbar != null) {
            browserToolbar.b(3, str);
        }
        if (!ew3.X()) {
            du.d(628, null);
        }
        Stack stack = XApplication.e;
        if (!stack.contains(this)) {
            stack.add(this);
        }
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onPause() {
        super.onPause();
        if (this.G) {
            return;
        }
        this.x.onPause();
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (this.G) {
            return;
        }
        this.x.onResume();
        ya0.L();
        if (bw3.b("Connected", pe0.b())) {
            this.l.setImageResource(R.drawable.icon_browser_vpn_connect);
        } else {
            this.l.setImageResource(R.drawable.icon_browser_vpn_disconnect);
        }
        this.C = false;
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStart() {
        super.onStart();
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onStop() {
        super.onStop();
        if (this.C) {
            if (ya0.e0()) {
                Z(false);
            }
        } else if (!((XApplication) this.c.getApplication()).c() && ya0.e0()) {
            Z(false);
        }
    }

    @Override // defpackage.yo3
    public final void s(tb2 tb2Var) {
        boolean z;
        View view = this.o;
        if (!tb2Var.f4480a && c0()) {
            z = false;
        } else {
            z = true;
        }
        view.setEnabled(z);
        this.p.setEnabled(tb2Var.f4481b);
    }

    @Override // defpackage.yo3
    public final void t(String str) {
        this.n.setUrl(str);
    }

    @Override // defpackage.yo3
    public final /* synthetic */ void z() {
    }
}
