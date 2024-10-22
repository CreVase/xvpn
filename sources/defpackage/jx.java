package defpackage;

import com.chartboost.sdk.events.RewardEvent;
import com.google.android.gms.ads.rewarded.RewardItem;

/* loaded from: classes.dex */
public final class jx implements RewardItem {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RewardEvent f2844a;

    public jx(RewardEvent rewardEvent) {
        this.f2844a = rewardEvent;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        return this.f2844a.getReward();
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        return "";
    }
}
