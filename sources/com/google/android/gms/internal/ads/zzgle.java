package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgle {

    @Deprecated
    static final zzgqi zza;

    @Deprecated
    static final zzgqi zzb;

    @Deprecated
    static final zzgqi zzc;

    static {
        new zzgkx();
        zzgqi zzc2 = zzgqi.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzglk.zzd();
        zzgko.zzd();
        zzgkx.zzh(true);
        if (zzghg.zzb()) {
            return;
        }
        zzgka.zzm(true);
    }
}
