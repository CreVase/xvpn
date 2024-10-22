package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class xf0 {
    public static void a(AudioTrack audioTrack, z52 z52Var) {
        LogSessionId logSessionId;
        boolean equals;
        y52 y52Var = z52Var.f5429a;
        y52Var.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = y52Var.f5274a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            audioTrack.setLogSessionId(logSessionId2);
        }
    }
}
