package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ts, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0737Ts<T> extends K8 {
    public final WeakReference<T> A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ts != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public AbstractC0737Ts(T reference) {
        this.A00 = new WeakReference<>(reference);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.Ts != com.facebook.ads.internal.util.common.WeakRunnable<T> */
    public final T A07() {
        return this.A00.get();
    }
}
