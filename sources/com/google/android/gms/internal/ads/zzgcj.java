package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgcj {

    @Deprecated
    static final zzgqi zza;

    @Deprecated
    static final zzgqi zzb;

    @Deprecated
    static final zzgqi zzc;

    static {
        new zzgcv();
        new zzgeh();
        new zzgey();
        new zzgdq();
        new zzgfw();
        new zzgga();
        new zzgfm();
        new zzggl();
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
        zzgco.zzd();
        zzgle.zza();
        zzgcg.zzf(new zzgcv(), true);
        int i = zzgdg.zza;
        zzgdg.zza(zzgii.zzb());
        zzgcg.zzf(new zzgeh(), true);
        int i2 = zzger.zza;
        zzger.zza(zzgii.zzb());
        if (zzghg.zzb()) {
            return;
        }
        zzgcg.zzf(new zzgdq(), true);
        int i3 = zzgea.zza;
        zzgea.zza(zzgii.zzb());
        zzgey.zzg(true);
        zzgcg.zzf(new zzgfm(), true);
        int i4 = zzgft.zza;
        zzgft.zza(zzgii.zzb());
        zzgcg.zzf(new zzgfw(), true);
        zzgcg.zzf(new zzgga(), true);
        zzgcg.zzf(new zzggl(), true);
        int i5 = zzggs.zza;
        zzggs.zza(zzgii.zzb());
    }
}
