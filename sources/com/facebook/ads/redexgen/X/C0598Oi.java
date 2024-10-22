package com.facebook.ads.redexgen.X;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Oi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0598Oi {
    public static final Map<String, WeakReference<C0597Oh>> A00 = new HashMap();

    public static int A00() {
        return A00.size();
    }

    public static C0597Oh A01(YA ya, AbstractC0924aS abstractC0924aS, int i, InterfaceC0595Of interfaceC0595Of) {
        C0597Oh c0597Oh = new C0597Oh(ya, abstractC0924aS, ya.A01().A09(), i);
        c0597Oh.A0b(interfaceC0595Of);
        c0597Oh.A0X();
        A00.put(abstractC0924aS.A0R(), new WeakReference<>(c0597Oh));
        return c0597Oh;
    }

    public static C0597Oh A02(String str) {
        WeakReference<C0597Oh> weakReference = A00.get(str);
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public static void A03(AbstractC0924aS abstractC0924aS, C0597Oh c0597Oh) {
        A00.put(abstractC0924aS.A0R(), new WeakReference<>(c0597Oh));
    }

    public static void A04(String str) {
        A00.remove(str);
    }
}
