package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgga extends zzghv {
    public zzgga() {
        super(zzgqa.class, new zzgfy(zzgax.class));
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzghu zza() {
        return new zzgfz(this, zzgqd.class);
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzgoy zzb() {
        return zzgoy.REMOTE;
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* synthetic */ zzgvj zzc(zzgsr zzgsrVar) throws zzgul {
        return zzgqa.zze(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgqa zzgqaVar = (zzgqa) zzgvjVar;
        zzgrv.zzb(zzgqaVar.zza(), 0);
        if (zzgfx.zzb(zzgqaVar.zzf().zza().zzg())) {
        } else {
            throw new GeneralSecurityException(hx2.q("Unsupported DEK key type: ", zzgqaVar.zzf().zza().zzg(), ". Only Tink AEAD key types are supported."));
        }
    }
}
