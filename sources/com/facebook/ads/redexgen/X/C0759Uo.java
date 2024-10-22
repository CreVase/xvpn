package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Uo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0759Uo implements InterfaceC0456Ir {
    public static byte[] A04;
    public static String[] A05 = {"Y66c6k3Hy3UvBBfpHck", "fJ4NdAtGEgbYsoLarolV0m2U2ouke5wB", "RcyYmVgVLeSkKDa12w3", "KskJyNeVQ7IEAjxWCckPmucmu9amULkO", "1ed8Y", "R", "mHN6PRZU6o6WB3AjYfdaJfhjKiNadrGW", "OPv53LJXnFYa9uQB3GUlIx9f3blXJ2fU"};
    public static final String A06;
    public ViewOnAttachStateChangeListenerC0760Up A00;
    public C0993bg<IV, C0439Ia> A01;
    public final Y9 A02;
    public final C0987ba A03 = C0987ba.A01();

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A05[1].charAt(19) != 'V') {
                throw new RuntimeException();
            }
            A05[1] = "obfng8wQuS9GtxnUf86VO2yIawxGqzEf";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 105);
            i4++;
        }
    }

    public static void A02() {
        A04 = new byte[]{-29, -9, -12, -81, -4, -12, -13, -8, -16, -81, -14, 1, -12, -16, 3, -8, 5, -12, -81, 5, -8, -12, 6, -81, -8, 2, -81, -3, 4, -5, -5, -67, -57, -32, -28, -41, -39, -37, -27, -26, -41, -28, -37, -32, -39, -110, -45, -110, -32, -25, -34, -34, -110, -43, -28, -41, -45, -26, -37, -24, -41, -110, -24, -37, -41, -23, -109, 6, 25, 21, 39, 32, 31, 25, 30, 36, -12, 17, 36, 17, -48, 25, 35, -48, 30, 37, 28, 28, -47, 4, -10, -12, 0, -1, -11, -16, -12, -7, -14, -1, -1, -10, -3};
    }

    static {
        A02();
        A06 = C0759Uo.class.getSimpleName();
    }

    public C0759Uo(Y9 y9) {
        this.A02 = y9;
    }

    private void A01() {
        this.A02.A07().A9M(A00(89, 14, 40), 3600, new C02007y(A00(67, 22, 71)));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0456Ir
    public final void AB1() {
        C0993bg<IV, C0439Ia> c0993bg = this.A01;
        if (c0993bg != null) {
            c0993bg.A03.A00();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0456Ir
    public final void ADW() {
        C0993bg<IV, C0439Ia> c0993bg = this.A01;
        if (c0993bg != null) {
            c0993bg.A03.A03();
        } else {
            A01();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0456Ir
    public final void AFz(View view) {
        if (this.A01 == null) {
            this.A02.A07().A9M(A00(89, 14, 40), 3600, new C02007y(A00(32, 35, 9)));
            return;
        }
        this.A03.A04(view);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0456Ir
    public final void AGA(View view, String str, boolean z) {
        AGB(view, str, z, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0456Ir
    public final void AGB(View view, String str, boolean z, boolean z2) {
        AGC(view, str, z, z2, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0456Ir
    public final void AGC(View view, String str, boolean z, boolean z2, boolean z3) {
        if (view != null) {
            ViewOnAttachStateChangeListenerC0760Up viewOnAttachStateChangeListenerC0760Up = new ViewOnAttachStateChangeListenerC0760Up(view);
            this.A00 = viewOnAttachStateChangeListenerC0760Up;
            this.A03.A06(viewOnAttachStateChangeListenerC0760Up, view);
            if (z2) {
                ViewOnAttachStateChangeListenerC0760Up viewOnAttachStateChangeListenerC0760Up2 = this.A00;
                String[] strArr = A05;
                if (strArr[0].length() != strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "hwPcHACCkDldKsuu7a1";
                strArr2[2] = "KVS16a9OP0E0NreE4Vx";
                viewOnAttachStateChangeListenerC0760Up2.A03();
            }
            C0993bg<IV, C0439Ia> A062 = C0993bg.A00(new IV(this.A02, view, str, z, z3), new C0439Ia(), A06).A05(new C0761Uq(new C0758Un())).A06();
            this.A01 = A062;
            this.A03.A05(view, A062);
            return;
        }
        this.A02.A07().A9M(A00(89, 14, 40), 3600, new C02007y(A00(0, 32, 38)));
    }
}
