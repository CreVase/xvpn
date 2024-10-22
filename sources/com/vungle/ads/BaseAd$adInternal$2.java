package com.vungle.ads;

import com.vungle.ads.internal.AdInternal;
import defpackage.ji1;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class BaseAd$adInternal$2 extends ji1 implements v31 {
    final /* synthetic */ BaseAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAd$adInternal$2(BaseAd baseAd) {
        super(0);
        this.this$0 = baseAd;
    }

    @Override // defpackage.v31
    public final AdInternal invoke() {
        BaseAd baseAd = this.this$0;
        return baseAd.constructAdInternal$vungle_ads_release(baseAd.getContext());
    }
}
