package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Il, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class TextureViewSurfaceTextureListenerC0450Il extends TextureView implements TextureView.SurfaceTextureListener, QG, QW, QI {
    public static byte[] A0N;
    public static String[] A0O = {"5i34yksohRV8hSvEB2dTOBGqhO", "V2RNkeamXobpzSRVkM4sjlG", "1HR", "8SLqGCa2wxiVkGjIaPVK9LXerY", "SSmTkZgpl4jZsKBndOsNgmbhAq5FKejN", "hgMiihLf1lx1lIiVFZ8jC", "euSTtDnbG06q2RqThlQcyR1Es6oMHQDw", "iHXqYQoKvaPWKvo"};
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05;
    public Uri A06;
    public Surface A07;
    public View A08;
    public MediaController A09;
    public YA A0A;
    public EnumC0625Pj A0B;
    public QJ A0C;
    public QY A0D;
    public QY A0E;
    public QZ A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 68);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0N = new byte[]{86, 126, 126, 118, 125, 116, 49, 112, 125, 102, 112, 104, 98, 49, 101, 121, 99, 126, 102, 49, 112, Byte.MAX_VALUE, 49, 116, 105, 114, 116, 97, 101, 120, 126, Byte.MAX_VALUE, 49, 102, 120, 101, 121, 49, 98, 116, 101, 83, 112, 114, 122, 118, 99, 126, 100, Byte.MAX_VALUE, 117, 85, 99, 112, 102, 112, 115, 125, 116, 49, 126, Byte.MAX_VALUE, 49, 95, 126, 100, 118, 112, 101, 49, 112, 115, 126, 103, 116, 63, 49, 98, 126, 49, 102, 116, 49, 98, 120, 125, 116, Byte.MAX_VALUE, 101, 125, 104, 49, 120, 118, Byte.MAX_VALUE, 126, 99, 116, 49, 120, 101, 63, 76, 100, 100, 108, 103, 110, 43, 106, 103, 124, 106, 114, 120, 43, Byte.MAX_VALUE, 99, 121, 100, 124, 43, 106, 101, 43, 110, 115, 104, 110, 123, Byte.MAX_VALUE, 98, 100, 101, 43, 124, 98, Byte.MAX_VALUE, 99, 43, 120, 110, Byte.MAX_VALUE, 77, 100, 121, 110, 108, 121, 100, 126, 101, 111, 43, 100, 101, 43, 69, 100, 126, 108, 106, Byte.MAX_VALUE, 43, 106, 105, 100, 125, 110, 37, 43, 120, 100, 43, 124, 110, 43, 120, 98, 103, 110, 101, Byte.MAX_VALUE, 103, 114, 43, 98, 108, 101, 100, 121, 110, 43, 98, Byte.MAX_VALUE, 37, 33, 30, 19, 18, 24, 87, 4, 3, 22, 3, 18, 87, 20, 31, 22, 25, 16, 18, 19, 87, 3, 24, 87, 95, 93, 86, 93, 74, 81, 91};
        String[] strArr = A0O;
        if (strArr[4].charAt(4) == strArr[6].charAt(4)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "4Rjqxy3w03hT2rk3wOaPN94qCv";
        strArr2[0] = "J56YrdEaTg6GnpCj3tljjm9xxp";
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 12 out of bounds for length 12
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.startVar(DebugInfoParser.java:203)
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:125)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (IP.A1Y(this.A0A) && this.A0D != QY.A08) {
            long currentPosition = getCurrentPosition();
            long currentPosition2 = getCurrentPosition();
            long currentTimeMillis = System.currentTimeMillis();
            float volume = getVolume();
            QZ qz = this.A0F;
            if (qz != null) {
                qz.ABQ(currentPosition, currentPosition2, currentTimeMillis, volume);
            }
        }
    }

    static {
        A07();
        A0P = TextureViewSurfaceTextureListenerC0450Il.class.getSimpleName();
    }

    public TextureViewSurfaceTextureListenerC0450Il(YA ya) {
        super(ya);
        this.A0D = QY.A04;
        this.A0E = QY.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC0625Pj.A03;
        this.A0K = false;
        this.A0A = ya;
    }

    public TextureViewSurfaceTextureListenerC0450Il(YA ya, AttributeSet attributeSet) {
        super(ya, attributeSet);
        this.A0D = QY.A04;
        this.A0E = QY.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC0625Pj.A03;
        this.A0K = false;
        this.A0A = ya;
    }

    public TextureViewSurfaceTextureListenerC0450Il(YA ya, AttributeSet attributeSet, int i) {
        super(ya, attributeSet, i);
        this.A0D = QY.A04;
        this.A0E = QY.A04;
        this.A0L = false;
        this.A0M = false;
        this.A0J = false;
        this.A03 = 0;
        this.A02 = 0;
        this.A00 = 1.0f;
        this.A01 = -1;
        this.A0I = false;
        this.A0H = false;
        this.A0B = EnumC0625Pj.A03;
        this.A0K = false;
        this.A0A = ya;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0081, code lost:            if (r4 != null) goto L20;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0087, code lost:            if (r4.length() == 0) goto L24;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008b, code lost:            if (r5.A0K == false) goto L25;     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:            r5.A0C.A0F(r5.A0A.A01(), r5.A06);     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:            if (r4 != null) goto L20;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A04() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.YA r1 = r5.A0A
            com.facebook.ads.redexgen.X.QJ r0 = new com.facebook.ads.redexgen.X.QJ
            r0.<init>(r1)
            r5.A0C = r0
            r0.A0H(r5)
            com.facebook.ads.redexgen.X.QJ r0 = r5.A0C
            r0.A0G(r5)
            com.facebook.ads.redexgen.X.QJ r0 = r5.A0C
            r3 = 0
            r0.A0I(r3)
            boolean r0 = r5.A0J
            if (r0 == 0) goto L65
            boolean r0 = r5.A0I
            if (r0 != 0) goto L65
            com.facebook.ads.redexgen.X.YA r0 = r5.A0A
            android.app.Activity r4 = r0.A0D()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.TextureViewSurfaceTextureListenerC0450Il.A0O
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 21
            if (r1 == r0) goto L38
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L38:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureViewSurfaceTextureListenerC0450Il.A0O
            java.lang.String r1 = "kOzpobq3cn2ENPvO1dz11rE9gYrdsM2t"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "XeC6T5eSgweGxN3AGx0qK1AhpVQau6BW"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto Lbc
            android.widget.MediaController r1 = new android.widget.MediaController
            r1.<init>(r4)
            r5.A09 = r1
            android.view.View r0 = r5.A08
            if (r0 != 0) goto L52
            r0 = r5
        L52:
            r1.setAnchorView(r0)
            android.widget.MediaController r1 = r5.A09
            com.facebook.ads.redexgen.X.QP r0 = new com.facebook.ads.redexgen.X.QP
            r0.<init>(r5)
            r1.setMediaPlayer(r0)
            android.widget.MediaController r1 = r5.A09
            r0 = 1
            r1.setEnabled(r0)
        L65:
            java.lang.String r4 = r5.A0G
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureViewSurfaceTextureListenerC0450Il.A0O
            r0 = 4
            r1 = r2[r0]
            r0 = 6
            r2 = r2[r0]
            r0 = 4
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lad
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureViewSurfaceTextureListenerC0450Il.A0O
            java.lang.String r1 = "7OzxCvlMe7OewOex"
            r0 = 1
            r2[r0] = r1
            if (r4 == 0) goto L8d
        L83:
            int r0 = r4.length()
            if (r0 == 0) goto L8d
            boolean r0 = r5.A0K
            if (r0 == 0) goto L9a
        L8d:
            com.facebook.ads.redexgen.X.QJ r2 = r5.A0C
            com.facebook.ads.redexgen.X.YA r0 = r5.A0A
            com.facebook.ads.redexgen.X.Y9 r1 = r0.A01()
            android.net.Uri r0 = r5.A06
            r2.A0F(r1, r0)
        L9a:
            com.facebook.ads.redexgen.X.QY r0 = com.facebook.ads.redexgen.X.QY.A08
            r5.setVideoState(r0)
            boolean r0 = r5.isAvailable()
            if (r0 == 0) goto Lac
            android.graphics.SurfaceTexture r0 = r5.getSurfaceTexture()
            r5.onSurfaceTextureAvailable(r0, r3, r3)
        Lac:
            return
        Lad:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureViewSurfaceTextureListenerC0450Il.A0O
            java.lang.String r1 = "NXAVCVHzJxAz58YH1UEgH4PHy83Kp8aQ"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "f1ODdwAOeVqSGvJpvEMDUKedn4FgojKu"
            r0 = 6
            r2[r0] = r1
            if (r4 == 0) goto L8d
            goto L83
        Lbc:
            r0 = 0
            r5.A09 = r0
            goto L65
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.TextureViewSurfaceTextureListenerC0450Il.A04():void");
    }

    private void A05() {
        QJ qj = this.A0C;
        if (qj == null) {
            return;
        }
        QH A08 = qj.A08();
        String[] strArr = A0O;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[3] = "yniwio37QFCiL85s5GWvJngxgc";
        strArr2[0] = "95HbvmBBNGyB2bovEph22CE4vZ";
        if (A08 != null) {
            A08(A08.A01, A08.A00);
        }
    }

    private void A06() {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
        }
        QJ qj = this.A0C;
        if (qj != null) {
            qj.A09();
            if (A0O[5].length() != 21) {
                throw new RuntimeException();
            }
            String[] strArr = A0O;
            strArr[3] = "he0jjWxzFB8qDestWT3k7cDZmQ";
            strArr[0] = "YQusGxI3ZRGEiRLtvLIlZ3cCdg";
            this.A0C = null;
        }
        this.A09 = null;
        this.A0M = false;
        setVideoState(QY.A04);
    }

    private void A08(int i, int i2) {
        if (i != this.A03 || i2 != this.A02) {
            this.A03 = i;
            this.A02 = i2;
            if (i != 0 && i2 != 0) {
                requestLayout();
            }
        }
    }

    public static boolean A09() {
        return QJ.A03();
    }

    public final /* synthetic */ void A0A() {
        Activity activity = this.A0A.A0D();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A8G();
        if (A0O[1].length() == 30) {
            throw new RuntimeException();
        }
        String[] strArr = A0O;
        strArr[3] = "ibP83lPIHp18E6DzSXuO582r7E";
        strArr[0] = "bqS8XhAkEDMP7WptTe4caNAUJi";
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void A8G() {
        if (!this.A0H) {
            ADk(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final boolean A8R() {
        QJ qj = this.A0C;
        return qj != null && qj.A0K();
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final boolean A8S() {
        return this.A0M;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final boolean A8z() {
        return this.A0L;
    }

    @Override // com.facebook.ads.redexgen.X.QG
    public final void ACR(String str, Exception exc) {
        this.A0A.A0E().AA7(str);
        this.A0A.A0E().A33(1);
        setVideoState(QY.A03);
        this.A0A.A07().A9M(A03(219, 7, 124), C01997x.A1N, new C02007y(exc));
    }

    @Override // com.facebook.ads.redexgen.X.QG
    public final void ACS(boolean z, int i) {
        if (this.A0C == null) {
            return;
        }
        switch (i) {
            case 1:
                setVideoState(QY.A04);
                return;
            case 2:
                A05();
                if (this.A01 < 0) {
                    return;
                }
                int i2 = this.A01;
                this.A01 = -1;
                QZ qz = this.A0F;
                String[] strArr = A0O;
                String str = strArr[2];
                String str2 = strArr[7];
                int length = str.length();
                int seekFrom = str2.length();
                if (length == seekFrom) {
                    throw new RuntimeException();
                }
                A0O[1] = "rrPXv2FoHSgfFGcrQjG2fRVM";
                if (qz == null) {
                    return;
                }
                int seekFrom2 = getCurrentPosition();
                qz.ACs(i2, seekFrom2);
                return;
            case 3:
                A05();
                this.A04 = System.currentTimeMillis();
                setRequestedVolume(this.A00);
                long j = this.A05;
                if (j > 0 && j < this.A0C.A07()) {
                    this.A0C.A0D(this.A05);
                    this.A05 = 0L;
                }
                if (this.A0C.A06() != 0 && !z && this.A0M) {
                    setVideoState(QY.A05);
                    return;
                }
                if (z || this.A0D == QY.A06) {
                    return;
                }
                setVideoState(QY.A07);
                if (this.A0E != QY.A0A) {
                    return;
                }
                AFh(this.A0B, 8);
                this.A0E = QY.A04;
                return;
            case 4:
                if (z) {
                    setVideoState(QY.A06);
                }
                QJ qj = this.A0C;
                if (qj != null) {
                    qj.A0I(false);
                    if (!z) {
                        this.A0C.A0A();
                    }
                }
                this.A0M = false;
                return;
            default:
                return;
        }
    }

    @Override // com.facebook.ads.redexgen.X.QI
    public final void ADV(int i, int i2, int i3, float f) {
        A08(i, i2);
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void ADk(boolean z, int i) {
        this.A0A.A0E().A2z(i);
        this.A0E = QY.A05;
        this.A0L = z;
        QJ qj = this.A0C;
        if (qj != null) {
            qj.A0I(false);
        } else {
            setVideoState(QY.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void AFc(int i) {
        this.A0A.A0E().AA8(i);
        setVideoState(QY.A09);
        AFo(5);
        this.A05 = 0L;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void AFh(EnumC0625Pj enumC0625Pj, int i) {
        this.A0A.A0E().A3A(i);
        this.A0L = false;
        this.A0E = QY.A0A;
        this.A0B = enumC0625Pj;
        if (this.A0C == null) {
            setup(this.A06);
        } else {
            if (this.A0D != QY.A07 && this.A0D != QY.A05 && this.A0D != QY.A06) {
                return;
            }
            this.A0C.A0I(true);
            setVideoState(QY.A0A);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void AFo(int i) {
        this.A0A.A0E().A3C(i);
        this.A0E = QY.A04;
        QJ qj = this.A0C;
        if (qj != null) {
            qj.A0B();
            this.A0C.A09();
            this.A0C = null;
        }
        setVideoState(QY.A04);
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void destroy() {
        A06();
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public int getCurrentPosition() {
        QJ qj = this.A0C;
        if (qj != null) {
            return (int) qj.A06();
        }
        return 0;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public int getDuration() {
        QJ qj = this.A0C;
        if (qj == null) {
            return 0;
        }
        return (int) qj.A07();
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public long getInitialBufferTime() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public EnumC0625Pj getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public QY getState() {
        return this.A0D;
    }

    public QY getTargetState() {
        return this.A0E;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public int getVideoHeight() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public int getVideoWidth() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (IP.A29(getContext()) && !isHardwareAccelerated()) {
            setVideoState(QY.A03);
            AFo(8);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
        }
        Surface surface2 = new Surface(surfaceTexture);
        this.A07 = surface2;
        QJ qj = this.A0C;
        if (qj == null) {
            return;
        }
        qj.A0E(surface2);
        if (this.A0D == QY.A05 && !this.A0L) {
            AFh(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.A07;
        if (surface != null) {
            surface.release();
            this.A07 = null;
            QJ qj = this.A0C;
            if (qj != null) {
                qj.A0E(null);
            }
        }
        if (this.A0D == QY.A05) {
            return true;
        }
        if (A0O[5].length() != 21) {
            throw new RuntimeException();
        }
        A0O[5] = "TScQzo9LVHiM3saFvXTgi";
        ADk(false, 5);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A0C == null) {
            return;
        }
        MediaController mediaController = this.A09;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0D != QY.A05) {
                if (IP.A1G(this.A0A) && Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.QO
                        @Override // java.lang.Runnable
                        public final void run() {
                            TextureViewSurfaceTextureListenerC0450Il.this.A0A();
                        }
                    }, 1000L);
                    return;
                } else {
                    A8G();
                    return;
                }
            }
            return;
        }
        if (this.A0D != QY.A05 || this.A0L) {
            return;
        }
        AFh(this.A0B, 9);
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void seekTo(int i) {
        if (this.A0C != null) {
            this.A01 = getCurrentPosition();
            this.A0C.A0D(i);
            return;
        }
        long j = i;
        String[] strArr = A0O;
        if (strArr[2].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        A0O[5] = "kfjJwAtkK1UY2s6fcoM3d";
        this.A05 = j;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        boolean isDebugBuild = AdInternalSettings.isDebugBuild();
        if (A0O[5].length() != 21) {
            throw new RuntimeException();
        }
        A0O[1] = "HF5JdwiOlRNKOfaOH";
        if (!isDebugBuild) {
            return;
        }
        Log.w(A0P, A03(0, 102, 85));
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0H = z;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setControlsAnchorView(View view) {
        this.A08 = view;
        view.setOnTouchListener(new QR(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
            return;
        }
        if (!AdInternalSettings.isDebugBuild()) {
            return;
        }
        String str = A0P;
        String[] strArr = A0O;
        if (strArr[3].length() != strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0O;
        strArr2[4] = "adR4uJi1AjYNmamYU7fKdN8LPQzpuqJY";
        strArr2[6] = "LCKmfGi2Ka9VnYBnqFwdGZK0MZJmec2m";
        Log.w(str, A03(102, 94, 79));
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setFullScreen(boolean z) {
        this.A0J = z;
        if (z && !this.A0I) {
            setOnTouchListener(new QQ(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A0C != null && this.A0D != QY.A08 && this.A0D != QY.A04) {
            this.A0C.A0C(f);
        }
    }

    public void setTestMode(boolean z) {
        this.A0K = z;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setVideoMPD(String str) {
        this.A0G = str;
    }

    private void setVideoState(QY qy) {
        if (qy != this.A0D) {
            if (this.A0A.A04().A8o()) {
                String str = A03(196, 23, 51) + qy;
            }
            this.A0D = qy;
            if (qy == QY.A0A) {
                this.A0M = true;
            }
            QZ qz = this.A0F;
            if (qz != null) {
                qz.ADX(qy);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setVideoStateChangeListener(QZ qz) {
        this.A0F = qz;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setup(Uri uri) {
        this.A0A.A0E().A32();
        if (this.A0C != null) {
            A06();
        }
        this.A06 = uri;
        setSurfaceTextureListener(this);
        A04();
    }
}
