package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzayn extends zzgtz implements zzgvk {
    private static final zzayn zzb;
    private int zzd;
    private boolean zze;
    private int zzf;

    static {
        zzayn zzaynVar = new zzayn();
        zzb = zzaynVar;
        zzgtz.zzaU(zzayn.class, zzaynVar);
    }

    private zzayn() {
    }

    public static zzaym zza() {
        return (zzaym) zzb.zzaA();
    }

    public static zzayn zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzayn zzaynVar, boolean z) {
        zzaynVar.zzd |= 1;
        zzaynVar.zze = z;
    }

    public static /* synthetic */ void zzf(zzayn zzaynVar, int i) {
        zzaynVar.zzd |= 2;
        zzaynVar.zzf = i;
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
                    return new zzaym(null);
                }
                return new zzayn();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဋ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }
}
