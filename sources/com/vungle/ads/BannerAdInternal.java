package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.presenter.AdPlayCallback;
import com.vungle.ads.internal.presenter.AdPlayCallbackWrapper;
import defpackage.m20;

/* loaded from: classes2.dex */
public final class BannerAdInternal extends AdInternal {
    private final BannerAdSize adSize;

    public BannerAdInternal(Context context, BannerAdSize bannerAdSize) {
        super(context);
        this.adSize = bannerAdSize;
    }

    @Override // com.vungle.ads.internal.AdInternal
    public void adLoadedAndUpdateConfigure$vungle_ads_release(AdPayload adPayload) {
        super.adLoadedAndUpdateConfigure$vungle_ads_release(adPayload);
        adPayload.setAdSize(this.adSize);
    }

    @Override // com.vungle.ads.internal.AdInternal
    public String getAdSizeForAdRequest() {
        return this.adSize.getSizeName();
    }

    public final boolean isBannerAdSize$vungle_ads_release(String str) {
        if (!m20.L(str, BannerAdSize.BANNER.getSizeName()) && !m20.L(str, BannerAdSize.BANNER_LEADERBOARD.getSizeName()) && !m20.L(str, BannerAdSize.BANNER_SHORT.getSizeName()) && !m20.L(str, BannerAdSize.VUNGLE_MREC.getSizeName())) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0022, code lost:            if (defpackage.m20.L(r10, com.vungle.ads.BannerAdSize.VUNGLE_MREC.getSizeName()) == false) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0043, code lost:            r0 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0041, code lost:            if (defpackage.m20.L(r10, com.vungle.ads.BannerAdSize.VUNGLE_MREC.getSizeName()) != false) goto L24;     */
    @Override // com.vungle.ads.internal.AdInternal
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean isValidAdSize(java.lang.String r10) {
        /*
            r9 = this;
            boolean r0 = r9.isBannerAdSize$vungle_ads_release(r10)
            r1 = 1
            if (r0 == 0) goto L25
            com.vungle.ads.internal.model.Placement r2 = r9.getPlacement()
            if (r2 == 0) goto L15
            boolean r2 = r2.isMREC()
            if (r2 != r1) goto L15
            r2 = 1
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 == 0) goto L25
            com.vungle.ads.BannerAdSize r2 = com.vungle.ads.BannerAdSize.VUNGLE_MREC
            java.lang.String r2 = r2.getSizeName()
            boolean r2 = defpackage.m20.L(r10, r2)
            if (r2 != 0) goto L25
            goto L43
        L25:
            if (r0 == 0) goto L44
            com.vungle.ads.internal.model.Placement r2 = r9.getPlacement()
            if (r2 == 0) goto L34
            boolean r2 = r2.isBannerNonMREC()
            if (r2 != r1) goto L34
            goto L35
        L34:
            r1 = 0
        L35:
            if (r1 == 0) goto L44
            com.vungle.ads.BannerAdSize r1 = com.vungle.ads.BannerAdSize.VUNGLE_MREC
            java.lang.String r1 = r1.getSizeName()
            boolean r1 = defpackage.m20.L(r10, r1)
            if (r1 == 0) goto L44
        L43:
            r0 = 0
        L44:
            if (r0 != 0) goto L72
            com.vungle.ads.AnalyticsClient r1 = com.vungle.ads.AnalyticsClient.INSTANCE
            r2 = 500(0x1f4, float:7.0E-43)
            java.lang.String r3 = "Invalidate size "
            java.lang.String r4 = " for banner ad"
            java.lang.String r3 = defpackage.hx2.q(r3, r10, r4)
            com.vungle.ads.internal.model.Placement r10 = r9.getPlacement()
            r4 = 0
            if (r10 == 0) goto L5e
            java.lang.String r10 = r10.getReferenceId()
            goto L5f
        L5e:
            r10 = r4
        L5f:
            r5 = 0
            com.vungle.ads.internal.model.AdPayload r6 = r9.getAdvertisement()
            if (r6 == 0) goto L6a
            java.lang.String r4 = r6.eventId()
        L6a:
            r6 = r4
            r7 = 8
            r8 = 0
            r4 = r10
            com.vungle.ads.AnalyticsClient.logError$vungle_ads_release$default(r1, r2, r3, r4, r5, r6, r7, r8)
        L72:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vungle.ads.BannerAdInternal.isValidAdSize(java.lang.String):boolean");
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdTypeForPlacement(Placement placement) {
        return placement.isBanner();
    }

    public final AdPlayCallbackWrapper wrapCallback$vungle_ads_release(final AdPlayCallback adPlayCallback) {
        return new AdPlayCallbackWrapper(adPlayCallback) { // from class: com.vungle.ads.BannerAdInternal$wrapCallback$1
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
    }
}
