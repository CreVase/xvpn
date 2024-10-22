package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzfjp extends zzgtz implements zzgvk {
    private static final zzfjp zzb;
    private zzgui zzd = zzgtz.zzaN();

    static {
        zzfjp zzfjpVar = new zzfjp();
        zzb = zzfjpVar;
        zzgtz.zzaU(zzfjp.class, zzfjpVar);
    }

    private zzfjp() {
    }

    public static zzfjm zzc() {
        return (zzfjm) zzb.zzaA();
    }

    public static /* synthetic */ zzfjp zzd() {
        return zzb;
    }

    public static /* synthetic */ void zze(zzfjp zzfjpVar) {
        zzfjpVar.zzd = zzgtz.zzaN();
    }

    public static /* synthetic */ void zzf(zzfjp zzfjpVar, zzfjo zzfjoVar) {
        zzfjoVar.getClass();
        zzgui zzguiVar = zzfjpVar.zzd;
        if (!zzguiVar.zzc()) {
            zzfjpVar.zzd = zzgtz.zzaO(zzguiVar);
        }
        zzfjpVar.zzd.add(zzfjoVar);
    }

    public final int zza() {
        return this.zzd.size();
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
                    return new zzfjm(zzfjlVar);
                }
                return new zzfjp();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzfjo.class});
        }
        return (byte) 1;
    }
}
