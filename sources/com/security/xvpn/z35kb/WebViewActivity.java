package com.security.xvpn.z35kb;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.security.xvpn.z35kb.widget.RectProgressBar;
import com.security.xvpn.z35kb.widget.Toolbar;
import defpackage.bp1;
import defpackage.dn;
import defpackage.fl;
import defpackage.m20;
import defpackage.t9;
import defpackage.vo3;
import defpackage.wo3;
import defpackage.xo3;

/* loaded from: classes2.dex */
public class WebViewActivity extends dn {
    public static final /* synthetic */ int q = 0;
    public String k;
    public String l;
    public WebView m;
    public Toolbar n;
    public RectProgressBar o;
    public View p;

    @Override // defpackage.lt3
    public final String M() {
        return this.l;
    }

    @Override // defpackage.lt3
    public final void R() {
        try {
            setContentView(R.layout.activity_web_view);
            this.k = getIntent().getStringExtra("intentTargetUrl");
            this.l = getIntent().getStringExtra("intentTitle");
            getIntent().getBooleanExtra("intentDisableWebTitle", false);
            Z();
        } catch (Throwable unused) {
            t9.u0(this, new bp1(this, 2));
        }
    }

    public final void Z() {
        this.m = (WebView) findViewById(R.id.webview);
        this.n = (Toolbar) findViewById(R.id.toolbar);
        this.o = (RectProgressBar) findViewById(R.id.progressBar);
        this.p = findViewById(R.id.loadingMask);
        this.n.setTitle(this.l);
        this.n.setShowBackBtn(true);
        if (XApplication.c) {
            m20.u0(this.n);
        }
        fl.g(this, this.p, 1000003);
        WebSettings settings = this.m.getSettings();
        settings.setSupportZoom(true);
        settings.setDisplayZoomControls(false);
        settings.setBuiltInZoomControls(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
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
        this.m.setWebChromeClient(new WebChromeClient());
        this.m.setWebViewClient(new wo3(this));
        this.m.setOnLongClickListener(new vo3());
        this.m.setWebChromeClient(new xo3(this));
        this.m.loadUrl(this.k);
    }

    @Override // defpackage.dn, defpackage.lt3, defpackage.ic, androidx.fragment.app.l, android.app.Activity
    public final void onDestroy() {
        WebView webView = this.m;
        if (webView != null) {
            webView.loadUrl("about:blank");
            this.m.stopLoading();
            this.m.pauseTimers();
            this.m.clearHistory();
            this.m.clearCache(true);
            this.m.clearView();
            this.m.freeMemory();
            this.m.destroy();
            this.m = null;
        }
        super.onDestroy();
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onPause() {
        super.onPause();
        WebView webView = this.m;
        if (webView != null) {
            webView.onPause();
        }
    }

    @Override // defpackage.lt3, androidx.fragment.app.l, android.app.Activity
    public final void onResume() {
        super.onResume();
        WebView webView = this.m;
        if (webView != null) {
            webView.onResume();
            this.m.resumeTimers();
        }
    }
}
