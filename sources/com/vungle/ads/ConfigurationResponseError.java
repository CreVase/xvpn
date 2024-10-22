package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class ConfigurationResponseError extends VungleError {
    public ConfigurationResponseError() {
        super(Integer.valueOf(VungleError.CONFIGURATION_ERROR), Sdk.SDKError.Reason.INVALID_CONFIG_RESPONSE, "Config: Configuration failed due to bad response.", null, null, null, 56, null);
    }
}
