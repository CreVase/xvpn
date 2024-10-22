package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Wk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0804Wk extends C1 {
    public static byte[] A03;
    public final long A00;
    public final List<C0804Wk> A01;
    public final List<C0803Wj> A02;

    static {
        A05();
    }

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 42);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{12, 79, 67, 66, 88, 77, 69, 66, 73, 94, 95, 22, 12, 79, 3, 10, 14, 25, 10, 28, 85, 79};
    }

    public C0804Wk(int i, long j) {
        super(i);
        this.A00 = j;
        this.A02 = new ArrayList();
        this.A01 = new ArrayList();
    }

    public final C0804Wk A06(int i) {
        int size = this.A01.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0804Wk c0804Wk = this.A01.get(i2);
            int childrenSize = ((C1) c0804Wk).A00;
            if (childrenSize == i) {
                return c0804Wk;
            }
        }
        return null;
    }

    public final C0803Wj A07(int i) {
        int size = this.A02.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0803Wj c0803Wj = this.A02.get(i2);
            int childrenSize = ((C1) c0803Wj).A00;
            if (childrenSize == i) {
                return c0803Wj;
            }
        }
        return null;
    }

    public final void A08(C0804Wk c0804Wk) {
        this.A01.add(c0804Wk);
    }

    public final void A09(C0803Wj c0803Wj) {
        this.A02.add(c0803Wj);
    }

    @Override // com.facebook.ads.redexgen.X.C1
    public final String toString() {
        return C1.A02(super.A00) + A04(13, 9, 69) + Arrays.toString(this.A02.toArray()) + A04(0, 13, 6) + Arrays.toString(this.A01.toArray());
    }
}
