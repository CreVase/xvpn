package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: com.facebook.ads.redexgen.X.Ut, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0764Ut implements HL {
    @Override // com.facebook.ads.redexgen.X.HL
    public final C0763Us A4Z(Looper looper, Handler.Callback callback) {
        return new C0763Us(new Handler(looper, callback));
    }

    @Override // com.facebook.ads.redexgen.X.HL
    public final long A5O() {
        return SystemClock.elapsedRealtime();
    }

    @Override // com.facebook.ads.redexgen.X.HL
    public final long AG7() {
        return SystemClock.uptimeMillis();
    }
}
