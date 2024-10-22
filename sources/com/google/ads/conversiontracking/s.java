package com.google.ads.conversiontracking;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f1409a;

    static {
        "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray();
        f1409a = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray();
    }

    @Deprecated
    public static String a(byte[] bArr, boolean z) {
        return a(bArr, 0, bArr.length, f1409a, z);
    }

    public static String a(byte[] bArr, int i, int i2, char[] cArr, boolean z) {
        int i3 = ((i2 + 2) / 3) * 4;
        int i4 = (i3 / Integer.MAX_VALUE) + i3;
        char[] cArr2 = new char[i4];
        int i5 = i2 - 2;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i6 < i5) {
            int i9 = ((bArr[i6 + i] << 24) >>> 8) | ((bArr[(i6 + 1) + i] << 24) >>> 16) | ((bArr[(i6 + 2) + i] << 24) >>> 24);
            cArr2[i7] = cArr[i9 >>> 18];
            int i10 = i7 + 1;
            cArr2[i10] = cArr[(i9 >>> 12) & 63];
            cArr2[i7 + 2] = cArr[(i9 >>> 6) & 63];
            cArr2[i7 + 3] = cArr[i9 & 63];
            i8 += 4;
            if (i8 == Integer.MAX_VALUE) {
                cArr2[i7 + 4] = '\n';
                i7 = i10;
                i8 = 0;
            }
            i6 += 3;
            i7 += 4;
        }
        if (i6 < i2) {
            int i11 = i6 + i;
            int i12 = i2 - i6;
            int i13 = (i12 > 0 ? (bArr[i11] << 24) >>> 8 : 0) | (i12 > 1 ? (bArr[i11 + 1] << 24) >>> 16 : 0) | (i12 > 2 ? (bArr[i11 + 2] << 24) >>> 24 : 0);
            if (i12 == 1) {
                cArr2[i7] = cArr[i13 >>> 18];
                cArr2[i7 + 1] = cArr[(i13 >>> 12) & 63];
                cArr2[i7 + 2] = '=';
                cArr2[i7 + 3] = '=';
            } else if (i12 == 2) {
                cArr2[i7] = cArr[i13 >>> 18];
                cArr2[i7 + 1] = cArr[(i13 >>> 12) & 63];
                cArr2[i7 + 2] = cArr[(i13 >>> 6) & 63];
                cArr2[i7 + 3] = '=';
            } else if (i12 == 3) {
                cArr2[i7] = cArr[i13 >>> 18];
                cArr2[i7 + 1] = cArr[(i13 >>> 12) & 63];
                cArr2[i7 + 2] = cArr[(i13 >>> 6) & 63];
                cArr2[i7 + 3] = cArr[i13 & 63];
            }
            if (i8 + 4 == Integer.MAX_VALUE) {
                cArr2[i7 + 4] = '\n';
            }
        }
        while (!z && i4 > 0 && cArr2[i4 - 1] == '=') {
            i4--;
        }
        return new String(cArr2, 0, i4);
    }
}
