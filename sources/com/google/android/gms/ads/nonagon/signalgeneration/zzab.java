package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import com.google.android.gms.internal.ads.zzaro;
import com.google.android.gms.internal.ads.zzcbg;
import com.google.android.gms.internal.ads.zzchw;
import com.google.android.gms.internal.ads.zzcic;
import com.google.android.gms.internal.ads.zzcio;
import com.google.android.gms.internal.ads.zzdst;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzgad;
import com.google.android.gms.internal.ads.zzhbc;
import com.google.android.gms.internal.ads.zzhbk;
import com.google.android.gms.internal.ads.zzhbp;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes.dex */
public final class zzab implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;
    private final zzhbp zzh;
    private final zzhbp zzi;

    public zzab(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5, zzhbp zzhbpVar6, zzhbp zzhbpVar7, zzhbp zzhbpVar8, zzhbp zzhbpVar9) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
        this.zze = zzhbpVar5;
        this.zzf = zzhbpVar6;
        this.zzg = zzhbpVar7;
        this.zzh = zzhbpVar8;
        this.zzi = zzhbpVar9;
    }

    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzchw zzchwVar = (zzchw) this.zza.zzb();
        Context zza = ((zzcic) this.zzb).zza();
        zzaro zzaroVar = (zzaro) this.zzc.zzb();
        zzfek zzfekVar = (zzfek) this.zzd.zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzaa(zzchwVar, zza, zzaroVar, zzfekVar, zzgadVar, (ScheduledExecutorService) this.zzf.zzb(), (zzdst) this.zzg.zzb(), (zzfjx) this.zzh.zzb(), ((zzcio) this.zzi).zza());
    }
}
