package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzefn implements zzefa {
    private final Context zza;
    private final zzcqj zzb;

    public zzefn(Context context, zzcqj zzcqjVar) {
        this.zza = context;
        this.zzb = zzcqjVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds, zzeir {
        zzegz zzegzVar = new zzegz(zzfcrVar, (zzbqv) zzeexVar.zzb, AdFormat.APP_OPEN_AD);
        zzcqg zza = this.zzb.zza(new zzctm(zzfdeVar, zzfcrVar, zzeexVar.zza), new zzdga(zzegzVar, null), new zzcqh(zzfcrVar.zzac));
        zzegzVar.zzb(zza.zzc());
        ((zzegq) zzeexVar.zzc).zzc(zza.zzi());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final void zzb(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds {
        try {
            ((zzbqv) zzeexVar.zzb).zzq(zzfcrVar.zzab);
            ((zzbqv) zzeexVar.zzb).zzi(zzfcrVar.zzW, zzfcrVar.zzx.toString(), zzfdeVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzefm(zzeexVar, null), (zzbpd) zzeexVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading an app open RTB ad", e);
            throw new zzfds(e);
        }
    }
}
