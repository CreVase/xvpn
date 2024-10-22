package com.vungle.ads.internal;

import android.content.Context;
import android.util.Log;
import com.vungle.ads.AdExpiredError;
import com.vungle.ads.AdExpiredOnPlayError;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ConcurrentPlaybackUnsupported;
import com.vungle.ads.InternalError;
import com.vungle.ads.InvalidAdState;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.downloader.Downloader;
import com.vungle.ads.internal.executor.SDKExecutors;
import com.vungle.ads.internal.load.AdLoaderCallback;
import com.vungle.ads.internal.load.AdRequest;
import com.vungle.ads.internal.load.BaseAdLoader;
import com.vungle.ads.internal.load.DefaultAdLoader;
import com.vungle.ads.internal.load.RealtimeAdLoader;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.VungleApiClient;
import com.vungle.ads.internal.omsdk.OMInjector;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.task.CleanupJob;
import com.vungle.ads.internal.task.JobRunner;
import com.vungle.ads.internal.ui.AdActivity;
import com.vungle.ads.internal.util.ActivityManager;
import com.vungle.ads.internal.util.PathProvider;
import defpackage.gi2;
import defpackage.hx2;
import defpackage.j11;
import defpackage.kj1;
import defpackage.ko3;
import defpackage.m20;
import defpackage.ng0;
import defpackage.pd0;
import defpackage.qf1;
import defpackage.t9;
import defpackage.tf3;
import defpackage.ui1;

/* loaded from: classes2.dex */
public abstract class AdInternal implements AdLoaderCallback {
    private static final boolean THROW_ON_ILLEGAL_TRANSITION = false;
    private AdLoaderCallback adLoaderCallback;
    private AdState adState = AdState.NEW;
    private AdPayload advertisement;
    private BaseAdLoader baseAdLoader;
    private BidPayload bidPayload;
    private final Context context;
    private Placement placement;
    private TimeIntervalMetric requestMetric;
    private final ui1 vungleApiClient$delegate;
    public static final Companion Companion = new Companion(null);
    private static final String TAG = gi2.a(AdInternal.class).b();
    private static final qf1 json = t9.d(AdInternal$Companion$json$1.INSTANCE);

    /* loaded from: classes2.dex */
    public static final class AdState extends Enum<AdState> {
        public static final AdState NEW = new NEW("NEW", 0);
        public static final AdState LOADING = new LOADING("LOADING", 1);
        public static final AdState READY = new READY("READY", 2);
        public static final AdState PLAYING = new PLAYING("PLAYING", 3);
        public static final AdState FINISHED = new FINISHED("FINISHED", 4);
        public static final AdState ERROR = new ERROR("ERROR", 5);
        private static final /* synthetic */ AdState[] $VALUES = $values();

        /* loaded from: classes2.dex */
        public static final class ERROR extends AdState {
            public ERROR(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                if (adState == AdState.FINISHED) {
                    return true;
                }
                return false;
            }
        }

        /* loaded from: classes2.dex */
        public static final class FINISHED extends AdState {
            public FINISHED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                return false;
            }
        }

