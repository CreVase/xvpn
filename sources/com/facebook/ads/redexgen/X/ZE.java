package com.facebook.ads.redexgen.X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public final class ZE implements C4K {
    public static byte[] A08;
    public static String[] A09 = {"X1JWoRd1RTsi5LXg3YfkE890Z0SkAp6s", "8cHG76lMVFwKxBGRg2kgut24eHhxfbd", "G9TzZa55JFGh4eGgvGtqHGY1m3qrW6LM", "T7A4lgHZzGr7V1uQcw7LfDSO4lerGRH7", "wT7nveBXif1G6UL4LkiEJi9kfhK", "XR1Jqmc9zxsTs7lfyBsyi3NvUHLKhP3K", "pVA6ZWYUVwE4UScIoRBBosOqE3FsfWwK", "nWmw"};
    public int A00;
    public InterfaceC00732n<C01073x> A01;
    public final InterfaceC01063w A02;
    public final C4L A03;
    public final Runnable A04;
    public final ArrayList<C01073x> A05;
    public final ArrayList<C01073x> A06;
    public final boolean A07;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 66);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A08 = new byte[]{-100, -75, -78, -75, -74, -66, -75, 103, -68, -73, -85, -88, -69, -84, 103, -74, -73, 103, -69, -64, -73, -84, 103, -83, -74, -71, 103, -44, -45, -47, -34, -123, -41, -54, -46, -44, -37, -54, -123, -58, -45, -55, -123, -38, -43, -55, -58, -39, -54, -123, -44, -43, -40, -123, -56, -58, -45, -123, -57, -54, -123, -55, -50, -40, -43, -58, -39, -56, -51, -54, -55, -123, -50, -45, -123, -53, -50, -41, -40, -39, -123, -43, -58, -40, -40, -24, -23, -103, -20, -31, -24, -18, -27, -35, -103, -37, -34, -103, -21, -34, -26, -24, -17, -34, -103, -24, -21, -103, -18, -23, -35, -38, -19, -34, -89, 30, 19, 26, 32, 23, 15, -53, 25, 26, 31, -53, 15, 20, 30, 27, 12, 31, 14, 19, -53, 12, 15, 15, -53, 26, 29, -53, 24, 26, 33, 16, -53, 17, 26, 29, -53, 27, 29, 16, -53, 23, 12, 36, 26, 32, 31};
    }

    static {
        A03();
    }

    public ZE(InterfaceC01063w interfaceC01063w) {
        this(interfaceC01063w, false);
    }

    public ZE(InterfaceC01063w interfaceC01063w, boolean z) {
        this.A01 = new ZU(30);
        this.A05 = new ArrayList<>();
        this.A06 = new ArrayList<>();
        this.A00 = 0;
        this.A02 = interfaceC01063w;
        this.A07 = z;
        this.A03 = new C4L(this);
    }

    private int A00(int i, int i2) {
        int i3;
        int count;
        int count2 = this.A06.size();
        for (int i4 = count2 - 1; i4 >= 0; i4--) {
            C01073x c01073x = this.A06.get(i4);
            int count3 = c01073x.A00;
            if (count3 == 8) {
                int i5 = c01073x.A02;
                int count4 = c01073x.A01;
                if (i5 < count4) {
                    i3 = c01073x.A02;
                    count = c01073x.A01;
                } else {
                    i3 = c01073x.A01;
                    count = c01073x.A02;
                }
                if (i >= i3 && i <= count) {
                    int count5 = c01073x.A02;
                    if (i3 == count5) {
                        if (i2 == 1) {
                            int count6 = c01073x.A01;
                            c01073x.A01 = count6 + 1;
                        } else if (i2 == 2) {
                            int count7 = c01073x.A01;
                            c01073x.A01 = count7 - 1;
                        }
                        i++;
                    } else {
                        if (i2 == 1) {
                            int count8 = c01073x.A02;
                            c01073x.A02 = count8 + 1;
                        } else if (i2 == 2) {
                            int count9 = c01073x.A02;
                            c01073x.A02 = count9 - 1;
                        }
                        i--;
                    }
                } else {
                    int count10 = c01073x.A02;
                    if (i < count10) {
                        if (i2 == 1) {
                            int count11 = c01073x.A02;
                            c01073x.A02 = count11 + 1;
                            int count12 = c01073x.A01;
                            c01073x.A01 = count12 + 1;
                        } else if (i2 == 2) {
                            int count13 = c01073x.A02;
                            c01073x.A02 = count13 - 1;
                            int count14 = c01073x.A01;
                            c01073x.A01 = count14 - 1;
                        }
                    }
                }
            } else {
                int count15 = c01073x.A02;
                if (count15 <= i) {
                    int count16 = c01073x.A00;
                    if (count16 == 1) {
                        int i6 = c01073x.A01;
                        int i7 = A09[7].length();
                        if (i7 != 4) {
                            throw new RuntimeException();
                        }
                        A09[7] = "N0sU";
                        i -= i6;
                    } else {
                        int count17 = c01073x.A00;
                        if (count17 == 2) {
                            int count18 = c01073x.A01;
                            i += count18;
                        }
                    }
                } else if (i2 == 1) {
                    int count19 = c01073x.A02;
                    c01073x.A02 = count19 + 1;
                } else if (i2 == 2) {
                    int count20 = c01073x.A02;
                    c01073x.A02 = count20 - 1;
                }
            }
        }
        for (int size = this.A06.size() - 1; size >= 0; size--) {
            C01073x c01073x2 = this.A06.get(size);
            int count21 = c01073x2.A00;
            if (count21 == 8) {
                int i8 = c01073x2.A01;
                int count22 = c01073x2.A02;
                if (i8 != count22) {
                    int count23 = c01073x2.A01;
                    if (count23 >= 0) {
                    }
                }
                this.A06.remove(size);
                AEJ(c01073x2);
            } else {
                int count24 = c01073x2.A01;
                if (count24 <= 0) {
                    this.A06.remove(size);
                    AEJ(c01073x2);
                }
            }
        }
        return i;
    }

    private final int A01(int i, int i2) {
        int size = this.A06.size();
        while (i2 < size) {
            C01073x c01073x = this.A06.get(i2);
            int i3 = c01073x.A00;
            if (i3 == 8) {
                int count = c01073x.A02;
                if (count == i) {
                    i = c01073x.A01;
                } else {
                    int count2 = c01073x.A02;
                    if (count2 < i) {
                        i--;
                    }
                    int count3 = c01073x.A01;
                    if (count3 <= i) {
                        i++;
                    }
                }
            } else {
                int count4 = c01073x.A02;
                if (count4 <= i) {
                    int i4 = c01073x.A00;
                    if (i4 == 2) {
                        int i5 = c01073x.A02;
                        int count5 = c01073x.A01;
                        if (i < i5 + count5) {
                            return -1;
                        }
                        int count6 = c01073x.A01;
                        i -= count6;
                    } else {
                        int i6 = c01073x.A00;
                        String[] strArr = A09;
                        String str = strArr[6];
                        String str2 = strArr[5];
                        int i7 = str.charAt(31);
                        int count7 = str2.charAt(31);
                        if (i7 != count7) {
                            throw new RuntimeException();
                        }
                        A09[1] = "6d2Cvy1MfGwOem3AHh21iiz4RwVuOhP";
                        if (i6 == 1) {
                            int count8 = c01073x.A01;
                            i += count8;
                        }
                    }
                } else {
                    continue;
                }
            }
            i2++;
        }
        return i;
    }

    private void A04(C01073x c01073x) {
        A09(c01073x);
    }

    private void A05(C01073x c01073x) {
        A09(c01073x);
    }

    private void A06(C01073x c01073x) {
        int i = c01073x.A02;
        int i2 = 0;
        int i3 = c01073x.A02;
        int tmpStart = c01073x.A01;
        int i4 = i3 + tmpStart;
        char c = 65535;
        int i5 = c01073x.A02;
        while (i5 < i4) {
            int tmpEnd = 0;
            if (this.A02.A5e(i5) != null || A0C(i5)) {
                if (c == 0) {
                    A08(AAI(2, i, i2, null));
                    tmpEnd = 1;
                }
                c = 1;
            } else {
                if (c == 1) {
                    A09(AAI(2, i, i2, null));
                    tmpEnd = 1;
                }
                c = 0;
            }
            if (tmpEnd != 0) {
                i5 -= i2;
                i4 -= i2;
                i2 = 1;
            } else {
                i2++;
            }
            i5++;
        }
        int tmpStart2 = c01073x.A01;
        if (i2 != tmpStart2) {
            AEJ(c01073x);
            c01073x = AAI(2, i, i2, null);
        }
        if (c == 0) {
            A08(c01073x);
        } else {
            A09(c01073x);
        }
    }

    private void A07(C01073x c01073x) {
        int i = c01073x.A02;
        int i2 = 0;
        int i3 = c01073x.A02;
        int tmpStart = c01073x.A01;
        int position = i3 + tmpStart;
        char c = 65535;
        int type = c01073x.A02;
        while (true) {
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int tmpCount = str.charAt(31);
            int tmpStart2 = str2.charAt(31);
            if (tmpCount != tmpStart2) {
                throw new RuntimeException();
            }
            A09[0] = "QVMb2fRXyzWHiAZPpRD1aZXDVthvAAWC";
            if (type < position) {
                if (this.A02.A5e(type) != null || A0C(type)) {
                    if (c == 0) {
                        A08(AAI(4, i, i2, c01073x.A03));
                        i2 = 0;
                        i = type;
                    }
                    c = 1;
                } else {
                    if (c == 1) {
                        A09(AAI(4, i, i2, c01073x.A03));
                        i2 = 0;
                        i = type;
                    }
                    c = 0;
                }
                i2++;
                type++;
            } else {
                int tmpStart3 = c01073x.A01;
                if (i2 != tmpStart3) {
                    Object obj = c01073x.A03;
                    AEJ(c01073x);
                    c01073x = AAI(4, i, i2, obj);
                }
                if (c == 0) {
                    A08(c01073x);
                    return;
                } else {
                    A09(c01073x);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:15:0x0056 */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A08(com.facebook.ads.redexgen.X.C01073x r10) {
        /*
            Method dump skipped, instructions count: 264
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZE.A08(com.facebook.ads.redexgen.X.3x):void");
    }

    private void A09(C01073x c01073x) {
        this.A06.add(c01073x);
        switch (c01073x.A00) {
            case 1:
                this.A02.AAJ(c01073x.A02, c01073x.A01);
                return;
            case 2:
                this.A02.AAM(c01073x.A02, c01073x.A01);
                return;
            case 3:
            case 5:
            case 6:
            case 7:
            default:
                throw new IllegalArgumentException(A02(0, 27, 5) + c01073x);
            case 4:
                this.A02.A9z(c01073x.A02, c01073x.A01, c01073x.A03);
                return;
            case 8:
                this.A02.AAK(c01073x.A02, c01073x.A01);
                return;
        }
    }

    private final void A0A(C01073x c01073x, int i) {
        this.A02.AB4(c01073x);
        switch (c01073x.A00) {
            case 2:
                this.A02.AAL(i, c01073x.A01);
                return;
            case 3:
            default:
                throw new IllegalArgumentException(A02(27, 58, 35));
            case 4:
                this.A02.A9z(i, c01073x.A01, c01073x.A03);
                return;
        }
    }

    private final void A0B(List<C01073x> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AEJ(list.get(i));
        }
        list.clear();
    }

    private boolean A0C(int i) {
        int size = this.A06.size();
        for (int pos = 0; pos < size; pos++) {
            C01073x c01073x = this.A06.get(pos);
            int i2 = c01073x.A00;
            if (i2 == 8) {
                int i3 = c01073x.A01;
                int count = pos + 1;
                if (A01(i3, count) == i) {
                    return true;
                }
            } else {
                int i4 = c01073x.A00;
                int i5 = A09[4].length();
                if (i5 == 28) {
                    throw new RuntimeException();
                }
                A09[7] = "h3FT";
                if (i4 == 1) {
                    int i6 = c01073x.A02;
                    int count2 = c01073x.A01;
                    int i7 = i6 + count2;
                    for (int i8 = c01073x.A02; i8 < i7; i8++) {
                        int count3 = pos + 1;
                        if (A01(i8, count3) == i) {
                            return true;
                        }
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final int A0D(int i) {
        return A01(i, 0);
    }

    public final int A0E(int i) {
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            C01073x op = this.A05.get(i2);
            int size2 = op.A00;
            switch (size2) {
                case 1:
                    int size3 = op.A02;
                    if (size3 <= i) {
                        int size4 = op.A01;
                        i += size4;
                        break;
                    } else {
                        break;
                    }
                case 2:
                    int size5 = op.A02;
                    if (size5 <= i) {
                        int i3 = op.A02;
                        int size6 = op.A01;
                        if (i3 + size6 > i) {
                            return -1;
                        }
                        int size7 = op.A01;
                        i -= size7;
                        break;
                    } else {
                        continue;
                    }
                case 8:
                    int size8 = op.A02;
                    if (size8 == i) {
                        i = op.A01;
                        break;
                    } else {
                        int size9 = op.A02;
                        if (size9 < i) {
                            i--;
                        }
                        int size10 = op.A01;
                        if (size10 <= i) {
                            i++;
                            break;
                        } else {
                            break;
                        }
                    }
            }
        }
        return i;
    }

    public final void A0F() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A02.AB6(this.A06.get(i));
        }
        A0B(this.A06);
        this.A00 = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A0G() {
        /*
            r7 = this;
            r7.A0F()
            java.util.ArrayList<com.facebook.ads.redexgen.X.3x> r0 = r7.A05
            int r5 = r0.size()
            r4 = 0
        La:
            if (r4 >= r5) goto L61
            java.util.ArrayList<com.facebook.ads.redexgen.X.3x> r0 = r7.A05
            java.lang.Object r6 = r0.get(r4)
            com.facebook.ads.redexgen.X.3x r6 = (com.facebook.ads.redexgen.X.C01073x) r6
            int r0 = r6.A00
            switch(r0) {
                case 1: goto L23;
                case 2: goto L32;
                case 3: goto L19;
                case 4: goto L41;
                case 5: goto L19;
                case 6: goto L19;
                case 7: goto L19;
                case 8: goto L52;
                default: goto L19;
            }
        L19:
            java.lang.Runnable r0 = r7.A04
            if (r0 == 0) goto L20
            r0.run()
        L20:
            int r4 = r4 + 1
            goto La
        L23:
            com.facebook.ads.redexgen.X.3w r0 = r7.A02
            r0.AB6(r6)
            com.facebook.ads.redexgen.X.3w r2 = r7.A02
            int r1 = r6.A02
            int r0 = r6.A01
            r2.AAJ(r1, r0)
            goto L19
        L32:
            com.facebook.ads.redexgen.X.3w r0 = r7.A02
            r0.AB6(r6)
            com.facebook.ads.redexgen.X.3w r2 = r7.A02
            int r1 = r6.A02
            int r0 = r6.A01
            r2.AAL(r1, r0)
            goto L19
        L41:
            com.facebook.ads.redexgen.X.3w r0 = r7.A02
            r0.AB6(r6)
            com.facebook.ads.redexgen.X.3w r3 = r7.A02
            int r2 = r6.A02
            int r1 = r6.A01
            java.lang.Object r0 = r6.A03
            r3.A9z(r2, r1, r0)
            goto L19
        L52:
            com.facebook.ads.redexgen.X.3w r0 = r7.A02
            r0.AB6(r6)
            com.facebook.ads.redexgen.X.3w r2 = r7.A02
            int r1 = r6.A02
            int r0 = r6.A01
            r2.AAK(r1, r0)
            goto L19
        L61:
            java.util.ArrayList<com.facebook.ads.redexgen.X.3x> r0 = r7.A05
            r7.A0B(r0)
            r0 = 0
            r7.A00 = r0
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.ZE.A09
            r0 = 0
            r1 = r1[r0]
            r0 = 28
            char r1 = r1.charAt(r0)
            r0 = 65
            if (r1 == r0) goto L7e
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L7e:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.ZE.A09
            java.lang.String r1 = "6Qpi3zwbHCTXm3nhA4JhLro11ECL3LU"
            r0 = 1
            r2[r0] = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.ZE.A0G():void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x003b. Please report as an issue. */
    public final void A0H() {
        this.A03.A05(this.A05);
        int size = this.A05.size();
        for (int i = 0; i < size; i++) {
            C01073x c01073x = this.A05.get(i);
            int i2 = c01073x.A00;
            String[] strArr = A09;
            String str = strArr[6];
            String str2 = strArr[5];
            int i3 = str.charAt(31);
            int count = str2.charAt(31);
            if (i3 != count) {
                throw new RuntimeException();
            }
            A09[1] = "1BDdKJQJlsgxETOK14Gjs1hC7fjbuKK";
            switch (i2) {
                case 1:
                    A04(c01073x);
                    break;
                case 2:
                    A06(c01073x);
                    break;
                case 4:
                    A07(c01073x);
                    break;
                case 8:
                    A05(c01073x);
                    break;
            }
            Runnable runnable = this.A04;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.A05.clear();
    }

    public final void A0I() {
        A0B(this.A05);
        A0B(this.A06);
        this.A00 = 0;
    }

    public final boolean A0J() {
        return this.A05.size() > 0;
    }

    public final boolean A0K() {
        return (this.A06.isEmpty() || this.A05.isEmpty()) ? false : true;
    }

    public final boolean A0L(int i) {
        return (this.A00 & i) != 0;
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final C01073x AAI(int i, int i2, int i3, Object obj) {
        C01073x op = this.A01.A2W();
        if (op == null) {
            return new C01073x(i, i2, i3, obj);
        }
        op.A00 = i;
        op.A02 = i2;
        op.A01 = i3;
        op.A03 = obj;
        return op;
    }

    @Override // com.facebook.ads.redexgen.X.C4K
    public final void AEJ(C01073x c01073x) {
        if (!this.A07) {
            c01073x.A03 = null;
            this.A01.AER(c01073x);
        }
    }
}
