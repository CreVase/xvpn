package com.google.android.gms.internal.ads;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class zzchd extends zzche {
    public zzchd(zzcgb zzcgbVar, zzaxv zzaxvVar, boolean z, zzedz zzedzVar) {
        super(zzcgbVar, zzaxvVar, z, zzedzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcgi, android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return zzN(webView, str, null);
    }
}
