package com.facebook.ads.redexgen.X;

import android.text.TextUtils;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Lp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0527Lp implements View.OnClickListener {
    public final /* synthetic */ C1X A00;
    public final /* synthetic */ C0452In A01;
    public final /* synthetic */ C0528Lq A02;
    public final /* synthetic */ InterfaceC0531Lt A03;
    public final /* synthetic */ String A04;

    public ViewOnClickListenerC0527Lp(C0528Lq c0528Lq, C0452In c0452In, InterfaceC0531Lt interfaceC0531Lt, String str, C1X c1x) {
        this.A02 = c0528Lq;
        this.A01 = c0452In;
        this.A03 = interfaceC0531Lt;
        this.A04 = str;
        this.A00 = c1x;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C2G c2g;
        YA ya;
        YA ya2;
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A01.A04(EnumC0451Im.A0A, null);
            c2g = this.A02.A02;
            ya = this.A02.A03;
            if (c2g.A0O(ya.A01(), true)) {
                this.A03.A98(this.A04, this.A00);
            } else if (!TextUtils.isEmpty(this.A00.A00())) {
                KZ kz = new KZ();
                ya2 = this.A02.A03;
                KZ.A0L(kz, ya2, C0490Kc.A00(this.A00.A00()), this.A04);
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
