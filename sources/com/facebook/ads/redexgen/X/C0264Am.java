package com.facebook.ads.redexgen.X;

import java.util.Comparator;
import java.util.TreeSet;

/* renamed from: com.facebook.ads.redexgen.X.Am, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0264Am implements InterfaceC0769Uy, Comparator<H6> {
    public long A00;
    public final long A01;
    public final TreeSet<H6> A02 = new TreeSet<>(this);

    public C0264Am(long j) {
        this.A01 = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Comparator
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final int compare(H6 h6, H6 h62) {
        if (h6.A00 - h62.A00 == 0) {
            return h6.compareTo(h62);
        }
        return h6.A00 < h62.A00 ? -1 : 1;
    }

    private void A01(H2 h2, long j) {
        while (this.A00 + j > this.A01 && !this.A02.isEmpty()) {
            try {
                h2.AEZ(this.A02.first());
            } catch (H0 unused) {
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.H1
    public final void AD0(H2 h2, H6 h6) {
        this.A02.add(h6);
        this.A00 += h6.A01;
        A01(h2, 0L);
    }

    @Override // com.facebook.ads.redexgen.X.H1
    public final void AD1(H2 h2, H6 h6) {
        this.A02.remove(h6);
        this.A00 -= h6.A01;
    }

    @Override // com.facebook.ads.redexgen.X.H1
    public final void AD2(H2 h2, H6 h6, H6 h62) {
        AD1(h2, h6);
        AD0(h2, h62);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0769Uy
    public final void AD3(H2 h2, String str, long j, long j2) {
        A01(h2, j2);
    }
}
