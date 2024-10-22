package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.ch3;
import defpackage.ji1;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class BaseAd$onAdLoaded$1 extends ji1 implements v31 {
    final /* synthetic */ BaseAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAd$onAdLoaded$1(BaseAd baseAd) {
        super(0);
        this.this$0 = baseAd;
    }

    @Override // defpackage.v31
    public /* bridge */ /* synthetic */ Object invoke() {
        m25invoke();
        return ch3.f636a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m25invoke() {
        AnalyticsClient.INSTANCE.logMetric$vungle_ads_release(new OneShotTimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.AD_EXPIRED_BEFORE_PLAY), (r13 & 2) != 0 ? null : this.this$0.getPlacementId(), (r13 & 4) != 0 ? null : this.this$0.getCreativeId(), (r13 & 8) != 0 ? null : this.this$0.getEventId(), (r13 & 16) != 0 ? null : null);
    }
}
