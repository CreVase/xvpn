package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgeh extends zzghv {
    public zzgeh() {
        super(zzgnu.class, new zzgef(zzgax.class));
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzghu zza() {
        return new zzgeg(this, zzgnx.class);
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* synthetic */ zzgvj zzc(zzgsr zzgsrVar) throws zzgul {
        return zzgnu.zze(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgnu zzgnuVar = (zzgnu) zzgvjVar;
        zzgrv.zzb(zzgnuVar.zza(), 0);
        zzgrv.zza(zzgnuVar.zzf().zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final int zzf() {
        return 2;
    }
}
