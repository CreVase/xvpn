package com.facebook.ads.redexgen.X;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* loaded from: assets/audience_network.dex */
public abstract class BI implements InterfaceC0773Vc {
    public static String[] A06 = {"KcRMvDVLZNgc0ooVkhN4ahdKcengok4t", "7pRgSHJJ", "GNHbGuKbKosn0JAz4xkib8iBcGb5WNz5", "hJNyShuwv1tZ2cTKHVoLW9isLSOVhBhj", "H7WHQ", "6cZmXLfi2DPGYj7ZmxIdQ5A", "b2Hmg2LD", "cSsJl4a3bVOvbO76ENMD9MAL1lcw3B"};
    public long A00;
    public long A01;
    public AnonymousClass38 A02;
    public final ArrayDeque<AnonymousClass38> A03 = new ArrayDeque<>();
    public final ArrayDeque<BN> A04;
    public final PriorityQueue<AnonymousClass38> A05;

    public abstract VZ A0N();

    public abstract void A0P(BO bo);

    public abstract boolean A0R();

    public BI() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new AnonymousClass38());
        }
        this.A04 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.A04.add(new AnonymousClass37(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(AnonymousClass38 anonymousClass38) {
        anonymousClass38.A07();
        this.A03.add(anonymousClass38);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0271At
    /* renamed from: A0L, reason: merged with bridge method [inline-methods] */
    public BO A50() throws FX {
        HI.A04(this.A02 == null);
        boolean isEmpty = this.A03.isEmpty();
        if (A06[4].length() != 5) {
            throw new RuntimeException();
        }
        A06[4] = "MSCQz";
        if (isEmpty) {
            return null;
        }
        AnonymousClass38 pollFirst = this.A03.pollFirst();
        this.A02 = pollFirst;
        return pollFirst;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0271At
    /* renamed from: A0M, reason: merged with bridge method [inline-methods] */
    public BN A51() throws FX {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((XE) this.A05.peek()).A00 <= this.A00) {
            AnonymousClass38 poll = this.A05.poll();
            if (poll.A04()) {
                BN pollFirst = this.A04.pollFirst();
                pollFirst.A00(4);
                A0K(poll);
                String[] strArr = A06;
                if (strArr[1].length() != strArr[6].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A06;
                strArr2[2] = "Z7l20gfPvvtRCAhrDUNIN8ivECfXDju3";
                strArr2[3] = "MHWMj6Fd4O5yELPFkyyjrniha9DdnabU";
                return pollFirst;
            }
            A0P(poll);
            if (A0R()) {
                VZ A0N = A0N();
                if (!poll.A03()) {
                    BN pollFirst2 = this.A04.pollFirst();
                    pollFirst2.A09(((XE) poll).A00, A0N, Long.MAX_VALUE);
                    A0K(poll);
                    return pollFirst2;
                }
            }
            A0K(poll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0271At
    /* renamed from: A0O, reason: merged with bridge method [inline-methods] */
    public void AE8(BO bo) throws FX {
        HI.A03(bo == this.A02);
        if (A06[0].charAt(9) != 'N') {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[7] = "h6rCbn8hi0Qg5CvGAi8vHFDPjl0uqV";
        strArr[5] = "6Me2Lvii1P8K0tFjrCRJacm";
        if (bo.A03()) {
            A0K(this.A02);
        } else {
            AnonymousClass38 anonymousClass38 = this.A02;
            long j = this.A01;
            this.A01 = 1 + j;
            anonymousClass38.A00 = j;
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(BN bn) {
        bn.A07();
        this.A04.add(bn);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0271At
    public void AEO() {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0773Vc
    public void AFQ(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0271At
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        AnonymousClass38 anonymousClass38 = this.A02;
        if (anonymousClass38 != null) {
            A0K(anonymousClass38);
            this.A02 = null;
        }
    }
}
