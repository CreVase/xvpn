package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.facebook.ads.redexgen.X.62, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass62 {
    public static byte[] A00;
    public static String[] A01 = {"zJ7sRo3sU3MwvYkxVq5sKXU", "uwqdBBQkb", "sk1pAaPClwmr1DZFuM4XEVJDjMgj4luU", "2DEAuAVf", "LM1sVeBw6DNfIdZzIYsj5hqYQDPEhJFy", "hYSBjzGCwuKpFZFqojmwIwdxMJLMCyYz", "BWOi5Qn34m6VEGTMmYfzcDYeX0GTjOOy", "rscTiGR64sMWr7IEiXLU0M2EjoTwZlLg"};
    public static final AtomicReference<AnonymousClass60> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 52);
        }
        return new String(copyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{-98, -90, -95, -100, -84, -77, -94, -81, -81, -90, -95, -94, -95, -97, -88, -97, -84, -93, -99, -20, -25, -23, -28, -30, -14, -7, -24, -11, -11, -20, -25, -24};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 68));
    }

    public static AnonymousClass60 A00() {
        AnonymousClass60 anonymousClass60 = A02.get();
        if (A01[6].charAt(15) == 'M') {
            String[] strArr = A01;
            strArr[3] = "GQnQs3ZS";
            strArr[1] = "yTwJu7KeR";
            AnonymousClass60 anonymousClass602 = anonymousClass60;
            if (anonymousClass602 == null) {
                AnonymousClass60 A002 = AnonymousClass60.A00();
                String[] strArr2 = A01;
                if (strArr2[3].length() != strArr2[1].length()) {
                    A01[0] = "yvynwBtI7EoQ7kGRkYf58OE";
                    return A002;
                }
            } else {
                return anonymousClass602;
            }
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x000a, code lost:            if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.X.AnonymousClass60 A01(com.facebook.ads.redexgen.X.C7S r5, com.facebook.ads.redexgen.X.AnonymousClass60 r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L28
        Lc:
            com.facebook.ads.redexgen.X.60 r0 = com.facebook.ads.redexgen.X.AnonymousClass68.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.7w r5 = r5.A07()
            int r4 = com.facebook.ads.redexgen.X.C01997x.A1Q
            com.facebook.ads.redexgen.X.7y r3 = new com.facebook.ads.redexgen.X.7y
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 6
            java.lang.String r0 = A04(r2, r1, r0)
            r5.A9M(r0, r4, r3)
        L28:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.AnonymousClass62.A01(com.facebook.ads.redexgen.X.7S, com.facebook.ads.redexgen.X.60):com.facebook.ads.redexgen.X.60");
    }

    public static AnonymousClass60 A02(C7S c7s, AnonymousClass60 anonymousClass60, AnonymousClass61 anonymousClass61) {
        AnonymousClass63 anonymousClass63 = null;
        try {
            if (IO.A06(c7s) && (anonymousClass60 == null || TextUtils.isEmpty(anonymousClass60.A03()))) {
                anonymousClass63 = AnonymousClass64.A00(c7s.getContentResolver());
            }
        } catch (Throwable th) {
            c7s.A07().A9M(A04(12, 7, 6), C01997x.A1S, new C02007y(th));
        }
        if (anonymousClass63 != null && anonymousClass63.A01 != null) {
            A03.set(anonymousClass63.A01);
            anonymousClass61.A05(anonymousClass63.A01);
        }
        if (anonymousClass60 == null && anonymousClass63 != null && !TextUtils.isEmpty(anonymousClass63.A00)) {
            return new AnonymousClass60(anonymousClass63.A00, anonymousClass63.A02, EnumC01605z.A05);
        }
        return anonymousClass60;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 68);
        }
        return attributionId;
    }

    public static void A06(AnonymousClass61 anonymousClass61) {
        A02.set(anonymousClass61.A02());
        A03.set(anonymousClass61.A03());
    }

    public static void A07(C7S c7s) {
        long j;
        AnonymousClass60 A022;
        try {
            AnonymousClass61 anonymousClass61 = new AnonymousClass61(c7s);
            A06(anonymousClass61);
            if (A08()) {
                return;
            }
            AtomicReference<AnonymousClass60> atomicReference = A02;
            AnonymousClass60 anonymousClass60 = atomicReference.get();
            if (anonymousClass60 != null && !TextUtils.isEmpty(anonymousClass60.A03())) {
                j = anonymousClass60.A01();
            } else {
                j = -1;
            }
            if (j > 0) {
                long cacheTS = System.currentTimeMillis();
                if (cacheTS - j < IO.A00(c7s)) {
                    return;
                }
            }
            if (IO.A07(c7s)) {
                A022 = A01(c7s, A02(c7s, null, anonymousClass61));
            } else {
                A022 = A02(c7s, A01(c7s, null), anonymousClass61);
            }
            if (A022 != null && !TextUtils.isEmpty(A022.A03())) {
                atomicReference.set(A022);
                anonymousClass61.A04(A022);
            }
        } catch (Throwable t) {
            c7s.A07().A9M(A04(12, 7, 6), C01997x.A1R, new C02007y(t));
        }
    }

    public static boolean A08() {
        boolean z = false;
        boolean updated = C0492Ke.A04();
        if (updated) {
            if (A01[0].length() != 23) {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[3] = "OqjdKmMb";
            strArr[1] = "Sbvi0a9C0";
            String A04 = A04(0, 12, 9);
            boolean updated2 = C0492Ke.A05(A04);
            if (updated2) {
                A03.set(C0492Ke.A01(A04));
                z = true;
            }
        }
        boolean A042 = C0492Ke.A04();
        String[] strArr2 = A01;
        if (strArr2[5].charAt(29) != strArr2[4].charAt(29)) {
            A01[6] = "1QSggKSi3jrfAw1MbHCsavUz8mNGSj1M";
            if (!A042) {
                return z;
            }
        } else {
            A01[6] = "SqTb5lTJEle7YRZML8ItyxwGEN07wws1";
            if (!A042) {
                return z;
            }
        }
        String A043 = A04(19, 13, 79);
        boolean updated3 = C0492Ke.A05(A043);
        if (updated3) {
            String A012 = C0492Ke.A01(A043);
            AtomicReference<AnonymousClass60> atomicReference = A02;
            if (A012 == null) {
                A012 = A04(0, 0, 68);
            }
            atomicReference.set(new AnonymousClass60(A012, false, EnumC01605z.A04));
            return true;
        }
        return z;
    }
}
