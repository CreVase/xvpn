package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.9R, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C9R implements Comparable<C9R> {
    public int A00;
    public long A01;
    public Object A02;
    public final C02439q A03;

    public C9R(C02439q c02439q) {
        this.A03 = c02439q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C9R c9r) {
        Object obj = this.A02;
        if ((obj == null) != (c9r.A02 == null)) {
            return obj != null ? -1 : 1;
        }
        if (obj == null) {
            return 0;
        }
        int i = this.A00 - c9r.A00;
        if (i != 0) {
            return i;
        }
        int comparePeriodIndex = C0436Hx.A07(this.A01, c9r.A01);
        return comparePeriodIndex;
    }

    public final void A01(int i, long j, Object obj) {
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }
}
