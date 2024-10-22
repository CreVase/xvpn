package com.facebook.ads.redexgen.X;

import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class K2 implements InterfaceC0626Pk {
    public static String[] A0C = {"ua4Z1F3Vn1tdURaP0tTj5Z", "VlqKJtfjGqtNso0qX2A6lmnvOZsZ2xTE", "1pb0xsuTqC4ySw1JjiCpjHk6a0KK", "HW9a8amQa56v9usqS4J3KzzxMBRp7oUY", "lzg290ZQq0ECc78zj7A2Pt", "9JBQniCNh78hbF6UnJo6", "DIRAqcjzgSQz4x9q8OrEXdtc6Zce0V5V", "FPN1H6gS7aT4O5CCkRk249I"};
    public RX A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final MU A07 = new MU() { // from class: com.facebook.ads.redexgen.X.70
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC02028a
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass72 anonymousClass72) {
            Handler handler;
            boolean A0D;
            handler = K2.this.A05;
            handler.removeCallbacksAndMessages(null);
            A0D = K2.this.A0D(Q5.A05);
            if (A0D) {
                K2.this.A03();
                K2.this.A06(true, false);
            }
            K2.this.A03 = true;
        }
    };
    public final AbstractC0591Ob A06 = new AbstractC0591Ob() { // from class: com.facebook.ads.redexgen.X.6z
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC02028a
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass75 anonymousClass75) {
            K2.this.A03();
            K2.this.A06(false, false);
            K2.this.A03 = true;
        }
    };
    public final MI A08 = new C01786y(this);
    public final M9 A09 = new M9() { // from class: com.facebook.ads.redexgen.X.6x
        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.facebook.ads.redexgen.X.AbstractC02028a
        /* renamed from: A00, reason: merged with bridge method [inline-methods] */
        public final void A03(AnonymousClass71 anonymousClass71) {
            boolean z;
            boolean A0D;
            z = K2.this.A02;
            if (z) {
                return;
            }
            A0D = K2.this.A0D(Q5.A05);
            if (!A0D) {
                return;
            }
            K2.this.A03();
            K2.this.A06(true, false);
        }
    };
    public final L1 A0A = new C01766w(this);
    public final Handler A05 = new Handler();
    public final List<Q6> A0B = new ArrayList();
    public int A00 = 2000;

    public K2(boolean z) {
        this.A02 = z;
    }

    public static /* synthetic */ int A00(K2 k2) {
        return k2.A00;
    }

    public static /* synthetic */ Handler A01(K2 k2) {
        return k2.A05;
    }

    public void A03() {
        this.A05.removeCallbacksAndMessages(null);
        Iterator<Q6> it = this.A0B.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "SzC94btdcN1119JNHgRanzsWdfoutew0";
            if (hasNext) {
                it.next().cancel();
            } else {
                return;
            }
        }
    }

    public static /* synthetic */ void A04(K2 k2) {
        k2.A03();
    }

    public static /* synthetic */ void A05(K2 k2, boolean z, boolean z2) {
        k2.A06(z, z2);
    }

    public void A06(boolean z, boolean z2) {
        for (Q6 q6 : this.A0B) {
            if (A0C[2].length() != 28) {
                throw new RuntimeException();
            }
            A0C[1] = "qWrr7wKcnD6M25Nm7U3j0NNRElcnIA4d";
            q6.A3U(z, z2);
        }
    }

    public static /* synthetic */ boolean A07(K2 k2) {
        return k2.A03;
    }

    public static /* synthetic */ boolean A08(K2 k2) {
        return k2.A02;
    }

    public static /* synthetic */ boolean A09(K2 k2) {
        return k2.A04;
    }

    public static /* synthetic */ boolean A0A(K2 k2, Q5 q5) {
        return k2.A0D(q5);
    }

    public static /* synthetic */ boolean A0B(K2 k2, boolean z) {
        k2.A03 = z;
        return z;
    }

    public static /* synthetic */ boolean A0C(K2 k2, boolean z) {
        k2.A04 = z;
        return z;
    }

    public boolean A0D(Q5 q5) {
        Iterator<Q6> it = this.A0B.iterator();
        while (it.hasNext()) {
            if (it.next().A7u() != q5) {
                return false;
            }
        }
        return true;
    }

    public final void A0E() {
        this.A0B.clear();
    }

    public final void A0F() {
        if (this.A02) {
            this.A05.removeCallbacksAndMessages(null);
            this.A02 = false;
        }
    }

    public final void A0G() {
        this.A04 = true;
        this.A03 = true;
        A06(false, false);
    }

    public final void A0H(int i) {
        this.A00 = i;
    }

    public final void A0I(Q6 q6) {
        this.A0B.add(q6);
    }

    public final boolean A0J() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0626Pk
    public final void A9D(RX rx) {
        this.A01 = rx;
        rx.getEventBus().A03(this.A07, this.A0A, this.A08, this.A09, this.A06);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0626Pk
    public final void AG0(RX rx) {
        A03();
        rx.getEventBus().A04(this.A06, this.A0A, this.A08, this.A09, this.A07);
        this.A01 = null;
    }
}
