package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OV implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass96 A00;

    public OV(AnonymousClass96 anonymousClass96) {
        this.A00 = anonymousClass96;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        OZ oz;
        oz = this.A00.A0E;
        oz.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
