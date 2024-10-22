package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.ads.AdError;

/* renamed from: com.facebook.ads.redexgen.X.1o, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C00481o extends WebViewClient {
    public boolean A00 = false;
    public final C1Z A01;
    public final InterfaceC00471n A02;
    public final boolean A03;

    public C00481o(C1Z c1z, InterfaceC00471n interfaceC00471n, boolean z) {
        this.A01 = c1z;
        this.A02 = interfaceC00471n;
        this.A03 = z;
    }

    private void A00() {
        if (this.A03) {
            this.A02.ACM(AdError.CACHE_ERROR);
        } else {
            A01();
        }
    }

    private void A01() {
        InterfaceC00471n interfaceC00471n = this.A02;
        if (interfaceC00471n != null) {
            interfaceC00471n.ACN();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        A00();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        this.A00 = true;
        A01();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        new Handler().postDelayed(new C0910aE(this), this.A01.A08());
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        this.A00 = true;
        A02();
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        NB.A02(C01997x.A2d);
        A00();
        return true;
    }
}
