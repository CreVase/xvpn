package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.chartboost.sdk.impl.d0;
import com.facebook.ads.internal.exoplayer2.thirdparty.source.TrackGroupArray;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.Dk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0321Dk implements XT {
    public static byte[] A0M;
    public static String[] A0N = {"m3Tqgcaf5Zwh2KVI4lshI8Y9OWjAyKiW", "grdEJ2UvF2rVdGgR2IFX1R9SZI3Oow9U", "adSXB2DteQqbyu8FZt3lmhGSn0N0giaq", "NRdDTd6ed3Jg0yXdfuAl28VADrUF9IBW", "O75rLRuL5gqpexSF7Nk4cqg8fxEEp65Y", "atjqzip57QIi0KmRPtssGorCsXfOnHh4", "4ftStqMBHRnBf64I9Tdbb6", "F7xqVaNkoKYb3tQw5W1HE7EtQtFRVx9Y"};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public C9K A05;
    public C02319e A06;
    public C02329f A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final Handler A0C;
    public final Handler A0D;
    public final C0320Dj A0E;
    public final C02499x A0F;
    public final C02509y A0G;
    public final GR A0H;
    public final GS A0I;
    public final ArrayDeque<C9O> A0J;
    public final CopyOnWriteArraySet<InterfaceC02359i> A0K;
    public final XS[] A0L;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0M, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 6);
            if (A0N[6].length() == 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0N;
            strArr[0] = "Q2Fud838jOFv6puDYoQ5JAWfmkdvAH2h";
            strArr[3] = "Px66e0ytNEnQno4fNGUkfPLcZSToOlLf";
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A0M = new byte[]{121, -76, -93, -42, -51, -82, -54, -65, -41, -61, -48, -89, -53, -50, -54, 116, -89, -98, Byte.MAX_VALUE, -101, -112, -88, -108, -95, 123, -104, -111, 94, 97, 93, 103, 93, 99, -125, -88, -93, -82, 90, -107, -88, -81, -88, -92, -74, -88, 99, -97, -101, 94, -103, -14, -28, -28, -22, -45, -18, -97, -24, -26, -19, -18, -15, -28, -29, -97, -31, -28, -30, -32, -12, -14, -28, -97, -32, -19, -97, -32, -29, -97, -24, -14, -97, -17, -21, -32, -8, -24, -19, -26};
    }

    static {
        A03();
    }

    public C0321Dk(XS[] xsArr, GR gr, C9Z c9z, HL hl) {
        Log.i(A02(2, 13, 88), A02(33, 5, 52) + Integer.toHexString(System.identityHashCode(this)) + A02(0, 2, 83) + A02(15, 18, 41) + A02(47, 3, 56) + C0436Hx.A04 + A02(46, 1, 60));
        HI.A04(xsArr.length > 0);
        this.A0L = (XS[]) HI.A01(xsArr);
        this.A0H = (GR) HI.A01(gr);
        this.A0A = false;
        this.A03 = 0;
        this.A0B = false;
        this.A0K = new CopyOnWriteArraySet<>();
        GS gs = new GS(new C02469t[xsArr.length], new GO[xsArr.length], null);
        this.A0I = gs;
        this.A0G = new C02509y();
        this.A0F = new C02499x();
        this.A07 = C02329f.A04;
        final Looper myLooper = Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper();
        Handler handler = new Handler(myLooper) { // from class: com.facebook.ads.redexgen.X.9N
            public static String[] A01 = {"n8jOK4TugbxocxEe6zYdC2apb8QBw5B2", "exJ9q2BbStmAElE6QlD9JR4gSu8htBEk", "BGOnc", "fVxwFvnWrEIXSQGXaFTt487unfsGWTNS", "M8AH3IesIZMXIj5TZDcC18mK6a9vd0E5", "EIDq0z1OpkYiciQBrU8tJkkKsNLFcNAn", "GYYw65loVBDf2akXR1DT72AGTz3TCOWc", "b13Ux"};

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                if (K0.A02(this)) {
                    return;
                }
                try {
                    C0321Dk.this.A0A(message);
                } catch (Throwable th) {
                    if (A01[3].charAt(19) != 't') {
                        throw new RuntimeException();
                    }
                    A01[6] = "ke6EFi0zu2eoeRmOo8SEy2Wv36xrwBWP";
                    K0.A00(th, this);
                }
            }
        };
        this.A0C = handler;
        this.A06 = new C02319e(AbstractC02519z.A01, 0L, TrackGroupArray.A04, gs);
        this.A0J = new ArrayDeque<>();
        C0320Dj c0320Dj = new C0320Dj(xsArr, gr, gs, c9z, this.A0A, this.A03, this.A0B, handler, this, hl);
        this.A0E = c0320Dj;
        this.A0D = new Handler(c0320Dj.A0w());
    }

    private long A00(long j) {
        long A01 = C9E.A01(j);
        if (!this.A06.A04.A01()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            long positionMs = this.A0F.A08();
            return A01 + positionMs;
        }
        return A01;
    }

    private C02319e A01(boolean z, boolean z2, int i) {
        GS gs;
        if (z) {
            this.A01 = 0;
            this.A00 = 0;
            this.A04 = 0L;
        } else {
            this.A01 = A6a();
            this.A00 = A07();
            this.A04 = A6X();
        }
        AbstractC02519z abstractC02519z = z2 ? AbstractC02519z.A01 : this.A06.A03;
        if (A0N[1].charAt(17) == 'a') {
            throw new RuntimeException();
        }
        String[] strArr = A0N;
        strArr[0] = "HCeOoliCNtIhqJVVEoV7ODJTUFyfMCgc";
        strArr[3] = "jOBrxCepwz9IOjYxDZZOtd2HpuVunHZu";
        Object obj = z2 ? null : this.A06.A07;
        EW ew = this.A06.A04;
        long j = this.A06.A02;
        long j2 = this.A06.A01;
        TrackGroupArray trackGroupArray = z2 ? TrackGroupArray.A04 : this.A06.A05;
        if (z2) {
            gs = this.A0I;
        } else {
            gs = this.A06.A06;
        }
        return new C02319e(abstractC02519z, obj, ew, j, j2, i, false, trackGroupArray, gs);
    }

    private void A04(C02319e c02319e, int i, boolean z, int i2) {
        int i3;
        C02319e c02319e2 = c02319e;
        int i4 = this.A02 - i;
        this.A02 = i4;
        if (i4 == 0) {
            if (c02319e2.A02 == -9223372036854775807L) {
                c02319e2 = c02319e2.A04(c02319e2.A04, 0L, c02319e2.A01);
            }
            if ((!this.A06.A03.A0E() || this.A08) && c02319e2.A03.A0E()) {
                this.A00 = 0;
                this.A01 = 0;
                this.A04 = 0L;
            }
            if (this.A08) {
                i3 = 0;
            } else {
                i3 = 2;
            }
            boolean z2 = this.A09;
            this.A08 = false;
            this.A09 = false;
            A05(c02319e2, z, i2, i3, z2, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A05(final C02319e c02319e, final boolean z, final int i, final int i2, final boolean z2, final boolean z3) {
        boolean isRunningRecursiveListenerNotification = !this.A0J.isEmpty();
        ArrayDeque<C9O> arrayDeque = this.A0J;
        final C02319e c02319e2 = this.A06;
        final CopyOnWriteArraySet<InterfaceC02359i> copyOnWriteArraySet = this.A0K;
        final GR gr = this.A0H;
        final boolean z4 = this.A0A;
        arrayDeque.addLast(new Object(c02319e, c02319e2, copyOnWriteArraySet, gr, z, i, i2, z2, z4, z3) { // from class: com.facebook.ads.redexgen.X.9O
            public static String[] A0C = {"ngVoBp5pr", "xJziJS8oS", "0Acs5KUpAntiIN9SBf", "RdvtHMhhQhD1iGhGKfpT4jwIcRZugl7b", "SwdEOGzegqYmuuXtqS3DnPJA1PQs60Y1", "mjJqNiV5uYYXT5JIaz2mCpImvyi2YwVT", d0.f748a, "dC4jFhBSvokHiCeDasSLAsgetwgdiZCj"};
            public final int A00;
            public final int A01;
            public final C02319e A02;
            public final GR A03;
            public final Set<InterfaceC02359i> A04;
            public final boolean A05;
            public final boolean A06;
            public final boolean A07;
            public final boolean A08;
            public final boolean A09;
            public final boolean A0A;
            public final boolean A0B;

            {
                this.A02 = c02319e;
                this.A04 = copyOnWriteArraySet;
                this.A03 = gr;
                this.A08 = z;
                this.A00 = i;
                this.A01 = i2;
                this.A09 = z2;
                this.A06 = z4;
                this.A07 = z3 || c02319e2.A00 != c02319e.A00;
                this.A0A = (c02319e2.A03 == c02319e.A03 && c02319e2.A07 == c02319e.A07) ? false : true;
                this.A05 = c02319e2.A08 != c02319e.A08;
                this.A0B = c02319e2.A06 != c02319e.A06;
            }

            public final void A00() {
                Iterator<InterfaceC02359i> it;
                if (this.A0A || this.A01 == 0) {
                    Iterator<InterfaceC02359i> it2 = this.A04.iterator();
                    while (it2.hasNext()) {
                        it2.next().AD9(this.A02.A03, this.A02.A07, this.A01);
                    }
                }
                if (this.A08) {
                    for (InterfaceC02359i listener : this.A04) {
                        listener.ACU(this.A00);
                    }
                }
                boolean z5 = this.A0B;
                String[] strArr = A0C;
                if (strArr[6].length() != strArr[2].length()) {
                    A0C[4] = "kVA7KUftqEYsKKgit7KobnVmlfmelHtP";
                    if (z5) {
                        this.A03.A0U(this.A02.A06.A02);
                        for (InterfaceC02359i interfaceC02359i : this.A04) {
                            C02319e c02319e3 = this.A02;
                            String[] strArr2 = A0C;
                            if (strArr2[0].length() == strArr2[1].length()) {
                                String[] strArr3 = A0C;
                                strArr3[6] = "m";
                                strArr3[2] = "KqMQ2zUn9wEBuYOIrT";
                                interfaceC02359i.ADC(c02319e3.A05, this.A02.A06.A01);
                            }
                        }
                    }
                    boolean z6 = this.A05;
                    if (A0C[5].charAt(4) == 'F') {
                        throw new RuntimeException();
                    }
                    A0C[5] = "SUKzwd9m16qKT5RYTkUj9PT0NEqmu9kE";
                    if (z6) {
                        Iterator<InterfaceC02359i> it3 = this.A04.iterator();
                        while (true) {
                            boolean hasNext = it3.hasNext();
                            if (A0C[4].charAt(10) == 'Y') {
                                String[] strArr4 = A0C;
                                strArr4[6] = "I";
                                strArr4[2] = "zdEQR0QEwobMnnP3YQ";
                                if (!hasNext) {
                                    break;
                                }
                                InterfaceC02359i listener2 = it3.next();
                                listener2.ABx(this.A02.A08);
                            } else {
                                String[] strArr5 = A0C;
                                strArr5[0] = "7SswXZjoc";
                                strArr5[1] = "LaiVjvUVk";
                                if (!hasNext) {
                                    break;
                                }
                                InterfaceC02359i listener22 = it3.next();
                                listener22.ABx(this.A02.A08);
                            }
                        }
                    }
                    if (this.A07) {
                        Set<InterfaceC02359i> set = this.A04;
                        String[] strArr6 = A0C;
                        if (strArr6[6].length() != strArr6[2].length()) {
                            A0C[5] = "xdr5mmXrWjbqVTrxDMPiLI1UYtBVMgU7";
                            it = set.iterator();
                        } else {
                            A0C[5] = "vgNSEPQsIWHaSH2OFiWclNn1gpDCsXwE";
                            it = set.iterator();
                        }
                        while (it.hasNext()) {
                            it.next().ACS(this.A06, this.A02.A00);
                        }
                    }
                    if (this.A09) {
                        Iterator<InterfaceC02359i> it4 = this.A04.iterator();
                        while (it4.hasNext()) {
                            it4.next().ACt();
                        }
                        return;
                    }
                    return;
                }
                throw new RuntimeException();
            }
        });
        this.A06 = c02319e;
        if (isRunningRecursiveListenerNotification) {
            return;
        }
        while (!this.A0J.isEmpty()) {
            this.A0J.peekFirst().A00();
            this.A0J.removeFirst();
        }
    }

    private boolean A06() {
        return this.A06.A03.A0E() || this.A02 > 0;
    }

    public final int A07() {
        if (A06()) {
            return this.A00;
        }
        return this.A06.A04.A02;
    }

    public final void A08(int i) {
        A09(i, -9223372036854775807L);
    }

    public final void A09(int i, long j) {
        long A00;
        AbstractC02519z abstractC02519z = this.A06.A03;
        if (i < 0 || (!abstractC02519z.A0E() && i >= abstractC02519z.A01())) {
            throw new C9Y(abstractC02519z, i, j);
        }
        this.A09 = true;
        this.A02++;
        boolean A0B = A0B();
        String[] strArr = A0N;
        if (strArr[7].charAt(11) == strArr[2].charAt(11)) {
            String[] strArr2 = A0N;
            strArr2[0] = "5JrPhprFhX8le0yHjhtYDABd6qn7MJv2";
            strArr2[3] = "AcgEDj7anvk4CRi6YuD76A9KphiljDlH";
            if (A0B) {
                Log.w(A02(2, 13, 88), A02(50, 39, 121));
                this.A0C.obtainMessage(0, 1, -1, this.A06).sendToTarget();
                return;
            }
            this.A01 = i;
            if (abstractC02519z.A0E()) {
                this.A04 = j == -9223372036854775807L ? 0L : j;
                this.A00 = 0;
            } else {
                if (j == -9223372036854775807L) {
                    C02509y c02509y = this.A0G;
                    String[] strArr3 = A0N;
                    if (strArr3[0].charAt(24) != strArr3[3].charAt(24)) {
                        A0N[5] = "nEFnc7B5wfhj7ivnhhzsBLpbkebEETny";
                        A00 = abstractC02519z.A0B(i, c02509y).A01();
                    }
                } else {
                    A00 = C9E.A00(j);
                    if (A0N[5].charAt(0) == 'S') {
                        throw new RuntimeException();
                    }
                    String[] strArr4 = A0N;
                    strArr4[0] = "wxFThwrlUUeaJzWEA8zt6g3O6WvT4NEY";
                    strArr4[3] = "Cn8KVFPYAIX7JaaKfRlHGvTkFrF10J5Z";
                }
                Pair<Integer, Long> A07 = abstractC02519z.A07(this.A0G, this.A0F, i, A00);
                this.A04 = C9E.A01(A00);
                this.A00 = ((Integer) A07.first).intValue();
            }
            this.A0E.A0y(abstractC02519z, i, C9E.A00(j));
            Iterator<InterfaceC02359i> it = this.A0K.iterator();
            while (it.hasNext()) {
                it.next().ACU(1);
            }
            return;
        }
        throw new RuntimeException();
    }

    public final void A0A(Message message) {
        switch (message.what) {
            case 0:
                A04((C02319e) message.obj, message.arg1, message.arg2 != -1, message.arg2);
                return;
            case 1:
                C02329f c02329f = (C02329f) message.obj;
                C02329f playbackParameters = this.A07;
                if (!playbackParameters.equals(c02329f)) {
                    this.A07 = c02329f;
                    Iterator<InterfaceC02359i> it = this.A0K.iterator();
                    while (it.hasNext()) {
                        it.next().ACO(c02329f);
                    }
                    return;
                }
                return;
            case 2:
                C9K c9k = (C9K) message.obj;
                this.A05 = c9k;
                String[] strArr = A0N;
                if (strArr[0].charAt(24) == strArr[3].charAt(24)) {
                    throw new RuntimeException();
                }
                A0N[6] = "4yvjfA5Kw";
                Iterator<InterfaceC02359i> it2 = this.A0K.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    if (A0N[6].length() == 15) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A0N;
                    strArr2[0] = "M6bFWga7XOh4Nv4psw4qaL9KmcGoAikz";
                    strArr2[3] = "g5TiVjLanBSgFn2xszzFJfFzrFRrWctq";
                    if (hasNext) {
                        it2.next().ACQ(c9k);
                    } else {
                        return;
                    }
                }
            default:
                throw new IllegalStateException();
        }
    }

    public final boolean A0B() {
        return !A06() && this.A06.A04.A01();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final void A3M(InterfaceC02359i interfaceC02359i) {
        this.A0K.add(interfaceC02359i);
    }

    @Override // com.facebook.ads.redexgen.X.XT
    public final C02439q A4b(InterfaceC02429p interfaceC02429p) {
        return new C02439q(this.A0E, interfaceC02429p, this.A06.A03, A6a(), this.A0D);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final int A66() {
        long A67 = A67();
        long A6j = A6j();
        if (A67 == -9223372036854775807L || A6j == -9223372036854775807L) {
            return 0;
        }
        if (A6j == 0) {
            return 100;
        }
        return C0436Hx.A06((int) ((100 * A67) / A6j), 0, 100);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final long A67() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A09);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final long A6S() {
        if (A0B()) {
            this.A06.A03.A09(this.A06.A04.A02, this.A0F);
            C02499x c02499x = this.A0F;
            if (A0N[4].charAt(19) == 'z') {
                throw new RuntimeException();
            }
            A0N[4] = "eLr0wKhVkEyrTiyBT4e5CdZ3SmFaaZ0Y";
            return c02499x.A08() + C9E.A01(this.A06.A01);
        }
        return A6X();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final int A6U() {
        if (A0B()) {
            return this.A06.A04.A00;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final int A6V() {
        if (A0B()) {
            return this.A06.A04.A01;
        }
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final long A6X() {
        if (A06()) {
            return this.A04;
        }
        return A00(this.A06.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final AbstractC02519z A6Z() {
        return this.A06.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final int A6a() {
        if (A06()) {
            int i = this.A01;
            if (A0N[4].charAt(19) == 'z') {
                throw new RuntimeException();
            }
            A0N[6] = "IPV6VHeKuNfhgMSHvhaXB";
            return i;
        }
        return this.A06.A03.A09(this.A06.A04.A02, this.A0F).A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final long A6j() {
        AbstractC02519z abstractC02519z = this.A06.A03;
        if (abstractC02519z.A0E()) {
            return -9223372036854775807L;
        }
        if (A0B()) {
            EW ew = this.A06.A04;
            abstractC02519z.A09(ew.A02, this.A0F);
            return C9E.A01(this.A0F.A0A(ew.A00, ew.A01));
        }
        return abstractC02519z.A0B(A6a(), this.A0G).A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final boolean A7Y() {
        return this.A0A;
    }

    @Override // com.facebook.ads.redexgen.X.XT
    public final void ADv(EY ey, boolean z, boolean z2) {
        this.A05 = null;
        C02319e A01 = A01(z, z2, 2);
        this.A08 = true;
        this.A02++;
        this.A0E.A0z(ey, z, z2);
        A05(A01, false, 4, 1, false, false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final void AEO() {
        StringBuilder append = new StringBuilder().append(A02(38, 8, 61)).append(Integer.toHexString(System.identityHashCode(this))).append(A02(0, 2, 83)).append(A02(15, 18, 41));
        String A02 = A02(47, 3, 56);
        Log.i(A02(2, 13, 88), append.append(A02).append(C0436Hx.A04).append(A02).append(C9U.A00()).append(A02(46, 1, 60)).toString());
        this.A0E.A0x();
        this.A0C.removeCallbacksAndMessages(null);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final void AEy(long j) {
        A09(A6a(), j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final void AEz() {
        A08(A6a());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final void AFO(boolean z) {
        if (this.A0A != z) {
            this.A0A = z;
            this.A0E.A10(z);
            A05(this.A06, false, 4, 1, false, true);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC02409n
    public final void AFp(boolean z) {
        if (z) {
            this.A05 = null;
        }
        C02319e A01 = A01(z, z, 1);
        this.A02++;
        this.A0E.A11(z);
        A05(A01, false, 4, 1, false, false);
    }
}
