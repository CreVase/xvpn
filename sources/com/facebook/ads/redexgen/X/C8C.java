package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.8C, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C8C extends AbstractC0577Nn {
    public final /* synthetic */ SM A00;

    public C8C(SM sm) {
        this.A00 = sm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(OK ok) {
        new Handler(Looper.getMainLooper()).post(new RunnableC0614Oy(this));
    }
}
