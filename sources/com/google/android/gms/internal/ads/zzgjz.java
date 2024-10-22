package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgjz extends zzghu {
    public zzgjz(zzgka zzgkaVar, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgmq zzgmqVar = (zzgmq) zzgvjVar;
        zzgmm zzc = zzgmn.zzc();
        zzc.zzc(0);
        byte[] zzb = zzgjf.zzb(zzgmqVar.zza());
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        zzc.zzb(zzgmqVar.zzf());
        return (zzgmn) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* synthetic */ zzgvj zzb(zzgsr zzgsrVar) throws zzgul {
        return zzgmq.zze(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgkf zzgkfVar = zzglq.zze;
        hashMap.put("AES_CMAC", zzgkfVar);
        hashMap.put("AES256_CMAC", zzgkfVar);
        zzgkc zzgkcVar = new zzgkc(null);
        zzgkcVar.zza(32);
        zzgkcVar.zzb(16);
        zzgkcVar.zzc(zzgkd.zzd);
        hashMap.put("AES256_CMAC_RAW", zzgkcVar.zzd());
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgmq zzgmqVar = (zzgmq) zzgvjVar;
        zzgka.zzn(zzgmqVar.zzf());
        zzgka.zzo(zzgmqVar.zza());
    }
}
