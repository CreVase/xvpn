package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.b2, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0960b2 implements C0S {
    public static byte[] A08;
    public static String[] A09 = {"nHMpSWMsnsV7ze4k7TMdpo8w7eAhh5yl", "NZIGXtqvLJqJvnsqDFZQPtZx", "Ad1TvQCscaWcF7stMWLl9lRlqQAvL", "Ujq4dS9mEeqxvShJwD8UISSMYbM", "6D9", "oL3lqgBhSNj2gXyheQdgS3kbnnn96fNg", "3X2AVVUyUAfxSvaFg1Rh03BQkiDduKF9", "x5OfLFoNyht1tsSSgvPC5bYcCNR"};
    public final C0958b0 A00;
    public final AtomicReference<String> A06 = new AtomicReference<>();
    public final AtomicReference<String> A05 = new AtomicReference<>();
    public final AtomicReference<String> A04 = new AtomicReference<>();
    public final AtomicReference<EnumC00120d> A07 = new AtomicReference<>();
    public final AtomicInteger A02 = new AtomicInteger(-1);
    public final UUID A01 = UUID.randomUUID();
    public final AtomicInteger A03 = new AtomicInteger(1);

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A08, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 95);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{5, 22, 13, 13, 6, 15, 60, 109, 126, 101, 101, 110, 103, 84, 120, 110, 122};
        String[] strArr = A09;
        if (strArr[7].length() != strArr[3].length()) {
            throw new RuntimeException();
        }
        A09[2] = "yQ17NavN7ZSoq7zHySEgN4tR7loqT";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final void A03(JSONObject jSONObject) {
        if (K0.A02(this)) {
            return;
        }
        try {
            try {
                jSONObject.put(A00(7, 10, 84), this.A03.getAndIncrement());
            } catch (JSONException unused) {
            }
            C0Y.A0G.A04(this.A01).A02(jSONObject);
            String str = this.A06.get();
            if (!TextUtils.isEmpty(str)) {
                C0Y.A0V.A04(str).A02(jSONObject);
            }
            String str2 = this.A05.get();
            if (!TextUtils.isEmpty(str2)) {
                C0Y.A0U.A04(str2).A02(jSONObject);
            }
            String str3 = this.A04.get();
            if (!TextUtils.isEmpty(str3)) {
                C0Y.A0T.A04(str3).A02(jSONObject);
            }
            EnumC00120d enumC00120d = this.A07.get();
            if (enumC00120d != null) {
                C0Y.A0F.A04(enumC00120d).A02(jSONObject);
            }
            int i = this.A02.get();
            if (i != -1) {
                C0Y.A0H.A04(Integer.valueOf(i)).A02(jSONObject);
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    static {
        A01();
    }

    public C0960b2(C0958b0 c0958b0) {
        this.A00 = c0958b0;
    }

    private void A02(int i, String str) {
        if (K0.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(A00(0, 7, 60) + C0Y.A0S.getName(), str);
            } catch (JSONException unused) {
            }
            A03(jSONObject);
            this.A00.A00().A9b(i, jSONObject);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    public final void A04(C0U type, C0X... params) {
        if (K0.A02(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (C0X c0x : params) {
                c0x.A02(jSONObject);
            }
            A03(jSONObject);
            this.A00.A00().A9O(type, jSONObject);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2Y(String str, int reason) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0X, C0Y.A0L.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2Z(String objectHash) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0Y, C0Y.A0P.A04(objectHash));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2a(String objectHash) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0Z, C0Y.A0P.A04(objectHash));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2b(String objectHash) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0a, C0Y.A0P.A04(objectHash));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2c(String objectHash) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0b, C0Y.A0P.A04(objectHash));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2d(String objectHash) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0c, C0Y.A0P.A04(objectHash));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2e(String objectHash) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0d, C0Y.A0P.A04(objectHash));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2f() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0o, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2g() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A11, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2h(boolean listenerSet) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0f, C0Y.A01.A04(Boolean.valueOf(listenerSet)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2i(long loadTimeMs, int errorCode, String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A13, C0Y.A0I.A04(Integer.valueOf(errorCode)), C0Y.A0Q.A04(errorMessage), C0Y.A0O.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2j() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A15, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2k() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A14, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2l() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A16, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2m(long loadTimeMs) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A17, C0Y.A0O.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2n(C0Q reason) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2G, C0Y.A00.A04(reason));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2o(String placementType, String placementId) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A05.set(placementType);
            this.A04.set(placementId);
            A04(C0U.A0g, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2p() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0h, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2q() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0i, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2r(long loadTimeMs, int errorCode, String errorMessage, boolean isPublic) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0j, C0Y.A0O.A04(Long.valueOf(loadTimeMs)), C0Y.A0I.A04(Integer.valueOf(errorCode)), C0Y.A0Q.A04(errorMessage), C0Y.A09.A04(Boolean.valueOf(isPublic)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2s(long loadTimeMs) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0k, C0Y.A0O.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2t(boolean result) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1E, C0Y.A0E.A04(Boolean.valueOf(result)));
        } catch (Throwable th) {
            String[] strArr = A09;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A09[6] = "gK8mXYwR0ckPpFtcTSNh6868pPwacmBZ";
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2u() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1F, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2v(String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1K, C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2w() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1L, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2x() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1M, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2y() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1N, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A2z(int funnelVideoPauseReason) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1O, C0Y.A0L.A04(Integer.valueOf(funnelVideoPauseReason)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A30() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1P, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A31() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1S, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A32() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1Q, new C0X[0]);
        } catch (Throwable th) {
            if (A09[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            A09[6] = "TXE2cMU86vxtF7wI18ThzZXaU0uTRMLS";
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A33(int reason) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1R, C0Y.A0L.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A34() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1T, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A35(String uri) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1U, C0Y.A0S.A04(uri));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A36() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1V, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A37() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1W, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A38() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1X, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A39() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1Y, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3A(int funnelVideoStartReason) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1Z, C0Y.A0L.A04(Integer.valueOf(funnelVideoStartReason)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3B() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1a, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3C(int reason) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1b, C0Y.A0L.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3D() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2I, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
            if (A09[4].length() != 3) {
                throw new RuntimeException();
            }
            A09[6] = "VZoNBueTz9dHgRCK2oHhqd2tucTd08Xg";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3E() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2J, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3F(C0Q reason) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2F, C0Y.A00.A04(reason));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3G(int reason) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2H, C0Y.A0M.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A3H() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2K, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A42(long loadTimeMs) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0m, C0Y.A0O.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            K0.A00(th, this);
            if (A09[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            A09[1] = "iGvSb1Hz3BIwYRP6JXvlZVW4";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A43(long loadTimeMs, int chainedAdIndex) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0m, C0Y.A0O.A04(Long.valueOf(loadTimeMs)), C0Y.A0H.A04(Integer.valueOf(chainedAdIndex)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A44(long loadTimeMs) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0n, C0Y.A0O.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A45(long loadTimeMs, int chainedAdIndex) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0n, C0Y.A0O.A04(Long.valueOf(loadTimeMs)), C0Y.A0H.A04(Integer.valueOf(chainedAdIndex)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A48(int reason) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0R, C0Y.A0L.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            K0.A00(th, this);
            if (A09[2].length() != 29) {
                throw new RuntimeException();
            }
            A09[6] = "as8OMIQESYoL9XAyTG1hWJch2Dcqj1Tr";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A49() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0S, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4A() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0T, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4B() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0U, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4C() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0V, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4D() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0W, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4H() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0p, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4m() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0q, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4n() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0u, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4o(boolean isInvalidated) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0l, C0Y.A08.A04(Boolean.valueOf(isInvalidated)));
        } catch (Throwable th) {
            if (A09[1].length() == 19) {
                throw new RuntimeException();
            }
            A09[5] = "sws4bQbg9GprWoTPEe05ZlT1gMn94mHS";
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4p(int errorCode, String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0v, C0Y.A0I.A04(Integer.valueOf(errorCode)), C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4q(boolean hasBid) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0t, C0Y.A03.A04(Boolean.valueOf(hasBid)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4r() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0x, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4s() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0y, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4t() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A0z, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A4u() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A10, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5A() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1f, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5B(String message) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1g, C0Y.A0S.A04(message));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5C() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1h, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5D() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1i, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5E() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1j, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5F(String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1k, C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5G(String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1l, C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5H(String message) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1m, C0Y.A0S.A04(message));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5I(String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1o, C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5J() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1p, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5K(String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1q, C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5L(long loadTimeMs) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1r, C0Y.A0O.A04(Long.valueOf(loadTimeMs)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A5M(String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1s, C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8U() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1u, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8V(boolean isDisabledByGK) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1v, C0Y.A07.A04(Boolean.valueOf(isDisabledByGK)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8W() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1w, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8X(String error) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1x, C0Y.A0Q.A04(error));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8Y() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1y, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8Z() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1z, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A8a(String exception) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A20, C0Y.A0R.A04(exception));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9K(int code, String message) {
        if (K0.A02(this) || code < 11000 || code > 11099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9Q(String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1t, C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9j(String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2D, C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9k(int isLeftTopHalf) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2C, C0Y.A0J.A04(Integer.valueOf(isLeftTopHalf)));
        } catch (Throwable th) {
            K0.A00(th, this);
            if (A09[4].length() != 3) {
                throw new RuntimeException();
            }
            A09[2] = "KlgjxsUm6vsXx05HcBIzngY4X5Kok";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9l(boolean isSplitScreenSupportedInApp, boolean isSplitScreenFlagAdded) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2E, C0Y.A0B.A04(Boolean.valueOf(isSplitScreenSupportedInApp)), C0Y.A0A.A04(Boolean.valueOf(isSplitScreenFlagAdded)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9s() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2M, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9t() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2L, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9u(String falseReasonMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2N, C0Y.A0W.A04(falseReasonMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9v() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2O, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void A9w() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2P, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AA7(String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A18, C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AA8(int reason) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A19, C0Y.A0M.A04(Integer.valueOf(reason)));
        } catch (Throwable th) {
            K0.A00(th, this);
            if (A09[4].length() != 3) {
                throw new RuntimeException();
            }
            A09[1] = "n4mJfQKCjkVGyNTXc44lq1NfZCr";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AA9() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A23, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AAA() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A24, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AAB() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A25, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AAD() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1A, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
            if (A09[5].charAt(28) == 'u') {
                throw new RuntimeException();
            }
            A09[0] = "A3lONLTCXWx4KhpkbRCT5RNlo5C8otzX";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void ADA(int actionMode) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1G, C0Y.A0K.A04(Integer.valueOf(actionMode)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AEM(String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1C, C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AEN() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1D, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AFB(int index) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A02.set(index);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AFS(String requestId) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A06.set(requestId);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AFV(EnumC00120d viewType) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A07.set(viewType);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AG8() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1I, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AG9() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1c, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGD() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2Q, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGE(int code, String message) {
        if (K0.A02(this) || code < 12000 || code > 12099) {
            return;
        }
        try {
            A02(code, message);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGF() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2R, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGG() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2S, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGH() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2T, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGI(boolean callIgnored) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2U, C0Y.A02.A04(Boolean.valueOf(callIgnored)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGJ() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2V, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGK() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2W, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGL(int errorCode, String message) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2X, C0Y.A0I.A04(Integer.valueOf(errorCode)), C0Y.A0Q.A04(message));
        } catch (Throwable th) {
            if (A09[0].charAt(15) != 'k') {
                throw new RuntimeException();
            }
            A09[2] = "2PKYVe8Qgwv7j3CDJ6bxblARvZgyh";
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGM(boolean hasWebview) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2Y, C0Y.A06.A04(Boolean.valueOf(hasWebview)));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGN() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2Z, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGO(String error) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2a, C0Y.A0Q.A04(error));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGP(int i, String error) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2b, C0Y.A0Q.A04(error));
        } catch (Throwable th) {
            K0.A00(th, this);
            if (A09[6].charAt(19) != 'h') {
                throw new RuntimeException();
            }
            String[] strArr = A09;
            strArr[7] = "5qwGvT3tjlGxlYjcZrXYRuOycIv";
            strArr[3] = "UEyDz1QZjBltnQnS2IeC3S3ns7y";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGQ() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2c, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGR(int visibility) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A2d, C0Y.A0N.A04(Integer.valueOf(visibility)));
        } catch (Throwable th) {
            String[] strArr = A09;
            if (strArr[7].length() != strArr[3].length()) {
                throw new RuntimeException();
            }
            A09[2] = "bm6dbMytZvpqzg8D3QKVLEJHQj3Ec";
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGW(String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1d, C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void AGX(String errorMessage) {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1e, C0Y.A0Q.A04(errorMessage));
        } catch (Throwable th) {
            K0.A00(th, this);
            if (A09[1].length() == 19) {
                throw new RuntimeException();
            }
            A09[5] = "ivuB5Sydf2jbsPKu7So7nbx7xRGWOHbH";
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final String getId() {
        if (K0.A02(this)) {
            return null;
        }
        try {
            return this.A01.toString();
        } catch (Throwable th) {
            K0.A00(th, this);
            return null;
        }
    }

    @Override // com.facebook.ads.redexgen.X.C0S
    public final void unregisterView() {
        if (K0.A02(this)) {
            return;
        }
        try {
            A04(C0U.A1H, new C0X[0]);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
