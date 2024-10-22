package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.omsdk.OMTracker;
import defpackage.ji1;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class BannerView$special$$inlined$inject$2 extends ji1 implements v31 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BannerView$special$$inlined$inject$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.omsdk.OMTracker$Factory, java.lang.Object] */
    @Override // defpackage.v31
    public final OMTracker.Factory invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getOrBuild$vungle_ads_release(OMTracker.Factory.class);
    }
}
