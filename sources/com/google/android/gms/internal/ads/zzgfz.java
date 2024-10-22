package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
final class zzgfz extends zzghu {
    final /* synthetic */ zzgga zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgfz(zzgga zzggaVar, Class cls) {
        super(cls);
        this.zza = zzggaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ zzgvj zza(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgpz zzc = zzgqa.zzc();
        zzc.zza((zzgqd) zzgvjVar);
        zzc.zzb(0);
        return (zzgqa) zzc.zzal();
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* synthetic */ zzgvj zzb(zzgsr zzgsrVar) throws zzgul {
        return zzgqd.zze(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghu
    public final /* bridge */ /* synthetic */ void zzd(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgqd zzgqdVar = (zzgqd) zzgvjVar;
        if (zzgfx.zzb(zzgqdVar.zza().zzg())) {
            if (!zzgqdVar.zzf().isEmpty() && zzgqdVar.zzg()) {
                return;
            } else {
                throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
            }
        }
        throw new GeneralSecurityException(hx2.q("Unsupported DEK key type: ", zzgqdVar.zza().zzg(), ". Only Tink AEAD key types are supported."));
    }
}
