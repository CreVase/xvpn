package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzehb implements zzefa {
    private final Context zza;
    private final zzdgx zzb;
    private final zzcaz zzc;
    private final Executor zzd;

    public zzehb(Context context, zzcaz zzcazVar, zzdgx zzdgxVar, Executor executor) {
        this.zza = context;
        this.zzc = zzcazVar;
        this.zzb = zzdgxVar;
        this.zzd = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcr zzfcrVar, final zzeex zzeexVar) throws zzfds, zzeir {
        zzdfx zze = this.zzb.zze(new zzctm(zzfdeVar, zzfcrVar, zzeexVar.zza), new zzdga(new zzdhf() { // from class: com.google.android.gms.internal.ads.zzeha
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(boolean z, Context context, zzcxy zzcxyVar) {
                zzehb.this.zzc(zzeexVar, z, context, zzcxyVar);
            }
        }, null));
        zze.zzd().zzo(new zzcol((zzfej) zzeexVar.zzb), this.zzd);
        ((zzegq) zzeexVar.zzc).zzc(zze.zzj());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final void zzb(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds {
        zzfej zzfejVar = (zzfej) zzeexVar.zzb;
        zzfdn zzfdnVar = zzfdeVar.zza.zza;
        zzfejVar.zzo(this.zza, zzfdnVar.zzd, zzfcrVar.zzx.toString(), com.google.android.gms.ads.internal.util.zzbw.zzl(zzfcrVar.zzu), (zzbpd) zzeexVar.zzc);
    }

    public final /* synthetic */ void zzc(zzeex zzeexVar, boolean z, Context context, zzcxy zzcxyVar) throws zzdhe {
        try {
            ((zzfej) zzeexVar.zzb).zzv(z);
            if (this.zzc.zzc < ((Integer) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzaG)).intValue()) {
                ((zzfej) zzeexVar.zzb).zzx();
            } else {
                ((zzfej) zzeexVar.zzb).zzy(context);
            }
        } catch (zzfds e) {
            zzcat.zzi("Cannot show interstitial.");
            throw new zzdhe(e.getCause());
        }
    }
}
