package com.facebook.ads.redexgen.X;

import android.util.Log;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.9a, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C02279a {
    public static byte[] A0F;
    public long A00;
    public C02279a A01;
    public C02289b A02;
    public TrackGroupArray A03;
    public GS A04;
    public boolean A05;
    public boolean A06;
    public GS A07;
    public final InterfaceC0777Vg A08;
    public final Object A09;
    public final InterfaceC0356Et[] A0A;
    public final boolean[] A0B;
    public final EY A0C;
    public final GR A0D;
    public final InterfaceC02459s[] A0E;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 30);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0F = new byte[]{79, 103, 102, 107, 99, 82, 103, 112, 107, 109, 102, 74, 109, 110, 102, 103, 112, 81, 100, 115, 104, 110, 101, 33, 115, 100, 109, 100, 96, 114, 100, 33, 103, 96, 104, 109, 100, 101, 47};
    }

    public C02279a(InterfaceC02459s[] interfaceC02459sArr, long j, GR gr, GU gu, EY ey, Object obj, C02289b c02289b) {
        this.A0E = interfaceC02459sArr;
        this.A00 = j - c02289b.A03;
        this.A0D = gr;
        this.A0C = ey;
        this.A09 = HI.A01(obj);
        this.A02 = c02289b;
        this.A0A = new InterfaceC0356Et[interfaceC02459sArr.length];
        this.A0B = new boolean[interfaceC02459sArr.length];
        InterfaceC0777Vg A4g = ey.A4g(c02289b.A04, gu);
        this.A08 = c02289b.A02 != Long.MIN_VALUE ? new BW(A4g, true, 0L, c02289b.A02) : A4g;
    }

    /* JADX WARN: Incorrect condition in loop: B:3:0x0003 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A02(com.facebook.ads.redexgen.X.GS r4) {
        /*
            r3 = this;
            r2 = 0
        L1:
            int r0 = r4.A00
            if (r2 >= r0) goto L19
            boolean r1 = r4.A00(r2)
            com.facebook.ads.redexgen.X.GP r0 = r4.A01
            com.facebook.ads.redexgen.X.GO r0 = r0.A00(r2)
            if (r1 == 0) goto L16
            if (r0 == 0) goto L16
            r0.A5P()
        L16:
            int r2 = r2 + 1
            goto L1
        L19:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C02279a.A02(com.facebook.ads.redexgen.X.GS):void");
    }

    private void A03(GS gs) {
        GS gs2 = this.A07;
        this.A07 = gs;
        if (gs != null) {
            A02(gs);
        }
    }

    private void A04(InterfaceC0356Et[] interfaceC0356EtArr) {
        int i = 0;
        while (true) {
            InterfaceC02459s[] interfaceC02459sArr = this.A0E;
            int i2 = interfaceC02459sArr.length;
            if (i < i2) {
                if (interfaceC02459sArr[i].A83() == 5 && this.A04.A00(i)) {
                    interfaceC0356EtArr[i] = new C0782Vl();
                }
                i++;
            } else {
                return;
            }
        }
    }

    private void A05(InterfaceC0356Et[] interfaceC0356EtArr) {
        int i = 0;
        while (true) {
            InterfaceC02459s[] interfaceC02459sArr = this.A0E;
            int i2 = interfaceC02459sArr.length;
            if (i < i2) {
                if (interfaceC02459sArr[i].A83() == 5) {
                    interfaceC0356EtArr[i] = null;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final long A06() {
        if (this.A06) {
            return this.A08.A7M();
        }
        return 0L;
    }

    public final long A07() {
        return this.A00;
    }

    public final long A08(long j) {
        return j - A07();
    }

    public final long A09(long j) {
        return A07() + j;
    }

    public final long A0A(long j, boolean z) {
        return A0B(j, z, new boolean[this.A0E.length]);
    }

    public final long A0B(long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            int i2 = this.A04.A00;
            boolean z2 = false;
            if (i >= i2) {
                break;
            }
            boolean[] zArr2 = this.A0B;
            if (!z && this.A04.A02(this.A07, i)) {
                z2 = true;
            }
            zArr2[i] = z2;
            i++;
        }
        A05(this.A0A);
        A03(this.A04);
        GP gp = this.A04.A01;
        long AF1 = this.A08.AF1(gp.A01(), this.A0B, this.A0A, zArr, j);
        A04(this.A0A);
        this.A05 = false;
        int i3 = 0;
        while (true) {
            InterfaceC0356Et[] interfaceC0356EtArr = this.A0A;
            if (i3 < interfaceC0356EtArr.length) {
                if (interfaceC0356EtArr[i3] != null) {
                    HI.A04(this.A04.A00(i3));
                    int i4 = this.A0E[i3].A83();
                    if (i4 != 5) {
                        this.A05 = true;
                    }
                } else {
                    HI.A04(gp.A00(i3) == null);
                }
                i3++;
            } else {
                return AF1;
            }
        }
    }

    public final long A0C(boolean z) {
        if (!this.A06) {
            return this.A02.A03;
        }
        long A68 = this.A08.A68();
        if (A68 == Long.MIN_VALUE && z) {
            return this.A02.A01;
        }
        return A68;
    }

    public final void A0D() {
        A03(null);
        try {
            if (this.A02.A02 != Long.MIN_VALUE) {
                this.A0C.AET(((BW) this.A08).A05);
            } else {
                this.A0C.AET(this.A08);
            }
        } catch (RuntimeException e) {
            Log.e(A00(0, 17, 28), A00(17, 22, 31), e);
        }
    }

    public final void A0E(float f) throws C9K {
        this.A06 = true;
        this.A03 = this.A08.A82();
        A0I(f);
        long A0A = A0A(this.A02.A03, false);
        long j = this.A00;
        long newStartPositionUs = this.A02.A03;
        this.A00 = j + (newStartPositionUs - A0A);
        this.A02 = this.A02.A01(A0A);
    }

    public final void A0F(long j) {
        this.A08.A4Q(A08(j));
    }

    public final void A0G(long j) {
        if (this.A06) {
            this.A08.AEK(A08(j));
        }
    }

    public final boolean A0H() {
        return this.A06 && (!this.A05 || this.A08.A68() == Long.MIN_VALUE);
    }

    public final boolean A0I(float f) throws C9K {
        GS A0T = this.A0D.A0T(this.A0E, this.A03);
        GS selectorResult = this.A07;
        if (A0T.A01(selectorResult)) {
            return false;
        }
        this.A04 = A0T;
        for (GO go : A0T.A01.A01()) {
            if (go != null) {
                go.ACP(f);
            }
        }
        return true;
    }
}
