package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.Kf, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0493Kf {
    public static AdError A00(JG jg) {
        if (jg.A03().isPublicError()) {
            return new AdError(jg.A03().getErrorCode(), jg.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
