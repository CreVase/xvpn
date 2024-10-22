package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Td, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0723Td extends RelativeLayout implements InterfaceC0532Lu {
    public static byte[] A0F;
    public static String[] A0G = {"fqT9snXDZkE2N6bIU2twhbCcrvrF5wQR", "W8MK3buqarkLhDixdfnbfGeXuw3i87xB", "M5iWaw3OwwKxChS5bTa9KUrj63pwu1Od", "QKu8TlGQ3D7NsDDaY", "OUnrWL6BanKvWJF", "644mHU9zQQHAcSiNB", "MqQzuM0GD0HqxOL2854PPJvoiao7nama", "mSpdOD621tCilusEUOf234Jx9LR3KzyX"};
    public View A00;
    public C0501Kn A01;
    public P3 A02;
    public boolean A03;
    public boolean A04;
    public AnonymousClass19 A05;
    public PU A06;
    public boolean A07;
    public final LI A08;
    public final InterfaceC0531Lt A09;
    public final AbstractC0924aS A0A;
    public final YA A0B;
    public final InterfaceC0444If A0C;
    public final C0452In A0D;
    public final AbstractC0530Ls A0E;

    public static String A0N(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 81);
        }
        return new String(copyOfRange);
    }

    public static void A0Q() {
        A0F = new byte[]{88, 84, 86, 21, 93, 90, 88, 94, 89, 84, 84, 80, 21, 90, 95, 72, 21, 82, 85, 79, 94, 73, 72, 79, 82, 79, 82, 90, 87, 21, 82, 86, 75, 73, 94, 72, 72, 82, 84, 85, 21, 87, 84, 92, 92, 94, 95};
    }

    public abstract boolean A0c();

    public abstract int getCloseButtonStyle();

    static {
        A0Q();
    }

    public AbstractC0723Td(YA ya, InterfaceC0444If interfaceC0444If, InterfaceC0531Lt interfaceC0531Lt, AbstractC0924aS abstractC0924aS) {
        super(ya);
        this.A07 = false;
        this.A04 = false;
        this.A03 = false;
        this.A0B = ya;
        this.A0C = interfaceC0444If;
        this.A09 = interfaceC0531Lt;
        this.A08 = new LI(this);
        this.A0A = abstractC0924aS;
        C0452In c0452In = new C0452In(abstractC0924aS.A11(), interfaceC0444If);
        this.A0D = c0452In;
        this.A0E = new FullScreenAdToolbar(ya, getAudienceNetworkListener(), c0452In, 0, abstractC0924aS.A0p());
    }

    private C1M A0L(int i) {
        if (i == 1) {
            return this.A05.A01();
        }
        AnonymousClass19 anonymousClass19 = this.A05;
        if (A0G[2].charAt(7) != 'O') {
            throw new RuntimeException();
        }
        A0G[0] = "MYlveE6g4wScBr3MsnlZwbj0w3RA4Q0m";
        return anonymousClass19.A00();
    }

    private void A0O() {
        removeAllViews();
        LV.A0J(this);
    }

    private void A0P() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        if (A0Z() && this.A02 == null) {
            this.A04 = true;
            P3 A0B = new P1(this.A0B, this.A0A.A0v().A0E(), this.A0A.A0z()).A08(this.A0A.A0u().A01()).A0B();
            this.A02 = A0B;
            C0454Ip.A04(A0B, this.A0D, EnumC0451Im.A0U);
            this.A09.A3P(this, 0, layoutParams);
            this.A09.A3P(this.A02, 1, layoutParams);
            this.A02.A04(new C0725Tf(this));
            return;
        }
        this.A09.A3P(this, 0, layoutParams);
    }

    private void A0R(C1M c1m, boolean z) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, this.A0E.getToolbarHeight());
        layoutParams.addRule(10);
        this.A0E.A06(c1m, T3.A08(this.A0A));
        addView(this.A0E, layoutParams);
    }

    public final void A0U() {
        View view = this.A00;
        if (view == null || !(view instanceof AbstractC0585Nv)) {
            return;
        }
        if (A0a()) {
            ((AbstractC0585Nv) this.A00).A0y();
        } else {
            ((AbstractC0585Nv) this.A00).A0x();
        }
    }

    public final void A0V(int i) {
        this.A01 = new C0501Kn(i, new C0724Te(this, i));
        this.A03 = true;
        A0U();
        this.A01.A08();
    }

    public final void A0W(View view, boolean z, int i) {
        this.A0E.setFullscreen(z);
        this.A00 = view;
        this.A08.A05(LH.A03);
        A0O();
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(0, z ? 0 : this.A0E.getToolbarHeight(), 0, 0);
        layoutParams.addRule(12);
        addView(view, layoutParams);
        C1M A0L = A0L(i);
        A0R(A0L, z);
        LV.A0M(this, A0L.A07(false));
        if (this.A09 != null) {
            A0P();
            String[] strArr = A0G;
            if (strArr[3].length() != strArr[5].length()) {
                throw new RuntimeException();
            }
            A0G[0] = "NsWlVTe7e8AxmZfep9MsD1WsEVvEb3lR";
            if (z && Build.VERSION.SDK_INT >= 19) {
                LI li = this.A08;
                if (A0G[0].charAt(10) == 'o') {
                    throw new RuntimeException();
                }
                A0G[2] = "LlUUcmlOaTawHlOzciUSj9DhXPbTXBAe";
                li.A05(LH.A04);
            }
        }
    }

    public final void A0X(C5J c5j) {
        this.A08.A04(c5j.A0J().getWindow());
        this.A05 = this.A0A.A0u();
        C1D c1d = null;
        C1D adInfo = this.A0A.A0v();
        if (adInfo != null) {
            C1D adInfo2 = this.A0A.A0v();
            if (adInfo2 != null) {
                c1d = this.A0A.A0v();
            }
        }
        this.A0E.setPageDetails(this.A0A.A0z(), this.A0A.A11(), c1d != null ? c1d.A0D().A03() : 0, this.A0A.A10());
        this.A0E.setToolbarListener(new C0727Th(this, c5j));
    }

    public final void A0Y(C5J c5j) {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(200L);
        alphaAnimation.setAnimationListener(new M1(this, this, c5j));
        startAnimation(alphaAnimation);
    }

    public final boolean A0Z() {
        if (!this.A0A.A13().isEmpty()) {
            boolean A0P = this.A0A.A0v().A0P();
            if (A0G[6].charAt(3) != 'z') {
                throw new RuntimeException();
            }
            A0G[2] = "rwsNokIOLx9Fj0KMvDMbhHWjcozH5rOe";
            if (A0P) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0a() {
        return this.A03;
    }

    public final boolean A0b() {
        return this.A04;
    }

    public void ACJ(boolean z) {
        C0501Kn c0501Kn = this.A01;
        if (c0501Kn != null && c0501Kn.A06()) {
            this.A01.A07();
        }
    }

    public void ACj(boolean z) {
        C0501Kn c0501Kn = this.A01;
        if (c0501Kn != null && !c0501Kn.A05()) {
            this.A01.A08();
        }
    }

    public InterfaceC0444If getAdEventManager() {
        return this.A0C;
    }

    public InterfaceC0531Lt getAudienceNetworkListener() {
        return this.A09;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public String getCurrentClientToken() {
        return this.A0A.A11();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    public void onDestroy() {
        this.A08.A03();
        this.A0E.setToolbarListener(null);
        A0O();
    }

    public void setImpressionRecordingFlag(LN ln) {
        ln.A05();
        if (getAudienceNetworkListener() != null) {
            if (this.A07) {
                getAudienceNetworkListener().A3z(new TQ().A74());
            } else {
                getAudienceNetworkListener().A3z(A0N(0, 47, 106));
            }
        }
    }

    public void setListener(InterfaceC0531Lt interfaceC0531Lt) {
    }

    public void setServerSideRewardHandler(PU pu) {
        this.A06 = pu;
    }
}
