package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: assets/audience_network.dex */
public class ZX implements C2U {
    public final RectF A00 = new RectF();

    private C2X A00(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C2X(context.getResources(), colorStateList, f, f2, f3);
    }

    private C2X A01(C2T c2t) {
        return (C2X) c2t.A6E();
    }

    public final void A02(C2T c2t) {
        Rect rect = new Rect();
        A01(c2t).A0K(rect);
        c2t.AFM((int) Math.ceil(A7K(c2t)), (int) Math.ceil(A7J(c2t)));
        c2t.AFT(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final ColorStateList A61(C2T c2t) {
        return A01(c2t).A0F();
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final float A6m(C2T c2t) {
        return A01(c2t).A0E();
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final float A7E(C2T c2t) {
        return A01(c2t).A0B();
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final float A7J(C2T c2t) {
        return A01(c2t).A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final float A7K(C2T c2t) {
        return A01(c2t).A0D();
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final float A7e(C2T c2t) {
        return A01(c2t).A0A();
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public void A8h() {
        C2X.A0G = new ZY(this);
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void A8i(C2T c2t, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C2X A00 = A00(context, colorStateList, f, f2, f3);
        A00.A0L(c2t.A7d());
        c2t.AFA(A00);
        A02(c2t);
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void AAs(C2T c2t) {
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void ACX(C2T c2t) {
        A01(c2t).A0L(c2t.A7d());
        A02(c2t);
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void AF9(C2T c2t, ColorStateList colorStateList) {
        A01(c2t).A0J(colorStateList);
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void AFF(C2T c2t, float f) {
        A01(c2t).A0I(f);
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void AFL(C2T c2t, float f) {
        A01(c2t).A0H(f);
        A02(c2t);
    }

    @Override // com.facebook.ads.redexgen.X.C2U
    public final void AFR(C2T c2t, float f) {
        A01(c2t).A0G(f);
        A02(c2t);
    }
}
