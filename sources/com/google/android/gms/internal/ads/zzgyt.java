package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgyt extends zzgtz implements zzgvk {
    private static final zzgyt zzb;
    private int zzd;
    private zzgys zze;
    private zzgsr zzg;
    private zzgsr zzh;
    private int zzi;
    private byte zzj = 2;
    private zzgui zzf = zzgtz.zzaN();

    static {
        zzgyt zzgytVar = new zzgyt();
        zzb = zzgytVar;
        zzgtz.zzaU(zzgyt.class, zzgytVar);
    }

    private zzgyt() {
        zzgsr zzgsrVar = zzgsr.zzb;
        this.zzg = zzgsrVar;
        this.zzh = zzgsrVar;
    }

    public static zzgyq zza() {
        return (zzgyq) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgyt zzgytVar, zzgyp zzgypVar) {
        zzgypVar.getClass();
        zzgui zzguiVar = zzgytVar.zzf;
        if (!zzguiVar.zzc()) {
            zzgytVar.zzf = zzgtz.zzaO(zzguiVar);
        }
        zzgytVar.zzf.add(zzgypVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b2 = 0;
                            }
                            this.zzj = b2;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgyq(null);
                }
                return new zzgyt();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", zzgyp.class, "zzg", "zzh", "zzi"});
        }
        return Byte.valueOf(this.zzj);
    }
}
