package com.google.ads.mediation.facebook.rtb;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.ExtraHints;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeBannerAd;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdConfiguration;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import defpackage.ja1;
import defpackage.jv0;
import defpackage.kv0;
import defpackage.lv0;
import defpackage.v51;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes.dex */
public class FacebookRtbNativeAd extends UnifiedNativeAdMapper {

    /* renamed from: a, reason: collision with root package name */
    public final MediationNativeAdConfiguration f1438a;

    /* renamed from: b, reason: collision with root package name */
    public final MediationAdLoadCallback f1439b;
    public NativeAdBase c;
    public MediationNativeAdCallback d;
    public MediaView e;

    public FacebookRtbNativeAd(MediationNativeAdConfiguration mediationNativeAdConfiguration, MediationAdLoadCallback<UnifiedNativeAdMapper, MediationNativeAdCallback> mediationAdLoadCallback) {
        this.f1439b = mediationAdLoadCallback;
        this.f1438a = mediationNativeAdConfiguration;
    }

    public void mapNativeAd(Context context, kv0 kv0Var) {
        boolean z;
        NativeAdBase nativeAdBase = this.c;
        boolean z2 = false;
        if (nativeAdBase.getAdHeadline() != null && nativeAdBase.getAdBodyText() != null && nativeAdBase.getAdIcon() != null && nativeAdBase.getAdCallToAction() != null) {
            z = true;
        } else {
            z = false;
        }
        if (!(nativeAdBase instanceof NativeBannerAd)) {
            if (z && nativeAdBase.getAdCoverImage() != null && this.e != null) {
                z2 = true;
            }
            z = z2;
        }
        if (!z) {
            AdError adError = new AdError(108, "Ad from Meta Audience Network doesn't have all required assets.", "com.google.ads.mediation.facebook");
            adError.getMessage();
            ja1 ja1Var = (ja1) kv0Var;
            ja1Var.getClass();
            adError.getMessage();
            ((lv0) ja1Var.f2735b).c.f1439b.onFailure(adError);
            return;
        }
        setHeadline(this.c.getAdHeadline());
        if (this.c.getAdCoverImage() != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new jv0(Uri.parse(this.c.getAdCoverImage().getUrl())));
            setImages(arrayList);
        }
        setBody(this.c.getAdBodyText());
        if (this.c.getPreloadedIconViewDrawable() == null) {
            if (this.c.getAdIcon() == null) {
                setIcon(new jv0());
            } else {
                setIcon(new jv0(Uri.parse(this.c.getAdIcon().getUrl())));
            }
        } else {
            setIcon(new jv0(this.c.getPreloadedIconViewDrawable()));
        }
        setCallToAction(this.c.getAdCallToAction());
        setAdvertiser(this.c.getAdvertiserName());
        this.e.setListener(new v51(this, 21));
        setHasVideoContent(true);
        setMediaView(this.e);
        Bundle bundle = new Bundle();
        bundle.putCharSequence(FacebookMediationAdapter.KEY_ID, this.c.getId());
        bundle.putCharSequence(FacebookMediationAdapter.KEY_SOCIAL_CONTEXT_ASSET, this.c.getAdSocialContext());
        setExtras(bundle);
        setAdChoicesContent(new AdOptionsView(context, this.c, null));
        FacebookRtbNativeAd facebookRtbNativeAd = ((lv0) ((ja1) kv0Var).f2735b).c;
        facebookRtbNativeAd.d = (MediationNativeAdCallback) facebookRtbNativeAd.f1439b.onSuccess(facebookRtbNativeAd);
    }

    public void render() {
        MediationNativeAdConfiguration mediationNativeAdConfiguration = this.f1438a;
        String placementID = FacebookMediationAdapter.getPlacementID(mediationNativeAdConfiguration.getServerParameters());
        boolean isEmpty = TextUtils.isEmpty(placementID);
        MediationAdLoadCallback mediationAdLoadCallback = this.f1439b;
        if (isEmpty) {
            AdError adError = new AdError(101, "Failed to request ad. PlacementID is null or empty.", "com.google.ads.mediation.facebook");
            Log.e(FacebookMediationAdapter.TAG, adError.getMessage());
            mediationAdLoadCallback.onFailure(adError);
            return;
        }
        FacebookMediationAdapter.setMixedAudience(mediationNativeAdConfiguration);
        this.e = new MediaView(mediationNativeAdConfiguration.getContext());
        try {
            this.c = NativeAdBase.fromBidPayload(mediationNativeAdConfiguration.getContext(), placementID, mediationNativeAdConfiguration.getBidResponse());
            if (!TextUtils.isEmpty(mediationNativeAdConfiguration.getWatermark())) {
                this.c.setExtraHints(new ExtraHints.Builder().mediationData(mediationNativeAdConfiguration.getWatermark()).build());
            }
            NativeAdBase nativeAdBase = this.c;
            nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new lv0(this, mediationNativeAdConfiguration.getContext(), this.c)).withBid(mediationNativeAdConfiguration.getBidResponse()).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withPreloadedIconView(-1, -1).build());
        } catch (Exception e) {
            AdError adError2 = new AdError(109, "Failed to create native ad from bid payload: " + e.getMessage(), "com.google.ads.mediation.facebook");
            adError2.getMessage();
            mediationAdLoadCallback.onFailure(adError2);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
        setOverrideClickHandling(true);
        ArrayList arrayList = new ArrayList(map.values());
        View view2 = map.get("3003");
        NativeAdBase nativeAdBase = this.c;
        if (nativeAdBase instanceof NativeBannerAd) {
            if (view2 == null) {
                return;
            }
            if (!(view2 instanceof ImageView)) {
                String.format("Native ad icon asset is rendered with an incompatible class type. Meta Audience Network impression recording might be impacted for this ad. Expected: ImageView, actual: %s.", view2.getClass());
                return;
            } else {
                ((NativeBannerAd) nativeAdBase).registerViewForInteraction(view, (ImageView) view2, arrayList);
                return;
            }
        }
        if (nativeAdBase instanceof NativeAd) {
            NativeAd nativeAd = (NativeAd) nativeAdBase;
            if (view2 instanceof ImageView) {
                nativeAd.registerViewForInteraction(view, this.e, (ImageView) view2, arrayList);
            } else {
                nativeAd.registerViewForInteraction(view, this.e, arrayList);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public void untrackView(View view) {
        NativeAdBase nativeAdBase = this.c;
        if (nativeAdBase != null) {
            nativeAdBase.unregisterView();
        }
        super.untrackView(view);
    }
}
