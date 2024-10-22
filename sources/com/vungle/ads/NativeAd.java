package com.vungle.ads;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.NativeAd;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.ImpressionTracker;
import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.presenter.AdEventListener;
import com.vungle.ads.internal.presenter.NativeAdPresenter;
import com.vungle.ads.internal.presenter.NativePresenterDelegate;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.WatermarkView;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.internal.util.ImageLoader;
import defpackage.k43;
import defpackage.kj1;
import defpackage.m20;
import defpackage.ng0;
import defpackage.ui1;
import defpackage.ut0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class NativeAd extends BaseAd {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final Companion Companion = new Companion(null);
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;
    private MediaView adContentView;
    private ImageView adIconView;
    private int adOptionsPosition;
    private NativeAdOptionsView adOptionsView;
    private final NativeAd$adPlayCallback$1 adPlayCallback;
    private FrameLayout adRootView;
    private Collection<? extends View> clickableViews;
    private final ui1 executors$delegate;
    private final ui1 imageLoader$delegate;
    private final ui1 impressionTracker$delegate;
    private Map<String, String> nativeAdAssetMap;
    private NativeAdPresenter presenter;

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: classes2.dex */
    public @interface AdOptionsPosition {
    }

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    private NativeAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
        this.imageLoader$delegate = new k43(new NativeAd$imageLoader$2(this));
        ServiceLocator.Companion companion = ServiceLocator.Companion;
        this.executors$delegate = m20.D0(kj1.f2953a, new NativeAd$special$$inlined$inject$1(context));
        this.impressionTracker$delegate = new k43(new NativeAd$impressionTracker$2(context));
        this.adOptionsPosition = 1;
        this.presenter = new NativeAdPresenter(context, (NativePresenterDelegate) getAdInternal(), getExecutors().getJobExecutor());
        this.adOptionsView = new NativeAdOptionsView(context);
        this.adPlayCallback = new NativeAd$adPlayCallback$1(this, str);
    }

    private final void displayImage(String str, ImageView imageView) {
        getImageLoader().displayImage(str, new NativeAd$displayImage$1(imageView));
    }

    public static /* synthetic */ void e(NativeAd nativeAd, View view) {
        m35registerViewForInteraction$lambda4(nativeAd, view);
    }

    @AdOptionsPosition
    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }

    public final Executors getExecutors() {
        return (Executors) this.executors$delegate.getValue();
    }

    private final ImageLoader getImageLoader() {
        return (ImageLoader) this.imageLoader$delegate.getValue();
    }

    private final ImpressionTracker getImpressionTracker() {
        return (ImpressionTracker) this.impressionTracker$delegate.getValue();
    }

    private final String getMainImagePath() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_MAIN_IMAGE)) == null) {
            return "";
        }
        return str;
    }

    /* renamed from: registerViewForInteraction$lambda-1 */
    public static final void m33registerViewForInteraction$lambda1(NativeAd nativeAd, View view) {
        nativeAd.presenter.processCommand("openPrivacy", nativeAd.getPrivacyUrl$vungle_ads_release());
    }

    /* renamed from: registerViewForInteraction$lambda-3$lambda-2 */
    public static final void m34registerViewForInteraction$lambda3$lambda2(NativeAd nativeAd, View view) {
        nativeAd.presenter.processCommand(NativeAdPresenter.DOWNLOAD, nativeAd.getCtaUrl$vungle_ads_release());
    }

    /* renamed from: registerViewForInteraction$lambda-4 */
    public static final void m35registerViewForInteraction$lambda4(NativeAd nativeAd, View view) {
        NativeAdPresenter.processCommand$default(nativeAd.presenter, "videoViewed", null, 2, null);
        nativeAd.presenter.processCommand("tpat", Constants.CHECKPOINT_0);
    }

    public final String getAdBodyText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_DESCRIPTION)) == null) {
            return "";
        }
        return str;
    }

    public final String getAdCallToActionText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_CTA_BUTTON_TEXT)) == null) {
            return "";
        }
        return str;
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    public final String getAdSponsoredText() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_SPONSORED_BY)) == null) {
            return "";
        }
        return str;
    }

    public final Double getAdStarRating() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_RATING_VALUE)) == null) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Double.valueOf(str);
        } catch (Exception unused) {
            return null;
        }
    }

    public final String getAdTitle() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_NAME)) == null) {
            return "";
        }
        return str;
    }

    public final String getAppIcon() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_APP_ICON)) == null) {
            return "";
        }
        return str;
    }

    public final String getCtaUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_CTA_BUTTON_URL)) == null) {
            return "";
        }
        return str;
    }

    public final String getPrivacyIconUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_VUNGLE_PRIVACY_ICON_URL)) == null) {
            return "";
        }
        return str;
    }

    public final String getPrivacyUrl$vungle_ads_release() {
        String str;
        Map<String, String> map = this.nativeAdAssetMap;
        if (map == null || (str = map.get(NativeAdInternal.TOKEN_VUNGLE_PRIVACY_URL)) == null) {
            return "";
        }
        return str;
    }

    public final boolean hasCallToAction() {
        if (getCtaUrl$vungle_ads_release().length() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.vungle.ads.BaseAd
    public void onAdLoaded$vungle_ads_release(AdPayload adPayload) {
        super.onAdLoaded$vungle_ads_release(adPayload);
        this.nativeAdAssetMap = adPayload.getMRAIDArgsInMap();
    }

    public final void registerViewForInteraction(FrameLayout frameLayout, MediaView mediaView, ImageView imageView, Collection<? extends View> collection) {
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        analyticsClient.logMetric$vungle_ads_release(new SingleValueMetric(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), (r13 & 2) != 0 ? null : getPlacementId(), (r13 & 4) != 0 ? null : getCreativeId(), (r13 & 8) != 0 ? null : getEventId(), (r13 & 16) != 0 ? null : null);
        final int i = 1;
        VungleError canPlayAd = getAdInternal().canPlayAd(true);
        if (canPlayAd != null) {
            if (getAdInternal().isErrorTerminal$vungle_ads_release(canPlayAd.getCode())) {
                getAdInternal().setAdState(AdInternal.AdState.ERROR);
                Map<String, String> map = this.nativeAdAssetMap;
                if (map != null) {
                    map.clear();
                }
            }
            BaseAdListener adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, canPlayAd);
                return;
            }
            return;
        }
        getResponseToShowMetric$vungle_ads_release().markEnd();
        disableExpirationTimer$vungle_ads_release();
        AnalyticsClient.logMetric$vungle_ads_release$default(analyticsClient, getResponseToShowMetric$vungle_ads_release(), getPlacementId(), getCreativeId(), getEventId(), (String) null, 16, (Object) null);
        getShowToDisplayMetric$vungle_ads_release().markStart();
        this.adRootView = frameLayout;
        this.adContentView = mediaView;
        this.adIconView = imageView;
        this.clickableViews = collection;
        this.presenter.setEventListener(new AdEventListener(this.adPlayCallback, getAdInternal().getPlacement()));
        final int i2 = 0;
        this.adOptionsView.setOnClickListener(new View.OnClickListener(this) { // from class: ty1

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ NativeAd f4596b;

            {
                this.f4596b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                NativeAd nativeAd = this.f4596b;
                switch (i3) {
                    case 0:
                        NativeAd.m33registerViewForInteraction$lambda1(nativeAd, view);
                        return;
                    default:
                        NativeAd.m34registerViewForInteraction$lambda3$lambda2(nativeAd, view);
                        return;
                }
            }
        });
        if (collection == null) {
            collection = Collections.singletonList(mediaView);
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: ty1

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NativeAd f4596b;

                {
                    this.f4596b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    int i3 = i;
                    NativeAd nativeAd = this.f4596b;
                    switch (i3) {
                        case 0:
                            NativeAd.m33registerViewForInteraction$lambda1(nativeAd, view);
                            return;
                        default:
                            NativeAd.m34registerViewForInteraction$lambda3$lambda2(nativeAd, view);
                            return;
                    }
                }
            });
        }
        this.adOptionsView.renderTo(frameLayout, this.adOptionsPosition);
        getImpressionTracker().addView(frameLayout, new ut0(this, 15));
        displayImage(getMainImagePath(), mediaView.getMainImage$vungle_ads_release());
        displayImage(getAppIcon(), imageView);
        displayImage(getPrivacyIconUrl$vungle_ads_release(), this.adOptionsView.getPrivacyIcon$vungle_ads_release());
        String watermark$vungle_ads_release = getAdConfig().getWatermark$vungle_ads_release();
        if (watermark$vungle_ads_release != null) {
            WatermarkView watermarkView = new WatermarkView(frameLayout.getContext(), watermark$vungle_ads_release);
            frameLayout.addView(watermarkView);
            watermarkView.bringToFront();
        }
        this.presenter.prepare();
    }

    public final void setAdOptionsPosition(int i) {
        this.adOptionsPosition = i;
    }

    public final void unregisterView() {
        if (getAdInternal().getAdState() == AdInternal.AdState.FINISHED) {
            return;
        }
        Collection<? extends View> collection = this.clickableViews;
        if (collection != null) {
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        Map<String, String> map = this.nativeAdAssetMap;
        if (map != null) {
            map.clear();
        }
        getImpressionTracker().destroy();
        MediaView mediaView = this.adContentView;
        if (mediaView != null) {
            mediaView.destroy();
        }
        this.adOptionsView.destroy();
        this.presenter.detach();
    }

    @Override // com.vungle.ads.BaseAd
    public NativeAdInternal constructAdInternal$vungle_ads_release(Context context) {
        return new NativeAdInternal(context);
    }

    public NativeAd(Context context, String str) {
        this(context, str, new AdConfig());
        if (context instanceof Application) {
            throw new InternalError(-1000, "Activity context is required to create NativeAd instance.");
        }
    }
}
