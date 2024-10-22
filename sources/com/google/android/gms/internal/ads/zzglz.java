package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class zzglz implements zzgbv {
    private static final byte[] zza = {0};
    private final zzgbv zzb;
    private final zzgqf zzc;
    private final byte[] zzd;

    private zzglz(zzgbv zzgbvVar, zzgqf zzgqfVar, byte[] bArr) {
        this.zzb = zzgbvVar;
        this.zzc = zzgqfVar;
        this.zzd = bArr;
    }

    public static zzgbv zzb(zzghx zzghxVar) throws GeneralSecurityException {
        byte[] array;
        zzgjc zza2 = zzghxVar.zza(zzgbd.zza());
        zzgow zza3 = zzgoz.zza();
        zza3.zzb(zza2.zzg());
        zza3.zzc(zza2.zze());
        zza3.zza(zza2.zzb());
        zzgbv zzgbvVar = (zzgbv) zzgcg.zzc((zzgoz) zza3.zzal(), zzgbv.class);
        zzgqf zzc = zza2.zzc();
        zzgqf zzgqfVar = zzgqf.UNKNOWN_PREFIX;
        int ordinal = zzc.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (ordinal != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                } else {
                    array = new byte[0];
                }
            }
            array = ByteBuffer.allocate(5).put((byte) 0).putInt(zzghxVar.zzb().intValue()).array();
        } else {
            array = ByteBuffer.allocate(5).put((byte) 1).putInt(zzghxVar.zzb().intValue()).array();
        }
        return new zzglz(zzgbvVar, zzc, array);
    }

    @Override // com.google.android.gms.internal.ads.zzgbv
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 10) {
            if (this.zzc.equals(zzgqf.LEGACY)) {
                bArr2 = zzgqv.zzb(bArr2, zza);
            }
            byte[] bArr3 = new byte[0];
            if (!this.zzc.equals(zzgqf.RAW)) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                bArr = Arrays.copyOfRange(bArr, 5, length);
                bArr3 = copyOf;
            }
            if (Arrays.equals(this.zzd, bArr3)) {
                this.zzb.zza(bArr, bArr2);
                return;
            }
            throw new GeneralSecurityException("wrong prefix");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
