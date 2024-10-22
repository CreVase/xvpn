package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.8B, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C8B extends SH {
    public AbstractC0585Nv A00;
    public final ImageView A01;
    public final C5H A02;
    public final AtomicBoolean A03;
    public final AtomicBoolean A04;
    public final AtomicBoolean A05;

    public C8B(YA ya, MM mm, InterfaceC0444If interfaceC0444If, AbstractC0924aS abstractC0924aS, C6Q c6q, InterfaceC0531Lt interfaceC0531Lt) {
        super(ya, mm, interfaceC0444If, abstractC0924aS, c6q, interfaceC0531Lt);
        this.A02 = new SC(this);
        this.A04 = new AtomicBoolean(false);
        this.A03 = new AtomicBoolean(false);
        this.A05 = new AtomicBoolean(false);
        ImageView imageView = new ImageView(getContext());
        this.A01 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new T8(imageView, super.A03).A05(super.A01.A0v().A0D().A00(), super.A01.A0v().A0D().A01()).A06(new SB(this)).A07(super.A01.A0v().A0D().A07());
    }

    private AbstractC0585Nv A01(int i) {
        if (this.A01.getParent() != null) {
            LV.A0J(this.A01);
        }
        return C0586Nw.A00(new C0588Ny(super.A03, super.A04, this.A08, super.A01, this.A01, this.A0A, this.A06).A0E(this.A07.getToolbarHeight()).A0H(this.A07).A0D(i).A0K(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A05() {
        if (this.A04.get() && this.A03.get()) {
            A0P();
        }
    }

    private void A06(int i) {
        LV.A0J(this.A00);
        AbstractC0585Nv A01 = A01(i);
        this.A00 = A01;
        C1M colors = A01.getColors();
        AbstractC0585Nv abstractC0585Nv = this.A00;
        LV.A0M(this, colors.A07(abstractC0585Nv != null && (abstractC0585Nv.A10() || (this.A00 instanceof AbstractC0718Sy))));
        this.A07.setFullscreen(this.A00.A10());
        this.A07.A06(colors, T3.A08(super.A01));
        addView(this.A00, 0, SH.A0E);
        AbstractC0585Nv abstractC0585Nv2 = this.A00;
        setUpFullscreenMode(abstractC0585Nv2 != null && abstractC0585Nv2.A10());
    }

    @Override // com.facebook.ads.redexgen.X.SH
    public final void A0Q() {
        LV.A0L(this.A00);
        LV.A0L(this.A07);
        this.A03.set(true);
        A05();
        int A03 = super.A01.A0v().A0D().A03();
        if (A03 > 0) {
            AbstractC0585Nv abstractC0585Nv = this.A00;
            if (abstractC0585Nv != null) {
                abstractC0585Nv.A0y();
            }
            A0R(A03, new SA(this));
            return;
        }
        this.A05.set(true);
        AbstractC0530Ls abstractC0530Ls = this.A07;
        int unskippableSeconds = getCloseButtonStyle();
        abstractC0530Ls.setToolbarActionMode(unskippableSeconds);
    }

    @Override // com.facebook.ads.redexgen.X.SH
    public final void A0S(C5J c5j) {
        c5j.A0N(this.A02);
        int orientation = c5j.A0J().getResources().getConfiguration().orientation;
        A06(orientation);
        addView(this.A07, new FrameLayout.LayoutParams(-1, this.A07.getToolbarHeight()));
        LV.A0H(this.A00);
        LV.A0H(this.A07);
    }

    @Override // com.facebook.ads.redexgen.X.SH
    public final boolean A0T() {
        AbstractC0585Nv abstractC0585Nv = this.A00;
        return abstractC0585Nv != null && abstractC0585Nv.A11(false);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACJ(boolean z) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACj(boolean z) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getCloseButtonStyle() {
        AbstractC0585Nv abstractC0585Nv = this.A00;
        if (abstractC0585Nv != null) {
            return abstractC0585Nv.getCloseButtonStyle();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.SH, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A01.A0v().A0N()) {
            A06(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SH, com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void onDestroy() {
        if (IP.A1X(super.A03)) {
            super.A03.A0A().AFz(this.A01);
        }
        AbstractC0585Nv abstractC0585Nv = this.A00;
        if (abstractC0585Nv != null) {
            abstractC0585Nv.A0u();
        }
        super.onDestroy();
    }
}
