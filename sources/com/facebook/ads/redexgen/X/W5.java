package com.facebook.ads.redexgen.X;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class W5 implements InterfaceC0278Ba {
    public static byte[] A0C;
    public static String[] A0D = {"1uxTk9uu8NGqb4bRD7SiE7", "Ssi3SEW4IwUGp9bqpG4lGM81x4BmU482", "xmiG4gye91jMk16VeYAf2JsNYB9ZLAXn", "P3M63oXZ4RlItM7d6tCP0FhU4UJB0VVm", "pvrI0I2hPgkxZ7mKqcVNCE", "IViSy7bNMMRqTObQqgQHZJ03ioQVAxI3", "AKSfxMAYbymYkKmkIHXjHayRWnu0Srjs", "XaZNcJans0E3GSdApjoK7oUba6xaED3H"};
    public static final InterfaceC0281Bd A0E;
    public static final long A0F;
    public static final long A0G;
    public static final long A0H;
    public int A00;
    public int A01;
    public InterfaceC0280Bc A02;
    public InterfaceC0311Cv A03;
    public boolean A04;
    public final int A05;
    public final SparseArray<InterfaceC0311Cv> A06;
    public final SparseBooleanArray A07;
    public final SparseIntArray A08;
    public final InterfaceC0309Ct A09;
    public final C0420Hh A0A;
    public final List<C0432Ht> A0B;

    public static String A0D(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 25);
        }
        return new String(copyOfRange);
    }

    public static void A0G() {
        A0C = new byte[]{-64, -62, -84, -78, -106, -76, -63, -63, -62, -57, 115, -71, -68, -63, -73, 115, -58, -52, -63, -74, 115, -75, -52, -57, -72, -127, 115, -96, -62, -58, -57, 115, -65, -68, -66, -72, -65, -52, 115, -63, -62, -57, 115, -76, 115, -89, -59, -76, -63, -58, -61, -62, -59, -57, 115, -90, -57, -59, -72, -76, -64, -127, 115, 111, 113, 97, -53, -56, -39, -58};
    }

    static {
        A0G();
        A0E = new W8();
        A0F = C0436Hx.A08(A0D(0, 4, 102));
        A0G = C0436Hx.A08(A0D(62, 4, 21));
        A0H = C0436Hx.A08(A0D(66, 4, 106));
    }

    public W5() {
        this(0);
    }

    public W5(int i) {
        this(1, i);
    }

    public W5(int i, int i2) {
        this(i, new C0432Ht(0L), new WM(i2));
    }

    public W5(int i, C0432Ht c0432Ht, InterfaceC0309Ct interfaceC0309Ct) {
        this.A09 = (InterfaceC0309Ct) HI.A01(interfaceC0309Ct);
        this.A05 = i;
        if (i == 1 || i == 2) {
            this.A0B = Collections.singletonList(c0432Ht);
        } else {
            ArrayList arrayList = new ArrayList();
            this.A0B = arrayList;
            arrayList.add(c0432Ht);
        }
        this.A0A = new C0420Hh(new byte[9400], 0);
        this.A07 = new SparseBooleanArray();
        this.A06 = new SparseArray<>();
        this.A08 = new SparseIntArray();
        A0F();
    }

    public static /* synthetic */ int A01(W5 w5) {
        int i = w5.A01;
        w5.A01 = i + 1;
        return i;
    }

    private void A0F() {
        this.A07.clear();
        this.A06.clear();
        SparseArray<InterfaceC0311Cv> A4a = this.A09.A4a();
        int size = A4a.size();
        for (int i = 0; i < size; i++) {
            SparseArray<InterfaceC0311Cv> sparseArray = this.A06;
            int initialPayloadReadersSize = A4a.keyAt(i);
            sparseArray.put(initialPayloadReadersSize, A4a.valueAt(i));
        }
        this.A06.put(0, new WA(new W7(this)));
        this.A03 = null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final void A8e(InterfaceC0280Bc interfaceC0280Bc) {
        this.A02 = interfaceC0280Bc;
        interfaceC0280Bc.AEx(new X0(-9223372036854775807L));
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0094, code lost:            return r0;     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x013a, code lost:            if ((r12 & 32) != 0) goto L54;     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013c, code lost:            r10 = true;     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016a, code lost:            r10 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0167, code lost:            if ((r12 & 32) != 0) goto L54;     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int AE9(com.facebook.ads.redexgen.X.InterfaceC0279Bb r14, com.facebook.ads.redexgen.X.C0283Bh r15) throws java.io.IOException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W5.AE9(com.facebook.ads.redexgen.X.Bb, com.facebook.ads.redexgen.X.Bh):int");
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    public final void AEw(long j, long j2) {
        int size = this.A0B.size();
        for (int i = 0; i < size; i++) {
            this.A0B.get(i).A08();
        }
        this.A0A.A0V();
        this.A08.clear();
        A0F();
        this.A00 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:            r3 = r3 + 1;     */
    @Override // com.facebook.ads.redexgen.X.InterfaceC0278Ba
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean AFg(com.facebook.ads.redexgen.X.InterfaceC0279Bb r7) throws java.io.IOException, java.lang.InterruptedException {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Hh r0 = r6.A0A
            byte[] r5 = r0.A00
            r0 = 940(0x3ac, float:1.317E-42)
            r4 = 0
            r7.ADl(r5, r4, r0)
            r3 = 0
        Lb:
            r0 = 188(0xbc, float:2.63E-43)
            if (r3 >= r0) goto L27
            r2 = 0
        L10:
            r0 = 5
            if (r2 != r0) goto L18
            r7.AFe(r3)
            r0 = 1
            return r0
        L18:
            int r0 = r2 * 188
            int r0 = r0 + r3
            r1 = r5[r0]
            r0 = 71
            if (r1 == r0) goto L24
            int r3 = r3 + 1
            goto Lb
        L24:
            int r2 = r2 + 1
            goto L10
        L27:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.W5.AFg(com.facebook.ads.redexgen.X.Bb):boolean");
    }
}
