package defpackage;

import android.media.AudioManager;
import android.os.Handler;

/* loaded from: classes.dex */
public final class uh implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f4669a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ wh f4670b;

    public uh(wh whVar, Handler handler) {
        this.f4670b = whVar;
        this.f4669a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.f4669a.post(new gk2(i, 1, this));
    }
}
