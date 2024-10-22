package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.7Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final /* synthetic */ class C7Q {
    public static /* synthetic */ boolean A00(AtomicReference atomicReference, Object obj, Object obj2) {
        while (!atomicReference.compareAndSet(obj, obj2)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }
}
