package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgoo extends zzgtz implements zzgvk {
    private static final zzgoo zzb;
    private int zzd;
    private int zze;
    private zzgou zzf;
    private zzgsr zzg = zzgsr.zzb;

    static {
        zzgoo zzgooVar = new zzgoo();
        zzb = zzgooVar;
        zzgtz.zzaU(zzgoo.class, zzgooVar);
    }

    private zzgoo() {
    }

    public static zzgon zzc() {
        return (zzgon) zzb.zzaA();
    }

    public static zzgoo zze() {
        return zzb;
    }

    public static zzgoo zzf(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgoo) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    public static /* synthetic */ void zzj(zzgoo zzgooVar, zzgou zzgouVar) {
        zzgouVar.getClass();
        zzgooVar.zzf = zzgouVar;
        zzgooVar.zzd |= 1;
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
                    zzgom zzgomVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgon(zzgomVar);
                }
                return new zzgoo();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }

    public final zzgou zzg() {
        zzgou zzgouVar = this.zzf;
        if (zzgouVar == null) {
            return zzgou.zzf();
        }
        return zzgouVar;
    }

    public final zzgsr zzh() {
        return this.zzg;
    }
}
