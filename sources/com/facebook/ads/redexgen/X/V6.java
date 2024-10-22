package com.facebook.ads.redexgen.X;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* loaded from: assets/audience_network.dex */
public final class V6 implements InterfaceC0408Gv {
    public HandlerC0402Gp<? extends InterfaceC0403Gq> A00;
    public IOException A01;
    public final ExecutorService A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 14
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final <T extends InterfaceC0403Gq> long A04(T t, InterfaceC0401Go<T> interfaceC0401Go, int i) {
        Looper myLooper = Looper.myLooper();
        HI.A04(myLooper != null);
        this.A01 = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new HandlerC0402Gp(this, myLooper, t, interfaceC0401Go, i, elapsedRealtime).A06(0L);
        return elapsedRealtime;
    }

    public V6(String str) {
        this.A02 = C0436Hx.A0T(str);
    }

    public final void A05() {
        this.A00.A07(false);
    }

    public final void A06(int i) throws IOException {
        IOException iOException = this.A01;
        if (iOException == null) {
            HandlerC0402Gp<? extends InterfaceC0403Gq> handlerC0402Gp = this.A00;
            if (handlerC0402Gp != null) {
                if (i == Integer.MIN_VALUE) {
                    i = handlerC0402Gp.A03;
                }
                handlerC0402Gp.A05(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void A07(InterfaceC0404Gr interfaceC0404Gr) {
        HandlerC0402Gp<? extends InterfaceC0403Gq> handlerC0402Gp = this.A00;
        if (handlerC0402Gp != null) {
            handlerC0402Gp.A07(true);
        }
        if (interfaceC0404Gr != null) {
            this.A02.execute(new RunnableC0405Gs(interfaceC0404Gr));
        }
        this.A02.shutdown();
    }

    public final boolean A08() {
        return this.A00 != null;
    }
}
