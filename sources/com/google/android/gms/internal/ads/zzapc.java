package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzapc extends zzgtz implements zzgvk {
    private static final zzapc zzb;
    private int zzd;
    private int zze;
    private long zzf = -1;

    static {
        zzapc zzapcVar = new zzapc();
        zzb = zzapcVar;
        zzgtz.zzaU(zzapc.class, zzapcVar);
    }

    private zzapc() {
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzaol zzaolVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzapb(zzaolVar);
                }
                return new zzapc();
            }
            return zzgtz.zzaR(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", zzaor.zza, "zzf"});
        }
        return (byte) 1;
    }
}
