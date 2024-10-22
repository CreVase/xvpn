package com.vungle.ads.internal.presenter;

import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.InternalError;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.util.SuspendableTimer;
import defpackage.ch3;
import defpackage.ji1;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class MRAIDPresenter$suspendableTimer$2 extends ji1 implements v31 {
    final /* synthetic */ MRAIDPresenter this$0;

    /* renamed from: com.vungle.ads.internal.presenter.MRAIDPresenter$suspendableTimer$2$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    public static final class AnonymousClass1 extends ji1 implements v31 {
        final /* synthetic */ MRAIDPresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(MRAIDPresenter mRAIDPresenter) {
            super(0);
            this.this$0 = mRAIDPresenter;
        }

        @Override // defpackage.v31
        public /* bridge */ /* synthetic */ Object invoke() {
            m87invoke();
            return ch3.f636a;
        }

        /* renamed from: invoke, reason: collision with other method in class */
        public final void m87invoke() {
            Placement placement;
            AdPayload adPayload;
            AdPayload adPayload2;
            AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
            placement = this.this$0.placement;
            String referenceId = placement.getReferenceId();
            adPayload = this.this$0.advertisement;
            String creativeId = adPayload.getCreativeId();
            adPayload2 = this.this$0.advertisement;
            analyticsClient.logError$vungle_ads_release(318, "Error ad template missing Heartbeat", referenceId, creativeId, adPayload2.eventId());
            this.this$0.reportErrorAndCloseAd(new InternalError(VungleError.HEARTBEAT_ERROR, null, 2, null));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRAIDPresenter$suspendableTimer$2(MRAIDPresenter mRAIDPresenter) {
        super(0);
        this.this$0 = mRAIDPresenter;
    }

    @Override // defpackage.v31
    public final SuspendableTimer invoke() {
        return new SuspendableTimer(6.0d, true, null, new AnonymousClass1(this.this$0), 4, null);
    }
}
