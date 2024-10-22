package com.google.android.gms.internal.ads;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzlo extends zztk {
    private final zzcu zzd;

    public zzlo(zzlp zzlpVar, zzcv zzcvVar) {
        super(zzcvVar);
        this.zzd = new zzcu();
    }

    @Override // com.google.android.gms.internal.ads.zztk, com.google.android.gms.internal.ads.zzcv
    public final zzcs zzd(int i, zzcs zzcsVar, boolean z) {
        zzcs zzd = this.zzc.zzd(i, zzcsVar, z);
        if (this.zzc.zze(zzd.zzd, this.zzd, 0L).zzb()) {
            zzd.zzl(zzcsVar.zzb, zzcsVar.zzc, zzcsVar.zzd, zzcsVar.zze, 0L, zzd.zza, true);
        } else {
            zzd.zzg = true;
        }
        return zzd;
    }
}
