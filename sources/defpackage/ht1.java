package defpackage;

import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ht1 {
    public static /* synthetic */ NetworkEvent.Builder a() {
        return new NetworkEvent.Builder();
    }

    public static /* synthetic */ PlaybackErrorEvent.Builder e() {
        return new PlaybackErrorEvent.Builder();
    }

    public static /* bridge */ /* synthetic */ PlaybackMetrics.Builder g(Object obj) {
        return (PlaybackMetrics.Builder) obj;
    }
}
