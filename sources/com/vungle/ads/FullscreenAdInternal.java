package com.vungle.ads;

import android.content.Context;
import com.vungle.ads.internal.AdInternal;

/* loaded from: classes2.dex */
public abstract class FullscreenAdInternal extends AdInternal {
    public FullscreenAdInternal(Context context) {
        super(context);
    }

    @Override // com.vungle.ads.internal.AdInternal
    public String getAdSizeForAdRequest() {
        return "unknown";
    }

    @Override // com.vungle.ads.internal.AdInternal
    public boolean isValidAdSize(String str) {
        return true;
    }
}
