package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;

/* loaded from: classes.dex */
final class zzeke implements zzcyu {
    boolean zza = false;
    final /* synthetic */ zzeex zzb;
    final /* synthetic */ zzcbl zzc;
    final /* synthetic */ zzekf zzd;

    public zzeke(zzekf zzekfVar, zzeex zzeexVar, zzcbl zzcblVar) {
        this.zzd = zzekfVar;
        this.zzb = zzeexVar;
        this.zzc = zzcblVar;
    }

    private final synchronized void zze(com.google.android.gms.ads.internal.client.zze zzeVar) {
        int i = 1;
        if (true == ((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzfp)).booleanValue()) {
            i = 3;
        }
        this.zzc.zzd(new zzeey(i, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final synchronized void zza(int i) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new com.google.android.gms.ads.internal.client.zze(i, zzekf.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final synchronized void zzb(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(zzeVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final synchronized void zzc(int i, String str) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        if (str == null) {
            str = zzekf.zze(this.zzb.zza, i);
        }
        zze(new com.google.android.gms.ads.internal.client.zze(i, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcyu
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
