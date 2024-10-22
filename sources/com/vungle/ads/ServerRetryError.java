package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class ServerRetryError extends VungleError {
    public ServerRetryError() {
        super(Integer.valueOf(VungleError.SERVER_RETRY_ERROR), Sdk.SDKError.Reason.API_REQUEST_ERROR, "Config: Server Retry Error", null, null, null, 56, null);
    }
}
