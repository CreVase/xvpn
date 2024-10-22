package com.google.android.gms.internal.ads;

import android.util.Pair;

/* loaded from: classes.dex */
public abstract class zzcv {
    public static final zzcv zza = new zzcq();
    private static final String zzc = Integer.toString(0, 36);
    private static final String zzd = Integer.toString(1, 36);
    private static final String zze = Integer.toString(2, 36);
    public static final zzn zzb = new zzn() { // from class: com.google.android.gms.internal.ads.zzcp
    };

    public final boolean equals(Object obj) {
        int zzh;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzcv)) {
            return false;
        }
        zzcv zzcvVar = (zzcv) obj;
        if (zzcvVar.zzc() == zzc() && zzcvVar.zzb() == zzb()) {
            zzcu zzcuVar = new zzcu();
            zzcs zzcsVar = new zzcs();
            zzcu zzcuVar2 = new zzcu();
            zzcs zzcsVar2 = new zzcs();
            for (int i = 0; i < zzc(); i++) {
                if (!zze(i, zzcuVar, 0L).equals(zzcvVar.zze(i, zzcuVar2, 0L))) {
                    return false;
                }
            }
            for (int i2 = 0; i2 < zzb(); i2++) {
                if (!zzd(i2, zzcsVar, true).equals(zzcvVar.zzd(i2, zzcsVar2, true))) {
                    return false;
                }
            }
            int zzg = zzg(true);
            if (zzg == zzcvVar.zzg(true) && (zzh = zzh(true)) == zzcvVar.zzh(true)) {
                while (zzg != zzh) {
                    int zzj = zzj(zzg, 0, true);
                    if (zzj != zzcvVar.zzj(zzg, 0, true)) {
                        return false;
                    }
                    zzg = zzj;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        zzcu zzcuVar = new zzcu();
        zzcs zzcsVar = new zzcs();
        int zzc2 = zzc() + 217;
        int i2 = 0;
        while (true) {
            i = zzc2 * 31;
            if (i2 >= zzc()) {
                break;
            }
            zzc2 = i + zze(i2, zzcuVar, 0L).hashCode();
            i2++;
        }
        int zzb2 = zzb() + i;
        for (int i3 = 0; i3 < zzb(); i3++) {
            zzb2 = (zzb2 * 31) + zzd(i3, zzcsVar, true).hashCode();
        }
        int zzg = zzg(true);
        while (zzg != -1) {
            zzb2 = (zzb2 * 31) + zzg;
            zzg = zzj(zzg, 0, true);
        }
        return zzb2;
    }

    public abstract int zza(Object obj);

    public abstract int zzb();

    public abstract int zzc();

    public abstract zzcs zzd(int i, zzcs zzcsVar, boolean z);

    public abstract zzcu zze(int i, zzcu zzcuVar, long j);

    public abstract Object zzf(int i);

    public int zzg(boolean z) {
        if (zzo()) {
            return -1;
        }
        return 0;
    }

    public int zzh(boolean z) {
        if (zzo()) {
            return -1;
        }
        return zzc() - 1;
    }

    public final int zzi(int i, zzcs zzcsVar, zzcu zzcuVar, int i2, boolean z) {
        int i3 = zzd(i, zzcsVar, false).zzd;
        if (zze(i3, zzcuVar, 0L).zzq == i) {
            int zzj = zzj(i3, i2, z);
            if (zzj == -1) {
                return -1;
            }
            return zze(zzj, zzcuVar, 0L).zzp;
        }
        return i + 1;
    }

    public int zzj(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == zzh(z)) {
                        return zzg(z);
                    }
                    return i + 1;
                }
                throw new IllegalStateException();
            }
            return i;
        }
        if (i == zzh(z)) {
            return -1;
        }
        return i + 1;
    }

    public int zzk(int i, int i2, boolean z) {
        if (i == zzg(false)) {
            return -1;
        }
        return i - 1;
    }

    public final Pair zzl(zzcu zzcuVar, zzcs zzcsVar, int i, long j) {
        Pair zzm = zzm(zzcuVar, zzcsVar, i, j, 0L);
        zzm.getClass();
        return zzm;
    }

    public final Pair zzm(zzcu zzcuVar, zzcs zzcsVar, int i, long j, long j2) {
        zzdx.zza(i, 0, zzc());
        zze(i, zzcuVar, j2);
        if (j == -9223372036854775807L) {
            long j3 = zzcuVar.zzn;
            j = 0;
        }
        int i2 = zzcuVar.zzp;
        zzd(i2, zzcsVar, false);
        while (i2 < zzcuVar.zzq) {
            long j4 = zzcsVar.zzf;
            if (j == 0) {
                break;
            }
            int i3 = i2 + 1;
            long j5 = zzd(i3, zzcsVar, false).zzf;
            if (j < 0) {
                break;
            }
            i2 = i3;
        }
        zzd(i2, zzcsVar, true);
        long j6 = zzcsVar.zzf;
        long j7 = zzcsVar.zze;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0L, j);
        Object obj = zzcsVar.zzc;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public zzcs zzn(Object obj, zzcs zzcsVar) {
        return zzd(zza(obj), zzcsVar, true);
    }

    public final boolean zzo() {
        if (zzc() == 0) {
            return true;
        }
        return false;
    }
}
