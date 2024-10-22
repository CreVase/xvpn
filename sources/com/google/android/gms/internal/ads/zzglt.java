package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzglt implements zzgkl {
    private final zzgks zza;

    public zzglt(zzgks zzgksVar) throws GeneralSecurityException {
        if (zzghf.zza(2)) {
            this.zza = zzgksVar;
            return;
        }
        throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
    }
}
