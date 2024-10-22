package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.Ad;

/* loaded from: classes.dex */
public final class ClickEvent implements AdEvent {
    private final Ad ad;
    private final String adID;

    public ClickEvent(String str, Ad ad) {
        this.adID = str;
        this.ad = ad;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    public Ad getAd() {
        return this.ad;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    public String getAdID() {
        return this.adID;
    }
}
