package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.ng0;

/* loaded from: classes2.dex */
public final class MraidJsError extends VungleError {
    public MraidJsError() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ MraidJsError(String str, int i, ng0 ng0Var) {
        this((i & 1) != 0 ? null : str);
    }

    public MraidJsError(String str) {
        super(130, Sdk.SDKError.Reason.MRAID_DOWNLOAD_JS_ERROR, str, null, null, null, 56, null);
    }
}
