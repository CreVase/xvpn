package defpackage;

import android.webkit.WebView;

/* loaded from: classes2.dex */
public final class pu3 extends v7 {
    public pu3(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        this.f4787a = new ru3(webView);
    }
}
