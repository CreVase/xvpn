package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Io, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnAttachStateChangeListenerC0453Io implements View.OnAttachStateChangeListener {
    public final /* synthetic */ EnumC0451Im A00;
    public final /* synthetic */ C0452In A01;

    public ViewOnAttachStateChangeListenerC0453Io(C0452In c0452In, EnumC0451Im enumC0451Im) {
        this.A01 = c0452In;
        this.A00 = enumC0451Im;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.A01.A04(this.A00, null);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
