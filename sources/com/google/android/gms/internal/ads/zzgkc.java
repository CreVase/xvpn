package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* loaded from: classes.dex */
public final class zzgkc {
    private Integer zza;
    private Integer zzb;
    private zzgkd zzc;

    public /* synthetic */ zzgkc(zzgkb zzgkbVar) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzgkd.zzd;
    }

    public final zzgkc zza(int i) throws GeneralSecurityException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", Integer.valueOf(i * 8)));
        }
        this.zza = Integer.valueOf(i);
        return this;
    }

    public final zzgkc zzb(int i) throws GeneralSecurityException {
        if (i >= 10 && i <= 16) {
            this.zzb = Integer.valueOf(i);
            return this;
        }
        throw new GeneralSecurityException(hx2.m("Invalid tag size for AesCmacParameters: ", i));
    }

    public final zzgkc zzc(zzgkd zzgkdVar) {
        this.zzc = zzgkdVar;
        return this;
    }

    public final zzgkf zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null) {
            if (this.zzb != null) {
                if (this.zzc != null) {
                    return new zzgkf(num.intValue(), this.zzb.intValue(), this.zzc, null);
                }
                throw new GeneralSecurityException("variant not set");
            }
            throw new GeneralSecurityException("tag size not set");
        }
        throw new GeneralSecurityException("key size not set");
    }

    private zzgkc() {
        this.zza = null;
        this.zzb = null;
        throw null;
    }
}
