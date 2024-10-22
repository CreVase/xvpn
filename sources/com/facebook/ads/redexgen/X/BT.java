package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import com.facebook.ads.internal.exoplayer2.thirdparty.Format;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroup;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class BT implements InterfaceC0777Vg, InterfaceC0280Bc, InterfaceC0401Go<C0781Vk>, InterfaceC0404Gr, InterfaceC0355Es {
    public static byte[] A0c;
    public static String[] A0d = {"uM3", "HhtEoeszujhq2hqW803X6wAUFNr2yIvk", "llgRlYE2HHrDKVr9Tlv1gg4sawaKL", "gd26Zevc0BeMQVnsPvgEWj4kMHitbDqE", "B56DgxYfwXnRdFUWoxgY8ZwWxUmrPQlR", "o6X9hbG4Io42IRbcZylLcsRNIhbJFPRA", "SBfu1SOz9uKNnyoy8", "5PtJb97AhuhjIJJCziWFyl83Esr9CMYA"};
    public int A00;
    public int A01;
    public int A02;
    public long A04;
    public InterfaceC0285Bj A07;
    public InterfaceC0778Vh A08;
    public TrackGroupArray A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean[] A0L;
    public boolean[] A0M;
    public boolean[] A0N;
    public final int A0O;
    public final long A0P;
    public final Uri A0Q;
    public final ES A0S;
    public final ET A0T;
    public final C0346Ej A0U;
    public final GU A0V;
    public final InterfaceC0391Gc A0W;
    public final String A0b;
    public final V6 A0X = new V6(A07(0, 27, 27));
    public final HO A0Y = new HO();
    public final Runnable A0Z = new EQ(this);
    public final Runnable A0a = new ER(this);
    public final Handler A0R = new Handler();
    public int[] A0J = new int[0];
    public C0776Vf[] A0K = new C0776Vf[0];
    public long A06 = -9223372036854775807L;
    public long A05 = -1;
    public long A03 = -9223372036854775807L;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0c, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 25);
        }
        return new String(copyOfRange);
    }

    public static void A0B() {
        A0c = new byte[]{78, 109, 99, 102, 103, 112, 56, 71, 122, 118, 112, 99, 97, 118, 109, 112, 79, 103, 102, 107, 99, 82, 103, 112, 107, 109, 102};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 20 out of bounds for length 16
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0777Vg
    public final long AF1(GO[] goArr, boolean[] zArr, InterfaceC0356Et[] interfaceC0356EtArr, boolean[] zArr2, long j) {
        int i;
        HI.A04(this.A0F);
        int i2 = this.A01;
        int i3 = 0;
        while (true) {
            int i4 = 0;
            if (i3 >= goArr.length) {
                boolean z = !this.A0I ? j == 0 : i2 != 0;
                for (int i5 = 0; i5 < goArr.length; i5++) {
                    if (interfaceC0356EtArr[i5] == null && goArr[i5] != null) {
                        GO go = goArr[i5];
                        HI.A04(go.length() == 1);
                        HI.A04(go.A75(0) == 0);
                        int A00 = this.A09.A00(go.A81());
                        HI.A04(!this.A0L[A00]);
                        this.A01++;
                        this.A0L[A00] = true;
                        interfaceC0356EtArr[i5] = new C0780Vj(this, A00);
                        zArr2[i5] = true;
                        if (!z) {
                            C0776Vf c0776Vf = this.A0K[A00];
                            c0776Vf.A0J();
                            z = c0776Vf.A0D(j, true, true) == -1 && c0776Vf.A0B() != 0;
                        }
                    }
                }
                if (this.A01 == 0) {
                    this.A0E = false;
                    this.A0D = false;
                    if (this.A0X.A08()) {
                        C0776Vf[] c0776VfArr = this.A0K;
                        int length = c0776VfArr.length;
                        while (i4 < length) {
                            c0776VfArr[i4].A0H();
                            i4++;
                        }
                        this.A0X.A05();
                    } else {
                        C0776Vf[] c0776VfArr2 = this.A0K;
                        int length2 = c0776VfArr2.length;
                        while (i4 < length2) {
                            c0776VfArr2[i4].A0I();
                            i4++;
                        }
                    }
                } else if (z) {
                    j = AF0(j);
                    for (int i6 = 0; i6 < interfaceC0356EtArr.length; i6++) {
                        if (interfaceC0356EtArr[i6] != null) {
                            zArr2[i6] = true;
                        }
                    }
                }
                this.A0I = true;
                return j;
            }
            InterfaceC0356Et interfaceC0356Et = interfaceC0356EtArr[i3];
            String[] strArr = A0d;
            if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            A0d[2] = "mg4ta7ka0nUwB4FGZ9fOP";
            if (interfaceC0356Et != null && (goArr[i3] == null || !zArr[i3])) {
                i = ((C0780Vj) interfaceC0356EtArr[i3]).A00;
                HI.A04(this.A0L[i]);
                this.A01--;
                this.A0L[i] = false;
                interfaceC0356EtArr[i3] = null;
            }
            i3++;
        }
    }

    static {
        A0B();
    }

    public BT(Uri uri, InterfaceC0391Gc interfaceC0391Gc, InterfaceC0278Ba[] interfaceC0278BaArr, int i, C0346Ej c0346Ej, ET et, GU gu, String str, int i2) {
        this.A0Q = uri;
        this.A0W = interfaceC0391Gc;
        this.A0O = i;
        this.A0U = c0346Ej;
        this.A0T = et;
        this.A0V = gu;
        this.A0b = str;
        this.A0P = i2;
        this.A0S = new ES(interfaceC0278BaArr, this);
        this.A00 = i == -1 ? 3 : i;
        c0346Ej.A03();
    }

    private int A00() {
        int i = 0;
        for (C0776Vf c0776Vf : this.A0K) {
            int extractedSamplesCount = c0776Vf.A0C();
            i += extractedSamplesCount;
        }
        return i;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0401Go
    /* renamed from: A01 */
    public final int ABs(C0781Vk c0781Vk, long j, long j2, IOException iOException) {
        C0395Gg c0395Gg;
        long j3;
        long j4;
        boolean isErrorFatal = A0N(iOException);
        C0346Ej c0346Ej = this.A0U;
        c0395Gg = c0781Vk.A03;
        j3 = c0781Vk.A02;
        long j5 = this.A03;
        j4 = c0781Vk.A00;
        c0346Ej.A0H(c0395Gg, 1, -1, null, 0, null, j3, j5, j, j2, j4, iOException, isErrorFatal);
        A0E(c0781Vk);
        if (isErrorFatal) {
            return 3;
        }
        int A00 = A00();
        boolean madeProgress = A00 > this.A02;
        if (A0L(c0781Vk, A00)) {
            return madeProgress ? 1 : 0;
        }
        return 2;
    }

    private long A02() {
        long j = Long.MIN_VALUE;
        for (C0776Vf c0776Vf : this.A0K) {
            long largestQueuedTimestampUs = c0776Vf.A0F();
            j = Math.max(j, largestQueuedTimestampUs);
        }
        return j;
    }

    public void A09() {
        if (this.A0G || this.A0F || this.A07 == null || !this.A0H) {
            return;
        }
        for (C0776Vf c0776Vf : this.A0K) {
            if (c0776Vf.A0G() == null) {
                return;
            }
        }
        this.A0Y.A01();
        int length = this.A0K.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        this.A0N = new boolean[length];
        this.A0L = new boolean[length];
        this.A0M = new boolean[length];
        this.A03 = this.A07.A6k();
        int i = 0;
        while (true) {
            boolean isAudioVideo = true;
            if (i >= length) {
                break;
            }
            Format A0G = this.A0K[i].A0G();
            trackGroupArr[i] = new TrackGroup(A0G);
            String str = A0G.A0O;
            if (!C0413Ha.A0B(str) && !C0413Ha.A09(str)) {
                isAudioVideo = false;
            }
            this.A0N[i] = isAudioVideo;
            this.A0A |= isAudioVideo;
            i++;
        }
        this.A09 = new TrackGroupArray(trackGroupArr);
        if (this.A0O == -1 && this.A05 == -1 && this.A07.A6k() == -9223372036854775807L) {
            String[] strArr = A0d;
            String str2 = strArr[4];
            String str3 = strArr[5];
            int charAt = str2.charAt(19);
            int trackCount = str3.charAt(19);
            if (charAt == trackCount) {
                throw new RuntimeException();
            }
            A0d[2] = "7a3gC0RfnKvRSexgB6r2d4KLSEZ";
            this.A00 = 6;
        }
        this.A0F = true;
        this.A0T.ACy(this.A03, this.A07.A95());
        this.A08.ACW(this);
    }

    private void A0A() {
        C0395Gg c0395Gg;
        long j;
        C0781Vk c0781Vk = new C0781Vk(this, this.A0Q, this.A0W, this.A0S, this.A0Y);
        if (this.A0F) {
            HI.A04(A0I());
            long j2 = this.A03;
            if (j2 != -9223372036854775807L && this.A06 >= j2) {
                this.A0B = true;
                this.A06 = -9223372036854775807L;
                return;
            } else {
                c0781Vk.A04(this.A07.A7l(this.A06).A00.A00, this.A06);
                this.A06 = -9223372036854775807L;
            }
        }
        this.A02 = A00();
        long A04 = this.A0X.A04(c0781Vk, this, this.A00);
        C0346Ej c0346Ej = this.A0U;
        c0395Gg = c0781Vk.A03;
        j = c0781Vk.A02;
        c0346Ej.A0E(c0395Gg, 1, -1, null, 0, null, j, this.A03, A04);
    }

    private void A0C(int i) {
        if (!this.A0M[i]) {
            Format A01 = this.A09.A01(i).A01(0);
            this.A0U.A06(C0413Ha.A01(A01.A0O), A01, 0, null, this.A04);
            boolean[] zArr = this.A0M;
            if (A0d[2].length() == 31) {
                throw new RuntimeException();
            }
            A0d[2] = "eh27oOHcwVOmHzYfi8kDTS";
            zArr[i] = true;
        }
    }

    private void A0D(int i) {
        if (this.A0E && this.A0N[i] && !this.A0K[i].A0M()) {
            String[] strArr = A0d;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[6] = "sgNFiq5UDquEcD4Be";
            strArr2[0] = "0a9";
            this.A06 = 0L;
            this.A0E = false;
            this.A0D = true;
            this.A04 = 0L;
            this.A02 = 0;
            for (C0776Vf c0776Vf : this.A0K) {
                c0776Vf.A0I();
            }
            this.A08.AAx(this);
        }
    }

    private void A0E(C0781Vk c0781Vk) {
        long j;
        if (this.A05 != -1) {
            return;
        }
        j = c0781Vk.A01;
        this.A05 = j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0401Go
    /* renamed from: A0F */
    public final void ABr(C0781Vk c0781Vk, long j, long j2) {
        C0395Gg c0395Gg;
        long j3;
        long j4;
        long j5;
        if (this.A03 == -9223372036854775807L) {
            long A02 = A02();
            if (A02 == Long.MIN_VALUE) {
                j5 = 0;
            } else {
                j5 = 10000 + A02;
            }
            this.A03 = j5;
            this.A0T.ACy(j5, this.A07.A95());
        }
        C0346Ej c0346Ej = this.A0U;
        c0395Gg = c0781Vk.A03;
        j3 = c0781Vk.A02;
        long j6 = this.A03;
        j4 = c0781Vk.A00;
        c0346Ej.A0G(c0395Gg, 1, -1, null, 0, null, j3, j6, j, j2, j4);
        A0E(c0781Vk);
        this.A0B = true;
        this.A08.AAx(this);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0401Go
    /* renamed from: A0G */
    public final void ABp(C0781Vk c0781Vk, long j, long j2, boolean z) {
        C0395Gg c0395Gg;
        long j3;
        long j4;
        C0346Ej c0346Ej = this.A0U;
        c0395Gg = c0781Vk.A03;
        j3 = c0781Vk.A02;
        long j5 = this.A03;
        j4 = c0781Vk.A00;
        c0346Ej.A0F(c0395Gg, 1, -1, null, 0, null, j3, j5, j, j2, j4);
        if (!z) {
            A0E(c0781Vk);
            for (C0776Vf c0776Vf : this.A0K) {
                c0776Vf.A0I();
            }
            if (this.A01 > 0) {
                this.A08.AAx(this);
            }
        }
    }

    private boolean A0I() {
        return this.A06 != -9223372036854775807L;
    }

    private boolean A0J() {
        return this.A0D || A0I();
    }

    private boolean A0K(long j) {
        int length = this.A0K.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                return true;
            }
            C0776Vf c0776Vf = this.A0K[i];
            c0776Vf.A0J();
            int i2 = c0776Vf.A0D(j, true, false);
            boolean seekInsideQueue = i2 != -1;
            if (!seekInsideQueue) {
                if (this.A0N[i]) {
                    break;
                }
                boolean z = this.A0A;
                String[] strArr = A0d;
                String str = strArr[4];
                String str2 = strArr[5];
                int i3 = str.charAt(19);
                int trackCount = str2.charAt(19);
                if (i3 == trackCount) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A0d;
                strArr2[7] = "iCn5X7g6PoYVWCe4GwpQYWYt9drfTGBT";
                strArr2[1] = "IDd3eJ2NBG0wgz78gdspZyWtrcrofueQ";
                if (!z) {
                    break;
                }
            }
            i++;
        }
        return false;
    }

    private boolean A0L(C0781Vk c0781Vk, int i) {
        InterfaceC0285Bj interfaceC0285Bj;
        if (this.A05 != -1 || ((interfaceC0285Bj = this.A07) != null && interfaceC0285Bj.A6k() != -9223372036854775807L)) {
            this.A02 = i;
            if (A0d[2].length() == 31) {
                throw new RuntimeException();
            }
            String[] strArr = A0d;
            strArr[6] = "F1SGTXFlfQdsRtCv2";
            strArr[0] = "c29";
            return true;
        }
        if (this.A0F && !A0J()) {
            this.A0E = true;
            return false;
        }
        this.A0D = this.A0F;
        this.A04 = 0L;
        this.A02 = 0;
        for (C0776Vf c0776Vf : this.A0K) {
            c0776Vf.A0I();
        }
        c0781Vk.A04(0L, 0L);
        return true;
    }

    public static boolean A0N(IOException iOException) {
        return iOException instanceof C0774Vd;
    }

    public final int A0O(int i, long j) {
        int A0D;
        if (A0J()) {
            return 0;
        }
        C0776Vf c0776Vf = this.A0K[i];
        if (this.A0B && j > c0776Vf.A0F()) {
            A0D = c0776Vf.A0A();
        } else {
            A0D = c0776Vf.A0D(j, true, true);
            String[] strArr = A0d;
            String str = strArr[4];
            String str2 = strArr[5];
            int skipCount = str.charAt(19);
            if (skipCount == str2.charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[6] = "NIYG9FQCzFZSe10IE";
            strArr2[0] = "6cN";
            if (A0D == -1) {
                A0D = 0;
            }
        }
        if (A0D > 0) {
            A0C(i);
        } else {
            A0D(i);
        }
        return A0D;
    }

    public final int A0P(int i, C9X c9x, XE xe, boolean z) {
        if (A0J()) {
            return -3;
        }
        int A0E = this.A0K[i].A0E(c9x, xe, z, this.A0B, this.A04);
        if (A0E == -4) {
            A0C(i);
        } else if (A0E == -3) {
            A0D(i);
        }
        return A0E;
    }

    public final void A0Q() throws IOException {
        this.A0X.A06(this.A00);
    }

    public final void A0R() {
        if (this.A0F) {
            for (C0776Vf c0776Vf : this.A0K) {
                c0776Vf.A0H();
            }
        }
        this.A0X.A07(this);
        this.A0R.removeCallbacksAndMessages(null);
        this.A08 = null;
        this.A0G = true;
        this.A0U.A04();
    }

    public final boolean A0S(int i) {
        return !A0J() && (this.A0B || this.A0K[i].A0M());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0777Vg
    public final boolean A4Q(long j) {
        if (this.A0B || this.A0E) {
            return false;
        }
        if (this.A0F && this.A01 == 0) {
            return false;
        }
        boolean A02 = this.A0Y.A02();
        boolean continuedLoading = this.A0X.A08();
        if (!continuedLoading) {
            A0A();
            return true;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0777Vg
    public final void A55(long j, boolean z) {
        int length = this.A0K.length;
        for (int i = 0; i < length; i++) {
            this.A0K[i].A0K(j, z, this.A0L[i]);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0280Bc
    public final void A5T() {
        this.A0H = true;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0777Vg
    public final long A5s(long j, C02489v c02489v) {
        if (!this.A07.A95()) {
            return 0L;
        }
        C0284Bi A7l = this.A07.A7l(j);
        return C0436Hx.A0I(j, c02489v, A7l.A00.A01, A7l.A01.A01);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0777Vg
    public final long A68() {
        long A02;
        if (this.A0B) {
            return Long.MIN_VALUE;
        }
        if (A0I()) {
            long j = this.A06;
            String[] strArr = A0d;
            if (strArr[7].charAt(26) != strArr[1].charAt(26)) {
                throw new RuntimeException();
            }
            A0d[3] = "ld4wWqv9tK9nTvU7QEEl8vpde5wWqGSi";
            return j;
        }
        if (this.A0A) {
            A02 = Long.MAX_VALUE;
            int i = this.A0K.length;
            for (int i2 = 0; i2 < i; i2++) {
                if (this.A0N[i2]) {
                    A02 = Math.min(A02, this.A0K[i2].A0F());
                }
            }
        } else {
            A02 = A02();
        }
        if (A02 == Long.MIN_VALUE) {
            return this.A04;
        }
        return A02;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0777Vg
    public final long A7M() {
        if (this.A01 == 0) {
            return Long.MIN_VALUE;
        }
        return A68();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0777Vg
    public final TrackGroupArray A82() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0777Vg
    public final void AA3() throws IOException {
        A0Q();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0404Gr
    public final void ABw() {
        for (C0776Vf c0776Vf : this.A0K) {
            c0776Vf.A0I();
        }
        this.A0S.A03();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0355Es
    public final void ADI(Format format) {
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0777Vg
    public final void ADu(InterfaceC0778Vh interfaceC0778Vh, long j) {
        this.A08 = interfaceC0778Vh;
        this.A0Y.A02();
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0777Vg
    public final long AED() {
        if (!this.A0C) {
            this.A0U.A05();
            this.A0C = true;
        }
        boolean z = this.A0D;
        String[] strArr = A0d;
        if (strArr[6].length() != strArr[0].length()) {
            A0d[2] = "";
            if (z && (this.A0B || A00() > this.A02)) {
                this.A0D = false;
                return this.A04;
            }
            String[] strArr2 = A0d;
            if (strArr2[7].charAt(26) == strArr2[1].charAt(26)) {
                String[] strArr3 = A0d;
                strArr3[4] = "a8TiTKBNhx8jXxPRrcAgh1BUcIw96G2f";
                strArr3[5] = "NHpS1UqcJuZi4hHtySMRiLK65X8yfSYb";
                return -9223372036854775807L;
            }
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0777Vg
    public final void AEK(long j) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0280Bc
    public final void AEx(InterfaceC0285Bj interfaceC0285Bj) {
        this.A07 = interfaceC0285Bj;
        this.A0R.post(this.A0Z);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0777Vg
    public final long AF0(long j) {
        if (!this.A07.A95()) {
            j = 0;
        }
        this.A04 = j;
        this.A0D = false;
        if (!A0I()) {
            boolean A0K = A0K(j);
            String[] strArr = A0d;
            if (strArr[4].charAt(19) == strArr[5].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0d;
            strArr2[4] = "4t4h1X84Q9aXzP6i3O1IFqP61fZwJyic";
            strArr2[5] = "YchhDxV7HDCpyjRy2lVbypcIuIxdt4SR";
            if (A0K) {
                return j;
            }
        }
        this.A0E = false;
        this.A06 = j;
        this.A0B = false;
        if (this.A0X.A08()) {
            this.A0X.A05();
        } else {
            for (C0776Vf c0776Vf : this.A0K) {
                c0776Vf.A0I();
            }
        }
        return j;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0280Bc
    public final InterfaceC0288Bm AFx(int i, int i2) {
        int length = this.A0K.length;
        for (int i3 = 0; i3 < length; i3++) {
            int trackCount = this.A0J[i3];
            if (trackCount == i) {
                return this.A0K[i3];
            }
        }
        C0776Vf c0776Vf = new C0776Vf(this.A0V);
        c0776Vf.A0L(this);
        int trackCount2 = length + 1;
        int[] copyOf = Arrays.copyOf(this.A0J, trackCount2);
        this.A0J = copyOf;
        copyOf[length] = i;
        int trackCount3 = length + 1;
        C0776Vf[] c0776VfArr = (C0776Vf[]) Arrays.copyOf(this.A0K, trackCount3);
        this.A0K = c0776VfArr;
        c0776VfArr[length] = c0776Vf;
        return c0776Vf;
    }
}
