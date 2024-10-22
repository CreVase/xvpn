package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgec {
    private zzgem zza = null;
    private zzgry zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzgec(zzgeb zzgebVar) {
    }

    public final zzgec zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzgec zzb(zzgry zzgryVar) {
        this.zzb = zzgryVar;
        return this;
    }

    public final zzgec zzc(zzgem zzgemVar) {
        this.zza = zzgemVar;
        return this;
    }

    public final zzgee zzd() throws GeneralSecurityException {
        zzgry zzgryVar;
        zzgrx zzb;
        zzgem zzgemVar = this.zza;
        if (zzgemVar != null && (zzgryVar = this.zzb) != null) {
            if (zzgemVar.zza() == zzgryVar.zza()) {
                if (zzgemVar.zzc() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzc() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzb() == zzgek.zzc) {
                    zzb = zzgrx.zzb(new byte[0]);
                } else if (this.zza.zzb() == zzgek.zzb) {
                    zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzb() == zzgek.zza) {
                    zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesGcmParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
                }
                return new zzgee(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzgec() {
    }
}
