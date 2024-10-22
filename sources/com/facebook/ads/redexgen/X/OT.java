package com.facebook.ads.redexgen.X;

import android.graphics.drawable.ColorDrawable;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class OT {
    public static AnonymousClass97 A00(final C0589Nz c0589Nz, int i, final String str, final S0 s0) {
        if (i == 1) {
            return new AnonymousClass97(c0589Nz, str, s0) { // from class: com.facebook.ads.redexgen.X.1j
                public static final int A00 = (int) (C0506Ku.A02 * 20.0f);
                public static final int A01 = (int) (C0506Ku.A02 * 16.0f);

                @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
                public final boolean A01() {
                    return false;
                }

                @Override // com.facebook.ads.redexgen.X.AnonymousClass97
                public final void A18(YA ya) {
                    C0578No titleDescContainer = getTitleDescContainer();
                    titleDescContainer.setAlignment(3);
                    titleDescContainer.setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    titleDescContainer.setPadding(0, 0, 0, A00);
                    getCtaButton().setLayoutParams(new RelativeLayout.LayoutParams(-1, -2));
                    LinearLayout linearLayout = new LinearLayout(ya);
                    LV.A0S(linearLayout, new ColorDrawable(-1));
                    RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                    layoutParams.addRule(3, getMediaContainer().getId());
                    linearLayout.setLayoutParams(layoutParams);
                    linearLayout.setOrientation(1);
                    int i2 = A01;
                    linearLayout.setPadding(i2, i2, i2, i2);
                    linearLayout.addView(titleDescContainer);
                    linearLayout.addView(getCtaButton());
                    addView(getMediaContainer());
                    addView(linearLayout);
                }
            };
        }
        return new AnonymousClass97(c0589Nz, str, s0) { // from class: com.facebook.ads.redexgen.X.1k
            public static final int A00 = (int) (C0506Ku.A02 * 12.0f);

            @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
            public final boolean A00() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AnonymousClass97, com.facebook.ads.redexgen.X.AbstractC0585Nv
            public final boolean A0D() {
                return false;
            }

            @Override // com.facebook.ads.redexgen.X.AnonymousClass97
            public final void A18(YA ya) {
                C0578No titleDescContainer = getTitleDescContainer();
                titleDescContainer.setAlignment(3);
                RelativeLayout.LayoutParams adTitleAndDescriptionLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
                adTitleAndDescriptionLayoutParams.addRule(8, getMediaContainer().getId());
                titleDescContainer.setLayoutParams(adTitleAndDescriptionLayoutParams);
                int i2 = A00;
                titleDescContainer.setPadding(i2, i2, i2, i2);
                LV.A0R(titleDescContainer, getAdContextWrapper());
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(3, getMediaContainer().getId());
                getCtaButton().setLayoutParams(layoutParams);
                addView(getMediaContainer());
                addView(titleDescContainer);
                addView(getCtaButton());
            }
        };
    }
}
