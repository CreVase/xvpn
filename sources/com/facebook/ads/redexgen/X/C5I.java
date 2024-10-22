package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.5I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public class C5I implements View.OnLongClickListener {
    public final /* synthetic */ C5J A00;

    public C5I(C5J c5j) {
        this.A00 = c5j;
    }

    public /* synthetic */ C5I(C5J c5j, C5F c5f) {
        this(c5j);
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        if (C5J.A03(this.A00) != null && C5J.A01(this.A00) != null) {
            C5J.A03(this.A00).setBounds(0, 0, C5J.A01(this.A00).getWidth(), C5J.A01(this.A00).getHeight());
            C5J.A03(this.A00).A0D(!C5J.A03(this.A00).A0E());
        }
        return true;
    }
}
