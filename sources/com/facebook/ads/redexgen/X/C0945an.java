package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.an, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0945an implements OW {
    public final /* synthetic */ C0942ak A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // com.facebook.ads.redexgen.X.OW
    public final void A97() {
        F6 f6;
        C0336Dz c0336Dz;
        f6 = this.A00.A02;
        String A00 = f6.A0z().A00();
        if (TextUtils.isEmpty(A00)) {
            return;
        }
        KZ kz = new KZ();
        c0336Dz = this.A00.A03;
        KZ.A0L(kz, c0336Dz, C0490Kc.A00(A00), this.A00.A6N());
    }

    public C0945an(C0942ak c0942ak) {
        this.A00 = c0942ak;
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void ABE(AnonymousClass95 anonymousClass95) {
        new Handler(Looper.getMainLooper()).postDelayed(new C0946ao(this, anonymousClass95), 1L);
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void ABT() {
    }

    @Override // com.facebook.ads.redexgen.X.OW
    public final void ADB(View view, MotionEvent motionEvent) {
    }
}
