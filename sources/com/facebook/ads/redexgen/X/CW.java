package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public abstract class CW {
    public static String[] A0D = {"0vhu5jxS", "Yr1jkp10QbCUuCnawnVg6DyED3T", "sHPBJpa0rClOKB4ts4mek83zSMf", "023O0ZSY", "oXq1fAkWHKLdk2C1T6ZzlQ7WbkpG5dco", "r27coonoikndR5VwsgZJDPH1Xbh3nrzE", "wA4WoZs0OtPlvEvglX5psUeQApq37N8U", "1wN1LzZhcL4LE4gXrEEsM7fopE3lhqwu"};
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public InterfaceC0280Bc A06;
    public InterfaceC0288Bm A07;
    public CT A08;
    public CV A09;
    public boolean A0A;
    public boolean A0B;
    public final CR A0C = new CR();

    public abstract long A07(C0420Hh c0420Hh);

    public abstract boolean A0A(C0420Hh c0420Hh, long j, CV cv) throws IOException, InterruptedException;

    private int A00(InterfaceC0279Bb interfaceC0279Bb) throws IOException, InterruptedException {
        boolean z = true;
        while (z) {
            boolean readingHeaders = this.A0C.A05(interfaceC0279Bb);
            if (!readingHeaders) {
                this.A01 = 3;
                return -1;
            }
            this.A03 = interfaceC0279Bb.A7a() - this.A04;
            z = A0A(this.A0C.A02(), this.A04, this.A09);
            if (z) {
                this.A04 = interfaceC0279Bb.A7a();
            }
        }
        this.A00 = this.A09.A00.A0C;
        boolean readingHeaders2 = this.A0A;
        if (!readingHeaders2) {
            this.A07.A5j(this.A09.A00);
            this.A0A = true;
        }
        if (this.A09.A01 != null) {
            this.A08 = this.A09.A01;
        } else if (interfaceC0279Bb.A7B() == -1) {
            this.A08 = new WU();
        } else {
            CS firstPayloadPageHeader = this.A0C.A01();
            this.A08 = new C0794Wa(this.A04, interfaceC0279Bb.A7B(), this, firstPayloadPageHeader.A01 + firstPayloadPageHeader.A00, firstPayloadPageHeader.A05);
        }
        this.A09 = null;
        this.A01 = 2;
        this.A0C.A04();
        return 0;
    }

    private int A01(InterfaceC0279Bb interfaceC0279Bb, C0283Bh c0283Bh) throws IOException, InterruptedException {
        long position = this.A08.AEA(interfaceC0279Bb);
        if (position >= 0) {
            c0283Bh.A00 = position;
            return 1;
        }
        if (position < -1) {
            A08(-(2 + position));
        }
        if (!this.A0B) {
            this.A06.AEx(this.A08.A4i());
            this.A0B = true;
        }
        if (this.A03 <= 0 && !this.A0C.A05(interfaceC0279Bb)) {
            this.A01 = 3;
            return -1;
        }
        this.A03 = 0L;
        C0420Hh A02 = this.A0C.A02();
        long A07 = A07(A02);
        if (A07 >= 0) {
            long j = this.A02;
            long granulesInPacket = j + A07;
            if (granulesInPacket >= this.A05) {
                long A03 = A03(j);
                this.A07.AEr(A02, A02.A07());
                this.A07.AEs(A03, 1, A02.A07(), 0, null);
                this.A05 = -1L;
            }
        }
        this.A02 += A07;
        return 0;
    }

    public final int A02(InterfaceC0279Bb interfaceC0279Bb, C0283Bh c0283Bh) throws IOException, InterruptedException {
        switch (this.A01) {
            case 0:
                return A00(interfaceC0279Bb);
            case 1:
                interfaceC0279Bb.AFe((int) this.A04);
                this.A01 = 2;
                return 0;
            case 2:
                return A01(interfaceC0279Bb, c0283Bh);
            default:
                throw new IllegalStateException();
        }
    }

    public final long A03(long j) {
        return (1000000 * j) / this.A00;
    }

    public final long A04(long j) {
        return (this.A00 * j) / 1000000;
    }

    public final void A05(long j, long j2) {
        this.A0C.A03();
        if (j == 0) {
            boolean z = !this.A0B;
            String[] strArr = A0D;
            if (strArr[6].charAt(24) == strArr[7].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[4] = "k4zvnx9t3uHSh6LLctIVLoh0Ftprjk2l";
            strArr2[5] = "HhnKvAaHZTpmoBA85UMRj52n1m1tHG3b";
            A09(z);
            return;
        }
        if (this.A01 == 0) {
            return;
        }
        this.A05 = this.A08.AFm(j2);
        this.A01 = 2;
    }

    public final void A06(InterfaceC0280Bc interfaceC0280Bc, InterfaceC0288Bm interfaceC0288Bm) {
        this.A06 = interfaceC0280Bc;
        this.A07 = interfaceC0288Bm;
        A09(true);
    }

    public void A08(long j) {
        this.A02 = j;
    }

    public void A09(boolean z) {
        if (z) {
            this.A09 = new CV();
            this.A04 = 0L;
            this.A01 = 0;
        } else {
            this.A01 = 1;
        }
        this.A05 = -1L;
        this.A02 = 0L;
    }
}
