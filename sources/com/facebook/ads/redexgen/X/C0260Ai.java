package com.facebook.ads.redexgen.X;

import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ai, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0260Ai extends ZB {
    public final /* synthetic */ C0253Ab A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 11 out of bounds for length 11
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.ZB
    public final int A0O(View view, int i) {
        int i2;
        AbstractC01124c A08 = A08();
        if (!A08.A24()) {
            return 0;
        }
        C01134d c01134d = (C01134d) view.getLayoutParams();
        int A0N = A0N(A08.A0k(view) - c01134d.leftMargin, A08.A0n(view) + c01134d.rightMargin, A08.A0e(), A08.A0h() - A08.A0f(), i);
        i2 = this.A00.A02;
        return A0N + i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0260Ai(C0253Ab c0253Ab, YA ya) {
        super(ya);
        this.A00 = c0253Ab;
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final float A0J(DisplayMetrics displayMetrics) {
        float f;
        f = this.A00.A00;
        return f / displayMetrics.densityDpi;
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final int A0K() {
        return -1;
    }

    @Override // com.facebook.ads.redexgen.X.ZB
    public final PointF A0P(int i) {
        return this.A00.A4L(i);
    }
}
