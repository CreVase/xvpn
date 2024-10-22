package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcii implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzcii(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzdut zzdutVar = (zzdut) this.zza.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbB)).booleanValue()) {
            emptySet = Collections.singleton(new zzdev(zzdutVar, zzgadVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhbk.zzb(emptySet);
        return emptySet;
    }
}
