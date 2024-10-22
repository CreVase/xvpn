package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgpr extends zzgtz implements zzgvk {
    private static final zzgpr zzb;
    private int zzd;
    private zzgui zze = zzgtz.zzaN();

    static {
        zzgpr zzgprVar = new zzgpr();
        zzb = zzgprVar;
        zzgtz.zzaU(zzgpr.class, zzgprVar);
    }

    private zzgpr() {
    }

    public static zzgpo zza() {
        return (zzgpo) zzb.zzaA();
    }

    public static /* synthetic */ void zze(zzgpr zzgprVar, zzgpq zzgpqVar) {
        zzgpqVar.getClass();
        zzgui zzguiVar = zzgprVar.zze;
        if (!zzguiVar.zzc()) {
            zzgprVar.zze = zzgtz.zzaO(zzguiVar);
        }
        zzgprVar.zze.add(zzgpqVar);
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
                    return new zzgpo(null);
                }
                return new zzgpr();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzd", "zze", zzgpq.class});
        }
        return (byte) 1;
    }
}
