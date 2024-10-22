package com.chartboost.sdk.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class y2 extends ra {
    public y2(Context context, String str, l3 l3Var, f9 f9Var, s9 s9Var, String str2) {
        super(context);
        setFocusable(false);
        p4 a2 = p4.a();
        this.d = (RelativeLayout) a2.a(new RelativeLayout(context));
        this.f1114b = (i2) a2.a(new i2(context));
        u9.f1184a.a(context);
        this.f1114b.setWebViewClient((WebViewClient) a2.a(new k3(l3Var)));
        h2 h2Var = new h2(this.d, new j6(context, f9Var, s9Var), new va());
        this.c = h2Var;
        this.f1114b.setWebChromeClient(h2Var);
        try {
            WebView.setWebContentsDebuggingEnabled(false);
        } catch (RuntimeException e) {
            f6.e("CommonWebViewBase", "Exception while enabling webview debugging " + e);
        }
        if (str != null) {
            this.f1114b.loadDataWithBaseURL(str2, str, "text/html", "utf-8", null);
        } else {
            f9Var.c("Html is null");
        }
        if (this.f1114b.getSettings() != null) {
            this.f1114b.getSettings().setSupportZoom(false);
        }
        this.d.addView(this.f1114b);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        this.f1114b.setLayoutParams(layoutParams);
        this.f1114b.setBackgroundColor(0);
        this.d.setLayoutParams(layoutParams);
    }
}
