package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgdp extends zzghu {
    final /* synthetic */ zzgdq zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgdp(zzgdq zzgdqVar, Class cls) {
        super(cls);
        this.zza = zzgdqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgno zzgnoVar = (zzgno) zzgvjVar;
        zzgnk zzc = zzgnl.zzc();
        byte[] zzb = zzgjf.zzb(zzgnoVar.zza());
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        zzc.zzb(zzgnoVar.zzf());
        zzc.zzc(0);
        return (zzgnl) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* synthetic */ zzgvj zzb(zzgsr zzgsrVar) throws zzgul {
        return zzgno.zze(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzggh.zzc);
        zzgds zzgdsVar = new zzgds(null);
        zzgdsVar.zza(16);
        zzgdsVar.zzb(16);
        zzgdsVar.zzc(16);
        zzgdt zzgdtVar = zzgdt.zzc;
        zzgdsVar.zzd(zzgdtVar);
        hashMap.put("AES128_EAX_RAW", zzgdsVar.zze());
        hashMap.put("AES256_EAX", zzggh.zzd);
        zzgds zzgdsVar2 = new zzgds(null);
        zzgdsVar2.zza(16);
        zzgdsVar2.zzb(32);
        zzgdsVar2.zzc(16);
        zzgdsVar2.zzd(zzgdtVar);
        hashMap.put("AES256_EAX_RAW", zzgdsVar2.zze());
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgno zzgnoVar = (zzgno) zzgvjVar;
        zzgrv.zza(zzgnoVar.zza());
        if (zzgnoVar.zzf().zza() != 12 && zzgnoVar.zzf().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
