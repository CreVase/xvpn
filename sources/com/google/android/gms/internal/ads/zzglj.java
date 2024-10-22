package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
final class zzglj implements zzgbv {
    private final zzgcd zza;
    private final zzgmd zzb;
    private final zzgmd zzc;

    public /* synthetic */ zzglj(zzgcd zzgcdVar, zzgli zzgliVar) {
        zzgmd zzgmdVar;
        this.zza = zzgcdVar;
        if (zzgcdVar.zzf()) {
            zzgme zzb = zzgie.zza().zzb();
            zzgmj zza = zzgib.zza(zzgcdVar);
            this.zzb = zzb.zza(zza, "mac", "compute");
            zzgmdVar = zzb.zza(zza, "mac", "verify");
        } else {
            zzgmdVar = zzgib.zza;
            this.zzb = zzgmdVar;
        }
        this.zzc = zzgmdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr.length > 5) {
            for (zzgbz zzgbzVar : this.zza.zze(Arrays.copyOf(bArr, 5))) {
                try {
                    ((zzgbv) zzgbzVar.zzd()).zza(bArr, bArr2);
                    zzgbzVar.zza();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            for (zzgbz zzgbzVar2 : this.zza.zze(zzgbc.zza)) {
                try {
                    ((zzgbv) zzgbzVar2.zzd()).zza(bArr, bArr2);
                    zzgbzVar2.zza();
                    return;
                } catch (GeneralSecurityException unused2) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
