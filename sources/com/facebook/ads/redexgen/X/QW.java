package com.facebook.ads.redexgen.X;

import android.net.Uri;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public interface QW {
    void A8G();

    boolean A8R();

    boolean A8S();

    boolean A8z();

    void ADk(boolean z, int i);

    void AFc(int i);

    void AFh(EnumC0625Pj enumC0625Pj, int i);

    void AFo(int i);

    void destroy();

    int getCurrentPosition();

    int getDuration();

    long getInitialBufferTime();

    EnumC0625Pj getStartReason();

    QY getState();

    int getVideoHeight();

    int getVideoWidth();

    View getView();

    float getVolume();

    void seekTo(int i);

    void setBackgroundPlaybackEnabled(boolean z);

    void setControlsAnchorView(View view);

    void setFullScreen(boolean z);

    void setRequestedVolume(float f);

    void setVideoMPD(String str);

    void setVideoStateChangeListener(QZ qz);

    void setup(Uri uri);
}
