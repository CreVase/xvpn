package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.1f, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C00391f {
    public static byte[] A05;
    public static String[] A06 = {"jJreqFAWfQsm2UlBXjWleQZy51A8w9r3", "B5vxrqY9e1pfFDILbPSJEQZe5Zep9JAF", "7hwRhDIA2xM98ucsNVPICP0872", "8yYdfjKxcW1uK5E8nS4F9bT", "cwoTvwLLOWGZrFwonmn2qn9xu", "wuc4L", "VoE60CbUCih", "1JGxuEjawtyxaKItdz1AQ1lnM"};
    public C6Q A00;
    public NP A01 = NP.A06;
    public ArrayList<C0597Oh> A02 = new ArrayList<>();
    public final C1C A03;
    public final InterfaceC00381e A04;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 96);
        }
        return new String(copyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-97, -39, -27, -34, -35, -81, -44, -38, -53, -40, -44, -57, -46, -122, -85, -40, -40, -43, -40, -122, -104, -106, -106, -100, -122, -35, -49, -38, -50, -43, -37, -38, -122, -57, -122, -36, -57, -46, -49, -54, -122, -89, -54, -81, -44, -52, -43, -108, 31, 34, 29, 34, 31, 50, 31, 29, 32, 51, 44, 34, 42, 35, -45, -30, -37, -59, -54, -61, -53, -48, -63, -46, -61, -44, -61, -49, -43, -42, -37, -44, -36, -31, -40, -41, -76, -41, -73, -44, -25, -44, -75, -24, -31, -41, -33, -40, -38, -33, -27, -42, -29, -28, -27, -38, -27, -38, -46, -35};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A0J(YA ya, EnumSet<CacheFlag> enumSet) {
        if (A0E() == EnumC0479Jq.A03) {
            C0922aQ c0922aQ = (C0922aQ) this.A03;
            AbstractC0924aS A0s = c0922aQ.A0s();
            if (A0C(ya, A0s) || A0s == null) {
                return;
            }
            this.A04.AEL();
            A0A(ya, enumSet, c0922aQ, A0s, 0, this.A04);
            return;
        }
        if (A0C(ya, (AbstractC0924aS) this.A03)) {
            return;
        }
        this.A04.AEL();
        if (A0E() == EnumC0479Jq.A0B) {
            A08(ya, (F0) this.A03);
        } else {
            A09(ya, enumSet, (F0) this.A03, -1, this.A04);
        }
    }

    static {
        A06();
    }

    public C00391f(YA ya, C00521s c00521s, InterfaceC00381e interfaceC00381e, String str) {
        JSONObject dataObject = c00521s.A03();
        this.A03 = A01(ya, c00521s, str, dataObject);
        this.A04 = interfaceC00381e;
    }

    private AdError A00(YA ya, AbstractC0924aS abstractC0924aS) {
        if (abstractC0924aS == null || abstractC0924aS.A13().isEmpty()) {
            ya.A07().A9M(A04(62, 3, 18), C01997x.A0Z, new C02007y(A04(5, 43, 6)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static C1C A01(YA ya, C00521s c00521s, String str, JSONObject jSONObject) {
        C1C c1c = null;
        if (jSONObject.has(A04(65, 12, 2))) {
            try {
                c1c = C0922aQ.A03(jSONObject, ya, true);
                c1c.A0c(true);
                c1c.A0Z(A04(96, 12, 17));
            } catch (JSONException unused) {
            }
        }
        if (c1c == null) {
            c1c = F0.A02(jSONObject, ya);
        }
        c1c.A0Y(str);
        C8G A01 = c00521s.A01();
        if (A01 != null) {
            c1c.A0V(A01.A06());
        }
        return c1c;
    }

    private C6Q A03(YA ya) {
        C6Q c6q = this.A00;
        return c6q != null ? c6q : new C6Q(ya);
    }

    private void A08(YA ya, F0 f0) {
        C1Z playableData = f0.A0v().A0D().A06();
        A0B(playableData != null ? playableData.A0A() : NP.A06);
        C0913aH c0913aH = new C0913aH(this);
        C6Q c6q = new C6Q(ya);
        boolean z = IP.A1j(ya) && C01515q.A0A(f0.A0U());
        if (z) {
            C01515q unifiedAssetsLoader = new C01515q(c6q, f0.A0U(), f0.A0O(), f0.A0R(), z, new C0912aG(this));
            c6q.A0d(new C0452In(f0.A11(), ya.A09()));
            unifiedAssetsLoader.A0B();
            return;
        }
        C00491p.A02(ya, f0, true, c0913aH);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0092, code lost:            if (r21 != false) goto L17;     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0094, code lost:            r7 = new com.facebook.ads.redexgen.X.C6M(r27.A0L(), r27.A0R(), r1);        r7.A04 = true;        r7.A03 = A04(0, 5, 17);        r13.A0X(r7);     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b0, code lost:            r13.A0c(new com.facebook.ads.redexgen.X.C6O(r27.A0z().A01(), com.facebook.ads.redexgen.X.PB.A04, com.facebook.ads.redexgen.X.PB.A04, r27.A0R(), A04(96, 12, 17)));        r12 = r26.contains(com.facebook.ads.CacheFlag.VIDEO);        r11 = 0;        r10 = com.facebook.ads.redexgen.X.IP.A2N(r25, com.facebook.ads.redexgen.X.QJ.A03());        r9 = r27.A13().iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ef, code lost:            if (r9.hasNext() == false) goto L53;     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f1, code lost:            r0 = r9.next();        r14 = new com.facebook.ads.redexgen.X.C6O(r0.A0D().A07(), com.facebook.ads.redexgen.X.C00451l.A00(r0.A0D()), com.facebook.ads.redexgen.X.C00451l.A01(r0.A0D()), r27.A0R(), A04(96, 12, 17));     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0122, code lost:            if (r11 != 0) goto L45;     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0124, code lost:            r13.A0b(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0127, code lost:            r8 = r0.A0G().A01();        r7 = com.facebook.ads.redexgen.X.C00391f.A06;     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:            if (r7[6].length() == r7[2].length()) goto L44;     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:            r7 = com.facebook.ads.redexgen.X.C00391f.A06;        r7[1] = "D8Za7DAeUKhUMlH0nChh1nyf5MUepOev";        r7[0] = "YMJugZMvnGL61TcEtQKO8oN05ixDNSHw";        r8 = r8.iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0155, code lost:            if (r8.hasNext() == false) goto L60;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0157, code lost:            r13.A0c(new com.facebook.ads.redexgen.X.C6O(r8.next(), -1, -1, r27.A0R(), A04(96, 12, 17)));     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0178, code lost:            if (r12 == false) goto L55;     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0186, code lost:            if (android.text.TextUtils.isEmpty(r0.A0D().A08()) != false) goto L56;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0188, code lost:            r14 = new com.facebook.ads.redexgen.X.C6M(r0.A0D().A08(), r27.A0R(), A04(96, 12, 17), r0.A0D().A05());        r14.A04 = false;     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x01ad, code lost:            if (r11 != 0) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x01af, code lost:            if (r21 == false) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x01b1, code lost:            if (r10 != false) goto L39;     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x01b3, code lost:            r13.A0X(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b6, code lost:            r11 = r11 + 1;     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01ba, code lost:            r13.A0a(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01be, code lost:            if (r21 == false) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01c0, code lost:            if (r10 != false) goto L43;     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c2, code lost:            r13.A0Y(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01c6, code lost:            r13.A0Z(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ca, code lost:            r8 = r8.iterator();     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01cf, code lost:            r13.A0c(r14);     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e4, code lost:            r13.A0W(new com.facebook.ads.redexgen.X.C0914aI(r24, r25, r21, r27, r29), new com.facebook.ads.redexgen.X.C6J(r27.A0R(), r1, r28));     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:            return;     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x01e0, code lost:            if (r21 != false) goto L17;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A09(com.facebook.ads.redexgen.X.YA r25, java.util.EnumSet<com.facebook.ads.CacheFlag> r26, com.facebook.ads.redexgen.X.AbstractC0924aS r27, int r28, com.facebook.ads.redexgen.X.InterfaceC00381e r29) {
        /*
            Method dump skipped, instructions count: 521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C00391f.A09(com.facebook.ads.redexgen.X.YA, java.util.EnumSet, com.facebook.ads.redexgen.X.aS, int, com.facebook.ads.redexgen.X.1e):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(YA ya, EnumSet<CacheFlag> enumSet, C0922aQ c0922aQ, AbstractC0924aS abstractC0924aS, int i, InterfaceC00381e interfaceC00381e) {
        A09(ya, enumSet, abstractC0924aS, i, new C0918aM(this, ya, abstractC0924aS, c0922aQ, i, interfaceC00381e, enumSet));
    }

    private void A0B(NP np) {
        this.A01 = np;
    }

    private boolean A0C(YA ya, AbstractC0924aS abstractC0924aS) {
        AdError A00 = A00(ya, abstractC0924aS);
        if (A00 != null) {
            InterfaceC00381e interfaceC00381e = this.A04;
            String[] strArr = A06;
            if (strArr[1].charAt(24) != strArr[0].charAt(24)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[1] = "Dm6wm58uJ8qXwjtNx8Vtzbsb5Jkw9mit";
            strArr2[0] = "fLwuuFNg4tiwPdo6hP9t6x3v5l5Hcavg";
            interfaceC00381e.AAP(A00);
            return true;
        }
        return false;
    }

    public final C1C A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:            if (r3 != false) goto L32;     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00af, code lost:            return com.facebook.ads.redexgen.X.EnumC0479Jq.A0C;     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:            return com.facebook.ads.redexgen.X.EnumC0479Jq.A0A;     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b7, code lost:            if (r3 != false) goto L32;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.X.EnumC0479Jq A0E() {
        /*
            r4 = this;
            com.facebook.ads.redexgen.X.1C r0 = r4.A03
            boolean r0 = r0.A0h()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.Jq r0 = com.facebook.ads.redexgen.X.EnumC0479Jq.A03
            return r0
        Lb:
            com.facebook.ads.redexgen.X.1C r3 = r4.A03
            com.facebook.ads.redexgen.X.aS r3 = (com.facebook.ads.redexgen.X.AbstractC0924aS) r3
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C00391f.A06
            r0 = 6
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L50
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C00391f.A06
            java.lang.String r1 = "f4kXngrP8CD5dz"
            r0 = 3
            r2[r0] = r1
            boolean r0 = r3.A0k()
            if (r0 == 0) goto L31
            com.facebook.ads.redexgen.X.Jq r0 = com.facebook.ads.redexgen.X.EnumC0479Jq.A05
            return r0
        L31:
            java.util.List r0 = r3.A13()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L5e
            com.facebook.ads.redexgen.X.Jq r3 = com.facebook.ads.redexgen.X.EnumC0479Jq.A09
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C00391f.A06
            r0 = 7
            r1 = r2[r0]
            r0 = 4
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L56
        L50:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L56:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C00391f.A06
            java.lang.String r1 = "ny"
            r0 = 3
            r2[r0] = r1
            return r3
        L5e:
            com.facebook.ads.redexgen.X.1D r0 = r3.A0v()
            com.facebook.ads.redexgen.X.1G r0 = r0.A0D()
            com.facebook.ads.redexgen.X.1Z r0 = r0.A06()
            if (r0 == 0) goto L8e
            com.facebook.ads.redexgen.X.Jq r3 = com.facebook.ads.redexgen.X.EnumC0479Jq.A0B
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C00391f.A06
            r0 = 6
            r1 = r2[r0]
            r0 = 2
            r0 = r2[r0]
            int r1 = r1.length()
            int r0 = r0.length()
            if (r1 == r0) goto L88
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C00391f.A06
            java.lang.String r1 = "JH"
            r0 = 3
            r2[r0] = r1
            return r3
        L88:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L8e:
            boolean r3 = r4.A0L(r3)
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C00391f.A06
            r0 = 3
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 32
            if (r1 == r0) goto Lb0
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C00391f.A06
            java.lang.String r1 = "93R6MUXHMTxUt8WfLt1oZ3ea5zubl3sl"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "9xXPI1nVQC4CSUB4soKlPH985bh9DAt9"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto Lba
        Lad:
            com.facebook.ads.redexgen.X.Jq r0 = com.facebook.ads.redexgen.X.EnumC0479Jq.A0C
            return r0
        Lb0:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C00391f.A06
            java.lang.String r1 = "ySAy4b6nQ"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto Lba
            goto Lad
        Lba:
            com.facebook.ads.redexgen.X.Jq r0 = com.facebook.ads.redexgen.X.EnumC0479Jq.A0A
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C00391f.A0E():com.facebook.ads.redexgen.X.Jq");
    }

    public final NP A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A0h()) {
            return ((C0922aQ) this.A03).A0v();
        }
        return ((AbstractC0924aS) this.A03).A11();
    }

    public final void A0H() {
        this.A04.AG1();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A0X(rewardData);
        this.A03.A0a(str);
        if (A0D().A0h()) {
            intent.putExtra(A04(77, 19, 19), this.A03);
        }
        intent.putExtra(A04(48, 14, 94), this.A03);
    }

    public final boolean A0K() {
        return this.A03.A0e();
    }

    public final boolean A0L(AbstractC0924aS abstractC0924aS) {
        return !TextUtils.isEmpty(abstractC0924aS.A0v().A0D().A08());
    }
}
