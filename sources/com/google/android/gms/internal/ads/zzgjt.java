package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgjt {
    private zzgkf zza = null;
    private zzgry zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzgjt(zzgjs zzgjsVar) {
    }

    public final zzgjt zza(zzgry zzgryVar) throws GeneralSecurityException {
        this.zzb = zzgryVar;
        return this;
    }

    public final zzgjt zzb(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgjt zzc(zzgkf zzgkfVar) {
        this.zza = zzgkfVar;
        return this;
    }

    public final zzgjv zzd() throws GeneralSecurityException {
        zzgry zzgryVar;
        zzgrx zzb;
        zzgkf zzgkfVar = this.zza;
        if (zzgkfVar != null && (zzgryVar = this.zzb) != null) {
            if (zzgkfVar.zzb() == zzgryVar.zza()) {
                if (zzgkfVar.zze() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zze() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzd() == zzgkd.zzd) {
                    zzb = zzgrx.zzb(new byte[0]);
                } else if (this.zza.zzd() != zzgkd.zzc && this.zza.zzd() != zzgkd.zzb) {
                    if (this.zza.zzd() == zzgkd.zza) {
                        zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                    } else {
                        throw new IllegalStateException("Unknown AesCmacParametersParameters.Variant: ".concat(String.valueOf(this.zza.zzd())));
                    }
                } else {
                    zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                }
                return new zzgjv(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzgjt() {
    }
}
