package com.facebook.ads.redexgen.X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: assets/audience_network.dex */
public abstract class K8 implements Runnable {
    public static byte[] A01;
    public static final AtomicBoolean A02;
    public static final AtomicBoolean A03;
    public static final AtomicReference<InterfaceC0486Jy> A04;
    public final C0484Jw A00;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 116);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A01 = new byte[]{124, 91, 64, 64, 79, 76, 66, 75, 14, 77, 92, 75, 79, 90, 75, 74, 0, 14, 122, 70, 92, 75, 79, 74, 20, 14};
    }

    public abstract void A06();

    static {
        A02();
        A02 = new AtomicBoolean();
        A03 = new AtomicBoolean(false);
        A04 = new AtomicReference<>();
    }

    public K8() {
        if (A03.get()) {
            this.A00 = KD.A01(new KC(A01(0, 26, 90) + Thread.currentThread().getName()));
        } else {
            this.A00 = null;
        }
    }

    public static void A03(boolean z) {
        A03.set(z);
    }

    public static void A04(boolean z, InterfaceC0486Jy interfaceC0486Jy) {
        A02.set(z);
        A04.set(interfaceC0486Jy);
    }

    public final C0484Jw A05() {
        return this.A00;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (K0.A02(this)) {
            return;
        }
        try {
            if (A03.get()) {
                KD.A03(this);
            }
            try {
                A06();
            } catch (Throwable th) {
                if (A02.get()) {
                    KF.A00().A9E(3301, th);
                    InterfaceC0486Jy interfaceC0486Jy = A04.get();
                    if (interfaceC0486Jy != null) {
                        interfaceC0486Jy.AEc(th, this);
                    }
                } else {
                    throw th;
                }
            }
            if (A03.get()) {
                KD.A04(this);
            }
        } catch (Throwable th2) {
            K0.A00(th2, this);
        }
    }
}
