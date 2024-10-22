package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgmq extends zzgtz implements zzgvk {
    private static final zzgmq zzb;
    private int zzd;
    private int zze;
    private zzgmt zzf;

    static {
        zzgmq zzgmqVar = new zzgmq();
        zzb = zzgmqVar;
        zzgtz.zzaU(zzgmq.class, zzgmqVar);
    }

    private zzgmq() {
    }

    public static zzgmp zzc() {
        return (zzgmp) zzb.zzaA();
    }

    public static zzgmq zze(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgmq) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    public static /* synthetic */ void zzh(zzgmq zzgmqVar, zzgmt zzgmtVar) {
        zzgmtVar.getClass();
        zzgmqVar.zzf = zzgmtVar;
        zzgmqVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
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
                    return new zzgmp(null);
                }
                return new zzgmq();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgmt zzf() {
        zzgmt zzgmtVar = this.zzf;
        if (zzgmtVar == null) {
            return zzgmt.zze();
        }
        return zzgmtVar;
    }
}
