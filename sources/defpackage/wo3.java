package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.security.xvpn.z35kb.WebViewActivity;

/* loaded from: classes2.dex */
public final class wo3 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ WebViewActivity f5049a;

    public wo3(WebViewActivity webViewActivity) {
        this.f5049a = webViewActivity;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        WebViewActivity webViewActivity = this.f5049a;
        webViewActivity.o.setVisibility(8);
        if (!str.isEmpty()) {
            webViewActivity.p.setVisibility(8);
        }
        WebView webView2 = webViewActivity.m;
        if (webView2 != null) {
            webView2.evaluateJavascript("try { document.body.style.marginBottom=\"" + (((int) (webViewActivity.m.getPaddingBottom() / bx3.z(webViewActivity.c))) + 18) + "px\";}catch (e) {}", null);
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.f5049a.o.setVisibility(0);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        try {
            Uri url = webResourceRequest.getUrl();
            String host = url.getHost();
            WebViewActivity webViewActivity = this.f5049a;
            if (host != null) {
                boolean equals = "www.facebook.com".equals(url.getHost());
                if (equals) {
                    try {
                        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("fb://facewebmodal/f?href=" + url.toString()));
                        data.addFlags(268435456);
                        webViewActivity.startActivity(data);
                        return true;
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (equals || "twitter.com".equals(url.getHost())) {
                    Intent data2 = new Intent("android.intent.action.VIEW").setData(url);
                    data2.addFlags(268435456);
                    webViewActivity.startActivity(data2);
                    return true;
                }
            }
            if ("mailto".equals(url.getScheme())) {
                Intent data3 = new Intent("android.intent.action.VIEW").setData(url);
                data3.addFlags(268435456);
                webViewActivity.startActivity(data3);
                return true;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return super.shouldOverrideUrlLoading(webView, webResourceRequest);
    }
}
