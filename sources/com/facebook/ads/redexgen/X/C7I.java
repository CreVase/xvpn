package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.adapters.datamodels.AdInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.7I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7I extends AbstractC0723Td implements PH {
    public static byte[] A0N;
    public static String[] A0O = {"jpfQHsJU1lQWxp7CXlwdVdxcmzkEjD3g", "zEjz0M8mBGIlVid6uM60nN2wm9TWrUGD", "N1PpSZkKdQQSk7AxXPBdtL04F7CB9SRH", "NsCDsqdLjA318x1fHEY8u0Kcg9miAoAi", "WmIcjMDFfLwNDk", "", "Zb94j8IQkKLdVAKFmXIR3eGQpuAhW41l", "pxOHyfKHQ8aixQeNEjeruqZzDXsiYM9P"};
    public static final int A0P;
    public static final int A0Q;
    public static final int A0R;
    public static final int A0S;
    public int A00;
    public int A01;
    public int A02;
    public RelativeLayout A03;
    public F0 A04;
    public C6Q A05;
    public C2O A06;
    public NR A07;
    public C0571Nh A08;
    public S0 A09;
    public AbstractC0642Qa A0A;
    public C0643Qb A0B;
    public String A0C;
    public List<PC> A0D;
    public final int A0E;
    public final C1M A0F;
    public final YA A0G;
    public final LN A0H;
    public final InterfaceC0531Lt A0I;
    public final C0589Nz A0J;
    public final PI A0K;
    public final PI A0L;
    public final C0466Jb A0M;

    public static String A07(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            int i5 = (copyOfRange[i4] - i3) - 14;
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[5] = "";
            copyOfRange[i4] = (byte) i5;
        }
        return new String(copyOfRange);
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for length 6
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private void A0B() {
        int min;
        int i;
        int i2;
        int i3 = getResources().getConfiguration().orientation;
        int i4 = C0506Ku.A03.widthPixels;
        int i5 = C0506Ku.A03.heightPixels;
        if (i3 == 1) {
            min = Math.min(i4 - (A0Q * 4), i5 / 2);
            i = (i4 - min) / 8;
            i2 = i * 4;
            this.A0K.setVisibility(8);
            this.A0L.setVisibility(8);
        } else {
            min = Math.min(i5, i4);
            i = (i4 - min) / 2;
            i2 = i;
            A09();
        }
        C2O c2o = this.A06;
        if (c2o == null) {
            Log.e(A07(61, 17, 7), A07(0, 28, 11));
            onDestroy();
            return;
        }
        C0693Rz fullscreenCarouselRecyclerViewAdapter = c2o.getFullscreenCarouselRecyclerViewAdapter();
        if (fullscreenCarouselRecyclerViewAdapter != null) {
            fullscreenCarouselRecyclerViewAdapter.A0F(min, i, i2);
            fullscreenCarouselRecyclerViewAdapter.A06();
        }
    }

    public static void A0C() {
        byte[] bArr = {94, -117, -117, -120, -117, 57, 124, -117, 126, 122, -115, -126, -121, Byte.MIN_VALUE, 57, 124, 122, -117, -120, -114, -116, 126, -123, 57, -113, -126, 126, -112, 89, -122, -122, -125, -122, 52, -117, 124, 125, Byte.MIN_VALUE, 121, 52, 119, 117, -122, -125, -119, -121, 121, Byte.MIN_VALUE, 52, 119, 117, -122, 120, 52, 119, 124, 117, -126, 123, 121, 66, 91, 87, 86, -118, 121, 126, 122, -125, 120, 122, 99, 122, -119, -116, -124, -121, Byte.MIN_VALUE, -97, -94, -99, -94, -97, -78, -97, -99, -96, -77, -84, -94, -86, -93, -33, -21, -23, -86, -30, -35, -33, -31, -34, -21, -21, -25, -86, -35, -32, -17, -86, -27, -22, -16, -31, -18, -17, -16, -27, -16, -27, -35, -24, -86, -33, -24, -27, -33, -25, -31, -32};
        if (A0O[0].charAt(17) == 'P') {
            throw new RuntimeException();
        }
        A0O[0] = "0pXVmbGKHAzIVbBBK7Eyv6Mrdc2f0VIY";
        A0N = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 27 out of bounds for length 24
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    private final void A0E(int i, Bundle bundle) {
        boolean z = i == 1;
        this.A03 = new RelativeLayout(getContext());
        C0719Sz c0719Sz = new C0719Sz(this.A0G, 0, this.A0D.get(0).A03().A0E().A00() == C1I.A05, this.A0F, super.A0A.A0v().A0F().A06(), A07(92, 37, 110), getAdEventManager(), this.A0I, this.A0B, this.A0H, super.A0A.A0x());
        this.A07 = c0719Sz;
        c0719Sz.A0C(z ? 1 : 0);
        this.A03.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.A0A = new C0692Ry(this);
        C0643Qb c0643Qb = new C0643Qb(this, 1, new WeakReference(this.A0A), this.A0G);
        this.A0B = c0643Qb;
        c0643Qb.A0W(this.A01);
        this.A0B.A0X(this.A02);
        C2O c2o = new C2O(this.A0G);
        this.A06 = c2o;
        LV.A0K(c2o);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(13);
        this.A09 = new S0(this.A06, i, this.A0D, this.A0B, bundle);
        if (this.A0C != null) {
            this.A06.setAdapter(new C0693Rz(this.A0G, this.A0D, this.A04, super.A0C, this.A05, this.A0B, this.A0H, getAudienceNetworkListener(), this.A0C, this.A09, this.A0M, super.A0E));
            A0B();
        } else {
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[5] = "";
            Log.e(A07(61, 17, 7), A07(0, 28, 11));
            onDestroy();
        }
        A0G(this.A09);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(12);
        if (IP.A1X(this.A0G)) {
            InterfaceC0456Ir A0A = this.A0G.A0A();
            C2O c2o2 = this.A06;
            String A11 = super.A0A.A11();
            if (A0O[4].length() == 17) {
                throw new RuntimeException();
            }
            A0O[5] = "";
            A0A.AGA(c2o2, A11, false);
        }
        this.A03.addView(this.A06, layoutParams);
        A0A();
        this.A03.addView(this.A08);
        this.A07.setTitleMaxLines(3);
        this.A07.A0A();
        this.A07.A09();
        this.A03.addView(this.A07, layoutParams2);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(9);
        layoutParams3.addRule(15);
        int i2 = A0P;
        layoutParams3.width = i2;
        layoutParams3.height = i2;
        int i3 = A0Q;
        layoutParams3.setMargins(i3, 0, 0, 0);
        layoutParams4.addRule(11);
        layoutParams4.addRule(15);
        layoutParams4.width = i2;
        layoutParams4.height = i2;
        layoutParams4.setMargins(0, 0, i3, 0);
        this.A03.addView(this.A0K, layoutParams3);
        this.A03.addView(this.A0L, layoutParams4);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams5.addRule(12);
        this.A03.addView(this.A0M, layoutParams5);
        A0W(this.A03, true, i);
        removeView(findViewById(C0579Np.A00));
        if (IP.A2H(this.A0G)) {
            LV.A0M(this, -1);
        } else {
            C0579Np.A00(this.A0J.A05(), this, this.A04.A0v().A0D().A07());
        }
        if (this.A0C != null) {
            this.A07.setInfo(this.A04.A0v().A0E(), this.A04.A0v().A0F(), this.A0C, super.A0A.A0z().A01(), null);
        }
    }

    static {
        A0C();
        A0Q = (int) (C0506Ku.A02 * 8.0f);
        A0R = (int) (C0506Ku.A02 * 8.0f);
        A0S = (int) (C0506Ku.A02 * 12.0f);
        A0P = (int) (C0506Ku.A02 * 42.0f);
    }

    public C7I(YA ya, InterfaceC0444If interfaceC0444If, C6Q c6q, InterfaceC0531Lt interfaceC0531Lt, F0 f0) {
        super(ya, interfaceC0444If, interfaceC0531Lt, f0);
        LN ln = new LN();
        this.A0H = ln;
        this.A00 = -1;
        this.A05 = c6q;
        this.A0G = ya;
        this.A0I = interfaceC0531Lt;
        this.A0E = super.A0A.A13().size();
        this.A0M = new C0466Jb(ya);
        this.A0L = new PI(ya, PG.A04, this);
        this.A0K = new PI(ya, PG.A03, this);
        this.A0J = new C0588Ny(ya, interfaceC0444If, getAudienceNetworkListener(), this.A04, null, this.A0B, ln).A0H(super.A0E).A0K();
        this.A0F = f0.A0u().A01();
        if (IP.A1m(ya)) {
            super.A0E.setProgressSpinnerInvisible(true);
        }
    }

    private void A09() {
        if (this.A00 > 0) {
            this.A0K.setVisibility(0);
        } else {
            this.A0K.setVisibility(8);
        }
        if (this.A00 != this.A0E - 1) {
            PI pi = this.A0L;
            String[] strArr = A0O;
            if (strArr[7].charAt(14) == strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            A0O[0] = "6a52QfyEa3IWfhbHGHqjZ8J10HxaoQoC";
            pi.setVisibility(0);
            return;
        }
        this.A0L.setVisibility(8);
    }

    private void A0A() {
        if (this.A08 != null && this.A06 != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            if (getResources().getConfiguration().orientation == 1) {
                layoutParams.addRule(3, this.A06.getId());
                layoutParams.setMargins(0, A0Q, 0, 0);
            } else {
                layoutParams.addRule(12);
                layoutParams.setMargins(0, 0, 0, A0Q);
            }
            layoutParams.addRule(14);
            this.A08.setLayoutParams(layoutParams);
        }
    }

    private final void A0D() {
        C2O c2o = this.A06;
        if (c2o != null) {
            c2o.removeAllViews();
            this.A06 = null;
        }
        C0571Nh c0571Nh = this.A08;
        if (c0571Nh != null) {
            c0571Nh.removeAllViews();
            this.A08 = null;
        }
        RelativeLayout relativeLayout = this.A03;
        if (A0O[5].length() != 0) {
            throw new RuntimeException();
        }
        A0O[5] = "";
        if (relativeLayout != null) {
            relativeLayout.removeAllViews();
        }
    }

    private void A0F(F0 f0) {
        this.A04 = f0;
        this.A0C = f0.A11();
        this.A01 = this.A04.A0C();
        this.A02 = this.A04.A0D();
        List<C1D> A13 = this.A04.A13();
        List<AdInfo> adInfoList = new ArrayList<>(A13.size());
        this.A0D = adInfoList;
        for (int i = 0; i < A13.size(); i++) {
            C1D c1d = A13.get(i);
            List<PC> list = this.A0D;
            int i2 = A13.size();
            list.add(new PC(i, i2, c1d));
        }
    }

    private void A0G(S0 s0) {
        new EE().A0G(this.A06);
        s0.A0Z(new C0691Rx(this));
        C0571Nh c0571Nh = new C0571Nh(this.A0G, super.A05.A01(), this.A0D.size());
        this.A08 = c0571Nh;
        LV.A0K(c0571Nh);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, A0R);
        layoutParams.setMargins(0, A0S, 0, 0);
        this.A08.setLayoutParams(layoutParams);
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0723Td
    public final boolean A0c() {
        return false;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void A9C(Intent intent, Bundle bundle, C5J c5j) {
        F0 dataBundle = (F0) intent.getSerializableExtra(A07(78, 14, 48));
        A0X(c5j);
        if (dataBundle != null) {
            A0F(dataBundle);
        }
        A0E(c5j.A0J().getResources().getConfiguration().orientation, bundle);
        c5j.A0N(new C0690Rw(this, c5j));
        int A03 = super.A0A.A0v().A0D().A03();
        if (A03 > 0) {
            A0V(A03);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0723Td, com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACJ(boolean z) {
        super.ACJ(z);
        S0 s0 = this.A09;
        if (s0 != null) {
            s0.A0Q();
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0723Td, com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACj(boolean z) {
        super.ACj(z);
        S0 s0 = this.A09;
        if (s0 != null) {
            s0.A0R();
        }
    }

    @Override // com.facebook.ads.redexgen.X.PH
    public final void AD6(PG pg) {
        int i;
        C2O c2o = this.A06;
        if (c2o != null) {
            ZC layoutManager = c2o.getLayoutManager();
            if (pg == PG.A03) {
                int i2 = this.A00;
                i = i2 <= 0 ? 0 : i2 - 1;
                layoutManager.A21(this.A06, new C01264r(), i);
            } else {
                int i3 = this.A00;
                int i4 = this.A0E;
                i = i3 >= i4 + (-1) ? i4 - 1 : i3 + 1;
                layoutManager.A21(this.A06, new C01264r(), i);
            }
            setUpLayoutForCardAtIndex(i);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void AEt(Bundle bundle) {
        S0 s0 = this.A09;
        if (s0 != null) {
            s0.A0X(bundle);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0723Td
    public int getCloseButtonStyle() {
        return 0;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        Bundle savedInstanceState = new Bundle();
        AEt(savedInstanceState);
        super.onConfigurationChanged(configuration);
        A0B();
        C2O c2o = this.A06;
        if (c2o != null && this.A09 != null) {
            c2o.getLayoutManager().A1t(Math.max(this.A00, 0));
            this.A09.A0U(Math.max(this.A00, 0));
        }
        A0A();
        NR nr = this.A07;
        if (nr != null) {
            nr.A0C(configuration.orientation);
        }
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0723Td, com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void onDestroy() {
        super.onDestroy();
        if (IP.A1X(this.A0G)) {
            InterfaceC0456Ir A0A = this.A0G.A0A();
            if (A0O[0].charAt(17) == 'P') {
                throw new RuntimeException();
            }
            A0O[4] = "nCvA44nJ0TVVJ";
            A0A.AFz(this.A06);
        }
        if (!TextUtils.isEmpty(this.A0C)) {
            super.A0C.A9J(this.A0C, new NL().A03(this.A0B).A02(this.A0H).A05());
        }
        A0D();
        this.A0B.A0V();
        this.A0B = null;
        this.A0A = null;
        this.A0D = null;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.A0H.A06(this.A0G, motionEvent, this, this);
        return super.onInterceptTouchEvent(motionEvent);
    }

    private void setAdDetailsToolBarClickListener(int i) {
        InterfaceC0534Lw interfaceC0534Lw;
        if (this.A06 == null || !IP.A0z(this.A0J.A05()) || i < 0 || this.A06.getAdapter() == null) {
            return;
        }
        C2O c2o = this.A06;
        String[] strArr = A0O;
        if (strArr[3].charAt(28) == strArr[2].charAt(28)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[7] = "L2Q99TOJcURMOBK7mibMWk3Gkyoj0cp8";
        strArr2[1] = "bh6RAua9XdYQzRZgXDnYUJ30pnvEuGys";
        if (i >= c2o.getAdapter().A0D() || (interfaceC0534Lw = (InterfaceC0534Lw) this.A06.A1F(i)) == null) {
            return;
        }
        interfaceC0534Lw.AF7();
        interfaceC0534Lw.AF5(this.A07);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setUpLayoutForCardAtIndex(int r12) {
        /*
            r11 = this;
            com.facebook.ads.redexgen.X.Nh r0 = r11.A08
            if (r0 == 0) goto L7
            r0.A00(r12)
        L7:
            com.facebook.ads.redexgen.X.F0 r0 = r11.A04
            com.facebook.ads.redexgen.X.1D r4 = r0.A0w(r12)
            if (r4 == 0) goto L81
            int r0 = r11.A00
            if (r0 == r12) goto L81
            r11.A00 = r12
            android.content.res.Resources r0 = r11.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            int r1 = r0.orientation
            r0 = 2
            if (r1 != r0) goto L25
            r11.A09()
        L25:
            int r0 = com.facebook.ads.redexgen.X.C0579Np.A00
            android.view.View r0 = r11.findViewById(r0)
            r11.removeView(r0)
            com.facebook.ads.redexgen.X.YA r0 = r11.A0G
            boolean r0 = com.facebook.ads.redexgen.X.IP.A2H(r0)
            if (r0 == 0) goto La6
            r0 = -1
            com.facebook.ads.redexgen.X.LV.A0M(r11, r0)
        L3a:
            java.lang.String r0 = r11.A0C
            if (r0 == 0) goto L58
            com.facebook.ads.redexgen.X.NR r5 = r11.A07
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.C7I.A0O
            r0 = 0
            r1 = r1[r0]
            r0 = 17
            char r1 = r1.charAt(r0)
            r0 = 80
            if (r1 == r0) goto Lb8
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.C7I.A0O
            java.lang.String r1 = "kFih28rpO37RepskuaJrvvoNb65qRIkh"
            r0 = 6
            r2[r0] = r1
            if (r5 != 0) goto L8a
        L58:
            r2 = 61
            r1 = 17
            r0 = 7
            java.lang.String r3 = A07(r2, r1, r0)
            r2 = 28
            r1 = 33
            r0 = 6
            java.lang.String r0 = A07(r2, r1, r0)
            android.util.Log.e(r3, r0)
        L6d:
            com.facebook.ads.redexgen.X.1G r0 = r4.A0D()
            java.lang.String r0 = r0.A08()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L82
            com.facebook.ads.redexgen.X.Jb r1 = r11.A0M
            r0 = 0
            r1.setVisibility(r0)
        L81:
            return
        L82:
            com.facebook.ads.redexgen.X.Jb r1 = r11.A0M
            r0 = 8
            r1.setVisibility(r0)
            goto L81
        L8a:
            com.facebook.ads.redexgen.X.1K r6 = r4.A0E()
            com.facebook.ads.redexgen.X.1N r7 = r4.A0F()
            java.lang.String r8 = r11.A0C
            com.facebook.ads.redexgen.X.aS r0 = r11.A0A
            com.facebook.ads.redexgen.X.1X r0 = r0.A0z()
            java.lang.String r9 = r0.A01()
            r10 = 0
            r5.setInfo(r6, r7, r8, r9, r10)
            r11.setAdDetailsToolBarClickListener(r12)
            goto L6d
        La6:
            com.facebook.ads.redexgen.X.Nz r0 = r11.A0J
            com.facebook.ads.redexgen.X.YA r1 = r0.A05()
            com.facebook.ads.redexgen.X.1G r0 = r4.A0D()
            java.lang.String r0 = r0.A07()
            com.facebook.ads.redexgen.X.C0579Np.A00(r1, r11, r0)
            goto L3a
        Lb8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.C7I.setUpLayoutForCardAtIndex(int):void");
    }
}
