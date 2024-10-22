package com.facebook.ads.redexgen.X;

import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public class TL implements N6 {
    public final /* synthetic */ C0560Mw A00;

    public TL(C0560Mw c0560Mw) {
        this.A00 = c0560Mw;
    }

    @Override // com.facebook.ads.redexgen.X.N6
    public final void AAg(boolean z) {
        boolean z2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z2 = this.A00.A07;
        if (z2) {
            imageView = this.A00.A00;
            if (imageView != null) {
                imageView2 = this.A00.A00;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A00;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.N6
    public final void ABP(boolean z) {
        boolean z2;
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        z2 = this.A00.A07;
        if (z2) {
            imageView = this.A00.A02;
            if (imageView != null) {
                imageView2 = this.A00.A02;
                imageView2.setEnabled(z);
                imageView3 = this.A00.A02;
                imageView3.setAlpha(z ? 1.0f : 0.3f);
            }
        }
    }
}
