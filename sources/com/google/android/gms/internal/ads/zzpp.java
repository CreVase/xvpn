package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpp {
    public static zzoq zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        int playbackOffloadSupport;
        playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        if (playbackOffloadSupport == 0) {
            return zzoq.zza;
        }
        zzoo zzooVar = new zzoo();
        boolean z2 = false;
        if (zzfk.zza > 32 && playbackOffloadSupport == 2) {
            z2 = true;
        }
        zzooVar.zza(true);
        zzooVar.zzb(z2);
        zzooVar.zzc(z);
        return zzooVar.zzd();
    }
}
