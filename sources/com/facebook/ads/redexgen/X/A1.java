package com.facebook.ads.redexgen.X;

import java.util.ArrayList;

/* loaded from: assets/audience_network.dex */
public final class A1 {
    public static String[] A06 = {"rmgpPCWB7BYHQ3azE8yCiRChgWLX4K1O", "ESYL8WQp59BjyyK9DI9xkUBJ1yOk4QLd", "YweXfGig2PVNilG2mJZlv3ovQAOkP8UY", "CAftEyLXQvcAYYqOnK17yfwScyM6Y9GQ", "5ZUx", "CHSAxwc6W9B6bhcUywJKjVUar2kzl0Sb", "G9dVYOs473", "8VVZpCzafohaQpJb3SOOvVZNRfYg5osa"};
    public A2 A01;
    public A2 A02;
    public boolean A03;
    public final ArrayList<A2> A05 = new ArrayList<>();
    public final C02499x A04 = new C02499x();
    public AbstractC02519z A00 = AbstractC02519z.A01;

    private A2 A00(A2 a2, AbstractC02519z abstractC02519z) {
        if (abstractC02519z.A0E() || this.A00.A0E()) {
            return a2;
        }
        AbstractC02519z abstractC02519z2 = this.A00;
        int i = a2.A01.A02;
        if (A06[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A06[3] = "6Z7kXvoTE0GMRlV8X7ahHWF28Ir1JA8U";
        Object uid = abstractC02519z2.A0A(i, this.A04, true).A03;
        int newPeriodIndex = abstractC02519z.A04(uid);
        if (newPeriodIndex == -1) {
            return a2;
        }
        int newWindowIndex = abstractC02519z.A09(newPeriodIndex, this.A04).A00;
        return new A2(newWindowIndex, a2.A01.A00(newPeriodIndex));
    }

    private void A02() {
        if (!this.A05.isEmpty()) {
            this.A01 = this.A05.get(0);
        }
    }

    public final A2 A03() {
        return this.A01;
    }

    public final A2 A04() {
        if (this.A05.isEmpty()) {
            return null;
        }
        ArrayList<A2> arrayList = this.A05;
        int size = arrayList.size() - 1;
        if (A06[3].charAt(28) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[6] = "IuVtQJyFuB";
        strArr[7] = "VEjGs0KHAo6Qkjlg0Fq6YAYYmbb9RMII";
        return arrayList.get(size);
    }

    public final A2 A05() {
        if (this.A05.isEmpty() || this.A00.A0E() || this.A03) {
            return null;
        }
        return this.A05.get(0);
    }

    public final A2 A06() {
        return this.A02;
    }

    public final EW A07(int i) {
        EW ew = null;
        AbstractC02519z abstractC02519z = this.A00;
        if (abstractC02519z != null) {
            int A00 = abstractC02519z.A00();
            for (int periodIndex = 0; periodIndex < this.A05.size(); periodIndex++) {
                A2 mediaPeriod = this.A05.get(periodIndex);
                EW match = mediaPeriod.A01;
                int i2 = match.A02;
                if (i2 < A00 && this.A00.A09(i2, this.A04).A00 == i) {
                    if (ew != null) {
                        return null;
                    }
                    ew = mediaPeriod.A01;
                }
            }
        }
        return ew;
    }

    public final void A08() {
        this.A03 = false;
        A02();
    }

    public final void A09() {
        this.A03 = true;
    }

    public final void A0A(int i) {
        A02();
    }

    public final void A0B(int i, EW ew) {
        this.A05.add(new A2(i, ew));
        if (this.A05.size() == 1 && !this.A00.A0E()) {
            A02();
        }
    }

    public final void A0C(int i, EW ew) {
        A2 mediaPeriod;
        A2 a2 = new A2(i, ew);
        this.A05.remove(a2);
        A2 mediaPeriod2 = this.A02;
        if (a2.equals(mediaPeriod2)) {
            if (this.A05.isEmpty()) {
                mediaPeriod = null;
            } else {
                A2 mediaPeriod3 = this.A05.get(0);
                mediaPeriod = mediaPeriod3;
            }
            this.A02 = mediaPeriod;
        }
    }

    public final void A0D(int i, EW ew) {
        this.A02 = new A2(i, ew);
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0007 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0E(com.facebook.ads.redexgen.X.AbstractC02519z r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            java.util.ArrayList<com.facebook.ads.redexgen.X.A2> r0 = r3.A05
            int r0 = r0.size()
            if (r2 >= r0) goto L1b
            java.util.ArrayList<com.facebook.ads.redexgen.X.A2> r1 = r3.A05
            java.lang.Object r0 = r1.get(r2)
            com.facebook.ads.redexgen.X.A2 r0 = (com.facebook.ads.redexgen.X.A2) r0
            com.facebook.ads.redexgen.X.A2 r0 = r3.A00(r0, r4)
            r1.set(r2, r0)
            int r2 = r2 + 1
            goto L1
        L1b:
            com.facebook.ads.redexgen.X.A2 r0 = r3.A02
            if (r0 == 0) goto L25
            com.facebook.ads.redexgen.X.A2 r0 = r3.A00(r0, r4)
            r3.A02 = r0
        L25:
            r3.A00 = r4
            r3.A02()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.A1.A0E(com.facebook.ads.redexgen.X.9z):void");
    }

    public final boolean A0F() {
        return this.A03;
    }
}
