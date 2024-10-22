package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgnl extends zzgtz implements zzgvk {
    private static final zzgnl zzb;
    private int zzd;
    private int zze;
    private zzgnr zzf;
    private zzgsr zzg = zzgsr.zzb;

    static {
        zzgnl zzgnlVar = new zzgnl();
        zzb = zzgnlVar;
        zzgtz.zzaU(zzgnl.class, zzgnlVar);
    }

    private zzgnl() {
    }

    public static zzgnk zzc() {
        return (zzgnk) zzb.zzaA();
    }

    public static zzgnl zze(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgnl) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    public static /* synthetic */ void zzi(zzgnl zzgnlVar, zzgnr zzgnrVar) {
        zzgnrVar.getClass();
        zzgnlVar.zzf = zzgnrVar;
        zzgnlVar.zzd |= 1;
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
                    zzgnj zzgnjVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgnk(zzgnjVar);
                }
                return new zzgnl();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgnr zzf() {
        zzgnr zzgnrVar = this.zzf;
        if (zzgnrVar == null) {
            return zzgnr.zze();
        }
        return zzgnrVar;
    }

    public final zzgsr zzg() {
        return this.zzg;
    }
}
