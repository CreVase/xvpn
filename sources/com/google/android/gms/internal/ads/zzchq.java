package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzchq {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzchq(int i, int i2, int i3) {
        this.zzc = i;
        this.zzb = i2;
        this.zza = i3;
    }

    public static zzchq zza() {
        return new zzchq(0, 0, 0);
    }

    public static zzchq zzb(int i, int i2) {
        return new zzchq(1, i, i2);
    }

    public static zzchq zzc(com.google.android.gms.ads.internal.client.zzq zzqVar) {
        if (zzqVar.zzd) {
            return new zzchq(3, 0, 0);
        }
        if (zzqVar.zzi) {
            return new zzchq(2, 0, 0);
        }
        if (zzqVar.zzh) {
            return zza();
        }
        return zzb(zzqVar.zzf, zzqVar.zzc);
    }

    public static zzchq zzd() {
        return new zzchq(5, 0, 0);
    }

    public static zzchq zze() {
        return new zzchq(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
