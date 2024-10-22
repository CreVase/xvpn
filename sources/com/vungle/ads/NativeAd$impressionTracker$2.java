package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.ImpressionTracker;
import defpackage.ji1;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class NativeAd$impressionTracker$2 extends ji1 implements v31 {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAd$impressionTracker$2(Context context) {
        super(0);
        this.$context = context;
    }

    @Override // defpackage.v31
    public final ImpressionTracker invoke() {
        return new ImpressionTracker(this.$context);
    }
}
