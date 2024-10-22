package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class SdkNotInitialized extends VungleError {
    public SdkNotInitialized() {
        super(Integer.valueOf(VungleError.CONFIGURATION_ERROR), Sdk.SDKError.Reason.SDK_NOT_INITIALIZED, "Config: SDK response is null", null, null, null, 56, null);
    }
}
