package com.facebook.ads.redexgen.X;

import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public final class K0 {
    public static final Set<Object> A00 = Collections.newSetFromMap(new WeakHashMap());
    public static final AtomicBoolean A01 = new AtomicBoolean(true);
    public static final AtomicReference<InterfaceC0486Jy> A02 = new AtomicReference<>();

    public static void A00(Throwable th, Object obj) throws Throwable {
        if (A01.get()) {
            A00.add(obj);
            KF.A00().A9E(3306, th);
            InterfaceC0486Jy contextRepairHelper = A02.get();
            if (contextRepairHelper != null) {
                contextRepairHelper.AEc(th, obj);
                return;
            }
            return;
        }
        throw th;
    }

    public static void A01(boolean z, InterfaceC0486Jy interfaceC0486Jy) {
        A01.set(z);
        A02.set(interfaceC0486Jy);
    }

    public static boolean A02(Object obj) {
        return A00.contains(obj);
    }
}
