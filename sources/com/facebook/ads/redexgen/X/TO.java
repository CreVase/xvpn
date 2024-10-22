package com.facebook.ads.redexgen.X;

import android.os.Build;
import android.transition.ChangeBounds;
import android.transition.Explode;
import android.transition.TransitionSet;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public final class TO extends MR {
    public static final int A03 = (int) (C0506Ku.A02 * 8.0f);
    public final RelativeLayout A00;
    public final C2G A01;
    public final YA A02;

    public TO(YA ya, InterfaceC0444If interfaceC0444If, String str, C1X c1x, InterfaceC0532Lu interfaceC0532Lu, InterfaceC0531Lt interfaceC0531Lt) {
        super(ya, interfaceC0444If, str, c1x, interfaceC0532Lu, interfaceC0531Lt);
        this.A02 = ya;
        this.A01 = C2H.A00(ya.A01());
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A00 = relativeLayout;
        addView(relativeLayout, new RelativeLayout.LayoutParams(-1, -1));
        LV.A0M(relativeLayout, -1728053248);
        relativeLayout.setOnClickListener(new MW(this));
    }

    public static RelativeLayout.LayoutParams A0B(boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, z ? -1 : -2);
        layoutParams.addRule(12);
        return layoutParams;
    }

    private void A0C() {
        if (Build.VERSION.SDK_INT >= 21) {
            TransitionSet transitionSet = new TransitionSet();
            transitionSet.setOrdering(0);
            transitionSet.addTransition(new ChangeBounds()).addTransition(new Explode());
            LV.A0V(this, transitionSet);
            return;
        }
        LV.A0T(this);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A0L() {
        C2K A0A = this.A01.A0A();
        C0544Mg c0544Mg = new C0544Mg(this.A02);
        c0544Mg.setInfo(EnumC0515Ld.HIDE_AD, this.A01.A0H(), this.A01.A0G());
        c0544Mg.setOnClickListener(new MX(this));
        C2K A0B = this.A01.A0B();
        C0544Mg c0544Mg2 = new C0544Mg(this.A02);
        c0544Mg2.setInfo(EnumC0515Ld.REPORT_AD, this.A01.A0L(), this.A01.A0K());
        c0544Mg2.setOnClickListener(new MY(this));
        C0544Mg c0544Mg3 = new C0544Mg(this.A02);
        c0544Mg3.setInfo(EnumC0515Ld.AD_CHOICES_ICON, this.A01.A0M(), "");
        c0544Mg3.setOnClickListener(new MZ(this));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setClickable(true);
        linearLayout.setOrientation(1);
        int i = A03;
        linearLayout.setPadding(i * 2, i, i * 2, i);
        LV.A0M(linearLayout, -1);
        if (!A0A.A05().isEmpty()) {
            linearLayout.addView(c0544Mg, layoutParams);
        }
        if (!A0B.A05().isEmpty()) {
            linearLayout.addView(c0544Mg2, layoutParams);
        }
        linearLayout.addView(c0544Mg3, layoutParams);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(linearLayout, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A0M() {
        LV.A0I(this);
        this.A00.removeAllViews();
        LV.A0J(this);
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A0N(C2K c2k, C2I c2i) {
        String A0E;
        int i;
        if (c2i == C2I.A04) {
            return;
        }
        boolean z = c2i == C2I.A05;
        MP mp = new MP(this.A02, this.A0B);
        if (z) {
            A0E = this.A01.A0F();
        } else {
            A0E = this.A01.A0E();
        }
        MP A0E2 = mp.A0I(A0E).A0H(this.A01.A0D()).A0F(c2k.A04()).A0E(z ? EnumC0515Ld.REPORT_AD : EnumC0515Ld.HIDE_AD);
        if (z) {
            i = -552389;
        } else {
            i = -13272859;
        }
        MQ adHiddenView = A0E2.A0D(i).A0G(this.A0A != null ? this.A0A.A01() : "").A0M();
        LV.A0M(adHiddenView, -1);
        LV.A0T(this);
        this.A00.removeAllViews();
        this.A00.addView(adHiddenView, A0B(true));
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final void A0O(C2K c2k, C2I c2i) {
        String A0H;
        boolean z = c2i == C2I.A05;
        YA ya = this.A02;
        MT mt = this.A0B;
        if (z) {
            A0H = this.A01.A0L();
        } else {
            A0H = this.A01.A0H();
        }
        C0547Mj c0547Mj = new C0547Mj(ya, c2k, mt, A0H, z ? EnumC0515Ld.REPORT_AD : EnumC0515Ld.HIDE_AD);
        c0547Mj.setClickable(true);
        LV.A0M(c0547Mj, -1);
        int i = A03;
        c0547Mj.setPadding(i * 2, i, i * 2, i);
        A0C();
        this.A00.removeAllViews();
        this.A00.addView(c0547Mj, A0B(false));
    }

    @Override // com.facebook.ads.redexgen.X.MR
    public final boolean A0P() {
        return false;
    }
}
