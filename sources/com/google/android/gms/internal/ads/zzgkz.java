package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzgkz {
    private Integer zza;
    private Integer zzb;
    private zzgla zzc;
    private zzglb zzd;

    public /* synthetic */ zzgkz(zzgky zzgkyVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = zzglb.zzd;
    }

    public final zzgkz zza(zzgla zzglaVar) {
        this.zzc = zzglaVar;
        return this;
    }

    public final zzgkz zzb(int i) throws GeneralSecurityException {
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgkz zzc(int i) throws GeneralSecurityException {
        this.zzb = Integer.valueOf(i);
        return this;
    }

    public final zzgkz zzd(zzglb zzglbVar) {
        this.zzd = zzglbVar;
        return this;
    }

    public final zzgld zze() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    if (this.zzd != null) {
                        if (num.intValue() >= 16) {
                            int intValue = this.zzb.intValue();
                            zzgla zzglaVar = this.zzc;
                            if (intValue >= 10) {
                                if (zzglaVar == zzgla.zza) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                                    }
                                } else if (zzglaVar == zzgla.zzb) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                                    }
                                } else if (zzglaVar == zzgla.zzc) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                                    }
                                } else if (zzglaVar == zzgla.zzd) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                                    }
                                } else if (zzglaVar == zzgla.zze) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                                }
                                return new zzgld(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc, null);
                            }
                            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
                        }
                        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
                    }
                    throw new GeneralSecurityException("variant is not set");
                }
                throw new GeneralSecurityException("hash type is not set");
            }
            throw new GeneralSecurityException("tag size is not set");
        }
        throw new GeneralSecurityException("key size is not set");
    }

    private zzgkz() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        throw null;
    }
}
