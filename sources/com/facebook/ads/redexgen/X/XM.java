package com.facebook.ads.redexgen.X;

import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class XM implements InterfaceC0252Aa {
    public static byte[] A01;
    public static String[] A02 = {"uFnK", "23brwyJGPu3ZknDoMNdw3hVXVLFEULQy", "FtMR8ROvDO4Zz8SuhvbrIDHAZ1hbcqSx", "4tDbtxEkY45WyXaQwFKWRvOHK17MthWz", "P3L0", "jQPyzSgXTRUrKPul", "L4bq6z2eevSU7Qg95t0o6YCr4fHdh5", "Io3idew6HPzrUVEIzO8xEfp6xkmYSMtW"};
    public final /* synthetic */ XL A00;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A02[5].length() == 27) {
                throw new RuntimeException();
            }
            A02[5] = "3SKjhf7gYf6c2NzhB";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 109);
            i4++;
        }
    }

    public static void A01() {
        A01 = new byte[]{109, 97, 92, 104, 121, 116, 114, 73, 111, 124, 126, 118, 18, 60, 53, 52, 41, 50, 53, 60, 123, 50, 54, 43, 52, 40, 40, 50, 57, 55, 34, 123, 55, 58, 41, 60, 62, 123, 58, 46, 63, 50, 52, 123, 55, 58, 47, 62, 53, 56, 34, 97, 123, 35, 0, 5, 2, 25, 31, 5, 3, 80, 17, 5, 20, 25, 31, 80, 4, 25, 29, 21, 3, 4, 17, 29, 0, 80, 88, 22, 2, 17, 29, 21, 80, 0, 31, 3, 25, 4, 25, 31, 30, 80, 29, 25, 3, 29, 17, 4, 19, 24, 89, 74, 80, 79, 108, 105, 110, 117, 115, 105, 111, 60, 125, 105, 120, 117, 115, 60, 104, 117, 113, 121, 111, 104, 125, 113, 108, 60, 52, 111, 101, 111, 104, 121, 113, 60, Byte.MAX_VALUE, 112, 115, Byte.MAX_VALUE, 119, 60, 113, 117, 111, 113, 125, 104, Byte.MAX_VALUE, 116, 53, 38, 60};
    }

    static {
        A01();
    }

    public XM(XL xl) {
        this.A00 = xl;
    }

    public /* synthetic */ XM(XL xl, C0255Ad c0255Ad) {
        this(xl);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0252Aa
    public final void ABl(long j) {
        Log.w(A00(2, 10, 112), A00(12, 41, 54) + j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0252Aa
    public final void ACV(long j, long j2, long j3, long j4) {
        long A03;
        long A04;
        StringBuilder append = new StringBuilder().append(A00(53, 52, 29)).append(j);
        String A00 = A00(0, 2, 44);
        StringBuilder append2 = append.append(A00).append(j2).append(A00).append(j3).append(A00).append(j4).append(A00);
        A03 = this.A00.A03();
        StringBuilder append3 = append2.append(A03).append(A00);
        A04 = this.A00.A04();
        String sb = append3.append(A04).toString();
        if (!XL.A0q) {
            String message = A00(2, 10, 112);
            Log.w(message, sb);
            return;
        }
        throw new C0258Ag(sb, null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0252Aa
    public final void AD7(long j, long j2, long j3, long j4) {
        long A03;
        long A04;
        StringBuilder append = new StringBuilder().append(A00(105, 50, 113)).append(j);
        String A00 = A00(0, 2, 44);
        StringBuilder append2 = append.append(A00).append(j2).append(A00).append(j3).append(A00).append(j4).append(A00);
        A03 = this.A00.A03();
        StringBuilder append3 = append2.append(A03).append(A00);
        A04 = this.A00.A04();
        String sb = append3.append(A04).toString();
        if (XL.A0q) {
            throw new C0258Ag(sb, null);
        }
        String[] strArr = A02;
        String str = strArr[4];
        String message = strArr[0];
        if (str.length() != message.length()) {
            throw new RuntimeException();
        }
        A02[3] = "q4b4TTgkvPPQBYTsQFxk23ASltXkXf65";
        String message2 = A00(2, 10, 112);
        Log.w(message2, sb);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0252Aa
    public final void ADG(int i, long j) {
        AU au;
        long j2;
        AU au2;
        au = this.A00.A0R;
        if (au != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            j2 = this.A00.A0E;
            long j3 = elapsedRealtime - j2;
            au2 = this.A00.A0R;
            au2.ADH(i, j, j3);
        }
    }
}
