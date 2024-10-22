package com.vungle.ads.internal;

import android.content.Context;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.downloader.Downloader;
import defpackage.ji1;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class AdInternal$loadAd$$inlined$inject$4 extends ji1 implements v31 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdInternal$loadAd$$inlined$inject$4(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.downloader.Downloader, java.lang.Object] */
    @Override // defpackage.v31
    public final Downloader invoke() {
        return ServiceLocator.Companion.getInstance(this.$context).getOrBuild$vungle_ads_release(Downloader.class);
    }
}
