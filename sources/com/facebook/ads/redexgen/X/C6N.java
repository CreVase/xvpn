package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Callable;

/* renamed from: com.facebook.ads.redexgen.X.6N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C6N implements Callable<Boolean> {
    public static byte[] A02;
    public static String[] A03 = {"4L70rbdc", "PBHhMXx0npnpwTY", "91GJPzFmEyeOW3DYeKz29HPCrWXW0gNC", "umTRidE45okZulrVlJrHIV8", "kRbho3HgdeG0CdJ8rA209tRImftPXEnI", "60YY30c8MY", "ZuHjaYDngPTOcLYvMZdLe8TI8ruUn8GD", "lL0vcWHD5F"};
    public final C6M A00;
    public final /* synthetic */ C6Q A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 32);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{114, 126, 109, 116, 106, 111, 43, 52, 57, 56, 50};
        if (A03[1].length() != 15) {
            throw new RuntimeException();
        }
        String[] strArr = A03;
        strArr[7] = "XFV0lH04tD";
        strArr[5] = "8rdCtS3Igw";
    }

    static {
        A02();
    }

    public C6N(C6Q c6q, C6M c6m) {
        this.A01 = c6q;
        this.A00 = c6m;
    }

    private final Boolean A00() {
        String A01;
        C7S c7s;
        C7S c7s2;
        AnonymousClass00 A032;
        Map map;
        if (K0.A02(this)) {
            return null;
        }
        try {
            TrafficStats.setThreadStatsTag(61453);
            if (this.A00.A04) {
                A01 = A01(0, 6, 63);
            } else {
                A01 = A01(6, 5, 125);
            }
            String str = this.A00.A08;
            String creativeType = this.A00.A07;
            AnonymousClass06 anonymousClass06 = new AnonymousClass06(str, creativeType, this.A00.A06, A01, this.A00.A02, this.A00.A05);
            anonymousClass06.A04 = this.A00.A03;
            anonymousClass06.A02 = this.A00.A01;
            anonymousClass06.A05 = this.A00.A04;
            c7s = this.A01.A04;
            if (C6T.A06(c7s)) {
                map = C6Q.A0F;
                map.put(this.A00.A08, anonymousClass06);
            }
            c7s2 = this.A01.A04;
            A032 = C6Q.A03(c7s2.A01());
            return Boolean.valueOf(A032.AEj(anonymousClass06) != null);
        } catch (Throwable th) {
            K0.A00(th, this);
            return null;
        }
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
        if (K0.A02(this)) {
            return null;
        }
        try {
            return A00();
        } catch (Throwable th) {
            K0.A00(th, this);
            return null;
        }
    }
}
