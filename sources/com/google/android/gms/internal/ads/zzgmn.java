package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgmn extends zzgtz implements zzgvk {
    private static final zzgmn zzb;
    private int zzd;
    private int zze;
    private zzgsr zzf = zzgsr.zzb;
    private zzgmt zzg;

    static {
        zzgmn zzgmnVar = new zzgmn();
        zzb = zzgmnVar;
        zzgtz.zzaU(zzgmn.class, zzgmnVar);
    }

    private zzgmn() {
    }

    public static zzgmm zzc() {
        return (zzgmm) zzb.zzaA();
    }

    public static zzgmn zze(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgmn) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    public static /* synthetic */ void zzh(zzgmn zzgmnVar, int i) {
        zzgmnVar.zze = 0;
    }

    public static /* synthetic */ void zzj(zzgmn zzgmnVar, zzgmt zzgmtVar) {
        zzgmtVar.getClass();
        zzgmnVar.zzg = zzgmtVar;
        zzgmnVar.zzd |= 1;
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
                    zzgml zzgmlVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgmm(zzgmlVar);
                }
                return new zzgmn();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgmt zzf() {
        zzgmt zzgmtVar = this.zzg;
        if (zzgmtVar == null) {
            return zzgmt.zze();
        }
        return zzgmtVar;
    }

    public final zzgsr zzg() {
        return this.zzf;
    }
}
