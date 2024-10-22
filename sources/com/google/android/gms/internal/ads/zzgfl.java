package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzgfl extends zzghu {
    final /* synthetic */ zzgfm zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgfl(zzgfm zzgfmVar, Class cls) {
        super(cls);
        this.zza = zzgfmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgof zzc = zzgog.zzc();
        zzc.zzb(0);
        byte[] zzb = zzgjf.zzb(32);
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        return (zzgog) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* synthetic */ zzgvj zzb(zzgsr zzgsrVar) throws zzgul {
        return zzgoj.zzd(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", zzgfo.zzb(zzgfn.zza));
        hashMap.put("CHACHA20_POLY1305_RAW", zzgfo.zzb(zzgfn.zzc));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvjVar) throws GeneralSecurityException {
    }
}
