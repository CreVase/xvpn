package com.vungle.ads.internal.load;

import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InternalError;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.network.Call;
import com.vungle.ads.internal.network.Callback;
import com.vungle.ads.internal.network.Response;
import defpackage.cq0;

/* loaded from: classes2.dex */
public final class DefaultAdLoader$fetchAdMetadata$1 implements Callback<AdPayload> {
    final /* synthetic */ Placement $placement;
    final /* synthetic */ DefaultAdLoader this$0;

    public DefaultAdLoader$fetchAdMetadata$1(DefaultAdLoader defaultAdLoader, Placement placement) {
        this.this$0 = defaultAdLoader;
        this.$placement = placement;
    }

    public static /* synthetic */ void a(Response response, Placement placement, DefaultAdLoader defaultAdLoader) {
        m73onResponse$lambda0(response, placement, defaultAdLoader);
    }

    public static /* synthetic */ void b(DefaultAdLoader defaultAdLoader, Throwable th, Placement placement) {
        m72onFailure$lambda1(defaultAdLoader, th, placement);
    }

    /* renamed from: onFailure$lambda-1 */
    public static final void m72onFailure$lambda1(DefaultAdLoader defaultAdLoader, Throwable th, Placement placement) {
        VungleError retrofitToVungleError;
        String str;
        String str2;
        String str3;
        retrofitToVungleError = defaultAdLoader.retrofitToVungleError(th);
        defaultAdLoader.onAdLoadFailed(retrofitToVungleError);
        int code = retrofitToVungleError.getCode();
        String str4 = null;
        if (code != 10020) {
            if (code != 10047) {
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                String referenceId = placement.getReferenceId();
                AdPayload advertisement = defaultAdLoader.getAdvertisement();
                if (advertisement != null) {
                    str3 = advertisement.getCreativeId();
                } else {
                    str3 = null;
                }
                AdPayload advertisement2 = defaultAdLoader.getAdvertisement();
                if (advertisement2 != null) {
                    str4 = advertisement2.eventId();
                }
                analyticsClient.logError$vungle_ads_release(103, "Unable to decode ads response.", referenceId, str3, str4);
                return;
            }
            AnalyticsClient analyticsClient2 = AnalyticsClient.INSTANCE;
            String referenceId2 = placement.getReferenceId();
            AdPayload advertisement3 = defaultAdLoader.getAdvertisement();
            if (advertisement3 != null) {
                str2 = advertisement3.getCreativeId();
            } else {
                str2 = null;
            }
            AdPayload advertisement4 = defaultAdLoader.getAdvertisement();
            if (advertisement4 != null) {
                str4 = advertisement4.eventId();
            }
            analyticsClient2.logError$vungle_ads_release(217, "Timeout for ads call.", referenceId2, str2, str4);
            return;
        }
        AnalyticsClient analyticsClient3 = AnalyticsClient.INSTANCE;
        String referenceId3 = placement.getReferenceId();
        AdPayload advertisement5 = defaultAdLoader.getAdvertisement();
        if (advertisement5 != null) {
            str = advertisement5.getCreativeId();
        } else {
            str = null;
        }
        AdPayload advertisement6 = defaultAdLoader.getAdvertisement();
        if (advertisement6 != null) {
            str4 = advertisement6.eventId();
        }
        analyticsClient3.logError$vungle_ads_release(101, "Ads request error.", referenceId3, str, str4);
    }

    /* renamed from: onResponse$lambda-0 */
    public static final void m73onResponse$lambda0(Response response, Placement placement, DefaultAdLoader defaultAdLoader) {
        AdPayload adPayload;
        AdPayload.AdUnit adUnit;
        Integer num;
        boolean z = false;
        if (response != null && !response.isSuccessful()) {
            z = true;
        }
        if (z) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(104, "Failed to get a successful response from the API call", (r13 & 4) != 0 ? null : placement.getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            defaultAdLoader.onAdLoadFailed(new InternalError(VungleError.NO_SERVE, null, 2, null));
            return;
        }
        if (response != null) {
            adPayload = (AdPayload) response.body();
        } else {
            adPayload = null;
        }
        if (adPayload != null) {
            adUnit = adPayload.adUnit();
        } else {
            adUnit = null;
        }
        if (adUnit == null) {
            AnalyticsClient.INSTANCE.logError$vungle_ads_release(215, "Ad markup is empty.", (r13 & 4) != 0 ? null : placement.getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            defaultAdLoader.onAdLoadFailed(new InternalError(VungleError.NO_SERVE, null, 2, null));
            return;
        }
        try {
            defaultAdLoader.handleAdMetaData(adPayload);
        } catch (IllegalArgumentException unused) {
            AdPayload.AdUnit adUnit2 = adPayload.adUnit();
            if (adUnit2 != null) {
                num = adUnit2.getSleep();
            } else {
                num = null;
            }
            if (num != null) {
                AdPayload.AdUnit adUnit3 = adPayload.adUnit();
                if (adUnit3 != null) {
                    adUnit3.getSleep();
                }
                AnalyticsClient.INSTANCE.logError$vungle_ads_release(212, "Placement is sleep", (r13 & 4) != 0 ? null : placement.getReferenceId(), (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
            }
            defaultAdLoader.onAdLoadFailed(new InternalError(VungleError.NO_SERVE, null, 2, null));
        }
    }

    @Override // com.vungle.ads.internal.network.Callback
    public void onFailure(Call<AdPayload> call, Throwable th) {
        this.this$0.getSdkExecutors().getBackgroundExecutor().execute(new cq0(23, this.this$0, th, this.$placement));
    }

    @Override // com.vungle.ads.internal.network.Callback
    public void onResponse(Call<AdPayload> call, Response<AdPayload> response) {
        this.this$0.getSdkExecutors().getBackgroundExecutor().execute(new cq0(22, response, this.$placement, this.this$0));
    }
}
