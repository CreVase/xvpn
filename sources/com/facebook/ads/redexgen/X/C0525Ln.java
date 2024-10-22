package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ln, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0525Ln {
    public static byte[] A00;
    public static String[] A01 = {"75", "", "84T1cPcVhFaG3gZ5iFCuz5VGfvW435Ys", "hmgtvPST3LKdfFpjmmFZYvFoyIGtsiKE", "1o0hQSlG2MREJWQYXtVsar2Zo68mKpVL", "LjPyS32kIH6YipP2gsYrsbvo7R8K", "pRhgJcRZc8j2ATnbWVmWTgInp0JNCNsL", "EpPf5pm3Rz1UtI6LaI9QQC8GFK2ymH0S"};
    public static final String A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A00 = new byte[]{75, 44, 126, 67, 88, 94, 75, 79, 82, 84, 85, 27, 82, 85, 27, 76, 82, 85, 95, 84, 76, 27, 82, 85, 93, 84, 27, 88, 83, 94, 88, 80, 28, 18, 14, 16, 2, 22, 5, 19, 119, 123, 110, 115, 104, 114, 106, 120, 10, 27, 25, 22, 26, 22, 7, 18, 22, 13, 90, 89};
    }

    static {
        A02();
        A02 = C0525Ln.class.getSimpleName();
    }

    public static Map<String, String> A01(YA ya) {
        Window window;
        HashMap hashMap = new HashMap();
        if (ya == null) {
            return hashMap;
        }
        try {
            hashMap.put(A00(40, 3, 111), String.valueOf(A04(ya)));
            Activity A0D = ya.A0D();
            if (A0D != null && (window = A0D.getWindow()) != null) {
                int i = window.getAttributes().flags;
                int flags = window.getAttributes().type;
                hashMap.put(A00(58, 2, 94), Integer.toString(flags));
                int flags2 = 4194304 & i;
                String A002 = A00(1, 1, 110);
                String A003 = A00(0, 1, 8);
                hashMap.put(A00(48, 5, 14), flags2 > 0 ? A002 : A003);
                if (A01[1].length() == 23) {
                    throw new RuntimeException();
                }
                A01[7] = "fwmMHJhcrVWyeAGw8Re8ymmckApbJBDL";
                int flags3 = 524288 & i;
                if (flags3 <= 0) {
                    A002 = A003;
                }
                hashMap.put(A00(53, 5, 18), A002);
            }
        } catch (Exception e) {
            Log.e(A02, A00(2, 30, 72), e);
            InterfaceC01987w A07 = ya.A07();
            int type = C01997x.A2S;
            A07.A9M(A00(43, 5, 114), type, new C02007y(e));
        }
        return hashMap;
    }

    public static boolean A03(YA ya) {
        return !LW.A04(A01(ya));
    }

    public static boolean A04(YA ya) {
        KeyguardManager keyguardManager = (KeyguardManager) ya.getSystemService(A00(32, 8, 4));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
