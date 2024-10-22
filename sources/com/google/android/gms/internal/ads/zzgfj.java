package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzgfj extends zzgck {
    private final zzgfo zza;
    private final zzgry zzb;
    private final zzgrx zzc;
    private final Integer zzd;

    private zzgfj(zzgfo zzgfoVar, zzgry zzgryVar, zzgrx zzgrxVar, Integer num) {
        this.zza = zzgfoVar;
        this.zzb = zzgryVar;
        this.zzc = zzgrxVar;
        this.zzd = num;
    }

    public static zzgfj zza(zzgfn zzgfnVar, zzgry zzgryVar, Integer num) throws GeneralSecurityException {
        zzgrx zzb;
        zzgfn zzgfnVar2 = zzgfn.zzc;
        if (zzgfnVar != zzgfnVar2 && num == null) {
            throw new GeneralSecurityException(hx2.q("For given Variant ", zzgfnVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzgfnVar == zzgfnVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgryVar.zza() == 32) {
            zzgfo zzb2 = zzgfo.zzb(zzgfnVar);
            if (zzb2.zza() == zzgfnVar2) {
                zzb = zzgrx.zzb(new byte[0]);
            } else if (zzb2.zza() == zzgfn.zzb) {
                zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (zzb2.zza() == zzgfn.zza) {
                zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zza().toString()));
            }
            return new zzgfj(zzb2, zzgryVar, zzb, num);
        }
        throw new GeneralSecurityException(hx2.m("ChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgryVar.zza()));
    }
}
