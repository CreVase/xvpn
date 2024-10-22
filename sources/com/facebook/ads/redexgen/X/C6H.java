package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6H, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6H {
    public static byte[] A03;
    public static String[] A04 = {"fwnF9NqGlDDvd3tmLjHzlBLQ0vKEWHbi", "JyVh64c57ZQhNNoyVwIaBwBMCWCp47TX", "NiVjB9zhlvCIBmozr5iuMf4XPmRpTykj", "aMEAUKQnrJbxe7", "r8tEg4U8ig5A4Tipsx9WF382DZkzVk0N", "", "NXFd2c7X4J9ga52f6GNSRbndM6EeYerJ", "Iv2mUp4tdjLGTNz"};
    public static final AtomicBoolean A05;
    public Y9 A00;
    public String A01;
    public final L6 A02 = new L6(300000000000L, new YH(this));

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A03 = new byte[]{114, 125, 114, Byte.MAX_VALUE, 124, 116, 42, 33, 48, 51, 43, 54, 47, 59, 48, 61, 52, 33, 75, 93, 75, 75, 81, 87, 86, 71, 76, 81, 85, 93};
    }

    static {
        A04();
        A05 = new AtomicBoolean(false);
    }

    public static C8P A00(Y9 y9) {
        if (IP.A11(y9)) {
            return C8Q.A01(A01(0, 6, 104), A01(18, 12, 67), A01(6, 12, 63));
        }
        C0827Xh A00 = C8Q.A00();
        String[] strArr = A04;
        if (strArr[2].charAt(0) != strArr[6].charAt(0)) {
            throw new RuntimeException();
        }
        A04[0] = "UkANKLN4N59lG96lj5R5seL3Uvk1PYyc";
        return A00;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A02() {
        Y9 y9;
        synchronized (this) {
            y9 = this.A00;
        }
        if (y9 == null) {
            return;
        }
        String A0B = C8S.A00().A01(y9, true).A0B(A00(y9));
        synchronized (this) {
            this.A01 = A0B;
        }
    }

    public static void A03() {
        A05.set(true);
    }

    public final synchronized String A06(Y9 y9) {
        this.A00 = y9;
        y9.A07().AA1();
        if (this.A00.A06().AFY() || ((A05.get() && IP.A1Z(this.A00)) || this.A01 == null)) {
            A02();
            this.A02.A04().A03();
            A05.set(false);
        }
        this.A02.A06();
        return this.A01;
    }

    public final void A07() {
        this.A02.A05();
    }
}
