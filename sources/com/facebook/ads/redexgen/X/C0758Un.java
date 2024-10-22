package com.facebook.ads.redexgen.X;

import android.graphics.Rect;

/* renamed from: com.facebook.ads.redexgen.X.Un, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0758Un implements IU {
    public static String[] A02 = {"AMQNzlG2eGPOJo74lPpddO6twtMEce", "8uZuLGh3CZSzV4eSaK74M9a8aAW81o1g", "CYs8BZmCr6kO5jRRUq4laItl384RlovT", "PO4hUmmCpilEicL1R3sLdD9hI0Kiey5Z", "WmgRsP13YsLJamj9MMjVCco3tjnpIVCq", "0ErvOAeoLZJf3MJzf6jF5Cw5BrHPqp", "S0kgbIpbc64QMPj8XCJtTK8zDrzNpUnW", "MO6xPizLQkqntlkNHRrNVg7dZ2stU5UP"};
    public final Rect A00 = new Rect();
    public final Rect A01 = new Rect();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private boolean A01(C0993bg<IV, C0439Ia> c0993bg, InterfaceC0982bV interfaceC0982bV) {
        float f = -1.0f;
        try {
            f = interfaceC0982bV.A8D(c0993bg);
        } catch (IllegalStateException unused) {
        }
        if (f > 0.0f && A00(c0993bg)) {
            return true;
        }
        if (c0993bg.A02.A00().getGlobalVisibleRect(this.A01) && this.A01.bottom - this.A01.top > 0 && A00(c0993bg)) {
            return true;
        }
        interfaceC0982bV.A8C(this.A00);
        interfaceC0982bV.A71(c0993bg, this.A01);
        return (this.A00.bottom - this.A00.top > 0 && this.A01.bottom - this.A00.top > 0) && A00(c0993bg);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public static boolean A00(C0993bg<IV, C0439Ia> c0993bg) {
        if (c0993bg.A02.A05()) {
            return c0993bg.A03.A07();
        }
        if (!c0993bg.A02.A06()) {
            return true;
        }
        C0439Ia c0439Ia = c0993bg.A03;
        String[] strArr = A02;
        if (strArr[3].charAt(7) != strArr[2].charAt(7)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "8O0EOVeCMdEJdeSbYPFIeNjJXhTUSITs";
        strArr2[2] = "Km62DwbCV8Ma1ecjtuIU72b1y8KakI9d";
        return c0439Ia.A06();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.bg != com.instagram.common.viewpoint.core.ViewpointData<com.facebook.ads.internal.impressionsecondchannel.model.Impression, com.facebook.ads.internal.impressionsecondchannel.state.ImpressionState> */
    public final void A02(C0993bg<IV, C0439Ia> c0993bg, InterfaceC0982bV interfaceC0982bV) {
        if (c0993bg.A03.A04() && A01(c0993bg, interfaceC0982bV)) {
            c0993bg.A03.A01();
            c0993bg.A02.A02().A9e(c0993bg.A02.A03(), c0993bg.A02.A04());
        }
        if (c0993bg.A03.A05() && IP.A1L(c0993bg.A02.A01())) {
            c0993bg.A03.A02();
            c0993bg.A02.A02().A9U(c0993bg.A02.A03(), c0993bg.A02.A04());
        }
    }
}
