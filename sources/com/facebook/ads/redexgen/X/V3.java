package com.facebook.ads.redexgen.X;

import android.net.Uri;
import java.io.IOException;

/* loaded from: assets/audience_network.dex */
public final class V3 implements InterfaceC0391Gc {
    public static String[] A04 = {"X6WlBdbGeBIUy9RcgyD1kPyvMH5gl65h", "mWixtdhRvEEOtO49Z6LrUITCnd", "19dVuEeyHaOsnSLi", "Fh0FDziHvuuc46M8RjDn", "TMNOdV", "BntQd7XboiQ5Pp5LCDj1cbVKSXS32D1x", "NrlP0Z8V9f9J6rKzzcCufZh8yiDjfbRh", "BOidXQkRBMfwkg7VYmAkrOpgeHcKVKv0"};
    public long A00;
    public boolean A01;
    public final InterfaceC0389Ga A02;
    public final InterfaceC0391Gc A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 18 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final long ADb(C0395Gg c0395Gg) throws IOException {
        long ADb = this.A03.ADb(c0395Gg);
        this.A00 = ADb;
        if (ADb == 0) {
            return 0L;
        }
        if (c0395Gg.A02 == -1 && this.A00 != -1) {
            c0395Gg = new C0395Gg(c0395Gg.A04, c0395Gg.A01, c0395Gg.A03, this.A00, c0395Gg.A05, c0395Gg.A00);
        }
        this.A01 = true;
        this.A02.ADd(c0395Gg);
        return this.A00;
    }

    public V3(InterfaceC0391Gc interfaceC0391Gc, InterfaceC0389Ga interfaceC0389Ga) {
        this.A03 = (InterfaceC0391Gc) HI.A01(interfaceC0391Gc);
        this.A02 = (InterfaceC0389Ga) HI.A01(interfaceC0389Ga);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final Uri A85() {
        return this.A03.A85();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final void close() throws IOException {
        try {
            this.A03.close();
            if (this.A01) {
                this.A01 = false;
                this.A02.close();
            }
        } catch (Throwable th) {
            boolean z = this.A01;
            if (A04[5].charAt(29) != 'a') {
                A04[1] = "CXpRjqYaQVmivrsYVOmY1oz";
                if (z) {
                    this.A01 = false;
                    InterfaceC0389Ga interfaceC0389Ga = this.A02;
                    if (A04[1].length() != 2) {
                        A04[5] = "FmRI3fMemMJaQGBcEYhbAky7hUfnuUR1";
                        interfaceC0389Ga.close();
                    }
                }
                throw th;
            }
            throw new RuntimeException();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0391Gc
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.A00 == 0) {
            return -1;
        }
        int read = this.A03.read(bArr, i, i2);
        if (read > 0) {
            this.A02.write(bArr, i, read);
            long j = this.A00;
            if (j != -1) {
                this.A00 = j - read;
            }
        }
        return read;
    }
}
