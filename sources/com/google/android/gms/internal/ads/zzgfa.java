package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzgfa {
    private Integer zza;
    private zzgfb zzb;

    public /* synthetic */ zzgfa(zzgez zzgezVar) {
        this.zza = null;
        this.zzb = zzgfb.zzc;
    }

    public final zzgfa zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgfa zzb(zzgfb zzgfbVar) {
        this.zzb = zzgfbVar;
        return this;
    }

    public final zzgfd zzc() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                return new zzgfd(num.intValue(), this.zzb, null);
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    private zzgfa() {
        this.zza = null;
        throw null;
    }
}
