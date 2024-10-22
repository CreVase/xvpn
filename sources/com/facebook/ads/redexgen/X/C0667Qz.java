package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Qz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0667Qz {
    public static InterfaceC0647Qf A00;
    public static byte[] A01;
    public static String[] A02 = {"b", "jWWIi2TrnHAAyoG5itvaKpzBpE6rwsKb", "4piz2zd6PBPCOA5LKuru6huyc0Gk9hmI", "ThWxRwfxtMClt6xxWNEGrvPqHoOGiBgN", "VC0ltrZe3ujZ5yBmE9F34w5pTHRf8GMT", "g0Z7XyqsbnnTrD4DkPgr08gcmreNHhpx", "VVYGWntGozQ2sTcwE1XxLnyTeGzWkyyX", "XVqTwdXEkxL4UUDwn3dakWK60VTsxJd5"};
    public static final Set<String> A03;
    public static final Set<String> A04;
    public static final AtomicBoolean A05;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 56);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{36, 101, 110, 8, 85, 68, 11, 77, 77, 2, Byte.MAX_VALUE, 10, 123, 99, 73, 104, 8, 85, 98, 15, 86, 84, 94, 81, 8, 82, 77, 74, 8, 111, 85, 73, 81, 7, 48, Byte.MAX_VALUE, 32, 7, 58, 38, 2, 63, 42, 33, 62, 34, 103, 27, 33, 42, 8, 36, 58, 62, 126, 37, 26, 36, 99, 53, 30, 63, 113, 70, 13, Byte.MAX_VALUE, 119, 30, 59, 10, 123, 54, 3, 12, 43, 35, 38, 123, 61, 63, 59, 54, 62, 14, 10, 44, 53, 23, 0, 42, 14, 114, 69, 107, 64, 81, 82, 74, 87, 78, 76, 75, 66, 5, 71, 64, 67, 74, 87, 64, 5, 76, 75, 76, 81, 4, 113, 115, 113, 96, 31, 72, 71, 115, 75, 77, 98, 79, 2, 93, 72, 124, 123, 77, 71, 80, 124, 97, 28, 64, 89, 78, 100, 20, 35, 54, 62, 37, 39, 59, 54, 57, 50, 8, 58, 56, 51, 50, 8, 56, 57, 7, 12, 29, 30, 6, 27, 2, 19, 8, 61, 85, 32, 53, 9, 53, 13, 36, 94, 55, 82, 49, 49, 50, 3, 36, 23, 40, 21, 33, 47, 95, 11, 1, 54, 90, 109};
    }

    static {
        A07();
        HashSet hashSet = new HashSet();
        A03 = hashSet;
        HashSet hashSet2 = new HashSet();
        A04 = hashSet2;
        hashSet.add(A05(6, 29, 2));
        hashSet2.add(A05(168, 29, 95));
        hashSet2.add(A05(35, 29, 116));
        hashSet2.add(A05(64, 29, 119));
        hashSet2.add(A05(116, 29, 17));
        A05 = new AtomicBoolean();
    }

    public static InterfaceC0649Qh A00(C7S c7s) {
        return A03(true, c7s);
    }

    public static InterfaceC0649Qh A01(C7S c7s) {
        return A02(true, c7s);
    }

    public static InterfaceC0649Qh A02(boolean z, C7S c7s) {
        C0653Ql c0653Ql = new C0653Ql();
        C0656Qo A042 = A04(c7s);
        if (!A0B(c7s)) {
            c0653Ql.A02(A04);
            c0653Ql.A01(A03);
        }
        if (C0492Ke.A04()) {
            Map<String, String> A022 = C0492Ke.A02();
            String[] strArr = A02;
            if (strArr[2].charAt(7) == strArr[1].charAt(7)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[5] = "6CjO7LbqJIONUadrRHmx0RuGBypxStir";
            strArr2[3] = "VKsjD9ddp6JrHwn0FL0Df9QGs7RhJ4JT";
            A042.A08(A022);
        }
        C0434Hv A002 = AbstractC0651Qj.A00();
        C0653Ql networkModuleConfigurationBuilder = c0653Ql.A00(A042.A09());
        return A002.A00(networkModuleConfigurationBuilder.A03(z).A04(c7s.A04().A8o()).A05(), c7s.A07(), ExecutorC0512La.A01());
    }

    public static InterfaceC0649Qh A03(boolean z, C7S c7s) {
        return AbstractC0651Qj.A00().A00(new C0653Ql().A03(z).A00(A04(c7s).A09()).A04(c7s.A04().A8o()).A05(), c7s.A07(), ExecutorC0512La.A01());
    }

    public static C0656Qo A04(C7S c7s) {
        A08(c7s);
        C0656Qo c0656Qo = new C0656Qo();
        if (A0B(c7s) || C0492Ke.A04()) {
            c0656Qo.A02(360000).A04(120000);
        } else {
            c0656Qo.A02(IP.A08(c7s)).A04(IP.A0A(c7s));
        }
        c0656Qo.A03(IP.A09(c7s)).A05(IP.A0B(c7s)).A06(IP.A0C(c7s));
        synchronized (C0667Qz.class) {
            InterfaceC0647Qf interfaceC0647Qf = A00;
            if (interfaceC0647Qf != null && (interfaceC0647Qf instanceof InterfaceC0647Qf)) {
                c0656Qo.A07(interfaceC0647Qf);
            }
        }
        return c0656Qo;
    }

    public static void A06() {
        A05.set(true);
    }

    public static void A08(C7S c7s) {
        if (!A05.get()) {
            c7s.A07().A9M(A05(161, 7, 81), C01997x.A20, new C02007y(A05(93, 23, 29)));
        }
    }

    public static synchronized void A09(InterfaceC0647Qf interfaceC0647Qf) {
        synchronized (C0667Qz.class) {
            A00 = interfaceC0647Qf;
        }
    }

    public static boolean A0A(C7S c7s) {
        int i = Build.VERSION.SDK_INT;
        String A052 = A05(145, 16, 111);
        if (i < 17) {
            return Settings.System.getInt(c7s.getContentResolver(), A052, 0) != 0;
        }
        int i2 = Settings.Global.getInt(c7s.getContentResolver(), A052, 0);
        if (A02[0].length() != 1) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[2] = "6SlcDzdssqL5L6jmaJN4q0YtRJ9ZiIN0";
        strArr[1] = "IhCDgNyX5tEXKuNPsF1SGphg5lyX1n5g";
        return i2 != 0;
    }

    public static boolean A0B(C7S c7s) {
        String A86 = c7s.A04().A86();
        if (!TextUtils.isEmpty(A86)) {
            String urlPrefix = A05(3, 3, 30);
            if (!A86.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 50);
                if (A86.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
