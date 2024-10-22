package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes.dex */
public class bb extends p {
    @SuppressLint({"SetJavaScriptEnabled"})
    public bb(WebView webView) {
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        a(webView);
    }
}
