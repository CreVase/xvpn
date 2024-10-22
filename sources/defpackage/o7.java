package defpackage;

import adSupport.AdInterstitialActivity;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
public final class o7 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdInterstitialActivity f3612a;

    public o7(AdInterstitialActivity adInterstitialActivity) {
        this.f3612a = adInterstitialActivity;
    }

    public final void a(Uri uri) {
        boolean endsWith = uri.toString().endsWith("/8kcasbmm7k");
        AdInterstitialActivity adInterstitialActivity = this.f3612a;
        if (endsWith) {
            if (adInterstitialActivity.e.startsWith("pkg:")) {
                String substring = adInterstitialActivity.e.substring(4);
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.addCategory("android.intent.category.APP_MARKET");
                    intent.setData(Uri.parse("market://details?id=" + substring));
                    adInterstitialActivity.f.startActivity(intent);
                } catch (Exception unused) {
                    adInterstitialActivity.f.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + substring)));
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(adInterstitialActivity.e));
                intent2.addFlags(268435456);
                adInterstitialActivity.f.startActivity(intent2);
            }
            adInterstitialActivity.g = true;
            int i = AdInterstitialActivity.h;
            return;
        }
        if (uri.toString().endsWith("/aa829sheea")) {
            if (adInterstitialActivity.e.startsWith("intent:#Intent;")) {
                try {
                    adInterstitialActivity.startActivity(Intent.parseUri(adInterstitialActivity.e, 1));
                    return;
                } catch (Exception unused2) {
                    return;
                }
            } else {
                int i2 = AdInterstitialActivity.h;
                return;
            }
        }
        if (uri.toString().endsWith("/vb32auz9qf")) {
            adInterstitialActivity.finish();
            int i3 = AdInterstitialActivity.h;
        }
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        a(webResourceRequest.getUrl());
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(Uri.parse(str));
        return true;
    }
}
