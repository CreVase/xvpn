package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbbq extends zzgtz implements zzgvk {
    private static final zzbbq zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzbbq zzbbqVar = new zzbbq();
        zzb = zzbbqVar;
        zzgtz.zzaU(zzbbq.class, zzbbqVar);
    }

    private zzbbq() {
    }

    public static zzbbp zza() {
        return (zzbbp) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzbbq zzbbqVar, boolean z) {
        zzbbqVar.zzd |= 1;
        zzbbqVar.zze = z;
    }

    public static /* synthetic */ void zze(zzbbq zzbbqVar, int i) {
        zzbbqVar.zzd |= 2;
        zzbbqVar.zzf = i;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzayc zzaycVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzbbp(zzaycVar);
                }
                return new zzbbq();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002င\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final boolean zzf() {
        return this.zze;
    }
}
