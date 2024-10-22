package com.facebook.ads.redexgen.X;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Sx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0717Sx extends AbstractC0585Nv {
    public C0717Sx(C0589Nz c0589Nz, boolean z) {
        super(c0589Nz, true);
        FrameLayout.LayoutParams layoutParams;
        RelativeLayout relativeLayout = new RelativeLayout(c0589Nz.A05());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        LV.A0R(relativeLayout, getAdContextWrapper());
        LinearLayout linearLayout = new LinearLayout(c0589Nz.A05());
        linearLayout.setOrientation(!z ? 1 : 0);
        linearLayout.setGravity(80);
        LV.A0K(linearLayout);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(AbstractC0585Nv.A07, 0, AbstractC0585Nv.A07, AbstractC0585Nv.A07);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(z ? -2 : -1, -2);
        layoutParams4.setMargins(z ? AbstractC0585Nv.A07 : 0, z ? 0 : AbstractC0585Nv.A07, 0, 0);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(z ? 0 : -1, -2);
        layoutParams5.setMargins(0, 0, 0, 0);
        layoutParams5.weight = 1.0f;
        linearLayout.addView(getTitleDescContainer(), layoutParams5);
        if (c0589Nz.A0C() && !z) {
            PB pb = new PB(c0589Nz.A05());
            pb.setPageDetails(c0589Nz.A04().A0z());
            int A04 = this.A06.A04().A0u().A00().A04(true);
            pb.A02(A04, A04);
            LV.A0G(1007, pb);
            LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams6.setMargins(0, AbstractC0585Nv.A07, 0, 0);
            linearLayout.addView(pb, layoutParams6);
            if (IP.A10(c0589Nz.A05())) {
                pb.setOnClickListener(getCtaButton());
            }
        }
        linearLayout.addView(getCtaButton(), layoutParams4);
        relativeLayout.addView(linearLayout, layoutParams3);
        getCtaButton().A0A(c0589Nz.A04(), c0589Nz.A08());
        View A02 = c0589Nz.A02();
        if (A02 != null && IP.A17(getAdContextWrapper())) {
            if (z) {
                layoutParams = new FrameLayout.LayoutParams(-2, -1);
            } else {
                layoutParams = new FrameLayout.LayoutParams(-1, -2);
            }
            layoutParams.gravity = 17;
            FrameLayout frameLayout = new FrameLayout(c0589Nz.A05());
            frameLayout.addView(A02, layoutParams);
            addView(frameLayout, new RelativeLayout.LayoutParams(-1, -1));
            NO.A00(A02, IP.A18(getAdContextWrapper()), new ViewOnClickListenerC0584Nu(this));
        } else if (A02 != null) {
            addView(A02, new RelativeLayout.LayoutParams(-1, -1));
        }
        addView(relativeLayout, layoutParams2);
        if (IP.A0z(c0589Nz.A05())) {
            getTitleDescContainer().setCTAClickListener(getCtaButton());
            if (c0589Nz.A08() != null) {
                c0589Nz.A08().setCTAClickListener(getCtaButton());
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
    public final void A0z(C1D c1d, String str, double d, Bundle bundle) {
        super.A0z(c1d, str, d, bundle);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
    public final boolean A10() {
        return true;
    }
}
