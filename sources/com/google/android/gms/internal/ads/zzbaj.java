package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzbaj extends zzgtz implements zzgvk {
    private static final zzbaj zzb;
    private int zzd;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzk;
    private int zzl;
    private zzgui zze = zzgtz.zzaN();
    private String zzi = "";
    private String zzj = "";

    static {
        zzbaj zzbajVar = new zzbaj();
        zzb = zzbajVar;
        zzgtz.zzaU(zzbaj.class, zzbajVar);
    }

    private zzbaj() {
    }

    public static zzbaf zza() {
        return (zzbaf) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzbaj zzbajVar, Iterable iterable) {
        zzgui zzguiVar = zzbajVar.zze;
        if (!zzguiVar.zzc()) {
            zzbajVar.zze = zzgtz.zzaO(zzguiVar);
        }
        zzgsa.zzav(iterable, zzbajVar.zze);
    }

    public static /* synthetic */ void zze(zzbaj zzbajVar, int i) {
        zzbajVar.zzd |= 1;
        zzbajVar.zzf = i;
    }

    public static /* synthetic */ void zzf(zzbaj zzbajVar, int i) {
        zzbajVar.zzd |= 2;
        zzbajVar.zzg = i;
    }

    public static /* synthetic */ void zzg(zzbaj zzbajVar, long j) {
        zzbajVar.zzd |= 4;
        zzbajVar.zzh = j;
    }

    public static /* synthetic */ void zzh(zzbaj zzbajVar, String str) {
        str.getClass();
        zzbajVar.zzd |= 8;
        zzbajVar.zzi = str;
    }

    public static /* synthetic */ void zzi(zzbaj zzbajVar, String str) {
        str.getClass();
        zzbajVar.zzd |= 16;
        zzbajVar.zzj = str;
    }

    public static /* synthetic */ void zzj(zzbaj zzbajVar, long j) {
        zzbajVar.zzd |= 32;
        zzbajVar.zzk = j;
    }

    public static /* synthetic */ void zzk(zzbaj zzbajVar, int i) {
        zzbajVar.zzd |= 64;
        zzbajVar.zzl = i;
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
                    return new zzbaf(zzaycVar);
                }
                return new zzbaj();
            }
            return zzgtz.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003င\u0001\u0004ဂ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဂ\u0005\bင\u0006", new Object[]{"zzd", "zze", zzbae.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
