package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.lang.ref.WeakReference;

/* loaded from: assets/audience_network.dex */
public abstract class SH extends FrameLayout implements InterfaceC0532Lu {
    public static String[] A0D = {"2Xyaln6pEv", "U0a3JqFqqkDVhXbmlhDLXicSxteMexx", "xzpI97Jg3aS17fwtqg1jZWsfReheMZxV", "0HUxaz9ggnFIA", "Uunhkc3", "kqN9", "fWeU9xYsODnan54TmlbSL1hNy6Lef7fu", "qbKhPFfRzVPGu"};
    public static final RelativeLayout.LayoutParams A0E = new RelativeLayout.LayoutParams(-1, -1);
    public boolean A00;
    public final AbstractC0924aS A01;
    public final C6Q A02;
    public final YA A03;
    public final InterfaceC0444If A04;
    public final C0452In A05;
    public final LN A06;
    public final AbstractC0530Ls A07;
    public final InterfaceC0531Lt A08;
    public final MM A09;
    public final C0643Qb A0A;
    public final LI A0B;
    public final AbstractC0642Qa A0C;

    public abstract void A0Q();

    public abstract void A0S(C5J c5j);

    public abstract boolean A0T();

    public SH(YA ya, MM mm, InterfaceC0444If interfaceC0444If, AbstractC0924aS abstractC0924aS, C6Q c6q, InterfaceC0531Lt interfaceC0531Lt) {
        super(ya);
        SL sl = new SL(this);
        this.A0C = sl;
        this.A06 = new LN();
        this.A00 = false;
        this.A03 = ya;
        this.A09 = mm;
        this.A04 = interfaceC0444If;
        this.A01 = abstractC0924aS;
        this.A02 = c6q;
        this.A08 = interfaceC0531Lt;
        this.A05 = new C0452In(abstractC0924aS.A11(), interfaceC0444If);
        C0643Qb c0643Qb = new C0643Qb(this, 1, new WeakReference(sl), ya);
        this.A0A = c0643Qb;
        c0643Qb.A0W(abstractC0924aS.A0C());
        c0643Qb.A0X(abstractC0924aS.A0D());
        this.A07 = A0N();
        LI li = new LI(this);
        this.A0B = li;
        li.A05(LH.A03);
    }

    private FullScreenAdToolbar A0N() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A03, this.A08, this.A05, 1, this.A01.A0p());
        fullScreenAdToolbar.setFullscreen(true);
        int A03 = this.A01.A0v().A0D().A03();
        fullScreenAdToolbar.setPageDetails(this.A01.A0z(), this.A01.A11(), A03, this.A01.A10());
        fullScreenAdToolbar.A06(this.A01.A0u().A01(), T3.A08(this.A01));
        if (A03 < 0) {
            C1D A0v = this.A01.A0v();
            int unskippableSeconds = A0D[4].length();
            if (unskippableSeconds == 31) {
                throw new RuntimeException();
            }
            A0D[5] = "3phQ";
            if (A0v.A0M()) {
                fullScreenAdToolbar.setToolbarActionMode(4);
            }
        }
        fullScreenAdToolbar.setToolbarListener(new SI(this));
        return fullScreenAdToolbar;
    }

    private void A0O() {
        if (this.A01.A0v().A0P()) {
            P3 A0B = new P1(this.A03, this.A01.A0v().A0E(), this.A01.A0z()).A08(this.A01.A0u().A01()).A0B();
            C0454Ip.A04(A0B, this.A05, EnumC0451Im.A0U);
            addView(A0B, A0E);
            A0B.A04(new SJ(this));
            return;
        }
        A0Q();
    }

    public final void A0P() {
        if (!this.A00) {
            this.A0A.A0U();
            this.A00 = true;
        }
    }

    public final void A0R(int i, K8 k8) {
        new C0501Kn(i, new SK(this, i, k8)).A08();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void A9C(Intent intent, Bundle bundle, C5J c5j) {
        this.A08.A3Q(this, A0E);
        A0S(c5j);
        A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void AEt(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public String getCurrentClientToken() {
        return this.A01.A11();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onDestroy() {
        this.A0B.A03();
        if (!TextUtils.isEmpty(this.A01.A11())) {
            this.A04.A9J(this.A01.A11(), new NL().A03(this.A0A).A02(this.A06).A05());
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A06.A06(this.A03, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0531Lt interfaceC0531Lt) {
    }

    public void setUpFullscreenMode(boolean z) {
        LH lh;
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        if (z) {
            lh = LH.A04;
        } else {
            lh = LH.A03;
        }
        this.A0B.A05(lh);
    }
}
