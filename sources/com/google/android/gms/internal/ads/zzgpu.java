package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzgpu extends zzgtz implements zzgvk {
    private static final zzgpu zzb;
    private int zzd;
    private int zze;
    private zzgpx zzf;

    static {
        zzgpu zzgpuVar = new zzgpu();
        zzb = zzgpuVar;
        zzgtz.zzaU(zzgpu.class, zzgpuVar);
    }

    private zzgpu() {
    }

    public static zzgpt zzc() {
        return (zzgpt) zzb.zzaA();
    }

    public static zzgpu zze(zzgsr zzgsrVar, zzgtl zzgtlVar) throws zzgul {
        return (zzgpu) zzgtz.zzaG(zzb, zzgsrVar, zzgtlVar);
    }

    public static /* synthetic */ void zzh(zzgpu zzgpuVar, zzgpx zzgpxVar) {
        zzgpxVar.getClass();
        zzgpuVar.zzf = zzgpxVar;
        zzgpuVar.zzd |= 1;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzgtz
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 != 2) {
                if (i2 != 3) {
                    zzgps zzgpsVar = null;
                    if (i2 != 4) {
                        if (i2 != 5) {
                            return null;
                        }
                        return zzb;
                    }
                    return new zzgpt(zzgpsVar);
                }
                return new zzgpu();
            }
            return zzgtz.zzaR(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzd", "zze", "zzf"});
        }
        return (byte) 1;
    }

    public final zzgpx zzf() {
        zzgpx zzgpxVar = this.zzf;
        if (zzgpxVar == null) {
            return zzgpx.zzc();
        }
        return zzgpxVar;
    }
}
