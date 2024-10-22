package com.vungle.ads.internal.load;

import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.AdPayload;

/* loaded from: classes2.dex */
public interface AdLoaderCallback {
    void onFailure(VungleError vungleError);

    void onSuccess(AdPayload adPayload);
}
