package com.facebook.ads.redexgen.X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Ri, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0676Ri extends C4Q<C0674Rg> {
    public final int A00;
    public final YA A01;
    public final T3 A02;
    public final List<String> A03;

    public C0676Ri(YA ya, List<String> screenshotUrls, int i, T3 t3) {
        this.A03 = screenshotUrls;
        this.A00 = i;
        this.A01 = ya;
        this.A02 = t3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A02, reason: merged with bridge method [inline-methods] */
    public final C0674Rg A0C(ViewGroup viewGroup, int i) {
        C0675Rh c0675Rh = new C0675Rh(this.A01);
        if (IP.A13(this.A01)) {
            c0675Rh.setOnClickListener(new PT(this));
        }
        return new C0674Rg(c0675Rh);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C4Q
    /* renamed from: A03, reason: merged with bridge method [inline-methods] */
    public final void A0E(C0674Rg c0674Rg, int i) {
        String str = this.A03.get(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -1);
        int leftMargin = this.A00;
        int i2 = leftMargin * 4;
        if (i == 0) {
            leftMargin = i2;
        }
        marginLayoutParams.setMargins(leftMargin, 0, i >= A0D() + (-1) ? this.A00 * 4 : this.A00, 0);
        c0674Rg.A0l().setLayoutParams(marginLayoutParams);
        c0674Rg.A0l().A00(str);
    }

    @Override // com.facebook.ads.redexgen.X.C4Q
    public final int A0D() {
        return this.A03.size();
    }
}
