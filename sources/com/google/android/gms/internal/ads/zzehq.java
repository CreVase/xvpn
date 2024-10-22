package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class zzehq implements zzefa {
    private final Context zza;
    private final zzdht zzb;
    private final Executor zzc;

    public zzehq(Context context, zzdht zzdhtVar, Executor executor) {
        this.zza = context;
        this.zzb = zzdhtVar;
        this.zzc = executor;
    }

    private static final boolean zzc(zzfde zzfdeVar, int i) {
        return zzfdeVar.zza.zza.zzg.contains(Integer.toString(i));
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds, zzeir {
        zzdjj zzah;
        zzbpi zzD = ((zzfej) zzeexVar.zzb).zzD();
        zzbpj zzE = ((zzfej) zzeexVar.zzb).zzE();
        zzbpm zzd = ((zzfej) zzeexVar.zzb).zzd();
        if (zzd != null && zzc(zzfdeVar, 6)) {
            zzah = zzdjj.zzt(zzd);
        } else if (zzD != null && zzc(zzfdeVar, 6)) {
            zzah = zzdjj.zzai(zzD);
        } else if (zzD != null && zzc(zzfdeVar, 2)) {
            zzah = zzdjj.zzag(zzD);
        } else if (zzE != null && zzc(zzfdeVar, 6)) {
            zzah = zzdjj.zzaj(zzE);
        } else if (zzE != null && zzc(zzfdeVar, 1)) {
            zzah = zzdjj.zzah(zzE);
        } else {
            throw new zzeir(1, "No native ad mappers");
        }
        zzfdn zzfdnVar = zzfdeVar.zza.zza;
        if (zzfdnVar.zzg.contains(Integer.toString(zzah.zzc()))) {
            zzdjl zze = this.zzb.zze(new zzctm(zzfdeVar, zzfcrVar, zzeexVar.zza), new zzdjv(zzah), new zzdlm(zzE, zzD, zzd));
            ((zzegq) zzeexVar.zzc).zzc(zze.zzj());
            zze.zzd().zzo(new zzcol((zzfej) zzeexVar.zzb), this.zzc);
            return zze.zza();
        }
        throw new zzeir(1, "No corresponding native ad listener");
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final void zzb(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds {
        zzfej zzfejVar = (zzfej) zzeexVar.zzb;
        zzfdn zzfdnVar = zzfdeVar.zza.zza;
        String jSONObject = zzfcrVar.zzx.toString();
        String zzl = com.google.android.gms.ads.internal.util.zzbw.zzl(zzfcrVar.zzu);
        zzbpd zzbpdVar = (zzbpd) zzeexVar.zzc;
        zzfdn zzfdnVar2 = zzfdeVar.zza.zza;
        zzfejVar.zzp(this.zza, zzfdnVar.zzd, jSONObject, zzl, zzbpdVar, zzfdnVar2.zzi, zzfdnVar2.zzg);
    }
}
