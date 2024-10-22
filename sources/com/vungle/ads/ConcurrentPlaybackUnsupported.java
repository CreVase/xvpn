package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes2.dex */
public final class ConcurrentPlaybackUnsupported extends VungleError {
    public ConcurrentPlaybackUnsupported() {
        super(400, Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED, "Concurrent playback not supported", null, null, null, 56, null);
    }
}
