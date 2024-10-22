package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgbk {
    private final zzgbw zza;

    private zzgbk(zzgbw zzgbwVar) {
        this.zza = zzgbwVar;
    }

    public static zzgbk zza(zzgbw zzgbwVar) throws GeneralSecurityException {
        return new zzgbk(zzgbwVar);
    }

    public final zzgbw zzb() throws GeneralSecurityException {
        return this.zza;
    }
}
