package com.vungle.ads.internal.ui;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import com.vungle.ads.AdConfig;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InternalError;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.executor.VungleThreadPoolExecutor;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.omsdk.OMTracker;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import com.vungle.ads.internal.presenter.PresenterDelegate;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import defpackage.ar3;
import defpackage.m20;
import defpackage.ng0;
import defpackage.p71;
import defpackage.s71;
import defpackage.v51;
import defpackage.xq3;
import defpackage.yq3;
import defpackage.zq3;
import okhttp3.internal.http2.Http2Connection;

/* loaded from: classes2.dex */
public abstract class AdActivity extends Activity {
    public static final Companion Companion = new Companion(null);
    public static final String REQUEST_KEY_EVENT_ID_EXTRA = "request_eventId";
    public static final String REQUEST_KEY_EXTRA = "request";
    private static final String TAG = "AdActivity";
    public static AdPayload advertisement;
    private static BidPayload bidPayload;
    private static AdEventListener eventListener;
    private static PresenterDelegate presenterDelegate;
    private MRAIDAdWidget mraidAdWidget;
    private MRAIDPresenter mraidPresenter;
    private String placementRefId = "";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }

        public static /* synthetic */ void getREQUEST_KEY_EVENT_ID_EXTRA$vungle_ads_release$annotations() {
        }

        public static /* synthetic */ void getREQUEST_KEY_EXTRA$vungle_ads_release$annotations() {
        }

        public final Intent createIntent(Context context, String str, String str2) {
            Intent intent = new Intent(context, (Class<?>) VungleActivity.class);
            intent.addFlags(268435456);
            Bundle bundle = new Bundle();
            bundle.putString(AdActivity.REQUEST_KEY_EXTRA, str);
            bundle.putString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA, str2);
            intent.putExtras(bundle);
            return intent;
        }

        public final AdPayload getAdvertisement() {
            AdPayload adPayload = AdActivity.advertisement;
            if (adPayload != null) {
                return adPayload;
            }
            return null;
        }

        public final BidPayload getBidPayload() {
            return AdActivity.bidPayload;
        }

        public final String getEventId(Intent intent) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString(AdActivity.REQUEST_KEY_EVENT_ID_EXTRA);
            }
            return null;
        }

        public final AdEventListener getEventListener() {
            return AdActivity.eventListener;
        }

        public final String getPlacement(Intent intent) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString(AdActivity.REQUEST_KEY_EXTRA);
            }
            return null;
        }

        public final PresenterDelegate getPresenterDelegate$vungle_ads_release() {
            return AdActivity.presenterDelegate;
        }

        public final void setAdvertisement(AdPayload adPayload) {
            AdActivity.advertisement = adPayload;
        }

        public final void setBidPayload(BidPayload bidPayload) {
            AdActivity.bidPayload = bidPayload;
        }

        public final void setEventListener(AdEventListener adEventListener) {
            AdActivity.eventListener = adEventListener;
        }

        public final void setPresenterDelegate$vungle_ads_release(PresenterDelegate presenterDelegate) {
            AdActivity.presenterDelegate = presenterDelegate;
        }
    }

    public static /* synthetic */ void getMraidAdWidget$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getMraidPresenter$vungle_ads_release$annotations() {
    }

    public static /* synthetic */ void getPlacementRefId$vungle_ads_release$annotations() {
    }

    private final void hideSystemUi() {
        s71 xq3Var;
        Window window = getWindow();
        v51 v51Var = new v51(getWindow().getDecorView());
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            xq3Var = new ar3(window, v51Var);
        } else if (i >= 26) {
            xq3Var = new zq3(window, v51Var);
        } else if (i >= 23) {
            xq3Var = new yq3(window, v51Var);
        } else {
            xq3Var = new xq3(window, v51Var);
        }
        xq3Var.p();
        xq3Var.l();
    }

    private final void onConcurrentPlaybackError(String str) {
        InternalError internalError = new InternalError(VungleError.ALREADY_PLAYING_ANOTHER_AD, null, 2, 0 == true ? 1 : 0);
        AdEventListener adEventListener = eventListener;
        if (adEventListener != null) {
            adEventListener.onError(internalError, str);
        }
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        String l = p71.l(str, " try to play on a fullscreen ad object while another already playing");
        String str2 = this.placementRefId;
        Companion companion = Companion;
        analyticsClient.logError$vungle_ads_release(400, l, str2, companion.getAdvertisement().getCreativeId(), companion.getAdvertisement().eventId());
        Log.e(TAG, "onConcurrentPlaybackError: " + internalError.getLocalizedMessage());
    }

    public boolean canRotate$vungle_ads_release() {
        return false;
    }

    public final MRAIDAdWidget getMraidAdWidget$vungle_ads_release() {
        return this.mraidAdWidget;
    }

    public final MRAIDPresenter getMraidPresenter$vungle_ads_release() {
        return this.mraidPresenter;
    }

    public final String getPlacementRefId$vungle_ads_release() {
        return this.placementRefId;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.handleExit();
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.orientation;
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.onViewConfigurationChanged();
        }
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        String watermark$vungle_ads_release;
        super.onCreate(bundle);
        boolean z = true;
        requestWindowFeature(1);
        getWindow().setFlags(Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE);
        Companion companion = Companion;
        String valueOf = String.valueOf(companion.getPlacement(getIntent()));
        this.placementRefId = valueOf;
        ConfigManager configManager = ConfigManager.INSTANCE;
        Placement placement = configManager.getPlacement(valueOf);
        if (placement == null) {
            AdEventListener adEventListener = eventListener;
            if (adEventListener != null) {
                adEventListener.onError(new InternalError(VungleError.AD_UNABLE_TO_PLAY, null, 2, 0 == true ? 1 : 0), this.placementRefId);
            }
            finish();
            return;
        }
        getWindow().getDecorView().setBackgroundColor(-16777216);
        MRAIDAdWidget mRAIDAdWidget = new MRAIDAdWidget(this);
        mRAIDAdWidget.setCloseDelegate(new MRAIDAdWidget.CloseDelegate() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$2$1
            @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.CloseDelegate
            public void close() {
                AdActivity.this.finish();
            }
        });
        mRAIDAdWidget.setOnViewTouchListener(new MRAIDAdWidget.OnViewTouchListener() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$2$2
            @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OnViewTouchListener
            public boolean onTouch(MotionEvent motionEvent) {
                MRAIDPresenter mraidPresenter$vungle_ads_release = AdActivity.this.getMraidPresenter$vungle_ads_release();
                if (mraidPresenter$vungle_ads_release != null) {
                    mraidPresenter$vungle_ads_release.onViewTouched(motionEvent);
                    return false;
                }
                return false;
            }
        });
        mRAIDAdWidget.setOrientationDelegate(new MRAIDAdWidget.OrientationDelegate() { // from class: com.vungle.ads.internal.ui.AdActivity$onCreate$2$3
            @Override // com.vungle.ads.internal.ui.view.MRAIDAdWidget.OrientationDelegate
            public void setOrientation(int i) {
                AdActivity.this.setRequestedOrientation(i);
            }
        });
        ServiceLocator.Companion companion2 = ServiceLocator.Companion;
        Executors executors = (Executors) companion2.getInstance(this).getService(Executors.class);
        VungleWebClient vungleWebClient = new VungleWebClient(companion.getAdvertisement(), placement, executors.getOffloadExecutor());
        OMTracker.Factory factory = (OMTracker.Factory) companion2.getInstance(this).getService(OMTracker.Factory.class);
        if (!configManager.omEnabled() || !companion.getAdvertisement().omEnabled()) {
            z = false;
        }
        OMTracker make = factory.make(z);
        VungleThreadPoolExecutor jobExecutor = executors.getJobExecutor();
        vungleWebClient.setWebViewObserver(make);
        MRAIDPresenter mRAIDPresenter = new MRAIDPresenter(mRAIDAdWidget, companion.getAdvertisement(), placement, vungleWebClient, jobExecutor, make, bidPayload);
        mRAIDPresenter.setEventListener(eventListener);
        mRAIDPresenter.setPresenterDelegate$vungle_ads_release(presenterDelegate);
        mRAIDPresenter.prepare();
        setContentView(mRAIDAdWidget, mRAIDAdWidget.getLayoutParams());
        AdConfig adConfig = companion.getAdvertisement().getAdConfig();
        if (adConfig != null && (watermark$vungle_ads_release = adConfig.getWatermark$vungle_ads_release()) != null) {
            WatermarkView watermarkView = new WatermarkView(this, watermark$vungle_ads_release);
            ((FrameLayout) getWindow().getDecorView().findViewById(R.id.content)).addView(watermarkView);
            watermarkView.bringToFront();
        }
        this.mraidAdWidget = mRAIDAdWidget;
        this.mraidPresenter = mRAIDPresenter;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.detach((isChangingConfigurations() ? 1 : 0) | 2);
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Companion companion = Companion;
        String placement = companion.getPlacement(getIntent());
        String placement2 = companion.getPlacement(intent);
        String eventId = companion.getEventId(getIntent());
        String eventId2 = companion.getEventId(intent);
        if ((placement != null && placement2 != null && !m20.L(placement, placement2)) || (eventId != null && eventId2 != null && !m20.L(eventId, eventId2))) {
            onConcurrentPlaybackError(placement2);
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.stop();
        }
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        hideSystemUi();
        MRAIDPresenter mRAIDPresenter = this.mraidPresenter;
        if (mRAIDPresenter != null) {
            mRAIDPresenter.start();
        }
    }

    public final void setMraidAdWidget$vungle_ads_release(MRAIDAdWidget mRAIDAdWidget) {
        this.mraidAdWidget = mRAIDAdWidget;
    }

    public final void setMraidPresenter$vungle_ads_release(MRAIDPresenter mRAIDPresenter) {
        this.mraidPresenter = mRAIDPresenter;
    }

    public final void setPlacementRefId$vungle_ads_release(String str) {
        this.placementRefId = str;
    }

    @Override // android.app.Activity
    public void setRequestedOrientation(int i) {
        if (canRotate$vungle_ads_release()) {
            super.setRequestedOrientation(i);
        }
    }
}
