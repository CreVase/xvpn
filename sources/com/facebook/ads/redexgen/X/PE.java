package com.facebook.ads.redexgen.X;

import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.util.Map;

/* loaded from: assets/audience_network.dex */
public final class PE extends FrameLayout {
    public static final int A08 = (int) (C0506Ku.A02 * 16.0f);
    public AE A00;
    public C0616Pa A01;
    public AnonymousClass76 A02;
    public C0480Jr A03;
    public C01666j A04;
    public C6E A05;
    public final YA A06;
    public final C0452In A07;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 10
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:135)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    public final void A04(InterfaceC0444If interfaceC0444If, String str, Map<String, String> map) {
        A02();
        this.A02 = new AnonymousClass76(this.A06, interfaceC0444If, this.A00, str, map);
        if (IP.A1Y(this.A06)) {
            this.A01 = new C0616Pa(this.A06, interfaceC0444If, this.A00, str, map);
        } else {
            this.A01 = null;
        }
    }

    public PE(YA ya, C0452In c0452In) {
        super(ya);
        this.A07 = c0452In;
        this.A06 = ya;
        setUpView(ya);
    }

    public final void A01() {
        this.A00.A0e(true, 10);
    }

    public final void A02() {
        C0616Pa c0616Pa = this.A01;
        if (c0616Pa != null) {
            c0616Pa.A0A();
            this.A01 = null;
        }
        AnonymousClass76 anonymousClass76 = this.A02;
        if (anonymousClass76 != null) {
            anonymousClass76.A0g();
            this.A02 = null;
        }
    }

    public final void A03(AbstractC02028a abstractC02028a) {
        this.A00.getEventBus().A05(abstractC02028a);
    }

    public final void A05(EnumC0625Pj enumC0625Pj) {
        this.A00.A0b(enumC0625Pj, 13);
    }

    public final boolean A06() {
        return this.A00.A0k();
    }

    public RX getSimpleVideoView() {
        return this.A00;
    }

    public float getVolume() {
        return this.A00.getVolume();
    }

    public void setPlaceholderUrl(String str) {
        this.A04.setImage(str);
    }

    private void setUpPlugins(YA ya) {
        this.A00.A0X();
        C01666j c01666j = new C01666j(ya);
        this.A04 = c01666j;
        this.A00.A0c(c01666j);
        this.A03 = new C0480Jr(ya, this.A07);
        this.A00.A0c(new C01726r(ya));
        this.A00.A0c(this.A03);
        C6E c6e = new C6E(ya, true, this.A07);
        this.A05 = c6e;
        this.A00.A0c(c6e);
        this.A00.A0c(new C0482Ju(this.A05, EnumC0638Pw.A03, true, true));
        if (!this.A00.A0g() && !IP.A2H(ya)) {
            return;
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(11);
        int i = A08;
        layoutParams.setMargins(i, i, i, i);
        this.A03.setLayoutParams(layoutParams);
        this.A00.addView(this.A03);
    }

    private void setUpVideo(YA ya) {
        AE ae = new AE(ya);
        this.A00 = ae;
        ae.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        LV.A0K(this.A00);
        addView(this.A00);
        setOnClickListener(new PD(this));
    }

    private void setUpView(YA ya) {
        setUpVideo(ya);
        setUpPlugins(ya);
    }

    public void setVideoURI(String str) {
        this.A00.setVideoURI(str);
    }

    public void setVolume(float f) {
        this.A00.setVolume(f);
        this.A03.A09();
    }
}
