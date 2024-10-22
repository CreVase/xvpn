package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.util.SparseBooleanArray;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Rl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0679Rl extends AbstractC0642Qa {
    public final /* synthetic */ InterfaceC0444If A00;
    public final /* synthetic */ LN A01;
    public final /* synthetic */ PC A02;
    public final /* synthetic */ C0677Rj A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ Map A05;

    public C0679Rl(C0677Rj c0677Rj, String str, PC pc, InterfaceC0444If interfaceC0444If, Map map, LN ln) {
        this.A03 = c0677Rj;
        this.A04 = str;
        this.A02 = pc;
        this.A00 = interfaceC0444If;
        this.A05 = map;
        this.A01 = ln;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0642Qa
    public final void A03() {
        C0643Qb c0643Qb;
        SparseBooleanArray sparseBooleanArray;
        C0643Qb c0643Qb2;
        C1R c1r;
        YA ya;
        SparseBooleanArray sparseBooleanArray2;
        c0643Qb = this.A03.A02;
        if (!c0643Qb.A0Z() && !TextUtils.isEmpty(this.A04)) {
            sparseBooleanArray = this.A03.A08;
            if (!sparseBooleanArray.get(this.A02.A02())) {
                InterfaceC0444If interfaceC0444If = this.A00;
                String str = this.A04;
                NL nl = new NL(this.A05);
                c0643Qb2 = this.A03.A03;
                interfaceC0444If.A9S(str, nl.A03(c0643Qb2).A02(this.A01).A05());
                c1r = this.A03.A00;
                ya = this.A03.A09;
                C1R.A07(c1r, ya);
                sparseBooleanArray2 = this.A03.A08;
                sparseBooleanArray2.put(this.A02.A02(), true);
            }
        }
    }
}
