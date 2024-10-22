package defpackage;

import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.impl.m8;

/* loaded from: classes.dex */
public final /* synthetic */ class hw3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2496a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RewardedCallback f2497b;
    public final /* synthetic */ Rewarded c;

    public /* synthetic */ hw3(RewardedCallback rewardedCallback, Rewarded rewarded, int i) {
        this.f2496a = i;
        this.f2497b = rewardedCallback;
        this.c = rewarded;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.f2496a;
        Rewarded rewarded = this.c;
        RewardedCallback rewardedCallback = this.f2497b;
        switch (i) {
            case 0:
                m8.b(rewardedCallback, rewarded);
                return;
            case 1:
                m8.c(rewardedCallback, rewarded);
                return;
            default:
                m8.a(rewardedCallback, rewarded);
                return;
        }
    }
}
