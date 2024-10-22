package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgeg extends zzghu {
    final /* synthetic */ zzgeh zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgeg(zzgeh zzgehVar, Class cls) {
        super(cls);
        this.zza = zzgehVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgnt zzc = zzgnu.zzc();
        byte[] zzb = zzgjf.zzb(((zzgnx) zzgvjVar).zza());
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        zzc.zzb(0);
        return (zzgnu) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* synthetic */ zzgvj zzb(zzgsr zzgsrVar) throws zzgul {
        return zzgnx.zze(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzggh.zza);
        zzgej zzgejVar = new zzgej(null);
        zzgejVar.zza(12);
        zzgejVar.zzb(16);
        zzgejVar.zzc(16);
        zzgek zzgekVar = zzgek.zzc;
        zzgejVar.zzd(zzgekVar);
        hashMap.put("AES128_GCM_RAW", zzgejVar.zze());
        hashMap.put("AES256_GCM", zzggh.zzb);
        zzgej zzgejVar2 = new zzgej(null);
        zzgejVar2.zza(12);
        zzgejVar2.zzb(32);
        zzgejVar2.zzc(16);
        zzgejVar2.zzd(zzgekVar);
        hashMap.put("AES256_GCM_RAW", zzgejVar2.zze());
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* synthetic */ void zzd(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgrv.zza(((zzgnx) zzgvjVar).zza());
    }
}
