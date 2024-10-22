package com.facebook.ads.redexgen.X;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: com.facebook.ads.redexgen.X.8m, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02138m {
    public static byte[] A01;
    public final File A00;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{-90, -60, -47, -47, -46, -41, -125, -56, -47, -42, -40, -43, -56, -125, -118, -120, -42, -118, -125, -52, -42, -125, -60, -125, -57, -52, -43, -56, -58, -41, -46, -43, -36, -118, -91, -83, -80, -87, -88, 100, -72, -77, 100, -89, -74, -87, -91, -72, -87, 100, -88, -83, -74, -87, -89, -72, -77, -74, -67, 100, 107, 105, -73, 107, -58, -62, -45, -60, -53, -65, -52, -49, -57};
    }

    public C02138m(File file) {
        this.A00 = file;
    }

    public static C02138m A00(String str, Context context) throws IOException {
        File filesDir = new File(context.getFilesDir(), A01(64, 9, 55));
        A03(filesDir);
        File fbsdklogDir = new File(filesDir, str);
        A03(fbsdklogDir);
        return new C02138m(fbsdklogDir);
    }

    public static void A03(File file) throws IOException {
        if (file.exists() || file.mkdir()) {
            if (file.isDirectory()) {
                return;
            }
            final String format = String.format(Locale.US, A01(0, 33, 58), file.getCanonicalPath());
            throw new RuntimeException(format) { // from class: com.facebook.ads.redexgen.X.8n
            };
        }
        final String format2 = String.format(Locale.US, A01(33, 31, 27), file.getCanonicalPath());
        throw new RuntimeException(format2) { // from class: com.facebook.ads.redexgen.X.8n
        };
    }

    public final C02138m A04(String str) throws IOException {
        File file = new File(this.A00, str);
        A03(file);
        return new C02138m(file);
    }

    public final File A05() {
        return this.A00;
    }
}
