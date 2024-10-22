package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgyx extends zzgtz implements zzgvk {
    private static final zzgyx zzb;
    private int zzd;
    private zzgyw zze;
    private zzgsr zzg;
    private zzgsr zzh;
    private int zzi;
    private zzgsr zzj;
    private byte zzk = 2;
    private zzgui zzf = zzgtz.zzaN();

    static {
        zzgyx zzgyxVar = new zzgyx();
        zzb = zzgyxVar;
        zzgtz.zzaU(zzgyx.class, zzgyxVar);
    }

    private zzgyx() {
        zzgsr zzgsrVar = zzgsr.zzb;
        this.zzg = zzgsrVar;
        this.zzh = zzgsrVar;
        this.zzj = zzgsrVar;
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
                            this.zzk = b2;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgyu(null);
                }
                return new zzgyx();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zzd", "zze", "zzf", zzgyp.class, "zzg", "zzh", "zzi", "zzj"});
        }
        return Byte.valueOf(this.zzk);
    }
}
