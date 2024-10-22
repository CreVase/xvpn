package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgou extends zzgtz implements zzgvk {
    private static final zzgou zzb;
    private int zzd;
    private int zze;

    static {
        zzgou zzgouVar = new zzgou();
        zzb = zzgouVar;
        zzgtz.zzaU(zzgou.class, zzgouVar);
    }

    private zzgou() {
    }

    public static zzgot zzd() {
        return (zzgot) zzb.zzaA();
    }

    public static zzgou zzf() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgot(null);
                }
                return new zzgou();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }

    public final zzgol zzc() {
        zzgol zzgolVar;
        int i = this.zzd;
        zzgol zzgolVar2 = zzgol.UNKNOWN_HASH;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                zzgolVar = null;
                            } else {
                                zzgolVar = zzgol.SHA224;
                            }
                        } else {
                            zzgolVar = zzgol.SHA512;
                        }
                    } else {
                        zzgolVar = zzgol.SHA256;
                    }
                } else {
                    zzgolVar = zzgol.SHA384;
                }
            } else {
                zzgolVar = zzgol.SHA1;
            }
        } else {
            zzgolVar = zzgol.UNKNOWN_HASH;
        }
        if (zzgolVar == null) {
            return zzgol.UNRECOGNIZED;
        }
        return zzgolVar;
    }
}
