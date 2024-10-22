package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzapw extends zzgtz implements zzgvk {
    private static final zzapw zzb;
    private int zzd;
    private zzgui zze = zzgtz.zzaN();
    private zzgsr zzf = zzgsr.zzb;
    private int zzg = 1;
    private int zzh = 1;

    static {
        zzapw zzapwVar = new zzapw();
        zzb = zzapwVar;
        zzgtz.zzaU(zzapw.class, zzapwVar);
    }

    private zzapw() {
    }

    public static zzapv zza() {
        return (zzapv) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzapw zzapwVar, zzgsr zzgsrVar) {
        zzgui zzguiVar = zzapwVar.zze;
        if (!zzguiVar.zzc()) {
            zzapwVar.zze = zzgtz.zzaO(zzguiVar);
        }
        zzapwVar.zze.add(zzgsrVar);
    }

    public static /* synthetic */ void zze(zzapw zzapwVar, zzgsr zzgsrVar) {
        zzapwVar.zzd |= 1;
        zzapwVar.zzf = zzgsrVar;
    }

    public static /* synthetic */ void zzf(zzapw zzapwVar, int i) {
        zzapwVar.zzh = 4;
        zzapwVar.zzd = 4 | zzapwVar.zzd;
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
                    return new zzapv(null);
                }
                return new zzapw();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003᠌\u0001\u0004᠌\u0002", new Object[]{"zzd", "zze", "zzf", "zzg", zzapq.zza, "zzh", zzapo.zza});
        }
        return (byte) 1;
    }
}
