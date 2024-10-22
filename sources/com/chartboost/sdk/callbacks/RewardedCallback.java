package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.events.RewardEvent;

/* loaded from: classes.dex */
public interface RewardedCallback extends DismissibleAdCallback {
    void onRewardEarned(RewardEvent rewardEvent);
}
