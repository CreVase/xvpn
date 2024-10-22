package com.facebook.ads.redexgen.X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.ads.internal.view.FullScreenAdToolbar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: assets/audience_network.dex */
public final class SD extends FrameLayout implements InterfaceC0532Lu {
    public static byte[] A0L;
    public static String[] A0M = {"n8b1XAz0kHAkpiWEmzC3t1pF5U", "eWK394xXCAUBfgpESuKIG56NqbrNFWJq", "5CdOn8t3diym6HDjOq5Y6uNvOx4lt5g3", "HN0pIlpAYl374dQUYji0gU", "nPJn2NzIeBIJ0ob92wkGV5", "7vv965TmOe", "OL6PAd", "N5PSCRASy1"};
    public static final RelativeLayout.LayoutParams A0N;
    public int A00;
    public int A01;
    public int A02;
    public NZ A03;
    public AbstractC0612Ow A04;
    public PU A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final C0922aQ A0A;
    public final C5H A0B;
    public final C6Q A0C;
    public final YA A0D;
    public final InterfaceC0444If A0E;
    public final C0452In A0F;
    public final LI A0G;
    public final InterfaceC0531Lt A0H;
    public final FullScreenAdToolbar A0I;
    public final MM A0J;
    public final ArrayList<C0615Oz> A0K;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 30 out of bounds for length 25
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.facebook.ads.redexgen.X.AbstractC0612Ow A07(boolean r23, int r24) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.SD.A07(boolean, int):com.facebook.ads.redexgen.X.Ow");
    }

    public static String A08(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 39);
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0L = new byte[]{113, -64, -73, 113, -62, -27, -95};
        String[] strArr = A0M;
        if (strArr[3].length() != strArr[4].length()) {
            throw new RuntimeException();
        }
        A0M[2] = "BvaU1dA3vF4hXYIjQV5InfWnSlZ4OmYy";
    }

    static {
        A0C();
        A0N = new RelativeLayout.LayoutParams(-1, -1);
    }

    public SD(YA ya, MM mm, InterfaceC0444If interfaceC0444If, C0922aQ c0922aQ, C6Q c6q, InterfaceC0531Lt interfaceC0531Lt) {
        super(ya);
        this.A0K = new ArrayList<>();
        this.A09 = false;
        this.A07 = false;
        this.A08 = false;
        this.A06 = true;
        this.A02 = 1;
        this.A00 = 0;
        this.A01 = 0;
        this.A0B = new SG(this);
        this.A0D = ya;
        this.A0J = mm;
        this.A0E = interfaceC0444If;
        this.A0A = c0922aQ;
        this.A0C = c6q;
        this.A0H = interfaceC0531Lt;
        this.A0F = new C0452In(c0922aQ.A0t(0).A11(), interfaceC0444If);
        LI li = new LI(this);
        this.A0G = li;
        li.A05(LH.A03);
        this.A05 = new PU(ya, mm, c0922aQ.A0S(), interfaceC0531Lt);
        FullScreenAdToolbar A04 = A04();
        this.A0I = A04;
        addView(A04, new FrameLayout.LayoutParams(-1, A04.getToolbarHeight()));
    }

    private int A00(int i) {
        if (this.A0A.A11() && i < this.A0A.A0w().size() && i >= 0) {
            return this.A0A.A0w().get(i).intValue();
        }
        return this.A0A.A0G();
    }

    public static /* synthetic */ int A01(SD sd, int i) {
        int i2 = sd.A01 + i;
        sd.A01 = i2;
        return i2;
    }

    private FullScreenAdToolbar A04() {
        FullScreenAdToolbar fullScreenAdToolbar = new FullScreenAdToolbar(this.A0D, this.A0H, this.A0F, 2);
        fullScreenAdToolbar.setFullscreen(true);
        fullScreenAdToolbar.setToolbarListener(new SE(this));
        return fullScreenAdToolbar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A09() {
        boolean acted = A0R();
        if (acted) {
            this.A0D.A0E().A4D();
        }
    }

    private void A0A() {
        int i = this.A00;
        if (i > 0 && !TextUtils.isEmpty(this.A0A.A0t(i - 1).A11())) {
            InterfaceC0444If interfaceC0444If = this.A0E;
            String A11 = this.A0A.A0t(this.A00 - 1).A11();
            NL nl = new NL();
            AbstractC0612Ow abstractC0612Ow = this.A04;
            NL A03 = nl.A03(abstractC0612Ow != null ? abstractC0612Ow.getAdViewabilityChecker() : null);
            AbstractC0612Ow abstractC0612Ow2 = this.A04;
            interfaceC0444If.A9J(A11, A03.A02(abstractC0612Ow2 != null ? abstractC0612Ow2.getTouchDataRecorder() : null).A05());
        }
    }

    private void A0B() {
        this.A0D.A0E().A4B();
        this.A07 = true;
        this.A03 = new NZ(this.A0D, this.A0A, this.A0E, this.A0H, this.A0I.getToolbarHeight(), this.A02);
        C0615Oz c0615Oz = null;
        Iterator<C0615Oz> it = this.A0K.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0M[1].charAt(22) == '6') {
                String[] strArr = A0M;
                strArr[7] = "ZPnrdglx3i";
                strArr[5] = "Z92DtyKnO3";
                if (!hasNext) {
                    break;
                }
                C0615Oz s = it.next();
                if (s.A00 == C0615Oz.A06) {
                    c0615Oz = s;
                    break;
                }
            } else {
                throw new RuntimeException();
            }
        }
        if (c0615Oz != null) {
            A0H(this.A03, c0615Oz);
        } else if (!this.A0K.isEmpty()) {
            A0H(this.A03, this.A0K.get(0));
        }
        A0P(true);
        this.A0I.setOnlyPageDetails(null);
        AbstractC0612Ow abstractC0612Ow = this.A04;
        if (abstractC0612Ow != null) {
            LV.A0J(abstractC0612Ow);
            this.A04.A0K();
            this.A04 = null;
        }
        LV.A0J(this.A03);
        LV.A0G(1102, this.A03);
        addView(this.A03, 0, new FrameLayout.LayoutParams(-1, -1));
    }

    private final void A0D() {
        if (Build.VERSION.SDK_INT < 19) {
            return;
        }
        this.A0G.A05(LH.A04);
    }

    private synchronized void A0E() {
        this.A0H.A3z(this.A0J.A5o());
        this.A05.A05();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(float f) {
        float seenCurrentPosMS;
        float A00 = A00(this.A00 - 1);
        float seenCurrentPosMS2 = (this.A0A.A11() ? 0 : this.A01) + f;
        if (A00 > 0.0f) {
            seenCurrentPosMS = seenCurrentPosMS2 / A00;
        } else {
            seenCurrentPosMS = 1.0f;
        }
        if (this.A06 && this.A0A.A11()) {
            this.A06 = false;
            this.A0I.setProgressImmediate(0.0f);
        }
        float unskippableSeconds = 100.0f * seenCurrentPosMS;
        this.A0I.setProgress(unskippableSeconds);
        if (seenCurrentPosMS >= 1.0f && !this.A09) {
            this.A09 = true;
            this.A0I.setToolbarActionMode(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0G(int i) {
        this.A0D.A0E().A48(i);
        this.A09 = true;
        A0E();
        A0A();
        this.A0H.A3z(this.A0J.A6n());
    }

    private void A0H(ViewGroup viewGroup, C0615Oz c0615Oz) {
        if (c0615Oz.A00 == C0615Oz.A06 && c0615Oz.A03 != null) {
            C0579Np.A00(this.A0D, viewGroup, c0615Oz.A03);
        } else {
            LV.A0M(viewGroup, c0615Oz.A01);
        }
        this.A0I.setFullscreen(c0615Oz.A05);
        this.A0I.A06(c0615Oz.A02, c0615Oz.A04);
    }

    private void A0I(AbstractC0924aS abstractC0924aS) {
        if (A0V(abstractC0924aS)) {
            int i = this.A02;
            if (A0M[2].charAt(7) != '3') {
                throw new RuntimeException();
            }
            A0M[2] = "vyv5r133RkdgG8M1gH7WIgZDBjsgq9Je";
            if (i == 2) {
                this.A0I.setOnlyPageDetails(abstractC0924aS.A0z());
                return;
            }
        }
        this.A0I.setOnlyPageDetails(null);
    }

    private final void A0J(C5J c5j) {
        c5j.A0N(this.A0B);
        int i = c5j.A0J().getResources().getConfiguration().orientation;
        this.A02 = i;
        A0Q(this.A0A.A0y(), i);
        A0D();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0P(boolean z) {
        boolean z2 = (!A0T() || A0S() || A0U()) ? false : true;
        boolean A0S = A0S();
        if (A0M[1].charAt(22) != '6') {
            throw new RuntimeException();
        }
        String[] strArr = A0M;
        strArr[7] = "fhNsXNJVUA";
        strArr[5] = "wXa0tVX5fv";
        if (!A0S && !z2) {
            this.A09 = true;
            if (z) {
                this.A0I.setToolbarActionMessage(A08(0, 0, 66));
            }
            this.A0I.setToolbarActionMode(0);
            return;
        }
        this.A0I.setToolbarActionMode(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0Q(boolean z, int i) {
        AbstractC0612Ow abstractC0612Ow = this.A04;
        if (abstractC0612Ow != null) {
            abstractC0612Ow.A0K();
            AbstractC0612Ow abstractC0612Ow2 = this.A04;
            if (A0M[1].charAt(22) != '6') {
                throw new RuntimeException();
            }
            A0M[2] = "W3TlfOl3oEXDpQnuuCTH10eCcUmU4b3A";
            abstractC0612Ow2.removeAllViews();
            LV.A0J(this.A04);
        }
        if (!A0S()) {
            this.A09 = true;
            if (A0T()) {
                A0B();
                return;
            } else {
                A0G(1);
                return;
            }
        }
        if (this.A0A.A11()) {
            this.A09 = false;
            this.A0I.setProgressImmediate(0.0f);
        }
        boolean isLoaded = this.A0D.A00().A8m(this.A0A.A0t(this.A00).A11(), this.A0A.A0u());
        if (!isLoaded) {
            this.A0D.A0E().A49();
            A0G(2);
            return;
        }
        AbstractC0612Ow A07 = A07(z, i);
        this.A04 = A07;
        setupToolbarForAd(A07);
        addView(this.A04, 0, A0N);
        this.A00++;
        this.A04.A0M();
    }

    private boolean A0R() {
        AbstractC0612Ow abstractC0612Ow;
        if (!this.A09) {
            AbstractC0612Ow abstractC0612Ow2 = this.A04;
            if (abstractC0612Ow2 == null || !abstractC0612Ow2.A0Q() || this.A0A.A0p() != 1) {
                return false;
            }
            A0Q(false, this.A02);
            return true;
        }
        if (A0S() && (abstractC0612Ow = this.A04) != null && (abstractC0612Ow.A0Q() || this.A0A.A0p() == 2)) {
            if (!this.A0A.A11()) {
                this.A08 = true;
            }
            A0Q(false, this.A02);
            return true;
        }
        AbstractC0612Ow abstractC0612Ow3 = this.A04;
        if (abstractC0612Ow3 != null && abstractC0612Ow3.A0P()) {
            this.A0I.setToolbarActionMode(0);
            this.A0D.A0E().A4C();
            this.A04.A0L();
            return true;
        }
        if (A0T() && !A0U()) {
            A0B();
            return true;
        }
        if ((this.A04 instanceof SQ) && A0S()) {
            A0Q(false, this.A02);
            return true;
        }
        this.A0F.A04(EnumC0451Im.A07, null);
        A0G(4);
        return true;
    }

    private boolean A0S() {
        return this.A00 < this.A0A.A0q();
    }

    private boolean A0T() {
        return this.A0A.A0p() == 2;
    }

    private final boolean A0U() {
        return this.A07;
    }

    public static boolean A0V(AbstractC0924aS abstractC0924aS) {
        return TextUtils.isEmpty(abstractC0924aS.A0v().A0D().A08());
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void A9C(Intent intent, Bundle bundle, C5J c5j) {
        this.A0H.A3Q(this, A0N);
        A0J(c5j);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACJ(boolean z) {
        AbstractC0612Ow abstractC0612Ow = this.A04;
        if (abstractC0612Ow != null) {
            abstractC0612Ow.A0N(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void ACj(boolean z) {
        AbstractC0612Ow abstractC0612Ow = this.A04;
        if (abstractC0612Ow != null) {
            abstractC0612Ow.A0O(z);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void AEt(Bundle bundle) {
    }

    public AbstractC0612Ow getContentView() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public String getCurrentClientToken() {
        return null;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02 = configuration.orientation;
        AbstractC0612Ow abstractC0612Ow = this.A04;
        if (abstractC0612Ow != null) {
            abstractC0612Ow.onConfigurationChanged(configuration);
        }
        AbstractC0612Ow abstractC0612Ow2 = this.A04;
        if (abstractC0612Ow2 instanceof SQ) {
            A0H(abstractC0612Ow2, abstractC0612Ow2.getFullScreenAdStyle());
            A0I(this.A04.getAdDataBundle());
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0532Lu
    public final void onDestroy() {
        AbstractC0612Ow abstractC0612Ow = this.A04;
        if (abstractC0612Ow != null) {
            abstractC0612Ow.A0K();
            this.A04 = null;
        }
        this.A0D.A00().A4E(this.A0A.A0u());
        this.A0G.A03();
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setListener(InterfaceC0531Lt interfaceC0531Lt) {
    }

    public void setServerSideRewardHandler(PU pu) {
        this.A05 = pu;
    }

    private void setupToolbarForAd(AbstractC0612Ow abstractC0612Ow) {
        if (this.A0I == null) {
            return;
        }
        this.A06 = true;
        AbstractC0924aS A0t = this.A0A.A0t(this.A00);
        this.A0I.A09(this.A0D, A0t.A0p());
        this.A0I.A08(A0t.A0z(), A0t.A11(), A00(this.A00));
        C0615Oz fullScreenAdStyle = abstractC0612Ow.getFullScreenAdStyle();
        A0H(abstractC0612Ow, fullScreenAdStyle);
        this.A0K.add(fullScreenAdStyle);
        this.A0I.setToolbarActionMessage(A08(4, 3, 90) + (this.A00 + 1) + A08(0, 4, 42) + this.A0A.A0q());
        if (this.A08) {
            this.A0I.setToolbarActionMode(1);
        }
        A0I(A0t);
    }
}
