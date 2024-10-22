package com.vungle.ads.internal.presenter;

import android.util.Log;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InternalError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.SingleValueMetric;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ClickCoordinateTracker;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.VungleWebClient;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import com.vungle.ads.internal.ui.view.WebViewAPI;
import com.vungle.ads.internal.util.HandlerScheduler;
import com.vungle.ads.internal.util.SuspendableTimer;
import defpackage.hx2;
import defpackage.k43;
import defpackage.kj1;
import defpackage.m20;
import defpackage.ng0;
import defpackage.oo1;
import defpackage.p71;
import defpackage.ui1;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class MRAIDPresenter implements WebViewAPI.MraidDelegate, WebViewAPI.WebClientErrorHandler {
    private static final String ACTION = "action";
    public static final String ACTION_WITH_VALUE = "actionWithValue";
    public static final String CLOSE = "close";
    public static final String CONSENT_ACTION = "consentAction";
    public static final String CREATIVE_HEARTBEAT = "creativeHeartbeat";
    public static final Companion Companion = new Companion(null);
    public static final String ERROR = "error";
    private static final double HEARTBEAT_INTERVAL = 6.0d;
    public static final String OPEN = "open";
    private static final String OPEN_NON_MRAID = "openNonMraid";
    public static final String OPEN_PRIVACY = "openPrivacy";
    public static final String SET_ORIENTATION_PROPERTIES = "setOrientationProperties";
    public static final String SUCCESSFUL_VIEW = "successfulView";
    private static final String TAG = "MRAIDPresenter";
    public static final String TPAT = "tpat";
    private static final String USE_CUSTOM_CLOSE = "useCustomClose";
    private static final String USE_CUSTOM_PRIVACY = "useCustomPrivacy";
    public static final String VIDEO_LENGTH = "videoLength";
    public static final String VIDEO_VIEWED = "videoViewed";
    private Long adStartTime;
    private boolean adViewed;
    private final MRAIDAdWidget adWidget;
    private final AdPayload advertisement;
    private boolean backEnabled;
    private final BidPayload bidPayload;
    private AdEventListener bus;
    private final ui1 clickCoordinateTracker$delegate;
    private Executor executor;
    private boolean heartbeatEnabled;
    private final OMTracker omTracker;
    private final Placement placement;
    private PresenterDelegate presenterDelegate;
    private final ui1 scheduler$delegate;
    private final ui1 suspendableTimer$delegate;
    private String userId;
    private final ui1 vungleApiClient$delegate;
    private final VungleWebClient vungleWebClient;
    private final AtomicBoolean isDestroying = new AtomicBoolean(false);
    private final AtomicBoolean sendReportIncentivized = new AtomicBoolean(false);

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public static /* synthetic */ void getACTION_WITH_VALUE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCLOSE$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCONSENT_ACTION$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getCREATIVE_HEARTBEAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getERROR$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getOPEN_PRIVACY$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSET_ORIENTATION_PROPERTIES$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getSUCCESSFUL_VIEW$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getTPAT$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getVIDEO_LENGTH$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getVIDEO_VIEWED$vungle_ads_release$annotations() {
        }
    }

    public MRAIDPresenter(MRAIDAdWidget mRAIDAdWidget, AdPayload adPayload, Placement placement, VungleWebClient vungleWebClient, Executor executor, OMTracker oMTracker, BidPayload bidPayload) {
        this.adWidget = mRAIDAdWidget;
        this.advertisement = adPayload;
        this.placement = placement;
        this.vungleWebClient = vungleWebClient;
        this.executor = executor;
        this.omTracker = oMTracker;
        this.bidPayload = bidPayload;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.vungleApiClient$delegate = m20.D0(kj1.f2953a, new MRAIDPresenter$special$$inlined$inject$1(mRAIDAdWidget.getContext()));
        this.scheduler$delegate = new k43(MRAIDPresenter$scheduler$2.INSTANCE);
        this.suspendableTimer$delegate = new k43(new MRAIDPresenter$suspendableTimer$2(this));
        this.clickCoordinateTracker$delegate = new k43(new MRAIDPresenter$clickCoordinateTracker$2(this));
    }

    private final void closeView() {
        this.adWidget.close();
    }

    public static /* synthetic */ void getAdStartTime$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBackEnabled$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getBus$annotations() {
    }

    public static /* synthetic */ void getClickCoordinateTracker$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getHeartbeatEnabled$vungle_ads_release$annotations() {
    }

    private final HandlerScheduler getScheduler() {
        return (HandlerScheduler) this.scheduler$delegate.getValue();
    }

    public static /* synthetic */ void getSuspendableTimer$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getUserId$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getVungleApiClient$vungle_ads_release$annotations() {
    }

    private final void handleWebViewException(VungleError vungleError, boolean z, String str) {
        Log.e(TAG, "handleWebViewException: " + vungleError.getLocalizedMessage() + ", fatal: " + z + ", errorMsg: " + str);
        if (z) {
            makeBusError(vungleError);
            closeView();
        }
    }

    public static /* synthetic */ void handleWebViewException$default(MRAIDPresenter mRAIDPresenter, VungleError vungleError, boolean z, String str, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        mRAIDPresenter.handleWebViewException(vungleError, z, str);
    }

    public static /* synthetic */ void isDestroying$vungle_ads_release$annotations() {
    }

    private final boolean loadMraid(File file) {
        File file2;
        String parent = file.getParent();
        String str = null;
        if (parent != null) {
            file2 = new File(parent);
        } else {
            file2 = null;
        }
        if (file2 != null) {
            str = file2.getPath();
        }
        File file3 = new File(p71.m(str, File.separator, "index.html"));
        if (!file3.exists()) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(310, hx2.p("Fail to load html ", file3.getPath()), this.placement.getReferenceId(), this.advertisement.getCreativeId(), this.advertisement.eventId());
            return false;
        }
        this.adWidget.showWebsite(AdPayload.FILE_SCHEME + file3.getPath());
        return true;
    }

    private final void makeBusError(VungleError vungleError) {
        AdEventListener adEventListener = this.bus;
        if (adEventListener != null) {
            adEventListener.onError(vungleError, this.placement.getReferenceId());
        }
    }

    /* renamed from: processCommand$lambda-3 */
    public static final void m82processCommand$lambda3(MRAIDPresenter mRAIDPresenter) {
        mRAIDPresenter.vungleWebClient.notifyPropertiesChange(true);
    }

    /* renamed from: processCommand$lambda-4 */
    public static final void m83processCommand$lambda4(MRAIDPresenter mRAIDPresenter) {
        mRAIDPresenter.adWidget.setVisibility(0);
    }

    /* renamed from: processCommand$lambda-6 */
    public static final void m84processCommand$lambda6(MRAIDPresenter mRAIDPresenter) {
        String referenceId = mRAIDPresenter.placement.getReferenceId();
        List list = null;
        Boolean bool = null;
        String str = null;
        Call<Void> ri = mRAIDPresenter.getVungleApiClient$vungle_ads_release().ri(new CommonRequestBody.RequestParam(list, bool, str, mRAIDPresenter.adStartTime, mRAIDPresenter.advertisement.appId(), referenceId, mRAIDPresenter.userId, 7, (ng0) null));
        if (ri == null) {
            Log.e(TAG, "Invalid ri call.");
        } else {
            ri.enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$6$1
                @Override // com.vungle.ads.internal.network.Callback
                public void onFailure(Call<Void> call, Throwable th) {
                }

                @Override // com.vungle.ads.internal.network.Callback
                public void onResponse(Call<Void> call, Response<Void> response) {
                }
            });
        }
    }

    /* renamed from: processCommand$lambda-7 */
    public static final void m85processCommand$lambda7(MRAIDPresenter mRAIDPresenter, boolean z, String str, String str2) {
        mRAIDPresenter.handleWebViewException(new InternalError(VungleError.CREATIVE_ERROR, null, 2, 0 == true ? 1 : 0), z, p71.m(str, " : ", str2));
    }

    /* renamed from: processCommand$lambda-8 */
    public static final void m86processCommand$lambda8(MRAIDPresenter mRAIDPresenter) {
        mRAIDPresenter.getSuspendableTimer$vungle_ads_release().reset();
    }

    private final void recordPlayAssetMetric() {
        Sdk.SDKMetric.SDKMetricType sDKMetricType;
        if (this.advertisement.getAssetsFullyDownloaded()) {
            sDKMetricType = Sdk.SDKMetric.SDKMetricType.LOCAL_ASSETS_USED;
        } else {
            sDKMetricType = Sdk.SDKMetric.SDKMetricType.REMOTE_ASSETS_USED;
        }
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new SingleValueMetric(sDKMetricType), (r13 & 2) != 0 ? null : this.placement.getReferenceId(), (r13 & 4) != 0 ? null : this.advertisement.getCreativeId(), (r13 & 8) != 0 ? null : this.advertisement.eventId(), (r13 & 16) != 0 ? null : null);
    }

    public final void reportErrorAndCloseAd(VungleError vungleError) {
        makeBusError(vungleError);
        closeView();
    }

    public final void detach(@MRAIDAdWidget.AdStopReason int i) {
        boolean z;
        AdEventListener adEventListener;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        this.vungleWebClient.setWebViewObserver(null);
        this.vungleWebClient.setMraidDelegate(null);
        if (!z && z2 && !this.isDestroying.getAndSet(true) && (adEventListener = this.bus) != null) {
            adEventListener.onNext("end", null, this.placement.getReferenceId());
        }
        this.adWidget.destroyWebView(this.omTracker.stop());
        if (this.heartbeatEnabled) {
            getSuspendableTimer$vungle_ads_release().cancel();
        }
    }

    public final Long getAdStartTime$vungle_ads_release() {
        return this.adStartTime;
    }

    public final boolean getBackEnabled$vungle_ads_release() {
        return this.backEnabled;
    }

    public final AdEventListener getBus() {
        return this.bus;
    }

    public final ClickCoordinateTracker getClickCoordinateTracker$vungle_ads_release() {
        return (ClickCoordinateTracker) this.clickCoordinateTracker$delegate.getValue();
    }

    public final boolean getHeartbeatEnabled$vungle_ads_release() {
        return this.heartbeatEnabled;
    }

    public final SuspendableTimer getSuspendableTimer$vungle_ads_release() {
        return (SuspendableTimer) this.suspendableTimer$delegate.getValue();
    }

    public final String getUserId$vungle_ads_release() {
        return this.userId;
    }

    public final VungleApiClient getVungleApiClient$vungle_ads_release() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    public final void handleExit() {
        if (this.backEnabled) {
            this.adWidget.showWebsite("javascript:window.vungle.mraidBridgeExt.requestMRAIDClose()");
        }
    }

    public final AtomicBoolean isDestroying$vungle_ads_release() {
        return this.isDestroying;
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onReceivedError(String str, boolean z) {
        if (z) {
            reportErrorAndCloseAd(new InternalError(VungleError.AD_RENDER_NETWORK_ERROR, null, 2, 0 == true ? 1 : 0));
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        handleWebViewException$default(this, new InternalError(VungleError.WEBVIEW_RENDER_UNRESPONSIVE, null, 2, 0 == true ? 1 : 0), true, null, 4, null);
    }

    public final void onViewConfigurationChanged() {
        this.vungleWebClient.notifyPropertiesChange(true);
    }

    public final void onViewTouched(MotionEvent motionEvent) {
        if (motionEvent != null) {
            getClickCoordinateTracker$vungle_ads_release().trackCoordinate(motionEvent);
        }
    }

    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.WebClientErrorHandler
    public boolean onWebRenderingProcessGone(WebView webView, Boolean bool) {
        handleWebViewException$default(this, new InternalError(VungleError.WEB_CRASH, null, 2, 0 == true ? 1 : 0), true, null, 4, null);
        return true;
    }

    public final void prepare() {
        Integer num;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        boolean z;
        int settings;
        boolean z2;
        this.isDestroying.set(false);
        this.adWidget.linkWebView(this.vungleWebClient);
        AdConfig adConfig = this.advertisement.getAdConfig();
        int i2 = 2;
        if (adConfig != null && (settings = adConfig.getSettings()) > 0) {
            if ((settings & 2) == 2) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.backEnabled = z2;
        }
        ConfigManager configManager = ConfigManager.INSTANCE;
        this.heartbeatEnabled = configManager.heartbeatEnabled();
        AdConfig adConfig2 = this.advertisement.getAdConfig();
        String str6 = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        if (adConfig2 != null) {
            num = Integer.valueOf(adConfig2.getAdOrientation());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == 0) {
            i = 7;
        } else if (num != null && num.intValue() == 1) {
            i = 6;
        } else {
            i = 4;
        }
        this.adWidget.setOrientation(i);
        this.omTracker.start();
        this.vungleWebClient.setMraidDelegate(this);
        this.vungleWebClient.setErrorHandler(this);
        File assetDirectory = this.advertisement.getAssetDirectory();
        int i3 = VungleError.AD_UNABLE_TO_PLAY;
        if (assetDirectory != null && assetDirectory.exists()) {
            if (!loadMraid(new File(p71.m(assetDirectory.getPath(), File.separator, AdPayload.KEY_TEMPLATE)))) {
                reportErrorAndCloseAd(new InternalError(i3, str6, i2, b4 == true ? 1 : 0));
                return;
            }
            this.adStartTime = Long.valueOf(System.currentTimeMillis());
            PresenterDelegate presenterDelegate = this.presenterDelegate;
            if (presenterDelegate != null) {
                str = presenterDelegate.getUserId();
            } else {
                str = null;
            }
            this.userId = str;
            PresenterDelegate presenterDelegate2 = this.presenterDelegate;
            if (presenterDelegate2 == null || (str2 = presenterDelegate2.getAlertTitleText()) == null) {
                str2 = "";
            }
            PresenterDelegate presenterDelegate3 = this.presenterDelegate;
            if (presenterDelegate3 == null || (str3 = presenterDelegate3.getAlertBodyText()) == null) {
                str3 = "";
            }
            PresenterDelegate presenterDelegate4 = this.presenterDelegate;
            if (presenterDelegate4 == null || (str4 = presenterDelegate4.getAlertContinueButtonText()) == null) {
                str4 = "";
            }
            PresenterDelegate presenterDelegate5 = this.presenterDelegate;
            if (presenterDelegate5 == null || (str5 = presenterDelegate5.getAlertCloseButtonText()) == null) {
                str5 = "";
            }
            this.advertisement.setIncentivizedText(str2, str3, str4, str5);
            if (configManager.getGDPRIsCountryDataProtected() && m20.L("unknown", PrivacyManager.INSTANCE.getConsentStatus())) {
                z = true;
            } else {
                z = false;
            }
            this.vungleWebClient.setConsentStatus(z, configManager.getGDPRConsentTitle(), configManager.getGDPRConsentMessage(), configManager.getGDPRButtonAccept(), configManager.getGDPRButtonDeny());
            if (z) {
                PrivacyManager.INSTANCE.updateGdprConsent("opted_out_by_timeout", "vungle_modal", "");
            }
            int showCloseDelay = this.advertisement.getShowCloseDelay(Boolean.valueOf(this.placement.isIncentivized()));
            if (showCloseDelay > 0) {
                getScheduler().schedule(new oo1(this, 0), showCloseDelay);
            } else {
                this.backEnabled = true;
            }
            AdEventListener adEventListener = this.bus;
            if (adEventListener != null) {
                adEventListener.onNext("start", null, this.placement.getReferenceId());
            }
            if (this.heartbeatEnabled) {
                getSuspendableTimer$vungle_ads_release().start();
                return;
            }
            return;
        }
        reportErrorAndCloseAd(new InternalError(i3, b3 == true ? 1 : 0, i2, b2 == true ? 1 : 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x018a, code lost:            if (r20.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN) == false) goto L312;     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a3, code lost:            r1 = r19.advertisement.adUnit();     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01a9, code lost:            if (r1 == null) goto L232;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01ab, code lost:            r11 = r1.getDeeplinkUrl();     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01af, code lost:            r13 = r11;        r14 = defpackage.zf3.B((defpackage.eg1) defpackage.jq1.l0(r21, com.google.android.gms.common.internal.ImagesContract.URL)).c();     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01be, code lost:            if (r13 == null) goto L239;     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01c4, code lost:            if (r13.length() != 0) goto L237;     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c6, code lost:            r1 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01c9, code lost:            if (r1 == false) goto L244;     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01da, code lost:            com.vungle.ads.internal.util.ExternalRouter.launch(r13, r14, r19.adWidget.getContext(), true, new com.vungle.ads.internal.ui.PresenterAppLeftCallback(r19.bus, r19.placement.getReferenceId()), new com.vungle.ads.internal.presenter.MRAIDPresenter$processCommand$5());     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01fb, code lost:            r1 = r19.bus;     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01fd, code lost:            if (r1 == null) goto L248;     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01ff, code lost:            r1.onNext(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN, "adClick", r19.placement.getReferenceId());     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x020a, code lost:            return true;     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c8, code lost:            r1 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01cf, code lost:            if (r14.length() != 0) goto L242;     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01d1, code lost:            r10 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01d2, code lost:            if (r10 == false) goto L244;     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01d4, code lost:            android.util.Log.e(com.vungle.ads.internal.presenter.MRAIDPresenter.TAG, "CTA destination URL is not configured properly");     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x019f, code lost:            if (r20.equals(com.vungle.ads.internal.presenter.MRAIDPresenter.OPEN_NON_MRAID) == false) goto L312;     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x001f. Please report as an issue. */
    @Override // com.vungle.ads.internal.ui.view.WebViewAPI.MraidDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean processCommand(java.lang.String r20, defpackage.tg1 r21) {
        /*
            Method dump skipped, instructions count: 960
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.internal.presenter.MRAIDPresenter.processCommand(java.lang.String, tg1):boolean");
    }

    public final void setAdStartTime$vungle_ads_release(Long l) {
        this.adStartTime = l;
    }

    public final void setAdVisibility(boolean z) {
        this.vungleWebClient.setAdVisibility(z);
    }

    public final void setBackEnabled$vungle_ads_release(boolean z) {
        this.backEnabled = z;
    }

    public final void setBus(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void setEventListener(AdEventListener adEventListener) {
        this.bus = adEventListener;
    }

    public final void setHeartbeatEnabled$vungle_ads_release(boolean z) {
        this.heartbeatEnabled = z;
    }

    public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
        this.presenterDelegate = presenterDelegate;
    }

    public final void setUserId$vungle_ads_release(String str) {
        this.userId = str;
    }

    public final void start() {
        this.adWidget.resumeWeb();
        setAdVisibility(true);
        if (ConfigManager.INSTANCE.adLoadOptimizationEnabled()) {
            recordPlayAssetMetric();
        }
    }

    public final void stop() {
        this.adWidget.pauseWeb();
        setAdVisibility(false);
    }
}
