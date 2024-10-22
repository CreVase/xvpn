package com.google.android.gms.internal.consent_sdk;

/* loaded from: classes.dex */
final class zzap implements zzaz {
    private final zzaj zza;
    private final zzap zzb = this;
    private final zzdr zzc;
    private final zzdr zzd;
    private final zzdr zze;
    private final zzdr zzf;
    private final zzdr zzg;

    public /* synthetic */ zzap(zzaj zzajVar, zzbs zzbsVar, zzao zzaoVar) {
        zzdr zzdrVar;
        zzdr zzdrVar2;
        zzav zzavVar;
        zzax zzaxVar;
        zzdr zzdrVar3;
        zzdr zzdrVar4;
        zzdr zzdrVar5;
        zzav zzavVar2;
        zzdr zzdrVar6;
        zzdr zzdrVar7;
        zzdr zzdrVar8;
        this.zza = zzajVar;
        zzdrVar = zzajVar.zzb;
        zzdr zza = zzdn.zza(new zzbz(zzdrVar));
        this.zzc = zza;
        zzdo zza2 = zzdp.zza(zzbsVar);
        this.zzd = zza2;
        zzdm zzdmVar = new zzdm();
        this.zze = zzdmVar;
        zzdrVar2 = zzajVar.zzb;
        zzavVar = zzau.zza;
        zzaxVar = zzaw.zza;
        zzdrVar3 = zzajVar.zzi;
        zzdrVar4 = zzajVar.zzj;
        zzdrVar5 = zzajVar.zzc;
        zzcd zzcdVar = new zzcd(zzdrVar2, zza, zzavVar, zzaxVar, zzdrVar3, zzdrVar4, zzdmVar, zzdrVar5);
        this.zzf = zzcdVar;
        zzavVar2 = zzau.zza;
        zzbx zzbxVar = new zzbx(zza, zzavVar2, zzcdVar);
        this.zzg = zzbxVar;
        zzdrVar6 = zzajVar.zzb;
        zzdrVar7 = zzajVar.zzd;
        zzdrVar8 = zzajVar.zzc;
        zzdm.zza(zzdmVar, zzdn.zza(new zzbf(zzdrVar6, zzdrVar7, zza, zzdrVar8, zza2, zzbxVar)));
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzaz
    public final zzbe zza() {
        return (zzbe) this.zze.zzb();
    }
}
