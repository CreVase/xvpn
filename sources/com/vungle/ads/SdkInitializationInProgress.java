package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class SdkInitializationInProgress extends VungleError {
    public SdkInitializationInProgress() {
        super(Integer.valueOf(VungleError.OPERATION_ONGOING), Sdk.SDKError.Reason.CURRENTLY_INITIALIZING, "Config: Init Ongoing", null, null, null, 56, null);
    }
}
