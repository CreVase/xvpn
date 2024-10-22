package com.google.android.gms.internal.ads;

import android.view.Surface;

/* loaded from: classes.dex */
final class zzzm {
    public static void zza(Surface surface, float f) {
        int i;
        if (f == 0.0f) {
            i = 0;
        } else {
            i = 1;
        }
        try {
            surface.setFrameRate(f, i);
        } catch (IllegalStateException e) {
            zzer.zzd("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e);
        }
    }
}
