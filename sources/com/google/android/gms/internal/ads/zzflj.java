package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* loaded from: classes.dex */
final class zzflj extends WebViewClient {
    final String zza = "OMID NativeBridge WebViewClient";
    final /* synthetic */ zzfll zzb;

    public zzflj(zzfll zzfllVar) {
        this.zzb = zzfllVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        "WebView renderer gone: ".concat(String.valueOf(renderProcessGoneDetail.toString()));
        if (this.zzb.zza() == webView) {
            this.zzb.zzj(null);
            webView.destroy();
            return true;
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }
}
