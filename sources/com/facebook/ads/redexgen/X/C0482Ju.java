package com.facebook.ads.redexgen.X;

import android.animation.AnimatorListenerAdapter;
import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ju, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0482Ju implements InterfaceC0626Pk {
    public static String[] A0B = {"82Zz8oCZg8zkkbzw8opl2Yz4CtrF2SDp", "9Qv", "sj5N5SmrmBRQmWue5o8rJw6ys3alFtJa", "lBA7odrZYL425", "CSSBUKaIJSWMhqfJuWGnuyX4cipoTk5I", "IDQP5gLMbSSnC18VVbdsGZXvkzghwpNg", "Yf1MSxzKxHs57zUlY7hI2xykX4pHUq1P", "T3bn0lMwtbok5v0PvXD6574OGDOrX6LS"};
    public View A00;
    public RX A01;
    public EnumC0638Pw A02;
    public boolean A03;
    public final Handler A04;
    public final AbstractC0591Ob A05;
    public final MU A06;
    public final MI A07;
    public final L1 A08;
    public final boolean A09;
    public final boolean A0A;

    public C0482Ju(View view, EnumC0638Pw enumC0638Pw, boolean z) {
        this(view, enumC0638Pw, z, false);
    }

    public C0482Ju(View view, EnumC0638Pw enumC0638Pw, boolean z, boolean z2) {
        this.A06 = new MU() { // from class: com.facebook.ads.redexgen.X.6o
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass72 anonymousClass72) {
                C0482Ju.this.A06(1, 0);
            }
        };
        this.A07 = new MI() { // from class: com.facebook.ads.redexgen.X.6n
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(MJ mj) {
                boolean z3;
                EnumC0638Pw enumC0638Pw2;
                boolean z4;
                z3 = C0482Ju.this.A03;
                if (!z3) {
                    return;
                }
                enumC0638Pw2 = C0482Ju.this.A02;
                if (enumC0638Pw2 != EnumC0638Pw.A03) {
                    z4 = C0482Ju.this.A09;
                    if (!z4) {
                        C0482Ju.this.A06(0, 8);
                        return;
                    }
                }
                C0482Ju.this.A02 = null;
                C0482Ju.this.A05();
            }
        };
        this.A05 = new AbstractC0591Ob() { // from class: com.facebook.ads.redexgen.X.6m
            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.facebook.ads.redexgen.X.AbstractC02028a
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public final void A03(AnonymousClass75 anonymousClass75) {
                EnumC0638Pw enumC0638Pw2;
                View view2;
                View view3;
                enumC0638Pw2 = C0482Ju.this.A02;
                if (enumC0638Pw2 == EnumC0638Pw.A04) {
                    return;
                }
                view2 = C0482Ju.this.A00;
                view2.setAlpha(1.0f);
                view3 = C0482Ju.this.A00;
                view3.setVisibility(0);
            }
        };
        this.A08 = new C01686l(this);
        this.A03 = true;
        this.A04 = new Handler();
        this.A09 = z;
        this.A0A = z2;
        A08(view, enumC0638Pw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        this.A00.animate().alpha(0.0f).setDuration(500L).setListener(new C0637Pv(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A06(int i, int i2) {
        this.A04.removeCallbacksAndMessages(null);
        this.A00.clearAnimation();
        this.A00.setAlpha(i);
        this.A00.setVisibility(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07(AnimatorListenerAdapter animatorListenerAdapter) {
        this.A00.setVisibility(0);
        this.A00.animate().alpha(1.0f).setDuration(500L).setListener(animatorListenerAdapter);
    }

    private final void A08(View view, EnumC0638Pw enumC0638Pw) {
        this.A02 = enumC0638Pw;
        this.A00 = view;
        view.clearAnimation();
        if (enumC0638Pw == EnumC0638Pw.A04) {
            this.A00.setAlpha(0.0f);
            String[] strArr = A0B;
            if (strArr[5].charAt(26) == strArr[0].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0B;
            strArr2[5] = "3OWa54Sl5zOXBo6RskK22JrE4LW5JWKj";
            strArr2[0] = "lt7hksMEFpJVhV2333OBcIopOVPW9bfy";
            this.A00.setVisibility(8);
            return;
        }
        this.A00.setAlpha(1.0f);
        this.A00.setVisibility(0);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0626Pk
    public final void A9D(RX rx) {
        this.A01 = rx;
        rx.getEventBus().A03(this.A06, this.A07, this.A08, this.A05);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0626Pk
    public final void AG0(RX rx) {
        A06(1, 0);
        rx.getEventBus().A04(this.A05, this.A08, this.A07, this.A06);
        this.A01 = null;
    }
}
