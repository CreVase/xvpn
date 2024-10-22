package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import defpackage.no1;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzry {
    public static int zza(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        List supportedPerformancePoints;
        boolean covers;
        supportedPerformancePoints = videoCapabilities.getSupportedPerformancePoints();
        if (supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty()) {
            String str = zzfk.zzb;
            if (!str.equals("sabrina") && !str.equals("boreal")) {
                String str2 = zzfk.zzd;
                if (!str2.startsWith("Lenovo TB-X605") && !str2.startsWith("Lenovo TB-X606") && !str2.startsWith("Lenovo TB-X616")) {
                    MediaCodecInfo.VideoCapabilities.PerformancePoint d2 = no1.d(i, i2, (int) d);
                    for (int i3 = 0; i3 < supportedPerformancePoints.size(); i3++) {
                        covers = no1.e(supportedPerformancePoints.get(i3)).covers(d2);
                        if (covers) {
                            return 2;
                        }
                    }
                    return 1;
                }
            }
        }
        return 0;
    }
}
