package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class zzdrs implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;

    public zzdrs(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set emptySet;
        final String str = (String) this.zza.zzb();
        Context zza = ((zzcic) this.zzb).zza();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        Map zzb = ((zzhbg) this.zzd).zzb();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zzb(zzbci.zzeM)).booleanValue()) {
            zzaxv zzaxvVar = new zzaxv(new zzayb(zza));
            zzaxvVar.zzb(new zzaxu() { // from class: com.google.android.gms.internal.ads.zzdrt
                @Override // com.google.android.gms.internal.ads.zzaxu
                public final void zza(zzazk zzazkVar) {
                    zzazkVar.zzh(str);
                }
            });
            emptySet = Collections.singleton(new zzdev(new zzdrv(zzaxvVar, zzb), zzgadVar));
        } else {
            emptySet = Collections.emptySet();
        }
        zzhbk.zzb(emptySet);
        return emptySet;
    }
}
