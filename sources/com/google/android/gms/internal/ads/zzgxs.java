package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgxs extends zzgtz implements zzgvk {
    private static final zzgxs zzb;
    private zzgui zzd = zzgtz.zzaN();

    static {
        zzgxs zzgxsVar = new zzgxs();
        zzb = zzgxsVar;
        zzgtz.zzaU(zzgxs.class, zzgxsVar);
    }

    private zzgxs() {
    }

    public static zzgxr zza() {
        return (zzgxr) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgxs zzgxsVar, zzgxq zzgxqVar) {
        zzgxqVar.getClass();
        zzgui zzguiVar = zzgxsVar.zzd;
        if (!zzguiVar.zzc()) {
            zzgxsVar.zzd = zzgtz.zzaO(zzguiVar);
        }
        zzgxsVar.zzd.add(zzgxqVar);
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
                    return new zzgxr(null);
                }
                return new zzgxs();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzgxq.class});
        }
        return (byte) 1;
    }
}
