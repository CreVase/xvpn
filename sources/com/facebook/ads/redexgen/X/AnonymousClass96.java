package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.96, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class AnonymousClass96 extends FrameLayout implements InterfaceC0532Lu, SV {
    public static byte[] A0I;
    public static String[] A0J = {"Ky6zrcoV7NYtZpO3AnBVhERgUe61TP4A", "7", "MIS71VG0t7feKobdqgnq1TwubiJ1N09z", "nEwmQOfqxRkjYDAAu8TY0n89Pulsb82", "nm6mhrtocmSPL4qM7u9wOkkvqXPHcra", "ADTrDSFqqVysA22fSklmKPGMwsWvvDiN", "oNlgPu", "28CTXOUAXLtNi6XFaROwO0buCKC9QIVi"};
    public C5H A00;
    public C5J A01;
    public InterfaceC0607Or A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public final AbstractC0924aS A06;
    public final YA A07;
    public final InterfaceC0444If A08;
    public final C0452In A09;
    public final LI A0A;
    public final LN A0B;
    public final InterfaceC0531Lt A0C;
    public final MM A0D;
    public final OZ A0E;
    public final C0597Oh A0F;
    public final AbstractC0642Qa A0G;
    public final C0643Qb A0H;

    public static String A0B(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0I, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 41);
        }
        return new String(copyOfRange);
    }

    public static void A0D() {
        A0I = new byte[]{-88, -43, -43, -46, -43, -125, -58, -43, -56, -60, -41, -52, -47, -54, -125, -58, -46, -47, -55, -52, -54, -125, -83, -74, -78, -79, 6, 11, 4, 12, 17, 8, 7, 2, 4, 7, -95, -90, -97, -89, -84, -93, -94, -99, -97, -94, -99, -89, -84, -94, -93, -74, -107, -102, -109, -101, -96, -105, -106, -111, -109, -106, -111, -90, -95, -90, -109, -98, -115, -110, -117, -109, -104, -113, -114, -119, -98, -109, -105, -113, -119, -99, -102, -113, -104, -98, -90, -81, -84, -90, -82, -94, -74, -78, -72, -75, -90, -88, 25, 23, 9, 22, 7, 16, 13, 7, 15};
    }

    static {
        A0D();
    }

    public AnonymousClass96(YA ya, InterfaceC0444If interfaceC0444If, InterfaceC0531Lt interfaceC0531Lt, AbstractC0924aS abstractC0924aS, MM mm, int i) {
        super(ya);
        int i2;
        this.A00 = new C0702Si(this);
        C0701Sh c0701Sh = new C0701Sh(this);
        this.A0G = c0701Sh;
        this.A03 = true;
        this.A07 = ya;
        this.A08 = interfaceC0444If;
        this.A0C = interfaceC0531Lt;
        this.A06 = abstractC0924aS;
        this.A0D = mm;
        C0597Oh A02 = C0598Oi.A02(abstractC0924aS.A0R());
        if (A02 == null) {
            this.A0F = new C0597Oh(ya, abstractC0924aS, interfaceC0444If, i);
            this.A04 = false;
        } else {
            this.A0F = A02;
            this.A04 = true;
        }
        C0452In A0K = this.A0F.A0K();
        this.A09 = A0K;
        this.A0B = this.A0F.A0L();
        this.A0F.A0c(new C0700Sg(this));
        LV.A0G(1003, this.A0F.A0O());
        if (abstractC0924aS.A0e()) {
            i2 = 0;
            OZ oz = new OZ(ya, interfaceC0444If, abstractC0924aS, new C6Q(ya), A0K, interfaceC0531Lt, mm, new C0699Sf(this));
            this.A0E = oz;
            oz.A0N();
            this.A0F.A0O().setOnTouchListener(new OV(this));
            addView(oz, new FrameLayout.LayoutParams(-1, -1));
        } else {
            i2 = 0;
            this.A0E = null;
        }
        ViewGroup mediaView = getMediaView();
        C0643Qb c0643Qb = new C0643Qb(mediaView, 1, new WeakReference(c0701Sh), ya);
        this.A0H = c0643Qb;
        c0643Qb.A0W(abstractC0924aS.A0C());
        c0643Qb.A0X(abstractC0924aS.A0D());
        this.A0F.A0e(c0643Qb);
        LI li = new LI(this);
        this.A0A = li;
        li.A05(LH.A03);
        setBackgroundColor(i2);
        if (IP.A1X(ya)) {
            ya.A0A().AGC(mediaView, abstractC0924aS.A11(), false, false, true);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            boolean A17 = abstractC0924aS.A17();
            String A0B = A0B(68, 18, 1);
            String A0B2 = A0B(36, 16, 21);
            String A0B3 = A0B(52, 16, 9);
            String A0B4 = A0B(26, 10, 122);
            if (!A17) {
                if (C0491Kd.A05(abstractC0924aS.A0N())) {
                    jSONObject.put(A0B4, true);
                    jSONObject.put(A0B3, 2);
                    jSONObject.put(A0B2, 1);
                    jSONObject.put(A0B, abstractC0924aS.A0I());
                }
            } else {
                jSONObject.put(A0B4, true);
                jSONObject.put(A0B3, 2);
                jSONObject.put(A0B2, i2);
                jSONObject.put(A0B, abstractC0924aS.A0I());
            }
            this.A0F.A0j(jSONObject);
        } catch (JSONException unused) {
            this.A0F.A0M().A04(C01997x.A15, A0B(0, 26, 58));
        }
    }

    private void A0C() {
        P3 A0B = new P1(this.A07, this.A06.A0v().A0E(), this.A06.A0z()).A08(this.A06.A0u().A01()).A0B();
        addView(A0B, new FrameLayout.LayoutParams(-1, -1));
        A0B.A04(new C0697Sd(this));
    }

    private final void A0E() {
        this.A0F.A0d(this);
        if (!this.A04) {
            this.A07.A0E().A5C();
            this.A0F.A0X();
        } else {
            this.A07.A0E().A5D();
            if (this.A0F.A0k()) {
                AFn();
                YA ya = this.A07;
                if (A0J[6].length() != 6) {
                    throw new RuntimeException();
                }
                A0J[5] = "8j5uXfZ95rl8UwGJAIvPTgfy7qu4v9pG";
                if (IP.A1X(ya)) {
                    this.A07.A0A().AB1();
                }
            }
        }
        addView(this.A0F.A0O(), new FrameLayout.LayoutParams(-1, -1));
        this.A0C.A3Q(this, new RelativeLayout.LayoutParams(-1, -1));
        if (Build.VERSION.SDK_INT >= 19 && this.A06.A0f()) {
            this.A0A.A05(LH.A04);
        }
    }

    private void A0F(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        NW nw = new NW(this.A07, this.A0D.A6M(), this.A0H, this.A0B, this.A08, this.A06.A0x(), this.A0C);
        HashMap hashMap = new HashMap();
        hashMap.put(A0B(86, 12, 26), A0B(98, 9, 123));
        nw.A08(this.A06.A11(), str, hashMap);
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void A8I() {
        A0F(this.A06.A0v().A0F().A05());
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void A8J(String str) {
        A0F(str);
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void A8N() {
        this.A0C.A3z(this.A0D.A5o());
        PU serverSideRewardHandler = new PU(this.A07, this.A0D, this.A06.A0S(), this.A0C);
        serverSideRewardHandler.A05();
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void A96() {
        new Handler(Looper.getMainLooper()).post(new C0698Se(this));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void A9C(Intent intent, Bundle bundle, C5J c5j) {
        C0597Oh.A0B().incrementAndGet();
        c5j.A0N(this.A00);
        this.A01 = c5j;
        A0E();
        if (this.A06.A0v().A0P()) {
            A0C();
        } else {
            this.A0F.A0W();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void ABR() {
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void ABV() {
        OZ oz = this.A0E;
        if (oz != null) {
            oz.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void AC9(boolean z) {
        OZ oz = this.A0E;
        if (oz != null) {
            oz.A0R(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACJ(boolean z) {
        OZ oz = this.A0E;
        if (oz != null) {
            oz.A0S(z);
        }
        if (z) {
            this.A0F.A0Q();
        } else {
            this.A0F.A0T();
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACj(boolean z) {
        OZ oz = this.A0E;
        if (oz != null) {
            oz.A0T(z);
        }
        boolean z2 = this.A03;
        if (A0J[1].length() == 11) {
            throw new RuntimeException();
        }
        A0J[5] = "5WCDyt3aDRAQqvSthuq2O6x8YHnGvtvN";
        if (z2) {
            this.A03 = false;
        } else if (z) {
            this.A0F.A0P();
        } else {
            this.A0F.A0Y();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void ACx() {
        OZ oz = this.A0E;
        if (oz != null) {
            oz.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void ADS(boolean z) {
        OZ oz = this.A0E;
        if (oz != null) {
            oz.A0U(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void ADU(boolean z) {
        OZ oz = this.A0E;
        if (oz != null) {
            oz.A0V(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void ADh(String str) {
        String urlString = this.A06.A12(str);
        if (urlString == null) {
            return;
        }
        KZ.A0L(new KZ(), this.A07, C0490Kc.A00(urlString), this.A06.A11());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void AEt(Bundle bundle) {
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void AFn() {
        if (!this.A05) {
            this.A0H.A0U();
            this.A05 = true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.SV
    public final void close() {
        C5J c5j = this.A01;
        if (c5j == null) {
            return;
        }
        c5j.finish(4);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public String getCurrentClientToken() {
        return this.A06.A11();
    }

    private ViewGroup getMediaView() {
        OZ oz = this.A0E;
        return oz != null ? oz : this.A0F.A0O();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void onDestroy() {
        if (IP.A1X(this.A07)) {
            this.A07.A0A().AFz(getMediaView());
        }
        OZ oz = this.A0E;
        if (oz != null) {
            oz.A0O();
        }
        this.A0A.A03();
        this.A08.A9J(this.A06.A11(), new NL().A02(this.A0B).A03(this.A0H).A05());
        this.A00 = null;
        this.A02 = null;
        this.A01 = null;
        C0598Oi.A04(this.A06.A0R());
        C0597Oh.A0B().decrementAndGet();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        requestDisallowInterceptTouchEvent(true);
        return super.onTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0531Lt interfaceC0531Lt) {
    }

    public void setRtfActionsJavascriptListener(InterfaceC0607Or interfaceC0607Or) {
        this.A02 = interfaceC0607Or;
    }
}
