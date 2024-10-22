package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgpq extends zzgtz implements zzgvk {
    private static final zzgpq zzb;
    private String zzd = "";
    private int zze;
    private int zzf;
    private int zzg;

    static {
        zzgpq zzgpqVar = new zzgpq();
        zzb = zzgpqVar;
        zzgtz.zzaU(zzgpq.class, zzgpqVar);
    }

    private zzgpq() {
    }

    public static zzgpp zza() {
        return (zzgpp) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgpq zzgpqVar, String str) {
        str.getClass();
        zzgpqVar.zzd = str;
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
                    return new zzgpp(null);
                }
                return new zzgpq();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        return (byte) 1;
    }
}
