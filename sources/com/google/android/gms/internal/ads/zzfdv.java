package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class zzfdv implements zzfzp {
    final /* synthetic */ zzcgb zza;
    final /* synthetic */ zzcou zzb;
    final /* synthetic */ zzfjx zzc;
    final /* synthetic */ zzedo zzd;

    public zzfdv(zzcgb zzcgbVar, zzcou zzcouVar, zzfjx zzfjxVar, zzedo zzedoVar) {
        this.zza = zzcgbVar;
        this.zzb = zzcouVar;
        this.zzc = zzfjxVar;
        this.zzd = zzedoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final void zza(Throwable th) {
    }

    @Override // com.google.android.gms.internal.ads.zzfzp
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        String str = (String) obj;
        if (!this.zza.zzD().zzak) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzju)).booleanValue()) {
                this.zzb.zzi(str, this.zzc, com.google.android.gms.ads.internal.client.zzay.zze());
                return;
            } else {
                this.zzc.zzc(str, null);
                return;
            }
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzt.zzB().currentTimeMillis();
        String str2 = this.zza.zzP().zzb;
        int i = 2;
        if (!com.google.android.gms.ads.internal.zzt.zzo().zzx(this.zza.getContext())) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzgk)).booleanValue() || !this.zza.zzD().zzU) {
                i = 1;
            }
        }
        this.zzd.zzd(new zzedq(currentTimeMillis, str2, str, i));
    }
}
