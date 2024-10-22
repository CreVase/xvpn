package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzgej {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private zzgek zzd;

    public /* synthetic */ zzgej(zzgei zzgeiVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzgek.zzc;
    }

    public final zzgej zza(int i) throws GeneralSecurityException {
        this.zzb = 12;
        return this;
    }

    public final zzgej zzb(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgej zzc(int i) throws GeneralSecurityException {
        this.zzc = 16;
        return this;
    }

    public final zzgej zzd(zzgek zzgekVar) {
        this.zzd = zzgekVar;
        return this;
    }

    public final zzgem zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzd != null) {
                if (this.zzb != null) {
                    if (this.zzc != null) {
                        int intValue = num.intValue();
                        this.zzb.intValue();
                        this.zzc.intValue();
                        return new zzgem(intValue, 12, 16, this.zzd, null);
                    }
                    throw new GeneralSecurityException("Tag size is not set");
                }
                throw new GeneralSecurityException("IV size is not set");
            }
            throw new GeneralSecurityException("Variant is not set");
        }
        throw new GeneralSecurityException("Key size is not set");
    }

    private zzgej() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }
}
