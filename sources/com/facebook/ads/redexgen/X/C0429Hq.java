package com.facebook.ads.redexgen.X;

import java.util.Comparator;

/* renamed from: com.facebook.ads.redexgen.X.Hq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0429Hq implements Comparator<C0430Hr> {
    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(C0430Hr c0430Hr, C0430Hr c0430Hr2) {
        if (c0430Hr.A00 < c0430Hr2.A00) {
            return -1;
        }
        return c0430Hr2.A00 < c0430Hr.A00 ? 1 : 0;
    }
}
