package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public final class ZZ implements C2U {
    private C2V A00(C2T c2t) {
        return (C2V) c2t.A6E();
    }

    public final void A01(C2T c2t) {
        if (!c2t.A87()) {
            c2t.AFT(0, 0, 0, 0);
            return;
        }
        float A7E = A7E(c2t);
        float A7e = A7e(c2t);
        float elevation = C2X.A00(A7E, A7e, c2t.A7d());
        int vPadding = (int) Math.ceil(elevation);
        float elevation2 = C2X.A01(A7E, A7e, c2t.A7d());
        int ceil = (int) Math.ceil(elevation2);
        c2t.AFT(vPadding, ceil, vPadding, ceil);
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final ColorStateList A61(C2T c2t) {
        return A00(c2t).A05();
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final float A6m(C2T c2t) {
        return c2t.A6F().getElevation();
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final float A7E(C2T c2t) {
        return A00(c2t).A03();
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final float A7J(C2T c2t) {
        return A7e(c2t) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final float A7K(C2T c2t) {
        return A7e(c2t) * 2.0f;
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final float A7e(C2T c2t) {
        return A00(c2t).A04();
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void A8h() {
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void A8i(C2T c2t, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C2V background = new C2V(colorStateList, f);
        c2t.AFA(background);
        View view = c2t.A6F();
        view.setClipToOutline(true);
        view.setElevation(f2);
        AFL(c2t, f3);
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void AAs(C2T c2t) {
        AFL(c2t, A7E(c2t));
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void ACX(C2T c2t) {
        AFL(c2t, A7E(c2t));
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void AF9(C2T c2t, ColorStateList colorStateList) {
        A00(c2t).A08(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void AFF(C2T c2t, float f) {
        c2t.A6F().setElevation(f);
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void AFL(C2T c2t, float f) {
        A00(c2t).A07(f, c2t.A87(), c2t.A7d());
        A01(c2t);
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void AFR(C2T c2t, float f) {
        A00(c2t).A06(f);
    }
}
