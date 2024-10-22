package com.facebook.ads.redexgen.X;

import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Dv */
/* loaded from: assets/audience_network.dex */
public final class RunnableC0332Dv implements Runnable {
    public static byte[] A08;
    public static String[] A09 = {"vVdME5rGh6jSklOQZDzF1wgb5E3MLtgZ", "ZAtMYOp2u1lL6JeMNrwaP", "R18DWjYCOUcwxBcB68CkhMZleZUfd", "BgSMbGv4hkjr6jVDXXRQz", "8IjXA2dWofepF8Qtj8uDFWU0DRTFdV8D", "LaDUpssn4K5d6zhWjZjBpYiMi3dPH9K8", "ss5K9h", "rXtGh46sDhfXdpwUsizJp86LtKfpJH2Z"};
    public Thread A00;
    public Throwable A01;
    public final int A02;
    public final int A03;
    public final DownloadAction A04;
    public final C0335Dy A05;
    public volatile int A06;
    public volatile E2 A07;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 106;
            if (A09[2].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[1] = "SxpsrgoFQf8yDU92Sremp";
            strArr[3] = "hhSclg15fgRacyt55sjc8";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A08 = new byte[]{-49, -6, 2, -7, -9, -6, -20, -17, -85, -16, -3, -3, -6, -3, -71, -85, -35, -16, -1, -3, 4, -85, -41, -22, -8, -22, -7, -91, -22, -9, -9, -12, -9, -91, -24, -12, -6, -13, -7, -77, -91, -23, -12, -4, -13, -15, -12, -26, -23, -22, -23, -57, -2, -7, -22, -8, -91, -62, -91, -16, -3, 15, 7, -68, 5, 15, -68, 15, 16, -3, 14, 16, 1, 0};
    }

    static {
        A0B();
    }

    public RunnableC0332Dv(int i, C0335Dy c0335Dy, DownloadAction downloadAction, int i2) {
        this.A02 = i;
        this.A05 = c0335Dy;
        this.A04 = downloadAction;
        this.A06 = 0;
        this.A03 = i2;
    }

    public /* synthetic */ RunnableC0332Dv(int i, C0335Dy c0335Dy, DownloadAction downloadAction, int i2, RunnableC0324Dn runnableC0324Dn) {
        this(i, c0335Dy, downloadAction, i2);
    }

    private final float A00() {
        if (this.A07 != null) {
            return this.A07.A6h();
        }
        return -1.0f;
    }

    private int A01() {
        switch (this.A06) {
            case 5:
                return 0;
            case 6:
            case 7:
                return 1;
            default:
                return this.A06;
        }
    }

    private int A02(int i) {
        return Math.min((i - 1) * 1000, 5000);
    }

    private final long A05() {
        if (this.A07 != null) {
            return this.A07.A6i();
        }
        return 0L;
    }

    public void A08() {
        Handler handler;
        if (!A0F(0, 5)) {
            if (!A0F(1, 6)) {
                return;
            }
            A09();
        } else {
            handler = this.A05.A07;
            handler.post(new RunnableC0329Ds(this));
        }
    }

    private void A09() {
        if (this.A07 != null) {
            this.A07.cancel();
        }
        this.A00.interrupt();
    }

    public void A0A() {
        if (A0F(0, 1)) {
            Thread thread = new Thread(this);
            this.A00 = thread;
            thread.start();
        }
    }

    public boolean A0E() {
        return this.A06 == 0;
    }

    public boolean A0F(int i, int i2) {
        return A0G(i, i2, null);
    }

    public boolean A0G(int i, int i2, Throwable th) {
        if (this.A06 != i) {
            return false;
        }
        this.A06 = i2;
        this.A01 = th;
        if (!(this.A06 != A01())) {
            this.A05.A0E(this);
        }
        return true;
    }

    public final C0334Dx A0K() {
        return new C0334Dx(this.A02, this.A04, A01(), A00(), A05(), this.A01, null);
    }

    public final boolean A0L() {
        return this.A06 == 5 || this.A06 == 1 || this.A06 == 7 || this.A06 == 6;
    }

    public final boolean A0M() {
        return this.A06 == 4 || this.A06 == 2 || this.A06 == 3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Handler handler;
        E3 e3;
        if (K0.A02(this)) {
            return;
        }
        try {
            C0335Dy.A0J(A07(59, 15, 50), this);
            Throwable finalError = null;
            try {
                DownloadAction downloadAction = this.A04;
                e3 = this.A05.A0A;
                this.A07 = downloadAction.A07(e3);
                if (this.A04.A03) {
                    this.A07.remove();
                } else {
                    int i = 0;
                    long j = -1;
                    while (!Thread.interrupted()) {
                        try {
                            this.A07.A58();
                            break;
                        } catch (IOException e) {
                            long A6i = this.A07.A6i();
                            if (A6i != j) {
                                C0335Dy.A0J(A07(22, 37, 27) + A6i, this);
                                j = A6i;
                                i = 0;
                            }
                            if (this.A06 != 1 || (i = i + 1) > this.A03) {
                                throw e;
                            }
                            C0335Dy.A0J(A07(0, 22, 33) + i, this);
                            Thread.sleep(A02(i));
                        }
                    }
                }
            } catch (Throwable th) {
                finalError = th;
            }
            handler = this.A05.A07;
            handler.post(new RunnableC0330Dt(this, finalError));
        } catch (Throwable th2) {
            K0.A00(th2, this);
        }
    }

    public final String toString() {
        return super.toString();
    }
}
