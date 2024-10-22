package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgdi extends zzghu {
    final /* synthetic */ zzgdj zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgdi(zzgdj zzgdjVar, Class cls) {
        super(cls);
        this.zza = zzgdjVar;
    }

    public static final zzgnc zzf(zzgnf zzgnfVar) throws GeneralSecurityException {
        zzgnb zzc = zzgnc.zzc();
        zzc.zzb(zzgnfVar.zzg());
        byte[] zzb = zzgjf.zzb(zzgnfVar.zza());
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        zzc.zzc(0);
        return (zzgnc) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvjVar) throws GeneralSecurityException {
        return zzf((zzgnf) zzgvjVar);
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* synthetic */ zzgvj zzb(zzgsr zzgsrVar) throws zzgul {
        return zzgnf.zzf(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    /* renamed from: zze, reason: merged with bridge method [inline-methods] */
    public final void zzd(zzgnf zzgnfVar) throws GeneralSecurityException {
        zzgrv.zza(zzgnfVar.zza());
        zzgdj zzgdjVar = this.zza;
        zzgdj.zzm(zzgnfVar.zzg());
    }
}
