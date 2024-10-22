package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgkq {
    private zzgld zza = null;
    private zzgry zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzgkq(zzgkp zzgkpVar) {
    }

    public final zzgkq zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgkq zzb(zzgry zzgryVar) {
        this.zzb = zzgryVar;
        return this;
    }

    public final zzgkq zzc(zzgld zzgldVar) {
        this.zza = zzgldVar;
        return this;
    }

    public final zzgks zzd() throws GeneralSecurityException {
        zzgry zzgryVar;
        zzgrx zzb;
        zzgld zzgldVar = this.zza;
        if (zzgldVar != null && (zzgryVar = this.zzb) != null) {
            if (zzgldVar.zzb() == zzgryVar.zza()) {
                if (zzgldVar.zzg() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzg() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzf() == zzglb.zzd) {
                    zzb = zzgrx.zzb(new byte[0]);
                } else if (this.zza.zzf() != zzglb.zzc && this.zza.zzf() != zzglb.zzb) {
                    if (this.zza.zzf() == zzglb.zza) {
                        zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown HmacParameters.Variant: ".concat(String.valueOf(this.zza.zzf())));
                    }
                } else {
                    zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                }
                return new zzgks(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzgkq() {
    }
}
