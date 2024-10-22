package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Ra, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0668Ra extends K8 {
    public static String[] A04 = {"pUIboC8CwdUMtM1tPR8iEtPz8p", "ladzvmq", "gZiIZXhhpFNWaRiPv", "vQtAVDGFp8M", "7j30UYRlUEXcM4Kd2wK", "XchzO9Mtzl1GyvdPdWlZd1J0iwZmFx3H", "VTwPVxpRcW0", "YPnzN72MuP4y3lnuBhqZ0NoSyY"};
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ RX A02;
    public final /* synthetic */ QY A03;

    public C0668Ra(RX rx, QY qy, int i, int i2) {
        this.A02 = rx;
        this.A03 = qy;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.X.K8
    public final void A06() {
        YA ya;
        Handler handler;
        C8Z c8z;
        YA ya2;
        C8Z c8z2;
        LO lo;
        Handler handler2;
        YA ya3;
        C8Z c8z3;
        Handler handler3;
        YA ya4;
        YA ya5;
        C8Z c8z4;
        MJ mj;
        Handler handler4;
        YA ya6;
        YA ya7;
        Handler handler5;
        C8Z c8z5;
        C8Z c8z6;
        OK ok;
        YA ya8;
        C8Z c8z7;
        if (this.A03 == QY.A07) {
            this.A02.A0L(EnumC0451Im.A0q);
            ya8 = this.A02.A0A;
            ya8.A0E().A34();
            c8z7 = this.A02.A0B;
            c8z7.A02(RX.A0C());
            return;
        }
        if (this.A03 == QY.A03) {
            this.A02.A0L(EnumC0451Im.A0l);
            this.A02.A03 = true;
            c8z6 = this.A02.A0B;
            ok = RX.A0G;
            c8z6.A02(ok);
            this.A02.A0K(this.A00);
            return;
        }
        QY qy = this.A03;
        QY qy2 = QY.A06;
        String[] strArr = A04;
        if (strArr[0].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        A04[5] = "Wlqb3PCyph61UkVVxo7ng7VZa1hYfmo4";
        if (qy == qy2) {
            this.A02.A0L(EnumC0451Im.A0k);
            ya7 = this.A02.A0A;
            ya7.A0E().A2w();
            this.A02.A03 = true;
            handler5 = this.A02.A07;
            handler5.removeCallbacksAndMessages(null);
            c8z5 = this.A02.A0B;
            int i = this.A01;
            c8z5.A02(new AnonymousClass75(i, i));
            this.A02.A0K(this.A01);
            return;
        }
        if (this.A03 == QY.A0A) {
            ya4 = this.A02.A0A;
            if (IP.A1X(ya4)) {
                ya6 = this.A02.A0A;
                ya6.A0A().ADW();
            }
            this.A02.A0L(EnumC0451Im.A0o);
            ya5 = this.A02.A0A;
            ya5.A0E().A3B();
            c8z4 = this.A02.A0B;
            mj = RX.A0H;
            c8z4.A02(mj);
            handler4 = this.A02.A07;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0H();
            return;
        }
        if (this.A03 == QY.A05) {
            this.A02.A0L(EnumC0451Im.A0n);
            ya3 = this.A02.A0A;
            ya3.A0E().A30();
            c8z3 = this.A02.A0B;
            final int i2 = this.A00;
            c8z3.A02(new P7(i2) { // from class: com.facebook.ads.redexgen.X.72
            });
            handler3 = this.A02.A07;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0K(this.A00);
            return;
        }
        if (this.A03 == QY.A04) {
            this.A02.A0L(EnumC0451Im.A0m);
            ya2 = this.A02.A0A;
            ya2.A0E().A2x();
            c8z2 = this.A02.A0B;
            lo = RX.A0K;
            c8z2.A02(lo);
            handler2 = this.A02.A07;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == QY.A09) {
            this.A02.A0L(EnumC0451Im.A0k);
            ya = this.A02.A0A;
            ya.A0E().A36();
            this.A02.A03 = true;
            handler = this.A02.A07;
            handler.removeCallbacksAndMessages(null);
            c8z = this.A02.A0B;
            c8z.A02(new AnonymousClass75(this.A00, this.A01));
            this.A02.A0K(this.A00);
        }
    }
}
