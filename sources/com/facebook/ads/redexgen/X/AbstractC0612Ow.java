package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.ads.redexgen.X.Ow, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0612Ow extends RelativeLayout {
    public boolean A00;
    public final int A01;
    public final AbstractC0642Qa A02;
    public final boolean A03;
    public final boolean A04;
    public final AbstractC0924aS A05;
    public final YA A06;
    public final InterfaceC0444If A07;
    public final LN A08;
    public final InterfaceC0531Lt A09;
    public final MM A0A;
    public final C0643Qb A0B;

    public abstract void A0K();

    public abstract void A0L();

    public abstract void A0M();

    public abstract void A0N(boolean z);

    public abstract void A0O(boolean z);

    public abstract boolean A0P();

    public abstract boolean A0Q();

    public abstract C0615Oz getFullScreenAdStyle();

    public AbstractC0612Ow(YA ya, MM mm, InterfaceC0444If interfaceC0444If, AbstractC0924aS abstractC0924aS, int i, boolean z, boolean z2, InterfaceC0531Lt interfaceC0531Lt) {
        super(ya);
        this.A08 = new LN();
        this.A00 = false;
        ST st = new ST(this);
        this.A02 = st;
        this.A01 = i;
        this.A06 = ya;
        this.A04 = z;
        this.A03 = z2;
        this.A09 = interfaceC0531Lt;
        this.A0A = mm;
        this.A05 = abstractC0924aS;
        this.A07 = interfaceC0444If;
        C0643Qb c0643Qb = new C0643Qb(this, 1, new WeakReference(st), ya);
        this.A0B = c0643Qb;
        c0643Qb.A0W(abstractC0924aS.A0C());
        c0643Qb.A0X(abstractC0924aS.A0D());
    }

    public final void A03() {
        if (!this.A00) {
            this.A0B.A0U();
            this.A00 = true;
        }
    }

    public AbstractC0924aS getAdDataBundle() {
        return this.A05;
    }

    public C0643Qb getAdViewabilityChecker() {
        return this.A0B;
    }

    public LN getTouchDataRecorder() {
        return this.A08;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }
}
