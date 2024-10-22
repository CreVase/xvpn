package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgqu implements zzgax {
    private final zzggv zza;
    private final byte[] zzb;

    public zzgqu(byte[] bArr) throws GeneralSecurityException {
        zzgrx zzb = zzgrx.zzb(new byte[0]);
        if (zzghf.zza(2)) {
            this.zza = new zzggv(bArr, true);
            this.zzb = zzb.zzc();
            return;
        }
        throw new GeneralSecurityException("Can not use AES-GCM in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0) {
            return this.zza.zza(Arrays.copyOf(bArr, 12), bArr, bArr2);
        }
        Charset charset = zzgjr.zza;
        if (bArr.length >= length) {
            for (int i = 0; i < bArr3.length; i++) {
                if (bArr[i] == bArr3[i]) {
                }
            }
            byte[] bArr4 = this.zzb;
            byte[] copyOfRange = Arrays.copyOfRange(bArr, bArr4.length, bArr.length);
            return this.zza.zza(Arrays.copyOf(copyOfRange, 12), copyOfRange, bArr2);
        }
        throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
    }
}
