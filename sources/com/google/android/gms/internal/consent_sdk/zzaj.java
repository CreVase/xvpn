package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaj extends zzc {
    private final zzaj zza = this;
    private final zzdr zzb;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;
    private final zzdr zzg;
    private final zzdr zzh;
    private final zzdr zzi;
    private final zzdr zzj;
    private final zzdr zzk;
    private final zzdr zzl;
    private final zzdr zzm;

    public /* synthetic */ zzaj(Application application, zzai zzaiVar) {
        zzag zzagVar;
        zzax zzaxVar;
        zzax zzaxVar2;
        zzax zzaxVar3;
        zzav zzavVar;
        zzax zzaxVar4;
        zzdo zza = zzdp.zza(application);
        this.zzb = zza;
        zzdr zza2 = zzdn.zza(new zzat(zza));
        this.zzc = zza2;
        zzagVar = zzaf.zza;
        zzdr zza3 = zzdn.zza(zzagVar);
        this.zzd = zza3;
        zzah zzahVar = new zzah(this);
        this.zze = zzahVar;
        zzaxVar = zzaw.zza;
        zzdr zza4 = zzdn.zza(new zzbr(zzahVar, zzaxVar));
        this.zzf = zza4;
        zzb zzbVar = new zzb(zza);
        this.zzg = zzbVar;
        zzq zzqVar = new zzq(zza, zzbVar, zza2);
        this.zzh = zzqVar;
        zzaxVar2 = zzaw.zza;
        zzdr zza5 = zzdn.zza(new zzh(zzaxVar2));
        this.zzi = zza5;
        zzaxVar3 = zzaw.zza;
        zzar zzarVar = new zzar(zza, zza2, zzaxVar3);
        this.zzj = zzarVar;
        zzad zzadVar = new zzad(zza5, zzarVar, zza2);
        this.zzk = zzadVar;
        zzavVar = zzau.zza;
        zzaxVar4 = zzaw.zza;
        zzy zzyVar = new zzy(zza, zza3, zzavVar, zzaxVar4, zza2, zza4, zzqVar, zzadVar, zza5);
        this.zzl = zzyVar;
        this.zzm = zzdn.zza(new zzm(zza2, zzyVar, zza4));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzc
    public final zzl zzb() {
        return (zzl) this.zzm.zzb();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzc
    public final zzbq zzc() {
        return (zzbq) this.zzf.zzb();
    }
}
