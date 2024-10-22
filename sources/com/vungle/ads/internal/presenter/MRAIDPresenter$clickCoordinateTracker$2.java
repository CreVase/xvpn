package com.vungle.ads.internal.presenter;

import android.content.Context;
import com.vungle.ads.internal.ClickCoordinateTracker;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.ui.view.MRAIDAdWidget;
import defpackage.ji1;
import defpackage.v31;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public final class MRAIDPresenter$clickCoordinateTracker$2 extends ji1 implements v31 {
    final /* synthetic */ MRAIDPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MRAIDPresenter$clickCoordinateTracker$2(MRAIDPresenter mRAIDPresenter) {
        super(0);
        this.this$0 = mRAIDPresenter;
    }

    @Override // defpackage.v31
    public final ClickCoordinateTracker invoke() {
        MRAIDAdWidget mRAIDAdWidget;
        AdPayload adPayload;
        Executor executor;
        mRAIDAdWidget = this.this$0.adWidget;
        Context context = mRAIDAdWidget.getContext();
        adPayload = this.this$0.advertisement;
        executor = this.this$0.executor;
        return new ClickCoordinateTracker(context, adPayload, executor);
    }
}
