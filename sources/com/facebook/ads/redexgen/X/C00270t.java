package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* renamed from: com.facebook.ads.redexgen.X.0t, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00270t {
    public static InterfaceC00220o A00;

    public final InterfaceC00220o A00(YA ya, AdPlacementType adPlacementType) {
        InterfaceC00220o interfaceC00220o = A00;
        if (interfaceC00220o != null) {
            return interfaceC00220o;
        }
        switch (C00260s.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C0942ak();
            case 2:
                return new C0941aj();
            case 3:
                return new C0939ah(ya);
            case 4:
                return new FD(ya);
            case 5:
                return new FA();
            default:
                return null;
        }
    }
}
