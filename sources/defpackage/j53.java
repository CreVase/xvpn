package defpackage;

import a.bx;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Html;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.CookieManager;
import android.webkit.WebSettings;
import android.webkit.WebStorage;
import android.webkit.WebView;
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
import com.security.xvpn.z35kb.browser.BrowserToolbar;
import com.security.xvpn.z35kb.browser.MainLayout;
import com.security.xvpn.z35kb.browser.PrivateBrowserActivity;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class j53 implements yo3, z91 {
    public Bitmap A;
    public final long B;
    public d5 C;

    /* renamed from: a, reason: collision with root package name */
    public final dn f2705a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f2706b;
    public BrowserToolbar c;
    public View d;
    public View e;
    public ImageView f;
    public ImageView g;
    public ViewGroup h;
    public FrameLayout i;
    public LinearLayout j;
    public TextView k;
    public TextView l;
    public WebView m;
    public MainLayout n;
    public AppBarLayout o;
    public PopupWindow s;
    public TextView t;
    public final int v;
    public final o82 w;
    public final String x;
    public boolean y;
    public final d5 z;
    public boolean p = false;
    public boolean q = false;
    public boolean r = false;
    public final Handler u = new Handler();

    public j53(dn dnVar, o82 o82Var) {
        f53 f53Var = new f53(this, 0);
        this.z = d5.d;
        this.f2705a = dnVar;
        this.v = (int) (bx3.z(dnVar) * 69);
        this.w = o82Var;
        this.B = SystemClock.elapsedRealtime();
        this.x = UUID.randomUUID().toString();
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(dnVar).inflate(R.layout.layout_browser_tab, (ViewGroup) null);
        this.h = viewGroup;
        this.c = (BrowserToolbar) viewGroup.findViewById(R.id.toolbar);
        this.m = (WebView) viewGroup.findViewById(R.id.webview);
        this.f = (ImageView) viewGroup.findViewById(R.id.btn_goback);
        this.g = (ImageView) viewGroup.findViewById(R.id.btn_goforward);
        this.d = viewGroup.findViewById(R.id.btn_clear);
        this.i = (FrameLayout) viewGroup.findViewById(R.id.webviewParent);
        this.n = (MainLayout) viewGroup.findViewById(R.id.main_layout);
        this.o = (AppBarLayout) viewGroup.findViewById(R.id.appbarlayout);
        this.e = viewGroup.findViewById(R.id.ll_bottom_panel);
        LinearLayout linearLayout = (LinearLayout) viewGroup.findViewById(R.id.ll_input_type_root);
        this.j = linearLayout;
        this.k = (TextView) linearLayout.getChildAt(0);
        int i = 1;
        this.l = (TextView) this.j.getChildAt(1);
        this.k.setOnClickListener(f53Var);
        this.l.setOnClickListener(f53Var);
        this.j.setOnClickListener(new f53(this, i));
        this.t = (TextView) viewGroup.findViewById(R.id.tvCount);
        dnVar.getLifecycle().a(this.n);
        this.f.setEnabled(false);
        this.g.setEnabled(false);
        WebSettings settings = this.m.getSettings();
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        int i2 = 2;
        settings.setMixedContentMode(2);
        this.m.setInitialScale(1);
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
        this.m.setWebChromeClient(new cr(dnVar, this));
        this.m.setWebViewClient(new gr(this));
        this.n.setCallback(new h53(this));
        this.c.setActionListener(new h53(this));
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.to_xvpn);
        this.f2706b = imageView;
        imageView.setOnClickListener(new f53(this, i2));
        this.g.setOnClickListener(new f53(this, 3));
        this.f.setOnClickListener(new f53(this, 4));
        this.d.setOnClickListener(new f53(this, 5));
        viewGroup.findViewById(R.id.vTabsCount).setOnClickListener(new f53(this, 6));
        viewGroup.findViewById(R.id.btn_toSetting).setOnClickListener(new f53(this, 7));
        this.o.a(new k82(this, 1));
        k90 k90Var = (k90) this.o.getLayoutParams();
        AppBarLayout.Behavior behavior = (AppBarLayout.Behavior) k90Var.f2909a;
        if (behavior == null) {
            behavior = new AppBarLayout.Behavior();
            k90Var.b(behavior);
        }
        behavior.o = new i53(this);
        ViewGroup viewGroup2 = this.h;
        viewGroup2.getViewTreeObserver().addOnGlobalLayoutListener(new zv3(viewGroup2, new h53(this)));
        this.m.loadUrl("about:blank");
        if (!TextUtils.equals(pe0.b(), "Connected")) {
            bx i3 = hx2.i(514);
            boolean q = i3.q();
            i3.h();
            if (q) {
                this.f2706b.post(new e53(this, i));
            }
        }
    }

    public static void j(TextView textView, int i, boolean z) {
        if (z) {
            textView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
        } else {
            textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
        }
    }

    @Override // defpackage.yo3
    public final void E() {
        if (this.C != null) {
            c();
        }
    }

    public final void a(boolean z) {
        this.c.c();
        this.m.clearFormData();
        this.m.clearHistory();
        this.m.clearMatches();
        this.m.clearCache(true);
        dn dnVar = this.f2705a;
        dnVar.getCacheDir().delete();
        Object obj = null;
        CookieManager.getInstance().removeAllCookies(null);
        CookieManager.getInstance().removeSessionCookies(null);
        CookieManager.getInstance().flush();
        WebStorage.getInstance().deleteAllData();
        WebViewDatabase webViewDatabase = WebViewDatabase.getInstance(dnVar);
        webViewDatabase.clearFormData();
        webViewDatabase.clearHttpAuthUsernamePassword();
        this.f.setEnabled(this.m.canGoBack());
        this.g.setEnabled(this.m.canGoForward());
        int i = 0;
        this.n.setVisibility(0);
        if (!this.f.isEnabled() && !this.g.isEnabled()) {
            if (!z) {
                this.y = false;
                Iterator it = br.d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (!(!((j53) ((z91) next)).y)) {
                        obj = next;
                        break;
                    }
                }
                if (obj == null) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime - br.i >= 2000) {
                        br.i = elapsedRealtime;
                        ViewGroup viewGroup = br.f;
                        if (viewGroup != null) {
                            Toast.makeText(viewGroup.getContext(), pd0.y(R.string.BrowsingHistoryErased), 0).show();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        this.u.postDelayed(new e53(this, i), 100L);
    }

    @Override // defpackage.yo3
    public final void b(Bitmap bitmap) {
        this.A = bitmap;
    }

    public final String c() {
        if (g()) {
            return pd0.y(R.string.NewTab);
        }
        String title = this.m.getTitle();
        if (TextUtils.isEmpty(title) || "about:blank".equals(title)) {
            return this.m.getUrl();
        }
        return title;
    }

    @Override // defpackage.yo3
    public final void d(int i) {
        boolean z;
        this.c.setWebProgress(i / 100.0f);
        BrowserToolbar browserToolbar = this.c;
        if (i != 100) {
            z = true;
        } else {
            z = false;
        }
        browserToolbar.setShowProgress(z);
    }

    @Override // defpackage.yo3
    public final void e() {
        this.o.e(true, true, true);
        this.c.setShowProgress(true);
    }

    @Override // defpackage.yo3
    public final void f() {
        ViewGroup viewGroup = this.h;
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeViewAt(viewGroup.getChildCount() - 1);
        this.w.f3616a.setRequestedOrientation(1);
        n(false);
        this.m.clearFocus();
    }

    public final boolean g() {
        if (!TextUtils.equals("about:blank", this.m.getUrl()) && !TextUtils.isEmpty(this.c.getUrl())) {
            return false;
        }
        return true;
    }

    @Override // defpackage.yo3
    public final void goFullScreen(View view) {
        view.setBackgroundColor(-16777216);
        this.h.addView(view, new ViewGroup.LayoutParams(-1, -1));
        this.w.f3616a.setRequestedOrientation(6);
        n(true);
    }

    public final void h() {
        this.m.stopLoading();
        this.m.clearHistory();
        this.m.clearCache(true);
        this.m.removeAllViews();
        this.m.clearView();
        this.m.freeMemory();
        this.m.pauseTimers();
        this.m.destroy();
        this.i.removeView(this.m);
        PopupWindow popupWindow = this.s;
        if (popupWindow != null) {
            popupWindow.dismiss();
            this.s = null;
        }
        this.A = null;
    }

    public final void i() {
        ew3.P0(this.f2705a, R.drawable.ic_browser_forward_normal).clearColorFilter();
        this.m.onResume();
        ya0.L();
        if (bw3.b("Connected", pe0.b())) {
            this.f2706b.setImageResource(R.drawable.icon_browser_vpn_connect);
        } else {
            this.f2706b.setImageResource(R.drawable.icon_browser_vpn_disconnect);
        }
    }

    public final Bitmap k(int i, boolean z) {
        mo1 mo1Var = null;
        if (this.i.getWidth() == 0 || this.i.getHeight() == 0) {
            return null;
        }
        float width = i / this.i.getWidth();
        Bitmap createBitmap = Bitmap.createBitmap(i, (int) (this.i.getHeight() * width), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.scale(width, width);
        this.i.draw(canvas);
        canvas.setBitmap(null);
        zj2 zj2Var = d5.e;
        if (zj2Var != null) {
            mo1Var = zj2Var;
        }
        String str = this.x;
        mo1Var.remove(str);
        if (z) {
            ExecutorService executorService = ta1.f4474a;
            ta1.b(this.f2705a, str, createBitmap, new g53(createBitmap, 0));
        }
        return createBitmap;
    }

    @Override // defpackage.yo3
    public final void l(String str) {
        boolean z;
        if (this.q) {
            a(false);
        }
        this.c.setUrl(this.m.getUrl());
        this.c.setShowProgress(false);
        ImageView imageView = this.f;
        if (!this.m.canGoBack() && g() && (TextUtils.equals(str, "about:blank") || TextUtils.isEmpty(str))) {
            z = false;
        } else {
            z = true;
        }
        imageView.setEnabled(z);
        this.g.setEnabled(this.m.canGoForward());
        if (!this.f.isEnabled()) {
            this.n.setVisibility(0);
            this.c.c();
        }
    }

    @Override // defpackage.yo3
    public final /* synthetic */ void m(String str) {
    }

    public final void n(boolean z) {
        int i;
        PrivateBrowserActivity privateBrowserActivity = this.w.f3616a;
        int systemUiVisibility = privateBrowserActivity.getWindow().getDecorView().getSystemUiVisibility();
        if (z) {
            i = systemUiVisibility | 2 | 4 | v.DEFAULT_BUFFER_SIZE;
        } else {
            i = systemUiVisibility & (-4103);
        }
        privateBrowserActivity.getWindow().getDecorView().setSystemUiVisibility(i);
    }

    public final void o(int i) {
        float f = this.f2705a.getResources().getDisplayMetrics().density;
        if (i == 0) {
            this.t.setText("");
        } else if (i > 99) {
            this.t.setText(Html.fromHtml("99<sup>+</sup>"));
            this.t.setTextSize(0, f * 8.0f);
        } else {
            this.t.setText(String.valueOf(i));
            this.t.setTextSize(0, f * 10.0f);
        }
    }

    @Override // defpackage.yo3
    public final void s(tb2 tb2Var) {
        boolean z;
        ImageView imageView = this.f;
        if (!tb2Var.f4480a && g()) {
            z = false;
        } else {
            z = true;
        }
        imageView.setEnabled(z);
        this.g.setEnabled(tb2Var.f4481b);
    }

    @Override // defpackage.yo3
    public final void t(String str) {
        boolean z;
        this.c.setUrl(str);
        ImageView imageView = this.f;
        if (!this.m.canGoBack() && g() && (TextUtils.equals(this.m.getUrl(), "about:blank") || TextUtils.isEmpty(this.m.getUrl()))) {
            z = false;
        } else {
            z = true;
        }
        imageView.setEnabled(z);
        this.g.setEnabled(this.m.canGoForward());
        if (!TextUtils.isEmpty(str) && !TextUtils.equals("about:blank", str)) {
            if (this.A == null) {
                try {
                    Uri parse = Uri.parse(str);
                    if (parse.getHost() != null) {
                        d5 d5Var = this.z;
                        dn dnVar = this.f2705a;
                        String host = parse.getHost();
                        d5Var.getClass();
                        this.A = d5.y(dnVar, host);
                        return;
                    }
                    return;
                } catch (Exception e) {
                    Log.e("Tab", "urlChanged: ", e);
                    return;
                }
            }
            return;
        }
        this.A = null;
    }

    @Override // defpackage.yo3
    public final /* synthetic */ void z() {
    }
}
