package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class WG implements InterfaceC0299Cg {
    public static byte[] A06;
    public static String[] A07 = {"3GVDuA8wFVUyMgpUpbIewfrR9H99KrEk", "JlICi14zqaUcthBIG11pWTw91wh2yVCw", "SCc1nWfYKQsHAUfYf8T5wZndFViKre8j", "glAeXwJzdtWksZ9B0aFClAzpFAfPstjY", "", "MoUOfVVsEVomZ5Pq9PB", "UtG2kZW99inEJ5Gw9pPEuhVI3SuCWANI", "WpnQHVSEOc3lam6iocwMhSGypVEKzNDF"};
    public int A00;
    public int A01;
    public long A02;
    public InterfaceC0288Bm A03;
    public boolean A04;
    public final C0420Hh A05 = new C0420Hh(10);

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            if (A07[3].charAt(3) == 'p') {
                throw new RuntimeException();
            }
            A07[3] = "8BWuaIrledIbOr1Vvmzlm7GxjPqtlOKX";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 54);
            i4++;
        }
    }

    public static void A01() {
        A06 = new byte[]{121, 84, 78, 94, 92, 79, 89, 84, 83, 90, 29, 84, 83, 75, 92, 81, 84, 89, 29, 116, 121, 14, 29, 73, 92, 90, 22, 59, 108, 13, 58, 62, 59, 58, 45, 43, 58, 58, 38, 35, 41, 43, 62, 35, 37, 36, 101, 35, 46, 121};
    }

    static {
        A01();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:            if (51 != r7) goto L19;     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b8, code lost:            r8.A05.A0Z(3);        r8.A01 = r8.A05.A0D() + 10;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00af, code lost:            if (51 != r7) goto L19;     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A4O(com.facebook.ads.redexgen.X.C0420Hh r9) {
        /*
            Method dump skipped, instructions count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.WG.A4O(com.facebook.ads.redexgen.X.Hh):void");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void A4l(InterfaceC0280Bc interfaceC0280Bc, C0310Cu c0310Cu) {
        c0310Cu.A05();
        InterfaceC0288Bm AFx = interfaceC0280Bc.AFx(c0310Cu.A03(), 4);
        this.A03 = AFx;
        AFx.A5j(Format.A0B(c0310Cu.A04(), A00(35, 15, 124), null, -1, null));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void ADi() {
        int i;
        if (!this.A04 || (i = this.A01) == 0 || this.A00 != i) {
            return;
        }
        this.A03.AEs(this.A02, 1, i, 0, null);
        this.A04 = false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void ADj(long j, boolean z) {
        if (!z) {
            return;
        }
        this.A04 = true;
        this.A02 = j;
        this.A01 = 0;
        this.A00 = 0;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0299Cg
    public final void AEv() {
        this.A04 = false;
    }
}
