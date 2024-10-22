package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgfm extends zzghv {
    public zzgfm() {
        super(zzgog.class, new zzgfk(zzgax.class));
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzghu zza() {
        return new zzgfl(this, zzgoj.class);
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* synthetic */ zzgvj zzc(zzgsr zzgsrVar) throws zzgul {
        return zzgog.zze(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgog zzgogVar = (zzgog) zzgvjVar;
        zzgrv.zzb(zzgogVar.zza(), 0);
        if (zzgogVar.zzf().zzd() == 32) {
        } else {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }
}
