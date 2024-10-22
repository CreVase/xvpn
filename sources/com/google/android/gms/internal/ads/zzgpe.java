package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgpe extends zzgtz implements zzgvk {
    private static final zzgpe zzb;
    private String zzd = "";
    private zzgsr zze = zzgsr.zzb;
    private int zzf;

    static {
        zzgpe zzgpeVar = new zzgpe();
        zzb = zzgpeVar;
        zzgtz.zzaU(zzgpe.class, zzgpeVar);
    }

    private zzgpe() {
    }

    public static zzgpd zza() {
        return (zzgpd) zzb.zzaA();
    }

    public static zzgpe zzd() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzgpc zzgpcVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgpd(zzgpcVar);
                }
                return new zzgpe();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgqf zze() {
        zzgqf zzb2 = zzgqf.zzb(this.zzf);
        if (zzb2 == null) {
            return zzgqf.UNRECOGNIZED;
        }
        return zzb2;
    }

    public final zzgsr zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
