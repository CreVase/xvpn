package com.facebook.ads.redexgen.X;

import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.Metadata;
import com.facebook.ads.internal.exoplayer2.thirdparty.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Vw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0791Vw implements DE {
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 23 out of bounds for length 22
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.DE
    public final Metadata A4x(D1 d1) {
        ByteBuffer byteBuffer = d1.A01;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        C0420Hh c0420Hh = new C0420Hh(array, limit);
        String A0Q = c0420Hh.A0Q();
        String A0Q2 = c0420Hh.A0Q();
        long A0M = c0420Hh.A0M();
        return new Metadata(new EventMessage(A0Q, A0Q2, C0436Hx.A0F(c0420Hh.A0M(), 1000L, A0M), c0420Hh.A0M(), Arrays.copyOfRange(array, c0420Hh.A06(), limit), C0436Hx.A0F(c0420Hh.A0M(), 1000000L, A0M)));
    }
}
