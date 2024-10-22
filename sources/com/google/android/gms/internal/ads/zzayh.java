package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzayh extends zzgtz implements zzgvk {
    private static final zzayh zzb;
    private int zzd;
    private int zze;
    private zzayx zzg;
    private zzayz zzh;
    private zzazb zzj;
    private zzbal zzk;
    private zzbab zzl;
    private zzazp zzm;
    private zzazr zzn;
    private int zzf = 1000;
    private zzgui zzi = zzgtz.zzaN();
    private zzgui zzo = zzgtz.zzaN();

    static {
        zzayh zzayhVar = new zzayh();
        zzb = zzayhVar;
        zzgtz.zzaU(zzayh.class, zzayhVar);
    }

    private zzayh() {
    }

    public static zzayh zzc() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzayh zzayhVar, zzayf zzayfVar) {
        zzayhVar.zze = zzayfVar.zza();
        zzayhVar.zzd |= 1;
    }

    public static /* synthetic */ void zzf(zzayh zzayhVar, zzayz zzayzVar) {
        zzayzVar.getClass();
        zzayhVar.zzh = zzayzVar;
        zzayhVar.zzd |= 8;
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
                    return new zzayg(null);
                }
                return new zzayh();
            }
            return zzgtz.zzaR(zzb, "\u0001\u000b\u0000\u0001\u0007\u0011\u000b\u0000\u0002\u0000\u0007᠌\u0000\b᠌\u0001\tဉ\u0002\nဉ\u0003\u000b\u001b\fဉ\u0004\rဉ\u0005\u000eဉ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011\u001b", new Object[]{"zzd", "zze", zzaye.zza, "zzf", zzazi.zza, "zzg", "zzh", "zzi", zzayv.class, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzbax.class});
        }
        return (byte) 1;
    }

    public final zzayz zzd() {
        zzayz zzayzVar = this.zzh;
        if (zzayzVar == null) {
            return zzayz.zzc();
        }
        return zzayzVar;
    }
}
