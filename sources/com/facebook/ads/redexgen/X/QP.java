package com.facebook.ads.redexgen.X;

import android.widget.MediaController;

/* loaded from: assets/audience_network.dex */
public class QP implements MediaController.MediaPlayerControl {
    public static String[] A01 = {"T46fCpiGc88W2sm67KitVw29EyPc3", "CnzVRlVQiaWVzZBS", "ndpW2a6BPo0GfPTTlqn3VUL3zbZB353", "6dBvfVqLyh6nhF4N5m", "imXeYKfRY50epxOYIoCDJpdee5DGPOn9", "a2YCts1Ck8i", "mjIxnllGj7l0AybsaVU42LegCoMqgA9", "OPSSIwvLFtyh4B3JmayX8W92hCUnvGiN"};
    public final /* synthetic */ TextureViewSurfaceTextureListenerC0450Il A00;

    public QP(TextureViewSurfaceTextureListenerC0450Il textureViewSurfaceTextureListenerC0450Il) {
        this.A00 = textureViewSurfaceTextureListenerC0450Il;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canPause() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekBackward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean canSeekForward() {
        return true;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getAudioSessionId() {
        QJ qj;
        QJ qj2;
        qj = this.A00.A0C;
        if (qj == null) {
            return 0;
        }
        qj2 = this.A00.A0C;
        return qj2.A04();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getBufferPercentage() {
        QJ qj;
        QJ qj2;
        qj = this.A00.A0C;
        if (qj == null) {
            return 0;
        }
        qj2 = this.A00.A0C;
        return qj2.A05();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getCurrentPosition() {
        return this.A00.getCurrentPosition();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final int getDuration() {
        return this.A00.getDuration();
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final boolean isPlaying() {
        QJ qj;
        QJ qj2;
        qj = this.A00.A0C;
        if (qj != null) {
            qj2 = this.A00.A0C;
            if (qj2.A0J()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void pause() {
        QZ qz;
        QZ qz2;
        qz = this.A00.A0F;
        if (qz != null) {
            qz2 = this.A00.A0F;
            String[] strArr = A01;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A01[3] = "BHfWGVDMvGTMo8ZI3A6S5KtrLH6Ee";
            qz2.AC1();
        }
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void seekTo(int i) {
        this.A00.seekTo(i);
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public final void start() {
        QZ qz;
        QZ qz2;
        qz = this.A00.A0F;
        if (qz != null) {
            qz2 = this.A00.A0F;
            qz2.AC2();
        }
    }
}
