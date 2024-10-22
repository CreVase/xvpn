package com.chartboost.sdk.impl;

import android.annotation.TargetApi;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Build;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public class k3 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final l3 f948a;

    public k3(l3 l3Var) {
        this.f948a = l3Var;
    }

    public final void a(String str) {
        l3 l3Var = this.f948a;
        if (l3Var != null) {
            l3Var.a(str);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        l3 l3Var = this.f948a;
        if (l3Var != null) {
            l3Var.c();
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        PackageInfo currentWebViewPackage;
        super.onPageStarted(webView, str, bitmap);
        if (Build.VERSION.SDK_INT >= 26) {
            currentWebViewPackage = WebView.getCurrentWebViewPackage();
            if (currentWebViewPackage != null) {
                f6.a("CustomWebViewClient", "WebView version: " + currentWebViewPackage.versionName);
            } else {
                a("Device was not set up correctly.");
            }
        }
        this.f948a.b();
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        a("Error loading " + str2 + ": " + str);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        String reasonPhrase;
        StringBuilder sb = new StringBuilder("Error loading ");
        sb.append(webResourceRequest.getUrl().toString());
        sb.append(": ");
        if (webResourceResponse == null) {
            reasonPhrase = "unknown error";
        } else {
            reasonPhrase = webResourceResponse.getReasonPhrase();
        }
        sb.append(reasonPhrase);
        f6.a("CustomWebViewClient", sb.toString());
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        y3.d(new w3("show_webview_ssl_error", sslError.toString(), "", ""));
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        boolean didCrash;
        String str;
        didCrash = renderProcessGoneDetail.didCrash();
        if (didCrash) {
            str = "Webview crashed: " + renderProcessGoneDetail.toString();
        } else {
            str = "Webview killed, likely due to low memory";
        }
        a(str);
        return true;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return false;
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        CharSequence description;
        if (webResourceRequest.isForMainFrame()) {
            StringBuilder sb = new StringBuilder("Error loading ");
            sb.append(webResourceRequest.getUrl().toString());
            sb.append(": ");
            description = webResourceError.getDescription();
            sb.append((Object) description);
            a(sb.toString());
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return false;
    }
}
