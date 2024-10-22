package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgnf extends zzgtz implements zzgvk {
    private static final zzgnf zzb;
    private int zzd;
    private zzgni zze;
    private int zzf;

    static {
        zzgnf zzgnfVar = new zzgnf();
        zzb = zzgnfVar;
        zzgtz.zzaU(zzgnf.class, zzgnfVar);
    }

    private zzgnf() {
    }

    public static zzgne zzc() {
        return (zzgne) zzb.zzaA();
    }

    public static zzgnf zze() {
        return zzb;
    }

    public static zzgnf zzf(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgnf) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    public static /* synthetic */ void zzh(zzgnf zzgnfVar, zzgni zzgniVar) {
        zzgniVar.getClass();
        zzgnfVar.zze = zzgniVar;
        zzgnfVar.zzd |= 1;
    }

    public final int zza() {
        return this.zzf;
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
                    return new zzgne(null);
                }
                return new zzgnf();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgni zzg() {
        zzgni zzgniVar = this.zze;
        if (zzgniVar == null) {
            return zzgni.zze();
        }
        return zzgniVar;
    }
}
