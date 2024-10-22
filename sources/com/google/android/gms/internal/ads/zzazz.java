package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzazz extends zzgtz implements zzgvk {
    private static final zzazz zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzazz zzazzVar = new zzazz();
        zzb = zzazzVar;
        zzgtz.zzaU(zzazz.class, zzazzVar);
    }

    private zzazz() {
    }

    public static zzazs zza() {
        return (zzazs) zzb.zzaA();
    }

    public static zzazz zzd() {
        return zzb;
    }

    public static /* synthetic */ void zzi(zzazz zzazzVar, int i) {
        zzazzVar.zze = i - 1;
        zzazzVar.zzd |= 1;
    }

    public static /* synthetic */ void zzj(zzazz zzazzVar, int i) {
        zzazzVar.zzf = i - 1;
        zzazzVar.zzd |= 2;
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
                    return new zzazs(null);
                }
                return new zzazz();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzd", "zze", zzazx.zza, "zzf", zzazu.zza});
        }
        return (byte) 1;
    }

    public final boolean zze() {
        return (this.zzd & 2) != 0;
    }

    public final boolean zzf() {
        return (this.zzd & 1) != 0;
    }

    public final int zzg() {
        int zza = zzazv.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzh() {
        int zza = zzazy.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }
}
