package com.vungle.ads.internal.ui.view;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import defpackage.tg1;

/* loaded from: classes2.dex */
public interface WebViewAPI {

    /* loaded from: classes2.dex */
    public interface MraidDelegate {
        boolean processCommand(String str, tg1 tg1Var);
    }

    /* loaded from: classes2.dex */
    public interface WebClientErrorHandler {
        void onReceivedError(String str, boolean z);

        void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess);

        boolean onWebRenderingProcessGone(WebView webView, Boolean bool);
    }

    void notifyPropertiesChange(boolean z);

    void setAdVisibility(boolean z);

    void setConsentStatus(boolean z, String str, String str2, String str3, String str4);

    void setErrorHandler(WebClientErrorHandler webClientErrorHandler);

    void setMraidDelegate(MraidDelegate mraidDelegate);

    void setWebViewObserver(WebViewObserver webViewObserver);
}
