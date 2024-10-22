package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Sa, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0694Sa extends FrameLayout implements InterfaceC0532Lu {
    public String A00;
    public final InterfaceC0531Lt A01;
    public final C0597Oh A02;

    public C0694Sa(YA ya, InterfaceC0531Lt interfaceC0531Lt, C0597Oh c0597Oh, String str) {
        super(ya);
        this.A02 = c0597Oh;
        this.A01 = interfaceC0531Lt;
        this.A00 = str;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void A9C(Intent intent, Bundle bundle, C5J c5j) {
        C0597Oh.A0B().incrementAndGet();
        this.A02.A0V();
        LV.A0J(this.A02.A0O());
        addView(this.A02.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A01.A3Q(this, new RelativeLayout.LayoutParams(-1, -1));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACJ(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACj(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void AEt(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public String getCurrentClientToken() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void onDestroy() {
        this.A02.A0U();
        if (this.A02.A0N() != null) {
            this.A02.A0N().ABT();
        }
        C0597Oh.A0B().decrementAndGet();
    }

    public void setListener(InterfaceC0531Lt interfaceC0531Lt) {
    }
}
