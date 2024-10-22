package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzgqw implements zzgax {
    private final zzggy zza;

    public zzgqw(byte[] bArr) throws GeneralSecurityException {
        this.zza = new zzggy(bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 28) {
            return this.zza.zzb(ByteBuffer.wrap(bArr, 12, length - 12), Arrays.copyOf(bArr, 12), bArr2);
        }
        throw new GeneralSecurityException("ciphertext too short");
    }
}
