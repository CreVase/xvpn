package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.omsdk.OMInjector;
import defpackage.ji1;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class VungleInitializer$configure$$inlined$inject$4 extends ji1 implements v31 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleInitializer$configure$$inlined$inject$4(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.vungle.ads.internal.omsdk.OMInjector] */
    @Override // defpackage.v31
    public final OMInjector invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getOrBuild$vungle_ads_release(OMInjector.class);
    }
}
