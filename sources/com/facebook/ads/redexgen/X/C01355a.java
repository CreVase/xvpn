package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeAdsManager;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C01355a implements NativeAdsManagerApi {
    public static final String A0A = NativeAdsManager.class.getSimpleName();
    public NativeAdsManager.Listener A01;
    public C0898a2 A02;
    public String A03;
    public final int A06;
    public final YA A07;
    public final String A08;
    public final List<NativeAd> A09;
    public int A00 = -1;
    public boolean A04 = false;
    public boolean A05 = false;

    public C01355a(Context context, String str, int i) {
        this.A07 = C5Q.A02(context);
        this.A08 = str;
        this.A06 = Math.max(i, 0);
        this.A09 = new ArrayList(i);
    }

    public final NativeAdsManager.Listener A00() {
        return this.A01;
    }

    public final C0898a2 A01() {
        return this.A02;
    }

    public final void A02() {
        this.A09.clear();
    }

    public final void A03(int i) {
        this.A00 = i;
    }

    public final void A04(NativeAd nativeAd) {
        this.A09.add(nativeAd);
    }

    public final void A05(boolean z) {
        this.A04 = z;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void disableAutoRefresh() {
        this.A05 = true;
        C0898a2 c0898a2 = this.A02;
        if (c0898a2 != null) {
            c0898a2.A06();
        }
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final int getUniqueNativeAdCount() {
        return this.A09.size();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final boolean isLoaded() {
        return this.A04;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds() {
        loadAds(NativeAdBase.MediaCacheFlag.ALL);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        JL jl = JL.A05;
        int i = this.A06;
        C0898a2 c0898a2 = this.A02;
        C0898a2 c0898a22 = new C0898a2(this.A07, this.A08, jl, null, i);
        this.A02 = c0898a22;
        if (this.A05) {
            c0898a22.A06();
        }
        this.A02.A09(this.A03);
        this.A02.A08(new YX(this, this.A07, mediaCacheFlag));
        this.A02.A07();
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final NativeAd nextNativeAd() {
        return nextNativeAd(null);
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final NativeAd nextNativeAd(NativeAdListener nativeAdListener) {
        if (this.A09.size() == 0) {
            return null;
        }
        int i = this.A00;
        this.A00 = i + 1;
        List<NativeAd> list = this.A09;
        int pos = list.size();
        NativeAd nativeAd = list.get(i % pos);
        if (nativeAdListener != null) {
            ((UJ) nativeAd.getInternalNativeAd()).A1R(nativeAd, nativeAdListener);
        }
        int pos2 = this.A09.size();
        if (i >= pos2) {
            return new NativeAd(this.A07, nativeAd);
        }
        return nativeAd;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setExtraHints(String str) {
        this.A03 = str;
    }

    @Override // com.facebook.ads.internal.api.NativeAdsManagerApi
    public final void setListener(NativeAdsManager.Listener listener) {
        this.A01 = listener;
    }
}
