package com.google.android.gms.internal.ads;

import android.util.Base64;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzfea {
    public zzfea() {
        try {
            zzgcj.zza();
        } catch (GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to Configure Aead. ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.registerAead");
        }
    }

    public static final String zza() {
        zzgso zzt = zzgsr.zzt();
        try {
            zzgba.zzb(zzgbs.zzc(zzgbl.zza("AES128_GCM").zzb()), zzgaz.zzb(zzt));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to generate key".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.generateKey");
        }
        String encodeToString = Base64.encodeToString(zzt.zzb().zzA(), 11);
        zzt.zzc();
        return encodeToString;
    }

    public static final String zzb(byte[] bArr, byte[] bArr2, String str, zzdsj zzdsjVar) {
        zzgbs zzc = zzc(str);
        if (zzc == null) {
            return null;
        }
        try {
            byte[] zza = ((zzgax) zzc.zze(zzgjg.zza(), zzgax.class)).zza(bArr, bArr2);
            zzdsjVar.zza().put("ds", "1");
            return new String(zza, "UTF-8");
        } catch (UnsupportedEncodingException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to decrypt ".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.decrypt");
            zzdsjVar.zza().put("dsf", e.toString());
            return null;
        }
    }

    private static final zzgbs zzc(String str) {
        try {
            return zzgba.zza(zzgay.zzb(Base64.decode(str, 11)));
        } catch (IOException | GeneralSecurityException e) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed to get keysethandle".concat(e.toString()));
            com.google.android.gms.ads.internal.zzt.zzo().zzu(e, "CryptoUtils.getHandle");
            return null;
        }
    }
}
