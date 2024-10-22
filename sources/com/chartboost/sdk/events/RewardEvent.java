package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.Ad;

/* loaded from: classes.dex */
public final class RewardEvent implements AdEvent {
    private final Ad ad;
    private final String adID;
    private final int reward;

    public RewardEvent(String str, Ad ad, int i) {
        this.adID = str;
        this.ad = ad;
        this.reward = i;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    public Ad getAd() {
        return this.ad;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    public String getAdID() {
        return this.adID;
    }

    public final int getReward() {
        return this.reward;
    }
}
