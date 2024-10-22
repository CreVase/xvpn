package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdrd implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzdrd(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        zzdrv zzb = ((zzdrw) this.zzb).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeM)).booleanValue()) {
            emptySet = Collections.singleton(new zzdev(zzb, zzgadVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhbk.zzb(emptySet);
        return emptySet;
    }
}
