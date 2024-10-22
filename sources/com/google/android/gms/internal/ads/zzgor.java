package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgor extends zzgtz implements zzgvk {
    private static final zzgor zzb;
    private int zzd;
    private zzgou zze;
    private int zzf;
    private int zzg;

    static {
        zzgor zzgorVar = new zzgor();
        zzb = zzgorVar;
        zzgtz.zzaU(zzgor.class, zzgorVar);
    }

    private zzgor() {
    }

    public static zzgoq zzc() {
        return (zzgoq) zzb.zzaA();
    }

    public static zzgor zze() {
        return zzb;
    }

    public static zzgor zzf(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgor) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    public static /* synthetic */ void zzh(zzgor zzgorVar, zzgou zzgouVar) {
        zzgouVar.getClass();
        zzgorVar.zze = zzgouVar;
        zzgorVar.zzd |= 1;
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
                    return new zzgoq(null);
                }
                return new zzgor();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgou zzg() {
        zzgou zzgouVar = this.zze;
        if (zzgouVar == null) {
            return zzgou.zzf();
        }
        return zzgouVar;
    }
}
