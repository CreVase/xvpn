package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class AdExpiredOnPlayError extends VungleError {
    public AdExpiredOnPlayError() {
        super(304, Sdk.SDKError.Reason.AD_EXPIRED_ON_PLAY, "Ad expired upon playback request", null, null, null, 56, null);
    }
}
