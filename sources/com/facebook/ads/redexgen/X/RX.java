package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.chartboost.sdk.impl.f8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: assets/audience_network.dex */
public class RX extends RelativeLayout implements QZ, InterfaceC0618Pc, QX {
    public static byte[] A0E;
    public static String[] A0F = {"bTF0mPynjITMPKd7AWnGFE0wjuUHqGk", "NLuteA0O4hImypGMVaagZ7KROvpQko", "vHIsSgA1dNPe0TxNLDw8T5r", "Tu3OEd7", "fTm", "FLX2LFKD3Z9kyRG7iyj3Ajj18EKg1", "ES7oyLysdjBWPeOJZDQ9P8Sn", f8.f823a};
    public static final OK A0G;
    public static final MJ A0H;
    public static final MD A0I;
    public static final LT A0J;
    public static final LO A0K;
    public static final C0499Kl A0L;
    public static final KJ A0M;
    public static final KG A0N;
    public int A00;
    public C0452In A01;
    public C0622Pg A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final Handler A07;
    public final Handler A08;
    public final View.OnTouchListener A09;
    public final YA A0A;
    public final C8Z<AbstractC02028a, C8Y> A0B;
    public final List<InterfaceC0626Pk> A0C;
    public final QW A0D;

    public static String A0F(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0E, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 103);
        }
        return new String(copyOfRange);
    }

    public static void A0I() {
        byte[] bArr = {4, 87, 73, 71, 4, 88, 83, 88, 69, 80, 4, 91, 69, 88, 71, 76, 4, 88, 77, 81, 73, 38, 88, 85, 85, 72, 81, 87, 79, 92, 3, 68, 87, 3};
        if (A0F[6].length() != 24) {
            throw new RuntimeException();
        }
        String[] strArr = A0F;
        strArr[5] = "dnbQEbQJ0095hjHrUlDt4BBpkj0Wp";
        strArr[7] = "GI";
        A0E = bArr;
    }

    static {
        A0I();
        A0I = new MD();
        A0G = new OK();
        A0J = new LT();
        A0K = new LO();
        A0H = new MJ();
        A0L = new C0499Kl();
        A0N = new KG();
        A0M = new KJ();
    }

    public RX(YA ya) {
        super(ya);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C8Z<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new ViewOnTouchListenerC0617Pb(this);
        this.A0A = ya;
        if (A0S(ya)) {
            this.A0D = new TextureViewSurfaceTextureListenerC0450Il(ya);
        } else {
            this.A0D = new TextureViewSurfaceTextureListenerC0448Ij(ya);
        }
        A0G();
    }

    public RX(YA ya, AttributeSet attributeSet) {
        super(ya, attributeSet);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C8Z<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new ViewOnTouchListenerC0617Pb(this);
        this.A0A = ya;
        if (A0S(ya)) {
            this.A0D = new TextureViewSurfaceTextureListenerC0450Il(ya, attributeSet);
        } else {
            this.A0D = new TextureViewSurfaceTextureListenerC0448Ij(ya, attributeSet);
        }
        A0G();
    }

    public RX(YA ya, AttributeSet attributeSet, int i) {
        super(ya, attributeSet, i);
        this.A0C = new ArrayList();
        this.A07 = new Handler();
        this.A08 = new Handler();
        this.A0B = new C8Z<>();
        this.A05 = true;
        this.A00 = 200;
        this.A09 = new ViewOnTouchListenerC0617Pb(this);
        this.A0A = ya;
        if (A0S(ya)) {
            this.A0D = new TextureViewSurfaceTextureListenerC0450Il(ya, attributeSet, i);
        } else {
            this.A0D = new TextureViewSurfaceTextureListenerC0448Ij(ya, attributeSet, i);
        }
        A0G();
    }

    public static /* synthetic */ MD A0C() {
        MD md = A0I;
        if (A0F[0].length() != 31) {
            throw new RuntimeException();
        }
        A0F[6] = "XnBln0F0zo0j2g49JSScdoR2";
        return md;
    }

    private void A0G() {
        this.A06 = IP.A0p(this.A0A);
        this.A0A.A0E().A2y();
        this.A0D.setRequestedVolume(1.0f);
        this.A0D.setVideoStateChangeListener(this);
        this.A02 = new C0622Pg(this.A0A, this.A0D);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        addView(this.A02, layoutParams);
        setOnTouchListener(this.A09);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0H() {
        this.A07.postDelayed(new C0669Rb(this), this.A00);
    }

    private final void A0J() {
        for (InterfaceC0626Pk plugin : this.A0C) {
            if (plugin instanceof PX) {
                A0Q((PX) plugin);
            }
            plugin.A9D(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0K(int i) {
        if (IP.A0t(this.A0A)) {
            Toast.makeText(this.A0A, A0F(21, 13, 124) + (i / 1000.0f) + A0F(0, 21, 125), 1).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L(EnumC0451Im enumC0451Im) {
        C0452In c0452In = this.A01;
        if (c0452In == null) {
            return;
        }
        c0452In.A04(enumC0451Im, null);
    }

    private void A0P(InterfaceC0626Pk interfaceC0626Pk) {
        if (interfaceC0626Pk instanceof PX) {
            A0R((PX) interfaceC0626Pk);
        }
        interfaceC0626Pk.AG0(this);
    }

    private void A0Q(PX px) {
        if (px.getParent() == null) {
            if (px instanceof C01666j) {
                this.A02.A00(px);
            } else {
                addView(px);
            }
        }
    }

    private void A0R(PX px) {
        if (px instanceof C01666j) {
            this.A02.A01(px);
        } else {
            LV.A0J(px);
        }
    }

    private boolean A0S(YA ya) {
        return IP.A2O(ya, QJ.A03());
    }

    public final void A0V() {
        this.A0D.setVideoStateChangeListener(null);
        this.A0D.destroy();
    }

    public final void A0W() {
        if (A0i()) {
            return;
        }
        this.A0D.A8G();
    }

    public final void A0X() {
        Iterator<InterfaceC0626Pk> it = this.A0C.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            if (A0F[0].length() != 31) {
                throw new RuntimeException();
            }
            A0F[0] = "GYUlZXdJo7nruMh2UHaMalRUd7rYm0D";
            if (hasNext) {
                A0P(it.next());
            } else {
                this.A0C.clear();
                String[] strArr = A0F;
                if (strArr[4].length() != strArr[3].length()) {
                    String[] strArr2 = A0F;
                    strArr2[4] = "dBG";
                    strArr2[3] = "pEPub8w";
                    return;
                }
                return;
            }
        }
    }

    public final void A0Y(int i) {
        this.A07.removeCallbacksAndMessages(null);
        this.A0D.seekTo(i);
    }

    public final void A0Z(int i) {
        this.A0D.AFo(i);
    }

    public final void A0a(EnumC0620Pe enumC0620Pe) {
        RY ry = new RY(this);
        if (this.A06) {
            LP.A00(ry);
        } else {
            Handler handler = this.A08;
            if (A0F[6].length() != 24) {
                throw new RuntimeException();
            }
            A0F[6] = "kK0l9LoMdPIpLA2D0gOeof4W";
            handler.post(ry);
        }
        this.A0D.AFc(enumC0620Pe.A02());
    }

    public final void A0b(EnumC0625Pj enumC0625Pj, int i) {
        if (this.A03 && this.A0D.getState() == QY.A06) {
            this.A03 = false;
        }
        this.A0D.AFh(enumC0625Pj, i);
    }

    public final void A0c(InterfaceC0626Pk interfaceC0626Pk) {
        this.A0C.add(interfaceC0626Pk);
    }

    public final void A0d(InterfaceC0626Pk interfaceC0626Pk) {
        this.A0C.remove(interfaceC0626Pk);
        A0P(interfaceC0626Pk);
    }

    public final void A0e(boolean z, int i) {
        if (A0i()) {
            return;
        }
        this.A0D.ADk(z, i);
    }

    public final void A0f(boolean z, boolean z2, int i) {
        this.A05 = z2;
        A0e(z, i);
    }

    public final boolean A0g() {
        return this.A0D.A8R();
    }

    public final boolean A0h() {
        return getVolume() == 0.0f;
    }

    public final boolean A0i() {
        return getState() == QY.A05;
    }

    public final boolean A0j() {
        return A0i() && this.A0D.A8z();
    }

    public final boolean A0k() {
        return getState() == QY.A0A;
    }

    public final boolean A0l() {
        return this.A06;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Pc
    public final boolean A8r() {
        return A0S(this.A0A);
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Pc
    public final boolean A8u() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.QZ
    public final void ABQ(final long j, final long j2, final long j3, final float f) {
        if (!IP.A1Y(this.A0A)) {
            return;
        }
        this.A0B.A02(new P8(j, j2, j3, f) { // from class: com.facebook.ads.redexgen.X.73
        });
    }

    @Override // com.facebook.ads.redexgen.X.QZ
    public final void AC1() {
        A0e(true, 4);
    }

    @Override // com.facebook.ads.redexgen.X.QZ
    public final void AC2() {
        A0b(EnumC0625Pj.A04, 6);
    }

    @Override // com.facebook.ads.redexgen.X.QZ
    public final void ACs(int i, int i2) {
        RZ rz = new RZ(this, i, i2);
        if (this.A06) {
            LP.A00(rz);
        } else {
            this.A08.post(rz);
        }
        A0H();
    }

    @Override // com.facebook.ads.redexgen.X.QZ
    public final void ADX(QY qy) {
        int currentPositionInMillis = getCurrentPositionInMillis();
        int currentPositionMS = getDuration();
        C0668Ra c0668Ra = new C0668Ra(this, qy, currentPositionInMillis, currentPositionMS);
        if (this.A06) {
            LP.A00(c0668Ra);
        } else {
            this.A08.post(c0668Ra);
        }
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Pc
    public int getCurrentPositionInMillis() {
        return this.A0D.getCurrentPosition();
    }

    public int getDuration() {
        return this.A0D.getDuration();
    }

    public C8Z<AbstractC02028a, C8Y> getEventBus() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Pc
    public long getInitialBufferTime() {
        return this.A0D.getInitialBufferTime();
    }

    public QY getState() {
        return this.A0D.getState();
    }

    public Handler getStateHandler() {
        return this.A08;
    }

    public TextureView getTextureView() {
        return (TextureView) this.A0D;
    }

    public int getVideoHeight() {
        return this.A0D.getVideoHeight();
    }

    public View getVideoImplView() {
        return this.A0D.getView();
    }

    public int getVideoProgressReportIntervalMs() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Pc
    public EnumC0625Pj getVideoStartReason() {
        return this.A0D.getStartReason();
    }

    public View getVideoView() {
        return this.A02;
    }

    public int getVideoWidth() {
        return this.A0D.getVideoWidth();
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0618Pc
    public float getVolume() {
        return this.A0D.getVolume();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        this.A0B.A02(A0M);
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.A0B.A02(A0N);
        super.onDetachedFromWindow();
    }

    public void setControlsAnchorView(View view) {
        QW qw = this.A0D;
        if (qw != null) {
            qw.setControlsAnchorView(view);
        }
    }

    public void setFunnelLoggingHandler(C0452In c0452In) {
        this.A01 = c0452In;
    }

    public void setIsFullScreen(boolean z) {
        this.A04 = z;
        this.A0D.setFullScreen(z);
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
    }

    public void setVideoMPD(String str) {
        this.A0D.setVideoMPD(str);
    }

    public void setVideoProgressReportIntervalMs(int i) {
        this.A00 = i;
    }

    public void setVideoURI(Uri uri) {
        if (uri == null) {
            A0X();
        } else {
            A0J();
            this.A0D.setup(uri);
        }
        this.A03 = false;
    }

    public void setVideoURI(String str) {
        this.A0A.A0E().A35(str);
        setVideoURI(str != null ? C0490Kc.A00(str) : null);
    }

    public void setVolume(float f) {
        if (f == 1.0f) {
            A0L(EnumC0451Im.A0f);
            this.A0A.A0E().A39();
        } else {
            A0L(EnumC0451Im.A0e);
            this.A0A.A0E().A38();
        }
        this.A0D.setRequestedVolume(f);
        C8Z<AbstractC02028a, C8Y> eventBus = getEventBus();
        if (A0F[2].length() == 19) {
            throw new RuntimeException();
        }
        A0F[2] = "etD2zaPMct9y2wbR2YehsJmmTem";
        eventBus.A02(A0L);
    }
}
