package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes.dex */
public final class zzdnu implements zzbjj {
    private final zzbgs zza;
    private final zzdoi zzb;
    private final zzhaw zzc;

    public zzdnu(zzdju zzdjuVar, zzdjj zzdjjVar, zzdoi zzdoiVar, zzhaw zzhawVar) {
        this.zza = zzdjuVar.zzc(zzdjjVar.zzA());
        this.zzb = zzdoiVar;
        this.zzc = zzhawVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbjj
    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzbgi) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            zzcat.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.zza == null) {
            return;
        }
        this.zzb.zzi("/nativeAdCustomClick", this);
    }
}
