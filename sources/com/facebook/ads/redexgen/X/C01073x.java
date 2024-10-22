package com.facebook.ads.redexgen.X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.3x, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C01073x {
    public static byte[] A04;
    public static String[] A05 = {"QuaalhDpDah20LX2wxgS6m2LJMNg0MsY", "Kv65PDKGzQbP8opzJD3T0Bs4qFkMuEvW", "yAGu2U2W7yMlSo0lcdd0QNLvUGBJ2w5m", "aJo4Pz0hsbQrFibFt4ypJbnLPuINPYvA", "18JvwLOKolmi3RAuIpcsWcjyGiEhXJWG", "AlJwV0uWjEUfV5LlQyKVHG51mucaZZJu", "um2uWSM0iR5xPcbZFnmwGsQ9sHGc90", "QpR6AGAR"};
    public int A00;
    public int A01;
    public int A02;
    public Object A03;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 115);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-77, -9, -63, -34, 37, -20, -62, -62, -35, -4, 18, 21, 21, 20, -21, 82, 91, 4, -1, 85, 80};
    }

    static {
        A02();
    }

    public C01073x(int i, int i2, int i3, Object obj) {
        this.A00 = i;
        this.A02 = i2;
        this.A01 = i3;
        this.A03 = obj;
    }

    private final String A00() {
        switch (this.A00) {
            case 1:
                return A01(10, 3, 62);
            case 2:
                String[] strArr = A05;
                if (strArr[4].charAt(8) == strArr[0].charAt(8)) {
                    throw new RuntimeException();
                }
                A05[1] = "xbTSMp8fvBEENljIQe5QRmpFAlAe0spq";
                return A01(17, 2, 31);
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                return A01(6, 2, 16);
            case 4:
                return A01(19, 2, 109);
            case 8:
                return A01(15, 2, 114);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C01073x c01073x = (C01073x) obj;
        int i = this.A00;
        if (i != c01073x.A00) {
            return false;
        }
        if (i == 8 && Math.abs(this.A01 - this.A02) == 1 && this.A01 == c01073x.A02 && this.A02 == c01073x.A01) {
            return true;
        }
        if (this.A01 != c01073x.A01 || this.A02 != c01073x.A02) {
            return false;
        }
        Object obj2 = this.A03;
        if (obj2 != null) {
            if (!obj2.equals(c01073x.A03)) {
                return false;
            }
        } else {
            Object obj3 = c01073x.A03;
            if (A05[2].charAt(7) == 'q') {
                throw new RuntimeException();
            }
            A05[6] = "4VD3xUS92qaUHk8jcTCUJI3HU1kIkp";
            if (obj3 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int result = this.A00;
        int i = result * 31;
        int result2 = this.A02;
        return ((i + result2) * 31) + this.A01;
    }

    public final String toString() {
        return Integer.toHexString(System.identityHashCode(this)) + A01(8, 1, 15) + A00() + A01(3, 3, 63) + this.A02 + A01(13, 2, 62) + this.A01 + A01(0, 3, 20) + this.A03 + A01(9, 1, 44);
    }
}
