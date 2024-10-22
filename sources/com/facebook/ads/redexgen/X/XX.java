package com.facebook.ads.redexgen.X;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class XX<T> implements InterfaceC02168p<T> {
    public static byte[] A06;
    public C02098h A00;
    public C02098h A01;
    public List<XX<T>.RecordFileBasedFetch> A02;
    public boolean A03;
    public final C02088g A04;
    public final C02238w A05;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A06, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 98);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A06 = new byte[]{-28, 2, 15, -63, 16, 15, 13, 26, -63, 5, 6, 13, 6, 21, 6, -63, 4, 22, 19, 20, 16, 19, 20, -63, 17, 16, 10, 15, 21, 10, 15, 8, -63, 2, 21, -63, 21, 9, 6, -63, 5, 2, 21, 2, 3, 2, 20, 6, -63, 20, 21, 2, 19, 21, -38, 12, 9, 10, 6, 9, -73, 7, 6, 10, 0, 11, 0, 6, 5, -73, 0, 10, -73, -8, 11, -73, -65, -68, -5, -61, -68, -5, -64, -61, -73, -8, 5, -5, -73, 9, -4, -6, 6, 9, -5, -73, -3, 0, 3, -4, -73, 10, -4, 8, 12, -4, 5, -6, -4, -73, 10, 11, -8, 9, 11, 10, -73, -8, 11, -73, -65, -68, -5, -61, -68, -5, -64, -47, -73, -5, -8, 11, -8, -73, -1, -8, 10, -73, 7, 9, 6, -7, -8, -7, 3, 16, -73, -7, -4, -4, 5, -73, 3, 6, 10, 11, -78, -28, -31, -30, -34, -31, -113, -33, -34, -30, -40, -29, -40, -34, -35, -113, -40, -30, -113, -48, -29, -113, -105, -108, -45, -101, -108, -45, -104, -101, -113, -47, -28, -29, -113, -31, -44, -46, -34, -31, -45, -113, -43, -40, -37, -44, -113, -30, -44, -32, -28, -44, -35, -46, -44, -113, -34, -35, -37, -24, -113, -41, -48, -30, -113, -43, -40, -37, -44, -113, -108, -45, -87, -113, -45, -48, -29, -48, -113, -41, -48, -30, -113, -33, -31, -34, -47, -48, -47, -37, -24, -113, -47, -44, -44, -35, -113, -37, -34, -30, -29, -27, 0, 8, 11, 4, 3, -65, 19, 14, -65, 0, 3, 3, -65, 3, 0, 19, 0, -65, 19, 14, -65, 11, 14, 6, -72, -45, -37, -34, -41, -42, -110, -26, -31, -110, -43, -34, -41, -45, -28, -110, -42, -45, -26, -45, -44, -45, -27, -41, -9, 18, 26, 29, 22, 21, -47, 37, 32, -47, 23, 22, 37, 20, 25, -47, 21, 18, 37, 18, -47, 23, 35, 32, 30, -47, 29, 32, 24, 34, 61, 69, 72, 65, 64, -4, 80, 75, -4, 67, 65, 80, -4, 78, 65, 63, 75, 78, 64, -4, 63, 75, 81, 74, 80, 5, 32, 40, 43, 36, 35, -33, 51, 46, -33, 52, 47, 35, 32, 51, 36, -33, 37, 40, 43, 36, -33, 50, 36, 48, 52, 36, 45, 34, 36, 43, 62, 60, 72, 75, 61, 31, 66, 69, 62, 27, 58, 76, 62, 61, 43, 62, 60, 72, 75, 61, 29, 58, 77, 58, 59, 58, 76, 62, -7, 60, 69, 72, 76, 62, 61, -8, 11, 9, 21, 24, 10, -20, 15, 18, 11, -24, 7, 25, 11, 10, -8, 11, 9, 21, 24, 10, -22, 7, 26, 7, 8, 7, 25, 11, -58, 15, 25, -58, 9, 18, 21, 25, 11, 10, -24, 1, -2, 1, 2, 10, 1, -77, -27, -8, -10, 2, 5, -9, -39, -4, -1, -8, -43, -12, 6, -8, -9, -27, -8, -10, 2, 5, -9, -41, -12, 7, -12, -11, -12, 6, -8, -77, -7, -8, 7, -10, -5, 11, 29, 26, 27, 23, 26, 5, 2, 21, 2};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/XX<TT;>.RecordFileBasedFetch;)Z */
    public synchronized boolean A06(XY xy) {
        if (!this.A02.remove(xy)) {
            return false;
        }
        if (xy.A5b() > 0 && xy.A01().A02.A05(xy.A01().A01).equals(this.A01)) {
            this.A01 = xy.A00().A02;
        }
        return true;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XX != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    public XX(C02138m c02138m, InterfaceC02218u interfaceC02218u) throws IOException {
        this.A05 = new C02238w(c02138m.A04(A00(515, 4, 63)), interfaceC02218u);
        C02088g c02088g = new C02088g(new File(c02138m.A05(), A00(509, 6, 70)));
        this.A04 = c02088g;
        this.A00 = c02088g.A03();
        this.A02 = new ArrayList();
        A05(interfaceC02218u);
        this.A01 = this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XX != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    private void A02(int i, int i2) throws IOException {
        C02098h c02098h = new C02098h(i, i2);
        this.A00 = c02098h;
        this.A04.A04(c02098h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XX != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XY != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    /* JADX WARN: Incorrect inner types in method signature: (Lcom/facebook/ads/redexgen/X/XX<TT;>.RecordFileBasedFetch;)V */
    public synchronized void A03(XY xy) throws C02258y {
        if (!this.A03) {
            if (A06(xy)) {
                if (xy.A5b() == 0) {
                    return;
                }
                if (this.A00.A04(xy.A00().A02) == 0) {
                    try {
                        Iterator<C02208t> it = xy.A00.iterator();
                        while (it.hasNext()) {
                            if (it.next().A00 == this.A05.A07() && this.A05.A0D()) {
                                A02(this.A05.A06(), 0);
                            } else {
                                A02(this.A05.A06(), xy.A00().A00);
                                break;
                            }
                        }
                        if (this.A01.A04(this.A00) < 0) {
                            this.A01 = this.A00;
                        }
                        return;
                    } catch (IOException e) {
                        throw new C02258y(A00(361, 30, 93), e);
                    }
                }
                throw new C02258y(A00(0, 54, 63));
            }
            throw new C02258y(A00(466, 43, 49));
        }
        throw new C02258y(A00(427, 39, 68));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XX != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Incorrect condition in loop: B:7:0x0066 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A05(com.facebook.ads.redexgen.X.InterfaceC02218u r11) throws java.io.IOException {
        /*
            r10 = this;
            com.facebook.ads.redexgen.X.8w r0 = r10.A05
            int r0 = r0.A06()
            r5 = 0
            com.facebook.ads.redexgen.X.8h r3 = new com.facebook.ads.redexgen.X.8h
            r3.<init>(r0, r5)
            com.facebook.ads.redexgen.X.8h r0 = r10.A00
            int r0 = r3.A04(r0)
            r4 = 3
            r9 = 2
            r8 = 1
            if (r0 <= 0) goto L5c
            java.util.Locale r7 = java.util.Locale.US
            r0 = 4
            java.lang.Object[] r6 = new java.lang.Object[r0]
            com.facebook.ads.redexgen.X.8h r0 = r10.A00
            int r0 = r0.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r5] = r0
            com.facebook.ads.redexgen.X.8h r0 = r10.A00
            int r0 = r0.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r8] = r0
            int r0 = r3.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r9] = r0
            int r0 = r3.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r4] = r0
            r2 = 54
            r1 = 102(0x66, float:1.43E-43)
            r0 = 53
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r11.AEf(r0)
            r10.A00 = r3
        L5b:
            return
        L5c:
            int r1 = r3.A02()
            com.facebook.ads.redexgen.X.8h r0 = r10.A00
            int r0 = r0.A02()
            if (r1 >= r0) goto L5b
            com.facebook.ads.redexgen.X.8w r0 = r10.A05
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L7c
            com.facebook.ads.redexgen.X.8h r3 = new com.facebook.ads.redexgen.X.8h
            com.facebook.ads.redexgen.X.8w r0 = r10.A05
            int r0 = r0.A06()
            r3.<init>(r0, r5)
            goto L5c
        L7c:
            java.util.Locale r7 = java.util.Locale.US
            java.lang.Object[] r6 = new java.lang.Object[r4]
            com.facebook.ads.redexgen.X.8h r0 = r10.A00
            int r0 = r0.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r5] = r0
            com.facebook.ads.redexgen.X.8h r0 = r10.A00
            int r0 = r0.A03()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r8] = r0
            int r0 = r3.A02()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6[r9] = r0
            r2 = 156(0x9c, float:2.19E-43)
            r1 = 101(0x65, float:1.42E-43)
            r0 = 13
            java.lang.String r0 = A00(r2, r1, r0)
            java.lang.String r0 = java.lang.String.format(r7, r0, r6)
            r11.AEf(r0)
            com.facebook.ads.redexgen.X.8w r0 = r10.A05
            int r2 = r0.A06()
            com.facebook.ads.redexgen.X.8w r0 = r10.A05
            int r0 = r0.A07()
            com.facebook.ads.redexgen.X.8h r1 = new com.facebook.ads.redexgen.X.8h
            r1.<init>(r2, r0)
            r10.A00 = r1
            com.facebook.ads.redexgen.X.8g r0 = r10.A04
            r0.A04(r1)
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.XX.A05(com.facebook.ads.redexgen.X.8u):void");
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XX != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XY != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T>$RecordFileBasedFetch */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02168p
    public final synchronized InterfaceC02158o A5a(byte[] bArr, int[] iArr) throws C02258y {
        XX<T>.RecordFileBasedFetch xy;
        if (!this.A03) {
            int i = 0;
            int i2 = 0;
            try {
                ArrayList arrayList = new ArrayList();
                boolean mayHaveMoreData = true;
                while (true) {
                    C02118k A0A = this.A05.A0A(this.A01.A02(), this.A01.A03(), bArr, i, iArr, i2);
                    int A00 = A0A.A01().A00();
                    int storageOffset = A0A.A01().A01();
                    int i3 = A00 - storageOffset;
                    int storageOffset2 = A0A.A01().A02();
                    i += storageOffset2;
                    i2 += i3;
                    if (A0A.A01().A03() == EnumC02108i.A02) {
                        arrayList.add(A0A);
                    }
                    if (A0A.A01().A03() == EnumC02108i.A03) {
                        break;
                    }
                    if (A0A.A01().A03() == EnumC02108i.A04) {
                        int countsOffset = this.A05.A06();
                        int storageOffset3 = this.A05.A08();
                        int countsOffset2 = countsOffset + storageOffset3;
                        int storageOffset4 = this.A01.A02();
                        if (countsOffset2 == storageOffset4 + 1) {
                            mayHaveMoreData = false;
                            break;
                        }
                        int storageOffset5 = this.A01.A02();
                        this.A01 = new C02098h(storageOffset5 + 1, 0);
                    } else {
                        this.A01 = this.A01.A05(i3);
                    }
                }
                xy = new XY(this, arrayList, mayHaveMoreData);
                this.A02.add(xy);
                if (!arrayList.isEmpty()) {
                    C02098h c02098h = xy.A01().A02;
                    int storageOffset6 = xy.A01().A01;
                    this.A01 = c02098h.A05(storageOffset6);
                }
            } catch (IOException e) {
                throw new C02258y(A00(306, 29, 79), e);
            }
        } else {
            throw new C02258y(A00(391, 36, 119));
        }
        return xy;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XX != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02168p
    public final synchronized int A7f() throws C02258y {
        int A09;
        if (!this.A03) {
            try {
                A09 = this.A05.A09();
                int A02 = this.A00.A02();
                int count = this.A05.A06();
                if (A02 == count) {
                    int count2 = this.A00.A03();
                    A09 -= count2;
                }
            } catch (IOException e) {
                throw new C02258y(A00(335, 26, 122), e);
            }
        } else {
            throw new C02258y(A00(427, 39, 68));
        }
        return A09;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XX != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02168p
    public final synchronized void AFq(byte[] bArr) throws C02258y {
        if (!this.A03) {
            try {
                this.A05.A0C(bArr);
            } catch (IOException e) {
                throw new C02258y(A00(257, 25, 61), e);
            }
        } else {
            throw new C02258y(A00(427, 39, 68));
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XX != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // com.facebook.ads.redexgen.X.InterfaceC02168p
    public final synchronized void clear() throws C02258y {
        try {
            this.A05.A0B();
            A02(this.A05.A06(), 0);
            this.A02.clear();
        } catch (IOException e) {
            throw new C02258y(A00(282, 24, 16), e);
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.XX != com.facebook.ads.internal.eventstorage.record.RecordFileBasedRecordDatabase<T> */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        this.A02.clear();
        this.A04.close();
        this.A05.close();
    }
}
