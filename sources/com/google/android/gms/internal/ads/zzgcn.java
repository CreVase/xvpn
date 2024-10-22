package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzgcn implements zzgax {
    private final zzgcd zza;
    private final zzgmd zzb;
    private final zzgmd zzc;

    public /* synthetic */ zzgcn(zzgcd zzgcdVar, zzgcm zzgcmVar) {
        zzgmd zzgmdVar;
        this.zza = zzgcdVar;
        if (zzgcdVar.zzf()) {
            zzgme zzb = zzgie.zza().zzb();
            zzgmj zza = zzgib.zza(zzgcdVar);
            this.zzb = zzb.zza(zza, "aead", "encrypt");
            zzgmdVar = zzb.zza(zza, "aead", "decrypt");
        } else {
            zzgmdVar = zzgib.zza;
            this.zzb = zzgmdVar;
        }
        this.zzc = zzgmdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzgbz zzgbzVar : this.zza.zze(copyOf)) {
                try {
                    byte[] zza = ((zzgax) zzgbzVar.zze()).zza(copyOfRange, bArr2);
                    zzgbzVar.zza();
                    int length2 = copyOfRange.length;
                    return zza;
                } catch (GeneralSecurityException unused) {
                }
            }
        }
        for (zzgbz zzgbzVar2 : this.zza.zze(zzgbc.zza)) {
            try {
                byte[] zza2 = ((zzgax) zzgbzVar2.zze()).zza(bArr, bArr2);
                zzgbzVar2.zza();
                return zza2;
            } catch (GeneralSecurityException unused2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
