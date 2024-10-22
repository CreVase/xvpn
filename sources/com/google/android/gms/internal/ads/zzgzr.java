package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgzr extends zzgtz implements zzgvk {
    private static final zzgzr zzb;
    private int zzd;
    private int zze;
    private zzgyt zzg;
    private zzgyx zzh;
    private int zzi;
    private int zzl;
    private byte zzn = 2;
    private String zzf = "";
    private zzgue zzj = zzgtz.zzaJ();
    private String zzk = "";
    private zzgui zzm = zzgtz.zzaN();

    static {
        zzgzr zzgzrVar = new zzgzr();
        zzb = zzgzrVar;
        zzgtz.zzaU(zzgzr.class, zzgzrVar);
    }

    private zzgzr() {
    }

    public static zzgzq zzc() {
        return (zzgzq) zzb.zzaA();
    }

    public static /* synthetic */ void zzf(zzgzr zzgzrVar, int i) {
        zzgzrVar.zzd |= 1;
        zzgzrVar.zze = i;
    }

    public static /* synthetic */ void zzg(zzgzr zzgzrVar, String str) {
        str.getClass();
        zzgzrVar.zzd |= 2;
        zzgzrVar.zzf = str;
    }

    public static /* synthetic */ void zzh(zzgzr zzgzrVar, zzgyt zzgytVar) {
        zzgytVar.getClass();
        zzgzrVar.zzg = zzgytVar;
        zzgzrVar.zzd |= 4;
    }

    public static /* synthetic */ void zzi(zzgzr zzgzrVar, String str) {
        str.getClass();
        zzgui zzguiVar = zzgzrVar.zzm;
        if (!zzguiVar.zzc()) {
            zzgzrVar.zzm = zzgtz.zzaO(zzguiVar);
        }
        zzgzrVar.zzm.add(str);
    }

    public static /* synthetic */ void zzj(zzgzr zzgzrVar, int i) {
        zzgzrVar.zzl = i - 1;
        zzgzrVar.zzd |= 64;
    }

    public final int zza() {
        return this.zzm.size();
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
                            this.zzn = b2;
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgzq(null);
                }
                return new zzgzr();
            }
            return zzgtz.zzaR(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\b᠌\u0006\t\u001a", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgzo.zza, "zzm"});
        }
        return Byte.valueOf(this.zzn);
    }

    public final String zze() {
        return this.zzf;
    }
}
