package com.facebook.ads.redexgen.X;

import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.facebook.ads.redexgen.X.Pt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0635Pt implements AudioManager.OnAudioFocusChangeListener {
    public final /* synthetic */ C01736s A00;

    public C0635Pt(C01736s c01736s) {
        this.A00 = c01736s;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        new Handler(Looper.getMainLooper()).post(new K1(this, i));
    }
}
