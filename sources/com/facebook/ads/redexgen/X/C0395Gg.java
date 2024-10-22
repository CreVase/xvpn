package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Gg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0395Gg {
    public static byte[] A07;
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final Uri A04;
    public final String A05;
    public final byte[] A06;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 21);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{-125, 119, 105, -122, -103, -122, 120, -107, -118, -120, Byte.MIN_VALUE, -50};
    }

    public C0395Gg(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, i);
    }

    public C0395Gg(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    public C0395Gg(Uri uri, long j, long j2, String str, int i) {
        this(uri, j, j, j2, str, i);
    }

    public C0395Gg(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = true;
        HI.A03(j >= 0);
        HI.A03(j2 >= 0);
        if (j3 <= 0 && j3 != -1) {
            z = false;
        }
        HI.A03(z);
        this.A04 = uri;
        this.A06 = bArr;
        this.A01 = j;
        this.A03 = j2;
        this.A02 = j3;
        this.A05 = str;
        this.A00 = i;
    }

    public final boolean A02(int i) {
        return (this.A00 & i) == i;
    }

    public final String toString() {
        StringBuilder append = new StringBuilder().append(A00(2, 9, 16)).append(this.A04);
        String A00 = A00(0, 2, 66);
        return append.append(A00).append(Arrays.toString(this.A06)).append(A00).append(this.A01).append(A00).append(this.A03).append(A00).append(this.A02).append(A00).append(this.A05).append(A00).append(this.A00).append(A00(11, 1, 92)).toString();
    }
}
