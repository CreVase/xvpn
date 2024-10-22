package com.google.android.gms.internal.ads;

@Deprecated
/* loaded from: classes.dex */
public final class zzgph extends zzgtz implements zzgvk {
    private static final zzgph zzb;
    private int zzf;
    private boolean zzg;
    private String zzd = "";
    private String zze = "";
    private String zzh = "";

    static {
        zzgph zzgphVar = new zzgph();
        zzb = zzgphVar;
        zzgtz.zzaU(zzgph.class, zzgphVar);
    }

    private zzgph() {
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzgpf zzgpfVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgpg(zzgpfVar);
                }
                return new zzgph();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        return (byte) 1;
    }
}
