package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class PM implements View.OnTouchListener {
    public final /* synthetic */ PN A00;

    public PM(PN pn) {
        this.A00 = pn;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        InterfaceC0444If interfaceC0444If;
        AbstractC0924aS abstractC0924aS;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            PN.A00(this.A00);
            interfaceC0444If = this.A00.A06;
            abstractC0924aS = this.A00.A03;
            interfaceC0444If.A9Y(abstractC0924aS.A11(), new NL().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
