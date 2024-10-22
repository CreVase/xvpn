package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.executor.Executors;
import defpackage.ji1;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class VungleInitializer$init$$inlined$inject$2 extends ji1 implements v31 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleInitializer$init$$inlined$inject$2(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, com.vungle.ads.internal.executor.Executors] */
    @Override // defpackage.v31
    public final Executors invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getOrBuild$vungle_ads_release(Executors.class);
    }
}
