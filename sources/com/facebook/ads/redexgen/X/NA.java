package com.facebook.ads.redexgen.X;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: assets/audience_network.dex */
public class NA extends WebViewClient {
    public final /* synthetic */ NB A00;

    public NA(NB nb) {
        this.A00 = nb;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        NB.A02(C01997x.A2e);
        return true;
    }
}
