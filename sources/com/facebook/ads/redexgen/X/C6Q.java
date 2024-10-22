package com.facebook.ads.redexgen.X;

import android.graphics.Bitmap;
import android.net.TrafficStats;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6Q {
    public static AnonymousClass00 A0A;
    public static List<String> A0B;
    public static byte[] A0C;
    public static String[] A0D = {"8gkZjHnxCvZyg7TzwjjGeSdvls9L7Gam", "fcbSC3ja3K2jNylkxCBC51G6bXitMdQ0", "2foOCT", "ocB0m3", "KfMQJM794wt5IuG", "feDb68pnVWWOEqV45c", "KnEa0S3Tnigt4irEXno07XBXpnYxFsFq", "aK1UKkDbG3zR1xh0x3umKxUvmkPLseuR"};
    public static final String A0E;
    public static final Map<String, AnonymousClass06> A0F;
    public static final Map<String, C6S> A0G;
    public long A00;
    public C0452In A01;
    public final C6R A03;
    public final C7S A04;
    public final boolean A08;
    public final boolean A09;
    public final Map<String, Bitmap> A07 = Collections.synchronizedMap(new HashMap());
    public final Handler A02 = new Handler(Looper.getMainLooper());
    public final List<Callable<Boolean>> A05 = new ArrayList();
    public final List<Callable<Boolean>> A06 = new ArrayList();

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0C, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 10);
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 8 out of bounds for length 7
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public static AtomicBoolean A0D(ArrayList<Callable<Boolean>> arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator<Callable<Boolean>> it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A0D;
            if (strArr[3].length() != strArr[2].length()) {
                throw new RuntimeException();
            }
            A0D[5] = "";
            if (!hasNext) {
                AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                try {
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        Boolean bool = (Boolean) ((Future) it2.next()).get();
                        atomicBoolean.set(atomicBoolean.get() && bool != null && bool.booleanValue());
                    }
                } catch (InterruptedException | ExecutionException e) {
                    Log.e(A0E, A08(78, 42, 23), e);
                    atomicBoolean.set(false);
                }
                return atomicBoolean;
            }
            arrayList2.add(ExecutorC0512La.A02().submit(it.next()));
        }
    }

    public static void A0F() {
        A0C = new byte[]{123, -82, -85, -82, 124, -80, 123, -81, 107, -103, -103, 107, -105, -104, 107, 107, 96, 126, Byte.MIN_VALUE, -123, -126, 61, -112, -111, 126, -113, -111, -126, -127, 75, -119, -89, -87, -82, -81, -76, -83, 102, -87, -75, -77, -74, -78, -85, -70, -85, -113, -83, -81, -76, -75, -70, -77, 108, -78, -83, -75, -72, -79, -80, Byte.MAX_VALUE, -99, -97, -92, -91, -86, -93, 92, -81, -80, -99, -82, -80, -95, -96, 106, 106, 106, 102, -103, -124, -122, -111, -107, -118, -112, -113, 65, -104, -119, -118, -115, -122, 65, -122, -103, -122, -124, -106, -107, -118, -113, -120, 65, -124, -126, -124, -119, -122, 65, -123, -112, -104, -113, -115, -112, -126, -123, -108, 79, -86, 122, Byte.MAX_VALUE, -87, Byte.MAX_VALUE, Byte.MAX_VALUE, -79, -81, -79, -74, -77, -111, -67, -69, -66, -70, -77, -62, -73, -67, -68, -106, -67, -67, -71, 120, 118, 120, 125, 122, 91, 118, 126, -127, -118, -121, 122, 93, -124, -124, Byte.MIN_VALUE, -120, -101, -120, -122, -104, -105, -120, -24, -21, -35, -32, -27, -24, -38, -35, -40, -19, -30, -26, -34, -40, -26, -20, -96, -107, -100, -92};
    }

    static {
        A0F();
        A0E = C6Q.class.getSimpleName();
        A0F = Collections.synchronizedMap(new HashMap());
        A0G = Collections.synchronizedMap(new HashMap());
    }

    public C6Q(C7S c7s) {
        this.A04 = c7s;
        this.A03 = C6R.A06(c7s.A01());
        this.A08 = IP.A2E(c7s);
        this.A09 = IP.A2M(c7s, QJ.A03());
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.facebook.ads.redexgen.X.07] */
    public static synchronized AnonymousClass00 A03(Y9 y9) {
        AnonymousClass00 anonymousClass00;
        synchronized (C6Q.class) {
            if (A0A == null) {
                A0A = AnonymousClass01.A00(y9, new Object() { // from class: com.facebook.ads.redexgen.X.07
                    public int A00;
                    public int A01;
                    public boolean A02;
                    public boolean A03;
                    public boolean A04;

                    public final AnonymousClass07 A00(int i) {
                        this.A00 = i;
                        return this;
                    }

                    public final AnonymousClass07 A01(int i) {
                        this.A01 = i;
                        return this;
                    }

                    public final AnonymousClass07 A02(boolean z) {
                        this.A02 = z;
                        return this;
                    }

                    public final AnonymousClass07 A03(boolean z) {
                        this.A03 = z;
                        return this;
                    }

                    public final AnonymousClass07 A04(boolean z) {
                        this.A04 = z;
                        return this;
                    }

                    public final AnonymousClass08 A05() {
                        return new AnonymousClass08(this.A00, this.A02, this.A01, this.A03, this.A04);
                    }
                }.A00(IP.A05(y9)).A02(y9.A04().A8o()).A01(-1).A03(IP.A0m(y9)).A04(IP.A2L(y9)).A05(), A05(y9));
            }
            anonymousClass00 = A0A;
        }
        return anonymousClass00;
    }

    public static AnonymousClass06 A04(C7S c7s, String str) {
        AnonymousClass06 anonymousClass06 = A0F.get(str);
        if (C6T.A06(c7s) && anonymousClass06 != null) {
            AnonymousClass06 storedCacheData = new AnonymousClass06(anonymousClass06);
            return storedCacheData;
        }
        AnonymousClass06 storedCacheData2 = new AnonymousClass06(str);
        return storedCacheData2;
    }

    public static YE A05(Y9 y9) {
        return new YE(y9);
    }

    public static synchronized List<String> A09(C7S c7s) {
        List<String> list;
        synchronized (C6Q.class) {
            if (A0B == null) {
                ArrayList arrayList = new ArrayList();
                A0B = arrayList;
                A0J(arrayList, c7s);
            }
            list = A0B;
        }
        return list;
    }

    public static void A0H(C7S c7s, String str) {
        C6S c6s;
        if (C6T.A06(c7s) && !TextUtils.isEmpty(str) && (c6s = A0G.get(str)) != null) {
            c6s.A00 = A08(184, 4, 35);
            Y9 A01 = c7s.A01();
            QN A05 = QN.A05(A01);
            String A08 = QN.A08(A01, C0490Kc.A00(str));
            if (A08 == null) {
                A08 = str;
            }
            C6T.A04(c7s, c6s, A05.A0H(A08));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(EnumC0451Im enumC0451Im) {
        if (this.A01 == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A08(172, 12, 111), LM.A04(this.A00));
        this.A01.A04(enumC0451Im, hashMap);
    }

    public static void A0J(List<String> cacheDirs, C7S c7s) {
        A0K(cacheDirs, C0968bA.A01(c7s));
        A0K(cacheDirs, C6R.A07(c7s));
    }

    public static void A0K(List<String> list, File file) {
        String path;
        if (file == null || (path = file.getPath()) == null) {
            return;
        }
        String[] strArr = A0D;
        String str = strArr[3];
        String path2 = strArr[2];
        if (str.length() != path2.length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0D;
        strArr2[3] = "Vghlgc";
        strArr2[2] = "qwUey9";
        String path3 = A08(0, 0, 127);
        if (path != path3) {
            String path4 = path.toLowerCase(Locale.getDefault());
            list.add(path4);
        }
    }

    public final Bitmap A0M(String str) {
        return this.A07.get(str);
    }

    public final Bitmap A0N(String str, int i, int i2) {
        if (this.A08) {
            AnonymousClass06 A04 = A04(this.A04, str);
            A04.A03 = A08(184, 4, 35);
            A04.A01 = i2;
            A04.A00 = i;
            return A03(this.A04.A01()).AEh(A04, true).A00();
        }
        return this.A03.A0E(this.A04, str, i, i2, A08(168, 4, 114));
    }

    public final File A0O(String str) {
        AnonymousClass06 A04 = A04(this.A04, str);
        A04.A03 = A08(184, 4, 35);
        return A03(this.A04.A01()).AEi(A04);
    }

    public final File A0P(String str) {
        if (this.A08) {
            return A0O(str);
        }
        return this.A03.A0F(str);
    }

    public final String A0Q(String str) {
        if (this.A08) {
            return A0R(str);
        }
        return this.A03.A0G(str);
    }

    public final String A0R(String str) {
        AnonymousClass06 A04 = A04(this.A04, str);
        A04.A03 = A08(184, 4, 35);
        String AEk = A03(this.A04.A01()).AEk(A04);
        return AEk != null ? AEk : str;
    }

    public final String A0S(String str) {
        if (this.A09) {
            A0H(this.A04, str);
            return str;
        }
        return A0R(str);
    }

    public final void A0T() {
        JU.A05(A08(126, 19, 68), A08(30, 16, 60), A08(0, 8, 64));
    }

    public final void A0U() {
        JU.A05(A08(145, 16, 11), A08(46, 14, 66), A08(120, 6, 61));
    }

    public final void A0V() {
        this.A07.clear();
    }

    public final void A0W(C6I c6i, C6J c6j) {
        JU.A05(A08(161, 7, 25), A08(60, 18, 50), A08(8, 8, 44));
        this.A00 = System.currentTimeMillis();
        C6T.A02(this.A04, c6j, C6T.A07, A08(16, 14, 19), -1L);
        ExecutorC0512La.A03().execute(new YF(this, new ArrayList(this.A05), c6j, c6i, new ArrayList(this.A06)));
        this.A05.clear();
        this.A06.clear();
    }

    public final void A0X(C6M c6m) {
        this.A05.add(new C6N(this, c6m));
    }

    public final void A0Y(C6M c6m) {
        c6m.A05 = true;
        this.A06.add(new C6N(this, c6m));
    }

    public final void A0Z(C6M c6m) {
        c6m.A05 = true;
        if (this.A09) {
            this.A06.add(new C6L(this, c6m));
        } else {
            this.A06.add(new C6N(this, c6m));
        }
    }

    public final void A0a(C6M c6m) {
        if (this.A09) {
            this.A05.add(new C6L(this, c6m));
        } else {
            this.A05.add(new C6N(this, c6m));
        }
    }

    public final void A0b(final C6O c6o) {
        Callable<Boolean> callable = new Callable<Boolean>(c6o) { // from class: com.facebook.ads.redexgen.X.6P
            public static byte[] A02;
            public static String[] A03 = {"jwTNBF52XqMGgcVEiQTwvXvSBsl43Bcu", "zl9XISU", "9LwyCiCzMXmNgkxTRjX8XUqiNT4UlidW", "Jar4Zz8ck96tLH67JFbLbWmYESMeU49V", "Yd8bjyjazIom6Oxe2tnjIAJyfdSlHwWG", "VgUZ5KaBAYbzt3oMIew8EQ4BA2c", "hXTgBapwd4emagenALPcDOSBW5zmdf3H", "17k"};
            public final C6O A00;

            public static String A01(int i, int i2, int i3) {
                byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
                int i4 = 0;
                while (true) {
                    int length = copyOfRange.length;
                    if (A03[1].length() == 32) {
                        throw new RuntimeException();
                    }
                    A03[3] = "";
                    if (i4 >= length) {
                        return new String(copyOfRange);
                    }
                    copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 48);
                    i4++;
                }
            }

            public static void A02() {
                A02 = new byte[]{-20, -16, -28, -22, -24};
            }

            static {
                A02();
            }

            {
                this.A00 = c6o;
            }

            private final Boolean A00() {
                C7S c7s;
                boolean z;
                C7S c7s2;
                AnonymousClass00 A032;
                boolean z2;
                boolean z3;
                C6R c6r;
                Map map;
                if (K0.A02(this)) {
                    return null;
                }
                try {
                    TrafficStats.setThreadStatsTag(61453);
                    AnonymousClass06 anonymousClass06 = new AnonymousClass06(this.A00.A07, this.A00.A06, this.A00.A05, A01(0, 5, 83), this.A00.A01, this.A00.A02);
                    anonymousClass06.A01 = this.A00.A04;
                    anonymousClass06.A00 = this.A00.A03;
                    c7s = C6Q.this.A04;
                    if (C6T.A06(c7s)) {
                        map = C6Q.A0F;
                        map.put(this.A00.A07, anonymousClass06);
                    }
                    z = C6Q.this.A08;
                    boolean precacheResult = false;
                    if (A03[3].length() != 5) {
                        A03[4] = "CZcPy1KhLDdCOlGcBT5xxsnRB32IUDMD";
                        if (!z) {
                            c6r = C6Q.this.A03;
                            if (c6r.A0D(this.A00) != null) {
                                precacheResult = true;
                            }
                        } else {
                            c7s2 = C6Q.this.A04;
                            A032 = C6Q.A03(c7s2.A01());
                            precacheResult = A032.AEh(anonymousClass06, false).A01();
                        }
                        C6W c6w = this.A00.A00;
                        if (c6w != null && c6w.A02()) {
                            int A00 = c6w.A00();
                            int A01 = c6w.A01();
                            if (A00 <= 0 || A01 <= 0) {
                                z2 = C6Q.this.A08;
                                if (z2) {
                                    A04(this.A00.A07, anonymousClass06);
                                } else {
                                    A03(this.A00.A03, this.A00.A04);
                                }
                            } else {
                                z3 = C6Q.this.A08;
                                if (z3) {
                                    anonymousClass06.A00 = A00;
                                    anonymousClass06.A01 = A01;
                                    A04(this.A00.A07, anonymousClass06);
                                } else {
                                    A03(A00, A01);
                                }
                            }
                        }
                        return Boolean.valueOf(precacheResult);
                    }
                    throw new RuntimeException();
                } catch (Throwable th) {
                    K0.A00(th, this);
                    return null;
                }
            }

            private void A03(int i, int i2) {
                C6R c6r;
                C7S c7s;
                Map map;
                c6r = C6Q.this.A03;
                c7s = C6Q.this.A04;
                Bitmap A0E2 = c6r.A0E(c7s, this.A00.A07, i, i2, this.A00.A01);
                if (A0E2 == null) {
                    return;
                }
                map = C6Q.this.A07;
                map.put(this.A00.A07, A0E2);
            }

            private void A04(String str, AnonymousClass06 anonymousClass06) {
                C7S c7s;
                AnonymousClass00 A032;
                Map map;
                c7s = C6Q.this.A04;
                A032 = C6Q.A03(c7s.A01());
                Bitmap A00 = A032.AEh(anonymousClass06, true).A00();
                if (A00 == null) {
                    return;
                }
                map = C6Q.this.A07;
                map.put(str, A00);
            }

            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Boolean call() throws Exception {
                if (K0.A02(this)) {
                    return null;
                }
                try {
                    return A00();
                } catch (Throwable th) {
                    K0.A00(th, this);
                    return null;
                }
            }
        };
        if (!c6o.A02) {
            this.A05.add(callable);
        } else {
            this.A06.add(callable);
        }
    }

    public final void A0c(C6O c6o) {
        c6o.A02 = true;
        A0b(c6o);
    }

    public final void A0d(C0452In c0452In) {
        this.A01 = c0452In;
    }
}
