package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgzt extends zzgtz implements zzgvk {
    private static final zzgzt zzb;
    private int zzd;
    private long zzf;
    private boolean zzg;
    private int zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzgzt zzgztVar = new zzgzt();
        zzb = zzgztVar;
        zzgtz.zzaU(zzgzt.class, zzgztVar);
    }

    private zzgzt() {
    }

    public static zzgzs zza() {
        return (zzgzs) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgzt zzgztVar, String str) {
        zzgztVar.zzd |= 1;
        zzgztVar.zze = str;
    }

    public static /* synthetic */ void zze(zzgzt zzgztVar, long j) {
        zzgztVar.zzd |= 2;
        zzgztVar.zzf = j;
    }

    public static /* synthetic */ void zzf(zzgzt zzgztVar, boolean z) {
        zzgztVar.zzd |= 4;
        zzgztVar.zzg = z;
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
                    return new zzgzs(null);
                }
                return new zzgzt();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzgzu.zza, "zzi", "zzj"});
        }
        return (byte) 1;
    }
}
