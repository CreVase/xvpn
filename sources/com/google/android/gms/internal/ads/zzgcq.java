package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgcq {
    private zzgdb zza = null;
    private zzgry zzb = null;
    private zzgry zzc = null;
    private Integer zzd = null;

    public /* synthetic */ zzgcq(zzgcp zzgcpVar) {
    }

    public final zzgcq zza(zzgry zzgryVar) {
        this.zzb = zzgryVar;
        return this;
    }

    public final zzgcq zzb(zzgry zzgryVar) {
        this.zzc = zzgryVar;
        return this;
    }

    public final zzgcq zzc(Integer num) {
        this.zzd = num;
        return this;
    }

    public final zzgcq zzd(zzgdb zzgdbVar) {
        this.zza = zzgdbVar;
        return this;
    }

    public final zzgcs zze() throws GeneralSecurityException {
        zzgrx zzb;
        zzgdb zzgdbVar = this.zza;
        if (zzgdbVar != null) {
            zzgry zzgryVar = this.zzb;
            if (zzgryVar != null && this.zzc != null) {
                if (zzgdbVar.zza() == zzgryVar.zza()) {
                    if (zzgdbVar.zzb() == this.zzc.zza()) {
                        if (this.zza.zzg() && this.zzd == null) {
                            throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                        }
                        if (!this.zza.zzg() && this.zzd != null) {
                            throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                        }
                        if (this.zza.zzf() == zzgcz.zzc) {
                            zzb = zzgrx.zzb(new byte[0]);
                        } else if (this.zza.zzf() == zzgcz.zzb) {
                            zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzd.intValue()).array());
                        } else if (this.zza.zzf() == zzgcz.zza) {
                            zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzd.intValue()).array());
                        } else {
                            throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                        }
                        return new zzgcs(this.zza, this.zzb, this.zzc, zzb, this.zzd, null);
                    }
                    throw new GeneralSecurityException("HMAC key size mismatch");
                }
                throw new GeneralSecurityException("AES key size mismatch");
            }
            throw new GeneralSecurityException("Cannot build without key material");
        }
        throw new GeneralSecurityException("Cannot build without parameters");
    }

    private zzgcq() {
    }
}
