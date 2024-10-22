package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: assets/audience_network.dex */
public final class TU extends RelativeLayout implements InterfaceC0532Lu {
    public static byte[] A0Z;
    public static String[] A0a = {"57rzzR6raHrat8cHk0n2c9utIvWN6OL8", "vZo4DQACnHxpUIABCEPhLIrXR", "3pKkUgRnbq5D8", "3oPHUcYdGBLGT6sjvwgTS6nCZs8dHXKK", "yMOWmEDq6oq3Yf8aoY", "BRjJ0geTmUVj6Aeo1VqVThKYcHpwhF7A", "bCnfD5Zsza6fNT9UI62TNCVdI9Gt63Qd", "0XbQU4AacrxlEwxF12eBigHvJ8"};
    public static final int A0b;
    public static final int A0c;
    public static final int A0d;
    public static final int A0e;
    public static final int A0f;
    public static final int A0g;
    public static final int A0h;
    public static final int A0i;
    public static final int A0j;
    public static final RelativeLayout.LayoutParams A0k;
    public View A00;
    public RelativeLayout A01;
    public RelativeLayout A02;
    public Toast A03;
    public C5J A04;
    public C0501Kn A05;
    public T3 A06;
    public PN A07;
    public PU A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final AbstractC0924aS A0G;
    public final C1Z A0H;
    public final C5H A0I;
    public final YA A0J;
    public final InterfaceC0444If A0K;
    public final C0452In A0L;
    public final C0501Kn A0M;
    public final LI A0N;
    public final InterfaceC0531Lt A0O;
    public final MM A0P;
    public final InterfaceC0569Nf A0Q;
    public final C0570Ng A0R;
    public final PS A0S;
    public final AtomicBoolean A0T;
    public final AtomicBoolean A0U;
    public final boolean A0V;
    public final boolean A0W;
    public final boolean A0X;
    public final AbstractC0530Ls A0Y;

