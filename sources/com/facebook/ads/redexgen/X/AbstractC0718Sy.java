package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Sy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0718Sy extends AbstractC0585Nv {
    public static byte[] A06;
    public static String[] A07 = {"1qM0UqBuKeNFs4931PZdKXfB5ZchECK5", "3ZSmcCEAG5Dz0dWrJNlp2MNszP7YT25A", "Vrvau7r1HMpQKQXhvyVkTfJZAsfHOW4A", "oVRoE2FdK0le1s2SfNIozg00Kc9sH4MP", "npYoVlwUwM4clRwIxvjz9nauDkw8jySV", "7Yuh663Y", "kkRlGGIMUj7iwn7pYEfT9Vq54HRzcbQk", "UynwTjbvMY6JmtelA"};
    public static final int A08;
    public static final int A09;
    public static final int A0A;
    public static final int A0B;
    public static final int A0C;
    public static final int A0D;
    public static final int A0E;
    public static final int A0F;
    public static final int A0G;
    public static final int A0H;
    public K2 A00;
    public JX A01;
    public JT A02;
    public final AbstractC0924aS A03;
    public final C1D A04;
    public final NR A05;

    public static String A0C(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 22);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A06 = new byte[]{9, 5, 7, 68, 12, 11, 9, 15, 8, 5, 5, 1, 68, 11, 14, 25, 68, 3, 4, 30, 15, 24, 25, 30, 3, 30, 3, 11, 6, 68, 9, 6, 3, 9, 1, 15, 14, 92, 75, 89, 79, 92, 74, 75, 74, 113, 88, 71, 74, 75, 65};
    }

    static {
        A0D();
        A0B = (int) (C0506Ku.A02 * 48.0f);
        A0F = (int) (C0506Ku.A02 * 16.0f);
        A08 = (int) (C0506Ku.A02 * 4.0f);
        A0E = (int) (C0506Ku.A02 * 44.0f);
        A0C = (int) (C0506Ku.A02 * 8.0f);
        A0D = (int) (C0506Ku.A02 * 12.0f);
        A0H = (int) (C0506Ku.A02 * 12.0f);
        A0G = (int) (C0506Ku.A02 * 26.0f);
        int A01 = C00632d.A01(-1, 77);
        A09 = A01;
        A0A = C00632d.A01(A01, 90);
    }

    public AbstractC0718Sy(C0589Nz c0589Nz, boolean z) {
        super(c0589Nz, z);
        AbstractC0924aS A04 = c0589Nz.A04();
        this.A03 = A04;
        this.A04 = A04.A0v();
        this.A05 = A0B(c0589Nz);
        AbstractC0530Ls A082 = c0589Nz.A08();
        if (A082 != null) {
            A082.setLayoutParams(new RelativeLayout.LayoutParams(-1, A082.getToolbarHeight()));
            A082.setPageDetailsVisible(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.X.C0719Sz A0B(com.facebook.ads.redexgen.X.C0589Nz r19) {
        /*
            r18 = this;
            r3 = r18
            r1 = -1
            r0 = -2
            android.widget.RelativeLayout$LayoutParams r2 = new android.widget.RelativeLayout$LayoutParams
            r2.<init>(r1, r0)
            r0 = 12
            r2.addRule(r0)
            com.facebook.ads.redexgen.X.aS r0 = r19.A04()
            java.lang.String r5 = r0.A0O()
            r4 = 37
            r1 = 14
            r0 = 56
            java.lang.String r0 = A0C(r4, r1, r0)
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto Lcc
            com.facebook.ads.redexgen.X.Pm r5 = com.facebook.ads.redexgen.X.EnumC0628Pm.A04
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AbstractC0718Sy.A07
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 22
            if (r1 == r0) goto Lea
            java.lang.String[] r4 = com.facebook.ads.redexgen.X.AbstractC0718Sy.A07
            java.lang.String r1 = "Ca3psE1IPVUhCMreDaAATfbsplsRsoNT"
            r0 = 6
            r4[r0] = r1
            java.lang.String r1 = "q1VyT2b1NhDnFBLs9y9UP0y4iho0jP8D"
            r0 = 1
            r4[r0] = r1
            java.lang.String r12 = r5.A02()
        L45:
            com.facebook.ads.redexgen.X.Sz r6 = new com.facebook.ads.redexgen.X.Sz
            com.facebook.ads.redexgen.X.YA r7 = r19.A05()
            int r8 = com.facebook.ads.redexgen.X.AbstractC0718Sy.A0B
            com.facebook.ads.redexgen.X.1D r0 = r3.A04
            com.facebook.ads.redexgen.X.1K r0 = r0.A0E()
            com.facebook.ads.redexgen.X.1I r4 = r0.A00()
            com.facebook.ads.redexgen.X.1I r0 = com.facebook.ads.redexgen.X.C1I.A05
            r1 = 0
            if (r4 != r0) goto Lca
            r9 = 1
        L5d:
            com.facebook.ads.redexgen.X.1M r10 = r18.getColors()
            com.facebook.ads.redexgen.X.1D r0 = r3.A04
            com.facebook.ads.redexgen.X.1N r0 = r0.A0F()
            boolean r11 = r0.A06()
            com.facebook.ads.redexgen.X.If r13 = r19.A06()
            com.facebook.ads.redexgen.X.Lt r14 = r19.A09()
            com.facebook.ads.redexgen.X.Qb r15 = r19.A0B()
            com.facebook.ads.redexgen.X.LN r16 = r19.A07()
            com.facebook.ads.redexgen.X.aS r0 = r19.A04()
            com.facebook.ads.redexgen.X.1R r17 = r0.A0x()
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r5 = 400(0x190, float:5.6E-43)
            r4 = 100
            com.facebook.ads.redexgen.X.JT r0 = new com.facebook.ads.redexgen.X.JT
            r0.<init>(r6, r5, r4, r1)
            r3.A02 = r0
            com.facebook.ads.redexgen.X.LV.A0K(r6)
            int r0 = r19.A00()
            r6.A0C(r0)
            com.facebook.ads.redexgen.X.YA r0 = r19.A05()
            boolean r0 = com.facebook.ads.redexgen.X.IP.A0z(r0)
            if (r0 == 0) goto Lb9
            r6.A0B()
            com.facebook.ads.redexgen.X.Ls r0 = r19.A08()
            if (r0 == 0) goto Lb9
            com.facebook.ads.redexgen.X.Ls r1 = r19.A08()
            com.facebook.ads.redexgen.X.T3 r0 = r18.getCtaButton()
            r1.setCTAClickListener(r0)
        Lb9:
            r3.addView(r6, r2)
            com.facebook.ads.redexgen.X.T3 r2 = r6.getCTAButton()
            com.facebook.ads.redexgen.X.aS r1 = r3.A03
            com.facebook.ads.redexgen.X.Ls r0 = r19.A08()
            r2.A0A(r1, r0)
            return r6
        Lca:
            r9 = 0
            goto L5d
        Lcc:
            r7 = 0
            r6 = 37
            r5 = 124(0x7c, float:1.74E-43)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.AbstractC0718Sy.A07
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 7
            if (r1 == r0) goto Lea
            java.lang.String[] r4 = com.facebook.ads.redexgen.X.AbstractC0718Sy.A07
            java.lang.String r1 = "aLegEIjbGKC4WYI41vdDU1g9u"
            r0 = 7
            r4[r0] = r1
            java.lang.String r12 = A0C(r7, r6, r5)
            goto L45
        Lea:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AbstractC0718Sy.A0B(com.facebook.ads.redexgen.X.Nz):com.facebook.ads.redexgen.X.Sz");
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv
    public void A0z(C1D c1d, String str, double d, Bundle bundle) {
        super.A0z(c1d, str, d, bundle);
        this.A05.setInfo(c1d.A0E(), c1d.A0F(), str, this.A03.A0z().A01(), null);
    }

    public final int A12(AbstractC0530Ls abstractC0530Ls) {
        return abstractC0530Ls == null ? AbstractC0530Ls.A00 : abstractC0530Ls.getToolbarHeight();
    }

    public void A13() {
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout != null) {
            K2 k2 = new K2(true);
            this.A00 = k2;
            JX jx = this.A01;
            if (jx != null) {
                k2.A0I(jx);
            }
            C1M A01 = this.A03.A0u().A01();
            this.A00.A0I(new JV(getAdDetailsView().getCTAButton(), 300, -1, A01.A09(true)));
            int i = A09;
            int i2 = A0A;
            int i3 = A08;
            Drawable A082 = LV.A08(i, i2, i3);
            Drawable startDrawable = LV.A05(A01.A08(true), i3);
            this.A00.A0I(new JY(getAdDetailsView().getCTAButton(), 300, A082, startDrawable));
            this.A00.A0I(new JW(expandableLayout, 150, false));
            this.A00.A0H(2300);
        }
    }

    public AbstractC0924aS getAdDataBundle() {
        return this.A03;
    }

    public JT getAdDetailsAnimation() {
        return this.A02;
    }

    public NR getAdDetailsView() {
        return this.A05;
    }

    public C1D getAdInfo() {
        return this.A04;
    }

    public K2 getAnimationPlugin() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0585Nv, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        getAdDetailsView().A0C(configuration.orientation);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View expandableLayout = getAdDetailsView().getExpandableLayout();
        if (expandableLayout == null || !z) {
            return;
        }
        JX jx = this.A01;
        if (A07[2].charAt(30) != '4') {
            throw new RuntimeException();
        }
        A07[0] = "AO2Vor543jhYYkt1oYijcT7buZTkR3eI";
        if (jx == null) {
            JX jx2 = new JX(expandableLayout, 300, expandableLayout.getHeight(), 0);
            this.A01 = jx2;
            this.A00.A0I(jx2);
            this.A00.A0G();
        }
    }
}
