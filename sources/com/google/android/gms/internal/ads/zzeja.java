package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzeja implements zzefa {
    private final Context zza;
    private final Executor zzb;
    private final zzdpc zzc;

    public zzeja(Context context, Executor executor, zzdpc zzdpcVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcr zzfcrVar, final zzeex zzeexVar) throws zzfds, zzeir {
        zzdoy zze = this.zzc.zze(new zzctm(zzfdeVar, zzfcrVar, zzeexVar.zza), new zzdoz(new zzdhf() { // from class: com.google.android.gms.internal.ads.zzeiz
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(boolean z, Context context, zzcxy zzcxyVar) {
                zzeex zzeexVar2 = zzeex.this;
                try {
                    ((zzfej) zzeexVar2.zzb).zzv(z);
                    ((zzfej) zzeexVar2.zzb).zzz(context);
                } catch (zzfds e) {
                    throw new zzdhe(e.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcol((zzfej) zzeexVar.zzb), this.zzb);
        ((zzegq) zzeexVar.zzc).zzc(zze.zzm());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final void zzb(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds {
        try {
            zzfdn zzfdnVar = zzfdeVar.zza.zza;
            if (zzfdnVar.zzo.zza == 3) {
                ((zzfej) zzeexVar.zzb).zzr(this.zza, zzfdnVar.zzd, zzfcrVar.zzx.toString(), (zzbpd) zzeexVar.zzc);
            } else {
                ((zzfej) zzeexVar.zzb).zzq(this.zza, zzfdnVar.zzd, zzfcrVar.zzx.toString(), (zzbpd) zzeexVar.zzc);
            }
        } catch (Exception e) {
            zzcat.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzeexVar.zza)), e);
        }
    }
}
