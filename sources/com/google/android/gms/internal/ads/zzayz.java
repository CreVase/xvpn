package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzayz extends zzgtz implements zzgvk {
    private static final zzayz zzb;
    private int zzd;
    private String zze = "";
    private zzgui zzf = zzgtz.zzaN();
    private int zzg = 1000;
    private int zzh = 1000;
    private int zzi = 1000;

    static {
        zzayz zzayzVar = new zzayz();
        zzb = zzayzVar;
        zzgtz.zzaU(zzayz.class, zzayzVar);
    }

    private zzayz() {
    }

    public static zzayz zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzayz zzayzVar, String str) {
        str.getClass();
        zzayzVar.zzd |= 1;
        zzayzVar.zze = str;
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
                    return new zzayy(null);
                }
                return new zzayz();
            }
            zzgud zzgudVar = zzazi.zza;
            return zzgtz.zzaR(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003᠌\u0001\u0004᠌\u0002\u0005᠌\u0003", new Object[]{"zzd", "zze", "zzf", zzayv.class, "zzg", zzgudVar, "zzh", zzgudVar, "zzi", zzgudVar});
        }
        return (byte) 1;
    }
}
