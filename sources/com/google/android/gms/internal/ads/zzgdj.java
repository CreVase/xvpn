package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgdj extends zzghv {
    public zzgdj() {
        super(zzgnc.class, new zzgdh(zzgrp.class));
    }

    public static final void zzh(zzgnc zzgncVar) throws GeneralSecurityException {
        zzgrv.zzb(zzgncVar.zza(), 0);
        zzgrv.zza(zzgncVar.zzh().zzd());
        zzm(zzgncVar.zzg());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void zzm(zzgni zzgniVar) throws GeneralSecurityException {
        if (zzgniVar.zza() >= 12 && zzgniVar.zza() <= 16) {
        } else {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzghu zza() {
        return new zzgdi(this, zzgnf.class);
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* synthetic */ zzgvj zzc(zzgsr zzgsrVar) throws zzgul {
        return zzgnc.zzf(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzh((zzgnc) zzgvjVar);
    }
}
