package com.vungle.ads.internal.load;

import com.vungle.ads.MraidJsError;
import defpackage.ch3;
import defpackage.ji1;
import defpackage.x31;

/* loaded from: classes2.dex */
public final class BaseAdLoader$loadAd$1$1 extends ji1 implements x31 {
    final /* synthetic */ AdLoaderCallback $adLoaderCallback;
    final /* synthetic */ BaseAdLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAdLoader$loadAd$1$1(BaseAdLoader baseAdLoader, AdLoaderCallback adLoaderCallback) {
        super(1);
        this.this$0 = baseAdLoader;
        this.$adLoaderCallback = adLoaderCallback;
    }

    @Override // defpackage.x31
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke(((Number) obj).intValue());
        return ch3.f636a;
    }

    public final void invoke(int i) {
        if (i == 10) {
            this.this$0.requestAd();
        } else {
            this.$adLoaderCallback.onFailure(new MraidJsError(null, 1, null));
        }
    }
}
