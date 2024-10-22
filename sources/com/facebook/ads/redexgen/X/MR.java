package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;

/* loaded from: assets/audience_network.dex */
public abstract class MR extends FrameLayout {
    public int A00;
    public C2I A01;
    public C2J A02;
    public C2K A03;
    public final C2G A04;
    public final YA A05;
    public final InterfaceC0444If A06;
    public final InterfaceC0531Lt A07;
    public final InterfaceC0532Lu A08;
    public final String A09;
    public final C1X A0A;
    public final MT A0B;

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(C2K c2k, C2I c2i);

    public abstract void A0O(C2K c2k, C2I c2i);

    public abstract boolean A0P();

    public MR(YA ya, InterfaceC0444If interfaceC0444If, String str) {
        this(ya, interfaceC0444If, str, null, null, null);
    }

    public MR(YA ya, InterfaceC0444If interfaceC0444If, String str, C1X c1x, InterfaceC0532Lu interfaceC0532Lu, InterfaceC0531Lt interfaceC0531Lt) {
        super(ya);
        this.A00 = 0;
        this.A01 = C2I.A04;
        this.A03 = null;
        this.A0B = new TP(this);
        this.A05 = ya;
        this.A06 = interfaceC0444If;
        this.A08 = interfaceC0532Lu;
        this.A07 = interfaceC0531Lt;
        this.A09 = str;
        this.A0A = c1x;
        this.A04 = C2H.A00(ya.A01());
    }

    public static /* synthetic */ int A00(MR mr) {
        int i = mr.A00;
        mr.A00 = i + 1;
        return i;
    }

    public static /* synthetic */ int A01(MR mr) {
        int i = mr.A00;
        mr.A00 = i - 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A02.A0A()) {
            this.A06.A9F(this.A09, this.A02.A02());
            this.A02.A03();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0C() {
        this.A03 = null;
        this.A02.A05();
        A0L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D(C2K c2k) {
        this.A02.A08(this.A01);
        A0N(c2k, this.A01);
        C00290v.A01(this.A05).A0L();
        if (A0P()) {
            A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(C2K c2k) {
        this.A03 = c2k;
        this.A02.A09(this.A01, this.A00);
        A0O(c2k, this.A01);
    }

    public final void A0J() {
        A0B();
    }

    public final void A0K() {
        this.A02 = new C2J(new C0452In(this.A09, this.A06));
        InterfaceC0532Lu interfaceC0532Lu = this.A08;
        if (interfaceC0532Lu != null) {
            interfaceC0532Lu.ACJ(true);
        }
        A0C();
    }
}
