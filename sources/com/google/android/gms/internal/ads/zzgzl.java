package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgzl extends zzgtz implements zzgvk {
    private static final zzgzl zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private zzgsr zzg;
    private zzgsr zzh;

    static {
        zzgzl zzgzlVar = new zzgzl();
        zzb = zzgzlVar;
        zzgtz.zzaU(zzgzl.class, zzgzlVar);
    }

    private zzgzl() {
        zzgsr zzgsrVar = zzgsr.zzb;
        this.zzg = zzgsrVar;
        this.zzh = zzgsrVar;
    }

    public static zzgzj zza() {
        return (zzgzj) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgzl zzgzlVar, String str) {
        zzgzlVar.zzd |= 2;
        zzgzlVar.zzf = "image/png";
    }

    public static /* synthetic */ void zze(zzgzl zzgzlVar, zzgsr zzgsrVar) {
        zzgsrVar.getClass();
        zzgzlVar.zzd |= 4;
        zzgzlVar.zzg = zzgsrVar;
    }

    public static /* synthetic */ void zzf(zzgzl zzgzlVar, int i) {
        zzgzlVar.zze = 1;
        zzgzlVar.zzd = 1 | zzgzlVar.zzd;
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
                    return new zzgzj(null);
                }
                return new zzgzl();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"zzd", "zze", zzgzk.zza, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
