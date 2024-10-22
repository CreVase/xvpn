package com.facebook.ads.redexgen.X;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.ads.MediaViewVideoRenderer;
import com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi;
import com.facebook.ads.internal.api.MediaViewVideoRendererApi;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class UV extends C5O implements DefaultMediaViewVideoRendererApi {
    public static byte[] A0F;
    public static String[] A0G = {"mcYgxpLQMmIwsDd5yEmcOVEUvqtoI", "GHoJM0N9xHnxy27wJlEicj6316JJBG", "sAgmez8xlBVRjdgohc9cPNZKpCHjl", "UXd4O0RMEZeMz8rPKuZc9Jx8", "lkMSGOb1N9f2znZPpxO7v43dGPgWn", "ZJq7h5cFUWj9FCmvTSQNl6xA6rnC8", "yifDfgH7QVrqMR4w0vNHSMY9h4Ewh", "QZpfE8IVFABXRQwraZ"};
    public static final String A0H;
    public MediaViewVideoRenderer A00;
    public YA A01;
    public InterfaceC0462Ix A02;
    public AF A04;
    public C01666j A05;
    public ViewOnClickListenerC01616b A06;
    public AbstractC0642Qa A07;
    public C0643Qb A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC0621Pf A0C = new C0746Ub(this);
    public final AtomicBoolean A0D = new AtomicBoolean(false);
    public final AtomicBoolean A0E = new AtomicBoolean(false);
    public J9 A03 = J9.A03;

    public static String A06(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 127);
        }
        return new String(copyOfRange);
    }

    public static void A0E() {
        A0F = new byte[]{7, 32, 56, 47, 34, 39, 42, 110, 60, 43, 32, 42, 43, 60, 43, 60, 110, 45, 38, 39, 34, 42, 110, 45, 33, 32, 40, 39, 41, 96, 14, 38, 39, 42, 34, 21, 42, 38, 52, 21, 42, 39, 38, 44, 99, 42, 48, 99, 45, 54, 47, 47, 120, 99, 54, 45, 34, 33, 47, 38, 99, 55, 44, 99, 37, 42, 45, 39, 99, 42, 55, 109, 16, 43, 36, 39, 41, 32, 101, 49, 42, 101, 35, 44, 43, 33, 101, 8, 32, 33, 44, 36, 19, 44, 32, 50, 19, 44, 33, 32, 42, 101, 38, 45, 44, 41, 33, 107};
    }

    static {
        A0E();
        A0H = UV.class.getSimpleName();
    }

    private C0745Ua A00(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new C0745Ua(this, mediaViewVideoRendererApi);
    }

    private UZ A01(MediaViewVideoRendererApi mediaViewVideoRendererApi) {
        return new UZ(this, mediaViewVideoRendererApi);
    }

    private UX A02() {
        return new UX(this);
    }

    private C0643Qb A05() {
        return new C0643Qb(this.A00, 50, true, new WeakReference(this.A07), this.A01);
    }

    private void A09() {
        AF af = this.A04;
        if (af != null) {
            C0622Pg c0622Pg = (C0622Pg) af.getVideoView();
            if (A0G[3].length() != 24) {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[2] = "uL1T6UePNJ7Kw1irCYcqiA1GlgiEZ";
            strArr[0] = "2BZHbySyGqLzqR4K5b7TQMpiAd64K";
            c0622Pg.setViewImplInflationListener(this.A0C);
        }
    }

    private void A0A() {
        AF af = this.A04;
        if (af != null) {
            af.getVideoView().setOnTouchListener(new ViewOnTouchListenerC0461Iw(this));
        }
    }

    private void A0B() {
        AF af = this.A04;
        if (af != null) {
            C0622Pg c0622Pg = (C0622Pg) af.getVideoView();
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            A0G[7] = "MUEPyY1MJMWvhU3XHu";
            c0622Pg.setViewImplInflationListener(null);
        }
    }

    private void A0C() {
        if (this.A00.getVisibility() == 0 && this.A09) {
            MediaViewVideoRenderer mediaViewVideoRenderer = this.A00;
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[4] = "vtumVYeB8x7vkBeCNzRl37Vgwgf5m";
            strArr2[1] = "l5c2Nb35iHyego1JNAmcVzJY15xyfp";
            if (mediaViewVideoRenderer.hasWindowFocus()) {
                this.A08.A0U();
                return;
            }
        }
        AF af = this.A04;
        if (af != null && af.getState() == QY.A05) {
            this.A0B = true;
        }
        this.A08.A0V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0D() {
        this.A03 = J9.A03;
        A0B();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0I(UJ uj, InterfaceC0462Ix interfaceC0462Ix) {
        String str;
        this.A0A = false;
        this.A0B = false;
        this.A02 = interfaceC0462Ix;
        A09();
        C01666j c01666j = this.A05;
        if (uj != null) {
            J4 adCoverImage = uj.getAdCoverImage();
            String[] strArr = A0G;
            if (strArr[2].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            A0G[3] = "zpp3cHPhluFOPvL30kkcY8af";
            if (adCoverImage != null) {
                str = uj.getAdCoverImage().getUrl();
                c01666j.setImage(str, new UY(this));
                this.A03 = uj.A18();
                this.A06.setPlayAccessibilityLabel(uj.A1E());
                this.A06.setPauseAccessibilityLabel(uj.A1D());
                this.A08.A0U();
            }
        }
        str = null;
        c01666j.setImage(str, new UY(this));
        this.A03 = uj.A18();
        this.A06.setPlayAccessibilityLabel(uj.A1E());
        this.A06.setPauseAccessibilityLabel(uj.A1D());
        this.A08.A0U();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J(EnumC0625Pj enumC0625Pj) {
        AF af = this.A04;
        if (af != null) {
            af.A0b(enumC0625Pj, 24);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.e(A0H, A06(30, 42, 60));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0K() {
        AF af = this.A04;
        if (af == null || af.getState() == QY.A06) {
            return false;
        }
        return this.A03 == J9.A05 || this.A03 == J9.A03;
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void initialize(Context context, MediaViewVideoRenderer mediaViewVideoRenderer, MediaViewVideoRendererApi mediaViewVideoRendererApi, int i) {
        InterfaceC0464Iz A00;
        ((C5O) mediaViewVideoRendererApi.getAdComponentViewApi()).A00(this);
        switch (i) {
            case 0:
                A00 = A01(mediaViewVideoRendererApi);
                break;
            case 1:
                A00 = A00(mediaViewVideoRendererApi);
                break;
            default:
                throw new IllegalArgumentException(A06(0, 30, 49));
        }
        ((C5V) mediaViewVideoRendererApi).A06(A00);
        this.A01 = C5Q.A02(context);
        this.A00 = mediaViewVideoRenderer;
        this.A05 = new C01666j(this.A01);
        this.A07 = A02();
        this.A08 = A05();
        float density = C0506Ku.A02;
        int bigPadding = (int) (2.0f * density);
        int smallPadding = (int) (25.0f * density);
        this.A06 = new ViewOnClickListenerC01616b(this.A01);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(9);
        layoutParams.addRule(12);
        this.A06.setPadding(bigPadding, smallPadding, smallPadding, bigPadding);
        this.A06.setLayoutParams(layoutParams);
        int i2 = 0;
        while (true) {
            if (i2 < this.A00.getChildCount()) {
                View childAt = this.A00.getChildAt(0);
                if (childAt instanceof AF) {
                    AF af = (AF) childAt;
                    String[] strArr = A0G;
                    if (strArr[4].length() != strArr[1].length()) {
                        A0G[3] = "bzrDqpY4LpZuK9aeaZZijHYv";
                        this.A04 = af;
                    }
                } else {
                    i2++;
                }
            }
        }
        AF af2 = this.A04;
        String[] strArr2 = A0G;
        if (strArr2[2].length() == strArr2[0].length()) {
            String[] strArr3 = A0G;
            strArr3[6] = "2aK7TrzSKlLOXQMMYyslcv3rZKnIT";
            strArr3[5] = "rJ0uIs3irNdkufru0tgAA9z3l7YlJ";
            if (af2 == null) {
                if (AdInternalSettings.isDebugBuild()) {
                    Log.e(A0H, A06(72, 36, 58));
                }
            } else {
                af2.A0c(this.A05);
                AF af3 = this.A04;
                String[] strArr4 = A0G;
                if (strArr4[6].length() != strArr4[5].length()) {
                    throw new RuntimeException();
                }
                A0G[3] = "N5wNlZvELtjdUjcESL7VUEU7";
                af3.A0c(this.A06);
            }
            this.A08.A0W(0);
            this.A08.A0X(250);
            A00.AFI();
            return;
        }
        throw new RuntimeException();
    }

    @Override // com.facebook.ads.redexgen.X.C5O, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A09 = true;
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5O, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A09 = false;
        A0C();
    }

    @Override // com.facebook.ads.internal.api.DefaultMediaViewVideoRendererApi
    public final void onPrepared() {
        this.A00.setOnTouchListener(new ViewOnTouchListenerC0460Iv(this));
        A0A();
    }

    @Override // com.facebook.ads.redexgen.X.C5O, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        A0C();
    }

    @Override // com.facebook.ads.redexgen.X.C5O, com.facebook.ads.internal.api.AdComponentView
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        A0C();
    }
}
