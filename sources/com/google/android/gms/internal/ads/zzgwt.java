package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
abstract class zzgwt {
    public abstract int zza(Object obj);

    public abstract int zzb(Object obj);

    public abstract Object zzc(Object obj);

    public abstract Object zzd(Object obj);

    public abstract Object zze(Object obj, Object obj2);

    public abstract Object zzf();

    public abstract Object zzg(Object obj);

    public abstract void zzh(Object obj, int i, int i2);

    public abstract void zzi(Object obj, int i, long j);

    public abstract void zzj(Object obj, int i, Object obj2);

    public abstract void zzk(Object obj, int i, zzgsr zzgsrVar);

    public abstract void zzl(Object obj, int i, long j);

    public abstract void zzm(Object obj);

    public abstract void zzn(Object obj, Object obj2);

    public abstract void zzo(Object obj, Object obj2);

    public final boolean zzp(Object obj, zzgvu zzgvuVar) throws IOException {
        int zzd = zzgvuVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                zzh(obj, i, zzgvuVar.zzf());
                                return true;
                            }
                            throw zzgul.zza();
                        }
                        return false;
                    }
                    Object zzf = zzf();
                    int i3 = i << 3;
                    while (zzgvuVar.zzc() != Integer.MAX_VALUE && zzp(zzf, zzgvuVar)) {
                    }
                    if ((4 | i3) == zzgvuVar.zzd()) {
                        zzg(zzf);
                        zzj(obj, i, zzf);
                        return true;
                    }
                    throw zzgul.zzb();
                }
                zzk(obj, i, zzgvuVar.zzp());
                return true;
            }
            zzi(obj, i, zzgvuVar.zzk());
            return true;
        }
        zzl(obj, i, zzgvuVar.zzl());
        return true;
    }

    public abstract boolean zzq(zzgvu zzgvuVar);

    public abstract void zzr(Object obj, zzgth zzgthVar) throws IOException;
}
