package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class O9 implements View.OnTouchListener {
    public final /* synthetic */ C0705Sl A00;

    public O9(C0705Sl c0705Sl) {
        this.A00 = c0705Sl;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                return true;
            case 1:
                float browserFinalY = motionEvent.getY();
                f = this.A00.A00;
                if (f >= browserFinalY) {
                    return true;
                }
                this.A00.A0f(false);
                return true;
            default:
                return true;
        }
    }
}
