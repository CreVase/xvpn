package com.google.android.gms.internal.ads;

import defpackage.hx2;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class zzggi extends zzgck {
    private final zzggn zza;
    private final zzgry zzb;
    private final zzgrx zzc;
    private final Integer zzd;

    private zzggi(zzggn zzggnVar, zzgry zzgryVar, zzgrx zzgrxVar, Integer num) {
        this.zza = zzggnVar;
        this.zzb = zzgryVar;
        this.zzc = zzgrxVar;
        this.zzd = num;
    }

    public static zzggi zza(zzggm zzggmVar, zzgry zzgryVar, Integer num) throws GeneralSecurityException {
        zzgrx zzb;
        zzggm zzggmVar2 = zzggm.zzc;
        if (zzggmVar != zzggmVar2 && num == null) {
            throw new GeneralSecurityException(hx2.q("For given Variant ", zzggmVar.toString(), " the value of idRequirement must be non-null"));
        }
        if (zzggmVar == zzggmVar2 && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        }
        if (zzgryVar.zza() == 32) {
            zzggn zzb2 = zzggn.zzb(zzggmVar);
            if (zzb2.zza() == zzggmVar2) {
                zzb = zzgrx.zzb(new byte[0]);
            } else if (zzb2.zza() == zzggm.zzb) {
                zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 0).putInt(num.intValue()).array());
            } else if (zzb2.zza() == zzggm.zza) {
                zzb = zzgrx.zzb(ByteBuffer.allocate(5).put((byte) 1).putInt(num.intValue()).array());
            } else {
                throw new IllegalStateException("Unknown Variant: ".concat(zzb2.zza().toString()));
            }
            return new zzggi(zzb2, zzgryVar, zzb, num);
        }
        throw new GeneralSecurityException(hx2.m("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not ", zzgryVar.zza()));
    }
}
