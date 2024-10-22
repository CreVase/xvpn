package defpackage;

import android.app.StatusBarManager;
import android.graphics.drawable.ColorStateListDrawable;
import android.media.AudioTrack;

/* loaded from: classes.dex */
public abstract /* synthetic */ class y2 {
    public static /* bridge */ /* synthetic */ StatusBarManager b(Object obj) {
        return (StatusBarManager) obj;
    }

    public static /* bridge */ /* synthetic */ ColorStateListDrawable d(Object obj) {
        return (ColorStateListDrawable) obj;
    }

    public static /* bridge */ /* synthetic */ boolean s(AudioTrack audioTrack) {
        return audioTrack.isOffloadedPlayback();
    }

    public static /* bridge */ /* synthetic */ boolean u(Object obj) {
        return obj instanceof ColorStateListDrawable;
    }
}
