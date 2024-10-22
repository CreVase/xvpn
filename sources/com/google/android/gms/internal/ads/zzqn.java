package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzqn implements zzpf {
    final /* synthetic */ zzqo zza;

    public /* synthetic */ zzqn(zzqo zzqoVar, zzqm zzqmVar) {
        this.zza = zzqoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zza(Exception exc) {
        zzer.zzd("MediaCodecAudioRenderer", "Audio sink error", exc);
        zzqo.zzab(this.zza).zzb(exc);
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzb() {
        zzqo zzqoVar = this.zza;
        if (zzqo.zzaa(zzqoVar) != null) {
            zzqo.zzaa(zzqoVar).zzb();
        }
    }
}
