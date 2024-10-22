package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgex extends zzghu {
    final /* synthetic */ zzgey zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgex(zzgey zzgeyVar, Class cls) {
        super(cls);
        this.zza = zzgeyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgnz zzc = zzgoa.zzc();
        byte[] zzb = zzgjf.zzb(((zzgod) zzgvjVar).zza());
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        zzc.zzb(0);
        return (zzgoa) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* synthetic */ zzgvj zzb(zzgsr zzgsrVar) throws zzgul {
        return zzgod.zze(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgfa zzgfaVar = new zzgfa(null);
        zzgfaVar.zza(16);
        zzgfb zzgfbVar = zzgfb.zza;
        zzgfaVar.zzb(zzgfbVar);
        hashMap.put("AES128_GCM_SIV", zzgfaVar.zzc());
        zzgfa zzgfaVar2 = new zzgfa(null);
        zzgfaVar2.zza(16);
        zzgfb zzgfbVar2 = zzgfb.zzc;
        zzgfaVar2.zzb(zzgfbVar2);
        hashMap.put("AES128_GCM_SIV_RAW", zzgfaVar2.zzc());
        zzgfa zzgfaVar3 = new zzgfa(null);
        zzgfaVar3.zza(32);
        zzgfaVar3.zzb(zzgfbVar);
        hashMap.put("AES256_GCM_SIV", zzgfaVar3.zzc());
        zzgfa zzgfaVar4 = new zzgfa(null);
        zzgfaVar4.zza(32);
        zzgfaVar4.zzb(zzgfbVar2);
        hashMap.put("AES256_GCM_SIV_RAW", zzgfaVar4.zzc());
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* synthetic */ void zzd(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgrv.zza(((zzgod) zzgvjVar).zza());
    }
}
