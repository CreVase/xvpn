package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ny */
/* loaded from: assets/audience_network.dex */
public class C0588Ny {
    public boolean A00;
    public View A03;
    public UJ A04;
    public AbstractC0530Ls A05;
    public C0466Jb A06;
    public final View A07;
    public final AbstractC0924aS A08;
    public final YA A09;
    public final InterfaceC0444If A0A;
    public final LN A0B;
    public final InterfaceC0531Lt A0C;
    public final C0643Qb A0D;
    public int A02 = 0;
    public int A01 = 1;

    public C0588Ny(YA ya, InterfaceC0444If interfaceC0444If, InterfaceC0531Lt interfaceC0531Lt, AbstractC0924aS abstractC0924aS, View view, C0643Qb c0643Qb, LN ln) {
        this.A09 = ya;
        this.A0A = interfaceC0444If;
        this.A0C = interfaceC0531Lt;
        this.A08 = abstractC0924aS;
        this.A07 = view;
        this.A0D = c0643Qb;
        this.A0B = ln;
    }

    public final C0588Ny A0D(int i) {
        this.A01 = i;
        return this;
    }

    public final C0588Ny A0E(int i) {
        this.A02 = i;
        return this;
    }

    public final C0588Ny A0F(View view) {
        this.A03 = view;
        return this;
    }

    public final C0588Ny A0G(UJ uj) {
        this.A04 = uj;
        return this;
    }

    public final C0588Ny A0H(AbstractC0530Ls abstractC0530Ls) {
        this.A05 = abstractC0530Ls;
        return this;
    }

    public final C0588Ny A0I(C0466Jb c0466Jb) {
        this.A06 = c0466Jb;
        return this;
    }

    public final C0588Ny A0J(boolean z) {
        this.A00 = z;
        return this;
    }

    public final C0589Nz A0K() {
        return new C0589Nz(this);
    }
}
