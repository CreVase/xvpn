package com.facebook.ads.redexgen.X;

import android.content.Context;

/* renamed from: com.facebook.ads.redexgen.X.Uc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0747Uc implements InterfaceC0457Is {
    public final Context A00;

    public C0747Uc(Context context) {
        this.A00 = context;
    }

    public final void A01(boolean z, String str, String str2, String str3, long j) {
        ExecutorC0512La.A06.execute(new C0748Ud(this, str, z, str2, str3, j));
    }
}
