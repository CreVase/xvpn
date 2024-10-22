package com.facebook.ads.redexgen.X;

import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.facebook.ads.redexgen.X.bZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0986bZ {
    public final Map<View, C0993bg> A00 = new WeakHashMap();

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final synchronized C0993bg A00(View view) {
        C0993bg c0993bg = this.A00.get(view);
        if (c0993bg != null) {
            return c0993bg;
        }
        return C0993bg.A08;
    }

    public final synchronized void A01(View view) {
        this.A00.remove(view);
    }

    public final synchronized void A02(View view, C0993bg c0993bg) {
        this.A00.put(view, c0993bg);
    }

    public final synchronized void A03(Collection<View> result) {
        Iterator<View> it = this.A00.keySet().iterator();
        while (it.hasNext()) {
            result.add(it.next());
        }
    }
}
