package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0617Pb implements View.OnTouchListener {
    public final /* synthetic */ RX A00;

    public ViewOnTouchListenerC0617Pb(RX rx) {
        this.A00 = rx;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C8Z c8z;
        c8z = this.A00.A0B;
        c8z.A02(new L2(view, motionEvent));
        return false;
    }
}
