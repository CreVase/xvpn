package com.google.android.gms.internal.ads;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* loaded from: classes.dex */
public final class zzapx {
    private final byte[] zza = new byte[UserVerificationMethods.USER_VERIFY_HANDPRINT];
    private int zzb;
    private int zzc;

    public zzapx(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.zza[i] = (byte) i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.zza;
            byte b2 = bArr2[i3];
            i2 = (i2 + b2 + bArr[i3 % bArr.length]) & 255;
            bArr2[i3] = bArr2[i2];
            bArr2[i2] = b2;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i = this.zzb;
        int i2 = this.zzc;
        for (int i3 = 0; i3 < 256; i3++) {
            byte[] bArr2 = this.zza;
            i = (i + 1) & 255;
            byte b2 = bArr2[i];
            i2 = (i2 + b2) & 255;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b2;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + b2) & 255] ^ bArr[i3]);
        }
        this.zzb = i;
        this.zzc = i2;
    }
}
