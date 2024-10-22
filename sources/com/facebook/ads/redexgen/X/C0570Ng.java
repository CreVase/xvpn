package com.facebook.ads.redexgen.X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.RewardData;

/* renamed from: com.facebook.ads.redexgen.X.Ng, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0570Ng extends FrameLayout {
    public static String[] A07 = {"Lu0oG19N", "JNY", "Ev6F9eDhg42RHlCeRuJfEtiFO07AluFn", "qSbaO4FE34QcNqD1YWxCxyT8wr5s9kWw", "hZddA1hSD7Y", "v9TnLSaOxYneacolptRVdRHaZQ0ab06L", "iyW9tyIIQvF7WQz3LOxNHXxa074IcWbN", "vzh"};
    public AbstractC0530Ls A00;
    public final AbstractC0924aS A01;
    public final YA A02;
    public final InterfaceC0531Lt A03;
    public final InterfaceC0569Nf A04;
    public final RX A05;
    public final View[] A06;

    public C0570Ng(C0589Nz c0589Nz, AbstractC0924aS abstractC0924aS, RX rx, C0466Jb c0466Jb, NR nr, InterfaceC0531Lt interfaceC0531Lt, InterfaceC0569Nf interfaceC0569Nf) {
        this(c0589Nz, abstractC0924aS, rx, interfaceC0531Lt, interfaceC0569Nf, c0466Jb, nr);
    }

    public C0570Ng(C0589Nz c0589Nz, AbstractC0924aS abstractC0924aS, RX rx, InterfaceC0531Lt interfaceC0531Lt, InterfaceC0569Nf interfaceC0569Nf, View... viewArr) {
        this(c0589Nz.A05(), c0589Nz.A08(), abstractC0924aS, rx, interfaceC0531Lt, interfaceC0569Nf, viewArr);
    }

    public C0570Ng(YA ya, AbstractC0530Ls abstractC0530Ls, AbstractC0924aS abstractC0924aS, RX rx, InterfaceC0531Lt interfaceC0531Lt, InterfaceC0569Nf interfaceC0569Nf, View... viewArr) {
        super(ya);
        this.A02 = ya;
        this.A00 = abstractC0530Ls;
        this.A01 = abstractC0924aS;
        this.A06 = viewArr;
        this.A03 = interfaceC0531Lt;
        this.A05 = rx;
        this.A04 = interfaceC0569Nf;
        A03();
    }

    private void A03() {
        String title;
        RewardData A0J = this.A01.A0J();
        if (A0J == null) {
            title = this.A01.A0y().A05();
        } else {
            title = this.A01.A0y().A06(A0J.getCurrency(), A0J.getQuantity());
        }
        M3 m3 = new M3(this.A02, -1, -16777216, title, null, this.A01.A0y().A04(), this.A01.A0y().A03(), C0516Le.A01(EnumC0515Ld.REWARD_ICON));
        m3.A02.setOnClickListener(new ViewOnClickListenerC0567Nd(this));
        m3.A01.setOnClickListener(new ViewOnClickListenerC0568Ne(this));
        addView(m3, new RelativeLayout.LayoutParams(-1, -1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A04() {
        RX rx = this.A05;
        if (rx != null) {
            rx.A0a(EnumC0620Pe.A07);
        }
        this.A04.AAS();
        if (!this.A01.A0v().A0O()) {
            this.A01.A14(this.A03);
        }
    }

    public final void A07(ViewGroup viewGroup) {
        RX rx = this.A05;
        if (rx != null && !rx.A0j()) {
            this.A05.A0f(false, false, 11);
            LV.A0N(this.A05, 4);
        }
        AbstractC0530Ls abstractC0530Ls = this.A00;
        String[] strArr = A07;
        if (strArr[7].length() != strArr[1].length()) {
            throw new RuntimeException();
        }
        A07[0] = "vGH3jzSu";
        if (abstractC0530Ls != null) {
            LV.A0H(abstractC0530Ls);
        }
        for (View view : this.A06) {
            view.clearAnimation();
            LV.A0N(view, 4);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        viewGroup.addView(this, layoutParams);
        this.A04.AC0();
    }
}
