package defpackage;

import android.media.MediaFormat;
import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public abstract class as1 {
    public static void a(sr1 sr1Var, z52 z52Var) {
        LogSessionId logSessionId;
        boolean equals;
        String stringId;
        y52 y52Var = z52Var.f5429a;
        y52Var.getClass();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        LogSessionId logSessionId2 = y52Var.f5274a;
        equals = logSessionId2.equals(logSessionId);
        if (!equals) {
            MediaFormat mediaFormat = sr1Var.f4401b;
            stringId = logSessionId2.getStringId();
            mediaFormat.setString("log-session-id", stringId);
        }
    }
}
