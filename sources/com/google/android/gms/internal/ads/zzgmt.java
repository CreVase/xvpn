package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgmt extends zzgtz implements zzgvk {
    private static final zzgmt zzb;
    private int zzd;

    static {
        zzgmt zzgmtVar = new zzgmt();
        zzb = zzgmtVar;
        zzgtz.zzaU(zzgmt.class, zzgmtVar);
    }

    private zzgmt() {
    }

    public static zzgms zzc() {
        return (zzgms) zzb.zzaA();
    }

    public static zzgmt zze() {
        return zzb;
    }

    public final int zza() {
        return this.zzd;
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
                    return new zzgms(null);
                }
                return new zzgmt();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzd"});
        }
        return (byte) 1;
    }
}
