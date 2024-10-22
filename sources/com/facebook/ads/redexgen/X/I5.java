package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class I5 {
    public static byte[] A02;
    public static String[] A03 = {"ByJYsTLYuoR6uc8r", "JtyXwt9Aly6TcqGHtKIVJmBsk4OeLfoM", "a9HBAd1W81XiearAjjAT3V1ZsLEmO9Oi", "EXNlrjnsmLCbvnLTR5jNuRmyx9d0ZBX8", "CaQoJFxeqSTbWtIeh0kRdnuLPh9NlfCW", "NDFH7JBJhJBLaqfKHqozYt4fbxKVNhf7", "NTYlS1n6YEIgBX9wiCzSTuRNkv1W0ADe", "oBB1NAAyCwUYb6ONAQdFrjyju4xXh"};
    public final int A00;
    public final List<byte[]> A01;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 87);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{83, 100, 100, 121, 100, 54, 102, 119, 100, 101, Byte.MAX_VALUE, 120, 113, 54, 94, 83, 64, 85, 54, 117, 121, 120, 112, Byte.MAX_VALUE, 113};
    }

    static {
        A02();
    }

    public I5(List<byte[]> initializationData, int i) {
        this.A01 = initializationData;
        this.A00 = i;
    }

    public static I5 A00(C0420Hh c0420Hh) throws C02309d {
        try {
            c0420Hh.A0Z(21);
            int A0E = c0420Hh.A0E() & 3;
            int A0E2 = c0420Hh.A0E();
            int i = 0;
            int A06 = c0420Hh.A06();
            for (int i2 = 0; i2 < A0E2; i2++) {
                c0420Hh.A0Z(1);
                int csdStartPosition = c0420Hh.A0I();
                for (int csdLength = 0; csdLength < csdStartPosition; csdLength++) {
                    int numberOfArrays = c0420Hh.A0I();
                    int lengthSizeMinusOne = numberOfArrays + 4;
                    i += lengthSizeMinusOne;
                    c0420Hh.A0Z(numberOfArrays);
                }
            }
            c0420Hh.A0Y(A06);
            byte[] bArr = new byte[i];
            int bufferPosition = 0;
            String[] strArr = A03;
            String str = strArr[2];
            String str2 = strArr[4];
            int numberOfArrays2 = str.charAt(26);
            int lengthSizeMinusOne2 = str2.charAt(26);
            if (numberOfArrays2 != lengthSizeMinusOne2) {
                A03[7] = "2";
                for (int i3 = 0; i3 < A0E2; i3++) {
                    c0420Hh.A0Z(1);
                    int A0I = c0420Hh.A0I();
                    for (int csdStartPosition2 = 0; csdStartPosition2 < A0I; csdStartPosition2++) {
                        int csdLength2 = c0420Hh.A0I();
                        byte[] bArr2 = C0416Hd.A03;
                        int numberOfArrays3 = C0416Hd.A03.length;
                        System.arraycopy(bArr2, 0, bArr, bufferPosition, numberOfArrays3);
                        int lengthSizeMinusOne3 = C0416Hd.A03.length;
                        int bufferPosition2 = bufferPosition + lengthSizeMinusOne3;
                        byte[] bArr3 = c0420Hh.A00;
                        int lengthSizeMinusOne4 = c0420Hh.A06();
                        System.arraycopy(bArr3, lengthSizeMinusOne4, bArr, bufferPosition2, csdLength2);
                        bufferPosition = bufferPosition2 + csdLength2;
                        c0420Hh.A0Z(csdLength2);
                    }
                }
                int numberOfArrays4 = A0E + 1;
                return new I5(i == 0 ? null : Collections.singletonList(bArr), numberOfArrays4);
            }
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C02309d(A01(0, 25, 65), e);
        }
    }
}
