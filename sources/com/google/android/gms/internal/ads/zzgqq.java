package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes.dex */
public final class zzgqq implements zzgrp {
    private static final ThreadLocal zza = new zzgqp();
    private final SecretKeySpec zzb;
    private final int zzc;
    private final int zzd;

    public zzgqq(byte[] bArr, int i) throws GeneralSecurityException {
        if (zzghf.zza(2)) {
            zzgrv.zza(bArr.length);
            this.zzb = new SecretKeySpec(bArr, "AES");
            int blockSize = ((Cipher) zza.get()).getBlockSize();
            this.zzd = blockSize;
            if (i >= 12 && i <= blockSize) {
                this.zzc = i;
                return;
            }
            throw new GeneralSecurityException("invalid IV size");
        }
        throw new GeneralSecurityException("Can not use AES-CTR in FIPS-mode, as BoringCrypto module is not available.");
    }

    @Override // com.google.android.gms.internal.ads.zzgrp
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzc;
        if (length >= i) {
            byte[] bArr2 = new byte[i];
            System.arraycopy(bArr, 0, bArr2, 0, i);
            int i2 = this.zzc;
            int i3 = length - i2;
            byte[] bArr3 = new byte[i3];
            Cipher cipher = (Cipher) zza.get();
            byte[] bArr4 = new byte[this.zzd];
            System.arraycopy(bArr2, 0, bArr4, 0, this.zzc);
            cipher.init(2, this.zzb, new IvParameterSpec(bArr4));
            if (cipher.doFinal(bArr, i2, i3, bArr3, 0) == i3) {
                return bArr3;
            }
            throw new GeneralSecurityException("stored output's length does not match input's length");
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
