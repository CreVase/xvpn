package defpackage;

import android.view.Surface;

/* loaded from: classes.dex */
public abstract class ak3 {
    public static void a(Surface surface, float f) {
        int i;
        if (f == 0.0f) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            surface.setFrameRate(f, i);
        } catch (IllegalStateException e) {
            sn1.d("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
