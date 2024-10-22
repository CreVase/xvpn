package defpackage;

import android.media.MediaDrm;

/* loaded from: classes.dex */
public abstract class zn0 {
    public static boolean a(Throwable th) {
        return th instanceof MediaDrm.MediaDrmStateException;
    }

    public static int b(Throwable th) {
        return wi3.o(wi3.p(((MediaDrm.MediaDrmStateException) th).getDiagnosticInfo()));
    }
}
