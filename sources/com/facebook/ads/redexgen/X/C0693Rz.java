package com.facebook.ads.redexgen.X;

import android.util.SparseBooleanArray;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Rz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0693Rz extends C4Q<C0685Rr> {
    public int A00;
    public int A01;
    public int A02;
    public AbstractC0530Ls A03;
    public InterfaceC0531Lt A04;
    public String A05;
    public List<PC> A06;
    public final SparseBooleanArray A07 = new SparseBooleanArray();
    public final AbstractC0924aS A08;
    public final C6Q A09;
    public final YA A0A;
    public final InterfaceC0444If A0B;
    public final LN A0C;
    public final S0 A0D;
    public final C0466Jb A0E;
    public final C0643Qb A0F;

    public C0693Rz(YA ya, List<PC> list, AbstractC0924aS abstractC0924aS, InterfaceC0444If interfaceC0444If, C6Q c6q, C0643Qb c0643Qb, LN ln, InterfaceC0531Lt interfaceC0531Lt, String str, S0 s0, C0466Jb c0466Jb, AbstractC0530Ls abstractC0530Ls) {
        this.A0A = ya;
        this.A0B = interfaceC0444If;
        this.A09 = c6q;
        this.A0F = c0643Qb;
        this.A0C = ln;
        this.A04 = interfaceC0531Lt;
        this.A08 = abstractC0924aS;
        this.A06 = list;
        this.A05 = str;
        this.A0D = s0;
        this.A0E = c0466Jb;
        this.A03 = abstractC0530Ls;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A01, reason: merged with bridge method [inline-methods] */
    public final C0685Rr A0C(ViewGroup viewGroup, int i) {
        InterfaceC0531Lt interfaceC0531Lt = this.A04;
        if (interfaceC0531Lt == null || this.A00 == 0) {
            return null;
        }
        return new C0685Rr(NX.A01(new C0588Ny(this.A0A, this.A0B, interfaceC0531Lt, this.A08, null, this.A0F, this.A0C).A0I(this.A0E).A0H(this.A03).A0K(), this.A05, this.A0D), this.A07, this.A0F, this.A06.size(), this.A0A, this.A08.A0x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final void A0E(C0685Rr c0685Rr, int i) {
        c0685Rr.A0l(this.A06.get(i), this.A0B, this.A09, this.A0C, this.A05, this.A00, this.A02, this.A01);
    }

    @Override // com.facebook.ads.redexgen.X.C4Q
    public final int A0D() {
        return this.A06.size();
    }

    public final void A0F(int i, int i2, int i3) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
    }
}
