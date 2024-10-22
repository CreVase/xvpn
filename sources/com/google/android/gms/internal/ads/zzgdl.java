package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgdl {
    private zzgdv zza = null;
    private zzgry zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzgdl(zzgdk zzgdkVar) {
    }

    public final zzgdl zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgdl zzb(zzgry zzgryVar) {
        this.zzb = zzgryVar;
        return this;
    }

    public final zzgdl zzc(zzgdv zzgdvVar) {
        this.zza = zzgdvVar;
        return this;
    }

    public final zzgdn zzd() throws GeneralSecurityException {
        zzgry zzgryVar;
        zzgrx zzb;
        zzgdv zzgdvVar = this.zza;
        if (zzgdvVar != null && (zzgryVar = this.zzb) != null) {
            if (zzgdvVar.zzb() == zzgryVar.zza()) {
                if (zzgdvVar.zzd() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzd() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzc() == zzgdt.zzc) {
                    zzb = zzgrx.zzb(new byte[0]);
                } else if (this.zza.zzc() == zzgdt.zzb) {
                    zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzc() == zzgdt.zza) {
                    zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesEaxParameters.Variant: ".concat(String.valueOf(this.zza.zzc())));
                }
                return new zzgdn(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzgdl() {
    }
}
