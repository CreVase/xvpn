package defpackage;

import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes2.dex */
public final class gr extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final yo3 f2308a;

    public gr(yo3 yo3Var) {
        this.f2308a = yo3Var;
    }

    public final boolean a(WebView webView, Uri uri) {
        if (URLUtil.isValidUrl(uri.toString())) {
            return super.shouldOverrideUrlLoading(webView, uri.toString());
        }
        yo3 yo3Var = this.f2308a;
        if (yo3Var != null) {
            yo3Var.m(uri.toString());
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        super.doUpdateVisitedHistory(webView, str, z);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageCommitVisible(WebView webView, String str) {
        yo3 yo3Var = this.f2308a;
        if (yo3Var != null) {
            yo3Var.t(str);
            yo3Var.s(new tb2(webView.canGoBack(), webView.canGoForward()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        yo3 yo3Var = this.f2308a;
        if (yo3Var != null) {
            yo3Var.l(str);
            yo3Var.s(new tb2(webView.canGoBack(), webView.canGoForward()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        yo3 yo3Var = this.f2308a;
        if (yo3Var != null) {
            yo3Var.e();
        }
        if (yo3Var != null) {
            yo3Var.t(str);
            yo3Var.s(new tb2(webView.canGoBack(), webView.canGoForward()));
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return super.shouldInterceptRequest(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return a(webView, webResourceRequest.getUrl());
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, Uri.parse(str));
    }
}
