package com.facebook.ads.redexgen.X;

import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class SQ extends AbstractC0612Ow {
    public static String[] A07 = {"itiy11Wl5lP7QtpB3", "v6A5WW2CB", "SYp5FzxPKMl", "MKN0lN1Uug", "IQIXhYysWoH9a5YMZx5hFMUL6lEdxT5q", "FECz3BMfLn4pJfwLFVrIm2wrzlNMsWJ3", "RmVgcuWcoU56A5AXkQhrmgSRFj76ryom", "F5uv5dts8QHAu8Ovw"};
    public static final RelativeLayout.LayoutParams A08 = new RelativeLayout.LayoutParams(-1, -1);
    public C0501Kn A00;
    public AbstractC0585Nv A01;
    public final int A02;
    public final ImageView A03;
    public final AbstractC0530Ls A04;
    public final P0 A05;
    public final AtomicBoolean A06;

    public SQ(YA ya, MM mm, int i, InterfaceC0444If interfaceC0444If, AbstractC0924aS abstractC0924aS, InterfaceC0531Lt interfaceC0531Lt, FullScreenAdToolbar fullScreenAdToolbar, boolean z, boolean z2, P0 p0, int i2) {
        super(ya, mm, interfaceC0444If, abstractC0924aS, i, z, z2, interfaceC0531Lt);
        this.A06 = new AtomicBoolean(false);
        this.A02 = i2;
        this.A05 = p0;
        ImageView imageView = new ImageView(getContext());
        this.A03 = imageView;
        this.A04 = fullScreenAdToolbar;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setAdjustViewBounds(true);
        new T8(imageView, ya).A05(abstractC0924aS.A0v().A0D().A00(), abstractC0924aS.A0v().A0D().A01()).A06(new SS(this)).A07(abstractC0924aS.A0v().A0D().A07());
        A08(ya.getResources().getConfiguration().orientation);
    }

    private AbstractC0585Nv A04(int i) {
        if (this.A03.getParent() != null) {
            ImageView imageView = this.A03;
            if (A07[4].charAt(16) != 'Z') {
                throw new RuntimeException();
            }
            String[] strArr = A07;
            strArr[3] = "PnJcnL34IR";
            strArr[1] = "4gIzhBkuZ";
            LV.A0J(imageView);
        }
        if (A07[4].charAt(16) != 'Z') {
            throw new RuntimeException();
        }
        A07[4] = "hUws06ULbo6w3OlBZNW9WYMgHjAED42u";
        return C0586Nw.A00(new C0588Ny(super.A06, this.A07, this.A09, super.A05, this.A03, this.A0B, this.A08).A0E(this.A04.getToolbarHeight()).A0H(this.A04).A0D(i).A0J(i != 2).A0K(), null, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A07() {
        if (this.A06.get()) {
            A03();
        }
    }

    private void A08(int i) {
        LV.A0J(this.A01);
        AbstractC0585Nv A04 = A04(i);
        this.A01 = A04;
        addView(A04, 0, A08);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0612Ow
    public final void A0K() {
        if (IP.A1X(super.A06)) {
            super.A06.A0A().AFz(this.A03);
        }
        AbstractC0585Nv abstractC0585Nv = this.A01;
        if (abstractC0585Nv != null) {
            abstractC0585Nv.A0u();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0612Ow
    public final void A0L() {
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0612Ow
    public final void A0M() {
        int i = this.A02;
        if (i > 0) {
            C0501Kn c0501Kn = new C0501Kn(i, 100.0f, 100L, new Handler(Looper.getMainLooper()), new SR(this));
            this.A00 = c0501Kn;
            c0501Kn.A08();
            return;
        }
        this.A05.ACw(false);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0612Ow
    public final void A0N(boolean z) {
        C0501Kn c0501Kn = this.A00;
        if (c0501Kn != null && c0501Kn.A06()) {
            this.A00.A07();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0612Ow
    public final void A0O(boolean z) {
        C0501Kn c0501Kn = this.A00;
        if (c0501Kn != null && !c0501Kn.A05()) {
            this.A00.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0612Ow
    public final boolean A0P() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0612Ow
    public final boolean A0Q() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0612Ow
    public C0615Oz getFullScreenAdStyle() {
        C1M colors = this.A01.getColors();
        return new C0615Oz(this.A01.A10(), C0615Oz.A07, colors, T3.A08(super.A05), colors.A07(this.A01.A10() || (this.A01 instanceof AbstractC0718Sy)), null);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0612Ow, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!super.A05.A0v().A0N()) {
            A08(configuration.orientation);
        }
    }
}
