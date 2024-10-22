package com.google.android.gms.internal.ads;

import android.media.AudioDeviceInfo;
import android.media.AudioTrack;

/* loaded from: classes.dex */
final class zzps {
    public static void zza(AudioTrack audioTrack, zzpu zzpuVar) {
        AudioDeviceInfo audioDeviceInfo;
        if (zzpuVar == null) {
            audioDeviceInfo = null;
        } else {
            audioDeviceInfo = zzpuVar.zza;
        }
        audioTrack.setPreferredDevice(audioDeviceInfo);
    }
}
