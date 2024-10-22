package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.PlaybackSession;

/* loaded from: classes.dex */
public abstract class vt0 {
    public static z52 a(Context context, bu0 bu0Var, boolean z) {
        PlaybackSession createPlaybackSession;
        jt1 jt1Var;
        LogSessionId sessionId;
        LogSessionId logSessionId;
        MediaMetricsManager i = vq.i(context.getSystemService("media_metrics"));
        if (i != null) {
            createPlaybackSession = i.createPlaybackSession();
            jt1Var = new jt1(context, createPlaybackSession);
        } else {
            jt1Var = null;
        }
        if (jt1Var == null) {
            sn1.f();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            return new z52(logSessionId);
        }
        if (z) {
            bu0Var.getClass();
            uf0 uf0Var = (uf0) bu0Var.q;
            uf0Var.getClass();
            uf0Var.f.a(jt1Var);
        }
        sessionId = jt1Var.c.getSessionId();
        return new z52(sessionId);
    }
}
