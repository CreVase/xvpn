package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Up, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class ViewOnAttachStateChangeListenerC0760Up extends AbstractC0991be implements View.OnAttachStateChangeListener {
    public final View A00;

    public ViewOnAttachStateChangeListenerC0760Up(View view) {
        this.A00 = view;
        view.addOnAttachStateChangeListener(this);
        if (A04()) {
            A00();
        }
    }

    public final void A03() {
        A00();
    }

    public final boolean A04() {
        return C3H.A0H(this.A00);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        A00();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        A01();
    }
}
