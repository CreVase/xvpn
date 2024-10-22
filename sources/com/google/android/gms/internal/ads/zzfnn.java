package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfnn extends zzgtz implements zzgvk {
    private static final zzguf zzb = new zzfnk();
    private static final zzfnn zzd;
    private int zze;
    private zzgue zzf = zzgtz.zzaJ();
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        zzfnn zzfnnVar = new zzfnn();
        zzd = zzfnnVar;
        zzgtz.zzaU(zzfnn.class, zzfnnVar);
    }

    private zzfnn() {
    }

    public static zzfnm zza() {
        return (zzfnm) zzd.zzaA();
    }

    public static /* synthetic */ void zzd(zzfnn zzfnnVar, String str) {
        str.getClass();
        zzfnnVar.zze |= 1;
        zzfnnVar.zzg = str;
    }

    public static /* synthetic */ void zze(zzfnn zzfnnVar, int i) {
        zzgue zzgueVar = zzfnnVar.zzf;
        if (!zzgueVar.zzc()) {
            zzfnnVar.zzf = zzgtz.zzaK(zzgueVar);
        }
        zzfnnVar.zzf.zzh(2);
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
                        return zzd;
                    }
                    return new zzfnm(null);
                }
                return new zzfnn();
            }
            return zzgtz.zzaR(zzd, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zze", "zzf", zzfnl.zza, "zzg", "zzh", "zzi"});
        }
        return (byte) 1;
    }
}
