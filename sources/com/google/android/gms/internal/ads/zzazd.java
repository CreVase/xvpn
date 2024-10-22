package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzazd extends zzgtz implements zzgvk {
    private static final zzazd zzb;
    private int zzd;
    private zzbat zzf;
    private int zzg;
    private zzbav zzh;
    private int zzi;
    private String zze = "";
    private int zzj = 1000;
    private int zzk = 1000;
    private int zzl = 1000;

    static {
        zzazd zzazdVar = new zzazd();
        zzb = zzazdVar;
        zzgtz.zzaU(zzazd.class, zzazdVar);
    }

    private zzazd() {
    }

    public static zzazd zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzazd zzazdVar, String str) {
        zzazdVar.zzd |= 1;
        zzazdVar.zze = str;
    }

    public static /* synthetic */ void zze(zzazd zzazdVar, zzbav zzbavVar) {
        zzbavVar.getClass();
        zzazdVar.zzh = zzbavVar;
        zzazdVar.zzd |= 8;
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
                    return new zzazc(null);
                }
                return new zzazd();
            }
            zzgud zzgudVar = zzazi.zza;
            return zzgtz.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003င\u0002\u0004ဉ\u0003\u0005င\u0004\u0006᠌\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgudVar, "zzk", zzgudVar, "zzl", zzgudVar});
        }
        return (byte) 1;
    }
}
