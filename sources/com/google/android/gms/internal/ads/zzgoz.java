package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgoz extends zzgtz implements zzgvk {
    private static final zzgoz zzb;
    private String zzd = "";
    private zzgsr zze = zzgsr.zzb;
    private int zzf;

    static {
        zzgoz zzgozVar = new zzgoz();
        zzb = zzgozVar;
        zzgtz.zzaU(zzgoz.class, zzgozVar);
    }

    private zzgoz() {
    }

    public static zzgow zza() {
        return (zzgow) zzb.zzaA();
    }

    public static zzgoz zze() {
        return zzb;
    }

    public static /* synthetic */ void zzh(zzgoz zzgozVar, String str) {
        str.getClass();
        zzgozVar.zzd = str;
    }

    public static /* synthetic */ void zzi(zzgoz zzgozVar, zzgsr zzgsrVar) {
        zzgsrVar.getClass();
        zzgozVar.zze = zzgsrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzgov zzgovVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgow(zzgovVar);
                }
                return new zzgoz();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgoy zzc() {
        zzgoy zzgoyVar;
        int i = this.zzf;
        zzgoy zzgoyVar2 = zzgoy.UNKNOWN_KEYMATERIAL;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            zzgoyVar = null;
                        } else {
                            zzgoyVar = zzgoy.REMOTE;
                        }
                    } else {
                        zzgoyVar = zzgoy.ASYMMETRIC_PUBLIC;
                    }
                } else {
                    zzgoyVar = zzgoy.ASYMMETRIC_PRIVATE;
                }
            } else {
                zzgoyVar = zzgoy.SYMMETRIC;
            }
        } else {
            zzgoyVar = zzgoy.UNKNOWN_KEYMATERIAL;
        }
        if (zzgoyVar == null) {
            return zzgoy.UNRECOGNIZED;
        }
        return zzgoyVar;
    }

    public final zzgsr zzf() {
        return this.zze;
    }

    public final String zzg() {
        return this.zzd;
    }
}
