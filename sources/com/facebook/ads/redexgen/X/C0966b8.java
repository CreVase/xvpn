package com.facebook.ads.redexgen.X;

import java.io.ByteArrayInputStream;

/* renamed from: com.facebook.ads.redexgen.X.b8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0966b8 implements C0K {
    public ByteArrayInputStream A00;
    public final byte[] A01;

    public C0966b8(byte[] bArr) {
        this.A01 = bArr;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void ADc(int i) throws C0965b7 {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.A01);
        this.A00 = byteArrayInputStream;
        byteArrayInputStream.skip(i);
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final void close() throws C0965b7 {
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int length() throws C0965b7 {
        return this.A01.length;
    }

    @Override // com.facebook.ads.redexgen.X.C0K
    public final int read(byte[] bArr) throws C0965b7 {
        return this.A00.read(bArr, 0, bArr.length);
    }
}
