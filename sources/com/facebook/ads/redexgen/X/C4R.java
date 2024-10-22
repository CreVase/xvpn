package com.facebook.ads.redexgen.X;

import android.database.Observable;

/* renamed from: com.facebook.ads.redexgen.X.4R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C4R extends Observable<C4S> {
    public final void A00() {
        for (int size = this.mObservers.size() - 1; size >= 0; size--) {
            ((C4S) this.mObservers.get(size)).A00();
        }
    }
}
