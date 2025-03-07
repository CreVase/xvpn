package com.facebook.ads.redexgen.X;

import android.app.Activity;
import android.content.res.AssetFileDescriptor;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import com.facebook.ads.internal.settings.AdInternalSettings;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Ij, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class TextureViewSurfaceTextureListenerC0448Ij extends TextureView implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, MediaPlayer.OnSeekCompleteListener, TextureView.SurfaceTextureListener, QW {
    public static byte[] A0N;
    public static String[] A0O = {"w6W1Pn4pGSy1veXw7fNic4Q20vJelJ2", "acNB2lhq8cVPZLtYghlcj8euurSBcqdx", "I2BPPFoGG3lXsTKKPy2FKKasdsM", "uMMu8699SI696vicAGdUyhB1Kjcnsg5D", "S7aPtd9QGtmzyQ9VrNW20IwmaDF5p1Ml", "zS648UlhjTBJXulz7NmFsyAIwaw2iCpI", "ZyXsHo9oibpczWLkt42IpHWLTZevRgPI", "euMEykkwaXnS"};
    public static final String A0P;
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public MediaPlayer A06;
    public Uri A07;
    public Surface A08;
    public View A09;
    public MediaController A0A;
    public EnumC0625Pj A0B;
    public QY A0C;
    public QY A0D;
    public QZ A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public final long A0K;
    public final MediaController.MediaPlayerControl A0L;
    public final YA A0M;

    public static String A03(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0N, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 114);
        }
        return new String(copyOfRange);
    }

    public static void A04() {
        A0N = new byte[]{89, 87, 91, 89, 30, 3, 15, 9, 26, 89, 91, 65, 91, 89, 57, 102, 105, 75, 68, 68, 69, 94, 10, 90, 88, 79, 90, 75, 88, 79, 10, 71, 79, 78, 67, 75, 10, 90, 70, 75, 83, 79, 88, 10, 93, 67, 94, 66, 10, 121, 95, 88, 76, 75, 73, 79, 126, 79, 82, 94, 95, 88, 79, 16, 10, 45, 1, 27, 2, 10, 0, 73, 26, 78, 28, 11, 26, 28, 7, 11, 24, 11, 78, 24, 7, 10, 11, 1, 78, 7, 0, 8, 1, 28, 3, 15, 26, 7, 1, 0, 93, 122, 114, 119, 126, Byte.MAX_VALUE, 59, 111, 116, 59, 116, 107, 126, 117, 59, 122, 104, 104, 126, 111, 104, 15, 39, 39, 47, 36, 45, 104, 41, 36, 63, 41, 49, 59, 104, 60, 32, 58, 39, 63, 104, 41, 38, 104, 45, 48, 43, 45, 56, 60, 33, 39, 38, 104, 63, 33, 60, 32, 104, 59, 45, 60, 10, 41, 43, 35, 47, 58, 39, 61, 38, 44, 12, 58, 41, 63, 41, 42, 36, 45, 104, 39, 38, 104, 6, 39, 61, 47, 41, 60, 104, 41, 42, 39, 62, 45, 102, 104, 59, 39, 104, 63, 45, 104, 59, 33, 36, 45, 38, 60, 36, 49, 104, 33, 47, 38, 39, 58, 45, 104, 33, 60, 102, 50, 26, 26, 18, 25, 16, 85, 20, 25, 2, 20, 12, 6, 85, 1, 29, 7, 26, 2, 85, 20, 27, 85, 16, 13, 22, 16, 5, 1, 28, 26, 27, 85, 2, 28, 1, 29, 85, 6, 16, 1, 51, 26, 7, 16, 18, 7, 26, 0, 27, 17, 85, 26, 27, 85, 59, 26, 0, 18, 20, 1, 85, 20, 23, 26, 3, 16, 91, 85, 6, 26, 85, 2, 16, 85, 6, 28, 25, 16, 27, 1, 25, 12, 85, 28, 18, 27, 26, 7, 16, 85, 28, 1, 91, 2, 57, 54, 53, 59, 50, 119, 35, 56, 119, 52, 59, 56, 36, 50, 22, 49, 42, 99, 48, 43, 44, 54, 47, 39, 99, 45, 44, 55, 99, 33, 38, 99, 38, 46, 51, 55, 58, 109, 53, 10, 7, 6, 12, 67, 16, 23, 2, 23, 6, 67, 0, 11, 2, 13, 4, 6, 7, 67, 23, 12, 67, 97, 115, 115, 101, 116, 83, 79, 66, 90, 70, 81, 126, 39, 114, 109, 100, 113, 39, 37, 63, 37, 39};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException: Index 14 out of bounds for length 13
    	at jadx.plugins.input.dex.sections.debuginfo.DebugInfoParser.process(DebugInfoParser.java:147)
    	at jadx.plugins.input.dex.sections.DexCodeReader.getDebugInfo(DexCodeReader.java:118)
    	at jadx.core.dex.nodes.MethodNode.getDebugInfo(MethodNode.java:626)
    	at jadx.core.dex.visitors.debuginfo.DebugInfoAttachVisitor.visit(DebugInfoAttachVisitor.java:39)
     */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        if (IP.A1Y(this.A0M) && this.A06 != null) {
            boolean A07 = A07();
            if (A0O[1].charAt(7) != 'q') {
                throw new RuntimeException();
            }
            A0O[5] = "zsAx7U2aKSd2GPuux6v5Um4uWviEPJCj";
            if (A07) {
                long currentPosition = getCurrentPosition();
                long currentPosition2 = getCurrentPosition();
                long currentTimeMillis = System.currentTimeMillis();
                float volume = getVolume();
                QZ qz = this.A0E;
                if (qz != null) {
                    qz.ABQ(currentPosition, currentPosition2, currentTimeMillis, volume);
                }
            }
        }
    }

    static {
        A04();
        A0P = TextureViewSurfaceTextureListenerC0448Ij.class.getSimpleName();
    }

    public TextureViewSurfaceTextureListenerC0448Ij(YA ya) {
        super(ya);
        this.A0C = QY.A04;
        this.A0D = QY.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC0625Pj.A03;
        this.A0L = new QT(this);
        this.A0M = ya;
    }

    public TextureViewSurfaceTextureListenerC0448Ij(YA ya, AttributeSet attributeSet) {
        super(ya, attributeSet);
        this.A0C = QY.A04;
        this.A0D = QY.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC0625Pj.A03;
        this.A0L = new QT(this);
        this.A0M = ya;
    }

    public TextureViewSurfaceTextureListenerC0448Ij(YA ya, AttributeSet attributeSet, int i) {
        super(ya, attributeSet, i);
        this.A0C = QY.A04;
        this.A0D = QY.A04;
        this.A0I = false;
        this.A03 = 0;
        this.A05 = 0;
        this.A04 = 0;
        this.A00 = 1.0f;
        this.A0H = false;
        this.A01 = 3;
        this.A0F = false;
        this.A0J = false;
        this.A02 = 0;
        this.A0G = false;
        this.A0B = EnumC0625Pj.A03;
        this.A0L = new QT(this);
        this.A0M = ya;
    }

    private final void A05(MediaPlayer mediaPlayer, Uri uri) {
        String uriPath;
        String A03 = A03(317, 15, 37);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            try {
                try {
                    uriPath = uri.getPath();
                } catch (IOException | SecurityException e) {
                    Log.w(A0P, A03(100, 21, 105), e);
                    setVideoState(QY.A03);
                    this.A0M.A0E().A33(2);
                    if (0 != 0) {
                        assetFileDescriptor.close();
                    } else {
                        return;
                    }
                }
                if (!TextUtils.isEmpty(uriPath)) {
                    AssetFileDescriptor openFd = getContext().getAssets().openFd(uriPath.substring(1));
                    mediaPlayer.setDataSource(openFd.getFileDescriptor(), openFd.getStartOffset(), openFd.getLength());
                    if (openFd != null) {
                        openFd.close();
                        return;
                    }
                    return;
                }
                throw new IOException(A03(332, 24, 49));
            } catch (IOException e2) {
                Log.w(A0P, A03, e2);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException e3) {
                    Log.w(A0P, A03, e3);
                }
            }
            throw th;
        }
    }

    private boolean A06() {
        return (this.A0C == QY.A08 || this.A0C == QY.A07) ? false : true;
    }

    private boolean A07() {
        return this.A0C == QY.A07 || this.A0C == QY.A0A || this.A0C == QY.A05 || this.A0C == QY.A06;
    }

    private boolean A08() {
        return (this.A0C == QY.A08 || this.A0C == QY.A07) ? false : true;
    }

    private boolean A09() {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.reset();
            return true;
        } catch (IllegalStateException e) {
            this.A0M.A07().A9M(A03(384, 6, 81), C01997x.A2G, new C02007y(e));
            return false;
        }
    }

    private boolean A0A(Surface surface) {
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer == null) {
            return false;
        }
        try {
            mediaPlayer.setSurface(surface);
            return true;
        } catch (IllegalStateException e) {
            this.A0M.A07().A9M(A03(384, 6, 81), C01997x.A2H, new C02007y(e));
            return false;
        }
    }

    public final /* synthetic */ void A0C() {
        Activity activity = this.A0M.A0D();
        if (activity != null && activity.isInMultiWindowMode()) {
            return;
        }
        A8G();
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void A8G() {
        if (!this.A0F) {
            ADk(false, 3);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final boolean A8R() {
        if (this.A06 == null || Build.VERSION.SDK_INT < 16) {
            return false;
        }
        try {
            for (MediaPlayer.TrackInfo trackInfo : this.A06.getTrackInfo()) {
                int trackType = trackInfo.getTrackType();
                String[] strArr = A0O;
                if (strArr[3].charAt(29) != strArr[6].charAt(29)) {
                    throw new RuntimeException();
                }
                A0O[5] = "iSqF26gJBktCMb0RObgKl91oEThpz7Z0";
                if (trackType == 2) {
                    return true;
                }
            }
            return false;
        } catch (RuntimeException e) {
            Log.e(A0P, A03(65, 35, 28), e);
            return true;
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final boolean A8S() {
        return this.A0J;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final boolean A8z() {
        return this.A0I;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void ADk(boolean z, int i) {
        this.A0M.A0E().A2z(i);
        this.A0D = QY.A05;
        if (this.A06 != null) {
            if (!A06()) {
                return;
            }
            this.A0I = z;
            this.A06.pause();
            if (this.A0C != QY.A06) {
                setVideoState(QY.A05);
                return;
            }
            return;
        }
        setVideoState(QY.A04);
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void AFc(int i) {
        this.A0M.A0E().AA8(i);
        setVideoState(QY.A09);
        AFo(5);
        this.A03 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:            if (r5.A0C != com.facebook.ads.redexgen.X.QY.A06) goto L17;     */
    @Override // com.facebook.ads.redexgen.X.QW
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AFh(com.facebook.ads.redexgen.X.EnumC0625Pj r6, int r7) {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.YA r0 = r5.A0M
            com.facebook.ads.redexgen.X.0S r0 = r0.A0E()
            r0.A3A(r7)
            r3 = 0
            r5.A0I = r3
            com.facebook.ads.redexgen.X.QY r0 = com.facebook.ads.redexgen.X.QY.A0A
            r5.A0D = r0
            r5.A0B = r6
            com.facebook.ads.redexgen.X.QY r1 = r5.A0C
            com.facebook.ads.redexgen.X.QY r0 = com.facebook.ads.redexgen.X.QY.A0A
            if (r1 == r0) goto L43
            com.facebook.ads.redexgen.X.QY r1 = r5.A0C
            com.facebook.ads.redexgen.X.QY r0 = com.facebook.ads.redexgen.X.QY.A07
            if (r1 == r0) goto L43
            com.facebook.ads.redexgen.X.QY r4 = r5.A0C
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.TextureViewSurfaceTextureListenerC0448Ij.A0O
            r0 = 7
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 4
            if (r1 == r0) goto L96
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureViewSurfaceTextureListenerC0448Ij.A0O
            java.lang.String r1 = "NTKGPTGyq7PSuZ6pDxSrkOD3BAS3oRMw"
            r0 = 4
            r2[r0] = r1
            com.facebook.ads.redexgen.X.QY r0 = com.facebook.ads.redexgen.X.QY.A04
            if (r4 == r0) goto L43
            com.facebook.ads.redexgen.X.QY r1 = r5.A0C
            com.facebook.ads.redexgen.X.QY r0 = com.facebook.ads.redexgen.X.QY.A05
            if (r1 == r0) goto L43
            com.facebook.ads.redexgen.X.QY r1 = r5.A0C
            com.facebook.ads.redexgen.X.QY r0 = com.facebook.ads.redexgen.X.QY.A06
            if (r1 != r0) goto L4c
        L43:
            android.media.MediaPlayer r1 = r5.A06
            if (r1 != 0) goto L7a
            android.net.Uri r0 = r5.A07
            r5.setup(r0)
        L4c:
            boolean r0 = r5.isAvailable()
            if (r0 == 0) goto L6e
            android.graphics.SurfaceTexture r4 = r5.getSurfaceTexture()
            java.lang.String[] r1 = com.facebook.ads.redexgen.X.TextureViewSurfaceTextureListenerC0448Ij.A0O
            r0 = 1
            r1 = r1[r0]
            r0 = 7
            char r1 = r1.charAt(r0)
            r0 = 113(0x71, float:1.58E-43)
            if (r1 == r0) goto L6f
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureViewSurfaceTextureListenerC0448Ij.A0O
            java.lang.String r1 = "Wn6W9Nu3dNfA4pP49CdphRQGwehyl3Rd"
            r0 = 4
            r2[r0] = r1
            r5.onSurfaceTextureAvailable(r4, r3, r3)
        L6e:
            return
        L6f:
            java.lang.String[] r2 = com.facebook.ads.redexgen.X.TextureViewSurfaceTextureListenerC0448Ij.A0O
            java.lang.String r1 = "pXleF17jKjib"
            r0 = 7
            r2[r0] = r1
            r5.onSurfaceTextureAvailable(r4, r3, r3)
            goto L6e
        L7a:
            int r0 = r5.A03
            if (r0 <= 0) goto L81
            r1.seekTo(r0)
        L81:
            android.media.MediaPlayer r0 = r5.A06
            r0.start()
            com.facebook.ads.redexgen.X.QY r1 = r5.A0C
            com.facebook.ads.redexgen.X.QY r0 = com.facebook.ads.redexgen.X.QY.A07
            if (r1 != r0) goto L90
            boolean r0 = r5.A0J
            if (r0 == 0) goto L4c
        L90:
            com.facebook.ads.redexgen.X.QY r0 = com.facebook.ads.redexgen.X.QY.A0A
            r5.setVideoState(r0)
            goto L4c
        L96:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.X.TextureViewSurfaceTextureListenerC0448Ij.AFh(com.facebook.ads.redexgen.X.Pj, int):void");
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void AFo(int i) {
        this.A0M.A0E().A3C(i);
        this.A0D = QY.A04;
        MediaPlayer mediaPlayer = this.A06;
        if (mediaPlayer != null) {
            int currentPosition = mediaPlayer.getCurrentPosition();
            if (currentPosition > 0) {
                this.A03 = currentPosition;
            }
            this.A06.stop();
            if (A0O[4].charAt(14) == '3') {
                throw new RuntimeException();
            }
            A0O[5] = "KulxFUFqA4xnUTvaQLfyg7cstmOjzycv";
            A09();
            this.A06.release();
            this.A06 = null;
            MediaController mediaController = this.A0A;
            if (mediaController != null) {
                mediaController.hide();
                this.A0A.setEnabled(false);
            }
        }
        setVideoState(QY.A04);
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void destroy() {
        if (this.A06 != null) {
            A0A(null);
            this.A06.setOnBufferingUpdateListener(null);
            this.A06.setOnCompletionListener(null);
            this.A06.setOnErrorListener(null);
            this.A06.setOnInfoListener(null);
            this.A06.setOnPreparedListener(null);
            this.A06.setOnVideoSizeChangedListener(null);
            this.A06.setOnSeekCompleteListener(null);
            A09();
            this.A06 = null;
            setVideoState(QY.A04);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public int getCurrentPosition() {
        if (this.A06 == null || !A07()) {
            return 0;
        }
        return this.A06.getCurrentPosition();
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public int getDuration() {
        if (this.A06 == null) {
            return 0;
        }
        boolean A07 = A07();
        String[] strArr = A0O;
        if (strArr[3].charAt(29) != strArr[6].charAt(29)) {
            throw new RuntimeException();
        }
        A0O[1] = "tqb6wmVqQGZxPylUtz2fkCIx7Bf2WilJ";
        if (!A07) {
            return 0;
        }
        return this.A06.getDuration();
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public long getInitialBufferTime() {
        return this.A0K;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public EnumC0625Pj getStartReason() {
        return this.A0B;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public QY getState() {
        return this.A0C;
    }

    public QY getTargetState() {
        return this.A0D;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public int getVideoHeight() {
        return this.A04;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public int getVideoWidth() {
        return this.A05;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public View getView() {
        return this;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public float getVolume() {
        return this.A00;
    }

    @Override // android.view.View
    public final boolean isHardwareAccelerated() {
        return super.isHardwareAccelerated();
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isHardwareAccelerated()) {
            setVideoState(QY.A03);
            this.A0M.A0E().A33(5);
            AFo(8);
        }
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        MediaPlayer mediaPlayer2 = this.A06;
        if (mediaPlayer2 != null) {
            mediaPlayer2.pause();
        }
        setVideoState(QY.A06);
        seekTo(0);
        this.A03 = 0;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        this.A0M.A0E().AA7(A03(390, 11, 119) + i + A03(0, 14, 9) + i2 + A03(14, 2, 105));
        if (this.A01 > 0 && getState() == QY.A0A) {
            this.A01--;
            AFo(6);
            AFh(this.A0B, 10);
        } else {
            setVideoState(QY.A03);
            this.A0M.A0E().A33(1);
            AFo(7);
        }
        return true;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
        switch (i) {
            case 3:
                this.A0J = true;
                if (this.A0D == QY.A0A) {
                    QY qy = QY.A0A;
                    if (A0O[4].charAt(14) != '3') {
                        String[] strArr = A0O;
                        strArr[3] = "iL0L5EQxu2M5tvy2sZDjl5tOkB9wsg4Q";
                        strArr[6] = "qEr4cYtmjtQdjlZthk5xBRgssZbq5gW6";
                        setVideoState(qy);
                    } else {
                        setVideoState(qy);
                    }
                }
                return true;
            case 701:
                setVideoState(QY.A02);
                return false;
            case 702:
                if (!A08()) {
                    return false;
                }
                QY qy2 = QY.A0A;
                String[] strArr2 = A0O;
                if (strArr2[3].charAt(29) != strArr2[6].charAt(29)) {
                    throw new RuntimeException();
                }
                String[] strArr3 = A0O;
                strArr3[3] = "BctcOQJYgBcKf8RdBMRoW9O8jkER1gO3";
                strArr3[6] = "NFF5b4NOHp1wMQpQtAU8ibXMpYWuxgZg";
                setVideoState(qy2);
                return false;
            default:
                return false;
        }
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        setVideoState(QY.A07);
        if (this.A0H && !this.A0G) {
            Activity activityContext = this.A0M.A0D();
            if (activityContext != null) {
                MediaController mediaController = new MediaController(activityContext);
                this.A0A = mediaController;
                View view = this.A09;
                if (view == null) {
                    view = this;
                }
                mediaController.setAnchorView(view);
                MediaController mediaController2 = this.A0A;
                MediaController.MediaPlayerControl mediaPlayerControl = this.A0L;
                if (A0O[1].charAt(7) != 'q') {
                    throw new RuntimeException();
                }
                String[] strArr = A0O;
                strArr[3] = "fPjFRSSzuUrY85KdwEQXHAUI7gq3zgJX";
                strArr[6] = "QlnNj2Zi0n3XZkktRetea07zoE6PUgNL";
                mediaController2.setMediaPlayer(mediaPlayerControl);
                this.A0A.setEnabled(true);
            } else {
                this.A0A = null;
            }
        }
        setRequestedVolume(this.A00);
        this.A05 = mediaPlayer.getVideoWidth();
        this.A04 = mediaPlayer.getVideoHeight();
        int i = this.A03;
        if (i > 0) {
            if (i >= this.A06.getDuration()) {
                this.A03 = 0;
            }
            this.A06.seekTo(this.A03);
            this.A03 = 0;
        }
        QY qy = this.A0D;
        QY qy2 = QY.A0A;
        String[] strArr2 = A0O;
        if (strArr2[2].length() == strArr2[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr3 = A0O;
        strArr3[3] = "i4HMjCzdRtS7Zf5jyUfqsJgJBFC3Hgk3";
        strArr3[6] = "nPyigXhxANl12gOwrMulZJ84NGYQcgH1";
        if (qy == qy2) {
            AFh(this.A0B, 8);
        }
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        QZ qz = this.A0E;
        if (qz == null) {
            return;
        }
        qz.ACs(this.A02, this.A03);
        this.A03 = 0;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        if (this.A08 == null) {
            this.A08 = new Surface(surfaceTexture);
        }
        if (!A0A(this.A08)) {
            setVideoState(QY.A03);
            this.A0M.A0E().A33(4);
            destroy();
        } else if (this.A0C == QY.A05 && !this.A0I) {
            AFh(this.A0B, 7);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        A0A(null);
        Surface surface = this.A08;
        if (surface != null) {
            surface.release();
            this.A08 = null;
        }
        if (this.A0C != QY.A05) {
            ADk(false, 5);
        }
        if (A0O[1].charAt(7) != 'q') {
            throw new RuntimeException();
        }
        A0O[5] = "wJEag4Up5dB02EoPbWjrYUJlPYnnpJPt";
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    @Override // android.media.MediaPlayer.OnVideoSizeChangedListener
    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        this.A05 = mediaPlayer.getVideoWidth();
        int videoHeight = mediaPlayer.getVideoHeight();
        this.A04 = videoHeight;
        if (this.A05 != 0 && videoHeight != 0) {
            requestLayout();
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (this.A06 == null) {
            return;
        }
        MediaController mediaController = this.A0A;
        if (mediaController != null && mediaController.isShowing()) {
            return;
        }
        if (!z) {
            if (this.A0C != QY.A05) {
                if (IP.A1G(this.A0M) && Build.VERSION.SDK_INT >= 24) {
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.facebook.ads.redexgen.X.QS
                        @Override // java.lang.Runnable
                        public final void run() {
                            TextureViewSurfaceTextureListenerC0448Ij.this.A0C();
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
        if (this.A0C != QY.A05 || this.A0I) {
            return;
        }
        AFh(this.A0B, 9);
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public final void seekTo(int i) {
        if (this.A06 != null && A07()) {
            if (i < getDuration() && i > 0) {
                this.A02 = getCurrentPosition();
                this.A03 = i;
                this.A06.seekTo(i);
                return;
            }
            return;
        }
        this.A03 = i;
    }

    @Override // android.view.TextureView, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0P, A03(121, 102, 58));
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setBackgroundPlaybackEnabled(boolean z) {
        this.A0F = z;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setControlsAnchorView(View view) {
        this.A09 = view;
        view.setOnTouchListener(new QV(this));
    }

    @Override // android.view.TextureView, android.view.View
    public void setForeground(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 24) {
            super.setForeground(drawable);
        } else {
            if (!AdInternalSettings.isDebugBuild()) {
                return;
            }
            Log.w(A0P, A03(223, 94, 7));
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setFullScreen(boolean z) {
        this.A0H = z;
        if (z && !this.A0G) {
            setOnTouchListener(new QU(this));
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setRequestedVolume(float f) {
        this.A00 = f;
        if (this.A06 != null && this.A0C != QY.A08 && this.A0C != QY.A04) {
            this.A06.setVolume(f, f);
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setVideoMPD(String str) {
    }

    private void setVideoState(QY qy) {
        if (qy != this.A0C) {
            if (this.A0M.A04().A8o()) {
                String str = A03(356, 23, 17) + qy;
            }
            this.A0C = qy;
            QZ qz = this.A0E;
            if (qz != null) {
                qz.ADX(qy);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setVideoStateChangeListener(QZ qz) {
        this.A0E = qz;
    }

    @Override // com.facebook.ads.redexgen.X.QW
    public void setup(Uri uri) {
        MediaPlayer mediaPlayer;
        this.A0M.A0E().A32();
        this.A0J = false;
        this.A07 = uri;
        if (this.A06 != null) {
            A09();
            A0A(null);
            mediaPlayer = this.A06;
            setVideoState(QY.A04);
        } else {
            mediaPlayer = new MediaPlayer();
        }
        try {
            if (uri.getScheme().equals(A03(379, 5, 114))) {
                A05(mediaPlayer, uri);
            } else {
                mediaPlayer.setDataSource(uri.toString());
            }
            mediaPlayer.setLooping(false);
            mediaPlayer.setOnBufferingUpdateListener(this);
            mediaPlayer.setOnCompletionListener(this);
            mediaPlayer.setOnErrorListener(this);
            mediaPlayer.setOnInfoListener(this);
            mediaPlayer.setOnPreparedListener(this);
            mediaPlayer.setOnVideoSizeChangedListener(this);
            mediaPlayer.setOnSeekCompleteListener(this);
            mediaPlayer.prepareAsync();
            this.A06 = mediaPlayer;
            setVideoState(QY.A08);
        } catch (Exception e) {
            setVideoState(QY.A03);
            this.A0M.A0E().A33(3);
            mediaPlayer.release();
            Log.e(A0P, A03(16, 49, 88) + e);
        }
        setSurfaceTextureListener(this);
        if (isAvailable()) {
            onSurfaceTextureAvailable(getSurfaceTexture(), 0, 0);
        }
    }
}
