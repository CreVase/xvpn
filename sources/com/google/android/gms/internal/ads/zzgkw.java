package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzgkw extends zzghu {
    final /* synthetic */ zzgkx zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgkw(zzgkx zzgkxVar, Class cls) {
        super(cls);
        this.zza = zzgkxVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgor zzgorVar = (zzgor) zzgvjVar;
        zzgon zzc = zzgoo.zzc();
        zzc.zzc(0);
        zzc.zzb(zzgorVar.zzg());
        byte[] zzb = zzgjf.zzb(zzgorVar.zza());
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        return (zzgoo) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* synthetic */ zzgvj zzb(zzgsr zzgsrVar) throws zzgul {
        return zzgor.zzf(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzglq.zza);
        zzgkz zzgkzVar = new zzgkz(null);
        zzgkzVar.zzb(32);
        zzgkzVar.zzc(16);
        zzglb zzglbVar = zzglb.zzd;
        zzgkzVar.zzd(zzglbVar);
        zzgla zzglaVar = zzgla.zzc;
        zzgkzVar.zza(zzglaVar);
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgkzVar.zze());
        zzgkz zzgkzVar2 = new zzgkz(null);
        zzgkzVar2.zzb(32);
        zzgkzVar2.zzc(32);
        zzglb zzglbVar2 = zzglb.zza;
        zzgkzVar2.zzd(zzglbVar2);
        zzgkzVar2.zza(zzglaVar);
        hashMap.put("HMAC_SHA256_256BITTAG", zzgkzVar2.zze());
        zzgkz zzgkzVar3 = new zzgkz(null);
        zzgkzVar3.zzb(32);
        zzgkzVar3.zzc(32);
        zzgkzVar3.zzd(zzglbVar);
        zzgkzVar3.zza(zzglaVar);
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgkzVar3.zze());
        zzgkz zzgkzVar4 = new zzgkz(null);
        zzgkzVar4.zzb(64);
        zzgkzVar4.zzc(16);
        zzgkzVar4.zzd(zzglbVar2);
        zzgla zzglaVar2 = zzgla.zze;
        zzgkzVar4.zza(zzglaVar2);
        hashMap.put("HMAC_SHA512_128BITTAG", zzgkzVar4.zze());
        zzgkz zzgkzVar5 = new zzgkz(null);
        zzgkzVar5.zzb(64);
        zzgkzVar5.zzc(16);
        zzgkzVar5.zzd(zzglbVar);
        zzgkzVar5.zza(zzglaVar2);
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgkzVar5.zze());
        zzgkz zzgkzVar6 = new zzgkz(null);
        zzgkzVar6.zzb(64);
        zzgkzVar6.zzc(32);
        zzgkzVar6.zzd(zzglbVar2);
        zzgkzVar6.zza(zzglaVar2);
        hashMap.put("HMAC_SHA512_256BITTAG", zzgkzVar6.zze());
        zzgkz zzgkzVar7 = new zzgkz(null);
        zzgkzVar7.zzb(64);
        zzgkzVar7.zzc(32);
        zzgkzVar7.zzd(zzglbVar);
        zzgkzVar7.zza(zzglaVar2);
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgkzVar7.zze());
        hashMap.put("HMAC_SHA512_512BITTAG", zzglq.zzd);
        zzgkz zzgkzVar8 = new zzgkz(null);
        zzgkzVar8.zzb(64);
        zzgkzVar8.zzc(64);
        zzgkzVar8.zzd(zzglbVar);
        zzgkzVar8.zza(zzglaVar2);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgkzVar8.zze());
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgor zzgorVar = (zzgor) zzgvjVar;
        if (zzgorVar.zza() >= 16) {
            zzgkx.zzn(zzgorVar.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
