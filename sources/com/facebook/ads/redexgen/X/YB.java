package com.facebook.ads.redexgen.X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: assets/audience_network.dex */
public final class YB implements C6U {
    public final Map<String, Set<String>> A00 = new HashMap();

    @Override // com.facebook.ads.redexgen.X.C6U
    public final synchronized void A4E(String str) {
        this.A00.remove(str);
    }

    @Override // com.facebook.ads.redexgen.X.C6U
    public final boolean A8m(String str, String str2) {
        Set<String> loadedAds = this.A00.get(str2);
        return loadedAds != null && loadedAds.contains(str);
    }

    @Override // com.facebook.ads.redexgen.X.C6U
    public final synchronized void AF6(String str, String str2) {
        Set<String> set = this.A00.get(str2);
        if (set == null) {
            set = new HashSet<>();
            this.A00.put(str2, set);
        }
        set.add(str);
    }
}
