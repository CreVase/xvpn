package com.vungle.ads.internal.ui.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.MotionEvent;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.util.HandlerScheduler;
import defpackage.jo0;
import defpackage.m20;
import defpackage.ng0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* loaded from: classes2.dex */
public final class MRAIDAdWidget extends RelativeLayout {
    public static final Companion Companion = new Companion(null);
    private static final String TAG = "MRAIDAdWidget";
    private CloseDelegate closeDelegate;
    private OnViewTouchListener onViewTouchListener;
    private OrientationDelegate orientationDelegate;
    private WebView webView;

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface AdStopReason {
        public static final Companion Companion = Companion.$$INSTANCE;
        public static final int IS_AD_FINISHED_BY_API = 4;
        public static final int IS_AD_FINISHING = 2;
        public static final int IS_CHANGING_CONFIGURATION = 1;

        /* loaded from: classes2.dex */
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();
            public static final int IS_AD_FINISHED_BY_API = 4;
            public static final int IS_AD_FINISHING = 2;
            public static final int IS_CHANGING_CONFIGURATION = 1;

            private Companion() {
            }
        }
    }

    /* loaded from: classes2.dex */
    public static final class AudioContextWrapper extends ContextWrapper {
        public AudioContextWrapper(Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Object getSystemService(String str) {
            if (m20.L("audio", str)) {
                return getApplicationContext().getSystemService(str);
            }
            return super.getSystemService(str);
        }
    }

    /* loaded from: classes2.dex */
    public interface CloseDelegate {
        void close();
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public static final class DestroyRunnable implements Runnable {
        private final WebView webView;

        public DestroyRunnable(WebView webView) {
            this.webView = webView;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.webView.stopLoading();
                if (Build.VERSION.SDK_INT >= 29) {
                    this.webView.setWebViewRenderProcessClient(null);
                }
                this.webView.loadData("", null, null);
                this.webView.destroy();
            } catch (Exception unused) {
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface OnViewTouchListener {
        boolean onTouch(MotionEvent motionEvent);
    }

    /* loaded from: classes2.dex */
    public interface OrientationDelegate {
        void setOrientation(int i);
    }

    public MRAIDAdWidget(Context context) {
        super(context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(layoutParams);
        WebView webView = new WebView(context);
        this.webView = webView;
        webView.setLayoutParams(layoutParams);
        this.webView.setTag("VungleWebView");
        addView(this.webView, layoutParams);
        bindListeners();
        prepare();
    }

    private final void applyDefault(WebView webView) {
        WebSettings settings = webView.getSettings();
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private final void bindListeners() {
        OnViewTouchListener onViewTouchListener = this.onViewTouchListener;
        if (onViewTouchListener != null) {
            this.webView.setOnTouchListener(new jo0(onViewTouchListener, 4));
        }
    }

    public static /* synthetic */ void getCloseDelegate$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOnViewTouchListener$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getOrientationDelegate$vungle_ads_release$annotations() {
    }

    private final void prepare() {
        WebView webView = this.webView;
        webView.setLayerType(2, null);
        webView.setBackgroundColor(0);
        webView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        webView.setVisibility(8);
    }

    public final void close() {
        CloseDelegate closeDelegate = this.closeDelegate;
        if (closeDelegate != null) {
            closeDelegate.close();
        }
    }

    public final void destroyWebView(long j) {
        WebView webView = this.webView;
        webView.setWebChromeClient(null);
        removeAllViews();
        if (j <= 0) {
            new DestroyRunnable(webView).run();
        } else {
            new HandlerScheduler().schedule(new DestroyRunnable(webView), j);
        }
    }

    public final CloseDelegate getCloseDelegate$vungle_ads_release() {
        return this.closeDelegate;
    }

    public final OnViewTouchListener getOnViewTouchListener$vungle_ads_release() {
        return this.onViewTouchListener;
    }

    public final OrientationDelegate getOrientationDelegate$vungle_ads_release() {
        return this.orientationDelegate;
    }

    public final String getUrl() {
        return this.webView.getUrl();
    }

    public final void linkWebView(WebViewClient webViewClient) {
        WebView webView = this.webView;
        applyDefault(webView);
        webView.setWebViewClient(webViewClient);
    }

    public final void pauseWeb() {
        this.webView.onPause();
    }

    public final void resumeWeb() {
        this.webView.onResume();
    }

    public final void setCloseDelegate(CloseDelegate closeDelegate) {
        this.closeDelegate = closeDelegate;
    }

    public final void setCloseDelegate$vungle_ads_release(CloseDelegate closeDelegate) {
        this.closeDelegate = closeDelegate;
    }

    public final void setOnViewTouchListener(OnViewTouchListener onViewTouchListener) {
        this.onViewTouchListener = onViewTouchListener;
    }

    public final void setOnViewTouchListener$vungle_ads_release(OnViewTouchListener onViewTouchListener) {
        this.onViewTouchListener = onViewTouchListener;
    }

    public final void setOrientation(int i) {
        OrientationDelegate orientationDelegate = this.orientationDelegate;
        if (orientationDelegate != null) {
            orientationDelegate.setOrientation(i);
        }
    }

    public final void setOrientationDelegate(OrientationDelegate orientationDelegate) {
        this.orientationDelegate = orientationDelegate;
    }

    public final void setOrientationDelegate$vungle_ads_release(OrientationDelegate orientationDelegate) {
        this.orientationDelegate = orientationDelegate;
    }

    public final void showWebsite(String str) {
        WebView webView = this.webView;
        webView.loadUrl(str);
        webView.setVisibility(0);
    }
}
