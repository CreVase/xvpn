package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes.dex */
abstract class zzma<T, B> {
    public abstract int zza(T t);

    public abstract B zza();

    public abstract T zza(T t, T t2);

    public abstract void zza(B b2, int i, int i2);

    public abstract void zza(B b2, int i, long j);

    public abstract void zza(B b2, int i, zzhm zzhmVar);

    public abstract void zza(B b2, int i, T t);

    public abstract void zza(T t, zzmw zzmwVar) throws IOException;

    public abstract boolean zza(zzlc zzlcVar);

    public final boolean zza(B b2, zzlc zzlcVar) throws IOException {
        int zzd = zzlcVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            zzb(b2, i, zzlcVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zza((zzma<T, B>) b2, i, zzlcVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zza((zzma<T, B>) b2, i, zzlcVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                zza((zzma<T, B>) b2, i, zzlcVar.zzf());
                return true;
            }
            throw zzji.zza();
        }
        B zza = zza();
        int i3 = 4 | (i << 3);
        while (zzlcVar.zzc() != Integer.MAX_VALUE && zza((zzma<T, B>) zza, zzlcVar)) {
        }
        if (i3 == zzlcVar.zzd()) {
            zza((zzma<T, B>) b2, i, (int) zze(zza));
            return true;
        }
        throw zzji.zzb();
    }

    public abstract int zzb(T t);

    public abstract void zzb(B b2, int i, long j);

    public abstract void zzb(T t, zzmw zzmwVar) throws IOException;

    public abstract void zzb(Object obj, B b2);

    public abstract B zzc(Object obj);

    public abstract void zzc(Object obj, T t);

    public abstract T zzd(Object obj);

    public abstract T zze(B b2);

    public abstract void zzf(Object obj);
}
