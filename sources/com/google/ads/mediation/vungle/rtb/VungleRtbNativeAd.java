package com.google.ads.mediation.vungle.rtb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.ads.mediation.vungle.VungleConstants;
import com.google.ads.mediation.vungle.VungleInitializer;
import com.google.ads.mediation.vungle.VungleMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.vungle.ads.BaseAd;
import com.vungle.ads.NativeAd;
import com.vungle.ads.NativeAdListener;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.ui.view.MediaView;
import defpackage.yn3;
import defpackage.zn3;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class VungleRtbNativeAd extends UnifiedNativeAdMapper implements NativeAdListener {

    /* renamed from: a, reason: collision with root package name */
    public final MediationNativeAdConfiguration f1451a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback f1452b;
    public MediationNativeAdCallback c;
    public NativeAd d;
    public MediaView e;

    public VungleRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f1451a = mediationNativeAdConfiguration;
        this.f1452b = mediationAdLoadCallback;
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdClicked(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdClicked();
            this.c.onAdOpened();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdEnd(BaseAd baseAd) {
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToLoad(BaseAd baseAd, VungleError vungleError) {
        this.f1452b.onFailure(VungleMediationAdapter.getAdError(vungleError));
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdFailedToPlay(BaseAd baseAd, VungleError vungleError) {
        VungleMediationAdapter.getAdError(vungleError).toString();
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdImpression(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.reportAdImpression();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLeftApplication(BaseAd baseAd) {
        MediationNativeAdCallback mediationNativeAdCallback = this.c;
        if (mediationNativeAdCallback != null) {
            mediationNativeAdCallback.onAdLeftApplication();
        }
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdLoaded(BaseAd baseAd) {
        setHeadline(this.d.getAdTitle());
        setBody(this.d.getAdBodyText());
        setCallToAction(this.d.getAdCallToActionText());
        Double adStarRating = this.d.getAdStarRating();
        if (adStarRating != null) {
            setStarRating(adStarRating);
        }
        setAdvertiser(this.d.getAdSponsoredText());
        setMediaView(this.e);
        String appIcon = this.d.getAppIcon();
        if (!TextUtils.isEmpty(appIcon) && appIcon.startsWith(AdPayload.FILE_SCHEME)) {
            setIcon(new zn3(Uri.parse(appIcon)));
        }
        setOverrideImpressionRecording(true);
        setOverrideClickHandling(true);
        this.c = (MediationNativeAdCallback) this.f1452b.onSuccess(this);
    }

    @Override // com.vungle.ads.BaseAdListener
    public void onAdStart(BaseAd baseAd) {
    }

    public void render() {
        int i;
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.f1451a;
        Bundle serverParameters = mediationNativeAdConfiguration.getServerParameters();
        NativeAdOptions nativeAdOptions = mediationNativeAdConfiguration.getNativeAdOptions();
        Context context = mediationNativeAdConfiguration.getContext();
        String string = serverParameters.getString(VungleConstants.KEY_APP_ID);
        boolean isEmpty = TextUtils.isEmpty(string);
        MediationAdLoadCallback mediationAdLoadCallback = this.f1452b;
        if (isEmpty) {
            AdError adError = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or invalid app ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError.toString();
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        String string2 = serverParameters.getString(VungleConstants.KEY_PLACEMENT_ID);
        if (TextUtils.isEmpty(string2)) {
            AdError adError2 = new AdError(101, "Failed to load bidding native ad from Liftoff Monetize. Missing or Invalid placement ID configured for this ad source instance in the AdMob or Ad Manager UI.", VungleMediationAdapter.ERROR_DOMAIN);
            adError2.toString();
            mediationAdLoadCallback.onFailure(adError2);
            return;
        }
        String bidResponse = mediationNativeAdConfiguration.getBidResponse();
        int adChoicesPlacement = nativeAdOptions.getAdChoicesPlacement();
        if (adChoicesPlacement != 0) {
            if (adChoicesPlacement != 2) {
                if (adChoicesPlacement != 3) {
                    i = 1;
                } else {
                    i = 2;
                }
            } else {
                i = 3;
            }
        } else {
            i = 0;
        }
        VungleInitializer.getInstance().initialize(string, context, new yn3(this, context, string2, i, mediationNativeAdConfiguration.getWatermark(), bidResponse));
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        super.trackViews(view, map, map2);
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        NativeAd nativeAd = this.d;
        if (nativeAd != null && nativeAd.canPlayAd().booleanValue()) {
            View childAt = viewGroup.getChildAt(viewGroup.getChildCount() - 1);
            if (!(childAt instanceof FrameLayout)) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            ImageView imageView = null;
            KeyEvent.Callback callback = null;
            for (Map.Entry<String, View> entry : map.entrySet()) {
                arrayList.add(entry.getValue());
                if (entry.getKey().equals("3003")) {
                    callback = (View) entry.getValue();
                }
            }
            if (callback instanceof ImageView) {
                imageView = (ImageView) callback;
            }
            this.d.registerViewForInteraction((FrameLayout) childAt, this.e, imageView, arrayList);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        super.untrackView(view);
        NativeAd nativeAd = this.d;
        if (nativeAd == null) {
            return;
        }
        nativeAd.unregisterView();
    }
}
