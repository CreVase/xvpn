package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class ConfigurationError extends VungleError {
    public ConfigurationError() {
        super(Integer.valueOf(VungleError.CONFIGURATION_ERROR), Sdk.SDKError.Reason.API_REQUEST_ERROR, "Config: Configuration Error", null, null, null, 56, null);
    }
}
