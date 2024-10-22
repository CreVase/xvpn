package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzget {
    private zzgfd zza = null;
    private zzgry zzb = null;
    private Integer zzc = null;

    public /* synthetic */ zzget(zzges zzgesVar) {
    }

    public final zzget zza(Integer num) {
        this.zzc = num;
        return this;
    }

    public final zzget zzb(zzgry zzgryVar) {
        this.zzb = zzgryVar;
        return this;
    }

    public final zzget zzc(zzgfd zzgfdVar) {
        this.zza = zzgfdVar;
        return this;
    }

    public final zzgev zzd() throws GeneralSecurityException {
        zzgry zzgryVar;
        zzgrx zzb;
        zzgfd zzgfdVar = this.zza;
        if (zzgfdVar != null && (zzgryVar = this.zzb) != null) {
            if (zzgfdVar.zza() == zzgryVar.zza()) {
                if (zzgfdVar.zzc() && this.zzc == null) {
                    throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
                }
                if (!this.zza.zzc() && this.zzc != null) {
                    throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
                }
                if (this.zza.zzb() == zzgfb.zzc) {
                    zzb = zzgrx.zzb(new byte[0]);
                } else if (this.zza.zzb() == zzgfb.zzb) {
                    zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(this.zzc.intValue()).array());
                } else if (this.zza.zzb() == zzgfb.zza) {
                    zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(this.zzc.intValue()).array());
                } else {
                    throw new IllegalStateException("Unknown AesGcmSivParameters.Variant: ".concat(String.valueOf(this.zza.zzb())));
                }
                return new zzgev(this.zza, this.zzb, zzb, this.zzc, null);
            }
            throw new GeneralSecurityException("Key size mismatch");
        }
        throw new GeneralSecurityException("Cannot build without parameters and/or key material");
    }

    private zzget() {
    }
}
