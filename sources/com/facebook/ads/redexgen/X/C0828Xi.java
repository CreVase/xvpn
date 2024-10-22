package com.facebook.ads.redexgen.X;

import android.content.Context;
import com.facebook.ads.AdSettings;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;

/* renamed from: com.facebook.ads.redexgen.X.Xi, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0828Xi implements C7U {
    public static C0828Xi A07;
    public static byte[] A08;
    public static String[] A09 = {"kZNWMB05A80rolZkZr5gINRkemJedumA", "PGnlsDLswmZGHAGkHnqyou4j", "CQczeQcoxNMNqPeDO5UPH4delPie3CF6", "Ozs7AQnIuhnl4TF488yhCLnc3lqg3Tqv", "QUMQF15y8F49TOv2Mbtf3pi6YRJU7tsl", "iRM3Hx3PCEqf", "8yEJzjy1AvS4vnL", "zEXAgd0MZ6iopjt"};
    public C0V A00;
    public C6U A01;
    public C7T A02;
    public C7j A03;
    public C8N A04;
    public InterfaceC0456Ir A05;
    public InterfaceC0393Ge A06;

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:            throw new java.lang.RuntimeException();     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String A06(int r4, int r5, int r6) {
        /*
            byte[] r1 = com.facebook.ads.redexgen.X.C0828Xi.A08
            int r0 = r4 + r5
            byte[] r3 = java.util.Arrays.copyOfRange(r1, r4, r0)
            r4 = 0
        L9:
            int r5 = r3.length
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0828Xi.A09
            r0 = 6
            r1 = r2[r0]
            r0 = 7
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L22
        L1c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L22:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0828Xi.A09
            java.lang.String r1 = "Hv2WK1fJh7GnXaP"
            r0 = 6
            r2[r0] = r1
            java.lang.String r1 = "jwUFRNkRPBL5IaL"
            r0 = 7
            r2[r0] = r1
            if (r4 >= r5) goto L5c
            r5 = r3[r4]
            int r5 = r5 - r6
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0828Xi.A09
            r0 = 4
            r1 = r2[r0]
            r0 = 0
            r2 = r2[r0]
            r0 = 26
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto L48
            goto L1c
        L48:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C0828Xi.A09
            java.lang.String r1 = "3jbuj6iR6sIerVLqEJ9xAsC0KuP7QrbG"
            r0 = 2
            r2[r0] = r1
            java.lang.String r1 = "qsuffxm3RCjhy50iWQEl04Txy4tWGAPw"
            r0 = 3
            r2[r0] = r1
            int r0 = r5 + (-98)
            byte r0 = (byte) r0
            r3[r4] = r0
            int r4 = r4 + 1
            goto L9
        L5c:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C0828Xi.A06(int, int, int):java.lang.String");
    }

    public static void A07() {
        A08 = new byte[]{-61, -57, -14, -58, -56, -64, -60, -62, -16, 2, 16, 16, 6, 12, 11, -67, 1, -2, 17, -2, -67, 6, 11, 6, 17, 6, -2, 9, 6, 23, 2, 1, 33, 20, 31, 30, 33, 35, 2, 20, 34, 34, 24, 30, 29, -13, 16, 35, 16, -8, 29, 24, 35, 24, 16, 27, 24, 41, 20, 19};
        if (A09[1].length() == 32) {
            throw new RuntimeException();
        }
        String[] strArr = A09;
        strArr[2] = "XQj6tBQR93KUWcmqG7acynHpkyXbPHo4";
        strArr[3] = "0fPU7ngiro1m2vFzwgFa3cBnolZ3o5pA";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized void A0C(Y9 y9) {
        if (this.A06 != null) {
            return;
        }
        this.A03 = A01(y9);
        InterfaceC0393Ge A05 = A05(y9, this.A03, A03(y9));
        this.A06 = A05;
        A09(y9, A00(y9, A05));
        A0A(y9, this.A06);
        A0B(y9, this.A06);
        InterfaceC0393Ge interfaceC0393Ge = this.A06;
        if (interfaceC0393Ge != null) {
            interfaceC0393Ge.A5i();
        }
    }

    static {
        A07();
    }

    public static InterfaceC01555u A00(Y9 y9, InterfaceC0393Ge interfaceC0393Ge) {
        if (!IP.A1Q(y9) || interfaceC0393Ge == null) {
            return null;
        }
        return AbstractC01565v.A00().A00(interfaceC0393Ge);
    }

    public static C7j A01(Y9 y9) {
        return AbstractC01877k.A00().A00(y9, new C0835Xp());
    }

    public static synchronized C0828Xi A02() {
        C0828Xi c0828Xi;
        synchronized (C0828Xi.class) {
            if (A07 == null) {
                A07 = new C0828Xi();
            }
            c0828Xi = A07;
        }
        return c0828Xi;
    }

    public static InterfaceC0649Qh A03(Y9 y9) {
        if (!IP.A1M(y9)) {
            return null;
        }
        return C0667Qz.A01(y9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.C7U
    /* renamed from: A04, reason: merged with bridge method [inline-methods] */
    public final synchronized InterfaceC0393Ge A7y() {
        return this.A06;
    }

    public static InterfaceC0393Ge A05(Y9 y9, C7j c7j, InterfaceC0649Qh interfaceC0649Qh) {
        if (!IP.A2A(y9) || interfaceC0649Qh == null) {
            return null;
        }
        return RM.A00().A00(y9, c7j, interfaceC0649Qh, C0477Jo.A04(y9), new C0829Xj(new C0470Jg(y9, A06(0, 0, 122), null, JL.A07, AdSettings.getTestAdType() != AdSettings.TestAdType.DEFAULT ? AdSettings.getTestAdType().getAdTypeString() : null, 0, AdSettings.isTestMode(y9), AdSettings.isMixedAudience(), new JQ(), LD.A01(IP.A0J(y9)), null, null), y9), RK.A00().A00());
    }

    public static void A08() {
        String A06 = A06(8, 24, 59);
        if (A09[5].length() == 20) {
            throw new RuntimeException();
        }
        A09[5] = "4ii3kc4oT9MJsiDOLfNQb5ib2";
        JU.A05(A06(32, 28, 77), A06, A06(0, 8, 46));
    }

    public static void A09(Y9 y9, InterfaceC01555u interfaceC01555u) {
        if (!IP.A1Q(y9) || interfaceC01555u == null) {
            return;
        }
        AbstractC01535s.A00().A00(interfaceC01555u, y9);
    }

    public static void A0A(Y9 y9, InterfaceC0393Ge interfaceC0393Ge) {
        if (!IP.A0k(y9) || interfaceC0393Ge == null) {
            return;
        }
        new C6F(y9, interfaceC0393Ge, new C6G(), DynamicLoaderImpl.getBidderTokenProviderApi().A00());
    }

    public static void A0B(Y9 y9, InterfaceC0393Ge interfaceC0393Ge) {
        if (interfaceC0393Ge == null) {
            return;
        }
        IS.A00(y9, interfaceC0393Ge);
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final InterfaceC0444If A5q(Y9 y9) {
        return C0752Uh.A01(y9);
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final synchronized C7T A65(C7S c7s) {
        if (this.A02 == null) {
            this.A02 = new C0830Xk(this);
        }
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final synchronized C6U A6G() {
        if (this.A01 == null) {
            this.A01 = new YB();
        }
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final synchronized C7j A6d(C7S c7s) {
        if (this.A03 == null) {
            this.A03 = A01(c7s.A01());
        }
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final synchronized InterfaceC01987w A6e(C7S c7s) {
        return new C0844Xy(c7s);
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final synchronized C7V A6o(C7S c7s) {
        return new C0331Du(this, c7s);
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final synchronized C0V A70(C7S c7s) {
        if (!IP.A0w(c7s)) {
            return null;
        }
        if (this.A00 == null) {
            this.A00 = C0W.A00().A00(new C0833Xn(c7s));
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final synchronized C7X A7i(C7S c7s) {
        return new C0831Xl(c7s);
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final Y9 A7j(Context context) {
        Y9 sdkContext = C7R.A00();
        if (sdkContext == null) {
            Y9 sdkContext2 = new Y9(context, this);
            C7R.A01(sdkContext2);
            return sdkContext2;
        }
        return sdkContext;
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final synchronized InterfaceC0456Ir A7k(Y9 y9) {
        if (this.A05 == null) {
            this.A05 = new C0759Uo(y9);
        }
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.C7U
    public final synchronized C8N A7q() {
        if (this.A04 == null) {
            this.A04 = new C8N();
            A08();
        }
        return this.A04;
    }
}
