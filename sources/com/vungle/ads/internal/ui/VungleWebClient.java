package com.vungle.ads.internal.ui;

import android.annotation.TargetApi;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.davemorrissey.labs.subscaleview.BuildConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.WebViewObserver;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import defpackage.hx2;
import defpackage.i23;
import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;
import defpackage.rw1;
import defpackage.t9;
import defpackage.tg1;
import defpackage.to1;
import defpackage.zf3;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class VungleWebClient extends WebViewClient implements WebViewAPI {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "VungleWebClient";
    private final AdPayload advertisement;
    private boolean collectConsent;
    private WebViewAPI.WebClientErrorHandler errorHandler;
    private String gdprAccept;
    private String gdprBody;
    private String gdprDeny;
    private String gdprTitle;
    private Boolean isViewable;
    private WebView loadedWebView;
    private WebViewAPI.MraidDelegate mraidDelegate;
    private final ExecutorService offloadExecutor;
    private final Placement placement;
    private boolean ready;
    private WebViewObserver webViewObserver;

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class VungleWebViewRenderProcessClient extends WebViewRenderProcessClient {
        private WebViewAPI.WebClientErrorHandler errorHandler;

        public VungleWebViewRenderProcessClient(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }

        public final WebViewAPI.WebClientErrorHandler getErrorHandler() {
            return this.errorHandler;
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        @Override // android.webkit.WebViewRenderProcessClient
        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            webView.getTitle();
            webView.getOriginalUrl();
            WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
            if (webClientErrorHandler != null) {
                webClientErrorHandler.onRenderProcessUnresponsive(webView, webViewRenderProcess);
            }
        }

        public final void setErrorHandler(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
            this.errorHandler = webClientErrorHandler;
        }
    }

    public VungleWebClient(AdPayload adPayload, Placement placement, ExecutorService executorService) {
        this.advertisement = adPayload;
        this.placement = placement;
        this.offloadExecutor = executorService;
    }

    public static /* synthetic */ void getCollectConsent$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getErrorHandler$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprAccept$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprBody$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprDeny$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getGdprTitle$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getLoadedWebView$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getReady$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getWebViewObserver$vungle_ads_release$annotations() {
    }

    private final void handleWebViewError(String str, String str2, boolean z) {
        String m = p71.m(str2, " ", str);
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            webClientErrorHandler.onReceivedError(m, z);
        }
    }

    private final boolean isCriticalAsset(String str) {
        boolean z;
        if (str.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return false;
        }
        return this.advertisement.getDownloadableUrls().containsValue(str);
    }

    public static /* synthetic */ void isViewable$vungle_ads_release$annotations() {
    }

    public final void runJavascriptOnWebView(WebView webView, String str) {
        if (webView != null) {
            try {
                webView.evaluateJavascript(str, null);
            } catch (Exception e) {
                AnalyticsClient.INSTANCE.logError$vungle_ads_release(313, hx2.p("Evaluate js failed ", e.getLocalizedMessage()), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
            }
        }
    }

    /* renamed from: shouldOverrideUrlLoading$lambda-4$lambda-3$lambda-2 */
    public static final void m90shouldOverrideUrlLoading$lambda4$lambda3$lambda2(WebViewAPI.MraidDelegate mraidDelegate, String str, tg1 tg1Var, Handler handler, VungleWebClient vungleWebClient, WebView webView) {
        if (mraidDelegate.processCommand(str, tg1Var)) {
            handler.post(new to1(20, vungleWebClient, webView));
        }
    }

    public final boolean getCollectConsent$vungle_ads_release() {
        return this.collectConsent;
    }

    public final WebViewAPI.WebClientErrorHandler getErrorHandler$vungle_ads_release() {
        return this.errorHandler;
    }

    public final String getGdprAccept$vungle_ads_release() {
        return this.gdprAccept;
    }

    public final String getGdprBody$vungle_ads_release() {
        return this.gdprBody;
    }

    public final String getGdprDeny$vungle_ads_release() {
        return this.gdprDeny;
    }

    public final String getGdprTitle$vungle_ads_release() {
        return this.gdprTitle;
    }

    public final WebView getLoadedWebView$vungle_ads_release() {
        return this.loadedWebView;
    }

    public final WebViewAPI.MraidDelegate getMraidDelegate$vungle_ads_release() {
        return this.mraidDelegate;
    }

    public final boolean getReady$vungle_ads_release() {
        return this.ready;
    }

    public final WebViewObserver getWebViewObserver$vungle_ads_release() {
        return this.webViewObserver;
    }

    public final Boolean isViewable$vungle_ads_release() {
        return this.isViewable;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void notifyPropertiesChange(boolean z) {
        WebView webView = this.loadedWebView;
        if (webView != null) {
            rw1 rw1Var = new rw1();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            tg1 tg1Var = new tg1(linkedHashMap);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            tg1 tg1Var2 = new tg1(linkedHashMap2);
            rw1 rw1Var2 = new rw1();
            Boolean bool = Boolean.FALSE;
            t9.b0(rw1Var2, "sms", bool);
            t9.b0(rw1Var2, "tel", bool);
            t9.b0(rw1Var2, "calendar", bool);
            t9.b0(rw1Var2, "storePicture", bool);
            t9.b0(rw1Var2, "inlineVideo", bool);
            tg1 tg1Var3 = new tg1(rw1Var2.f4223a);
            rw1Var.a("maxSize", tg1Var);
            rw1Var.a("screenSize", tg1Var);
            rw1Var.a("defaultPosition", tg1Var2);
            rw1Var.a("currentPosition", tg1Var2);
            rw1Var.a("supports", tg1Var3);
            t9.c0(rw1Var, "placementType", this.advertisement.templateType());
            Boolean bool2 = this.isViewable;
            if (bool2 != null) {
                t9.b0(rw1Var, "isViewable", Boolean.valueOf(bool2.booleanValue()));
            }
            t9.c0(rw1Var, "os", "android");
            t9.c0(rw1Var, "osVersion", String.valueOf(Build.VERSION.SDK_INT));
            t9.b0(rw1Var, "incentivized", this.placement.getIncentivized());
            rw1Var.a("enableBackImmediately", zf3.b(Integer.valueOf(this.advertisement.getShowCloseDelay(this.placement.getIncentivized()))));
            t9.c0(rw1Var, "version", BuildConfig.VERSION_NAME);
            if (this.collectConsent) {
                t9.b0(rw1Var, "consentRequired", Boolean.TRUE);
                t9.c0(rw1Var, "consentTitleText", this.gdprTitle);
                t9.c0(rw1Var, "consentBodyText", this.gdprBody);
                t9.c0(rw1Var, "consentAcceptButtonText", this.gdprAccept);
                t9.c0(rw1Var, "consentDenyButtonText", this.gdprDeny);
            } else {
                t9.b0(rw1Var, "consentRequired", bool);
            }
            t9.c0(rw1Var, "sdkVersion", com.vungle.ads.BuildConfig.VERSION_NAME);
            tg1 tg1Var4 = new tg1(rw1Var.f4223a);
            tg1Var4.toString();
            runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyPropertiesChange(" + tg1Var4 + "," + z + ")");
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (webView == null) {
            return;
        }
        this.loadedWebView = webView;
        webView.setVisibility(0);
        notifyPropertiesChange(true);
        if (Build.VERSION.SDK_INT >= 29) {
            webView.setWebViewRenderProcessClient(new VungleWebViewRenderProcessClient(this.errorHandler));
        }
        WebViewObserver webViewObserver = this.webViewObserver;
        if (webViewObserver != null) {
            webViewObserver.onPageFinished(webView);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        if (Build.VERSION.SDK_INT < 23) {
            boolean isCriticalAsset = isCriticalAsset(str2);
            Log.e(TAG, "Error desc " + str + " for URL " + str2);
            handleWebViewError(str, str2, isCriticalAsset);
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        Integer num;
        boolean z;
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        Uri uri = null;
        if (webResourceResponse != null) {
            num = Integer.valueOf(webResourceResponse.getStatusCode());
        } else {
            num = null;
        }
        String valueOf = String.valueOf(num);
        if (webResourceRequest != null) {
            uri = webResourceRequest.getUrl();
        }
        String valueOf2 = String.valueOf(uri);
        boolean z2 = true;
        if (webResourceRequest != null && webResourceRequest.isForMainFrame()) {
            z = true;
        } else {
            z = false;
        }
        Log.e(TAG, "Http Error desc " + valueOf + " " + z + " for URL " + valueOf2);
        if (!isCriticalAsset(valueOf2) || !z) {
            z2 = false;
        }
        handleWebViewError(valueOf, valueOf2, z2);
    }

    @Override // android.webkit.WebViewClient
    @TargetApi(26)
    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        if (webView != null) {
            webView.getUrl();
        }
        if (renderProcessGoneDetail != null) {
            renderProcessGoneDetail.didCrash();
        }
        Boolean bool = null;
        this.loadedWebView = null;
        WebViewAPI.WebClientErrorHandler webClientErrorHandler = this.errorHandler;
        if (webClientErrorHandler != null) {
            if (renderProcessGoneDetail != null) {
                bool = Boolean.valueOf(renderProcessGoneDetail.didCrash());
            }
            return webClientErrorHandler.onWebRenderingProcessGone(webView, bool);
        }
        return super.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setAdVisibility(boolean z) {
        this.isViewable = Boolean.valueOf(z);
        notifyPropertiesChange(false);
    }

    public final void setCollectConsent$vungle_ads_release(boolean z) {
        this.collectConsent = z;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setConsentStatus(boolean z, String str, String str2, String str3, String str4) {
        this.collectConsent = z;
        this.gdprTitle = str;
        this.gdprBody = str2;
        this.gdprAccept = str3;
        this.gdprDeny = str4;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setErrorHandler(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    public final void setErrorHandler$vungle_ads_release(WebViewAPI.WebClientErrorHandler webClientErrorHandler) {
        this.errorHandler = webClientErrorHandler;
    }

    public final void setGdprAccept$vungle_ads_release(String str) {
        this.gdprAccept = str;
    }

    public final void setGdprBody$vungle_ads_release(String str) {
        this.gdprBody = str;
    }

    public final void setGdprDeny$vungle_ads_release(String str) {
        this.gdprDeny = str;
    }

    public final void setGdprTitle$vungle_ads_release(String str) {
        this.gdprTitle = str;
    }

    public final void setLoadedWebView$vungle_ads_release(WebView webView) {
        this.loadedWebView = webView;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setMraidDelegate(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setMraidDelegate$vungle_ads_release(WebViewAPI.MraidDelegate mraidDelegate) {
        this.mraidDelegate = mraidDelegate;
    }

    public final void setReady$vungle_ads_release(boolean z) {
        this.ready = z;
    }

    public final void setViewable$vungle_ads_release(Boolean bool) {
        this.isViewable = bool;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI
    public void setWebViewObserver(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    public final void setWebViewObserver$vungle_ads_release(WebViewObserver webViewObserver) {
        this.webViewObserver = webViewObserver;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(final WebView webView, String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            Log.e(TAG, "Invalid URL ");
            return false;
        }
        Uri parse = Uri.parse(str);
        if (parse == null || parse.getScheme() == null) {
            return false;
        }
        String scheme = parse.getScheme();
        if (m20.L(scheme, "mraid")) {
            final String host = parse.getHost();
            if (host != null) {
                if (m20.L("propertiesChangeCompleted", host)) {
                    if (!this.ready) {
                        runJavascriptOnWebView(webView, "window.vungle.mraidBridge.notifyReadyEvent(" + this.advertisement.createMRAIDArgs() + ")");
                        this.ready = true;
                    }
                } else {
                    final WebViewAPI.MraidDelegate mraidDelegate = this.mraidDelegate;
                    if (mraidDelegate != null) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (String str2 : parse.getQueryParameterNames()) {
                        }
                        final tg1 tg1Var = new tg1(linkedHashMap);
                        final Handler handler = new Handler(Looper.getMainLooper());
                        this.offloadExecutor.submit(new Runnable() { // from class: co3
                            @Override // java.lang.Runnable
                            public final void run() {
                                VungleWebClient.m90shouldOverrideUrlLoading$lambda4$lambda3$lambda2(WebViewAPI.MraidDelegate.this, host, tg1Var, handler, this, webView);
                            }
                        });
                    }
                }
                return true;
            }
        } else if (i23.U0("http", scheme) || i23.U0("https", scheme)) {
            WebViewAPI.MraidDelegate mraidDelegate2 = this.mraidDelegate;
            if (mraidDelegate2 != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                mraidDelegate2.processCommand("openNonMraid", new tg1(linkedHashMap2));
            }
            return true;
        }
        return false;
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        if (Build.VERSION.SDK_INT >= 23) {
            String valueOf = String.valueOf(webResourceError != null ? webResourceError.getDescription() : null);
            String valueOf2 = String.valueOf(webResourceRequest != null ? webResourceRequest.getUrl() : null);
            boolean z = webResourceRequest != null && webResourceRequest.isForMainFrame();
            Log.e(TAG, "Error desc " + valueOf + " " + z + " for URL " + valueOf2);
            handleWebViewError(valueOf, valueOf2, isCriticalAsset(valueOf2) && z);
        }
    }
}
