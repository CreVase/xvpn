package com.facebook.ads.redexgen.X;

import android.media.MediaCodec;

/* renamed from: com.facebook.ads.redexgen.X.As, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0270As {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public byte[] A04;
    public byte[] A05;
    public int[] A06;
    public int[] A07;
    public final MediaCodec.CryptoInfo A08;
    public final C0269Ar A09;

    public C0270As() {
        MediaCodec.CryptoInfo A00 = C0436Hx.A02 >= 16 ? A00() : null;
        this.A08 = A00;
        this.A09 = C0436Hx.A02 >= 24 ? new C0269Ar(A00) : null;
    }

    private MediaCodec.CryptoInfo A00() {
        return new MediaCodec.CryptoInfo();
    }

    private void A01() {
        this.A08.numSubSamples = this.A03;
        this.A08.numBytesOfClearData = this.A06;
        this.A08.numBytesOfEncryptedData = this.A07;
        this.A08.key = this.A05;
        this.A08.iv = this.A04;
        this.A08.mode = this.A02;
        if (C0436Hx.A02 >= 24) {
            this.A09.A00(this.A01, this.A00);
        }
    }

    public final MediaCodec.CryptoInfo A02() {
        return this.A08;
    }

    public final void A03(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.A03 = i;
        this.A06 = iArr;
        this.A07 = iArr2;
        this.A05 = bArr;
        this.A04 = bArr2;
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        if (C0436Hx.A02 >= 16) {
            A01();
        }
    }
}
