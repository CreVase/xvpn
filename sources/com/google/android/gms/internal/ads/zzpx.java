package com.google.android.gms.internal.ads;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import defpackage.fy3;
import defpackage.vf0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzpx {
    public final zzam zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final zzdn zzi;
    public final boolean zzj = false;
    public final boolean zzk = false;

    public zzpx(zzam zzamVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, zzdn zzdnVar, boolean z, boolean z2) {
        this.zza = zzamVar;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = i3;
        this.zze = i4;
        this.zzf = i5;
        this.zzg = i6;
        this.zzh = i7;
        this.zzi = zzdnVar;
    }

    public final AudioTrack zza(boolean z, zzk zzkVar, int i) throws zzpe {
        AudioTrack audioTrack;
        AudioTrack.Builder audioAttributes;
        AudioTrack.Builder audioFormat;
        AudioTrack.Builder transferMode;
        AudioTrack.Builder bufferSizeInBytes;
        AudioTrack.Builder sessionId;
        boolean z2;
        AudioTrack.Builder offloadedPlayback;
        try {
            int i2 = zzfk.zza;
            if (i2 >= 29) {
                AudioFormat zzu = zzfk.zzu(this.zze, this.zzf, this.zzg);
                AudioAttributes audioAttributes2 = zzkVar.zza().zza;
                fy3.d();
                audioAttributes = vf0.f().setAudioAttributes(audioAttributes2);
                audioFormat = audioAttributes.setAudioFormat(zzu);
                transferMode = audioFormat.setTransferMode(1);
                bufferSizeInBytes = transferMode.setBufferSizeInBytes(this.zzh);
                sessionId = bufferSizeInBytes.setSessionId(i);
                if (this.zzc == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                offloadedPlayback = sessionId.setOffloadedPlayback(z2);
                audioTrack = offloadedPlayback.build();
            } else if (i2 >= 21) {
                audioTrack = new AudioTrack(zzkVar.zza().zza, zzfk.zzu(this.zze, this.zzf, this.zzg), this.zzh, 1, i);
            } else {
                int i3 = zzkVar.zzc;
                if (i == 0) {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1);
                } else {
                    audioTrack = new AudioTrack(3, this.zze, this.zzf, this.zzg, this.zzh, 1, i);
                }
            }
            int state = audioTrack.getState();
            if (state == 1) {
                return audioTrack;
            }
            try {
                audioTrack.release();
            } catch (Exception unused) {
            }
            throw new zzpe(state, this.zze, this.zzf, this.zzh, this.zza, zzb(), null);
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new zzpe(0, this.zze, this.zzf, this.zzh, this.zza, zzb(), e);
        }
    }

    public final boolean zzb() {
        return this.zzc == 1;
    }
}
