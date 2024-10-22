package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.dynamic.ObjectWrapper;

/* loaded from: classes.dex */
public final class zzehf implements zzefa {
    private final Context zza;
    private final zzdgx zzb;

    public zzehf(Context context, zzdgx zzdgxVar) {
        this.zza = context;
        this.zzb = zzdgxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final /* bridge */ /* synthetic */ Object zza(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds, zzeir {
        zzegz zzegzVar = new zzegz(zzfcrVar, (zzbqv) zzeexVar.zzb, AdFormat.INTERSTITIAL);
        zzdfx zze = this.zzb.zze(new zzctm(zzfdeVar, zzfcrVar, zzeexVar.zza), new zzdga(zzegzVar, null));
        zzegzVar.zzb(zze.zzc());
        ((zzegq) zzeexVar.zzc).zzc(zze.zzi());
        return zze.zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzefa
    public final void zzb(zzfde zzfdeVar, zzfcr zzfcrVar, zzeex zzeexVar) throws zzfds {
        try {
            ((zzbqv) zzeexVar.zzb).zzq(zzfcrVar.zzab);
            ((zzbqv) zzeexVar.zzb).zzl(zzfcrVar.zzW, zzfcrVar.zzx.toString(), zzfdeVar.zza.zza.zzd, ObjectWrapper.wrap(this.zza), new zzehe(this, zzeexVar, null), (zzbpd) zzeexVar.zzc);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.zze.zzb("Remote exception loading a interstitial RTB ad", e);
            throw new zzfds(e);
        }
    }
}
