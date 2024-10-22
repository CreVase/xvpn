package com.facebook.ads.redexgen.X;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.Jv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractRunnableC0483Jv implements Runnable {
    public static final AtomicReference<Throwable> A00 = new AtomicReference<>();

    public abstract void A01();

    public static Throwable A00() {
        return A00.get();
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            A01();
        } catch (Throwable th) {
            A00.set(th);
            throw th;
        }
    }
}
