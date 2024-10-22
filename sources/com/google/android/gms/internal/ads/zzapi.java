package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzapi extends zzgtz implements zzgvk {
    private static final zzapi zzb;
    private int zzd;
    private long zze = -1;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private long zzl = -1;

    static {
        zzapi zzapiVar = new zzapi();
        zzb = zzapiVar;
        zzgtz.zzaU(zzapi.class, zzapiVar);
    }

    private zzapi() {
    }

    public static zzaph zza() {
        return (zzaph) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzapi zzapiVar, long j) {
        zzapiVar.zzd |= 1;
        zzapiVar.zze = j;
    }

    public static /* synthetic */ void zze(zzapi zzapiVar, long j) {
        zzapiVar.zzd |= 4;
        zzapiVar.zzg = j;
    }

    public static /* synthetic */ void zzf(zzapi zzapiVar, long j) {
        zzapiVar.zzd |= 8;
        zzapiVar.zzh = j;
    }

    public static /* synthetic */ void zzg(zzapi zzapiVar, long j) {
        zzapiVar.zzd |= 16;
        zzapiVar.zzi = j;
    }

    public static /* synthetic */ void zzh(zzapi zzapiVar, long j) {
        zzapiVar.zzd |= 32;
        zzapiVar.zzj = j;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzaol zzaolVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzaph(zzaolVar);
                }
                return new zzapi();
            }
            return zzgtz.zzaR(zzb, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        return (byte) 1;
    }
}
