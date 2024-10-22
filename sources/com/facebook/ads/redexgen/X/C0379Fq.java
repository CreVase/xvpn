package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Fq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0379Fq {
    public static String[] A09 = {"Ae51WtdtbsQ7oHVSUK2kH2lkhYtCD", "qx7lDBYo1odo5Y55vJBjPuPd0SCIUsyA", "8Fm6CMM7j8ObWzEih", "Wlrw6QUG7RBgeIlzL5kKGv4h4BsSo73q", "KMN6ZJtdLdMqvcVUA0dmI7c1fz02SP9b", "8oEfNfnBPUmBxW5HI", "jCL3JtrXJCo63I6Hw50xrAvVkRQtnXEj", "6zRYHFDNSsaLRa7ASpeJIQcC6Xopjreo"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public boolean A06;
    public final C0420Hh A07 = new C0420Hh();
    public final int[] A08 = new int[UserVerificationMethods.USER_VERIFY_HANDPRINT];

    /* JADX INFO: Access modifiers changed from: private */
    public void A03(C0420Hh c0420Hh, int i) {
        int totalLength;
        if (i < 4) {
            return;
        }
        c0420Hh.A0Z(3);
        int i2 = i - 4;
        if (((c0420Hh.A0E() & 128) != 0 ? 1 : 0) != 0) {
            String[] strArr = A09;
            if (strArr[4].charAt(22) == strArr[7].charAt(22)) {
                String[] strArr2 = A09;
                strArr2[2] = "m4TsyqBzkyxUuct48";
                strArr2[5] = "zfIYrv7wq9TBAE9Jz";
                if (i2 < 7 || (totalLength = c0420Hh.A0G()) < 4) {
                    return;
                }
                this.A01 = c0420Hh.A0I();
                this.A00 = c0420Hh.A0I();
                this.A07.A0W(totalLength - 4);
                i2 -= 7;
            }
            throw new RuntimeException();
        }
        int A06 = this.A07.A06();
        int position = this.A07.A07();
        if (A06 < position && i2 > 0) {
            int bytesToRead = Math.min(i2, position - A06);
            C0420Hh c0420Hh2 = this.A07;
            String[] strArr3 = A09;
            if (strArr3[4].charAt(22) == strArr3[7].charAt(22)) {
                A09[6] = "1YWr3OwQ0jPjYWbciqj9BosGRiIvHZyi";
                c0420Hh.A0c(c0420Hh2.A00, A06, bytesToRead);
                this.A07.A0Y(A06 + bytesToRead);
                return;
            }
            throw new RuntimeException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04(C0420Hh c0420Hh, int i) {
        if (i < 19) {
            return;
        }
        this.A05 = c0420Hh.A0I();
        this.A04 = c0420Hh.A0I();
        c0420Hh.A0Z(11);
        this.A02 = c0420Hh.A0I();
        this.A03 = c0420Hh.A0I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05(C0420Hh c0420Hh, int i) {
        if (i % 5 != 2) {
            return;
        }
        c0420Hh.A0Z(2);
        Arrays.fill(this.A08, 0);
        int i2 = i / 5;
        for (int index = 0; index < i2; index++) {
            int A0E = c0420Hh.A0E();
            int a2 = c0420Hh.A0E();
            int A0E2 = c0420Hh.A0E();
            int A0E3 = c0420Hh.A0E();
            int entryCount = A0E2 - 128;
            int i3 = (int) (a2 + (entryCount * 1.402d));
            int g = (int) ((a2 - ((A0E3 - 128) * 0.34414d)) - ((A0E2 - 128) * 0.71414d));
            int entryCount2 = c0420Hh.A0E() << 24;
            this.A08[A0E] = entryCount2 | (C0436Hx.A06(i3, 0, 255) << 16) | (C0436Hx.A06(g, 0, 255) << 8) | C0436Hx.A06((int) (a2 + ((A0E3 - 128) * 1.772d)), 0, 255);
        }
        this.A06 = true;
    }

    public final FV A06() {
        int A0E;
        if (this.A05 == 0 || this.A04 == 0 || this.A01 == 0 || this.A00 == 0 || this.A07.A07() == 0 || this.A07.A06() != this.A07.A07()) {
            return null;
        }
        boolean z = this.A06;
        if (A09[6].charAt(24) == 'V') {
            throw new RuntimeException();
        }
        A09[1] = "nq70zeHujM7cnH9A4IhpB5iOObfNW5He";
        if (!z) {
            return null;
        }
        this.A07.A0Y(0);
        int[] iArr = new int[this.A01 * this.A00];
        int switchBits = 0;
        while (switchBits < iArr.length) {
            int argbBitmapDataIndex = this.A07.A0E();
            if (argbBitmapDataIndex != 0) {
                int[] argbBitmapData = this.A08;
                iArr[switchBits] = argbBitmapData[argbBitmapDataIndex];
                switchBits++;
            } else {
                int argbBitmapDataIndex2 = this.A07.A0E();
                if (argbBitmapDataIndex2 != 0) {
                    if ((argbBitmapDataIndex2 & 64) == 0) {
                        A0E = argbBitmapDataIndex2 & 63;
                    } else {
                        A0E = ((argbBitmapDataIndex2 & 63) << 8) | this.A07.A0E();
                    }
                    Arrays.fill(iArr, switchBits, switchBits + A0E, (argbBitmapDataIndex2 & 128) == 0 ? 0 : this.A08[this.A07.A0E()]);
                    switchBits += A0E;
                }
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(iArr, this.A01, this.A00, Bitmap.Config.ARGB_8888);
        float f = this.A02;
        int argbBitmapDataIndex3 = this.A05;
        float f2 = f / argbBitmapDataIndex3;
        float f3 = this.A03;
        int i = this.A04;
        return new FV(createBitmap, f2, 0, f3 / i, 0, this.A01 / argbBitmapDataIndex3, this.A00 / i);
    }

    public final void A07() {
        this.A05 = 0;
        this.A04 = 0;
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 0;
        this.A00 = 0;
        this.A07.A0W(0);
        this.A06 = false;
    }
}
