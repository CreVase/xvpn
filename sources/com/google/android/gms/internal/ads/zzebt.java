package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzebt implements zzdei {
    private final String zzc;
    private final zzfib zzd;
    private boolean zza = false;
    private boolean zzb = false;
    private final com.google.android.gms.ads.internal.util.zzg zze = com.google.android.gms.ads.internal.zzt.zzo().zzh();

    public zzebt(String str, zzfib zzfibVar) {
        this.zzc = str;
        this.zzd = zzfibVar;
    }

    private final zzfia zzg(String str) {
        String str2;
        if (this.zze.zzQ()) {
            str2 = "";
        } else {
            str2 = this.zzc;
        }
        zzfia zzb = zzfia.zzb(str);
        zzb.zza("tms", Long.toString(com.google.android.gms.ads.internal.zzt.zzB().elapsedRealtime(), 10));
        zzb.zza("tid", str2);
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zza(String str) {
        zzfia zzg = zzg("aaia");
        zzg.zza("aair", "MalformedJson");
        this.zzd.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzb(String str, String str2) {
        zzfia zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        zzg.zza("rqe", str2);
        this.zzd.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzc(String str) {
        zzfia zzg = zzg("adapter_init_started");
        zzg.zza("ancn", str);
        this.zzd.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final void zzd(String str) {
        zzfia zzg = zzg("adapter_init_finished");
        zzg.zza("ancn", str);
        this.zzd.zzb(zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zze() {
        if (!this.zzb) {
            this.zzd.zzb(zzg("init_finished"));
            this.zzb = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdei
    public final synchronized void zzf() {
        if (!this.zza) {
            this.zzd.zzb(zzg("init_started"));
            this.zza = true;
        }
    }
}
