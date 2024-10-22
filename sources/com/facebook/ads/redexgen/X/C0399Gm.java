package com.facebook.ads.redexgen.X;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.Gm, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0399Gm extends IOException {
    public final int A00;
    public final C0395Gg A01;

    public C0399Gm(IOException iOException, C0395Gg c0395Gg, int i) {
        super(iOException);
        this.A01 = c0395Gg;
        this.A00 = i;
    }

    public C0399Gm(String str, C0395Gg c0395Gg, int i) {
        super(str);
        this.A01 = c0395Gg;
        this.A00 = i;
    }

    public C0399Gm(String str, IOException iOException, C0395Gg c0395Gg, int i) {
        super(str, iOException);
        this.A01 = c0395Gg;
        this.A00 = i;
    }
}
