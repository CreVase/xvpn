package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgyp extends zzgtz implements zzgvk {
    private static final zzgyp zzb;
    private int zzd;
    private zzgsr zze;
    private zzgsr zzf;
    private byte zzg = 2;

    static {
        zzgyp zzgypVar = new zzgyp();
        zzb = zzgypVar;
        zzgtz.zzaU(zzgyp.class, zzgypVar);
    }

    private zzgyp() {
        zzgsr zzgsrVar = zzgsr.zzb;
        this.zze = zzgsrVar;
        this.zzf = zzgsrVar;
    }

    public static zzgyo zza() {
        return (zzgyo) zzb.zzaA();
    }

    public static /* synthetic */ zzgyp zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzgyp zzgypVar, zzgsr zzgsrVar) {
        zzgypVar.zzd |= 1;
        zzgypVar.zze = zzgsrVar;
    }

    public static /* synthetic */ void zze(zzgyp zzgypVar, zzgsr zzgsrVar) {
        zzgypVar.zzd |= 2;
        zzgypVar.zzf = zzgsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            byte b2 = 1;
            if (i2 != 2) {
                if (i2 != 3) {
                    zzgxt zzgxtVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (obj == null) {
                                b2 = 0;
                            }
                            this.zzg = b2;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgyo(zzgxtVar);
                }
                return new zzgyp();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return Byte.valueOf(this.zzg);
    }
}
