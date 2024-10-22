package com.google.android.gms.internal.ads;

import android.content.Context;

/* loaded from: classes.dex */
public final class zzebg implements zzhbc {
    private final zzhbp zza;
    private final zzhbp zzb;
    private final zzhbp zzc;
    private final zzhbp zzd;
    private final zzhbp zze;
    private final zzhbp zzf;
    private final zzhbp zzg;

    public zzebg(zzhbp zzhbpVar, zzhbp zzhbpVar2, zzhbp zzhbpVar3, zzhbp zzhbpVar4, zzhbp zzhbpVar5, zzhbp zzhbpVar6, zzhbp zzhbpVar7) {
        this.zza = zzhbpVar;
        this.zzb = zzhbpVar2;
        this.zzc = zzhbpVar3;
        this.zzd = zzhbpVar4;
        this.zze = zzhbpVar5;
        this.zzf = zzhbpVar6;
        this.zzg = zzhbpVar7;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.zzevk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, com.google.android.gms.internal.ads.zzevi] */
    @Override // com.google.android.gms.internal.ads.zzhbp
    public final /* synthetic */ Object zzb() {
        Context zza = ((zzcic) this.zza).zza();
        zzhbp zzhbpVar = this.zzc;
        ?? zzb = this.zzb.zzb();
        ?? zzb2 = zzhbpVar.zzb();
        zzebk zzebkVar = new zzebk();
        zzebn zzb3 = ((zzebo) this.zze).zzb();
        zzgad zzgadVar = zzcbg.zza;
        zzhbk.zzb(zzgadVar);
        return new zzebf(zza, zzb, zzb2, zzebkVar, zzb3, zzgadVar, new zzbvs());
    }
}
