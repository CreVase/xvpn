package defpackage;

import android.media.MediaDrm;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class h31 {
    public static boolean a(MediaDrm mediaDrm, String str) {
        boolean requiresSecureDecoder;
        requiresSecureDecoder = mediaDrm.requiresSecureDecoder(str);
        return requiresSecureDecoder;
    }

    public static void b(MediaDrm mediaDrm, byte[] bArr, z52 z52Var) {
        LogSessionId logSessionId;
        boolean equals;
        MediaDrm.PlaybackComponent playbackComponent;
        y52 y52Var = z52Var.f5429a;
        y52Var.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = y52Var.f5274a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            playbackComponent = mediaDrm.getPlaybackComponent(bArr);
            playbackComponent.getClass();
            vq.f(playbackComponent).setLogSessionId(logSessionId2);
        }
    }
}
