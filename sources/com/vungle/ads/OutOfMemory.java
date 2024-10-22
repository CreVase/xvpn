package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class OutOfMemory extends VungleError {
    public OutOfMemory() {
        super(3001, Sdk.SDKError.Reason.OUT_OF_MEMORY, "Config: Out of Memory", null, null, null, 56, null);
    }
}
