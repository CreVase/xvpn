package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgcv extends zzghv {
    public zzgcv() {
        super(zzgmw.class, new zzgct(zzgax.class));
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzghu zza() {
        return new zzgcu(this, zzgmz.class);
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* synthetic */ zzgvj zzc(zzgsr zzgsrVar) throws zzgul {
        return zzgmw.zze(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgmw zzgmwVar = (zzgmw) zzgvjVar;
        zzgrv.zzb(zzgmwVar.zza(), 0);
        new zzgdj();
        zzgdj.zzh(zzgmwVar.zzf());
        new zzgkx();
        zzgkx.zzm(zzgmwVar.zzg());
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final int zzf() {
        return 2;
    }
}
