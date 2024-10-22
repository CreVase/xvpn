package com.facebook.ads.redexgen.X;

import com.facebook.ads.AdSize;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Kh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0495Kh {
    public static byte[] A00;
    public static String[] A01 = {"gFe3mTVqEc", "o3XICwck3thy8t5khkuFfgIyTYcE10rb", "CXZamXhEArpjjLRWzP01hTJHhdHKIPhL", "oFEH5ENhqq8Jzm18l75xaKQx7AXJNwzV", "R1QKRY6v8stJjzPTGoE1sFm3d511QSKK", "fRlItu1oZcW1vgjv2TfsauDW1x1gg146", "rMZj8KW6uJSswCV0wJ61u4oJuHgPLcpr", "VRcOG4k1oxgWu574CIBxVkEWQ"};
    public static final Map<JJ, JL> A02;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{125, 95, 80, 25, 74, 30, 93, 76, 91, 95, 74, 91, 30, Byte.MAX_VALUE, 90, 109, 87, 68, 91, 30, 75, 77, 87, 80, 89, 30, 74, 86, 87, 77, 30, 73, 87, 90, 74, 86, 30, 95, 80, 90, 30, 86, 91, 87, 89, 86, 74, 16, 115, 72, 77, 72, 73, 81, 72, 6, 103, 66, 117, 79, 92, 67, 6, 82, 95, 86, 67, 8};
    }

    static {
        A07();
        HashMap hashMap = new HashMap();
        A02 = hashMap;
        hashMap.put(JJ.A08, JL.A0C);
        hashMap.put(JJ.A06, JL.A0E);
        hashMap.put(JJ.A05, JL.A0D);
    }

    public static AdSize A00(JJ jj) {
        return AdSize.fromWidthAndHeight(jj.A03(), jj.A02());
    }

    public static AdSize A01(JL jl) {
        for (Map.Entry<JJ, JL> entry : A02.entrySet()) {
            if (entry.getValue() == jl) {
                return A00(entry.getKey());
            }
        }
        AdSize adSize = AdSize.BANNER_320_50;
        if (A01[2].charAt(13) != 'L') {
            throw new RuntimeException();
        }
        String[] strArr = A01;
        strArr[3] = "8yxIcOBY3dyXYw8tx9RnPYEelWv3PiEU";
        strArr[5] = "RuT7gwLbx9UlwnZGushHq4GsGVsr9kdh";
        return adSize;
    }

    public static JJ A02(int i) {
        switch (i) {
            case 4:
                return JJ.A04;
            case 5:
                return JJ.A05;
            case 6:
                return JJ.A06;
            case 7:
                return JJ.A08;
            case 100:
                return JJ.A07;
            default:
                throw new IllegalArgumentException(A06(48, 20, 63));
        }
    }

    public static JJ A03(int i, int i2) {
        if (JJ.A07.A02() == i2 && JJ.A07.A03() == i) {
            JJ jj = JJ.A07;
            if (A01[2].charAt(13) != 'L') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[4] = "oPyqycdUDaMLkpnFUSD1lOVVut5Ak4ux";
            strArr[6] = "t44MnsVi8idfM7jbHI01veBsrnLqKP4H";
            return jj;
        }
        if (JJ.A04.A02() == i2 && JJ.A04.A03() == i) {
            return JJ.A04;
        }
        if (JJ.A05.A02() == i2 && JJ.A05.A03() == i) {
            JJ jj2 = JJ.A05;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[4] = "zTuOoFSTcjvo6siKnZ91TQqR6FN8Kxgy";
            strArr2[6] = "bIxUq8CGRMwo1zGvdui1T5X5wsDAfXTH";
            return jj2;
        }
        if (JJ.A06.A02() == i2 && JJ.A06.A03() == i) {
            return JJ.A06;
        }
        if (JJ.A08.A02() == i2 && JJ.A08.A03() == i) {
            return JJ.A08;
        }
        throw new IllegalArgumentException(A06(0, 48, 39));
    }

    public static JJ A04(AdSize adSize) {
        return A03(adSize.getWidth(), adSize.getHeight());
    }

    public static JL A05(JJ jj) {
        JL adTemplate = A02.get(jj);
        if (adTemplate == null) {
            JL jl = JL.A0F;
            if (A01[1].charAt(1) == 'd') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "UG6JCyDXDBzWMb76AfK0hQ3l3bgkgswO";
            strArr[5] = "9YhmwLNWXnVy8pTRO5fFllqJZ4ALiPvn";
            return jl;
        }
        return adTemplate;
    }
}
