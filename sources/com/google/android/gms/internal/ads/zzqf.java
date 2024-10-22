package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* loaded from: classes.dex */
final class zzqf extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzqi zza;
    final /* synthetic */ zzqg zzb;

    public zzqf(zzqg zzqgVar, zzqi zzqiVar) {
        this.zzb = zzqgVar;
        this.zza = zzqiVar;
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (!audioTrack.equals(zzqi.zzD(this.zzb.zza))) {
            return;
        }
        zzqi zzqiVar = this.zzb.zza;
        if (zzqi.zzE(zzqiVar) != null && zzqi.zzG(zzqiVar)) {
            zzqi.zzE(zzqiVar).zzb();
        }
    }

    @Override // android.media.AudioTrack.StreamEventCallback
    public final void onTearDown(AudioTrack audioTrack) {
        if (!audioTrack.equals(zzqi.zzD(this.zzb.zza))) {
            return;
        }
        zzqi zzqiVar = this.zzb.zza;
        if (zzqi.zzE(zzqiVar) != null && zzqi.zzG(zzqiVar)) {
            zzqi.zzE(zzqiVar).zzb();
        }
    }
}
