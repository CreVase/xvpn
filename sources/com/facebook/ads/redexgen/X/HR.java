package com.facebook.ads.redexgen.X;

import android.net.TrafficStats;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: assets/audience_network.dex */
public final class HR implements InterfaceC0649Qh {
    public static byte[] A07;
    public static String[] A08 = {"Z3ZBH3trhaxMswGoeO0i3WMhBsCqcWgs", "P814sFImmOC", "INcscN3Z5kcfIuBeknVxelrdNm8ANoXs", "RvJjsajerkLdUat3TDI8NPR3DDSWtO", "ZLSXhw", "wxtWSqUF9a7Aw2d1StIocmcoa4QX", "58xAXbC3p", "Zj1UZNXOzFX"};
    public static final String A09;
    public InterfaceC01987w A00;
    public Executor A01;
    public boolean A02;
    public C0654Qm A03;
    public final InterfaceC0659Qr A04 = new C0426Hn();
    public final InterfaceC0664Qw A05;
    public final InterfaceC0665Qx A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 15 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.restartVar(DebugInfoParser.java:193)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:141)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final InterfaceC0648Qg A01(AbstractC0661Qt abstractC0661Qt) throws C0662Qu {
        C0662Qu c0662Qu;
        String A072 = A07(220, 7, 7);
        HttpURLConnection httpURLConnection = null;
        HT ht = null;
        boolean z = false;
        try {
            try {
                this.A02 = false;
                HttpURLConnection A082 = A08(abstractC0661Qt.A05(), C0492Ke.A04() ? A09() : null);
                A0H(A082, abstractC0661Qt);
                A0G(A082, abstractC0661Qt);
                if (this.A06.A8x()) {
                    this.A06.A9c(A082, abstractC0661Qt.A06());
                }
                A082.connect();
                this.A02 = true;
                Set<String> A01 = this.A03.A01();
                Set<String> A02 = this.A03.A02();
                boolean z2 = (A01 == null || A01.isEmpty()) ? false : true;
                if (A02 != null && !A02.isEmpty()) {
                    z = true;
                }
                if ((A082 instanceof HttpsURLConnection) && (z2 || z)) {
                    try {
                        C0666Qy.A03((HttpsURLConnection) A082, A01, A02);
                    } catch (CertificateException e) {
                        this.A00.A9g(A072, C01997x.A1y, new C02007y(e));
                    } catch (Exception e2) {
                        this.A00.A9g(A072, C01997x.A1x, new C02007y(e2));
                    }
                }
                if (A082.getDoOutput() && abstractC0661Qt.A06() != null) {
                    A00(A082, abstractC0661Qt.A06());
                }
                HT A06 = A082.getDoInput() ? A06(A082) : new HT(A082, null);
                if (this.A06.A8x()) {
                    this.A06.A9d(A06);
                }
                if (A082 != null) {
                    A082.disconnect();
                }
                return A06;
            } catch (Exception e3) {
                try {
                    try {
                        ht = A05(null);
                    } catch (Exception unused) {
                        Log.e(getClass().getSimpleName(), A07(117, 13, 53), e3);
                        if (ht != null && ht.A7v() > 0) {
                            if (this.A06.A8x()) {
                                InterfaceC0665Qx interfaceC0665Qx = this.A06;
                                String[] strArr = A08;
                                if (strArr[0].charAt(28) == strArr[2].charAt(28)) {
                                    throw new RuntimeException();
                                }
                                String[] strArr2 = A08;
                                strArr2[0] = "IlkFDbfWlXmKaUvETbHYmdNk6OEHYi1H";
                                strArr2[2] = "BN3YcSqfdOqAJI6hng3gZMbRThXyngdJ";
                                interfaceC0665Qx.A9d(ht);
                            }
                            if (0 != 0) {
                                httpURLConnection.disconnect();
                            }
                            return ht;
                        }
                        c0662Qu = new C0662Qu(e3, ht);
                    }
                    if (ht == null || ht.A7v() <= 0) {
                        c0662Qu = new C0662Qu(e3, ht);
                        throw c0662Qu;
                    }
                    if (this.A06.A8x()) {
                        this.A06.A9d(ht);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return ht;
                } catch (Throwable unused2) {
                    if (ht == null || ht.A7v() <= 0) {
                        throw new C0662Qu(e3, ht);
                    }
                    if (this.A06.A8x()) {
                        this.A06.A9d(ht);
                    }
                    if (0 != 0) {
                        httpURLConnection.disconnect();
                    }
                    return ht;
                }
            }
        } catch (Throwable th) {
            if (this.A06.A8x()) {
                this.A06.A9d(ht);
            }
            if (0 != 0) {
                httpURLConnection.disconnect();
            }
            throw th;
        }
    }

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 93);
        }
        return new String(copyOfRange);
    }

    public static void A0A() {
        A07 = new byte[]{16, 18, 55, 58, 95, 55, 53, 74, 71, 14, 74, 72, 15, 76, 90, 93, 67, 15, 14, 71, 93, 14, 64, 65, 90, 14, 79, 14, 88, 79, 66, 71, 74, 14, 123, 124, 98, 14, 65, 72, 14, 94, 102, 106, 9, 30, 106, 119, 106, 28, 16, 98, 100, 16, 13, 16, 55, 59, 111, 105, 98, 114, 117, 124, 59, 81, 17, 59, 50, 63, 46, 45, 59, 58, 94, 42, 55, 51, 59, 94, 67, 94, 1, 35, 50, 50, 47, 40, 33, 102, 50, 46, 35, 102, 46, 50, 50, 54, 102, 52, 35, 53, 54, 41, 40, 53, 35, 102, 50, 47, 43, 35, 34, 102, 41, 51, 50, 38, 13, 28, 31, 7, 26, 3, 72, 13, 26, 26, 7, 26, 34, 35, 49, 90, 79, 122, 107, 107, 119, 114, 120, 122, 111, 114, 116, 117, 52, 99, 54, 108, 108, 108, 54, 125, 116, 105, 118, 54, 110, 105, 119, 126, 117, 120, 116, Byte.MAX_VALUE, 126, Byte.MAX_VALUE, 32, 120, 115, 122, 105, 104, 126, 111, 38, 78, 79, 93, 54, 35, 47, 57, 62, 32, 108, 97, 39, 108, 97, 37, 24, 4, 4, 0, 94, 0, 2, 31, 8, 9, 56, 31, 3, 4, Byte.MAX_VALUE, 99, 99, 103, 57, 103, 101, 120, 111, 110, 71, 120, 101, 99, 52, 63, 46, 45, 53, 40, 49};
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x017b, code lost:            r7 = r29.A00;        r10 = java.lang.System.currentTimeMillis() - r1;     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0186, code lost:            if (r30.A04 != null) goto L69;     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0188, code lost:            r3 = 0;     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x018a, code lost:            r7.A9X(r1, r10, 0, r3, 0, new java.util.concurrent.TimeoutException(A07(82, 35, 27)));     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x01a3, code lost:            return null;     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:            r3 = r30.A04.length;     */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 44 out of bounds for length 31
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108 A[EDGE_INSN: B:50:0x0108->B:51:0x0108 BREAK  A[LOOP:0: B:2:0x002a->B:24:0x00cd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.InterfaceC0648Qg A0J(com.facebook.ads.redexgen.X.AbstractC0661Qt r30) throws com.facebook.ads.redexgen.X.C0662Qu {
        /*
            Method dump skipped, instructions count: 425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.HR.A0J(com.facebook.ads.redexgen.X.Qt):com.facebook.ads.redexgen.X.Qg");
    }

    static {
        A0A();
        A09 = InterfaceC0649Qh.class.getSimpleName();
    }

    public HR(C0654Qm c0654Qm, InterfaceC01987w interfaceC01987w, Executor executor) {
        A0B();
        this.A03 = c0654Qm;
        final HH hh = new HH(c0654Qm.A04());
        this.A06 = hh;
        this.A05 = new AbstractC0425Hm(hh) { // from class: com.facebook.ads.redexgen.X.4U
        };
        this.A01 = executor;
        this.A00 = interfaceC01987w;
    }

    private final int A00(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        OutputStream outputStream = null;
        try {
            outputStream = this.A05.ADg(httpURLConnection);
            if (outputStream != null) {
                this.A05.AGV(outputStream, bArr);
            }
            int responseCode = httpURLConnection.getResponseCode();
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused) {
                }
            }
            return responseCode;
        } catch (Throwable th) {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final InterfaceC0648Qg A02(AbstractC0661Qt abstractC0661Qt) {
        if (this.A03.A04()) {
            A0C(abstractC0661Qt);
        }
        InterfaceC0648Qg interfaceC0648Qg = null;
        try {
            interfaceC0648Qg = A01(abstractC0661Qt);
            return interfaceC0648Qg;
        } catch (C0662Qu hre) {
            this.A05.ABK(hre);
            return interfaceC0648Qg;
        } catch (Exception e) {
            this.A05.ABK(new C0662Qu(e, interfaceC0648Qg));
            return interfaceC0648Qg;
        }
    }

    private final InterfaceC0648Qg A03(String str, C0663Qv c0663Qv, C0657Qp c0657Qp) {
        return A02(new C0417He(str, c0663Qv, c0657Qp));
    }

    private final InterfaceC0648Qg A04(String str, String str2, byte[] bArr, C0657Qp c0657Qp) {
        return A02(new HW(str, null, str2, bArr, c0657Qp));
    }

    private final HT A05(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = httpURLConnection.getErrorStream();
            if (inputStream != null) {
                responseBody = this.A05.AEG(inputStream);
            }
            HT ht = new HT(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return ht;
        } catch (Throwable th) {
            if (A08[5].length() != 28) {
                throw new RuntimeException();
            }
            A08[4] = "eS";
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HT A06(HttpURLConnection httpURLConnection) throws Exception {
        InputStream inputStream = null;
        byte[] responseBody = null;
        try {
            inputStream = this.A05.ADf(httpURLConnection);
            if (inputStream != null) {
                responseBody = this.A05.AEG(inputStream);
            }
            HT ht = new HT(httpURLConnection, responseBody);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused) {
                }
            }
            return ht;
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (Exception unused2) {
                }
            }
            throw th;
        }
    }

    private final HttpURLConnection A08(String str, Proxy proxy) throws IOException {
        try {
            new URL(str);
            TrafficStats.setThreadStatsTag(61453);
            return this.A05.ADe(str, proxy);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(str + A07(18, 19, 115), e);
        }
    }

    public static Proxy A09() {
        Proxy proxy = Proxy.NO_PROXY;
        String property = System.getProperty(A07(192, 14, 45));
        String proxyAddress = System.getProperty(A07(206, 14, 74));
        int i = -1;
        if (proxyAddress != null) {
            try {
                i = Integer.parseInt(proxyAddress);
            } catch (NumberFormatException unused) {
                return proxy;
            }
        }
        boolean isEmpty = TextUtils.isEmpty(property);
        String[] strArr = A08;
        String portStr = strArr[0];
        if (portStr.charAt(28) == strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "UW2PAxLqNCWQ7bdKo0A7Pw4nSyNkIv";
        strArr2[6] = "26yRDH09B";
        if (!isEmpty && i > 0 && i <= 65535) {
            return new Proxy(Proxy.Type.HTTP, new InetSocketAddress(property, i));
        }
        return proxy;
    }

    public static synchronized void A0B() {
        synchronized (HR.class) {
            if (CookieHandler.getDefault() == null) {
                CookieHandler.setDefault(new CookieManager());
            }
        }
    }

    private void A0C(AbstractC0661Qt abstractC0661Qt) {
        StringBuilder sb = new StringBuilder(A07(182, 10, 17));
        boolean equals = abstractC0661Qt.A03().equals(EnumC0660Qs.A06);
        String A072 = A07(41, 1, 33);
        if (equals && abstractC0661Qt.A06() != null) {
            sb.append(A07(7, 5, 55));
            sb.append(new String(abstractC0661Qt.A06(), Charset.forName(A07(130, 5, 42))));
            sb.append(A072);
        }
        Map<String, String> A06 = abstractC0661Qt.A02().A06();
        String[] strArr = A08;
        if (strArr[1].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A08;
        strArr2[3] = "s0c02ga9sXqOOqZgqzjFkG4II3gfLx";
        strArr2[6] = "iECV1gT3x";
        for (Map.Entry<String, String> entry : A06.entrySet()) {
            sb.append(A07(2, 5, 74));
            sb.append(entry.getKey());
            sb.append(A07(66, 1, 118));
            sb.append(entry.getValue());
            sb.append(A072);
        }
        sb.append(A07(0, 2, 109));
        sb.append(abstractC0661Qt.A05());
        sb.append(A072);
        String sb2 = sb.toString();
        A0E(sb2, 1, (sb2.length() / 4000) + 1);
    }

    private void A0D(AbstractC0661Qt abstractC0661Qt, InterfaceC0650Qi interfaceC0650Qi) {
        this.A04.A5y(this, interfaceC0650Qi, this.A01).A04(abstractC0661Qt);
        if (this.A03.A04()) {
            A0C(abstractC0661Qt);
        }
    }

    private void A0E(String str, int i, int i2) {
        String str2 = A09 + A07(12, 6, 114) + i + A07(65, 1, 35) + i2;
        if (str.length() > 4000) {
            str.substring(0, 4000);
            A0E(str.substring(4000), i + 1, i2);
        }
    }

    private void A0F(String str, String str2, byte[] bArr, InterfaceC0650Qi interfaceC0650Qi, C0657Qp c0657Qp) {
        HW req = new HW(str, null, str2, bArr, c0657Qp);
        A0D(req, interfaceC0650Qi);
    }

    private void A0G(HttpURLConnection httpURLConnection, AbstractC0661Qt abstractC0661Qt) {
        Map<String, String> A06 = abstractC0661Qt.A02().A06();
        InterfaceC0647Qf A05 = abstractC0661Qt.A02().A05();
        for (String str : A06.keySet()) {
            httpURLConnection.setRequestProperty(str, A06.get(str));
        }
        if (A05 != null) {
            Map<String, String> A5k = A05.A5k(this.A03.A03());
            for (String str2 : A5k.keySet()) {
                httpURLConnection.setRequestProperty(str2, A5k.get(str2));
            }
        }
    }

    private final void A0H(HttpURLConnection httpURLConnection, AbstractC0661Qt abstractC0661Qt) throws IOException {
        C0657Qp A02 = abstractC0661Qt.A02();
        httpURLConnection.setConnectTimeout(A02.A00());
        httpURLConnection.setReadTimeout(A02.A02());
        this.A05.ADw(httpURLConnection, abstractC0661Qt.A03(), abstractC0661Qt.A04());
    }

    private final boolean A0I(Throwable th, long j, AbstractC0661Qt abstractC0661Qt) {
        C0657Qp A02 = abstractC0661Qt.A02();
        long elapsedTime = (System.currentTimeMillis() - j) + 10;
        if (this.A06.A8x()) {
            String str = A07(67, 15, 35) + elapsedTime + A07(42, 7, 23) + A02.A00() + A07(49, 7, 109) + A02.A02();
        }
        if (this.A02) {
            return elapsedTime >= ((long) A02.A02());
        }
        long A00 = A02.A00();
        if (A08[5].length() != 28) {
            throw new RuntimeException();
        }
        String[] strArr = A08;
        strArr[3] = "UT6xnSlzbr9JaeC9T1uoRQiwoDXC3Y";
        strArr[6] = "g5URFCrsk";
        return elapsedTime >= A00;
    }

    public final C0654Qm A0K() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0649Qh
    @Deprecated
    public final InterfaceC0648Qg ADo(String str, Map<String, String> parameters) {
        return A03(str, new C0663Qv(parameters), this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0649Qh
    @Deprecated
    public final InterfaceC0648Qg ADp(String str, byte[] bArr) {
        return A04(str, A07(135, 47, 70), bArr, this.A03.A00());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0649Qh
    public final void ADq(String str, byte[] bArr, InterfaceC0650Qi interfaceC0650Qi) {
        A0F(str, A07(135, 47, 70), bArr, interfaceC0650Qi, this.A03.A00());
    }
}