    public static String A0E(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0Z, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 40);
        }
        return new String(copyOfRange);
    }

    public static void A0P() {
        A0Z = new byte[]{-110, -97, -94, -70, -84, -86, -70, -92, 4, 13, 10, 4, 12, 0, 16, 19, 10, 8, 10, 15, -77, -68, -71, -77, -69, -81, -61, -65, -59, -62, -77, -75, -11, -6, 0, -15, -2, -1, 0, -11, 0, -11, -19, -8, -55, -68, -49, -60, -47, -64, -70, -66, -57, -60, -66, -58, -43, -47, -58, -56, -54, -46, -54, -45, -39, -65, -78, -60, -82, -65, -79, -78, -79, -84, -61, -74, -79, -78, -68, -80, -98, -101, -81, -94, -98, -80, -104, -100, -91, -94, -100, -92};
    }

    static {
        A0P();
        A0i = (int) (C0506Ku.A02 * 64.0f);
        A0d = (int) (C0506Ku.A02 * 16.0f);
        A0j = (int) (C0506Ku.A02 * 12.0f);
        A0b = (int) (C0506Ku.A02 * 10.0f);
        A0k = new RelativeLayout.LayoutParams(-1, -1);
        A0e = (int) (C0506Ku.A02 * 48.0f);
        A0f = (int) (C0506Ku.A02 * 16.0f);
        A0h = (int) (C0506Ku.A02 * 14.0f);
        A0g = C00632d.A01(-1, 77);
        A0c = (int) (C0506Ku.A02 * 8.0f);
    }

    public TU(YA ya, InterfaceC0444If interfaceC0444If, InterfaceC0531Lt interfaceC0531Lt, AbstractC0924aS abstractC0924aS, String str, MM mm) {
        super(ya);
        int A07;
        this.A0I = new C0722Tc(this);
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        this.A0U = atomicBoolean;
        this.A0T = new AtomicBoolean(false);
        this.A0D = false;
        this.A0F = true;
        this.A0B = false;
        this.A09 = false;
        this.A0J = ya;
        this.A0O = interfaceC0531Lt;
        this.A0K = interfaceC0444If;
        this.A0G = abstractC0924aS;
        C1Z A06 = abstractC0924aS.A0v().A0D().A06();
        this.A0H = A06;
        this.A0L = new C0452In(abstractC0924aS.A11(), interfaceC0444If);
        this.A0P = mm;
        this.A08 = new PU(ya, mm, str, interfaceC0531Lt);
        this.A0C = abstractC0924aS.A0v().A0M() && abstractC0924aS.A0v().A0D().A02() > 0;
        boolean A0A = abstractC0924aS.A0v().A0D().A0A();
        this.A0X = A0A;
        if (A06 == null) {
            interfaceC0531Lt.A3z(mm.A6r());
            interfaceC0531Lt.A3z(mm.A6n());
        }
        if (this.A0C && A0A) {
            A07 = abstractC0924aS.A0v().A0D().A02();
        } else {
            A07 = A06.A07();
        }
        atomicBoolean.set(!A06.A0I());
        C0722Tc c0722Tc = null;
        this.A0M = new C0501Kn(A07, new TW(this, c0722Tc));
        boolean A2J = IP.A2J(ya);
        this.A0W = A2J;
        this.A0V = IP.A0l(ya);
        FullScreenAdToolbar A072 = A07();
        this.A0Y = A072;
        this.A0S = new PS(ya, interfaceC0444If, abstractC0924aS);
        if (!A2J) {
            LV.A0M(this, -14473425);
        } else {
            C0579Np.A00(ya, this, abstractC0924aS.A0v().A0D().A07());
        }
        LI li = new LI(this);
        this.A0N = li;
        li.A05(LH.A03);
        if (IP.A1m(ya)) {
            A072.setProgressSpinnerInvisible(true);
        }
        HashMap hashMap = new HashMap();
        hashMap.put(A0E(56, 9, 61), mm.A7X());
        this.A07 = new PN(ya, abstractC0924aS, A06, interfaceC0444If, new TV(this, c0722Tc), hashMap);
        A0L();
        interfaceC0531Lt.A3Q(this, new RelativeLayout.LayoutParams(-1, -1));
        A0I();
        C0721Tb c0721Tb = new C0721Tb(this);
        this.A0Q = c0721Tb;
        this.A0R = new C0570Ng(ya, A072, abstractC0924aS, (RX) null, interfaceC0531Lt, c0721Tb, this.A06, this.A01, this.A07);
    }

    private FullScreenAdToolbar A07() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0J, this.A0O, this.A0L, 0, this.A0G.A0p());
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.A06(this.A0G.A0u().A01(), T3.A08(this.A0G));
        fullScreenAdToolbar.setPageDetailsVisible(false);
        fullScreenAdToolbar.setPageDetails(this.A0G.A0z(), this.A0G.A11(), this.A0H.A07(), this.A0G.A10());
        fullScreenAdToolbar.setToolbarListener(new TY(this));
        return fullScreenAdToolbar;
    }

    private T3 A09() {
        PN pn = this.A07;
        if (pn == null || pn.getViewabilityChecker() == null || this.A07.getTouchDataRecorder() == null) {
            return null;
        }
        T3 button = new T3(this.A0J, this.A0P.A6M(), this.A0G.A0u().A01(), this.A0K, this.A0O, this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0G.A0x());
        LV.A0K(button);
        button.setText(this.A0G.A0v().A0F().A04());
        button.setTextSize(14.0f);
        button.setIncludeFontPadding(false);
        int i = A0b;
        button.setPadding(i, i, i, i);
        if (!this.A0W) {
            LV.A0N(button, 8);
        }
        button.setOnClickListener(new M5(this));
        return button;
    }

    private C0578No A0C() {
        C0578No c0578No = new C0578No(this.A0J, this.A0G.A0u().A01(), true, 16, 14, 0);
        c0578No.A03(this.A0G.A0v().A0E().A06(), this.A0G.A0v().A0E().A05(), null, false, true);
        TextView descriptionTv = c0578No.getDescriptionTextView();
        descriptionTv.setAlpha(0.8f);
        descriptionTv.setMaxLines(1);
        descriptionTv.setEllipsize(TextUtils.TruncateAt.END);
        TextView descriptionTv2 = c0578No.getTitleTextView();
        descriptionTv2.setMaxLines(1);
        descriptionTv2.setEllipsize(TextUtils.TruncateAt.END);
        return c0578No;
    }

    private void A0H() {
        int i = A0e;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i);
        layoutParams.addRule(15);
        layoutParams.addRule(9);
        C0572Ni c0572Ni = new C0572Ni(this.A0J);
        LV.A0M(c0572Ni, 0);
        LV.A0K(c0572Ni);
        new T8(c0572Ni, this.A0J).A05(i, i).A07(this.A0G.A0z().A01());
        TextView textView = new TextView(this.A0J);
        LV.A0K(textView);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        textView.setTextColor(this.A0G.A0u().A01().A06(true));
        textView.setText(this.A0G.A0v().A0E().A06());
        textView.setTextSize(16.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        C0574Nk c0574Nk = new C0574Nk(this.A0J, A0h, 5, A0g, -1);
        c0574Nk.setGravity(16);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -1);
        TextView textView2 = new TextView(this.A0J);
        textView2.setTextColor(this.A0G.A0u().A01().A06(true));
        textView2.setGravity(16);
        textView2.setIncludeFontPadding(false);
        LinearLayout.LayoutParams starRatingContainerParams = new LinearLayout.LayoutParams(-2, -1);
        int i2 = A0c;
        starRatingContainerParams.leftMargin = i2;
        LinearLayout linearLayout = new LinearLayout(this.A0J);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, A0f);
        layoutParams3.topMargin = i2 / 2;
        layoutParams3.addRule(3, textView.getId());
        linearLayout.addView(c0574Nk, layoutParams2);
        linearLayout.addView(textView2, starRatingContainerParams);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.leftMargin = i2;
        layoutParams4.addRule(1, c0572Ni.getId());
        layoutParams4.addRule(15);
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.addView(linearLayout, layoutParams3);
        relativeLayout.addView(textView);
        RelativeLayout relativeLayout2 = this.A02;
        if (relativeLayout2 != null) {
            relativeLayout2.removeAllViews();
            RelativeLayout relativeLayout3 = this.A02;
            if (A0a[4].length() != 18) {
                throw new RuntimeException();
            }
            A0a[4] = "bsFsSO04IJ4eZVQxRT";
            relativeLayout3.addView(relativeLayout, layoutParams4);
            this.A02.addView(c0572Ni, layoutParams);
        }
        if (TextUtils.isEmpty(this.A0G.A0v().A0E().A03())) {
            linearLayout.setVisibility(8);
            return;
        }
        linearLayout.setVisibility(0);
        c0574Nk.setRating(Float.parseFloat(this.A0G.A0v().A0E().A03()));
        if (this.A0G.A0v().A0E().A02() == null) {
            return;
        }
        textView2.setText(A0E(0, 1, 66) + NumberFormat.getNumberInstance().format(Integer.parseInt(this.A0G.A0v().A0E().A02())) + A0E(1, 1, 78));
    }

    private void A0I() {
        if (this.A0H.A0I()) {
            A0K();
        } else {
            A0N();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.A0N.A05(LH.A04);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0J() {
        this.A0E = true;
        if (this.A0G.A0v().A0M()) {
            this.A08.A05();
            this.A0O.A40(this.A0P.A5o(), new AnonymousClass75(0, 0));
            if (this.A0A) {
                boolean z = this.A0W;
                if (A0a[4].length() != 18) {
                    throw new RuntimeException();
                }
                String[] strArr = A0a;
                strArr[1] = "I0JtICznoezMzS0InHXj65Cim";
                strArr[2] = "YxqOCBuXvZfwM";
                if (!z) {
                    NW.A03(this.A0J, this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0K, this.A0G.A0v().A0F(), this.A0G.A11(), this.A0G.A0x());
                }
            }
        }
    }

    private void A0K() {
        P3 A0B = new P1(this.A0J, this.A0G.A0v().A0E(), this.A0G.A0z()).A08(this.A0G.A0u().A01()).A0A(this.A0H.A0G()).A09(this.A0H.A0D()).A07(2000).A0B();
        C0454Ip.A04(A0B, this.A0L, EnumC0451Im.A0U);
        addView(A0B, A0k);
        A0B.A04(new C0720Ta(this));
    }

    private void A0L() {
        this.A06 = A09();
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        this.A01 = relativeLayout;
        LV.A0K(relativeLayout);
        RelativeLayout.LayoutParams iconAndMetaDataContainerParams = new RelativeLayout.LayoutParams(-2, -2);
        int i = A0d;
        int i2 = A0j;
        iconAndMetaDataContainerParams.setMargins(i, i2, i, i2);
        iconAndMetaDataContainerParams.addRule(12);
        RelativeLayout relativeLayout2 = new RelativeLayout(getContext());
        this.A02 = relativeLayout2;
        LV.A0K(relativeLayout2);
        if (this.A0V) {
            A0H();
        } else {
            RelativeLayout relativeLayout3 = this.A02;
            C0578No A0C = A0C();
            RelativeLayout.LayoutParams appMetadataLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
            relativeLayout3.addView(A0C, appMetadataLayoutParams);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, i, 0);
        this.A01.addView(this.A02, layoutParams);
        T3 t3 = this.A06;
        if (t3 != null) {
            layoutParams.addRule(0, t3.getId());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams2.addRule(11);
            layoutParams2.addRule(6, this.A02.getId());
            layoutParams2.addRule(8, this.A02.getId());
            this.A01.addView(this.A06, layoutParams2);
        }
        LV.A0K(this.A0Y);
        RelativeLayout.LayoutParams adWebViewParams = new RelativeLayout.LayoutParams(-1, -2);
        adWebViewParams.addRule(10);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams3.setMargins(i, 0, i, 0);
        layoutParams3.addRule(3, this.A0Y.getId());
        layoutParams3.addRule(2, this.A01.getId());
        this.A0Y.setVisibility(4);
        this.A07.setVisibility(4);
        this.A01.setVisibility(4);
        addView(this.A0Y, adWebViewParams);
        addView(this.A07, layoutParams3);
        addView(this.A01, iconAndMetaDataContainerParams);
        if (this.A0H.A0J()) {
            this.A07.A0B();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0M() {
        new C0452In(this.A0G.A11(), this.A0K).A04(EnumC0451Im.A0r, null);
        this.A0T.set(true);
        LV.A0T(this);
        LV.A0H(this.A07);
        LV.A0Z(this.A0R, this.A00, this.A07);
        LV.A0L(this.A0Y);
        LV.A0L(this.A06);
        Pair<PR, View> A03 = this.A0S.A03(this.A06);
        this.A00 = (View) A03.second;
        switch (M6.A00[((PR) A03.first).ordinal()]) {
            case 1:
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.setMargins(0, this.A0Y.getToolbarHeight(), 0, 0);
                LV.A0L(this.A01);
                RelativeLayout relativeLayout = this.A01;
                if (relativeLayout != null) {
                    int id = relativeLayout.getId();
                    if (A0a[5].charAt(2) == 'm') {
                        throw new RuntimeException();
                    }
                    A0a[0] = "6k4i0rLafWNu6HrnPvo1bAEbeaagXJGg";
                    layoutParams.addRule(2, id);
                }
                addView(this.A00, layoutParams);
                return;
            case 2:
                RelativeLayout relativeLayout2 = this.A01;
                if (relativeLayout2 != null) {
                    LV.A0Z(relativeLayout2);
                }
                addView(this.A00, new RelativeLayout.LayoutParams(-1, -1));
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0N() {
        LV.A0T(this);
        if (!this.A0H.A0J()) {
            PN pn = this.A07;
            if (A0a[4].length() != 18) {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[1] = "xj34PAIXy0BC0JvFurkBkOtWc";
            strArr[2] = "hWQrQPNffHRqy";
            pn.A0B();
        }
        this.A0Y.setVisibility(0);
        this.A07.setVisibility(0);
        RelativeLayout relativeLayout = this.A01;
        if (relativeLayout != null) {
            relativeLayout.setVisibility(0);
        }
        if (this.A06 != null && this.A0G.A0s() > 0 && this.A05 == null) {
            C0501Kn c0501Kn = new C0501Kn(this.A0G.A0s(), new TZ(this));
            this.A05 = c0501Kn;
            c0501Kn.A08();
        }
        this.A0M.A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0O() {
        Toast toast = this.A03;
        if (toast != null && toast.getView().getWindowVisibility() == 0) {
            return;
        }
        this.A03 = Toast.makeText(getContext(), this.A0H.A0C(), 1);
        A0Q((int) this.A0M.A04());
        this.A03.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(int i) {
        String valueOf = String.valueOf(i);
        Toast toast = this.A03;
        String A0C = this.A0H.A0C();
        String progress = A0E(2, 6, 31);
        LV.A0Y(toast, A0C.replace(progress, valueOf), 49, 0, A0i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0X(boolean z, String str) {
        this.A0B = true;
        HashMap hashMap = new HashMap();
        hashMap.put(A0E(8, 12, 121), z ? A0E(79, 13, 17) : A0E(44, 12, 51));
        hashMap.put(A0E(20, 12, 40), str);
        NW nw = new NW(this.A0J, this.A0P.A6M(), this.A07.getViewabilityChecker(), this.A07.getTouchDataRecorder(), this.A0K, this.A0G.A0x(), this.A0O);
        if (!this.A0W) {
            boolean z2 = !this.A0M.A05();
            nw.A0A(!z2);
            nw.A08(this.A0G.A11(), this.A0G.A0v().A0F().A05(), hashMap);
            if (z2) {
                new Handler(Looper.getMainLooper()).post(new TX(this));
            }
            this.A0A = true;
            return;
        }
        nw.A08(this.A0G.A11(), this.A0G.A0v().A0F().A05(), hashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Y() {
        if (!this.A0G.A0O().equals(A0E(65, 14, 37))) {
            if (this.A0G.A0O().equals(A0E(32, 12, 100))) {
                AbstractC0924aS abstractC0924aS = this.A0G;
                if (A0a[4].length() != 18) {
                    throw new RuntimeException();
                }
                A0a[0] = "r5y7OBqhAYVA47bIfl4AlIWKO2XfiX80";
                if (abstractC0924aS.A0v().A0O()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0Z() {
        return this.A0X && !this.A0D && !this.A0F && this.A0H.A07() < this.A0G.A0v().A0D().A02();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void A9C(Intent intent, Bundle bundle, C5J c5j) {
        this.A04 = c5j;
        c5j.A0N(this.A0I);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACJ(boolean z) {
        this.A0M.A07();
        this.A09 = true;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACj(boolean z) {
        if (this.A0X && this.A0F) {
            return;
        }
        boolean z2 = this.A0D;
        if (A0a[5].charAt(2) == 'm') {
            throw new RuntimeException();
        }
        A0a[0] = "UQp6GtSKm4mkcrS1rXAjxFqYQJcA6U4M";
        if (!z2 && this.A0U.get() && !this.A0M.A06()) {
            this.A0M.A08();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void AEt(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public String getCurrentClientToken() {
        return this.A0G.A11();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void onDestroy() {
        this.A0N.A03();
        C5J c5j = this.A04;
        if (c5j != null) {
            c5j.A0O(this.A0I);
        }
        if (this.A07 != null) {
            AbstractC0924aS abstractC0924aS = this.A0G;
            if (A0a[0].charAt(29) == 'D') {
                throw new RuntimeException();
            }
            A0a[0] = "voPpcOtL9PQSCLq1wYvqOCQr8JaLbGKq";
            if (!TextUtils.isEmpty(abstractC0924aS.A11())) {
                this.A0K.A9J(this.A0G.A11(), new NL().A03(this.A07.getViewabilityChecker()).A02(this.A07.getTouchDataRecorder()).A05());
            }
            this.A07.A0C();
        }
        this.A0M.A07();
        this.A0Y.setToolbarListener(null);
        this.A03 = null;
        this.A04 = null;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            ACj(false);
        } else {
            ACJ(false);
        }
    }

    public void setListener(InterfaceC0531Lt interfaceC0531Lt) {
    }

    public void setServerSideRewardHandler(PU pu) {
        this.A08 = pu;
    }
}
