package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
final class zzgkv extends zzgiv {
    public zzgkv(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzgiv
    public final /* bridge */ /* synthetic */ Object zza(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgoo zzgooVar = (zzgoo) zzgvjVar;
        zzgol zzc = zzgooVar.zzg().zzc();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgooVar.zzh().zzA(), "HMAC");
        int zza = zzgooVar.zzg().zza();
        zzgol zzgolVar = zzgol.UNKNOWN_HASH;
        int ordinal = zzc.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return new zzgrt(new zzgrs("HMACSHA224", secretKeySpec), zza);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new zzgrt(new zzgrs("HMACSHA512", secretKeySpec), zza);
                }
                return new zzgrt(new zzgrs("HMACSHA256", secretKeySpec), zza);
            }
            return new zzgrt(new zzgrs("HMACSHA384", secretKeySpec), zza);
        }
        return new zzgrt(new zzgrs("HMACSHA1", secretKeySpec), zza);
    }
}
