package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes.dex */
public final class zzfli extends zzflh {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzfli(WebView webView) {
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzj(webView);
    }
}
