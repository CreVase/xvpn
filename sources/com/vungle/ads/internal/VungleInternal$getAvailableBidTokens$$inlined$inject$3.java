package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.bidding.BidTokenEncoder;
import defpackage.ji1;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class VungleInternal$getAvailableBidTokens$$inlined$inject$3 extends ji1 implements v31 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleInternal$getAvailableBidTokens$$inlined$inject$3(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.bidding.BidTokenEncoder, java.lang.Object] */
    @Override // defpackage.v31
    public final BidTokenEncoder invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getOrBuild$vungle_ads_release(BidTokenEncoder.class);
    }
}
