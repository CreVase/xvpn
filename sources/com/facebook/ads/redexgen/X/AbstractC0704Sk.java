package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0704Sk extends AbstractC0585Nv {
    public static byte[] A00;
    public static String[] A01 = {"tJRtfPKHoy7gQ0Hrrag4OkVDHQvHpM6e", "ntrk62ddU7J9c8B2GtO4dhepCrAVPpDV", "iQ54QNqjdD5kyZO2OLG", "4R7BJQoUCBFINf313UyvxR7fWPUp11Dk", "Ad2P", "mQFjJcGEaXO3GAoxmnr0yBCCZwtlhd6p", "65xONPI2i6gPpcf6kW2ve41HMoO1k057", "z69fhWo2iasYfVs3h6jnYZwontL4UpVs"};

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 94);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A00 = new byte[]{43, 46, 46, 47, 62, 43, 51, 54, 61};
    }

    public abstract void A13();

    public abstract void A14();

    public abstract void A15();

    public abstract boolean A16();

    public abstract boolean A17();

    static {
        A0D();
    }

    public AbstractC0704Sk(C0589Nz c0589Nz, boolean z) {
        super(c0589Nz, z);
        if (IP.A0z(c0589Nz.A05())) {
            if (c0589Nz.A08() != null) {
                c0589Nz.A08().setCTAClickListener(getCtaButton());
            }
            getTitleDescContainer().setCTAClickListener(getCtaButton());
        }
    }

    public final void A12() {
        if (IP.A0z(this.A06.A05()) && this.A06.A08() != null) {
            this.A06.A08().setCTAClickListener(getCtaButton());
        }
    }

    public void setAdDetailsClickListener(NR nr) {
        if (IP.A0z(this.A06.A05()) && nr != null) {
            T3 ctaButton = getCtaButton();
            if (A01[1].charAt(21) != 'h') {
                throw new RuntimeException();
            }
            A01[3] = "am5A0dIgunRuJRLaM18rzwVTPisxqXDR";
            nr.setOnClickListener(C0583Nt.A03(ctaButton, A0C(0, 9, 108)));
        }
    }

    public void setupNativeCtaExtension(PC pc) {
    }
}
