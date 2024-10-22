package com.vungle.ads;

import com.vungle.ads.internal.executor.Executors;
import com.vungle.ads.internal.util.ImageLoader;
import defpackage.ji1;
import defpackage.v31;

/* loaded from: classes2.dex */
public final class NativeAd$imageLoader$2 extends ji1 implements v31 {
    final /* synthetic */ NativeAd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NativeAd$imageLoader$2(NativeAd nativeAd) {
        super(0);
        this.this$0 = nativeAd;
    }

    @Override // defpackage.v31
    public final ImageLoader invoke() {
        Executors executors;
        ImageLoader companion = ImageLoader.Companion.getInstance();
        executors = this.this$0.getExecutors();
        companion.init(executors.getIoExecutor());
        return companion;
    }
}
