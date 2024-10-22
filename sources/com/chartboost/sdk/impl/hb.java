package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class hb extends p {
    public WebView f;
    public Long g = null;
    public final Map<String, x9> h;
    public final String i;

    /* loaded from: classes.dex */
    public class a extends WebViewClient {

        /* renamed from: a, reason: collision with root package name */
        public String f863a = "OMID NativeBridge WebViewClient";

        public a() {
        }

        @Override // android.webkit.WebViewClient
        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            renderProcessGoneDetail.toString();
            if (hb.this.h() != webView) {
                return super.onRenderProcessGone(webView, renderProcessGoneDetail);
            }
            hb.this.a((WebView) null);
            webView.destroy();
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final WebView f865a;

        public b() {
            this.f865a = hb.this.f;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f865a.destroy();
        }
    }

    public hb(Map<String, x9> map, String str) {
        this.h = map;
        this.i = str;
    }

    @Override // com.chartboost.sdk.impl.p
    public void b() {
        super.b();
        new Handler().postDelayed(new b(), Math.max(4000 - (this.g == null ? 4000L : TimeUnit.MILLISECONDS.convert(gc.b() - this.g.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f = null;
    }

    @Override // com.chartboost.sdk.impl.p
    public void j() {
        super.j();
        k();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void k() {
        WebView webView = new WebView(ic.b().a());
        this.f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f.getSettings().setAllowContentAccess(false);
        this.f.getSettings().setAllowFileAccess(false);
        this.f.setWebViewClient(new a());
        a(this.f);
        jc.a().c(this.f, this.i);
        for (String str : this.h.keySet()) {
            jc.a().a(this.f, this.h.get(str).a().toExternalForm(), str);
        }
        this.g = Long.valueOf(gc.b());
    }

    @Override // com.chartboost.sdk.impl.p
    public void a(xa xaVar, n nVar) {
        JSONObject jSONObject = new JSONObject();
        Map<String, x9> d = nVar.d();
        for (String str : d.keySet()) {
            tb.a(jSONObject, str, d.get(str).d());
        }
        a(xaVar, nVar, jSONObject);
    }
}
