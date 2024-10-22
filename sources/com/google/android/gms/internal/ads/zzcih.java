package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzcih implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;

    public zzcih(zzhbp zzhbpVar, zzhbp zzhbpVar2) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        zzebt zzebtVar = (zzebt) this.zza.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzbX)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzir)).booleanValue()) {
                emptySet = Collections.singleton(new zzdev(zzebtVar, zzgadVar));
                zzhbk.zzb(emptySet);
                return emptySet;
            }
        }
        emptySet = Collections.emptySet();
        zzhbk.zzb(emptySet);
        return emptySet;
    }
}
