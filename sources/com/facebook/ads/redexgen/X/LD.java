package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: assets/audience_network.dex */
public final class LD {
    public static byte[] A00;
    public static final Pattern A01;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A00 = new byte[]{89, 45, 2, 90, 16, 5, 45, 2, 90, 42, 16, 92, 11, 95, 44, 90, 88, 42, 48, 92, 43, 44, 95, 91, 120, 78, 73, 73, 94, 85, 79, 27, 72, 79, 90, 88, 80, 27, 79, 73, 90, 88, 94, 33, 45, 47, 108, 36, 35, 33, 39, 32, 45, 45, 41, 108, 35, 38, 49};
    }

    static {
        A07();
        A01 = Pattern.compile(A02(0, 24, 13));
    }

    public static String A00() {
        return A06(new Exception(A02(24, 19, 71)), -1, -1, false);
    }

    public static String A01(int i) {
        if (i <= 0) {
            return null;
        }
        float rate = new Random().nextFloat();
        if (rate >= 1.0f / i) {
            return null;
        }
        return A00();
    }

    public static String A03(Context context, Throwable th) {
        int A0I = IP.A0I(context);
        int maxStacktraceLines = IP.A02(context);
        return A06(th, A0I, maxStacktraceLines, IP.A1H(context));
    }

    public static String A04(String str) {
        Matcher matcher = A01.matcher(str);
        if (matcher.matches()) {
            return matcher.group(1);
        }
        return str;
    }

    public static String A06(Throwable th, int i, int i2, boolean z) {
        String A02 = A02(0, 0, 122);
        if (th == null) {
            return A02;
        }
        try {
            C0743Ty c0743Ty = new C0743Ty();
            LB result = c0743Ty;
            if (i2 >= 0) {
                result = new C0741Tw(result, i2);
            }
            if (i >= 0) {
                result = new C0740Tv(result, i, i);
            }
            if (z) {
                result = new C0742Tx(result);
            }
            LB input = new C0744Tz(c0743Ty, 1, result);
            th.printStackTrace(new PrintWriter(new LC(input)));
            input.flush();
            return c0743Ty.toString();
        } catch (Exception unused) {
            return A02;
        }
    }

    public static boolean A08(LA la) {
        String middle = la.A02();
        if (middle == null) {
            return false;
        }
        if (A0A(middle)) {
            return true;
        }
        Iterator<String> it = la.A01().iterator();
        while (it.hasNext()) {
            if (A0A(it.next())) {
                return true;
            }
        }
        Iterator<String> it2 = la.A00().iterator();
        while (it2.hasNext()) {
            if (A0A(it2.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0A(String str) {
        return str.contains(A02(43, 16, 62));
    }
}
