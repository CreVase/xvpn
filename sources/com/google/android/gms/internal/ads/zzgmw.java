package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgmw extends zzgtz implements zzgvk {
    private static final zzgmw zzb;
    private int zzd;
    private int zze;
    private zzgnc zzf;
    private zzgoo zzg;

    static {
        zzgmw zzgmwVar = new zzgmw();
        zzb = zzgmwVar;
        zzgtz.zzaU(zzgmw.class, zzgmwVar);
    }

    private zzgmw() {
    }

    public static zzgmv zzc() {
        return (zzgmv) zzb.zzaA();
    }

    public static zzgmw zze(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgmw) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    public static /* synthetic */ void zzi(zzgmw zzgmwVar, zzgnc zzgncVar) {
        zzgncVar.getClass();
        zzgmwVar.zzf = zzgncVar;
        zzgmwVar.zzd |= 1;
    }

    public static /* synthetic */ void zzj(zzgmw zzgmwVar, zzgoo zzgooVar) {
        zzgooVar.getClass();
        zzgmwVar.zzg = zzgooVar;
        zzgmwVar.zzd |= 2;
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
                    return new zzgmv(null);
                }
                return new zzgmw();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgnc zzf() {
        zzgnc zzgncVar = this.zzf;
        if (zzgncVar == null) {
            return zzgnc.zze();
        }
        return zzgncVar;
    }

    public final zzgoo zzg() {
        zzgoo zzgooVar = this.zzg;
        if (zzgooVar == null) {
            return zzgoo.zze();
        }
        return zzgooVar;
    }
}
