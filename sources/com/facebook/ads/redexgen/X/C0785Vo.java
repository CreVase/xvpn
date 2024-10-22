package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Vo, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0785Vo implements E2 {
    public static String[] A06 = {"z6XOcFfUlZLiYF0seOLnv3ze9s0DdTB", "", "kOUqzIhQkth8unrmunVXM7OloxceXCp", "vNZflObtCpyDQVnjonlKme7G1XHf5P9t", "ltwdc1Rff3GtcYqOYiouDHeI", "qE08X0G6Jnym0xvk75ZNBZoUEwP5MAza", "Z6LnFft16t74Gtd3ASLNWwB", "zHF"};
    public final C0395Gg A00;
    public final H2 A01;
    public final V0 A02;
    public final C0424Hl A04;
    public final H7 A03 = new H7();
    public final AtomicBoolean A05 = new AtomicBoolean();

    public C0785Vo(Uri uri, String str, E3 e3) {
        this.A00 = new C0395Gg(uri, 0L, -1L, str, 0);
        this.A01 = e3.A00();
        this.A02 = e3.A01(false);
        this.A04 = e3.A02();
    }

    @Override // com.facebook.ads.redexgen.X.E2
    public final void A58() throws InterruptedException, IOException {
        this.A04.A00(-1000);
        try {
            H8.A03(this.A00, this.A01, this.A02, new byte[131072], this.A04, -1000, this.A03, this.A05, true);
        } finally {
            this.A04.A03(-1000);
        }
    }

    @Override // com.facebook.ads.redexgen.X.E2
    public final float A6h() {
        long j = this.A03.A01;
        if (j == -1) {
            return -1.0f;
        }
        long contentLength = this.A03.A00();
        float f = ((float) contentLength) * 100.0f;
        if (A06[3].charAt(18) != 'l') {
            throw new RuntimeException();
        }
        A06[5] = "hhB6jfIM7FzfpB2Im4JpX4ZUe2epnCaG";
        return f / ((float) j);
    }

    @Override // com.facebook.ads.redexgen.X.E2
    public final long A6i() {
        return this.A03.A00();
    }

    @Override // com.facebook.ads.redexgen.X.E2
    public final void cancel() {
        this.A05.set(true);
    }

    @Override // com.facebook.ads.redexgen.X.E2
    public final void remove() {
        H8.A05(this.A01, H8.A02(this.A00));
    }
}
