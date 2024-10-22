package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgyf extends zzgtz implements zzgvk {
    private static final zzgyf zzb;
    private int zzd;
    private String zze = "";

    static {
        zzgyf zzgyfVar = new zzgyf();
        zzb = zzgyfVar;
        zzgtz.zzaU(zzgyf.class, zzgyfVar);
    }

    private zzgyf() {
    }

    public static zzgye zza() {
        return (zzgye) zzb.zzaA();
    }

    public static /* synthetic */ void zzd(zzgyf zzgyfVar, String str) {
        zzgyfVar.zzd |= 1;
        zzgyfVar.zze = str;
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
                    return new zzgye(null);
                }
                return new zzgyf();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        return (byte) 1;
    }
}
