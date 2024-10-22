package com.facebook.ads.redexgen.X;

import java.lang.reflect.Constructor;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class X3 implements InterfaceC0281Bd {
    public static byte[] A06;
    public static final Constructor<? extends InterfaceC0278Ba> A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05 = 1;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 120);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{38, 83, 83, 80, 83, 1, 74, 79, 84, 85, 66, 79, 85, 74, 66, 85, 74, 79, 72, 1, 39, 45, 34, 36, 1, 70, 89, 85, 70, 79, 84, 74, 80, 79, 42, 67, 58, 77, 69, 58, 56, 73, 58, 57, -11, 58, 71, 71, 68, 71, -11, 56, 71, 58, 54, 73, 62, 67, 60, -11, 27, 33, 22, 24, -11, 58, 77, 73, 71, 54, 56, 73, 68, 71, 24, 36, 34, -29, 27, 22, 24, 26, 23, 36, 36, 32, -29, 22, 25, 40, -29, 30, 35, 41, 26, 39, 35, 22, 33, -29, 26, 45, 36, 37, 33, 22, 46, 26, 39, -25, -29, 26, 45, 41, -29, 27, 33, 22, 24, -29, -5, 33, 22, 24, -6, 45, 41, 39, 22, 24, 41, 36, 39};
    }

    static {
        A01();
        Constructor<? extends InterfaceC0278Ba> constructor = null;
        try {
            constructor = Class.forName(A00(74, 59, 61)).asSubclass(InterfaceC0278Ba.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            throw new RuntimeException(A00(0, 34, 105), e);
        }
        A07 = constructor;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0281Bd
    public final synchronized InterfaceC0278Ba[] A4Y() {
        InterfaceC0278Ba[] extractors;
        Constructor<? extends InterfaceC0278Ba> constructor = A07;
        extractors = new InterfaceC0278Ba[constructor == null ? 12 : 13];
        extractors[0] = new C0808Wo(this.A01);
        extractors[1] = new C0798We(this.A00);
        extractors[2] = new C0796Wc(this.A03);
        extractors[3] = new C0805Wl(this.A02);
        extractors[4] = new WO();
        extractors[5] = new WR();
        extractors[6] = new W5(this.A05, this.A04);
        extractors[7] = new C0815Wv();
        extractors[8] = new WW();
        extractors[9] = new WB();
        extractors[10] = new W3();
        extractors[11] = new C0818Wy();
        if (constructor != null) {
            try {
                extractors[12] = constructor.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException(A00(34, 40, 93), e);
            }
        }
        return extractors;
    }
}
