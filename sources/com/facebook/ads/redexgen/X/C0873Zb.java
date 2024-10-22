package com.facebook.ads.redexgen.X;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.Zb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0873Zb implements C2T {
    public Drawable A00;
    public final /* synthetic */ C2S A01;

    public C0873Zb(C2S c2s) {
        this.A01 = c2s;
    }

    @Override // com.facebook.ads.redexgen.X.C2T
    public final Drawable A6E() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C2T
    public final C2S A6F() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C2T
    public final boolean A7d() {
        return this.A01.getPreventCornerOverlap();
    }

    @Override // com.facebook.ads.redexgen.X.C2T
    public final boolean A87() {
        return this.A01.getUseCompatPadding();
    }

    @Override // com.facebook.ads.redexgen.X.C2T
    public final void AFA(Drawable drawable) {
        this.A00 = drawable;
        this.A01.setBackgroundDrawable(drawable);
    }

    @Override // com.facebook.ads.redexgen.X.C2T
    public final void AFM(int i, int i2) {
        if (i > this.A01.A01) {
            super/*android.widget.FrameLayout*/.setMinimumWidth(i);
        }
        if (i2 > this.A01.A00) {
            super/*android.widget.FrameLayout*/.setMinimumHeight(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C2T
    public final void AFT(int i, int i2, int i3, int i4) {
        this.A01.A05.set(i, i2, i3, i4);
        C2S c2s = this.A01;
        super/*android.widget.FrameLayout*/.setPadding(c2s.A04.left + i, this.A01.A04.top + i2, this.A01.A04.right + i3, this.A01.A04.bottom + i4);
    }
}
