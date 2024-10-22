package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.9q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02439q {
    public int A00;
    public int A01;
    public Handler A03;
    public Object A04;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final InterfaceC02419o A0A;
    public final InterfaceC02429p A0B;
    public final AbstractC02519z A0C;
    public long A02 = -9223372036854775807L;
    public boolean A05 = true;

    public C02439q(InterfaceC02419o interfaceC02419o, InterfaceC02429p interfaceC02429p, AbstractC02519z abstractC02519z, int i, Handler handler) {
        this.A0A = interfaceC02419o;
        this.A0B = interfaceC02429p;
        this.A0C = abstractC02519z;
        this.A03 = handler;
        this.A01 = i;
    }

    public final int A00() {
        return this.A00;
    }

    public final int A01() {
        return this.A01;
    }

    public final long A02() {
        return this.A02;
    }

    public final Handler A03() {
        return this.A03;
    }

    public final InterfaceC02429p A04() {
        return this.A0B;
    }

    public final C02439q A05() {
        HI.A04(!this.A09);
        if (this.A02 == -9223372036854775807L) {
            HI.A03(this.A05);
        }
        this.A09 = true;
        this.A0A.AF4(this);
        return this;
    }

    public final C02439q A06(int i) {
        HI.A04(!this.A09);
        this.A00 = i;
        return this;
    }

    public final C02439q A07(Object obj) {
        HI.A04(!this.A09);
        this.A04 = obj;
        return this;
    }

    public final AbstractC02519z A08() {
        return this.A0C;
    }

    public final Object A09() {
        return this.A04;
    }

    public final synchronized void A0A(boolean z) {
        this.A07 |= z;
        this.A08 = true;
        notifyAll();
    }

    public final boolean A0B() {
        return this.A05;
    }

    public final synchronized boolean A0C() throws InterruptedException {
        HI.A04(this.A09);
        HI.A04(this.A03.getLooper().getThread() != Thread.currentThread());
        while (!this.A08) {
            wait();
        }
        return this.A07;
    }

    public final synchronized boolean A0D() {
        return this.A06;
    }
}
