package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
final class zzggk extends zzghu {
    final /* synthetic */ zzggl zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzggk(zzggl zzgglVar, Class cls) {
        super(cls);
        this.zza = zzgglVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgqk zzc = zzgql.zzc();
        zzc.zzb(0);
        byte[] zzb = zzgjf.zzb(32);
        zzc.zza(zzgsr.zzv(zzb, 0, zzb.length));
        return (zzgql) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* synthetic */ zzgvj zzb(zzgsr zzgsrVar) throws zzgul {
        return zzgqo.zzd(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", zzggn.zzb(zzggm.zza));
        hashMap.put("XCHACHA20_POLY1305_RAW", zzggn.zzb(zzggm.zzc));
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvjVar) throws GeneralSecurityException {
    }
}
