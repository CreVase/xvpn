package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class UnknownConfigurationError extends VungleError {
    public UnknownConfigurationError() {
        super(0, Sdk.SDKError.Reason.UNKNOWN_ERROR, "Config: Unknown Error", null, null, null, 56, null);
    }
}
