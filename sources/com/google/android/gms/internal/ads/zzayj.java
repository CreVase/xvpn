package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzayj extends zzgtz implements zzgvk {
    private static final zzayj zzb;
    private int zzd;
    private int zze;
    private zzayn zzf;
    private zzayp zzg;

    static {
        zzayj zzayjVar = new zzayj();
        zzb = zzayjVar;
        zzgtz.zzaU(zzayj.class, zzayjVar);
    }

    private zzayj() {
    }

    public static zzayi zza() {
        return (zzayi) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzayj zzayjVar, zzayn zzaynVar) {
        zzaynVar.getClass();
        zzayjVar.zzf = zzaynVar;
        zzayjVar.zzd |= 2;
    }

    public static /* synthetic */ void zze(zzayj zzayjVar, zzayp zzaypVar) {
        zzaypVar.getClass();
        zzayjVar.zzg = zzaypVar;
        zzayjVar.zzd |= 4;
    }

    public static /* synthetic */ void zzf(zzayj zzayjVar, int i) {
        zzayjVar.zze = 1;
        zzayjVar.zzd = 1 | zzayjVar.zzd;
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
                    return new zzayi(zzaycVar);
                }
                return new zzayj();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"zzd", "zze", zzayl.zza, "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
