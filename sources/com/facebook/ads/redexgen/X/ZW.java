package com.facebook.ads.redexgen.X;

import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* loaded from: assets/audience_network.dex */
public class ZW<K, V> extends AbstractC00722m<K, V> {
    public final /* synthetic */ ZV A00;

    public ZW(ZV zv) {
        this.A00 = zv;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00722m
    public final int A04() {
        return ((C00752p) this.A00).A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00722m
    public final int A05(Object obj) {
        return this.A00.A08(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00722m
    public final int A06(Object obj) {
        return this.A00.A07(obj);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00722m
    public final Map<K, V> A07() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00722m
    public final Object A0B(int i, int i2) {
        return this.A00.A02[(i << 1) + i2];
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00722m
    public final V A0C(int i, V value) {
        return this.A00.A0C(i, value);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00722m
    public final void A0D() {
        this.A00.clear();
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00722m
    public final void A0E(int i) {
        this.A00.A0A(i);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00722m
    public final void A0F(K key, V value) {
        this.A00.put(key, value);
    }
}
