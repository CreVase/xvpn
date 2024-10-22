package defpackage;

import android.content.ClipData;
import android.media.MediaDrm;
import android.media.metrics.MediaMetricsManager;
import android.view.ContentInfo;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class vq {
    public static /* bridge */ /* synthetic */ MediaDrm.PlaybackComponent f(Object obj) {
        return (MediaDrm.PlaybackComponent) obj;
    }

    public static /* bridge */ /* synthetic */ MediaMetricsManager i(Object obj) {
        return (MediaMetricsManager) obj;
    }

    public static /* synthetic */ ContentInfo.Builder m(ClipData clipData, int i) {
        return new ContentInfo.Builder(clipData, i);
    }

    public static /* bridge */ /* synthetic */ ContentInfo o(Object obj) {
        return (ContentInfo) obj;
    }
}
