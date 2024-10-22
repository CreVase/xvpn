package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Yn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0859Yn extends AbstractC00230p {
    public static byte[] A03;
    public View A00;
    public final C5D A01;
    public final C0336Dz A02;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 53);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{-23, 7, 20, 20, 21, 26, -58, 22, 24, 11, 25, 11, 20, 26, -58, 20, 27, 18, 18, -58, 7, 10, -4, 15, 11, 29};
    }

    public C0859Yn(C5D c5d) {
        this.A02 = c5d.A09();
        this.A01 = c5d;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0C() {
        this.A02.A0E().A3k();
        C0487Jz.A00(new C0861Yp(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0D() {
        this.A02.A0E().A3n();
        C0487Jz.A00(new C0860Yo(this));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0E(View view) {
        if (view != null) {
            this.A02.A0E().A3m();
            this.A00 = view;
            this.A01.A07().removeAllViews();
            this.A01.A07().addView(this.A00);
            if (this.A00 instanceof TA) {
                JN.A01(this.A01.A05(), this.A00, this.A01.A0A());
            }
            C0360Ex controller = this.A01.A08();
            if (controller != null) {
                controller.A0H();
            }
            C0487Jz.A00(new C0862Yq(this));
            C5D c5d = this.A01;
            c5d.A0B(c5d.A07(), this.A00);
            if (Build.VERSION.SDK_INT >= 18 && IP.A12(this.A01.A07().getContext())) {
                final NJ nj = new NJ();
                this.A01.A0D(nj);
                nj.A0C(this.A01.getPlacementId());
                nj.A0B(this.A01.A07().getContext().getPackageName());
                if (this.A01.A08() != null && this.A01.A08().A0G() != null) {
                    nj.A09(this.A01.A08().A0G().A0C());
                }
                View view2 = this.A00;
                if (view2 instanceof TA) {
                    nj.A0A(((TA) view2).getViewabilityChecker());
                }
                this.A00.setOnLongClickListener(new View.OnLongClickListener() { // from class: com.facebook.ads.redexgen.X.5N
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view3) {
                        View view4;
                        View view5;
                        View view6;
                        view4 = C0859Yn.this.A00;
                        if (view4 != null) {
                            NJ nj2 = nj;
                            view5 = C0859Yn.this.A00;
                            int width = view5.getWidth();
                            view6 = C0859Yn.this.A00;
                            nj2.setBounds(0, 0, width, view6.getHeight());
                            nj.A0D(!r1.A0E());
                        }
                        return true;
                    }
                });
                this.A00.getOverlay().add(nj);
                return;
            }
            return;
        }
        throw new IllegalStateException(A02(0, 26, 113));
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0F(InterfaceC00220o interfaceC00220o) {
        this.A02.A0E().A3l(this.A01.A08() != null);
        if (this.A01.A08() != null) {
            this.A01.A08().A0I();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC00230p
    public final void A0G(JG jg) {
        this.A02.A0E().A2i(LM.A01(this.A01.A04()), jg.A03().getErrorCode(), jg.A04());
        C0487Jz.A00(new C0863Yr(this, jg));
    }
}
