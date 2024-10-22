package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.BidPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.NativePresenterDelegate;
import defpackage.ng0;
import java.util.List;

/* loaded from: classes2.dex */
public final class NativeAdInternal extends AdInternal implements NativePresenterDelegate {
    public static final Companion Companion = new Companion(null);
    public static final String TOKEN_APP_DESCRIPTION = "APP_DESCRIPTION";
    public static final String TOKEN_APP_ICON = "APP_ICON";
    public static final String TOKEN_APP_NAME = "APP_NAME";
    public static final String TOKEN_APP_RATING_VALUE = "APP_RATING_VALUE";
    public static final String TOKEN_CTA_BUTTON_TEXT = "CTA_BUTTON_TEXT";
    public static final String TOKEN_CTA_BUTTON_URL = "CTA_BUTTON_URL";
    public static final String TOKEN_MAIN_IMAGE = "MAIN_IMAGE";
    public static final String TOKEN_SPONSORED_BY = "SPONSORED_BY";
    public static final String TOKEN_VUNGLE_PRIVACY_ICON_URL = "VUNGLE_PRIVACY_ICON_URL";
    public static final String TOKEN_VUNGLE_PRIVACY_URL = "VUNGLE_PRIVACY_URL";

    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(ng0 ng0Var) {
            this();
        }
    }

    public NativeAdInternal(Context context) {
        super(context);
    }

    @Override // com.vungle.ads.internal.AdInternal
    public String getAdSizeForAdRequest() {
        return "unknown";
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    public String getCreativeId() {
        AdPayload advertisement = getAdvertisement();
        if (advertisement != null) {
            return advertisement.getCreativeId();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    public String getDeepLinkUrl() {
        AdPayload.AdUnit adUnit;
        AdPayload advertisement = getAdvertisement();
        if (advertisement != null && (adUnit = advertisement.adUnit()) != null) {
            return adUnit.getDeeplinkUrl();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    public String getEventId() {
        AdPayload advertisement = getAdvertisement();
        if (advertisement != null) {
            return advertisement.eventId();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    public List<String> getImpressionUrls() {
        BidPayload bidPayload = getBidPayload();
        if (bidPayload != null) {
            return bidPayload.getImpression();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    public String getPlacementRefId() {
        Placement placement = getPlacement();
        if (placement != null) {
            return placement.getReferenceId();
        }
        return null;
    }

    @Override // com.vungle.ads.internal.presenter.NativePresenterDelegate
    public List<String> getTpatUrls(String str, String str2) {
        AdPayload advertisement = getAdvertisement();
        if (advertisement != null) {
            return advertisement.getTpatUrls(str, str2);
        }
        return null;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(String str) {
        return true;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        return placement.isNative();
    }
}
