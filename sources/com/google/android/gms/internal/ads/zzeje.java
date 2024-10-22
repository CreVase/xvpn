package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzeje implements zzefa {
    private final Context zza;
    private final zzdpc zzb;

    public zzeje(Context context, zzdpc zzdpcVar) {
        this.zza = context;
        this.zzb = zzdpcVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds, zzeir {
        zzegz zzegzVar = new zzegz(zzfcrVar, (zzbqv) zzeexVar.zzb, AdFormat.REWARDED);
        zzdoy zze = this.zzb.zze(new zzctm(zzfdeVar, zzfcrVar, zzeexVar.zza), new zzdoz(zzegzVar));
        zzegzVar.zzb(zze.zzc());
        ((zzegq) zzeexVar.zzc).zzc(zze.zzn());
        return zze.zzk();
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final void zzb(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds {
        try {
            ((zzbqv) zzeexVar.zzb).zzq(zzfcrVar.zzab);
            if (zzfdeVar.zza.zza.zzo.zza == 3) {
                ((zzbqv) zzeexVar.zzb).zzo(zzfcrVar.zzW, zzfcrVar.zzx.toString(), zzfdeVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejd(this, zzeexVar, null), (zzbpd) zzeexVar.zzc);
            } else {
                ((zzbqv) zzeexVar.zzb).zzp(zzfcrVar.zzW, zzfcrVar.zzx.toString(), zzfdeVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzejd(this, zzeexVar, null), (zzbpd) zzeexVar.zzc);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a rewarded RTB ad", e);
        }
    }
}
