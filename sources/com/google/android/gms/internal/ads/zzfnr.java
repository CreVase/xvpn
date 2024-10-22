package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfnr extends zzgtz implements zzgvk {
    private static final zzfnr zzb;
    private int zzd;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzfnn zzh;

    static {
        zzfnr zzfnrVar = new zzfnr();
        zzb = zzfnrVar;
        zzgtz.zzaU(zzfnr.class, zzfnrVar);
    }

    private zzfnr() {
    }

    public static zzfnp zza() {
        return (zzfnp) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzfnr zzfnrVar, String str) {
        str.getClass();
        zzfnrVar.zzd |= 2;
        zzfnrVar.zzf = str;
    }

    public static /* synthetic */ void zze(zzfnr zzfnrVar, zzfnn zzfnnVar) {
        zzfnnVar.getClass();
        zzfnrVar.zzh = zzfnnVar;
        zzfnrVar.zzd |= 8;
    }

    public static /* synthetic */ void zzf(zzfnr zzfnrVar, int i) {
        zzfnrVar.zze = 1;
        zzfnrVar.zzd = 1 | zzfnrVar.zzd;
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
                    return new zzfnp(null);
                }
                return new zzfnr();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", zzfnq.zza, "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
