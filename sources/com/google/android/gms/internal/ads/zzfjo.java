package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfjo extends zzgtz implements zzgvk {
    private static final zzfjo zzb;
    private int zzd;
    private zzfjk zze;

    static {
        zzfjo zzfjoVar = new zzfjo();
        zzb = zzfjoVar;
        zzgtz.zzaU(zzfjo.class, zzfjoVar);
    }

    private zzfjo() {
    }

    public static zzfjn zza() {
        return (zzfjn) zzb.zzaA();
    }

    public static /* synthetic */ zzfjo zzc() {
        return zzb;
    }

    public static /* synthetic */ void zzd(zzfjo zzfjoVar, zzfjk zzfjkVar) {
        zzfjkVar.getClass();
        zzfjoVar.zze = zzfjkVar;
        zzfjoVar.zzd |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzfjl zzfjlVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzfjn(zzfjlVar);
                }
                return new zzfjo();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0000\u0006ဉ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
