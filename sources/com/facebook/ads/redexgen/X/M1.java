package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.animation.Animation;

/* loaded from: assets/audience_network.dex */
public class M1 implements Animation.AnimationListener {
    public final /* synthetic */ C5J A00;
    public final /* synthetic */ AbstractC0723Td A01;
    public final /* synthetic */ AbstractC0723Td A02;

    public M1(AbstractC0723Td abstractC0723Td, AbstractC0723Td abstractC0723Td2, C5J c5j) {
        this.A01 = abstractC0723Td;
        this.A02 = abstractC0723Td2;
        this.A00 = c5j;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        this.A01.A04 = false;
        LV.A0H(this.A02);
        new Handler().postDelayed(new C0726Tg(this), 200L);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
