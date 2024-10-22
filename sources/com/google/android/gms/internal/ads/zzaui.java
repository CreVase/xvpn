package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzaui extends zzgtz implements zzgvk {
    private static final zzaui zzb;
    private int zzd;
    private zzaul zze;
    private zzgsr zzf;
    private zzgsr zzg;

    static {
        zzaui zzauiVar = new zzaui();
        zzb = zzauiVar;
        zzgtz.zzaU(zzaui.class, zzauiVar);
    }

    private zzaui() {
        zzgsr zzgsrVar = zzgsr.zzb;
        this.zzf = zzgsrVar;
        this.zzg = zzgsrVar;
    }

    public static zzaui zzc(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzaui) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzaug zzaugVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzauh(zzaugVar);
                }
                return new zzaui();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzaul zzd() {
        zzaul zzaulVar = this.zze;
        if (zzaulVar == null) {
            return zzaul.zzg();
        }
        return zzaulVar;
    }

    public final zzgsr zze() {
        return this.zzg;
    }

    public final zzgsr zzf() {
        return this.zzf;
    }
}
