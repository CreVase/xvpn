package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpo {
    public static zzoq zza(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z) {
        boolean isOffloadedPlaybackSupported;
        isOffloadedPlaybackSupported = AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes);
        if (!isOffloadedPlaybackSupported) {
            return zzoq.zza;
        }
        zzoo zzooVar = new zzoo();
        zzooVar.zza(true);
        zzooVar.zzc(z);
        return zzooVar.zzd();
    }
}
