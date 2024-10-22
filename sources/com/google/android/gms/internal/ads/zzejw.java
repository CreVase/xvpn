package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzejw implements zzefa {
    private final Context zza;
    private final Executor zzb;
    private final zzdpc zzc;

    public zzejw(Context context, Executor executor, zzdpc zzdpcVar) {
        this.zza = context;
        this.zzb = executor;
        this.zzc = zzdpcVar;
    }

    public static /* bridge */ /* synthetic */ Executor zzc(zzejw zzejwVar) {
        return zzejwVar.zzb;
    }

    public static final void zze(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) {
        try {
            ((zzfej) zzeexVar.zzb).zzk(zzfdeVar.zza.zza.zzd, zzfcrVar.zzx.toString());
        } catch (Exception e) {
            zzcat.zzk("Fail to load ad from adapter ".concat(String.valueOf(zzeexVar.zza)), e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcr zzfcrVar, final zzeex zzeexVar) throws zzfds, zzeir {
        zzdoy zze = this.zzc.zze(new zzctm(zzfdeVar, zzfcrVar, zzeexVar.zza), new zzdoz(new zzdhf() { // from class: com.google.android.gms.internal.ads.zzejs
            @Override // com.google.android.gms.internal.ads.zzdhf
            public final void zza(boolean z, Context context, zzcxy zzcxyVar) {
                zzeex zzeexVar2 = zzeex.this;
                try {
                    ((zzfej) zzeexVar2.zzb).zzv(z);
                    ((zzfej) zzeexVar2.zzb).zzA();
                } catch (zzfds e) {
                    zzcat.zzk("Cannot show rewarded video.", e);
                    throw new zzdhe(e.getCause());
                }
            }
        }));
        zze.zzd().zzo(new zzcol((zzfej) zzeexVar.zzb), this.zzb);
        zzcys zze2 = zze.zze();
        zzcxj zzb = zze.zzb();
        ((zzegr) zzeexVar.zzc).zzc(new zzejv(this, zze.zza(), zzb, zze2, zze.zzg()));
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final void zzb(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds {
        if (!((zzfej) zzeexVar.zzb).zzC()) {
            ((zzegr) zzeexVar.zzc).zzd(new zzeju(this, zzfdeVar, zzfcrVar, zzeexVar));
            Object obj = zzeexVar.zzb;
            Context context = this.zza;
            zzfdn zzfdnVar = zzfdeVar.zza.zza;
            ((zzfej) obj).zzh(context, zzfdnVar.zzd, null, (zzbwh) zzeexVar.zzc, zzfcrVar.zzx.toString());
            return;
        }
        zze(zzfdeVar, zzfcrVar, zzeexVar);
    }
}