        /* loaded from: classes2.dex */
        public static final class LOADING extends AdState {
            public LOADING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                if (adState != AdState.READY && adState != AdState.ERROR) {
                    return false;
                }
                return true;
            }
        }

        /* loaded from: classes2.dex */
        public static final class NEW extends AdState {
            public NEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                if (adState != AdState.LOADING && adState != AdState.READY && adState != AdState.ERROR) {
                    return false;
                }
                return true;
            }
        }

        /* loaded from: classes2.dex */
        public static final class PLAYING extends AdState {
            public PLAYING(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                if (adState != AdState.FINISHED && adState != AdState.ERROR) {
                    return false;
                }
                return true;
            }
        }

        /* loaded from: classes2.dex */
        public static final class READY extends AdState {
            public READY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.vungle.ads.internal.AdInternal.AdState
            public boolean canTransitionTo(AdState adState) {
                if (adState != AdState.PLAYING && adState != AdState.ERROR) {
                    return false;
                }
                return true;
            }
        }

        private static final /* synthetic */ AdState[] $values() {
            return new AdState[]{NEW, LOADING, READY, PLAYING, FINISHED, ERROR};
        }

        public /* synthetic */ AdState(String str, int i, ng0 ng0Var) {
            this(str, i);
        }

        public static AdState valueOf(String str) {
            return (AdState) Enum.valueOf(AdState.class, str);
        }

        public static AdState[] values() {
            return (AdState[]) $VALUES.clone();
        }

        public abstract boolean canTransitionTo(AdState adState);

        public final boolean isTerminalState() {
            return tf3.b0(FINISHED, ERROR).contains(this);
        }

        public final AdState transitionTo(AdState adState) {
            if (this != adState && !canTransitionTo(adState)) {
                String str = "Cannot transition from " + name() + " to " + adState.name();
                if (!AdInternal.THROW_ON_ILLEGAL_TRANSITION) {
                    Log.e(AdInternal.TAG, "Illegal state transition", new IllegalStateException(str));
                } else {
                    throw new IllegalStateException(str);
                }
            }
            return adState;
        }

        private AdState(String str, int i) {
            super(str, i);
        }
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
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdState.values().length];
            iArr[AdState.NEW.ordinal()] = 1;
            iArr[AdState.LOADING.ordinal()] = 2;
            iArr[AdState.READY.ordinal()] = 3;
            iArr[AdState.PLAYING.ordinal()] = 4;
            iArr[AdState.FINISHED.ordinal()] = 5;
            iArr[AdState.ERROR.ordinal()] = 6;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AdInternal(Context context) {
        this.context = context;
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.vungleApiClient$delegate = m20.D0(kj1.f2953a, new AdInternal$special$$inlined$inject$1(context));
    }

    /* renamed from: _set_adState_$lambda-1$lambda-0 */
    private static final JobRunner m44_set_adState_$lambda1$lambda0(ui1 ui1Var) {
        return (JobRunner) ui1Var.getValue();
    }

    public static /* synthetic */ VungleError canPlayAd$default(AdInternal adInternal, boolean z, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                z = false;
            }
            return adInternal.canPlayAd(z);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: canPlayAd");
    }

    private final VungleApiClient getVungleApiClient() {
        return (VungleApiClient) this.vungleApiClient$delegate.getValue();
    }

    /* renamed from: loadAd$lambda-2 */
    private static final OMInjector m45loadAd$lambda2(ui1 ui1Var) {
        return (OMInjector) ui1Var.getValue();
    }

    /* renamed from: loadAd$lambda-3 */
    private static final SDKExecutors m46loadAd$lambda3(ui1 ui1Var) {
        return (SDKExecutors) ui1Var.getValue();
    }

    /* renamed from: loadAd$lambda-4 */
    private static final PathProvider m47loadAd$lambda4(ui1 ui1Var) {
        return (PathProvider) ui1Var.getValue();
    }

    /* renamed from: loadAd$lambda-5 */
    private static final Downloader m48loadAd$lambda5(ui1 ui1Var) {
        return (Downloader) ui1Var.getValue();
    }

    public void adLoadedAndUpdateConfigure$vungle_ads_release(AdPayload adPayload) {
    }

    public final VungleError canPlayAd(boolean z) {
        VungleError invalidAdState;
        String str;
        String str2;
        AdPayload adPayload = this.advertisement;
        String str3 = null;
        if (adPayload == null) {
            invalidAdState = new AdNotLoadedCantPlay();
        } else {
            boolean z2 = false;
            if (adPayload != null && adPayload.hasExpired()) {
                z2 = true;
            }
            if (z2) {
                if (z) {
                    invalidAdState = new AdExpiredOnPlayError();
                } else {
                    invalidAdState = new AdExpiredError();
                }
            } else {
                AdState adState = this.adState;
                if (adState == AdState.PLAYING) {
                    invalidAdState = new ConcurrentPlaybackUnsupported();
                } else {
                    if (adState == AdState.READY) {
                        return null;
                    }
                    invalidAdState = new InvalidAdState();
                }
            }
        }
        if (z) {
            Placement placement = this.placement;
            if (placement != null) {
                str = placement.getReferenceId();
            } else {
                str = null;
            }
            VungleError placementId$vungle_ads_release = invalidAdState.setPlacementId$vungle_ads_release(str);
            AdPayload adPayload2 = this.advertisement;
            if (adPayload2 != null) {
                str2 = adPayload2.getCreativeId();
            } else {
                str2 = null;
            }
            VungleError creativeId$vungle_ads_release = placementId$vungle_ads_release.setCreativeId$vungle_ads_release(str2);
            AdPayload adPayload3 = this.advertisement;
            if (adPayload3 != null) {
                str3 = adPayload3.eventId();
            }
            creativeId$vungle_ads_release.setEventId$vungle_ads_release(str3).logErrorNoReturnValue$vungle_ads_release();
        }
        return invalidAdState;
    }

    public final void cancelDownload$vungle_ads_release() {
        BaseAdLoader baseAdLoader = this.baseAdLoader;
        if (baseAdLoader != null) {
            baseAdLoader.cancel();
        }
    }

    public abstract String getAdSizeForAdRequest();

    public final AdState getAdState() {
        return this.adState;
    }

    public final AdPayload getAdvertisement() {
        return this.advertisement;
    }

    public final BidPayload getBidPayload() {
        return this.bidPayload;
    }

    public final Context getContext() {
        return this.context;
    }

    public final Placement getPlacement() {
        return this.placement;
    }

    public final boolean isErrorTerminal$vungle_ads_release(int i) {
        if (this.adState == AdState.READY && i == 304) {
            return true;
        }
        return false;
    }

    public abstract boolean isValidAdSize(String str);

    public abstract boolean isValidAdTypeForPlacement(Placement placement);

    public final void loadAd(String str, String str2, AdLoaderCallback adLoaderCallback) {
        Sdk.SDKMetric.SDKMetricType sDKMetricType;
        boolean z;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        this.adLoaderCallback = adLoaderCallback;
        int i2 = 2;
        String str7 = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        byte b9 = 0;
        byte b10 = 0;
        byte b11 = 0;
        byte b12 = 0;
        byte b13 = 0;
        byte b14 = 0;
        if (!VungleAds.Companion.isInitialized()) {
            adLoaderCallback.onFailure(new InternalError(VungleError.VUNGLE_NOT_INITIALIZED, str7, i2, b14 == true ? 1 : 0));
            return;
        }
        ConfigManager configManager = ConfigManager.INSTANCE;
        Placement placement = configManager.getPlacement(str);
        if (placement == null) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(201, str.concat(" is invalid"), (r13 & 4) != 0 ? null : str, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            adLoaderCallback.onFailure(new InternalError(VungleError.PLACEMENT_NOT_FOUND, b13 == true ? 1 : 0, i2, b12 == true ? 1 : 0));
            return;
        }
        this.placement = placement;
        if (!isValidAdTypeForPlacement(placement)) {
            adLoaderCallback.onFailure(new InternalError(VungleError.TYPE_NOT_MATCH, b11 == true ? 1 : 0, i2, b10 == true ? 1 : 0));
            return;
        }
        String adSizeForAdRequest = getAdSizeForAdRequest();
        if (!isValidAdSize(adSizeForAdRequest)) {
            adLoaderCallback.onFailure(new InternalError(VungleError.INVALID_SIZE, b9 == true ? 1 : 0, i2, b8 == true ? 1 : 0));
            return;
        }
        AdState adState = this.adState;
        boolean z2 = false;
        if (adState != AdState.NEW) {
            switch (WhenMappings.$EnumSwitchMapping$0[adState.ordinal()]) {
                case 1:
                    throw new ko3(0);
                case 2:
                    i = 203;
                    break;
                case 3:
                    i = 204;
                    break;
                case 4:
                    i = 205;
                    break;
                case 5:
                    i = 202;
                    break;
                case 6:
                    i = 206;
                    break;
                default:
                    throw new j11(null);
            }
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            String str8 = this.adState + " state is incorrect for load";
            AdPayload adPayload = this.advertisement;
            if (adPayload != null) {
                str5 = adPayload.getCreativeId();
            } else {
                str5 = null;
            }
            AdPayload adPayload2 = this.advertisement;
            if (adPayload2 != null) {
                str6 = adPayload2.eventId();
            } else {
                str6 = null;
            }
            analyticsClient.logError$vungle_ads_release(i, str8, str, str5, str6);
            adLoaderCallback.onFailure(new InternalError(VungleError.INVALID_AD_STATE, b7 == true ? 1 : 0, i2, b6 == true ? 1 : 0));
            return;
        }
        if (configManager.adLoadOptimizationEnabled()) {
            sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_ADO_DURATION_MS;
        } else {
            sDKMetricType = Sdk.SDKMetric.SDKMetricType.AD_REQUEST_TO_CALLBACK_DURATION_MS;
        }
        TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(sDKMetricType);
        this.requestMetric = timeIntervalMetric;
        timeIntervalMetric.markStart();
        if (str2 != null && str2.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            int i3 = VungleError.AD_MARKUP_INVALID;
            try {
                qf1 qf1Var = json;
                this.bidPayload = (BidPayload) qf1Var.a(pd0.K(qf1Var.f3990b, gi2.b(BidPayload.class)), str2);
            } catch (IllegalArgumentException e) {
                AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
                String p = hx2.p("Unable to decode payload into BidPayload object. Error: ", e.getLocalizedMessage());
                AdPayload adPayload3 = this.advertisement;
                if (adPayload3 != null) {
                    str4 = adPayload3.eventId();
                } else {
                    str4 = null;
                }
                analyticsClient2.logError$vungle_ads_release(213, p, (r13 & 4) != 0 ? null : str, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : str4);
                adLoaderCallback.onFailure(new InternalError(i3, b5 == true ? 1 : 0, i2, b4 == true ? 1 : 0));
                return;
            } catch (Exception e2) {
                AnalyticsClient analyticsClient3 = AnalyticsClient.INSTANCE;
                String p2 = hx2.p("Unable to decode payload into BidPayload object. Error: ", e2.getLocalizedMessage());
                AdPayload adPayload4 = this.advertisement;
                if (adPayload4 != null) {
                    str3 = adPayload4.eventId();
                } else {
                    str3 = null;
                }
                analyticsClient3.logError$vungle_ads_release(209, p2, (r13 & 4) != 0 ? null : str, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : str3);
                adLoaderCallback.onFailure(new InternalError(i3, b3 == true ? 1 : 0, i2, b2 == true ? 1 : 0));
                return;
            }
        }
        setAdState(AdState.LOADING);
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        Context context = this.context;
        kj1 kj1Var = kj1.f2953a;
        ui1 D0 = m20.D0(kj1Var, new AdInternal$loadAd$$inlined$inject$1(context));
        ui1 D02 = m20.D0(kj1Var, new AdInternal$loadAd$$inlined$inject$2(this.context));
        ui1 D03 = m20.D0(kj1Var, new AdInternal$loadAd$$inlined$inject$3(this.context));
        ui1 D04 = m20.D0(kj1Var, new AdInternal$loadAd$$inlined$inject$4(this.context));
        if (str2 == null || str2.length() == 0) {
            z2 = true;
        }
        if (z2) {
            DefaultAdLoader defaultAdLoader = new DefaultAdLoader(this.context, getVungleApiClient(), m46loadAd$lambda3(D02), m45loadAd$lambda2(D0), m48loadAd$lambda5(D04), m47loadAd$lambda4(D03));
            this.baseAdLoader = defaultAdLoader;
            defaultAdLoader.loadAd(new AdRequest(placement, null), adSizeForAdRequest, this);
        } else {
            RealtimeAdLoader realtimeAdLoader = new RealtimeAdLoader(this.context, getVungleApiClient(), m46loadAd$lambda3(D02), m45loadAd$lambda2(D0), m48loadAd$lambda5(D04), m47loadAd$lambda4(D03));
            this.baseAdLoader = realtimeAdLoader;
            realtimeAdLoader.loadAd(new AdRequest(placement, this.bidPayload), adSizeForAdRequest, this);
        }
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onFailure(VungleError vungleError) {
        setAdState(AdState.ERROR);
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onFailure(vungleError);
        }
    }

    @Override // com.vungle.ads.internal.load.AdLoaderCallback
    public void onSuccess(AdPayload adPayload) {
        TimeIntervalMetric timeIntervalMetric;
        this.advertisement = adPayload;
        setAdState(AdState.READY);
        adLoadedAndUpdateConfigure$vungle_ads_release(adPayload);
        AdLoaderCallback adLoaderCallback = this.adLoaderCallback;
        if (adLoaderCallback != null) {
            adLoaderCallback.onSuccess(adPayload);
        }
        TimeIntervalMetric timeIntervalMetric2 = this.requestMetric;
        String str = null;
        if (timeIntervalMetric2 == null) {
            timeIntervalMetric2 = null;
        }
        timeIntervalMetric2.markEnd();
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        TimeIntervalMetric timeIntervalMetric3 = this.requestMetric;
        if (timeIntervalMetric3 == null) {
            timeIntervalMetric = null;
        } else {
            timeIntervalMetric = timeIntervalMetric3;
        }
        Placement placement = this.placement;
        if (placement != null) {
            str = placement.getReferenceId();
        }
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, timeIntervalMetric, str, adPayload.getCreativeId(), adPayload.eventId(), (String) null, 16, (Object) null);
    }

    public final void play(AdPlayCallback adPlayCallback) {
        AdPayload adPayload;
        VungleError canPlayAd = canPlayAd(true);
        if (canPlayAd != null) {
            adPlayCallback.onFailure(canPlayAd);
            if (isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                setAdState(AdState.ERROR);
                return;
            }
            return;
        }
        Placement placement = this.placement;
        if (placement == null || (adPayload = this.advertisement) == null) {
            return;
        }
        AdPlayCallbackWrapper adPlayCallbackWrapper = new AdPlayCallbackWrapper(adPlayCallback) { // from class: com.vungle.ads.internal.AdInternal$play$callbackWrapper$1
            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdEnd(String str) {
                this.setAdState(AdInternal.AdState.FINISHED);
                super.onAdEnd(str);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onAdStart(String str) {
                this.setAdState(AdInternal.AdState.PLAYING);
                super.onAdStart(str);
            }

            @Override // com.vungle.ads.internal.presenter.AdPlayCallbackWrapper, com.vungle.ads.internal.presenter.AdPlayCallback
            public void onFailure(VungleError vungleError) {
                this.setAdState(AdInternal.AdState.ERROR);
                super.onFailure(vungleError);
            }
        };
        cancelDownload$vungle_ads_release();
        renderAd$vungle_ads_release(adPlayCallbackWrapper, placement, adPayload);
    }

    public void renderAd$vungle_ads_release(AdPlayCallback adPlayCallback, Placement placement, AdPayload adPayload) {
        AdActivity.Companion companion = AdActivity.Companion;
        companion.setEventListener(new AdEventListener(adPlayCallback, placement) { // from class: com.vungle.ads.internal.AdInternal$renderAd$1
        });
        companion.setAdvertisement(adPayload);
        companion.setBidPayload(this.bidPayload);
        ActivityManager.Companion.startWhenForeground(this.context, null, companion.createIntent(this.context, placement.getReferenceId(), adPayload.eventId()), null);
    }

    public final void setAdState(AdState adState) {
        AdPayload adPayload;
        String eventId;
        if (adState.isTerminalState() && (adPayload = this.advertisement) != null && (eventId = adPayload.eventId()) != null) {
            ServiceLocator.Companion companion = ServiceLocator.Companion;
            m44_set_adState_$lambda1$lambda0(m20.D0(kj1.f2953a, new AdInternal$_set_adState_$lambda1$$inlined$inject$1(this.context))).execute(CleanupJob.Companion.makeJobInfo(eventId));
        }
        this.adState = this.adState.transitionTo(adState);
    }

    public final void setAdvertisement(AdPayload adPayload) {
        this.advertisement = adPayload;
    }

    public final void setBidPayload(BidPayload bidPayload) {
        this.bidPayload = bidPayload;
    }

    public final void setPlacement(Placement placement) {
        this.placement = placement;
    }
}
