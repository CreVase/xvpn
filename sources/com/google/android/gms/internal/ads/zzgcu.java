package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgcu extends zzghu {
    final /* synthetic */ zzgcv zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgcu(zzgcv zzgcvVar, Class cls) {
        super(cls);
        this.zza = zzgcvVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgmz zzgmzVar = (zzgmz) zzgvjVar;
        new zzgdj();
        zzgnc zzf = zzgdi.zzf(zzgmzVar.zze());
        zzgvj zza = new zzgkx().zza().zza(zzgmzVar.zzf());
        zzgmv zzc = zzgmw.zzc();
        zzc.zza(zzf);
        zzc.zzb((zzgoo) zza);
        zzc.zzc(0);
        return (zzgmw) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* synthetic */ zzgvj zzb(zzgsr zzgsrVar) throws zzgul {
        return zzgmz.zzd(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzggh.zze);
        zzgcx zzgcxVar = new zzgcx(null);
        zzgcxVar.zza(16);
        zzgcxVar.zzc(32);
        zzgcxVar.zze(16);
        zzgcxVar.zzd(16);
        zzgcy zzgcyVar = zzgcy.zzc;
        zzgcxVar.zzb(zzgcyVar);
        zzgcz zzgczVar = zzgcz.zzc;
        zzgcxVar.zzf(zzgczVar);
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzgcxVar.zzg());
        hashMap.put("AES256_CTR_HMAC_SHA256", zzggh.zzf);
        zzgcx zzgcxVar2 = new zzgcx(null);
        zzgcxVar2.zza(32);
        zzgcxVar2.zzc(32);
        zzgcxVar2.zze(32);
        zzgcxVar2.zzd(16);
        zzgcxVar2.zzb(zzgcyVar);
        zzgcxVar2.zzf(zzgczVar);
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzgcxVar2.zzg());
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgmz zzgmzVar = (zzgmz) zzgvjVar;
        ((zzgdi) new zzgdj().zza()).zzd(zzgmzVar.zze());
        new zzgkx().zza().zzd(zzgmzVar.zzf());
        zzgrv.zza(zzgmzVar.zze().zza());
    }
}
