package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgpl extends zzgtz implements zzgvk {
    private static final zzgpl zzb;
    private int zzd;
    private zzgoz zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzgpl zzgplVar = new zzgpl();
        zzb = zzgplVar;
        zzgtz.zzaU(zzgpl.class, zzgplVar);
    }

    private zzgpl() {
    }

    public static zzgpk zzd() {
        return (zzgpk) zzb.zzaA();
    }

    public static /* synthetic */ void zzg(zzgpl zzgplVar, zzgoz zzgozVar) {
        zzgozVar.getClass();
        zzgplVar.zze = zzgozVar;
        zzgplVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzgpi zzgpiVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgpk(zzgpiVar);
                }
                return new zzgpl();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }

    public final zzgoz zzc() {
        zzgoz zzgozVar = this.zze;
        if (zzgozVar == null) {
            return zzgoz.zze();
        }
        return zzgozVar;
    }

    public final zzgqf zzf() {
        zzgqf zzb2 = zzgqf.zzb(this.zzh);
        if (zzb2 == null) {
            return zzgqf.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final boolean zzj() {
        return (this.zzd & 1) != 0;
    }

    public final int zzk() {
        int i = this.zzf;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
