package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzgcx {
    private Integer zza;
    private Integer zzb;
    private Integer zzc;
    private Integer zzd;
    private zzgcy zze;
    private zzgcz zzf;

    public /* synthetic */ zzgcx(zzgcw zzgcwVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        this.zzf = zzgcz.zzc;
    }

    public final zzgcx zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 24 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte, 24-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgcx zzb(zzgcy zzgcyVar) {
        this.zze = zzgcyVar;
        return this;
    }

    public final zzgcx zzc(int i) throws GeneralSecurityException {
        if (i >= 16) {
            this.zzb = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; HMAC key must be at least 16 bytes", Integer.valueOf(i)));
    }

    public final zzgcx zzd(int i) throws GeneralSecurityException {
        if (i >= 12 && i <= 16) {
            this.zzc = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d; IV size must be between 12 and 16 bytes", Integer.valueOf(i)));
    }

    public final zzgcx zze(int i) throws GeneralSecurityException {
        if (i >= 10) {
            this.zzd = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(i)));
    }

    public final zzgcx zzf(zzgcz zzgczVar) {
        this.zzf = zzgczVar;
        return this;
    }

    public final zzgdb zzg() throws GeneralSecurityException {
        if (this.zza != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    Integer num = this.zzd;
                    if (num != null) {
                        if (this.zze != null) {
                            if (this.zzf != null) {
                                int intValue = num.intValue();
                                zzgcy zzgcyVar = this.zze;
                                if (zzgcyVar == zzgcy.zza) {
                                    if (intValue > 20) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                                    }
                                } else if (zzgcyVar == zzgcy.zzb) {
                                    if (intValue > 28) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                                    }
                                } else if (zzgcyVar == zzgcy.zzc) {
                                    if (intValue > 32) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                                    }
                                } else if (zzgcyVar == zzgcy.zzd) {
                                    if (intValue > 48) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                                    }
                                } else if (zzgcyVar == zzgcy.zze) {
                                    if (intValue > 64) {
                                        throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                                    }
                                } else {
                                    throw new GeneralSecurityException("unknown hash type; must be SHA1, SHA224, SHA256, SHA384 or SHA512");
                                }
                                return new zzgdb(this.zza.intValue(), this.zzb.intValue(), this.zzc.intValue(), this.zzd.intValue(), this.zzf, this.zze, null);
                            }
                            throw new GeneralSecurityException("variant is not set");
                        }
                        throw new GeneralSecurityException("hash type is not set");
                    }
                    throw new GeneralSecurityException("tag size is not set");
                }
                throw new GeneralSecurityException("iv size is not set");
            }
            throw new GeneralSecurityException("HMAC key size is not set");
        }
        throw new GeneralSecurityException("AES key size is not set");
    }

    private zzgcx() {
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
        this.zzd = null;
        this.zze = null;
        throw null;
    }
}
