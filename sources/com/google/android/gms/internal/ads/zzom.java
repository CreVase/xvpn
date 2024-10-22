package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzom {
    private static final AudioAttributes zza = new AudioAttributes.Builder().setUsage(1).setContentType(3).setFlags(0).build();

    public static int zza(int i, int i2) {
        boolean isDirectPlaybackSupported;
        for (int i3 = 10; i3 > 0; i3--) {
            isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(i).setSampleRate(i2).setChannelMask(zzfk.zzg(i3)).build(), zza);
            if (isDirectPlaybackSupported) {
                return i3;
            }
        }
        return 0;
    }

    public static zzfvs<Integer> zzb() {
        zzfvv zzfvvVar;
        boolean isDirectPlaybackSupported;
        zzfvp zzfvpVar = new zzfvp();
        zzfvvVar = zzon.zzc;
        zzfxs it = zzfvvVar.keySet().iterator();
        while (it.hasNext()) {
            int intValue = ((Integer) it.next()).intValue();
            if (zzfk.zza >= zzfk.zzf(intValue)) {
                isDirectPlaybackSupported = AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setChannelMask(12).setEncoding(intValue).setSampleRate(48000).build(), zza);
                if (isDirectPlaybackSupported) {
                    zzfvpVar.zzf(Integer.valueOf(intValue));
                }
            }
        }
        zzfvpVar.zzf((Object) 2);
        return zzfvpVar.zzi();
    }
}
