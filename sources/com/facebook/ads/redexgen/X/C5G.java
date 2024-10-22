package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5G */
/* loaded from: assets/audience_network.dex */
public class C5G {
    public static byte[] A04;
    public final Intent A00;
    public final C5J A01;
    public final YA A02;
    public final InterfaceC0444If A03;

    static {
        A0T();
    }

    public static String A0S(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 79);
        }
        return new String(copyOfRange);
    }

    public static void A0T() {
        A04 = new byte[]{51, 54, 13, 54, 51, 38, 51, 13, 48, 39, 60, 54, 62, 55, 31, 20, 29, 21, 18, 25, 24, 61, 24, 56, 29, 8, 29, 62, 9, 18, 24, 16, 25, 85, 90, 79, 82, 77, 94, 122, 95, Byte.MAX_VALUE, 90, 79, 90, 121, 78, 85, 95, 87, 94, 65, 86, 68, 82, 65, 87, 86, 87, 101, 90, 87, 86, 92, 114, 87, 119, 82, 71, 82, 113, 70, 93, 87, 95, 86, 16, 15, 2, 3, 9, 57, 18, 15, 11, 3, 57, 22, 9, 10, 10, 15, 8, 1, 57, 15, 8, 18, 3, 20, 16, 7, 10};
    }

    public C5G(C5J c5j, Intent intent, InterfaceC0444If interfaceC0444If, YA ya) {
        this.A01 = c5j;
        this.A00 = intent;
        this.A03 = interfaceC0444If;
        this.A02 = ya;
    }

    public /* synthetic */ C5G(C5J c5j, Intent intent, InterfaceC0444If interfaceC0444If, YA ya, C5F c5f) {
        this(c5j, intent, interfaceC0444If, ya);
    }

    private F0 A00() {
        return (F0) this.A00.getSerializableExtra(A0S(0, 14, 29));
    }

    public InterfaceC0532Lu A02() {
        if (IP.A2H(this.A02)) {
            return new C7I(this.A02, this.A03, new C6Q(this.A02), new C0865Yt(this.A01, null), A00());
        }
        return new C7H(this.A02, this.A03, new C6Q(this.A02), new C0865Yt(this.A01, null), A00());
    }

    public C0730Tl A0G() {
        C5J c5j = this.A01;
        return new C0730Tl(c5j, this.A02, this.A03, new C0865Yt(c5j, null));
    }

    public TU A0H() {
        return new TU(this.A02, this.A03, new C0865Yt(this.A01, null), A00(), null, new TR());
    }

    public TU A0I() {
        C0361Ey c0361Ey = (C0361Ey) this.A00.getSerializableExtra(A0S(51, 25, 124));
        return new TU(this.A02, this.A03, new EB(this.A01, null), c0361Ey, c0361Ey.A0S(), new TQ());
    }

    public TS A0J(RelativeLayout relativeLayout) {
        TS ts = new TS(this.A02, new C0864Ys(this), this.A03, new C0865Yt(this.A01, null));
        ts.A05(relativeLayout);
        ts.A04(this.A00.getIntExtra(A0S(76, 27, 41), 200));
        LV.A0M(relativeLayout, -16777216);
        return ts;
    }

    public AnonymousClass96 A0K() {
        return new AnonymousClass96(this.A02, this.A03, new C0865Yt(this.A01, null), A00(), new TR(), 1);
    }

    public AnonymousClass96 A0L() {
        return new AnonymousClass96(this.A02, this.A03, new C0865Yt(this.A01, null), (C0361Ey) this.A00.getSerializableExtra(A0S(51, 25, 124)), new TQ(), 0);
    }

    public C0694Sa A0M() {
        C0597Oh A02;
        AbstractC0924aS abstractC0924aS = (AbstractC0924aS) this.A00.getSerializableExtra(A0S(33, 18, 116));
        if (abstractC0924aS == null || (A02 = C0598Oi.A02(abstractC0924aS.A0R())) == null) {
            return null;
        }
        return new C0694Sa(this.A02, new C0865Yt(this.A01, null), A02, abstractC0924aS.A11());
    }

    public SD A0N(EnumC0479Jq enumC0479Jq) {
        MM tq;
        InterfaceC0531Lt eb;
        C0922aQ c0922aQ = (C0922aQ) this.A00.getSerializableExtra(A0S(14, 19, 51));
        if (enumC0479Jq == EnumC0479Jq.A03) {
            tq = new TR();
            eb = new C0865Yt(this.A01, null);
        } else {
            tq = new TQ();
            eb = new EB(this.A01, null);
        }
        return new SD(this.A02, tq, this.A03, c0922aQ, new C6Q(this.A02), eb);
    }

    public C8B A0O() {
        return new C8B(this.A02, new TR(), this.A03, A00(), new C6Q(this.A02), new C0865Yt(this.A01, null));
    }

    public C7K A0P() {
        return new C7K(this.A02, new TR(), this.A03, A00(), new C6Q(this.A02), new C0865Yt(this.A01, null));
    }

    public C7K A0Q() {
        return new C7K(this.A02, new TQ(), this.A03, (C0361Ey) this.A00.getSerializableExtra(A0S(51, 25, 124)), new C6Q(this.A02), new EB(this.A01, null));
    }

    public C7H A0R() {
        return new C7H(this.A02, this.A03, new C6Q(this.A02), new C0865Yt(this.A01, null), (C0361Ey) this.A00.getSerializableExtra(A0S(51, 25, 124)));
    }
}
