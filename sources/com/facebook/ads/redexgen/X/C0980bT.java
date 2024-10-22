package com.facebook.ads.redexgen.X;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.facebook.ads.redexgen.X.bT, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0980bT {
    public final Map<String, C0993bg> A00;
    public final Set<C0993bg> A01;

    public C0980bT() {
        this.A00 = new HashMap();
        this.A01 = new HashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C0993bg> A00() {
        return this.A01;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Collection<C0993bg> A01() {
        return this.A00.values();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        this.A00.clear();
        for (C0993bg c0993bg : this.A01) {
            this.A00.put(c0993bg.A04, c0993bg);
        }
        this.A01.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A06(C0993bg c0993bg) {
        if (this.A01.add(c0993bg)) {
            this.A00.remove(c0993bg.A04);
            return true;
        }
        return false;
    }
}
