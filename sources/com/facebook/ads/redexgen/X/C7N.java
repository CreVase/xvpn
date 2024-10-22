package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.7N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C7N extends AbstractC0577Nn {
    public final /* synthetic */ C7K A00;

    public C7N(C7K c7k) {
        this.A00 = c7k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC02028a
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(OK ok) {
        new Handler(Looper.getMainLooper()).post(new P4(this));
    }
}
