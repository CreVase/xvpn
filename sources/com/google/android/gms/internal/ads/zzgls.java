package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgls implements zzgkl {
    private final zzgjv zza;

    public zzgls(zzgjv zzgjvVar) throws GeneralSecurityException {
        if (zzghf.zza(1)) {
            this.zza = zzgjvVar;
            return;
        }
        throw new GeneralSecurityException("Can not use AES-CMAC in FIPS-mode.");
    }
}
