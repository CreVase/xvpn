package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* loaded from: classes.dex */
public final class zzgey extends zzghv {
    public zzgey() {
        super(zzgoa.class, new zzgew(zzgax.class));
    }

    public static void zzg(boolean z) throws GeneralSecurityException {
        if (zzh()) {
            zzgcg.zzf(new zzgey(), true);
            int i = zzgfi.zza;
            zzgfi.zza(zzgii.zzb());
        }
    }

    private static boolean zzh() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzghu zza() {
        return new zzgex(this, zzgod.class);
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final zzgoy zzb() {
        return zzgoy.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* synthetic */ zzgvj zzc(zzgsr zzgsrVar) throws zzgul {
        return zzgoa.zze(zzgsrVar, zzgtl.zza());
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    @Override // com.google.android.gms.internal.ads.zzghv
    public final /* bridge */ /* synthetic */ void zze(zzgvj zzgvjVar) throws GeneralSecurityException {
        zzgoa zzgoaVar = (zzgoa) zzgvjVar;
        zzgrv.zzb(zzgoaVar.zza(), 0);
        zzgrv.zza(zzgoaVar.zzf().zzd());
    }
}
